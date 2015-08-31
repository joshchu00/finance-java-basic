package idv.trashchu.finance.entity;

import java.io.Serializable;

public class ChoosingStockStrategyPrimaryKey implements PrimaryKey, Serializable {

	private static final long serialVersionUID = 9116422318993950917L;
	
	private Short cssid;

	public ChoosingStockStrategyPrimaryKey(Short cssid) {
		super();
		this.cssid = cssid;
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
		ChoosingStockStrategyPrimaryKey other = (ChoosingStockStrategyPrimaryKey) obj;
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
	
	
}
