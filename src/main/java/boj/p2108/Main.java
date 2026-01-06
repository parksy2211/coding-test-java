package boj.p2108;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(N);
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> countMap = new HashMap<>();
        double sum = 0;

        for(int i=0;i<N;i++) {
            list.add(Integer.parseInt(br.readLine()));
            countMap.put(list.get(i),countMap.getOrDefault(list.get(i),0)+1);
            sum += list.get(i);
        }
        int maxCount = 0;
        for (int count : countMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);
        int mode = (modeList.size() >= 2) ? modeList.get(1) : modeList.get(0);



        list.sort(Comparator.naturalOrder());

        /// 산술평균
        if(N>1){
            sb.append(Math.round(sum/N)).append("\n");
        }else{
            sb.append(list.get(0)).append("\n");
        }

        /// 중앙값
        sb.append(list.get(N/2)).append("\n");
        /// 최빈값
        sb.append(mode).append("\n");
        /// 범위
        if(Objects.equals(list.get(0), list.get(N - 1))){
            sb.append("0\n");
        }else{
            sb.append(list.get(N-1)-list.get(0)).append("\n");
        }
        System.out.print(sb.toString());
    }
}
