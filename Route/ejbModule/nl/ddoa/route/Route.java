/**
 * 
 */
package nl.ddoa.route;


import java.util.ArrayList;

import javax.ejb.Stateless;

/**
 * @author eddie
 *
 */

@Stateless
public class Route  {
	
	private Locatie beginpunt;
	private Locatie eindpunt;
	private ArrayList<RouteSegment> wegSegmenten = new ArrayList<RouteSegment>();

	/**
	 * default constructor
	 */
	public Route(){
		
	}

	
	

	/* (non-Javadoc)
	 * @see nl.ddoa.route.IRoute#setBeginPunt(nl.ddoa.route.Locatie)
	 */
	public void setBeginPunt(Locatie beginPunt) {
		this.setBeginpunt(beginPunt);
		
	}
	
	public void setBeginEnEindPunt(double beginBreedtegraad, double beginLengtegraad, double eindBreedtegraad, double eindLengtegraad){
		Locatie beginLocatie = new Locatie();
		beginLocatie.setBreedtegraad(beginBreedtegraad);
		beginLocatie.setLengtegraad(beginLengtegraad);
		
		this.setBeginpunt(beginLocatie);
		
		Locatie eindLocatie = new Locatie();
		eindLocatie.setBreedtegraad(eindBreedtegraad);
		eindLocatie.setLengtegraad(eindLengtegraad);
		this.setEindPunt(eindLocatie);
	}
	
	/* (non-Javadoc)
	 * @see nl.ddoa.route.IRoute#setEindPunt(nl.ddoa.route.Locatie)
	 */

	public void setEindPunt(Locatie eindPunt) {
		this.setEindpunt(eindPunt);
		
	}


	/* (non-Javadoc)
	 * @see nl.ddoa.route.IRoute#getRoute(nl.ddoa.route.Locatie, nl.ddoa.route.Locatie)
	 */

	public Route getRoute(Locatie beginpunt, Locatie eindpunt) {
		// TODO Auto-generated method stub
		Route route = new Route();
		route.setBeginPunt(beginpunt);
		route.setEindPunt(eindpunt);
		
		return route;
	}


	/* (non-Javadoc)
	 * @see nl.ddoa.route.IRoute#getBeginpunt()
	 */

	public Locatie getBeginpunt() {
		return beginpunt;
	}


	public void setBeginpunt(Locatie beginpunt) {
		this.beginpunt = beginpunt;
	}

	public Locatie getEindpunt() {
		return eindpunt;
	}


	public void setEindpunt(Locatie eindpunt) {
		this.eindpunt = eindpunt;
	}




	public ArrayList<RouteSegment> getWegSegmenten() {
		return wegSegmenten;
	}




	public void setWegSegmenten(ArrayList<RouteSegment> wegSegmenten) {
		this.wegSegmenten = wegSegmenten;
	}
}
