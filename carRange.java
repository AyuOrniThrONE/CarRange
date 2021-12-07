import java.util.Scanner;

public class carRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        if (1<=t && t<=30000) {
            for (int i = 0; i < t; i++) {
                int p=sc.nextInt();
                int m=sc.nextInt();
                int v=sc.nextInt();
                int ans=0;
                
                if (1<=p && p<=5 && 6<=m && m<=56 && 1<=v && v<=100) {
                    ans=(m-(p-1))*v;
                    System.out.println(ans);
                }
            }
        }
    }
}
