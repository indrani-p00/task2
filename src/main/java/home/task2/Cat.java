package home.task2;
import java.util.Scanner;

public class Cat {
    public static void main( String[] args )
    {
    	int num_sweets;
    	int num_chocolates;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter total number of Sweets in the Gift:");
    	num_sweets=sc.nextInt();
    	Banana s[]=new Banana[num_sweets];
    	for(int i=0;i<num_sweets;i++)
    	{
    		System.out.println("Enter details of sweet "+(i+1)+":");
    		System.out.print("Name:");
    		String sname=sc.next();
    		System.out.print("Quantity:");
    		int squantity=sc.nextInt();
    		System.out.print("Cost:");
    		int scost=sc.nextInt();
    		s[i]=new Banana(sname,squantity,scost);
    	}
    	System.out.println("Enter total number of Chocolates in the Gift:");
    	num_chocolates=sc.nextInt();
    	Apple c[]=new Apple[num_chocolates];
    	for(int i=0;i<num_chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cname=sc.next();
    		System.out.print("Flavour:");
    		String cflavour=sc.next();
    		System.out.print("Cost:");
    		int c_cost=sc.nextInt();
    		c[i]=new Apple(cname,cflavour,c_cost);
    	}
    	New_Year ng=new New_Year(s,c);
    	ng.find_weight();
    	ng.sort_chocolates();
    	ng.find_candies();
    	sc.close();
    }
}

