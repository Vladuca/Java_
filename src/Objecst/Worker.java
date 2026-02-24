package Objecst;

public class Worker {
 String name;
 String job_title;
 int salary;
 int month;
 
 Worker (String name, String job_title, int salary){
	 this.name = name;
	 this.job_title = job_title;
	 this.salary = salary;
 }
 
 String info(int month) {
	 this.month = month;
	 String info = "имя: "+ this.name + "\n" + "зарплата " + "за " + this.month + " месяц" + ": " + this.month * this.salary + " $";
	 return info;
 }
}

