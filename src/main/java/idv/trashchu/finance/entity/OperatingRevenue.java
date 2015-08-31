package idv.trashchu.finance.entity;

import java.io.Serializable;

public class OperatingRevenue implements TableEntity, Serializable {

	private static final long serialVersionUID = -649593031369735646L;
	
	private String month;//yyyyMM
    private String symbol;
    private String name;
    private Long currentMonthRevenues;
    private Long precedingMonthRevenues;
    private Long precedingYearRevenues;
    private Double mom;
    private Double yoy;
    private Long cumulativeCurrentYearRevenues;
    private Long cumulativePrecedingYearRevenues;
    private Double cyoy;
    
    public OperatingRevenue() {
    	
    }

	public OperatingRevenue(String month, String symbol, String name,
			Long currentMonthRevenues, Long precedingMonthRevenues,
			Long precedingYearRevenues, Double mom, Double yoy,
			Long cumulativeCurrentYearRevenues,
			Long cumulativePrecedingYearRevenues, Double cyoy) {
		super();
		this.month = month;
		this.symbol = symbol;
		this.name = name;
		this.currentMonthRevenues = currentMonthRevenues;
		this.precedingMonthRevenues = precedingMonthRevenues;
		this.precedingYearRevenues = precedingYearRevenues;
		this.mom = mom;
		this.yoy = yoy;
		this.cumulativeCurrentYearRevenues = cumulativeCurrentYearRevenues;
		this.cumulativePrecedingYearRevenues = cumulativePrecedingYearRevenues;
		this.cyoy = cyoy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
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
		OperatingRevenue other = (OperatingRevenue) obj;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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

	public Long getCurrentMonthRevenues() {
		return currentMonthRevenues;
	}

	public void setCurrentMonthRevenues(Long currentMonthRevenues) {
		this.currentMonthRevenues = currentMonthRevenues;
	}

	public Long getPrecedingMonthRevenues() {
		return precedingMonthRevenues;
	}

	public void setPrecedingMonthRevenues(Long precedingMonthRevenues) {
		this.precedingMonthRevenues = precedingMonthRevenues;
	}

	public Long getPrecedingYearRevenues() {
		return precedingYearRevenues;
	}

	public void setPrecedingYearRevenues(Long precedingYearRevenues) {
		this.precedingYearRevenues = precedingYearRevenues;
	}

	public Double getMom() {
		return mom;
	}

	public void setMom(Double mom) {
		this.mom = mom;
	}

	public Double getYoy() {
		return yoy;
	}

	public void setYoy(Double yoy) {
		this.yoy = yoy;
	}

	public Long getCumulativeCurrentYearRevenues() {
		return cumulativeCurrentYearRevenues;
	}

	public void setCumulativeCurrentYearRevenues(Long cumulativeCurrentYearRevenues) {
		this.cumulativeCurrentYearRevenues = cumulativeCurrentYearRevenues;
	}

	public Long getCumulativePrecedingYearRevenues() {
		return cumulativePrecedingYearRevenues;
	}

	public void setCumulativePrecedingYearRevenues(
			Long cumulativePrecedingYearRevenues) {
		this.cumulativePrecedingYearRevenues = cumulativePrecedingYearRevenues;
	}

	public Double getCyoy() {
		return cyoy;
	}

	public void setCyoy(Double cyoy) {
		this.cyoy = cyoy;
	}
    
    
}
