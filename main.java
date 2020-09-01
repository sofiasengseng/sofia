package com.ISCYear2;
import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		//problem1
		int sum=0;
		List<Integer> integers=new ArrayList<Integer>();												
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		for(int a: integers)
			sum+=a;
		System.out.println(sum);
		//
		System.out.println();
		//problem2
		Date[] date={new Date(12,7,1999),new Date(12,30,2000),											
					 new Date(10,17,2010),new Date(9,9,1957),
					 new Date(12,3,2000),new Date(1,3,1768)};			
		
		for(int x=0;x<date.length;x++)
		{
			Date z;
			for(int y=0;y<date.length;y++) 
			{
				if(date[x].compareTo(date[y])>0)
				{
					z=date[y];
					date[y]=date[x];
					date[x]=z;
				}
				else;
			}
		}
		for(Date dt:date)
			System.out.println(dt.month+"-"+dt.day+"-"+dt.year);
		//
		System.out.println();
		//problem3
		SortedMap<Date,String> syllabus=new TreeMap<Date,String>();										
		syllabus.put(new Date(8,30,2002),"s");
		syllabus.put(new Date(7,23,2001),"h");
		syllabus.put(new Date(2,10,1998),"e");
		syllabus.put(new Date(8,28,2002),"b");
		syllabus.put(new Date(8,12,2002),"e");
		syllabus.put(new Date(5,6,2002),"l");
		syllabus.put(new Date(10,3,2002),"i");
		syllabus.put(new Date(2,30,2003),"e");
		syllabus.put(new Date(8,10,2002),"v");
		syllabus.put(new Date(8,1,2002),"e");
		syllabus.put(new Date(8,2,2010),"d");
		for(Map.Entry<Date, String> x: syllabus.entrySet())
			if(x.getKey().month==8&&x.getKey().year==2002) System.out.print(x.getValue()+" ");
		System.out.println();
		//
		System.out.println();
		//problem4 check
		tableOfSquares(5,1);																				
	}
		//problem4																	
	static void tableOfSquares(int n, int x)
	{
		System.out.println(x+"    "+(x*x));
		if (x!=n)
		tableOfSquares(n,x+1);
	}
}

