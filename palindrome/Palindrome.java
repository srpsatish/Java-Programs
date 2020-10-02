class Palindrome {
    public static void main ( String args[])
    {
        String s1 = new String("madam");
        String s2 = new String();
        int n = s1.length();
        for ( int i = n-1; i>=0; i-- )  
          s2 = s2 + s1.charAt(i);         
        if(s1.equals(s2))  
         System.out.println("Palindrome.");  
        else  
         System.out.println("Not Palindrome."); 
    }
}