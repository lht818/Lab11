/** 
 * Name: Peter Tran
 * class: CS 2003
 * lab: Tuesday
 * lab11
 */
package lab11;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.Scanner;

public class PlayWfiles {	
	//   reader all the file in the folder
	public void listFiles(File f)
	{
		for (File input : f.listFiles())
		{
			if(input.isDirectory())
				listFiles(input);
			else
				System.out.println(input.getPath());
		}
	}
	/** this method check if there is any relevant file inside the folder and delete if it is found.
	 * 	Precondition: input the file and pattern 
	 *  Postconditon: return the newFolder with correct files
	 * 
	 */
	public File CorrectFiles(File folder, String pattern)
	{
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:s*"+pattern);
		File newFolder = null;
		for (Path input : folder.toPath()) 
		{
			if(matcher.matches(input)) 
				// add input into newFolder
			else// the path does not match , then delete the unmatch item.
			{
				
			}
			
		}
		return newFolder;
	}
	// determine whether the number of files is correct.
		public boolean CheckFile(File aa, int total)
		{
			int count  = 0;
			for( int i = 0; i< ; i++)
			{
				count++;
			 }
			 if(  count +1 == total )
				 	return true;
			 else
				    return false;
		    
		}
	public static void main(String[]args)
	{
		
		File folder1 = new File("C:\\Backup\\APOLLO");
		
		
		

		
	}		
}
