import java.io.*;
import java.util.*;

public class Fibonacci{
	
	public static void main(String args []){
		
		int n =10;
		for(int i=0;i<n;i++){
			
		System.out.println(i);
	
		}
	}
	
	
	public static int fib(int m){
		
		if(m==0)
			return 0;
		else if(m==1)
			return 1;
		else
			return fib(m-1) + fib(m-1);
	}
	
}