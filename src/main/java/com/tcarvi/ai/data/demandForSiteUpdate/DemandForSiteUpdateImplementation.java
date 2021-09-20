package com.tcarvi.ai.data.demandForSiteUpdate;

public class DemandForSiteUpdateImplementation implements DemandForSiteUpdateInterface {
  
    public void person_name() {
  
      System.out.println("My name is Lucy.");
  
    }
  
    public void age() {
  
      System.out.println("I am 22 years old.");
  
    }
  
    public void array() {
  
      int[] arr = new int[2];
  
      arr[0] = 10;
  
      arr[1] = 20;
  
      for (int i = 0; i <= arr.length; i++)
  
        System.out.println(arr[i]);
  
    }
  
}