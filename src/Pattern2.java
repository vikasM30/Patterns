public class Pattern2 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=(i*2-1);j++){
                System.out.print(j);
            }
            System.out.println();

        }
        for(i=5;i>0;i--){
            for(j=1;j<=(i*2-1);j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }

}
