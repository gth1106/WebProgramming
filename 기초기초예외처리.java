package BackJoon_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 기초기초예외처리 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int c=Integer.parseInt(str[2]);

            System.out.println(a+b+c);

        }catch (NumberFormatException nfe){
            System.out.println(" 입력 값 중 숫자가 아닌 수가 있습니다. ");
            System.out.println(nfe.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
