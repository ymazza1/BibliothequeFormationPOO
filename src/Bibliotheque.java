import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Document> documents = new ArrayList<>();
    private List<BibliothequeObserver> observers = new ArrayList<>();

    public void ajouterObserver(BibliothequeObserver observer) {
        observers.add(observer);
    }
    public void retirerObserver(BibliothequeObserver observer) {
        observers.remove(observer);
    }

    private void notifierObservers(Document document) {
        for (BibliothequeObserver observer : observers) {
            observer.notifierNouveauDocument(document);
        }
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
        notifierObservers(document);
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
