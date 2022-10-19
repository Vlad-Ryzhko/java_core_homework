package ua.com.logos_academy.lviv;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("-------------Варіант I-----------------");
        int[] array = new int[10];
        for (int j=0; j < array.length; j++) {
            array[j] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[j]);
        }
        Arrays.sort(array);
        System.out.println("Min element is: " + array[0]);
        System.out.println("Max element is: " + array[9]);
        
        System.out.println("-------------Варіант ІI-----------------");
        
        int[] A = { 12, 8, 3, 5, 1, 9 , 10, 4};
        
        int max = Arrays.stream(A)
                        .max()
                        .getAsInt();
 
        int min = Arrays.stream(A)
                        .min()
                        .getAsInt();
 
        System.out.println("Min element is " + min);
        System.out.println("Max element is " + max);
        
        System.out.println("-------------Варіант III-----------------");
        int[] B = { 6, 8, 3, 5, 1, 9 };
        
        IntSummaryStatistics stats = new IntSummaryStatistics();
        for (int i : B) {
            stats.accept(i);
        }
 
        System.out.println("Min element is " + stats.getMin());
        System.out.println("Max element is " + stats.getMax());
        
	}
	
	
}
//*dvd