package idv.trashchu.finance.entity;

import java.io.Serializable;

public class TechnicalAnalysisPrimaryKey implements PrimaryKey, Serializable {

	private static final long serialVersionUID = -3758138174512721680L;

	private String today;//yyyyMMdd
    private String symbol;
	
    public TechnicalAnalysisPrimaryKey(String today, String symbol) {
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
		TechnicalAnalysisPrimaryKey other = (TechnicalAnalysisPrimaryKey) obj;
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

	
    
	/*@Override
	public String getSQL(String database) {
		
		String result = "";
		
		if (database.equals(DatabaseUtil.HIBERNATE)) {
			result =	"FROM TechnicalAnalysis " +
		    			"WHERE symbol = '" + this.symbol + "' AND today = '" + this.today + "'";
		}
		else if (database.equals(DatabaseUtil.PUREJDBC)){
			result =	"SELECT * " + 
						"FROM `technicalanalyses` " +
						"WHERE `symbol` = '" + this.symbol + "' AND `today` = '" + this.today + "'";
		}
		else {
			;
		}
		
		return result;
	}*/

}
