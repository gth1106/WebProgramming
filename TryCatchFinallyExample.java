import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            System.out.println("You entered: " + line);

            // 예외를 강제로 발생시켜보기
            int x = Integer.parseInt(line);  // 숫자가 아닌 입력값일 경우 예외 발생
        } catch (IOException e) {
            e.printStackTrace();  // 입출력 관련 예외 처리
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");  // 숫자 변환 관련 예외 처리
        } finally {
            try {
                if (br != null) br.close();  // 리소스 해제
            } catch (IOException e) {
                e.printStackTrace();  // 해제 중 발생한 예외 처리
            }
        }
    }
}
