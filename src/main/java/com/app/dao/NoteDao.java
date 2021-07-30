package com.app.dao;

import com.app.model.Note;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// request data from database
//@Repository
//public class NoteDao {
//
//    // mapping response from database to objects
//    @Autowired
//    private JdbcTemplate jdbcTemplate;


//    public List<Note> getNotes() {
//        RowMapper<Note> rowMapper = (rs, rowNumber) -> mapNote(rs);
//        return jdbcTemplate.query("SELECT * FROM note", rowMapper);
//    }

//    private Note mapNote(ResultSet rs) throws SQLException {
//        Note note = new Note();
//
//        note.setId(rs.getLong("id"));
//        note.setTitle(rs.getString("title"));
//        note.setText(rs.getString("text"));
//        note.setAuthor(rs.getString("author");
//        note.setCategory(rs.getString("category"));
//        note.getLocalDate(rs.getDate("localdate"));
//
//        return note;
//    }
//}



