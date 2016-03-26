package com.github.hirethem.dao.factory;


import com.github.hirethem.dao.GenericDao;
import com.github.hirethem.dao.impl.UserSqlDao;
import org.apache.log4j.Logger;

public class SqlDaoFactory {
    private static final Logger LOGGER = Logger.getLogger(SqlDaoFactory.class);

    private final static SqlDaoFactory instance = new SqlDaoFactory();

    public static SqlDaoFactory getInstance() {
        return instance;
    }

    public GenericDao getDao(DaoType type) {
        switch (type) {
            case USER:
                return UserSqlDao.getInstance();

        }
        return null;
    }

    public enum DaoType {
        USER
    }

}