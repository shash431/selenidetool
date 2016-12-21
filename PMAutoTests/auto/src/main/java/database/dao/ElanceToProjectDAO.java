package database.dao;

import entities.project.ElanceToProject;
import entities.project.Project;

import java.sql.SQLException;
import java.util.List;

/**
 * @author: matcievskiy on 10.03.2016.
 */
public interface ElanceToProjectDAO {



    List<ElanceToProject> getElanceNames() throws SQLException;

}
