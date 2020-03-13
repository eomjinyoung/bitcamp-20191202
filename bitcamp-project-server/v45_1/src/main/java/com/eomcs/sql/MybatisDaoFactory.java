package com.eomcs.sql;

import java.lang.reflect.Proxy;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDaoFactory {

  DaoInvocationHandler daoInvocationHandler;

  public MybatisDaoFactory(SqlSessionFactory sqlSessionFactory) {
    daoInvocationHandler = new DaoInvocationHandler(sqlSessionFactory);
  }

  @SuppressWarnings("unchecked")
  public <T> T createDao(Class<T> daoInterface) {
    return (T) Proxy.newProxyInstance(//
        this.getClass().getClassLoader(), //
        new Class[] {daoInterface}, //
        daoInvocationHandler);
  }
}
