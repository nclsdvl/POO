public class Main {

    public static void main(String[] args) {

       Chat grosMinet = new Chat(3,"titi","croquettes", "felin", true );
       Chat minou = new Chat(3,"minou","whiskas", "felin", true );
       Chat grosChat = new Chat(6,"grosSac","tout", "felin", true );
       Chat petitChat = new Chat(3,"miniChat","poisson", "felin", true );
       Chat chatCannibal = new Chat(3,"Roar","petitChat", "felin", true );

        Humain joe = new Humain(2, "joe-joe", "joe", false, "humain", true, "big mac");
        Humain marie = new Humain(2, "marie", "rima", false, "humain", true, "big mac");
        Humain jack = new Humain(2, "bauer", "jack", true, "humain", true, "big mac");
        Humain rick = new Humain(0, "grimes", "Usain Bolt", false, "surHumain", true, "big mac");
        Humain sookie = new Humain(2, "sookie", "vampireAddict", false, "fée", true, "big mac");


        grosMinet.manger();
        grosMinet.boire();
        grosMinet.marcher();
        grosMinet.communiquer();
        System.out.println("");
        joe.description();


    }
}
