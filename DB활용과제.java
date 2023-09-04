package DataBaseProgramming;

import java.sql.*;



import java.util.Scanner;

public class DB활용과제 {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String id = "c##2201002";
        String pw = "p2201002";
        Connection conn = null;


        try {
            Scanner sc = new Scanner(System.in);
            boolean isRunning = true;

            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 적재 성공 ~ 뀨 ~");
            conn = DriverManager.getConnection(url, id, pw);

            while (isRunning) {
                System.out.println("키보드에서입력-> | 1:추가 | 2: 전체출력 |  3:부서번호를주면삭제 |  4:부서이름으로 검색 | 5:입력 창 중지" );
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addDepartment(conn, sc);
                        break;
                    case 2:
                        // 전체출력
                        displayAll(conn);
                        break;
                    case 3:
                        DeleteDeptNum(conn, sc);
                        break;
                    //부서 번호를 주면 삭제
                    case 4:
                        //부서 이름으로 검색
                        SearchDeptName(conn, sc);
                        break;
                    case 5:
                        System.out.println("입력 창 중지");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("다시 선택");
                        break;

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    private static void addDepartment(Connection conn, Scanner sc)  {
        System.out.println("부서번호 입력:");
        int DeptNo = sc.nextInt();
        System.out.println("부서이름 입력:");
        String DeptName = sc.next();
        System.out.println("층 :");
        int Floor = sc.nextInt();
        try {
            Statement stmt = conn.createStatement();
            String s = "INSERT INTO DEPARTMENT(DeptNo , DeptName , Floor) values";
                    s+= "("+DeptNo +" , '" + DeptName + "', " + Floor + ")";

            int  affectedRows =stmt.executeUpdate(s);
            if (affectedRows >0){
                System.out.println("추가 성공");
            }else{
                System.out.println("실패");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void displayAll(Connection conn) throws SQLException{
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM DEPARTMENT";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getInt("DeptNO")+"|"+rs.getString("DEPTNAME")+"|"+rs.getInt("FLOOR"));
            }
    }


    private static void DeleteDeptNum(Connection conn, Scanner sc) throws SQLException{
        System.out.println("삭제할 부서 번호:");
        int DEPTNO = sc.nextInt();
        Statement stmt = conn.createStatement();
        String deleteQuery = "DELETE FROM DEPARTMENT WHERE DEPTNO = " + DEPTNO;
        int affectedrows = stmt.executeUpdate(deleteQuery);

        if(affectedrows > 0) {
            System.out.println("부서 삭제 완료");
        }else {
            System.out.println("등록된 부서 번호가 없습니다.");
        }


    }
    private static void SearchDeptName(Connection conn, Scanner sc)throws SQLException {
        System.out.println("검색할 부서 이름");
        String deptName = sc.next();

        deptName = deptName.replace("'","''");

        Statement stmt = conn.createStatement();
        String Searchsql = "SELECT * FROM DEPARTMENT WHERE deptName = '" + deptName + "'";


        ResultSet rs = stmt.executeQuery(Searchsql);

        while(rs.next()){
            System.out.println(rs.getInt("DeptNO")+"|"+rs.getString("DEPTNAME")+"|"+rs.getInt("FLOOR"));
        }
    }






}
