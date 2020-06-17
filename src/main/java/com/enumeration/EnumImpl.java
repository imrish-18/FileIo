package com.enumeration;



/*all enum directly child class of java.lang.Enum so anyother class can not be extended*/
/* can implement any  number of interfaces*/

/*enum Month
{
	jan,feb,marhch
}*/
/*java enum is more powerful because we can take inside enum methods constructor*/

public class EnumImpl {
	enum Month
	{	
		jan,feb
		{
			public void info()
			{
				System.out.println("starting 2 months");
			}
			
		},
		march;
		
			public void info() {
				System.out.println("next month");
			}
		
		Month()
		{
			System.out.println("const");// how many constant that time it will be called
		}
	}

	/* can not declare within a method */
	public static void main(String args[])
	{
		/*
		 * The member enum Month can only be defined inside a top-level class or
		 * interface or in a static context 
		 * enum Month {
		 *  jan,feb,marhch }
		 */
		/* from 1.7 version string also allowed to switch statement */
		switch("rish")
		{
		case "rish":System.out.println("hello"); break;
		case"ris":System.out.println("aklgh");
		
		}
		System.out.println(Month.jan);
		System.out.println("rishabh sharma");
		/* from 1.5 version enum also allowed to switch statement */
		switch(Month.feb)
		{
		case jan:System.out.println("hello"); break;
		case feb:System.out.println("aklgh");
		
		}
		Month[] str=Month.values();// to list out all value inside enum it is implicit method
     for(Month m:str) {
	System.out.println(m.ordinal());// give index number
	m.info();
     }
   
	}
}
