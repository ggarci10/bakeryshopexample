package midterm;

public class Pie extends Job {
	
	public Pie(int cTime) {
		super(cTime);
	}
	
	public String getIngrediants() {
		return "sugar + fruit";
	}
	
	@Override
	public String toString() {
		return "Pie\n" + getThisOrderNum() + "\n" + getCookingTime();
	}
}
