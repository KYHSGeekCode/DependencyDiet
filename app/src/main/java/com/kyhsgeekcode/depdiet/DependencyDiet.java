package com.kyhsgeekcode.depdiet;

import java.io.*;
import java.util.*;

public class DependencyDiet
{
	private List<Exception> exceptions=new ArrayList<Exception>();
	public List<File> getDependencies(File file)
	{
		
	}
	public List<File> getDependencies(File file,FileType type)
	{
		
	}
	private List<File> getDepdndenciesJava(File file)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null)
			{
				String [] words=line.split(" ");
			}
		}catch(IOException e)
		{
			exceptions.add(e);
		}
	}
	private List<File> getDependenciesC(File file)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null)
			{
				
			}
		}catch(IOException e)
		{
			exceptions.add(e);
		}
	}
	public enum FileType
	{
		C,
		HEADER,
		JAVA,
	};
}
