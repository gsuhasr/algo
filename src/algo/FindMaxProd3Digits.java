package algo;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindMaxProd3Digits {
	public static void main (String[] args) {
		//code
		
		Scanner scan=new Scanner(System.in);
		int noofTestCases=scan.nextInt();
		scan.nextLine();
		
		for(int i=0;i<noofTestCases;i++){
		    int n=scan.nextInt();
		    scan.nextLine();
		    processArray(n,scan);
		    
		}
	}
	
	public static void processArray(int num, Scanner scan){
		
	    String n=scan.nextLine();
	    String[] nums=n.split(" ");
	    int [] arr=new int[num];
	    int k=0;
	    for(String str:nums){
	        arr[k]=Integer.parseInt(str.trim());
	        k++;
	        
	    }
	    findMaxProd(arr);
	}
		
		public static void findMaxProd(int[] arr){
		    
		    Arrays.sort(arr);
		    int length=arr.length-1;
		    int sum1=arr[0]*arr[1]*arr[length];
		    int sum2=arr[length]*arr[length-1]*arr[length-2];
		    if(sum1> sum2){
		        System.out.println(sum1);
		    }
		    else{
		        System.out.println(sum2);
		    }
		}
	
}