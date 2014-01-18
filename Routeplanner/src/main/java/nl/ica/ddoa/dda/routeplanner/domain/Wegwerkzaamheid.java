package nl.ica.ddoa.dda.routeplanner.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.json.RooJson;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

@RooJavaBean
@RooToString
@RooJson(deepSerialize = true)
@RooJpaActiveRecord(finders = { "findWegwerkzaamheidsBySegmenten" })
public class Wegwerkzaamheid {

    /**
     */
    private String omschrijving;

    /**
     */
    private int vertraging;

    /**
     */
    private Boolean afsluiting;

    //TODO create association with WerkzaamhedenFacade.
    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Calendar vanDatum;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Calendar totDatum;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Segment> segmenten = new ArrayList<Segment>();
}
