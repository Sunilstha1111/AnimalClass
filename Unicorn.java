
public class Unicorn extends Animal {
     public Unicorn(){
    	 System.out.println("A Unicorn is found...");
     }
@Override
public String eat(){
	return "A Unicorn eats...";
	
}
@Override
public String sleep(){
	return "A Unicorn sleeps soundly..."; 
}
@Override
public String run(){
	return "A Unicorn runs fast...";
			
}
public String horn(){
	return "A Unicorn has horn...";
}
}

