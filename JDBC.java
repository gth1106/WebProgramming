import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@10.30.3.95::1521:orcl";
        String user = "c2201002";
        String pw = "p2201002";
        //1. JDBC 드라이버를 적재
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패: " + e.getMessage());
            e.printStackTrace();
            return; // 드라이버가 없으면 더 이상 진행하지 않음
        }

        //2. 데이터베이스 연결
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,pw);
            System.out.println("데이터베이스에 연결되었습니다.");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 실패: " + e.getMessage());
            e.printStackTrace();
        } finally {
            //3. 연결 해제
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("데이터베이스 연결 해제 실패: " + e.getMessage());
            }
        }
    }
}
