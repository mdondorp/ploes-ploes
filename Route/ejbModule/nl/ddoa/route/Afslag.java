/**
 * 
 */
package nl.ddoa.route;


/**
 * @author eddie
 *
 */
class Afslag {
	private Locatie locatie;

	public Afslag(){
		
	}
	
	public Afslag(Locatie locatie){
		this.locatie = locatie;
	}
	
	public Afslag(double breedtegraad, double lengtegraad){
		this.locatie = new Locatie();
		locatie.setBreedtegraad(breedtegraad);
		locatie.setLengtegraad(lengtegraad);
	}
	/* (non-Javadoc)
	 * @see nl.ddoa.route.IAfslag#getLocatie()
	 */

	public Locatie getLocatie() {
		return locatie;
	}


	public void setLocatie(Locatie locatie) {
		// TODO Auto-generated method stub
		
	}
	
}
