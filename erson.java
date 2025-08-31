    abstract class GamingConsole {
        private final String brand;  //Encapsulation//

    public GamingConsole(String brand) {
        this.brand = brand;
    }

    public String getBrand() {  //Encapsulation//
        return brand;
    }

    //Abstract method (Abstraction + Polymorphism)//
    public abstract void playExclusive();
}

//Inheritance + Polymorphism//
class Xbox extends GamingConsole {
    public Xbox() { super("Xbox"); }
     @Override
    public void playExclusive() {
        System.out.println("Playing Halo on " + getBrand());
    }
}

class PlayStation extends GamingConsole {
    public PlayStation() { super("PlayStation"); }
     @Override
    public void playExclusive() {
        System.out.println("Playing God of War on " + getBrand());
    }
}

public class erson {
    public static void main(String[] args) {

GamingConsole[] consoles = { new Xbox(), new PlayStation()};

        for (GamingConsole c : consoles) {
            c.playExclusive();  //Polymorphism in action//
        }
        
    }
}
