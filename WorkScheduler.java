package midterm;

public class WorkScheduler {
	
	
	public JobList processJobs(JobList workIn) {
		JobList jobList;
		jobList = workIn;  //this really needs to be a deep copy
		// do all things
		int OvenA = 20;
		int OvenB = 20;	
		int count = 0;
		// version using Oven class instead of variables
			while (OvenA + OvenB > 0 && count < jobList.getSize()) {
				if (OvenA >= OvenB) {
					if ((OvenA - jobList.getJob(count).getCookingTime()) < 0) {
						jobList.getJob(count).setCookingTime( jobList.getJob(count).getCookingTime() - OvenA );
						OvenA = 0;
					} else {
						OvenA = OvenA - jobList.getJob(count).getCookingTime();
						jobList.getJob(count).setCookingTime(0);
					}
				} else {
					if ((OvenB - jobList.getJob(count).getCookingTime()) < 0) {
						jobList.getJob(count).setCookingTime(jobList.getJob(count).getCookingTime() - OvenB);
						OvenB = 0;
					} else {
						OvenB = OvenB - jobList.getJob(count).getCookingTime();
						jobList.getJob(count).setCookingTime(0);
					}
				}
				
				
			count++;
		}
			
		return jobList;
	}

}
