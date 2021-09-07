import java.util.*;
import java.util.stream.*;
public class MaptoTreeDemo 
{
   public static void main(String args[]) 
   {
   //Creating a Map
      Map<String, String> map = new HashMap<>();
      map.put("1", "One");
      map.put("2", "Two");
      map.put("3", "Three");
      map.put("4", "Four");
      map.put("5", "Five");
      map.put("6", "Six");
      map.put("7", "Seven");
      map.put("8", "Eight");
      map.put("9", "Nine");
      System.out.println("HashMap = " + map);
	  
	  //Conerting Map to TreeMap
      Map<String, String> treeMap = new TreeMap<>();
	  
	  //Putting all values of map to treemap
      treeMap.putAll(map);
      System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
   }
}