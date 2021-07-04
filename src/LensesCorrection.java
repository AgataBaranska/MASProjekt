import java.util.ArrayList;
import java.util.List;

public class LensesCorrection {
private String correctionPowerRight;
private String correctionPowerLeft;
private List<ContactLenses> contactLensesList;
public LensesCorrection(String correctionPowerRight, String correctionPowerLeft) {
	super();
	this.correctionPowerRight = correctionPowerRight;
	this.correctionPowerLeft = correctionPowerLeft;
}

public void addContactLenses(ContactLenses contactLenses) {
	if(contactLensesList ==null) {
		contactLensesList = new ArrayList<ContactLenses>();
		contactLensesList.add(contactLenses);
	}else {
		contactLensesList.add(contactLenses);
	}
	
}


}
