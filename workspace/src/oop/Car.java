package oop;

public class Car {
   private String model;
   
   public void setModel(String model) {
	   String validModel = model.toLowerCase();
	   this.model = model;
   }
   
   public String getModel() {
	   return this.model;
   }
}
