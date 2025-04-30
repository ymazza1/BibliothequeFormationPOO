import java.util.Date;

public class Adherent extends Personne{
    private Date dateAdhesion;
    private Document documementEmprunte;


    public Adherent(String nom, String prenom){
        super(nom, prenom);
        this.dateAdhesion = new Date();
    }

    public void emprunter(Document document){
        this.documementEmprunte = document;
    }

    public String getDateAdhesion(){
        return dateAdhesion.toString();
    }

    public String getDocumementEmprunte(){
        return documementEmprunte.getTitle();
    }
}
