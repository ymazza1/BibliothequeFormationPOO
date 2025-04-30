public class Journal extends Document implements FormatPapier{

    private String titre;
    private Personne auteur;
    private Integer nombreDePagesSansPub;

    public Journal(String titre, Personne auteur, Integer nombreDePagesSansPub) {
        super(titre);
        this.auteur = auteur;
        this.nombreDePagesSansPub = nombreDePagesSansPub;
    }

    @Override
    public Integer getNombreDePages(){
        return nombreDePagesSansPub;
    }

    @Override
    public String getAuteurName(){
        return this.auteur.getPrenom() + " " + this.auteur.getNom();
    }

}
