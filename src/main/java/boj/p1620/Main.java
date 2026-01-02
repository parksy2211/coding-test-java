package boj.p1620;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        String[] book = new String[N+1];


        Map<String, Integer> map = new HashMap<>(N*2);
        for(int i=1;i<=N;i++){
            String name = br.readLine();
            book[i] = name;
            map.put(name, i);
        }

        for(int i=0;i<M;i++){
            String q = br.readLine();
            char ch = q.charAt(0);
            if(ch>='0' && ch<='9'){
                sb.append(book[Integer.parseInt(q)]).append("\n");
            }else{
                sb.append(map.get(q)).append("\n");
            }
        }
    System.out.print(sb);
    }
}
