package nl.ddoa.route;

/**
 * @author eddie
 *
 */
class Locatie {
	private double breedtegraad;
	private double lengtegraad;
	
	
	public Locatie(){
		
	}
	
	public Locatie(double breedtegraad, double lengtegraad){
		this.breedtegraad = breedtegraad;
		this.lengtegraad = lengtegraad;
	}
	
	/* (non-Javadoc)
	 * @see nl.ddoa.route.ILocatie#getBreedtegraad()
	 */
	public double getBreedtegraad() {
		return breedtegraad;
	}
	/* (non-Javadoc)
	 * @see nl.ddoa.route.ILocatie#setBreedtegraad(double)
	 */
	public void setBreedtegraad(double breedtegraad) {
		this.breedtegraad = breedtegraad;
	}
	/* (non-Javadoc)
	 * @see nl.ddoa.route.ILocatie#getLengtegraad()
	 */
	public double getLengtegraad() {
		return lengtegraad;
	}
	/* (non-Javadoc)
	 * @see nl.ddoa.route.ILocatie#setLengtegraad(double)
	 */
	public void setLengtegraad(double lengtegraad) {
		this.lengtegraad = lengtegraad;
	}
}
