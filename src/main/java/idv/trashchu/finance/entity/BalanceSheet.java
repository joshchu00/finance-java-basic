package idv.trashchu.finance.entity;

import java.io.Serializable;

public class BalanceSheet implements TableEntity, Serializable {

	private static final long serialVersionUID = 6474852485132246196L;
	
	private String season;//yyyySS
    private String symbol;
    private String name;
    private Long currentAssets;
    private Long longTermInvestments;
    private Long fixedAssets;
    private Long intangibleAssets;
    private Long otherAssets;
    private Long totalAssets;
    private Long currentLiabilities;
    private Long longTermLiabilities;
    private Long reserves;
    private Long otherLiabilities;
    private Long totalLiabilities;
    private Long capital;
    private Long capitalSurplus;
    private Long retainedEarnings;
    private Long equityAdjustments;
    private Long treasuryStock;
    private Long stockholdersEquity;
    private Double bookValuePerShare;
    private Long proceedsNewIssue;
    private Long totalTreasuryStock;
    
    public BalanceSheet() {
    	
    }

	public BalanceSheet(String season, String symbol, String name,
			Long currentAssets, Long longTermInvestments, Long fixedAssets,
			Long intangibleAssets, Long otherAssets, Long totalAssets,
			Long currentLiabilities, Long longTermLiabilities, Long reserves,
			Long otherLiabilities, Long totalLiabilities, Long capital,
			Long capitalSurplus, Long retainedEarnings, Long equityAdjustments,
			Long treasuryStock, Long stockholdersEquity,
			Double bookValuePerShare, Long proceedsNewIssue,
			Long totalTreasuryStock) {
		super();
		this.season = season;
		this.symbol = symbol;
		this.name = name;
		this.currentAssets = currentAssets;
		this.longTermInvestments = longTermInvestments;
		this.fixedAssets = fixedAssets;
		this.intangibleAssets = intangibleAssets;
		this.otherAssets = otherAssets;
		this.totalAssets = totalAssets;
		this.currentLiabilities = currentLiabilities;
		this.longTermLiabilities = longTermLiabilities;
		this.reserves = reserves;
		this.otherLiabilities = otherLiabilities;
		this.totalLiabilities = totalLiabilities;
		this.capital = capital;
		this.capitalSurplus = capitalSurplus;
		this.retainedEarnings = retainedEarnings;
		this.equityAdjustments = equityAdjustments;
		this.treasuryStock = treasuryStock;
		this.stockholdersEquity = stockholdersEquity;
		this.bookValuePerShare = bookValuePerShare;
		this.proceedsNewIssue = proceedsNewIssue;
		this.totalTreasuryStock = totalTreasuryStock;
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
		BalanceSheet other = (BalanceSheet) obj;
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

	public Long getCurrentAssets() {
		return currentAssets;
	}

	public void setCurrentAssets(Long currentAssets) {
		this.currentAssets = currentAssets;
	}

	public Long getLongTermInvestments() {
		return longTermInvestments;
	}

	public void setLongTermInvestments(Long longTermInvestments) {
		this.longTermInvestments = longTermInvestments;
	}

	public Long getFixedAssets() {
		return fixedAssets;
	}

	public void setFixedAssets(Long fixedAssets) {
		this.fixedAssets = fixedAssets;
	}

	public Long getIntangibleAssets() {
		return intangibleAssets;
	}

	public void setIntangibleAssets(Long intangibleAssets) {
		this.intangibleAssets = intangibleAssets;
	}

	public Long getOtherAssets() {
		return otherAssets;
	}

	public void setOtherAssets(Long otherAssets) {
		this.otherAssets = otherAssets;
	}

	public Long getTotalAssets() {
		return totalAssets;
	}

	public void setTotalAssets(Long totalAssets) {
		this.totalAssets = totalAssets;
	}

	public Long getCurrentLiabilities() {
		return currentLiabilities;
	}

	public void setCurrentLiabilities(Long currentLiabilities) {
		this.currentLiabilities = currentLiabilities;
	}

	public Long getLongTermLiabilities() {
		return longTermLiabilities;
	}

	public void setLongTermLiabilities(Long longTermLiabilities) {
		this.longTermLiabilities = longTermLiabilities;
	}

	public Long getReserves() {
		return reserves;
	}

	public void setReserves(Long reserves) {
		this.reserves = reserves;
	}

	public Long getOtherLiabilities() {
		return otherLiabilities;
	}

	public void setOtherLiabilities(Long otherLiabilities) {
		this.otherLiabilities = otherLiabilities;
	}

	public Long getTotalLiabilities() {
		return totalLiabilities;
	}

	public void setTotalLiabilities(Long totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	public Long getCapitalSurplus() {
		return capitalSurplus;
	}

	public void setCapitalSurplus(Long capitalSurplus) {
		this.capitalSurplus = capitalSurplus;
	}

	public Long getRetainedEarnings() {
		return retainedEarnings;
	}

	public void setRetainedEarnings(Long retainedEarnings) {
		this.retainedEarnings = retainedEarnings;
	}

	public Long getEquityAdjustments() {
		return equityAdjustments;
	}

	public void setEquityAdjustments(Long equityAdjustments) {
		this.equityAdjustments = equityAdjustments;
	}

	public Long getTreasuryStock() {
		return treasuryStock;
	}

	public void setTreasuryStock(Long treasuryStock) {
		this.treasuryStock = treasuryStock;
	}

	public Long getStockholdersEquity() {
		return stockholdersEquity;
	}

	public void setStockholdersEquity(Long stockholdersEquity) {
		this.stockholdersEquity = stockholdersEquity;
	}

	public Double getBookValuePerShare() {
		return bookValuePerShare;
	}

	public void setBookValuePerShare(Double bookValuePerShare) {
		this.bookValuePerShare = bookValuePerShare;
	}

	public Long getProceedsNewIssue() {
		return proceedsNewIssue;
	}

	public void setProceedsNewIssue(Long proceedsNewIssue) {
		this.proceedsNewIssue = proceedsNewIssue;
	}

	public Long getTotalTreasuryStock() {
		return totalTreasuryStock;
	}

	public void setTotalTreasuryStock(Long totalTreasuryStock) {
		this.totalTreasuryStock = totalTreasuryStock;
	}
    
    
}
