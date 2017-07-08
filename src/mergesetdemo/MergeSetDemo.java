package mergesetdemo;
import java.util.*;
public class MergeSetDemo {
	
public static void main(String[] args) {
		
		// Create a new HashSet of String objects
		HashSet<String> fruits = new HashSet<>();
		
		// Adding elements in HashSet
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Peach");
		
		System.out.println("fruits set = " + fruits);
		
		// Create a new HashSet of String objects
		HashSet<String> fruits2 = new HashSet<>();
		
		// Adding elements in HashSet
		fruits2.add("Grape");
		fruits2.add("Strawberry");
		fruits2.add("Berrys");
	
		System.out.println("Set of fruits two  = " + fruits2);

		// Merge Set 2 in Set 1
		boolean bResult = fruits.addAll(fruits2);
				
		if(bResult)
		{
			System.out.println("Merging of Set 1 & Set 2 Successful");
		}
		//display merged set
		System.out.println("Set of Fruits = " + fruits);
		
	}

}
