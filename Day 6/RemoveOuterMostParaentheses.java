public class RemoveOuterMostParaentheses {
    public static void main(String[] args) {
        String s="(()()())(())";
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')'){
                cnt--;
            }
            if(cnt!=0)
            {
                s.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                cnt++;
            }
        }
        System.out.println(s.toString());
    }
}
