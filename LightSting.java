/**
 *
 *
 * @author MAHDI
 * @version (31/01)
 */
public class LightSting
{
	// Atributs
	private int nbAmpoules;
	private Lightbulb [] tabLight;


    /**
     * Creates a LightString containing num Lightbulbs. All lightbulbs created are "White" and have a 1W 	power.
     *
     * @param num the number of lightbulbs created
     *
     */
	public LightSting(int nbAmpoules){
		this.nbAmpoules = nbAmpoules;
		this.tabLight = new Lightbulb[nbAmpoules];
		for(int i = 0; i< nbAmpoules; i++){
		tabLight[i] = new Lightbulb("white",1,"off");
		}
	}

	//Methods

    /**
     * Returns the i-th Lightbulb in the LightString. Returns null if i isn't a valid index.
     *
     * @param i the number of the lightbulb to be changed (first has number 1)
     *
     * @return the i-th Lightbulb in the LightString.
     */
	public Lightbulb getLight(int i){

	if (( 0<=i) && (i<tabLight.length))
		return tabLight[i];
	else
		return null;
	}

    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index..
     *
     * @param i the number of the lightbulb to be changed
     *
     * @param theBulb the new lightbulb
    */
     public void changeLight(int i, Lightbulb theBulb){

		if ( 0<=i && i<nbAmpoules)
			tabLight[i] = theBulb;

     }
     /**
     * Changes the state of all the light bulbs in the light string
     */
     public void pressSwitch(){
     String etat = "on";
		if (tabLight[0].getEtat() == etat)
			etat = "off";
		for(int i = 0; i< nbAmpoules; i++){
			tabLight[i].setEtat(etat);
		}
     }

    /**
     * Returns the total power consumed by the light string
     *
     * @return the total power consumed by the light string
     */
     public int getConsumedPower(){
     int power = 0;
		for(int i = 0; i< nbAmpoules; i++){
			power += tabLight[i].getPower();
		}
	return power;
     }


}
