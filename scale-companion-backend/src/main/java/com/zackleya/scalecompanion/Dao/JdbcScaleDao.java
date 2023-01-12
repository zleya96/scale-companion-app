package com.zackleya.scalecompanion.Dao;

import com.zackleya.scalecompanion.Model.Scale;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class JdbcScaleDao implements scaleDao{

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public JdbcScaleDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Scale getScaleById(int id)  {
        Scale scale;
        String sql = "" +
                "SELECT * FROM scales " +
                "WHERE scale_id = ?;";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, id);
        try {
            if (rowSet.next()) {
                scale = mapRowToScale(rowSet);
                return scale;
            }
        } catch(EmptyResultDataAccessException | NullPointerException e) {

        }
            return null;
    }

    @Override
    public Scale getScaleByRootAndType(String root, String type) {
        Scale scale;
        String sql = "" +
                "SELECT * FROM scales " +
                "WHERE root = ? AND type = ?;";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, root, type);
        try {
            if (rowSet.next()) {
                scale = mapRowToScale(rowSet);
                return scale;
            }
        } catch(EmptyResultDataAccessException | NullPointerException e) {

        }
        return null;
    }    

    @Override
    public List<Scale> getAllScales() {
        return null;
    }

    @Override
    public List<Scale> getScalesByRoot(String root) {
        return null;
    }

    @Override
    public List<Scale> getScalesByType(String type) {
        return null;
    }

    private Scale mapRowToScale(SqlRowSet rowSet) {
        Scale scale = new Scale();

        scale.setId(rowSet.getInt("scale_id"));
        scale.setRoot(rowSet.getString("root"));
        scale.setType(rowSet.getString("type"));
        scale.setNotes((char[]) rowSet.getObject("notes"));
        scale.setDiagram(rowSet.getString("diagram"));
        scale.setDescription(rowSet.getString("description"));

        return scale;
    }
}
