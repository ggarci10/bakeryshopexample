package midterm;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInputInterface {

	JobList listOfJobs = new JobList();
	//JobList listOfJobsX = new JobList();

	// TODO load list from workOrder.txt file

	// add new jobs to the listOfJobs
	// this is hardcoded process - TODO replace with actual UI

	public void runCreateJobList() {
		// gets list of previous day unfinished jobs
		String pathString = "workOrder.txt";
		ArrayList<String> workInput = new ArrayList<>();

		try {
			File aFile = new File(pathString);
			Scanner myScan = new Scanner(aFile);
			String tempText = "";

			//System.out.println("entering scan loop");
			while(myScan.hasNext()) {
				
				String lineInput = myScan.nextLine();
				
				//System.out.println("lineInput " + lineInput);
				
				if(lineInput.equals("Cake")){
					//System.out.println("inside cake test");
					int newTime = myScan.nextInt();
					myScan.nextLine();
					int newOrderNumber = myScan.nextInt();
					myScan.nextLine();
					Cake tempCake = new Cake(newTime);
					tempCake.setOrderNum(newOrderNumber);
					//System.out.println(tempCake);
					listOfJobs.addJob(tempCake);
				} else if(lineInput.equals("Pie")) {
					int newTime = myScan.nextInt();
					myScan.nextLine();
					int newOrderNumber = myScan.nextInt();
					myScan.nextLine();
					Pie tempPie = new Pie(newTime);
					tempPie.setOrderNum(newOrderNumber);
					listOfJobs.addJob(tempPie);
				} else {
					throw new Exception("bad file format");
				}
				//System.out.println("bottom of loop");
			}
			
			myScan.close();

		} catch (Exception x) {
			// if it breaks catch and print out what went wrong
			System.out.println(x);
		}

		System.out.println("-----------");
		
		for (int i = 0; i < listOfJobs.getSize(); i++) {
			System.out.println(listOfJobs.getJob(i));
		}
		
		System.out.println("-----------");
		
		// add that to the top of listOfJobs
		// add any additonal jobs for the day

	}

	public void runTestCreateJobList() {
		// manually making a list of the cake jobs that need to be baked

		Cake c01 = new Cake(6);
		Cake c02 = new Cake(4);
		Cake c03 = new Cake(7);
		Cake c04 = new Cake(5);
		Pie c05 = new Pie(8);
		Cake c06 = new Cake(10);
		Cake c07 = new Cake(13);
		Cake c08 = new Cake(9);
		Pie c09 = new Pie(7);
		Cake c10 = new Cake(11);
		Cake c11 = new Cake(3);
		Cake c12 = new Cake(7);

		// adding all the cake jobs to the job list
		listOfJobs.addJob(c01);
		listOfJobs.addJob(c02);
		listOfJobs.addJob(c03);
		listOfJobs.addJob(c04);
		listOfJobs.addJob(c05);
		listOfJobs.addJob(c06);
		listOfJobs.addJob(c07);
		listOfJobs.addJob(c08);
		listOfJobs.addJob(c09);
		listOfJobs.addJob(c10);
		listOfJobs.addJob(c11);
		listOfJobs.addJob(c12);
	}

	// getWorkList()
	public JobList getWorkList() {
		// probably be better to return a clone of jobList
		return listOfJobs;
	}

}
