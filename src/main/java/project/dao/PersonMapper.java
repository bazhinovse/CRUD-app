package project.dao;

import org.springframework.jdbc.core.RowMapper;
import project.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setAge(rs.getInt("age"));
        person.setName(rs.getString("name"));
        person.setEmail(rs.getString("email")); 
        return person;
    }
}
