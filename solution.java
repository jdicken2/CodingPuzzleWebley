import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class solution
{
	//Recursive method used to add all numbers from the data file
	static void combination_recursive(ArrayList <Double> list, double target, ArrayList <Double> partial)
	{
		double sum=0.0;
		for(double x: partial)
		{
		 	sum+=x;
		}
		if(sum==target)
		{
			System.out.println("combination("+Arrays.toString(partial.toArray())+")="+target);
		}
		if(sum>=target)
		{
			return;
		}
		for(int i=0;i<list.size();i++)
		{
			ArrayList<Double>remaining=new ArrayList<Double>();
			double index=list.get(i);
			for(int j=i+1; j<list.size();j++)
			{
				remaining.add(list.get(j));
				{
					ArrayList<Double> partial_rec=new ArrayList<Double>(partial);
					partial_rec.add(index);
					combination_recursive(remaining, target, partial_rec);
				}
			}
		}
	}

	//Method used to for the main function
	//Does not use partial list for simplicity
	static void combination(ArrayList<Double> list, double target)
	{
		combination_recursive(list, target, new ArrayList <Double>());
	}


	public static void main  (String [] args)
	{

		//Reads the file, and places prices in a list
		//Also places descriptions with prices
		ArrayList<Double> pricelist=new ArrayList<Double>();
		ArrayList<String> list=new ArrayList<String>();
		try
		{
			File ifile=new File ("data.csv");
			Scanner scanFile=new Scanner(ifile);
			while(scanFile.hasNextLine())
			{
				String line=scanFile.nextLine();
				StringTokenizer str=new StringTokenizer(line, ",");
				while(str.hasMoreTokens())
				{
					String description=str.nextToken();
					String sPrice=str.nextToken();
					String replacePrice=sPrice.replace("$", "");
					double price=Double.parseDouble(replacePrice);
					pricelist.add(price);
					list.add(description+sPrice);
				}
			}

		}
		catch (IOException ioe)
		{
			System.out.println("There is an error when attempting to read the file.");
		}
		//Remoces target price and calles combination function
		double target=pricelist.get(0);
		pricelist.remove(0);
		combination(pricelist,target);

		System.out.println("The target price was:" + " " + target);
	}
}	



