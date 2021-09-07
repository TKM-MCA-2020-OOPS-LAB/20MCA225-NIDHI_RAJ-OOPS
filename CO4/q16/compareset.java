import java.util.*;
  public class compareset
  {
  public static void main(String[] args) 
  {
  
          HashSet<String> sone = new HashSet<String>();
     
          sone.add("Red");
          sone.add("Green");
          sone.add("Black");
          sone.add("White");

          HashSet<String>stwo = new HashSet<String>();
          stwo.add("Red");
          stwo.add("Pink");
          stwo.add("Black");
          stwo.add("Orange");
     
          HashSet<String>result_set = new HashSet<String>();
         for (String element : sone){
             System.out.println(stwo.contains(element) ? "Yes" : "No");
          }      
     }
}
