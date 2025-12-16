public class Second {
    public static void main(String[] args) {
        int a[] = {90,23,45,67,25};
        int first = Integer.MAX_VALUE;
        int Second = Integer.MAX_VALUE;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < first){
                Second = first;
                first = a[i];
            }else if (a[i] < Second) {
                Second = a[i];
            }
        }
        System.out.println(Second);
    }
}

    

