package com.prowings.enums;

enum TrafficSignal {
	
    RED("Stop"), GREEN("Go"), YELLOW("Slow Down");

    private String action;

    TrafficSignal(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

public class TraficSignal {
	
    public static void main(String[] args) {
    	
        TrafficSignal currentSignal = TrafficSignal.GREEN;
        
        System.out.println("Current signal is : "+ currentSignal);
        
        System.out.println("You need to " + currentSignal.getAction() +" now !!");
        
    }
}