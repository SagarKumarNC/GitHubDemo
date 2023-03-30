import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class MapDemo {
	
//	@Test
	
	public void StreamMap()
	{
//		Stream.of("Sagar","asha","kumar","naga").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		Stream.of("Sagar","asha","kumar","naga").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		Stream.of("Sagar","asha","kumar","naga","asura","angara","az")
//		.filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
		
		//Converting Arrays to List
		
//		List<String> names=Arrays.asList("sag","kum","asha");
//		
//		System.out.println(names);
		
		
		//Merging two ArrayList using Stream
		
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Sagar");
		names.add("Asha");
		names.add("Arun");
		names.add("Kumar");
		names.add("Abc");
		
		
		List<String> names1=Arrays.asList("kiran","anu","siri");
		
		Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
		
//		newStream.forEach(s->System.out.println(s));
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("anu"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
//		Merging two arrayList without Streams
		
		
//		ArrayList<String> combined=new ArrayList<String>();
//		
//		combined.addAll(names);
//		combined.addAll(names1);
//		
//		System.out.println(combined);
		
	}
	
//	@Test
	public void CollectDemo()
	{
		
		List<String> ls=Stream.of("Sagar","asha","kumar","naga").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(1));
		
		
	}
	
	@Test
	public void assignment()
	{
		
		List<Integer> number=Arrays.asList(3,2,2,7,5,1,9,7);
		
//System.out.println(number);

//		number.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> last=number.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(last);
		
		System.out.println(last.get(3));
		
//		Stream.of(3,2,2,7,5,1,9,7).distinct().sorted().forEach(s->System.out.println(s));


	}
	
	

}
