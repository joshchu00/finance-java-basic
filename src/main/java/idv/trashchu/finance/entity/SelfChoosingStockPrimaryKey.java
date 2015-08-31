package idv.trashchu.finance.entity;

import java.io.Serializable;

public class SelfChoosingStockPrimaryKey implements PrimaryKey, Serializable {

	private static final long serialVersionUID = 5315648996825724784L;
	
	private String today;//yyyyMMdd
    private Short cssid;
    private String symbol;
    
	public SelfChoosingStockPrimaryKey(String today, Short cssid, String symbol) {
		super();
		this.today = today;
		this.cssid = cssid;
		this.symbol = symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cssid == null) ? 0 : cssid.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((today == null) ? 0 : today.hashCode());
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
		SelfChoosingStockPrimaryKey other = (SelfChoosingStockPrimaryKey) obj;
		if (cssid == null) {
			if (other.cssid != null)
				return false;
		} else if (!cssid.equals(other.cssid))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (today == null) {
			if (other.today != null)
				return false;
		} else if (!today.equals(other.today))
			return false;
		return true;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public Short getCssid() {
		return cssid;
	}

	public void setCssid(Short cssid) {
		this.cssid = cssid;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
    
    
}
