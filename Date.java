package com.ISCYear2;
//problem2
class Date implements Comparable<Date>
{
	int month;
	int day;
	int year;
	Date(int m, int d, int y)
	{
		month=m;
		day=d;
		year=y;
	}
	public int compareTo(Date date)
	{
		if(year==date.year&day==date.day&month==date.month)	return 0;
		if(year<date.year)	return 1;
		if(year==date.year) 
		{
				if (month<date.month) return 1;
				if (month==date.month) 
				{
					if (day<date.day) return 1;
				}
		}
		return -1;
	}	
}
