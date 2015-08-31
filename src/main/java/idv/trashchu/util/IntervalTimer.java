package idv.trashchu.util;

public class IntervalTimer {

	private long startTime;
	private long endTime;
	
	public IntervalTimer() {
		this.startTime = 0;
		this.endTime = 0;
	}

	public long getStartTime() {
		return startTime;
	}
	
	public void setStartTime() {
		this.startTime = System.currentTimeMillis();
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime() {
		this.endTime = System.currentTimeMillis();
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	
	public long getInterval() {
		return this.endTime - this.startTime;
	}
	
	
}
