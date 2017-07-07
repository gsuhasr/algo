package algo;

public class Print1to100WithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print100();

	}
	public static void print100(){
		int [] a=new int[100];
		try{
			printTill100(a,1);
		}
		catch(Exception e){
			
		}
	}
	public static void printTill100(int[] a,int i){
		a[i]=a[i-1]+1;
		System.out.println(a[i]);
		printTill100(a,i+1);
	}

}
