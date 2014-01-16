package nl.ddoa.route;

import java.util.ArrayList;

public class RouteFacade {

	ArrayList<Locatie> locaties = new ArrayList<Locatie>(){/**
		 * 
		 */
		private static final long serialVersionUID = 2304055110570668814L;

	{
		add(new Locatie(10.98, -10.243234));
		add(new Locatie(10.45, -10.244));
		add(new Locatie(10.23, -10.4234));
		add(new Locatie(10.43, -10.4234));
		add(new Locatie(10.34242, -10.1424));
		add(new Locatie(10.423426, -10.142432));
		add(new Locatie(10.3242, -10.424242342));
	}};
	
	ArrayList<Afslag> afslagen = new ArrayList<Afslag>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 6900387679132749262L;


	{
		add(new Afslag(locaties.get(0)));
		add(new Afslag(locaties.get(1)));
		add(new Afslag(locaties.get(2)));
		add(new Afslag(locaties.get(3)));
		add(new Afslag(locaties.get(4)));
		add(new Afslag(locaties.get(5)));
		add(new Afslag(locaties.get(6)));
	}};
	
	ArrayList<RouteSegment> wegSegmenten = new ArrayList<RouteSegment>(){/**
		 * 
		 */
		private static final long serialVersionUID = -4426898119127852130L;

	{
		add(new RouteSegment());
		add(new RouteSegment());
		add(new RouteSegment());
		add(new RouteSegment());
		add(new RouteSegment());
	}};
	
	public RouteFacade(){
		((RouteSegment) wegSegmenten.get(0)).setDuur(30);
		((RouteSegment) wegSegmenten.get(0)).setAfstand(1345);
		((RouteSegment) wegSegmenten.get(0)).setBeginPunt(((Locatie)locaties.get(0)));
		((RouteSegment) wegSegmenten.get(0)).setEindPunt(((Locatie)locaties.get(1)));
		((RouteSegment) wegSegmenten.get(0)).setBeginAfslag((Afslag)afslagen.get(0));
		((RouteSegment) wegSegmenten.get(0)).setEindAfslag((Afslag)afslagen.get(1));
		
		((RouteSegment) wegSegmenten.get(1)).setDuur(13);
		((RouteSegment) wegSegmenten.get(1)).setAfstand(145);
		((RouteSegment) wegSegmenten.get(1)).setBeginPunt(((Locatie)locaties.get(1)));
		((RouteSegment) wegSegmenten.get(1)).setEindPunt(((Locatie)locaties.get(2)));
		((RouteSegment) wegSegmenten.get(1)).setBeginAfslag((Afslag)afslagen.get(1));
		((RouteSegment) wegSegmenten.get(1)).setEindAfslag((Afslag)afslagen.get(2));
		
		((RouteSegment) wegSegmenten.get(2)).setDuur(45);
		((RouteSegment) wegSegmenten.get(2)).setAfstand(1452);
		((RouteSegment) wegSegmenten.get(2)).setBeginPunt(((Locatie)locaties.get(2)));
		((RouteSegment) wegSegmenten.get(2)).setEindPunt(((Locatie)locaties.get(3)));
		((RouteSegment) wegSegmenten.get(2)).setBeginAfslag((Afslag)afslagen.get(2));
		((RouteSegment) wegSegmenten.get(2)).setEindAfslag((Afslag)afslagen.get(3));
		
		((RouteSegment) wegSegmenten.get(3)).setDuur(78);
		((RouteSegment) wegSegmenten.get(3)).setAfstand(1243);
		((RouteSegment) wegSegmenten.get(3)).setBeginPunt(((Locatie)locaties.get(3)));
		((RouteSegment) wegSegmenten.get(3)).setEindPunt(((Locatie)locaties.get(4)));
		((RouteSegment) wegSegmenten.get(3)).setBeginAfslag((Afslag)afslagen.get(3));
		((RouteSegment) wegSegmenten.get(3)).setEindAfslag((Afslag)afslagen.get(4));
		
		((RouteSegment) wegSegmenten.get(4)).setDuur(78);
		((RouteSegment) wegSegmenten.get(4)).setAfstand(1243);
		((RouteSegment) wegSegmenten.get(4)).setBeginPunt(((Locatie)locaties.get(4)));
		((RouteSegment) wegSegmenten.get(4)).setEindPunt(((Locatie)locaties.get(5)));
		((RouteSegment) wegSegmenten.get(4)).setBeginAfslag((Afslag)afslagen.get(4));
		((RouteSegment) wegSegmenten.get(4)).setEindAfslag((Afslag)afslagen.get(5));
	}
			
	public Route bepaalRoute(double beginBreedtegraad, double beginLengtegraad, double eindBreedtegraad, double eindLengtegraad){
		Route route = new Route();
		route.setBeginEnEindPunt(beginBreedtegraad, beginLengtegraad, eindBreedtegraad, eindLengtegraad);
		route.setWegSegmenten((ArrayList<RouteSegment>)wegSegmenten);
		return route;
	}
	
	public ArrayList<RouteSegment> vekrijgRouteSegmenten(){
		return wegSegmenten;
	}
}
