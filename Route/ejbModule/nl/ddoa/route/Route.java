/**
 * 
 */
package nl.ddoa.route;

import java.util.List;

/**
 * @author eddie
 *
 */
public class Route {
	
	private Locatie beginpunt;
	private Locatie eindpunt;

	/**
	 * default constructor
	 */
	public Route(){
		
	}


	public void setBeginPunt(Locatie beginPunt) {
		this.setBeginpunt(beginPunt);
		
	}

	public void setEindPunt(Locatie eindPunt) {
		this.setEindpunt(eindPunt);
		
	}


	public Route getRoute(Locatie beginpunt, Locatie eindpunt) {
		// TODO Auto-generated method stub
		Route route = new Route();
		route.setBeginPunt(beginpunt);
		route.setEindPunt(eindpunt);
		
		return route;
	}


	public List<IWerkzaamheid> getWerkzaamheden(List<RouteSegment> segmenten) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the beginpunt
	 */
	public Locatie getBeginpunt() {
		return beginpunt;
	}

	/**
	 * @param beginpunt the beginpunt to set
	 */
	public void setBeginpunt(Locatie beginpunt) {
		this.beginpunt = beginpunt;
	}

	/**
	 * @return the eindpunt
	 */
	public Locatie getEindpunt() {
		return eindpunt;
	}

	/**
	 * @param eindpunt the eindpunt to set
	 */
	public void setEindpunt(Locatie eindpunt) {
		this.eindpunt = eindpunt;
	}
}
