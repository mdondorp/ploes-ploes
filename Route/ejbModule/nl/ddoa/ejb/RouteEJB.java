package nl.ddoa.ejb;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.jws.WebService;

import nl.ddoa.route.Route;
import nl.ddoa.route.RouteFacade;
import nl.ddoa.route.RouteSegment;





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
	public Route getRoute(double beginBreedtegraad, double beginLengtegraad, double eindBreedtegraad, double eindLengtegraad) {
		return new RouteFacade().bepaalRoute(beginBreedtegraad, beginLengtegraad, eindBreedtegraad, eindLengtegraad);
	}


	@Override
	public ArrayList<RouteSegment> getSegmenten() {
		// TODO Auto-generated method stub
		return new RouteFacade().vekrijgRouteSegmenten();
	}

}
