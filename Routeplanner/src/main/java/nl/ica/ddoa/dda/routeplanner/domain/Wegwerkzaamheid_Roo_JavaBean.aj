// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package nl.ica.ddoa.dda.routeplanner.domain;

import java.util.Date;
import java.util.List;
import nl.ica.ddoa.dda.routeplanner.domain.Segment;
import nl.ica.ddoa.dda.routeplanner.domain.Wegwerkzaamheid;

privileged aspect Wegwerkzaamheid_Roo_JavaBean {
    
    public String Wegwerkzaamheid.getOmschrijving() {
        return this.omschrijving;
    }
    
    public void Wegwerkzaamheid.setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
    
    public int Wegwerkzaamheid.getVertraging() {
        return this.vertraging;
    }
    
    public void Wegwerkzaamheid.setVertraging(int vertraging) {
        this.vertraging = vertraging;
    }
    
    public Boolean Wegwerkzaamheid.getAfsluiting() {
        return this.afsluiting;
    }
    
    public void Wegwerkzaamheid.setAfsluiting(Boolean afsluiting) {
        this.afsluiting = afsluiting;
    }
    
    public List<Segment> Wegwerkzaamheid.getSegmenten() {
        return this.segmenten;
    }
    
    public void Wegwerkzaamheid.setSegmenten(List<Segment> segmenten) {
        this.segmenten = segmenten;
    }
    
    public Date Wegwerkzaamheid.getVanDatum() {
        return this.vanDatum;
    }
    
    public void Wegwerkzaamheid.setVanDatum(Date vanDatum) {
        this.vanDatum = vanDatum;
    }
    
    public Date Wegwerkzaamheid.getTotDatum() {
        return this.totDatum;
    }
    
    public void Wegwerkzaamheid.setTotDatum(Date totDatum) {
        this.totDatum = totDatum;
    }
    
}
