import com.sepfook.tmall.util.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDBUtil {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBUtil.getConnection();
        System.out.println(DBUtil.getConnection());
        System.out.println(connection);
    }
}
