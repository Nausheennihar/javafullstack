public class Sum {
    public static void main(string[] args) {
        int n=234;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        system.out.println(sum);
    }
}