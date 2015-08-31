package idv.trashchu.finance.entity;

import java.io.Serializable;

public class IncomeStatement implements TableEntity, Serializable {

	private static final long serialVersionUID = -6395449264547205161L;
	
	private String season;//yyyySS
    private String symbol;
    private String name;
    private Double eps;
    
    public IncomeStatement() {
    	
    }
    
	public IncomeStatement(String season, String symbol, String name, Double eps) {
		super();
		this.season = season;
		this.symbol = symbol;
		this.name = name;
		this.eps = eps;
	}

	/*public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}

		if(!(obj instanceof IncomeStatement)) {
			return false;
		}

		IncomeStatement is = (IncomeStatement) obj;
		return new EqualsBuilder()
					.append(this.symbol, is.getSymbol())
					.append(this.season, is.getSeason())
					.isEquals();
    }*/

	/*public int hashCode() {
		return new HashCodeBuilder()
					.append(this.symbol)
					.append(this.season)
					.toHashCode();
	}*/

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
		IncomeStatement other = (IncomeStatement) obj;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getEps() {
		return eps;
	}
	public void setEps(Double eps) {
		this.eps = eps;
	}
    
	
	
	
	
	
}
