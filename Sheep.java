class Sheep implements Animal{     
  protected String myType;     
  protected String mySound;      
  
  public Sheep(String type, String sound){         
    myType = type;         
    mySound = sound;     
   }  
     
  public Sheep(){         
    myType = "Sheep";         
    mySound = "unknown";     
   }      
     
  public String getSound(){
    return mySound;
   }  
       
  public String getType(){
    return myType;
   } 
}