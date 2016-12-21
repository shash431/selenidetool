package database.dao.impl;

import database.dao.ElanceToProjectDAO;
import database.util.HibernateUtil;
import entities.project.ElanceToProject;
import entities.project.Project;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: matcievskiy on 10.03.2016.
 */
public class ElanceToProjectDAOImpl implements ElanceToProjectDAO {


    public List<ElanceToProject> getElanceNames() throws SQLException {
        Session session = null;
        List<ElanceToProject> elanceToProjects = new ArrayList<ElanceToProject>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            elanceToProjects = session.createCriteria(ElanceToProject.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return elanceToProjects;
    }
}
