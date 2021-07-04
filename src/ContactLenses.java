
public class ContactLenses {
private String brand;
private String name;
private String oxygenTransmission;
private WearingMode wearingMode;

private enum WearingMode{
	DAILY,
	MONTHLY
}

public ContactLenses(String brand, String name, String oxygenTransmission, ContactLenses.WearingMode wearingMode) {
	super();
	this.brand = brand;
	this.name = name;
	this.oxygenTransmission = oxygenTransmission;
	this.wearingMode = wearingMode;
}

public String getBrand() {
	return brand;
}

public String getName() {
	return name;
}

public String getOxygenTransmission() {
	return oxygenTransmission;
}

public WearingMode getWearingMode() {
	return wearingMode;
}




}
