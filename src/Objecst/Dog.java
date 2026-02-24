package Objecst;

public class Dog {
	String nickname;
	String breed;
	int speed;
	
	void run() {
		for (int i = 0; i < speed; i++) {
		    System.out.print("бегу, ");
		}
	}
	String information() {
		String information = nickname + ":" + " " + breed + ", " + "бігає зі швидкістью " + speed + "км/год";
		return information;
	}
}
