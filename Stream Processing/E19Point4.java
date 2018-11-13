package PRACTICEExERCISES;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E19Point4 {
	 public static void main(String[] args) throws IOException
	   {
		   
		   Scanner input = new Scanner(new File("F:\\JAVA\\StreamProcessing\\src\\PRACTICEExERCISES\\InputFile.txt"));
		   List<String> wordList = new ArrayList<>();
		   while (input.hasNext()) { wordList.add(input.next()); }
		  
		   for(String w : wordList)
		   {
			   if(w.length()<=4)
			   {
				   System.out.println(w);
			   }
		   }
}
}