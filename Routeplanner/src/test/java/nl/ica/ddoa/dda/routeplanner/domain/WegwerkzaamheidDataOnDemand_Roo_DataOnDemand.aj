// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package nl.ica.ddoa.dda.routeplanner.domain;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import nl.ica.ddoa.dda.routeplanner.domain.Wegwerkzaamheid;
import nl.ica.ddoa.dda.routeplanner.domain.WegwerkzaamheidDataOnDemand;
import org.springframework.stereotype.Component;

privileged aspect WegwerkzaamheidDataOnDemand_Roo_DataOnDemand {
    
    declare @type: WegwerkzaamheidDataOnDemand: @Component;
    
    private Random WegwerkzaamheidDataOnDemand.rnd = new SecureRandom();
    
    private List<Wegwerkzaamheid> WegwerkzaamheidDataOnDemand.data;
    
    public Wegwerkzaamheid WegwerkzaamheidDataOnDemand.getNewTransientWegwerkzaamheid(int index) {
        Wegwerkzaamheid obj = new Wegwerkzaamheid();
        setAfsluiting(obj, index);
        setOmschrijving(obj, index);
        setTotDatum(obj, index);
        setVanDatum(obj, index);
        setVertraging(obj, index);
        return obj;
    }
    
    public void WegwerkzaamheidDataOnDemand.setAfsluiting(Wegwerkzaamheid obj, int index) {
        Boolean afsluiting = Boolean.TRUE;
        obj.setAfsluiting(afsluiting);
    }
    
    public void WegwerkzaamheidDataOnDemand.setOmschrijving(Wegwerkzaamheid obj, int index) {
        String omschrijving = "omschrijving_" + index;
        obj.setOmschrijving(omschrijving);
    }
    
    public void WegwerkzaamheidDataOnDemand.setTotDatum(Wegwerkzaamheid obj, int index) {
        Date totDatum = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setTotDatum(totDatum);
    }
    
    public void WegwerkzaamheidDataOnDemand.setVanDatum(Wegwerkzaamheid obj, int index) {
        Date vanDatum = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setVanDatum(vanDatum);
    }
    
    public void WegwerkzaamheidDataOnDemand.setVertraging(Wegwerkzaamheid obj, int index) {
        int vertraging = index;
        obj.setVertraging(vertraging);
    }
    
    public Wegwerkzaamheid WegwerkzaamheidDataOnDemand.getSpecificWegwerkzaamheid(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Wegwerkzaamheid obj = data.get(index);
        Long id = obj.getId();
        return Wegwerkzaamheid.findWegwerkzaamheid(id);
    }
    
    public Wegwerkzaamheid WegwerkzaamheidDataOnDemand.getRandomWegwerkzaamheid() {
        init();
        Wegwerkzaamheid obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Wegwerkzaamheid.findWegwerkzaamheid(id);
    }
    
    public boolean WegwerkzaamheidDataOnDemand.modifyWegwerkzaamheid(Wegwerkzaamheid obj) {
        return false;
    }
    
    public void WegwerkzaamheidDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Wegwerkzaamheid.findWegwerkzaamheidEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Wegwerkzaamheid' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Wegwerkzaamheid>();
        for (int i = 0; i < 10; i++) {
            Wegwerkzaamheid obj = getNewTransientWegwerkzaamheid(i);
            try {
                obj.persist();
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
