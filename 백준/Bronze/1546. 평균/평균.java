import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<n; i++){
            if (score[i]>max) max = score[i];
            sum += score[i];
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
