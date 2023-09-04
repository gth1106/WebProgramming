package DataBaseProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Scanner;

public class ABB {
    public static void main(String[] args) {
        String url ="jdbc:oracle:thin:@10.30.3.95:1521:orcl";
        String id = "c##2201002";
        String pw = "p2201002";
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        int newID;
        String bookTitle;
        System.out.print("id를 입력하세요: ");
        newID = sc.nextInt();
        System.out.println("책이름을 입력하세요:");
        bookTitle = sc.next();
        try{
            // 1. 드라이버적재
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 적재 성공");
            // 2. 연결
            conn = DriverManager.getConnection(url,id,pw);
            System.out.println("연결성공");
            // 3. SQL 문장 작성 및 전송
            Statement stmt = conn.createStatement();
            System.out.println("StateMent 객체 획득 성공");
            String s = "insert into books(book_id , title , publisher , year , price)" +
                       "values ("+ newID + " , '"+ bookTitle+ "' , '영진' , 2023 , 20000)" ;
            System.out.println(s);
            int n = stmt.executeUpdate(s);
            if ( n == 1 ) {
                System.out.println("레코드 추가 성공");
            }else{
                System.out.println("레코드 추가 실패");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
