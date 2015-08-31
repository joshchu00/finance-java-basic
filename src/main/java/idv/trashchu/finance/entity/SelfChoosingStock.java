package idv.trashchu.finance.entity;

import java.io.Serializable;

public class SelfChoosingStock implements TableEntity, Serializable {

	private static final long serialVersionUID = -3450226698715766178L;
	
	private String today;//yyyyMMdd
    private Short cssid;
    private String symbol;
    private String name;
    private String description;
    private Double cp5;
    private Double cp10;
    private Double cp20;
    private Double cp60;
    private Double cp120;
    private Double cp240;
	
	public SelfChoosingStock() {
		
	}

	public SelfChoosingStock(String today, Short cssid, String symbol,
			String name, String description, Double cp5, Double cp10,
			Double cp20, Double cp60, Double cp120, Double cp240) {
		super();
		this.today = today;
		this.cssid = cssid;
		this.symbol = symbol;
		this.name = name;
		this.description = description;
		this.cp5 = cp5;
		this.cp10 = cp10;
		this.cp20 = cp20;
		this.cp60 = cp60;
		this.cp120 = cp120;
		this.cp240 = cp240;
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
		SelfChoosingStock other = (SelfChoosingStock) obj;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getCp5() {
		return cp5;
	}

	public void setCp5(Double cp5) {
		this.cp5 = cp5;
	}

	public Double getCp10() {
		return cp10;
	}

	public void setCp10(Double cp10) {
		this.cp10 = cp10;
	}

	public Double getCp20() {
		return cp20;
	}

	public void setCp20(Double cp20) {
		this.cp20 = cp20;
	}

	public Double getCp60() {
		return cp60;
	}

	public void setCp60(Double cp60) {
		this.cp60 = cp60;
	}

	public Double getCp120() {
		return cp120;
	}

	public void setCp120(Double cp120) {
		this.cp120 = cp120;
	}

	public Double getCp240() {
		return cp240;
	}

	public void setCp240(Double cp240) {
		this.cp240 = cp240;
	}
	
	
}
