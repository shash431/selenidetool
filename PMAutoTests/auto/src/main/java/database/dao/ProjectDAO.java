package database.dao;


import entities.project.Project;
import java.sql.SQLException;
import java.util.List;

/**
 * @author: matcievskiy on 17.12.2015.
 */
public interface ProjectDAO {

    void addProject(Project socialItem) throws SQLException;
    List<Project> getProjects() throws SQLException;
    void deleteProject(Integer projectId) throws SQLException;
}
