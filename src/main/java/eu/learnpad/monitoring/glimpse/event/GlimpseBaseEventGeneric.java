package eu.learnpad.monitoring.glimpse.event;

public class GlimpseBaseEventGeneric<T> extends GlimpseBaseEventAbstract<T> {

	private static final long serialVersionUID = 8661064245254655648L;
	private String extraDataField;
	
	public GlimpseBaseEventGeneric(T data, String probeID, Long timeStamp, String eventName,
			boolean isException, String extraDataField) {
		super(data, timeStamp, eventName, isException);
		this.extraDataField = extraDataField;
		}
	
	public String getExtraDataField() {
		return extraDataField;
	}
	
	public void setExtraDataField(String extraDataField) {
		this.extraDataField = extraDataField;
	}
}
