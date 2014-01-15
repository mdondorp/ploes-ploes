/**
 * 
 */
package nl.ddoa.route;

/**
 * @author eddie
 *
 */
public class RouteSegment  {

		private Locatie beginPunt;
		private Locatie eindPunt;
		private int duur; //tijd die nodig is om over route te rijden
		private int afstand; // afstand segment in meters.
		private Afslag beginAfslag;
		private Afslag eindAfslag;
		
		
		/**
		 * default contstructor
		 */
		public RouteSegment(){ 
			
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getEindAfslag()
		 */

		public Afslag getEindAfslag() {
			return eindAfslag;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#setEindAfslag(nl.ddoa.route.IAfslag)
		 */

		public void setEindAfslag(Afslag eindAfslag) {
			this.eindAfslag = eindAfslag;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getBeginAfslag()
		 */

		public Afslag getBeginAfslag() {
			return beginAfslag;
		}


		public void setBeginAfslag(Afslag beginAfslag) {
			this.beginAfslag = beginAfslag;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getAfstand()
		 */

		public int getAfstand() {
			return afstand;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#setAfstand(int)
		 */

		public void setAfstand(int afstand) {
			this.afstand = afstand;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getDuur()
		 */

		public int getDuur() {
			return duur;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#setDuur(int)
		 */

		public void setDuur(int duur) {
			this.duur = duur;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getEindPunt()
		 */

		public Locatie getEindPunt() {
			return eindPunt;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#setEindPunt(nl.ddoa.route.ILocatie)
		 */

		public void setEindPunt(Locatie eindPunt) {
			this.eindPunt = eindPunt;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#getBeginPunt()
		 */

		public Locatie getBeginPunt() {
			return beginPunt;
		}


		/* (non-Javadoc)
		 * @see nl.ddoa.route.IRouteSegment#setBeginPunt(nl.ddoa.route.ILocatie)
		 */

		public void setBeginPunt(Locatie beginPunt) {
			this.beginPunt = beginPunt;
		}
}
