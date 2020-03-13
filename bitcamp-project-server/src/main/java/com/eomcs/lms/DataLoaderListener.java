package com.eomcs.lms;

import java.io.InputStream;
import java.lang.reflect.Proxy;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.service.impl.BoardServiceImpl;
import com.eomcs.lms.service.impl.LessonServiceImpl;
import com.eomcs.lms.service.impl.MemberServiceImpl;
import com.eomcs.lms.service.impl.PhotoBoardServiceImpl;
import com.eomcs.sql.DaoInvocationHandler;
import com.eomcs.sql.PlatformTransactionManager;
import com.eomcs.sql.SqlSessionFactoryProxy;

// 애플리케이션이 시작되거나 종료될 때
// 데이터를 로딩하고 저장하는 일을 한다.
//
public class DataLoaderListener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {

    try {
      // Mybatis 객체 준비
      InputStream inputStream = Resources.getResourceAsStream(//
          "com/eomcs/lms/conf/mybatis-config.xml");

      // 트랜잭션 제어를 위해 오리지널 객체를 프록시 객체에 담아 사용한다.
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryProxy(//
          new SqlSessionFactoryBuilder().build(inputStream));
      context.put("sqlSessionFactory", sqlSessionFactory);

      // DAO 프록시 객체가 사용할 InvocationHandler 준비
      DaoInvocationHandler daoInvocationHandler = //
          new DaoInvocationHandler(sqlSessionFactory);

      // 서비스 객체가 사용할 DAO를 준비한다.
      LessonDao lessonDao = (LessonDao) Proxy.newProxyInstance(//
          this.getClass().getClassLoader(), //
          new Class[] {LessonDao.class}, //
          daoInvocationHandler);
      BoardDao boardDao = (BoardDao) Proxy.newProxyInstance(//
          this.getClass().getClassLoader(), //
          new Class[] {BoardDao.class}, //
          daoInvocationHandler);
      MemberDao memberDao = (MemberDao) Proxy.newProxyInstance(//
          this.getClass().getClassLoader(), //
          new Class[] {MemberDao.class}, //
          daoInvocationHandler);
      PhotoBoardDao photoBoardDao = (PhotoBoardDao) Proxy.newProxyInstance(//
          this.getClass().getClassLoader(), //
          new Class[] {PhotoBoardDao.class}, //
          daoInvocationHandler);
      PhotoFileDao photoFileDao = (PhotoFileDao) Proxy.newProxyInstance(//
          this.getClass().getClassLoader(), //
          new Class[] {PhotoFileDao.class}, //
          daoInvocationHandler);

      // 트랜잭션 관리자 준비
      PlatformTransactionManager txManager = new PlatformTransactionManager(//
          sqlSessionFactory);

      // 서블릿에서 사용할 서비스 객체를 준비한다.
      context.put("lessonService", new LessonServiceImpl(lessonDao));
      context.put("photoBoardService", //
          new PhotoBoardServiceImpl(txManager, photoBoardDao, photoFileDao));
      context.put("boardService", new BoardServiceImpl(boardDao));
      context.put("memberService", new MemberServiceImpl(memberDao));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {}

}
