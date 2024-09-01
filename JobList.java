package midterm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class JobList {
	
	private ArrayList<Job> jobs = new ArrayList<>();
	
	public int getSize() {
		return jobs.size();
	}
	
	public Job getJob(int index) {
		return jobs.get(index);
	}
	
	public void addJob(Job aJob) {
		jobs.add(aJob);
	}
	
	public void removeJob(Job aJob) {
		jobs.remove(aJob);
	}
	
	public void saveToFile(String fileName) {
		String pathString = fileName + ".txt";

		try {
			File aFile = new File(pathString); 
			PrintWriter prtout = new PrintWriter(aFile);
			
			for(int i = 0; i < jobs.size(); i++) {
				prtout.println(jobs.get(i));
			}

			prtout.flush();
			prtout.close();

		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	@Override
	public String toString() {
		return "show job list";
	}

}
