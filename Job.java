package midterm;

public abstract class Job {
	
	private static int orderNum = 0;
	private int thisOrderNum = 0;
	private int cookingTime = 0;
	private boolean finished = false;
	
	
	public Job(int cTime) {
		incrementOrderNum();
		setThisOrderNumber();
		setCookingTime(cTime);
		setFinished(false);
	}
	
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	public void setCookingTime(int newTime) {
		cookingTime = newTime;
	}
	
	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public static void incrementOrderNum() {
		orderNum++;
	}

	public static void setOrderNum(int orderNum) {
		Job.orderNum = orderNum;
	}

	public int getThisOrderNum() {
		return thisOrderNum;
	}

	public void setThisOrderNumber() {
		this.thisOrderNum = orderNum;
	}
	
	public void setThisOrderNumber(int num) {
		this.thisOrderNum = num;
	}

	@Override
	public abstract String toString(); 
	
}
