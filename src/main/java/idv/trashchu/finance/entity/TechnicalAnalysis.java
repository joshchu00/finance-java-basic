package idv.trashchu.finance.entity;

import java.io.Serializable;

public class TechnicalAnalysis implements TableEntity, Serializable {

	private static final long serialVersionUID = 9119289454023005243L;

	private String today;//yyyyMMdd
    private String symbol;
    private String name;
    private Double suma5;
    private Double ma5;
    private Double bias5;
    private Double sumv5;
    private Double mv5;
    private Double suma10;
    private Double ma10;
    private Double bias10;
    private Double sumv10;
    private Double mv10;
    private Double suma20;
    private Double ma20;
    private Double bias20;
    private Double sumv20;
    private Double mv20;
    private Double suma30;
    private Double ma30;
    private Double bias30;
    private Double sumv30;
    private Double mv30;
    private Double suma60;
    private Double ma60;
    private Double bias60;
    private Double sumv60;
    private Double mv60;
    private Double k9;
    private Double d9;
    private Double ema12;
    private Double ema26;
    private Double dif;
    private Double dem9;
    private Double dsm9;
    
    public TechnicalAnalysis() {
    	
    }

	public TechnicalAnalysis(String today, String symbol, String name,
			Double suma5, Double ma5, Double bias5, Double sumv5, Double mv5,
			Double suma10, Double ma10, Double bias10, Double sumv10,
			Double mv10, Double suma20, Double ma20, Double bias20,
			Double sumv20, Double mv20, Double suma30, Double ma30,
			Double bias30, Double sumv30, Double mv30, Double suma60,
			Double ma60, Double bias60, Double sumv60, Double mv60, Double k9,
			Double d9, Double ema12, Double ema26, Double dif, Double dem9,
			Double dsm9) {
		super();
		this.today = today;
		this.symbol = symbol;
		this.name = name;
		this.suma5 = suma5;
		this.ma5 = ma5;
		this.bias5 = bias5;
		this.sumv5 = sumv5;
		this.mv5 = mv5;
		this.suma10 = suma10;
		this.ma10 = ma10;
		this.bias10 = bias10;
		this.sumv10 = sumv10;
		this.mv10 = mv10;
		this.suma20 = suma20;
		this.ma20 = ma20;
		this.bias20 = bias20;
		this.sumv20 = sumv20;
		this.mv20 = mv20;
		this.suma30 = suma30;
		this.ma30 = ma30;
		this.bias30 = bias30;
		this.sumv30 = sumv30;
		this.mv30 = mv30;
		this.suma60 = suma60;
		this.ma60 = ma60;
		this.bias60 = bias60;
		this.sumv60 = sumv60;
		this.mv60 = mv60;
		this.k9 = k9;
		this.d9 = d9;
		this.ema12 = ema12;
		this.ema26 = ema26;
		this.dif = dif;
		this.dem9 = dem9;
		this.dsm9 = dsm9;
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
		TechnicalAnalysis other = (TechnicalAnalysis) obj;
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

	public Double getSuma5() {
		return suma5;
	}

	public void setSuma5(Double suma5) {
		this.suma5 = suma5;
	}

	public Double getMa5() {
		return ma5;
	}

	public void setMa5(Double ma5) {
		this.ma5 = ma5;
	}

	public Double getBias5() {
		return bias5;
	}

	public void setBias5(Double bias5) {
		this.bias5 = bias5;
	}

	public Double getSumv5() {
		return sumv5;
	}

	public void setSumv5(Double sumv5) {
		this.sumv5 = sumv5;
	}

	public Double getMv5() {
		return mv5;
	}

	public void setMv5(Double mv5) {
		this.mv5 = mv5;
	}

	public Double getSuma10() {
		return suma10;
	}

	public void setSuma10(Double suma10) {
		this.suma10 = suma10;
	}

	public Double getMa10() {
		return ma10;
	}

	public void setMa10(Double ma10) {
		this.ma10 = ma10;
	}

	public Double getBias10() {
		return bias10;
	}

	public void setBias10(Double bias10) {
		this.bias10 = bias10;
	}

	public Double getSumv10() {
		return sumv10;
	}

	public void setSumv10(Double sumv10) {
		this.sumv10 = sumv10;
	}

	public Double getMv10() {
		return mv10;
	}

	public void setMv10(Double mv10) {
		this.mv10 = mv10;
	}

	public Double getSuma20() {
		return suma20;
	}

	public void setSuma20(Double suma20) {
		this.suma20 = suma20;
	}

	public Double getMa20() {
		return ma20;
	}

	public void setMa20(Double ma20) {
		this.ma20 = ma20;
	}

	public Double getBias20() {
		return bias20;
	}

	public void setBias20(Double bias20) {
		this.bias20 = bias20;
	}

	public Double getSumv20() {
		return sumv20;
	}

	public void setSumv20(Double sumv20) {
		this.sumv20 = sumv20;
	}

	public Double getMv20() {
		return mv20;
	}

	public void setMv20(Double mv20) {
		this.mv20 = mv20;
	}

	public Double getSuma30() {
		return suma30;
	}

	public void setSuma30(Double suma30) {
		this.suma30 = suma30;
	}

	public Double getMa30() {
		return ma30;
	}

	public void setMa30(Double ma30) {
		this.ma30 = ma30;
	}

	public Double getBias30() {
		return bias30;
	}

	public void setBias30(Double bias30) {
		this.bias30 = bias30;
	}

	public Double getSumv30() {
		return sumv30;
	}

	public void setSumv30(Double sumv30) {
		this.sumv30 = sumv30;
	}

	public Double getMv30() {
		return mv30;
	}

	public void setMv30(Double mv30) {
		this.mv30 = mv30;
	}

	public Double getSuma60() {
		return suma60;
	}

	public void setSuma60(Double suma60) {
		this.suma60 = suma60;
	}

	public Double getMa60() {
		return ma60;
	}

	public void setMa60(Double ma60) {
		this.ma60 = ma60;
	}

	public Double getBias60() {
		return bias60;
	}

	public void setBias60(Double bias60) {
		this.bias60 = bias60;
	}

	public Double getSumv60() {
		return sumv60;
	}

	public void setSumv60(Double sumv60) {
		this.sumv60 = sumv60;
	}

	public Double getMv60() {
		return mv60;
	}

	public void setMv60(Double mv60) {
		this.mv60 = mv60;
	}

	public Double getK9() {
		return k9;
	}

	public void setK9(Double k9) {
		this.k9 = k9;
	}

	public Double getD9() {
		return d9;
	}

	public void setD9(Double d9) {
		this.d9 = d9;
	}

	public Double getEma12() {
		return ema12;
	}

	public void setEma12(Double ema12) {
		this.ema12 = ema12;
	}

	public Double getEma26() {
		return ema26;
	}

	public void setEma26(Double ema26) {
		this.ema26 = ema26;
	}

	public Double getDif() {
		return dif;
	}

	public void setDif(Double dif) {
		this.dif = dif;
	}

	public Double getDem9() {
		return dem9;
	}

	public void setDem9(Double dem9) {
		this.dem9 = dem9;
	}

	public Double getDsm9() {
		return dsm9;
	}

	public void setDsm9(Double dsm9) {
		this.dsm9 = dsm9;
	}

    
    
}
