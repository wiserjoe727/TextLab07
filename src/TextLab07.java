// TextLab07st.java 
// The "Palindrome" Program 
// This is the student, starting version of Text Lab 07. 
public class TextLab07
{
        public static void main (String args[])                
        {  
                System.out.println("\nTextLab07\n");
                boolean finished = false;
                do
                {
                        System.out.print("Enter a string  ===>>  ");
                        String str = Expo.enterString();
                        System.out.println();
                        System.out.println("Entered String:     " + str);              
                        System.out.println("Palindrome:         " + Palindrome.isPal(str));
                        System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 and 110 point versions
                        System.out.println("Least Palindrome:   " + Palindrome.leastPal(str));    // used only for the 110 point versions
                        System.out.println();                  
                        System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
                        char repeat = Expo.enterChar();
                        finished = (repeat != 'Y' && repeat != 'y');
                        System.out.println();
                        int length = str.length();
               
                }
                while (!finished);
        }
}
 
 
class Palindrome
{      
        static String pur;
        static String reversestr;
        static String revstring;
        static String substr;
        static int length;
        static int counter = 0;
 
        public static boolean isPal(String s)
        {
                s = s.toLowerCase();
                String s2 = reversestring(s);
               
 
                if(s.equals(s2))
                        return true;
                        {
                                                return false;
                        }
        }
        public static String purge(String s)
        {
                pur =   s.replaceAll("[^a-zA-Z]","");
                return pur;
        }  
 
        public static boolean almostPal(String s)
        {          
                return isPal(purge(s));   // Do not alter this method!
        }
       
        public static String leastPal(String s)
        { if(isPal(s)==true)
        {
                return s;
        }
        else
        {
  
        revstring = reversestring(s);
       
               
        length = s.length();
        while(isPal(s.substring(counter,(length)))==false)
        {
                counter++;
        }
                substr = (s.substring(0,counter));
               
               
                substr+=revstring;
                return substr;
               
        }
               
        }
                public static String reversestring(String str)
        {
       
        int strlength = str.length();
        StringBuffer tempstr = new StringBuffer (strlength);
       
        for (int k =(strlength - 1); k>=0;k-- )
                {
                        tempstr.append(str.charAt(k));
                }
                 reversestr = tempstr.toString();
                 return reversestr;    
        }
       
}