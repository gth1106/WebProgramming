package DataBaseProgramming;


import java.sql.*;


public class Web_0904 {
        public static void main(String[] args) throws SQLException {
            String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
            String user = "c##2201002";
            String pw = "p2201002";
            Connection conn = null;
            //1. JDBC 드라이버를 적재
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("드라이버 적재 성공");

            } catch (ClassNotFoundException e) {
                System.out.println("드라이버 적재 실패: " + e.getMessage());
                e.printStackTrace();

            }

            //2. 데이터베이스 연결

            try {
                conn = DriverManager.getConnection(url, user, pw);
                System.out.println("데이터베이스에 연결되었습니다.");

            } catch (SQLException e) {
                System.out.println("데이터베이스 연결 실패: " + e.getMessage());
                e.printStackTrace();
            }
            //3.SQL 문장 작성 및 전송
            try{
                Statement s = conn.createStatement();

                ResultSet rs = s.executeQuery("select * from books");
              // 결과집합 사용후 연겷해제
                rs.next(); // 첫번째 레코드로 커서를 이동시키는 메소드
                String title,pub;
                int id,year,price;
                while(rs.next()) {
                    id = rs.getInt("BOOK_ID");// rs.getInt(1);
                    title = rs.getString("TITLE");
                    pub = rs.getString("publisher");
                    year = rs.getInt("YEAR");
                    price = rs.getInt("PRICE");
                    System.out.printf("%3d %25s %15s %4d %6d\n", id, title, pub, year, price);
                }
//                System.out.println(rs.getString(1)+" ");
//                System.out.println(rs.getString(2)+" ");
//                System.out.println(rs.getString(3)+" ");
//                System.out.println(rs.getInt(4)+" ");
//                System.out.println(rs.getInt(5)+" ");
            } catch (SQLException e){
                System.out.println("연결 할 수 없습니다.");
                e.printStackTrace();
            }



        }
    }