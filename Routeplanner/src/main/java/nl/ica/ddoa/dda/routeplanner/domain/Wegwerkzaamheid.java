package nl.ica.ddoa.dda.routeplanner.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.json.RooJson;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.Date;

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
    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Segment> segmenten = new ArrayList<Segment>();

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date vanDatum;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date totDatum;
}
