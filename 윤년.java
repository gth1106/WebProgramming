package BackJoon_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {
    public static void main(String[] args) throws IOException {
        /* 윤년 4의배수 100의배수 400의배수

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int yy = Integer.parseInt(br.readLine());

        if ((yy %4==0 && yy % 100 !=0) || yy % 400 == 0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
