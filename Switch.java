
/**
 * classe switch.
 *
 * @author MAHDI
 * @version (06/02/2018)
 */
public class Switch
{

   // Atributs
   private Lightbulb bulb;
   private String on;


   public Switch(){
	}
   /**
     * Creates a switch and links it to the lightbulb passed as parameter
     *
     * @param bulb a lightbulb
     */
   public Switch(Lightbulb bulb){
        this.bulb= bulb;
        this.on = bulb.getEtat();
    }

    /**
     *  Returns true if the linked bulb is on, false otherwise
     *
     *  @return  true if the linked bulb is on, false otherwise
     */
    public String getState(){
        return this.on;
    }


    /**
     * Returns the lightbulb linked to this switch
     *
     * @return the lightbulb linked to this switch
     */
    public Lightbulb getLightbulb(){
        return this.bulb;
    }


    /**
     * Changes the lightbulb's state
     */
    public void press(){
        if(this.bulb.getEtat().equals("on")){
            this.getLightbulb().setEtat("off");
            this.on = "off";
        }
        else{
            this.getLightbulb().setEtat("on");
            this.on = "on";
        }


    }


    /**
     * Returns a string representing the switch
     *
     * @return a string representing the switch
     */
    public String toString(){
        return "The switch is "+ this.bulb.getEtat();
    }








}
