public class Demo5 {
    public static void main(String [] args){
        int row=5;
        int num=1;

        for (int i=1; i<=row; i++ )
            {
                int temp=num+i-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp+" ");
                temp--;
            }
            num=num+i;
            System.out.println();
        }
    }
    
}
