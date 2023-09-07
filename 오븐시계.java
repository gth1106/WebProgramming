package BackJoon_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int hour = Integer.parseInt(line[0]);
        int minute = Integer.parseInt(line[1]);
        int addTime = Integer.parseInt(br.readLine());
        hour = hour * 60;
        int newTime = hour + minute + addTime;

        if (newTime<1440){
            int remainder = newTime % 60 ;
            newTime = newTime / 60;
            System.out.println(newTime+" "+remainder);
        }else if(newTime>=1440){
            int remainder = newTime % 60;
            newTime -= 1440;
            int realTime = newTime/60;
            System.out.println(realTime+" "+remainder);
        }

    }
}
