package question1;

public class q1 {
	public static void main(String[] args) {
	    int n= 10;
	    int sum = 0;
	for (int i=1; i<=n; i++)
	  for (int j=1;j<n; j+=i) {
	sum+= summation(i , j);
	  System.out.println("i+j: "+  i +"+"+ j);
	  }
	   System.out.println(sum);

	}
	 static int summation(int a, int b){
	 return a+b;
	 }	    
}
