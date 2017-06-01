
public class Fish extends Animal {
	public Fish(){
		System.out.println("A Fish is hatched...");
	}
	
@Override
public String sleep(){
	return "A Fish sleeps soundly...";
}
@Override 
public String eat(){
	return "A Fish eats...";
}
@Override
public String run(){
	return "A Fish swims...";
	
}

}
