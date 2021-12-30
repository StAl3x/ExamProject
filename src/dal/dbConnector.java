package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;

public class dbConnector {
    private SQLServerDataSource dataSource;
    public dbConnector(){
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("10.176.111.31");
        dataSource.setDatabaseName("PrivateMovieColletion");
        dataSource.setUser("CSe21B_23");
        dataSource.setPassword("CSe21B_23");
        dataSource.setPortNumber(1433);
    }

    public Connection getConnection() throws Exception {
        try {
            return dataSource.getConnection();
        } catch (SQLServerException exception) {
            throw new Exception("Rip", exception);
        }
    }


}
