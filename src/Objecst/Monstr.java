package Objecst;

public class Monstr {
	
	int eyes;
	int legs;
	int hands;
	
	Monstr(){
		eyes = 2;
		legs = 2;
		hands = 2;
	}
	
	Monstr(int eyes){
		this.eyes = eyes;
		legs = 2;
		hands = 2;
	}
	
	Monstr(int eyes, int legs){
		this.eyes = eyes;
		this.legs = legs;
		hands = 2;
	}
	
	Monstr(int eyes, int legs, int hands){
		this.eyes = eyes;
		this.legs = legs;
		this.hands = hands;
	}
	
	void voice() {
		System.out.println("Голос");
	}
	
	void voice(int i) {
		for(int k = 0; k<i; k++) {
			System.out.println("Голос");
		}
	}
	
	void voice(int i, String word) {
		for(int m = 0; m<i; m++) {
			System.out.println(word);
		}
	}

}


//
//Создать клас Монстр, с 3-мя полями типа int (количество глаз, ног, рук). Создать 4 конструктора (пустой, с 1 -им параметром, 2-мя и 3-мя).
//Если в параметрах конструктора не устанавливается какое-то значение, то установить его равным 2.
//Создать методы void voice(), который выводит на экран слово "Голос".
//void voice(int i), выводит слово голос i раз
//void voice(int i, String word), выводит слово word i раз