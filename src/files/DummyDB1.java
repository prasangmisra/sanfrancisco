package files;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DummyDB1 {
	
	
	public static void main(String args[]  )throws IOException
	{
	
	try{
		int count = 0;
		String location_data="\"";
		String[] str_array=null;
	List<String> files = Files.readAllLines(Paths.get("src\\Film_Locations_in_San_Francisco.csv"));
	for (String file : files)
	{
		System.out.println("This is the value of count:" + count);
		count++;
		str_array = file.split(",");
		System.out.println(str_array[2]);
		location_data+=str_array[2];
		location_data+=",";
	}
	location_data+="\"";
System.out.println(location_data);


System.out.println("now executing give function");
give1();
System.out.println("give function completed");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	}


	
	
	public static String give1() throws IOException {
		int count = 0 ;
		String[] str_array=null;
		System.out.println("on give 1");
		//List<String> files = Files.readAllLines(Paths.get("Film_Locations_in_San_Francisco.csv"));
String fileName = DummyDB1.class.getResource("Film_Locations_in_San_Francisco.csv").getFile();
BufferedReader iofile = new BufferedReader(new FileReader(fileName));	
String str = null;
String finalstring=null;
while ((str=iofile.readLine())!=null)
{
	count++;
	System.out.println("Value of count ="+count);
	str_array = str.split(",");
	System.out.println(str_array[2]);
	finalstring+=str_array[2];
	finalstring+=",";
	
}


return finalstring;
	}
	public static String give2(String input) throws IOException {
		int count = 0 ;
		String[] str_array=null;
		System.out.println("on give 2");
		//List<String> files = Files.readAllLines(Paths.get("Film_Locations_in_San_Francisco.csv"));
String fileName = DummyDB1.class.getResource("Film_Locations_in_San_Francisco.csv").getFile();
BufferedReader iofile = new BufferedReader(new FileReader(fileName));	
String str = null;
String finalstring=null;
int i = 0;
while ((str=iofile.readLine())!=null)
{
	//count++;
	//System.out.println("Value of count ="+count);
	str_array = str.split(",");
	//System.out.println(str_array[2]);
	//finalstring+=str_array[2];
	if (input.equalsIgnoreCase(str_array[2]))
	{
		System.out.println("Match found");
		//System.out.println(str_array);
		for(i=0;i<10;i++)
		{
			switch(i)
			{
			case 0 : System.out.println("Title: ");break;
			case 1 : System.out.println("Release year: ");break;
			case 2 : System.out.println("Locations: ");break;
			case 3 : System.out.println("Fun Facts: ");break;
			case 4 : System.out.println("Production Company: ");break;
			case 5 : System.out.println("Distributor: ");break;
			case 6 : System.out.println("Director: ");break;
			case 7 : System.out.println("Writer: ");break;
			case 8 : System.out.println("Actor1: ");break;
			case 9 : System.out.println("Actor2: ");break;
			case 10 : System.out.println("Actor3: ");break;


			}
			finalstring+=str_array[i];
			System.out.println(str_array[i]);
			

		}finalstring+="||||||";
	}
	
}


return finalstring;
	}


}