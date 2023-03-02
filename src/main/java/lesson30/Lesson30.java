package lesson30;

import java.sql.*;

public class Lesson30 {
    private static Connection connection;


    public static void main(String[] args) throws SQLException {
        connect("jdbc:postgresql://localhost:5432/Telran", "postgres", "лукгящ85");
        System.out.println("Postgresql server connected.");

        // use statement
        Statement stat = connection.createStatement();
//        createTable(stat);
//        System.out.println("Table created.");
//
//        insertInfo(stat);
//        System.out.println("record(s) added.");

        select(stat);
        findById(1);

        disconnect();
        System.out.println("Postgresql server disconnected.");
    }

    static void dropTable(Statement stat) throws SQLException {
        stat.executeUpdate("DROP TABLE IF EXISTS students");
    }

    static void createTable(Statement stat) throws SQLException {
        stat.executeUpdate("create table students (\n" +
                "\tid\t\tSERIAL PRIMARY KEY,\n" +
                "\tname \tTEXT NOT NULL,\n" +
                "\tgroup_name\tTEXT NOT NULL\n" +
                ");");
    }

    static void insertInfo(Statement stat) throws SQLException {
        stat.executeUpdate("insert into students (name, group_name) values ('Ivan', '38a'), ('Petr', '38b');");
    }

    static void select(Statement stat) throws SQLException {
        ResultSet res = stat.executeQuery("SELECT * FROM students");
        while (res.next()) {
            System.out.printf("id: %d, name: %s, group: %s", res.getInt(1), res.getString(2), res.getString(3));
        }
    }

    static void findById(Integer id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM students WHERE id = ?");
        ps.setInt(1, id);
        ResultSet res = ps.executeQuery();
        while (res.next()) {
            System.out.printf("id: %d, name: %s, group: %s", res.getInt(1), res.getString(2), res.getString(3));
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
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
