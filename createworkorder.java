package midterm;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
public class createworkorder {
	 public static void main(String[] args) {
	String workorder = " ";
	int problems;
	File myfile1 = new File("demoFiles/Workorder.txt");
    Scanner next = new Scanner(System.in);
    System.out.println(myfile1.exists());
	try {
	myfile1.createNewFile();
		FileWriter fw1 = new FileWriter(myfile1);
		BufferedWriter bwriter = new BufferedWriter(fw1);
		System.out.println("enter number of problems");
		problems = next.nextInt();
		
		workorder = next.nextLine();
		
		
		
		bwriter.write(workorder);
		bwriter.flush();
		bwriter.close();
		System.out.println("end");
		
	}catch(Exception x) {
		System.out.println(x);
	}
	
	
}

	}
