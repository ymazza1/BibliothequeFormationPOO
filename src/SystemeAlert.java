public class SystemeAlert implements BibliothequeObserver {
    @Override
    public void notifierNouveauDocument(Document doc) {
        System.out.println("Nouveau document!" + doc.getTitle());
    }
}
