package org;

public class DataSet {
	
	private double distance;
	private double time;
	private double speed;
	
	public DataSet() {
		super();
	}

	public DataSet(double distance, double time) {
		super();
		this.distance = distance;
		this.time = time;
	}
	
	
	public DataSet(double distance, double time, double speed) {
		super();
		this.distance = distance;
		this.time = time;
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "DataSet [distance=" + distance + ", time=" + time + ", speed=" + speed + "]";
	}

}
