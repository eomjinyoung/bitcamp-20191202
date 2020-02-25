package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoFile;

public class PhotoFileDaoImpl implements PhotoFileDao {

  Connection con;

  public PhotoFileDaoImpl(Connection con) {
    this.con = con;
  }

  @Override
  public int insert(PhotoFile photoFile) throws Exception {
    try (Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate( //
          "insert into lms_photo_file(photo_id,file_path) values(" //
              + photoFile.getBoardNo() + ", '" + photoFile.getFilepath() //
              + "')");

      return result;
    }
  }

  @Override
  public List<PhotoFile> findAll(int boardNo) throws Exception {
    try (Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( //
            "select photo_file_id, photo_id, file_path" //
                + " from lms_photo_file" //
                + " where photo_id=" + boardNo //
                + " order by photo_file_id asc")) {

      ArrayList<PhotoFile> list = new ArrayList<>();
      while (rs.next()) {
        PhotoFile photoFile = new PhotoFile();
        photoFile.setNo(rs.getInt("photo_file_id"));
        photoFile.setBoardNo(rs.getInt("photo_id"));
        photoFile.setFilepath(rs.getString("file_path"));
        list.add(photoFile);
      }
      return list;
    }
  }

}
