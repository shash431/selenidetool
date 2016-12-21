package database.dao;


import database.dao.impl.ElanceToProjectDAOImpl;
import database.dao.impl.ProjectDAOImpl;

/**
 * @author: matcievskiy on 16.12.2015.
 */
public class Factory {


    private static ProjectDAO projectDAO = null;

    private static  ElanceToProjectDAO elanceToProjectDAO = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }



    public ProjectDAO getProjectDAO(){
        if (projectDAO == null){
            projectDAO = new ProjectDAOImpl();
        }
        return projectDAO;
    }


    public ElanceToProjectDAO getElanceToProjectDAO(){
        if (elanceToProjectDAO == null){

            elanceToProjectDAO = new ElanceToProjectDAOImpl();
        }
        return elanceToProjectDAO;

    }


}
