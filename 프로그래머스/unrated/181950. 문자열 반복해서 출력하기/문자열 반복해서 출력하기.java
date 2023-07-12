import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String str = inputs[0];
        int n = Integer.parseInt(inputs[1]);
        for(int i=0; i<n; i++){
            System.out.print(str);
        }
    }
}