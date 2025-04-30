public class CreateurAdapter implements  FormatPapier{

    public DVD dvd;

    public CreateurAdapter(DVD dvd) {
        this.dvd = dvd;
    }

    @Override
    public String getAuteurName(){
        return dvd.getRealisateur();
    };

    @Override
    public Integer getNombreDePages(){
        return dvd.getDuree();
    };
}
