package Practise;

public class factorialusingrecursion {
	        public static void main(String[] args) {
	       int fact=4;
	       int res=1;
	       int a=factorialusingrecursion.factorial(fact,res);
	       System.out.print(a);
	    }
	
	    public static int factorial(int x,int res){
	        while(x>0){
	            res=res*x;
	            x--;
	            factorial(x,res);
	        }
	     return res;   
	    }

}
