public class Pattern1 {
    public static void main(String[] args) {
        int n=5, i, j;
        for(i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                if(i==1 ||  i==n || j==1 || j==i ){
                    System.out.print("1");
                }
                else
                    System.out.print("");
            }
            System.out.println(0);
        }
    }
}
