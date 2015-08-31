package idv.trashchu.finance.entity;

import java.io.Serializable;

public class IncomeStatementPrimaryKey implements PrimaryKey, Serializable {

	private static final long serialVersionUID = 3372967754318031086L;
	
	private String season;//yyyySS
    private String symbol;

	public IncomeStatementPrimaryKey(String season, String symbol) {
		super();
		this.season = season;
		this.symbol = symbol;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
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
		IncomeStatementPrimaryKey other = (IncomeStatementPrimaryKey) obj;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


}
