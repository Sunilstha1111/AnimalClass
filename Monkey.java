
public class Monkey extends Animal {
    public Monkey(){
    	System.out.println("A monkey is born...");
    	
    }
@Override
public String sleep(){
	return "A monkey hardly sleeps..";
}
@Override 
public String eat(){
	return "A monkey eats...";
}
@Override
public String run(){
	return "A monkey run...";
			
}
public String jump(){
	return "A monkey jumps...";
}
}
