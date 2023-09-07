package BackJoon_;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class 알람시계 {
    /* 10 10 - > 09 25
     *  23 45 - > 23 00
     *  01 30 - > 00 45
     *  00 30 - > 23 45  */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        if (a>0){

            if(b>=45){
                b -= 45;
                System.out.println(a+" "+b);
            }else{
                b = (b+60)-45;
                a--;
                System.out.println(a+" "+b);
            }
        }else if(a==0){
            if(b>=45){
                b-=45;
                System.out.println(a+" "+b);
            }
            else{
                a=23;
                b = (b+60)-45;
                System.out.println(a+" "+b);

            }
        }




    }
}
