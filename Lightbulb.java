
/**
 * CLasse Lightbulb
 *
 * @author MAHDI
 * @version (06/02/2018)
 */
public class Lightbulb {
    public String color ;
    public int power ;
    public String etat ;

    public Lightbulb (String color , int power , String etat ){
        this.color=color;
        this.power=power;
        this.etat=etat ;
    }
    public String getColor(){
        return this.color;
    }
    public int getPower(){
        return this.power;
    }
    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String x){
        this.etat=x;
    }
    public String toString(){
        return "l'ampoule est de couleur "+this.color+" et sa puissance est "+this.power +" et son etat est "+this.etat;



    }




}
