package main;

public class SpeedCalculate {
	private int r=3;
	private double t=60.0;
	int speed1=1;
	int speed2=10;
	int speed3=20;
	int speed4=40;
//	private double mass ;
//	void setMass(double m) {
//		mass=m;
//	}
	public int calculateSpeed(double mass) {
		// TODO Auto-generated method stub
		int speed;
		double v=Math.sqrt((t*r)/mass);
		if(v>=speed4) {
			speed=speed4;
		}else if(v>=speed3) {
			speed=speed3;
		}else if(v>=speed2) {
			speed=speed2;
		}else if(v>=speed1) {
			speed=speed1;
		}
		else {
			speed=0;
		}
		return speed;
	}
	
}
