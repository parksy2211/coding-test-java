package boj.p7785;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();


        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String state = input[1];
            if(state.equals("enter")){
                set.add(name);
            }else {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        for( String s : list){
            System.out.println(s);
        }
    }
}
