package homework30;

/**
 * Java Professional Homework #30
 *
 * @author Artysh
 * @version 27.02 - 02.03
 */

import java.sql.*;

public class Homework30 {
    private static Connection connection;
    public static void main(String[] args) throws SQLException {
        connect("jdbc:postgresql://localhost:5432/homework", "postgres", "лукгящ85");
        System.out.println("Postgresql server connected.");

        Statement st = connection.createStatement();
//        dropTable(st);
//        createTable(st);
//        System.out.println("Table created.");
//
//        insertInfo(st);
//        System.out.println("Record(s) added.");
        select(st);
        findById(1);

        disconnect();
        System.out.println("Postgresql server disconnected.");

    }

    static void dropTable(Statement st) throws SQLException {
        st.executeUpdate("DROP TABLE IF EXISTS employees");
    }

    static void createTable(Statement st) throws SQLException {
        st.executeUpdate("CREATE TABLE employees (\n" +
                "\tid SERIAL PRIMARY KEY,\n" +
                "\tname TEXT NOT NULL,\n" +
                "\tposition TEXT NOT NULL\n" +
                ");");
    }

    static void insertInfo(Statement st) throws SQLException {
        st.executeUpdate("insert into employees (name, position) values ('Sam', 'engineer'), ('Alex', 'engineer');");
    }

    static void select(Statement st) throws SQLException {
        ResultSet res = st.executeQuery("SELECT * FROM employees");
        while (res.next()) {
            System.out.printf("id: %d, name: %s\n", res.getInt(1), res.getString(2), res.getString(3));
        }
    }

    static void findById(Integer id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM employees WHERE id = ?");
        ps.setInt(1, id);
        ResultSet res = ps.executeQuery();
        while (res.next()) {
            System.out.printf("id: %d, name: %s\n", res.getInt(1), res.getString(2), res.getString(3));
        }
    }

    static void connect(String url, String user, String password) {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void disconnect() {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
