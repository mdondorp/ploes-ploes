package nl.ddoa.route;

import javax.ejb.Local;



@Local
public interface RouteEJBLocal {
	Locatie getLocatie(double breedtegraad, double lengtegraad);
	Afslag getAfslag(double breedtegraad, double lengtegraad);
	RouteSegment getRouteSegment();
	
	Route getRoute(double beginBreedtegraad, double beginLengtegraad,
			double eindBreedtegraad, double eindLengtegraad);
}


