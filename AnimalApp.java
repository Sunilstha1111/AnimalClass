
public class AnimalApp {
       public static void main (String[] args){
    	   
    	   Animal a = new Animal();
    	   print(a.eat());
    	   print(a.sleep());
    	   print(a.run());
    	   
    	   
    	   Dog d = new Dog();
    	   print(d.eat());
    	   print(d.sleep());
    	   print(d.run());
    	   
    	   Fish f = new Fish();
    	   print(f.eat());
    	   print(f.sleep());
    	   print(f.run());
    	   
    	   Monkey m = new Monkey();
    	   print(m.eat());
    	   print(m.run());
    	   print(m.sleep());
    	   print(m.jump());
    	   
    	   SaberToothTiger t = new SaberToothTiger();
    	   print(t.eat());
    	   print(t.sleep());
    	   
    	   Unicorn u = new Unicorn();
    	   print(u.eat());
    	   print(u.run());
    	   print(u.sleep());
    	   print(u.horn());
       }
       public static void print(String s){
    	   System.out.println(s);
    	   
       }
}


