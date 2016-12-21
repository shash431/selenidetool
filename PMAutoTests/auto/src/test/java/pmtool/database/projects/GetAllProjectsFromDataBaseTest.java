package pmtool.database.projects;

import database.dao.Factory;
import entities.project.ElanceToProject;
import entities.project.Project;
import org.testng.annotations.Test;

import java.sql.SQLException;

/**
 * @author: matcievskiy on 10.03.2016.
 */
public class GetAllProjectsFromDataBaseTest {

    @Test
    public void getAllProjectsFromDataBaseTest() throws SQLException {

        for(ElanceToProject project:Factory.getInstance().getElanceToProjectDAO().getElanceNames()){

            System.out.println(project.getElanceName());
        }

    }
}
