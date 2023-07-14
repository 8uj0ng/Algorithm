import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for(int r=0; r<n; r++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int c=0; c<m; c++){
                a[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        for(int r=0; r<n; r++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int c=0; c<m; c++){
                b[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                System.out.print(a[r][c]+b[r][c]+" ");
            }
            System.out.println();
        }

    }
}
