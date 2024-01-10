package com.ygdbx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private List<Connection> connectionPool;
    private static final int POOL_SIZE = 3;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/heima";
    private static final String USER = "root";
    private static final String PASSWORD = "jpt1452013";

    private DatabaseConnectionPool() {
        initializeConnectionPool();
    }

    public static synchronized DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    private void initializeConnectionPool() {
        if (connectionPool == null) {
            connectionPool = Collections.synchronizedList(new ArrayList<>());
            for (int i = 0; i < POOL_SIZE; i++) {
                connectionPool.add(createNewConnection());
            }
        }
    }

    private Connection createNewConnection() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public synchronized Connection getConnection() {
        if (connectionPool.isEmpty()) {
            // If the pool is empty, wait until a connection is available
            waitUntilConnectionAvailable();
        }

        // Get a random index to select a connection
        int randomIndex = (int) (Math.random() * connectionPool.size());

        Connection connection = connectionPool.remove(randomIndex);
        return connection;
    }

    private void waitUntilConnectionAvailable() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void releaseConnection(Connection connection) {
        if (connection != null) {
            connectionPool.add(connection);
            // Notify any waiting threads that a connection is available
            notifyAll();
        }
    }
}

