
public class Dog extends Animal {
	public Dog(){
		
	
System.out.println("A dog is born...");
  }
	
@Override
public String sleep(){
	return "A dog sleeps soundly...";
			
}
@Override 
public String eat(){
	return "A dog eats..";
}
@Override
public String run(){
	return "A dog runs fast..";
	
}
}