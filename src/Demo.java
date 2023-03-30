import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.Test;

public class Demo {
	
	//Count the number of alaphbet starts with A in the List
//	@Test
	public void abc()
	{
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Sagar");
		names.add("Asha");
		names.add("Arun");
		names.add("Kumar");
		names.add("Abc");
		
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			
			String actual=names.get(i);
			
			if(actual.startsWith("A"))
			{
				count++;
			}
			
			
		}
		System.out.println(count);
		
	}
	
	@Test
	public void StreamFilter()
	{
ArrayList<String> names=new ArrayList<String>();
		
		names.add("Sagar");
		names.add("Asha");
		names.add("Arun");
		names.add("Abc");
		names.add("Kumar");
		
//		Long c=names.stream().filter(s->s.equalsIgnoreCase("Abc")).count();
//		
//		
//		System.out.println(c);
		
//		long f=Stream.of("Sagar","Asha","Arun","Kumar").filter(s->
//		{
//			s.equalsIgnoreCase("Kumar");
//			return true;
//		}).count();
//		System.out.println(f);
		
		
		
//	 	names.stream().filter(s->s.length()>0).forEach(s->System.out.println(s));
		
//		names.stream().filter(s->s.length()>0).limit(1).forEach(s->System.out.println(s));
		
		Long c=names.stream().filter(s->s.equalsIgnoreCase("Abc")).count();
		
		System.out.println(c);
	}
	
//	public static void main(String args[])
//	{
//		
//		Demo d=new Demo();
//		d.abc();
//
//	
//	
//	
//
}


