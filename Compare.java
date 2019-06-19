public class Compare{
	public static int getMax(int a[]){
		int maxvalue=a[0];
		for(int i=1;i<a.length;i++){
			if(maxvalue<a[i]){
				maxvalue=a[i];
		}
	}
	return maxvalue;
	}
	public static int getMin(int arr[]){
	  int minvalue=arr[0];
	  for(int i=1;i<arr.length;i++){
		  if(arr[i]<minvalue){
			  minvalue=arr[i];
		  }
	}
	return minvalue;
	}
	public static double getAverage(int [] ar){
		int sum=0;
		double average=0;
		for(int i=0;i<ar.length;i++){
			sum=sum+ar[i];
			 average=(double)(sum-getMax(a)-getMin(arr))/(ar.length-2);
		}
		return average;
	}
	
	public static void main(String [] args){
		int a[]={232,23,13,324,2};
		System.out.println(getMax(a));
		System.out.println(getMin(a));
		System.out.println(getAverage(a));
	}
}