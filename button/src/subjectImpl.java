

public class subjectImpl implements Subject {

	@Override
	public void add(Observer observer) {
		buttonList.add(observer);
	}
	@Override
	public void delete(Observer observer) {
		buttonList.remove(observer);
	}

	@Override
	public void notifyObserver(int n) {	
		
		for (int i = 0; i < buttonList.size(); i++) {
			Observer o= (Observer) buttonList.elementAt(i);
			o.control(n);
		}
	}
	
	
}
