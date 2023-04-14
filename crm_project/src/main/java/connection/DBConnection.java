package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3307/crm_project";
    private static String USER_NAME = "root";
    private static String PASSWORD = "Giang270599";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME).newInstance();
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("Lỗi kết nối tới CSDL: " + e.getMessage());
        }

        return connection;
    }
}
