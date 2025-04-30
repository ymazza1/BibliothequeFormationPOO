
public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("Plenel", "Edwy");
        Personne p2 = new Personne("Victor", "Hugo");
        Adherent adh1 = new Adherent("Mazza", "Yoann");
        Adherent adh2 = new Adherent("Jean", "Bon");

        Journal journal1 = new Journal("Mediapart #3762", p1, 28);
        Livre livre1 = new Livre("Les misérables", p2, 294);

        FormatPapier infosMedia = new Journal("Mediapart", p1, 28);
        infosMedia.getAuteurName();

        DVD dvd1 = new DVD("test fiml");
        FormatPapier infosDvd = new CreateurAdapter(dvd1);
        infosDvd.getAuteurName();

        Bibliotheque bibliotheque = new Bibliotheque();

        SystemeAlert alert = new SystemeAlert();

        bibliotheque.ajouterObserver(alert);

        Livre l1 = new Livre("Dictionnaire", p2, 130);
        bibliotheque.ajouterDocument(l1);
        System.out.println();





    }
}