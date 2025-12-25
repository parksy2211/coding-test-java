package boj.p11653;
//소인수분해
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a = 2;
        while (N>1) {
            if (N%a==0){
                System.out.println(a);
                N = N/a;
            }else {
                a++;
            }
        }

    }
}
