package com.company;

import java.io.*;
import java.util.Scanner;

public class editFile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String tempFileName = null;
		String newFilePath = null;
		String newFileName = null;
		File temporaryFile = null;
		Boolean doesExist = false;
		PrintWriter newOutputStream = null;
		Scanner inStream = null;
				
		System.out.println("Enter a new file path for a file in the format C:\\\\CS280 (use 4 \\)");
		String filePath = scan.nextLine();
		filePath = filePath.trim();
		
		System.out.println("Enter the input file name ");
		String inputFileName = scan.nextLine();
		
		String inputFilePathAndName = filePath + "\\" + inputFileName + ".txt";
		File inputFile = new File(inputFilePathAndName);
		
		try {
			
			System.out.println("Enter a new file name for a file ");
			
			newFileName = scan.nextLine();
			
			temporaryFile = new File(filePath + "\\" + newFileName + ".txt"); 
			
			inStream = new Scanner(new FileInputStream(inputFile));

			while(temporaryFile.exists()) {
				newFileName = newFileName + "_temporary";
				temporaryFile = new File(filePath + "\\" + newFileName + ".txt"); 
			}	

			
			} catch(FileNotFoundException f) {
				System.out.println("FileNotFoundException");
			}
		
			
		try 
		{
			newOutputStream = new PrintWriter(new FileOutputStream(temporaryFile));
			boolean notSpace = false;
			
			while(inStream.hasNextLine()) {
				String nextLine = inStream.nextLine().trim();
				nextLine = nextLine.replaceAll("\\s+", " ");
				while(notSpace = false) {
					if(!nextLine.equals(""))
						notSpace = false;
						nextLine.replaceAll("\\s+", " ");
					if(nextLine.equals("")) 
						notSpace = true;
						newOutputStream.println(nextLine);
				}
				

			}
			
			inStream.close();
			newOutputStream.close();
			inStream = new Scanner(new FileInputStream(inputFile));
			newOutputStream = new PrintWriter(new FileOutputStream(temporaryFile));

			while (inStream.hasNextLine()) {
				newOutputStream.println(inStream.nextLine());
			}
			
			System.out.println("Temporary file was written");
			inStream.close();
			newOutputStream.close();
			
			temporaryFile.delete();
			System.out.println("Temporary file was deleted");
			

		} 
		catch(FileNotFoundException f) 
		{
			System.out.print("FileNotFoundException");
			System.exit(0);
		}
		
		
	}

}
