class NamedSheep extends Sheep{
  protected String myName;

  
  public NamedSheep(String type, String name, String sound){
   
    myName = name;
    myType = type;
    mySound = sound;

  }
  
  public NamedSheep(){

     myName = "unknown";

  }
  
  public String getName(){
    return myName; 
  }
  
  
  
}