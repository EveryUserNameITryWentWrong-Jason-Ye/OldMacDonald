  class Farm{     
    private Animal[] aBunchOfAnimals = new Animal[3];    
    public Farm(){       
       aBunchOfAnimals[0] = new NamedSheep("sheep", "Boss Sheep.", "baaaad");          
       aBunchOfAnimals[1] = new Chicken("chicken", "Marc.", "cluck");
       aBunchOfAnimals[2] = new Pig("pig", "Napolean.", "oink");    
    }     
    
    public void animalSounds(){
      for (int nI=0; nI < aBunchOfAnimals.length; nI++){             
         System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound() );       
      }
      
      System.out.println( "The sheep is known as " + ((NamedSheep)aBunchOfAnimals[0]).getName() ); 
      System.out.println( "The chicken is known as " + ((Chicken)aBunchOfAnimals[1]).getName() );
      System.out.println( "The pig is known as " + ((Pig)aBunchOfAnimals[2]).getName() );
      
      //System.out.println( "The sheep is known as " + ((NamedSheep)aBunchOfAnimals[0]).getName() );
    } 
}