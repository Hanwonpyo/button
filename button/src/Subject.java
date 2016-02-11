
import java.util.Vector;

public interface Subject {
	
	Vector buttonList = new Vector();
	
	public void add(Observer observer);
	public void delete(Observer observer);
	public void notifyObserver(int n);
}
