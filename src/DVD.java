public class DVD extends Document{

    private String realisateur;
    private Integer duree;

    public DVD(String titre){
        super(titre);
    }

    public String getRealisateur(){
        return realisateur;
    }
    public void setRealisateur(String realisateur){
        this.realisateur = realisateur;
    }

    public Integer getDuree(){
        return duree;
    }
    public void setDuree(Integer duree){
        this.duree = duree;
    }
}
