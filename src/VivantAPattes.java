

public abstract class VivantAPattes {
    private String nourriture;
    private String espece;
    private boolean aPattes = true;

    public VivantAPattes(String espece, boolean aPattes, String nourriture){

        this.nourriture = nourriture;
        this.espece = espece;
        this.aPattes = aPattes;

    }


    //---METHODES---//

    public void manger()
    {
        System.out.println( "Miam");
    }
    public void boire() {
        System.out.println("gloup gloup");
    }
    public void marcher() {
            System.out.println("pas a pas");

    }
    public void communiquer() {

        System.out.println("hello!!!");
    }
    public void description() {

        System.out.print("je suis un etre vivant");
    }

    //--GETTERS--//

    public void getnourriture(){}
    public void getespecec(){}
    public void getaPattes(){}
}
