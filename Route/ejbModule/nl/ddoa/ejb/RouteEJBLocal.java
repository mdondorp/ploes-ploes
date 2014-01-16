package nl.ddoa.ejb;

import java.util.ArrayList;

import javax.ejb.Local;

import nl.ddoa.route.Route;
import nl.ddoa.route.RouteSegment;




@Local
public interface RouteEJBLocal {

	Route getRoute(double beginBreedtegraad, double beginLengtegraad,
			double eindBreedtegraad, double eindLengtegraad);
	ArrayList<RouteSegment> getSegmenten();
}


