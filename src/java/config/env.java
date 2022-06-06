package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Cesar Hidalgo Rojas
 */
public class env {

    /*establish connection to mysql*/
    public DriverManagerDataSource getConnection() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/e-business");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}
