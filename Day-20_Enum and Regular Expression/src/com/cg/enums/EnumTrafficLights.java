package com.cg.enums;

enum TrafficLight
{
	Red(30),Yellow(10),Green(20);
	private final int seconds;

	private TrafficLight(int seconds) {
		this.seconds = seconds;
	}

	public int getSeconds() {
		return seconds;
	}
	
}

public class EnumTrafficLights {

	public static void main(String[] args) {
		for(TrafficLight i:TrafficLight.values())
		{
			System.out.printf("%s: %d seconds\n",i,i.getSeconds());
		}

	}

}
