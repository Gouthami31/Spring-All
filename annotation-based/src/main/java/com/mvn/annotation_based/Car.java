package com.mvn.annotation_based;

public class Car {
      private Model model;
      public Car(Model model) {                 //parameter constructor
    		this.model=model;
    		System.out.println("constructor");
      }
      public Car() {                            //default constructor
    	  
      }
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
		System.out.println("setter");
	}
	public void carstarted() {
		if(model!=null) {
			model.carstart();
		}
		else
			System.out.println("not started");
	}
      
}
