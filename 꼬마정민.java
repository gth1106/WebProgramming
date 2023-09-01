package BackJoon_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 꼬마정민 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        Long a = Long.parseLong(st.nextToken());
//        Long b = Long.parseLong(st.nextToken());
//        Long c = Long.parseLong(st.nextToken());
        String[] line = br.readLine().split(" ");
        Long a =Long.parseLong(line[0]);
        Long b =Long.parseLong(line[1]);
        Long c =Long.parseLong(line[2]);

        System.out.println(a+b+c);
    }
}
