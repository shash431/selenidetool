package database.dao.impl;


import database.dao.ProjectDAO;
import database.util.HibernateUtil;
import entities.project.Project;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: matcievskiy on 17.12.2015.
 */
public class ProjectDAOImpl implements ProjectDAO {


    public void addProject(Project socialItem) throws SQLException {

    }


    public List<Project> getProjects() throws SQLException {

        Session session = null;
        List<Project> projects = new ArrayList<Project>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            projects = session.createCriteria(Project.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return projects;

    }


    public void deleteProject(Integer projectId) throws SQLException {

    }
}
