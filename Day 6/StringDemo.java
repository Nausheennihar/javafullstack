public class StringDemo {
    public static void main(String[] args) {
        String str = new String(Originals:"Raji");
        System.out.println(str);

        //length()
        System.out.println(str.length());

        //is blank()
        // it return true if it has whitespaces and also the length as zero,otherwise
        //false.
        String s1 = "";
        System.out.println(s1.isBlank());

        // isEmpty()
        // itb return true when the length is zero otherwise false.
        String s2 = "";
        System.out.println(s2.isEmpty());

        // equals()
        String ss1 = "abc";
        String ss2 = "abcd";
        System.out.println(ss1.equals(ss2));

        //equalsIgnorecase()
        String st1 = "abc";
        String st2 = "Abc";
        System.out.println(ss1.equalsIgnorecase(ss2));

        //compareTo()
        //it return zero if al the character are same,else return negative if s1<s2,else return postive s1>s2.
        String str1="Abc";
        String str2="abc",

        //compareToIgnore()
        String str1 = "Abc";
        String str2 = "abc";
        System.out.println(str1.compareToIgnore(str2));

        //startwith()
        String a = "Hello World";
        System.out.println(a.startswith("H"));

        index
        System.out.println(a.startwith("w,6"));
        
        //endswith()
        String b = "programming"
        System.out.println(b.endswith("ing"));

        //contentEquals()
        String c ="Hello"
        System.out.println(c.contentEquals("Hello"));

        //contains() 
        String d = "My First Java Program";
        System.out.println(d.contain("Java"));

    }
}
