package nl.ddoa.route;

import javax.ejb.Stateless;
import javax.jws.WebService;



/**
 * Session Bean implementation class RouteEJB
 */
@Stateless
@WebService
public class RouteEJB implements RouteEJBLocal {

    /**
     * Default constructor. 
     */
    public RouteEJB() {
        // TODO Auto-generated constructor stub
    }

    
	@Override
	public Locatie getLocatie(double breedtegraad, double lengtegraad) {
		// TODO Auto-generated method stub
		Locatie locatie = new Locatie();
		locatie.setBreedtegraad(breedtegraad);
		locatie.setLengtegraad(lengtegraad);
		System.out.println("getLocatie");
		return locatie;
	}


	@Override
	public Afslag getAfslag(double breedtegraad, double lengtegraad) {
		// TODO Auto-generated method stub
		Afslag afslag = new Afslag(breedtegraad, lengtegraad);
		return afslag;
	}


	@Override
	public RouteSegment getRouteSegment() {
		// TODO Auto-generated method stub
		RouteSegment segment = new RouteSegment();
		segment.setAfstand(1000);
		segment.setDuur(1345);
		Afslag beginAfslag = getAfslag(10.21, 12.12);
		Afslag eindAfslag = getAfslag(10.24, 12.16);
		segment.setBeginAfslag(beginAfslag);
		segment.setEindAfslag(eindAfslag);
		Locatie locatie = new Locatie();
		locatie.setBreedtegraad(10.21);
		locatie.setLengtegraad(12.12);
		
		segment.setBeginPunt(locatie);
		Locatie eindlocatie = new Locatie();
		eindlocatie.setBreedtegraad(10.24);
		eindlocatie.setLengtegraad(12.16);
		segment.setEindPunt(eindlocatie);
		return segment;
	}


	@Override
	public Route getRoute(double beginBreedtegraad, double beginLengtegraad, double eindBreedtegraad, double eindLengtegraad) {
		Route route = new Route();
		Locatie beginpunt = new Locatie();
		beginpunt.setBreedtegraad(beginBreedtegraad);
		beginpunt.setLengtegraad(beginLengtegraad);
		
		Locatie eindpunt = new Locatie();
		eindpunt.setBreedtegraad(eindBreedtegraad);
		eindpunt.setLengtegraad(eindLengtegraad);
		return route.getRoute(beginpunt, eindpunt);
	}

}
