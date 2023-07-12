import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 수의 갯수 입력

        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());   // 수 입력
        }

        Arrays.sort(arr);
        for (int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
    
}