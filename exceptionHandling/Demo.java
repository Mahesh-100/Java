package com.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args)  {
		
		try {
			String path="C:\\Users\\bharg\\Documents\\file1.doc";
			//createFile(path);
			//getInformation(path);
			//writeToFile(path);
			//readFile(path);
			deleteFile(path);
			int rs=division(25,5);
			System.out.println(rs);	
			int eve=Unknown(2);
			System.out.println(eve);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} 

	}
public static int division(int a,int b) {
	if(b==0) {
		throw new ArithmeticException("Cannot divide by Zero");
	}
	return a/b;
}
public static int Unknown(int a)  {
	if(a%2!=0) {
		throw new ArithmeticException("Please provide only Even number");
	}
	return a;
}
public static void createFile(String filepath) {
	File file=new File(filepath);
	try {
		if(file.createNewFile()) {
			System.out.println("File created successfully: "+file.getAbsolutePath());
		}else {
			System.out.println("File already exists.");
		}
	}catch(IOException e) {
		System.out.println("An error occured: "+e.getMessage());
		e.printStackTrace();
	}
}
public static void getInformation(String filepath) {
	File file=new File(filepath);
	if(file.exists()) {
		System.out.println("The name of the file: "+file.getName());
		System.out.println("The absolute path of the file:"+ file.getAbsolutePath());
		System.out.println("Is file writeable?"+file.canWrite());
		System.out.println("is file readable?"+file.canRead());
		System.out.println("The size of the file: "+file.length());
	}else {
		System.out.println("the file does not exist");
	}
}
public static void writeToFile(String filepath) throws IOException {
	FileWriter fw=new FileWriter(filepath);
	fw.write("you will be great one day....keep fighting....keep doing....");
	fw.close();
	System.out.println("Content added succesully");
}
public static void readFile(String filepath) {
	File file=new File(filepath);
	try {
		Scanner dataReader=new Scanner(file);
		while(dataReader.hasNext()) {
			String fileData=dataReader.nextLine();
			System.out.println(fileData);
		}
		dataReader.close();
	} catch (FileNotFoundException e) {
		System.out.println("File does not exist");
		e.printStackTrace();
	}
}
public static void deleteFile(String filepath) {
	File file=new File(filepath);
	if(file.delete()) {
		System.out.println("file deleted successfully...");
	}
	else {
		System.out.println("something went wrong");
	}
}
}
