package midterm;

public class Cake extends Job {
	
	public Cake(int cTime) {
		super(cTime);
	}
	
	public String getIngrediants() {
		return "sugar";
	}
	
	@Override
	public String toString() {
		return "Cake\n" + getThisOrderNum() + "\n" + getCookingTime();
	}
}
