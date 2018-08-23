public class Humain extends VivantAPattes {

    private int nbMembresInferieurs;
    private String nom;
    private String surnom;
    private boolean enEmploi;

    public Humain(int nbMembresInferieurs, String nom, String surnom, boolean enEmploi, String espece, boolean aPattes, String nourriture) {

        super(espece, aPattes, nourriture);
        this.nbMembresInferieurs = nbMembresInferieurs;
        this.nom = nom;
        this.surnom = surnom;
        this.enEmploi = enEmploi;

    }

    @Override
    public void description() {
        super.description();
        System.out.println(" et je suis un humain");
    }

    public int getnbMembresInferieurs()
    {
        return nbMembresInferieurs;
    }
    public void getnom (String nom) {}

    public void getsurnom()
    {
    }

    public void getenEmploi()
    {
    }


}







