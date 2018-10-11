package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        final String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        
        final String dbPath = "jdbc:mysql://localhost:3306/world?allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        Connection conn = DriverManager.getConnection(dbPath, "root", "####");
        
        Statement statement = conn.createStatement();
        final String sqlQuery = "SELECT Name, Population FROM city";
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        
        String cityName = null;
        int cityPopulation = 0;
        while(resultSet.next()) {
            cityName = resultSet.getString("Name");
            cityPopulation = resultSet.getInt("Population");
            System.out.println(cityName + " " + cityPopulation);
        }
        
        
        if(statement != null) {
            statement.close();
        }
        if(resultSet != null) {
            resultSet.close();
        }
        if(conn != null) {
            conn.close();
        }
        
    }
}