package com.app.dao;

import com.app.model.Category;
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
@Repository
public class NoteDao {

    // mapping response from database to objects
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Note> getNotes() {
        RowMapper<Note> rowMapper = (rs, i) -> mapNote(rs);
 //       return jdbcTemplate.query("SELECT * FROM note", rowMapper);
        return jdbcTemplate.query("SELECT t.title, t.text, t.category, u.first_name, u.last_name, u.email, u.phone " +
                "FROM note t " +
                "INNER JOIN users u ON t.user_id = u.id", rowMapper);
    }

    public void storeNote(Note note) {
        jdbcTemplate.update("INSERT INTO note (title, text, category) " +
                        "VALUES(?,?,?)",
                note.getTitle(), note.getText(), Category.valueOf(note.getCategory()));
    }

    private Note mapNote(ResultSet rs) throws SQLException {
        User user = new User(
        rs.getString("first_name"),
        rs.getString("last_name"),
        rs.getString("email"),
        rs.getString("phone"));

        return new Note(
//        note.setId(rs.getLong("id"));
        rs.getString("title"),
        rs.getString("text"),
        user,
        Category.valueOf(rs.getString("category"))
        //    note.getLocalDate(rs.getDate("localDate"));
        );
    }
}



