import java.util.List;

public class AppointmentCart {
private int idNumber;
private List<GlassesCorrection> glassesCorrection;
private List<LensesCorrection> lensesCorrection;
private String interview;
private String recommendations;

public static int idCounter = 0;

public AppointmentCart(String interview, String recommendations) {
	super();
	this.interview = interview;
	this.recommendations = recommendations;
	idNumber = generateIdNumber();
}

public int generateIdNumber() {
	return ++idCounter;
}



}
