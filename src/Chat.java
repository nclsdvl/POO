public class Chat extends VivantAPattes {

    int nbPattes;
    String surnom;



    public Chat(int nbPattes, String surnom, String nourriture, String espece, boolean aPattes) {
        super(espece, aPattes, nourriture);

        this.nbPattes = nbPattes;
        this.surnom = surnom;
    }

    public void getnbPattes(){}
    public void getSurnom(){}
}
