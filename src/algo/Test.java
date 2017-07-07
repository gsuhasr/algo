package algo;

import java.util.HashMap;

public class Test
{
    public static void main(String [] args)
    {
    	int [] arr={3,2,1,6,7,2};
    	int sum=9;
    	
    	HashMap<Integer,Integer> sumMap=new HashMap<Integer,Integer>();
    	
    	for(int i=0 ;i<arr.length;i++){
    		sumMap.clear();
    		int newSum=Math.abs(arr[i]-sum);
    		for(int j=i+1;j<arr.length;j++){
    		if(sumMap.containsKey(arr[j])){
    			System.out.println(sumMap.get(arr[j])+" " +arr[j]+" "+arr[i]);
    		}
    		else{
    			sumMap.put(newSum-arr[j],arr[j]);
    		}
    	}
    	}
    }
}