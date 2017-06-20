package com.formation.cap;

public class Developpeur implements Post {

	private int grade;
	
	

	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public void afficher() {
		System.out.println("Devloppeur");
	}

}
