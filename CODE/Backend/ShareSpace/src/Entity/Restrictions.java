package Entity;

public class Restrictions {

	private boolean isAlcoholAllowed;
	private boolean isNonvegAllowed;
	
	public Restrictions() {
		super();
	}

	public Restrictions(boolean isAlcoholAllowed, boolean isNonvegAllowed) {
		super();
		this.isAlcoholAllowed = isAlcoholAllowed;
		this.isNonvegAllowed = isNonvegAllowed;
	}

	public boolean isAlcoholAllowed() {
		return isAlcoholAllowed;
	}

	public void setAlcoholAllowed(boolean isAlcoholAllowed) {
		this.isAlcoholAllowed = isAlcoholAllowed;
	}

	public boolean isNonvegAllowed() {
		return isNonvegAllowed;
	}

	public void setNonvegAllowed(boolean isNonvegAllowed) {
		this.isNonvegAllowed = isNonvegAllowed;
	}

	@Override
	public String toString() {
		return "Restrictions [isAlcoholAllowed=" + isAlcoholAllowed + ", isNonvegAllowed=" + isNonvegAllowed + "]";
	}
	
	
	
	
	
}
