import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class setCod {
	public static void main(String[] args) {
//		HashSet<Object> set=new HashSet<Object>();
//		set.add(10);
//		set.add(10);
//		set.add('A');
//		set.add(20);
//		set.add(20);
//		set.add(null);
//		set.add(null);
//		set.add('a');
//		System.out.println(set);
//		
			
//	SortedSet<Object> set1 =new TreeSet<Object>();
//	set1.add("yasac");
//	set1.add("vghfj");
//	System.out.println(set1);
////	
//  TreeSet<Integer>set2=new TreeSet<Integer>();
//  
//	set2.add(2);
//	set2.add(6);
//	set2.add(1);
//	set2.add(7);
//	set2.add(2);
//	System.out.println(set2);
	
//	Hashtable<Integer,String> map=new Hashtable<Integer,String>();
//		map.put(104, "10");
//	map.put(102, "hello");
//	map.put(101, "bye");
//	map.put(103, "bye");
//	map.put(103, "bye");//duplicate are not allowed
//	map.put(null, "hi");//exception
//	map.put(103, null);//exception
//	System.out.println(map);
	
//	HashMap<Integer,String>map=new HashMap<Integer,String>();
//	map.put(102 , "10");
//	map.put(104 , "hello");
//	map.put(101, "bye");
//	map.put(101 , "bye");
//	map.put(null, "hi");
//	map.put(103, null);
//	map.put(105, null);
//	map.put(null, "hello");
//	for(Entry<Integer,String>m:map.entrySet()) {
//		System.out.println(m.getKey()+" "+m.getValue());
		
//		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
//		map.put(104, "10");
//		map.put(102,"hello");
//		map.put(101,"bye");
//		map.put(null, "hi");
//		map.put(103, null);
//		map.put(105, null);
//		map.put(null, "hello");
//		for(Entry<Integer,String> m:map.entrySet()){
//			System.out.println(m.getKey()+" "+m.getValue());
//			
//			
//  TreeMap<Integer,String> map=new TreeMap<Integer,String>();
//			map.put(104, "10");
//			map.put(102,"hello");
//			map.put(101,"bye");
//			//map.put(null, "hi");
//			map.put(103, null);
//			map.put(105, null);
//			//map.put(null, "hello");//Red-Black Tree
//			System.out.println(map);
			
			
		int[] a= {4,1,2,3,0};
		for(int i=0;i<a.length;i++) {
			//0       0<5   t
			//1        1<5  t
			System.out.println("a[i]="+a[i]);
			
			for(int j=i+1;j<a.length;j++)
				//0+1=1  1<5  t ,++=1
				System.out.println("a[i] "+a[i]);
			    //System.out.println("a[j] "+a[j]);
			{
				if(a[i]>a[j])     //4>1t  1>2f
				{
					System.out.println(a[i]);
					System.out.println(a[j]); 
					
					int temp=a[i];//temp=4;
					System.out.println(temp);
					
					a[i]=a[j];//a[1]=1
					System.out.println("a[i]="+a[i]);
					System.out.println("a[j]="+a[j]);
					
					
					a[j]=temp;//a[j]=4 //1 4 2 3 0
					System.out.println("a[j] ="+a[j]);
					
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		}
	}
	
	


