package idv.trashchu.finance.entity;

import java.io.Serializable;

public class StockRecord implements TableEntity, Serializable {

	private static final long serialVersionUID = 8431746189061547682L;
	
	private String today;//yyyyMMdd
    private String symbol;
    private String name;
    private Long volume;
    private Long transaction;
    private Long value;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private String direction;
    private Double change;
    private Double lastBidPrice;
    private Long lastBidVolume;
    private Double lastAskPrice;
    private Long lastAskVolume;
    private Double per;
	
    public StockRecord() {
    	
    }
    
    public StockRecord(String today, String symbol, String name, Long volume,
			Long transaction, Long value, Double open, Double high, Double low,
			Double close, String direction, Double change, Double lastBidPrice,
			Long lastBidVolume, Double lastAskPrice, Long lastAskVolume,
			Double per) {
		super();
		this.today = today;
		this.symbol = symbol;
		this.name = name;
		this.volume = volume;
		this.transaction = transaction;
		this.value = value;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.direction = direction;
		this.change = change;
		this.lastBidPrice = lastBidPrice;
		this.lastBidVolume = lastBidVolume;
		this.lastAskPrice = lastAskPrice;
		this.lastAskVolume = lastAskVolume;
		this.per = per;
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
		StockRecord other = (StockRecord) obj;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Long getTransaction() {
		return transaction;
	}

	public void setTransaction(Long transaction) {
		this.transaction = transaction;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getClose() {
		return close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Double getChange() {
		return change;
	}

	public void setChange(Double change) {
		this.change = change;
	}

	public Double getLastBidPrice() {
		return lastBidPrice;
	}

	public void setLastBidPrice(Double lastBidPrice) {
		this.lastBidPrice = lastBidPrice;
	}

	public Long getLastBidVolume() {
		return lastBidVolume;
	}

	public void setLastBidVolume(Long lastBidVolume) {
		this.lastBidVolume = lastBidVolume;
	}

	public Double getLastAskPrice() {
		return lastAskPrice;
	}

	public void setLastAskPrice(Double lastAskPrice) {
		this.lastAskPrice = lastAskPrice;
	}

	public Long getLastAskVolume() {
		return lastAskVolume;
	}

	public void setLastAskVolume(Long lastAskVolume) {
		this.lastAskVolume = lastAskVolume;
	}

	public Double getPer() {
		return per;
	}

	public void setPer(Double per) {
		this.per = per;
	}



    
    
}
