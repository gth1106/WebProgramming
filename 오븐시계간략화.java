package BackJoon_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오븐시계간략화 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int hour = Integer.parseInt(line[0]);
        int minute = Integer.parseInt(line[1]);
        int addTime = Integer.parseInt(br.readLine());

        int totalTime = hour * 60 + minute + addTime;
        totalTime %= 1440; // 24시간으로 나머지 연산

        int newHour = totalTime / 60;
        int newMinute = totalTime % 60;

        System.out.println(newHour + " " + newMinute);
    }
}
