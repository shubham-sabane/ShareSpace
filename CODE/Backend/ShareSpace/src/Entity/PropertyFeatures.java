package Entity;

public class PropertyFeatures {
	
	private Restrictions restriction;
	private boolean security;
	private FurnishingStatus status;
	
	
	public PropertyFeatures() {
		super();
	}


	public PropertyFeatures(Restrictions restriction, boolean security, FurnishingStatus status) {
		super();
		this.restriction = restriction;
		this.security = security;
		this.status = status;
	}


	public Restrictions getRestriction() {
		return restriction;
	}


	public void setRestriction(Restrictions restriction) {
		this.restriction = restriction;
	}


	public boolean isSecurity() {
		return security;
	}


	public void setSecurity(boolean security) {
		this.security = security;
	}


	public FurnishingStatus getStatus() {
		return status;
	}


	public void setStatus(FurnishingStatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "PropertyFeatures [restriction=" + restriction + ", security=" + security + ", status=" + status + "]";
	}
	
	

}
