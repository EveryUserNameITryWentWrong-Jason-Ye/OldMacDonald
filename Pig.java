class Pig implements Animal{     
  private String myType;     
  private String mySound;
  private String myName;
  
  public Pig(String type, String name, String sound){         
    myType = type;         
    mySound = sound;  
    myName = name;
   }  
     
  public Pig(){         
    myType = "unknown";         
    mySound = "unknown";  
    myName = "unknown";
   }      
     
  public String getSound(){
    return mySound;
   }  
       
  public String getType(){
    return myType;
   } 
   
  public String getName(){
    return myName;
   }
}