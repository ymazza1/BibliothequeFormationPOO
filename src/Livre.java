public class Livre extends Document implements FormatPapier {

    private Integer nombreDePages;
    private Personne auteur;

    public Livre(String title, Personne Auteur, Integer nombreDePages) {
        super(title);
        this.auteur = Auteur;
        this.nombreDePages = nombreDePages;
    }

    @Override
    public Integer getNombreDePages() {
        return this.nombreDePages;
    }

    @Override
    public String getAuteurName(){
        return this.auteur.getPrenom() + " " + this.auteur.getNom();
    }
}
