package idv.trashchu.finance.entity;

import java.io.Serializable;

public class StockRecordPrimaryKey implements PrimaryKey, Serializable {

	private static final long serialVersionUID = -2058476511955531356L;
	
	private String today;//yyyyMMdd
	private String symbol;
	
	public StockRecordPrimaryKey(String today, String symbol) {
		super();
		this.today = today;
		this.symbol = symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		StockRecordPrimaryKey other = (StockRecordPrimaryKey) obj;
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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


}
