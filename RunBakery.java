package midterm;

import java.util.ArrayList;

public class RunBakery {

	public static void main(String[] args) {				

		// ----- do input phase -----
		UserInputInterface ui = new UserInputInterface();
		ui.runCreateJobList();
		
		ui.runTestCreateJobList();
		
		
		
		JobList workOrder = ui.getWorkList();

		System.out.println(workOrder); // debug output

		
		
		// ----- do processing phase ----- (cook all cakes)
		WorkScheduler runJobs = new WorkScheduler();	
		JobList jobList = runJobs.processJobs(workOrder);	
		
		
		 // debug output
		System.out.println("finished processing jobs"); 
		System.out.print("jobList:  ");
		System.out.println(jobList);
	
		
		
		// ----- do output phase -----	
		JobList finishedJobs = new JobList();
		
		//adds to finishedJobList
		for (int i = 0; i < jobList.getSize(); i++) {
			if (jobList.getJob(i).getCookingTime() == 0) {
				finishedJobs.addJob(jobList.getJob(i));
			}
		}
		// save a file with finishedJobs info in it
		finishedJobs.saveToFile("finishedJobs");
				
		// removes done items from jobList 
		for (int i = 0; i < finishedJobs.getSize(); i++) {
			jobList.removeJob(finishedJobs.getJob(i));
		}
		// now save as a file to start next day joblist
		jobList.saveToFile("workOrder");
		
		
		System.out.print("jobList:  ");
		System.out.println(jobList);
		
	}
}
