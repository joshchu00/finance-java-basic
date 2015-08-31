package idv.trashchu.finance.entity;

import java.io.Serializable;

public class ChoosingStockStrategy implements TableEntity, Serializable {

	private static final long serialVersionUID = 5285587365704463787L;
	
	private Short cssid;
    private String name;
    private Boolean auto;
    private Short rfid;
    private String expression;
	
    public ChoosingStockStrategy() {
		
	}

	public ChoosingStockStrategy(Short cssid, String name, Boolean auto,
			Short rfid, String expression) {
		super();
		this.cssid = cssid;
		this.name = name;
		this.auto = auto;
		this.rfid = rfid;
		this.expression = expression;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cssid == null) ? 0 : cssid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChoosingStockStrategy other = (ChoosingStockStrategy) obj;
		if (cssid == null) {
			if (other.cssid != null)
				return false;
		} else if (!cssid.equals(other.cssid))
			return false;
		return true;
	}

	public Short getCssid() {
		return cssid;
	}

	public void setCssid(Short cssid) {
		this.cssid = cssid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAuto() {
		return auto;
	}

	public void setAuto(Boolean auto) {
		this.auto = auto;
	}

	public Short getRfid() {
		return rfid;
	}

	public void setRfid(Short rfid) {
		this.rfid = rfid;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
    
    
}
