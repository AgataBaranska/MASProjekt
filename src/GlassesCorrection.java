
public class GlassesCorrection {
	private String correctionPowerRight;
	private String correctionPowerLeft;
	private CorrectionPurpose purpose;

	private enum CorrectionPurpose {
		FOR_DISTANCE, FOR_READING
	}
	
	public GlassesCorrection(String correctionPowerRight, String correctionPowerLeft,GlassesCorrection.CorrectionPurpose purpose) {
		super();
		this.correctionPowerRight = correctionPowerRight;
		this.purpose = purpose;
	}

	public String getCorrectionPowerRight() {
		return correctionPowerRight;
	}
	public String getCorrectionPowerLeft() {
		return correctionPowerLeft;
	}

	public CorrectionPurpose getPurpose() {
		return purpose;
	};

	
	
}
