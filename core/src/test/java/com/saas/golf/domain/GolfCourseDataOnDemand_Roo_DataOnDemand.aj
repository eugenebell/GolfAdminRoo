// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.GolfCourse;
import com.saas.golf.domain.GolfCourseDataOnDemand;
import com.saas.golf.domain.ScoreCard;
import com.saas.golf.domain.ScoreCardDataOnDemand;
import com.saas.golf.repository.GolfCoursesRepository;
import java.math.BigInteger;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect GolfCourseDataOnDemand_Roo_DataOnDemand {
    
    declare @type: GolfCourseDataOnDemand: @Component;
    
    private Random GolfCourseDataOnDemand.rnd = new SecureRandom();
    
    private List<GolfCourse> GolfCourseDataOnDemand.data;
    
    @Autowired
    private ScoreCardDataOnDemand GolfCourseDataOnDemand.scoreCardDataOnDemand;
    
    @Autowired
    GolfCoursesRepository GolfCourseDataOnDemand.golfCoursesRepository;
    
    public GolfCourse GolfCourseDataOnDemand.getNewTransientGolfCourse(int index) {
        GolfCourse obj = new GolfCourse();
        setAddress(obj, index);
        setBookingsWelcomed(obj, index);
        setCourseType(obj, index);
        setDateCreated(obj, index);
        setDesignedBy(obj, index);
        setDrivingRange(obj, index);
        setEmail(obj, index);
        setEnabledGPS(obj, index);
        setFax(obj, index);
        setGolfSchool(obj, index);
        setGuestsWelcome(obj, index);
        setHoles(obj, index);
        setLogo(obj, index);
        setName(obj, index);
        setOtherFacilities(obj, index);
        setPhoneNumbers(obj, index);
        setPriceRangeWeekdaysHigh(obj, index);
        setPriceRangeWeekdaysLow(obj, index);
        setPriceRangeWeekendsHigh(obj, index);
        setPriceRangeWeekendsLow(obj, index);
        setProShop(obj, index);
        setPuttingGreen(obj, index);
        setRentalClubs(obj, index);
        setRentalGolfCart(obj, index);
        setRentalGolfTrolley(obj, index);
        setScoreCard(obj, index);
        setTeachingPro(obj, index);
        setWebsite(obj, index);
        setYearBuilt(obj, index);
        return obj;
    }
    
    public void GolfCourseDataOnDemand.setAddress(GolfCourse obj, int index) {
        String address = "address_" + index;
        if (address.length() > 250) {
            address = address.substring(0, 250);
        }
        obj.setAddress(address);
    }
    
    public void GolfCourseDataOnDemand.setBookingsWelcomed(GolfCourse obj, int index) {
        Boolean bookingsWelcomed = Boolean.TRUE;
        obj.setBookingsWelcomed(bookingsWelcomed);
    }
    
    public void GolfCourseDataOnDemand.setCourseType(GolfCourse obj, int index) {
        String courseType = "courseType_" + index;
        obj.setCourseType(courseType);
    }
    
    public void GolfCourseDataOnDemand.setDateCreated(GolfCourse obj, int index) {
        Date dateCreated = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.HOUR_OF_DAY), Calendar.getInstance().get(Calendar.MINUTE), Calendar.getInstance().get(Calendar.SECOND) + new Double(Math.random() * 1000).intValue()).getTime();
        obj.setDateCreated(dateCreated);
    }
    
    public void GolfCourseDataOnDemand.setDesignedBy(GolfCourse obj, int index) {
        String designedBy = "designedBy_" + index;
        obj.setDesignedBy(designedBy);
    }
    
    public void GolfCourseDataOnDemand.setDrivingRange(GolfCourse obj, int index) {
        Boolean drivingRange = Boolean.TRUE;
        obj.setDrivingRange(drivingRange);
    }
    
    public void GolfCourseDataOnDemand.setEmail(GolfCourse obj, int index) {
        String email = "foo" + index + "@bar.com";
        if (email.length() > 40) {
            email = email.substring(0, 40);
        }
        obj.setEmail(email);
    }
    
    public void GolfCourseDataOnDemand.setEnabledGPS(GolfCourse obj, int index) {
        Boolean enabledGPS = Boolean.TRUE;
        obj.setEnabledGPS(enabledGPS);
    }
    
    public void GolfCourseDataOnDemand.setFax(GolfCourse obj, int index) {
        String fax = "faxx_" + index;
        if (fax.length() > 20) {
            fax = fax.substring(0, 20);
        }
        obj.setFax(fax);
    }
    
    public void GolfCourseDataOnDemand.setGolfSchool(GolfCourse obj, int index) {
        Boolean golfSchool = Boolean.TRUE;
        obj.setGolfSchool(golfSchool);
    }
    
    public void GolfCourseDataOnDemand.setGuestsWelcome(GolfCourse obj, int index) {
        Boolean guestsWelcome = Boolean.TRUE;
        obj.setGuestsWelcome(guestsWelcome);
    }
    
    public void GolfCourseDataOnDemand.setHoles(GolfCourse obj, int index) {
        Integer holes = new Integer(index);
        if (holes < 9 || holes > 18) {
            holes = 18;
        }
        obj.setHoles(holes);
    }
    
    public void GolfCourseDataOnDemand.setLogo(GolfCourse obj, int index) {
        byte[] logo = String.valueOf(index).getBytes();
        obj.setLogo(logo);
    }
    
    public void GolfCourseDataOnDemand.setName(GolfCourse obj, int index) {
        String name = "name_" + index;
        if (name.length() > 50) {
            name = name.substring(0, 50);
        }
        obj.setName(name);
    }
    
    public void GolfCourseDataOnDemand.setOtherFacilities(GolfCourse obj, int index) {
        String otherFacilities = "otherFacilities_" + index;
        obj.setOtherFacilities(otherFacilities);
    }
    
    public void GolfCourseDataOnDemand.setPhoneNumbers(GolfCourse obj, int index) {
        String phoneNumbers = "phoneNumbers_" + index;
        if (phoneNumbers.length() > 20) {
            phoneNumbers = phoneNumbers.substring(0, 20);
        }
        obj.setPhoneNumbers(phoneNumbers);
    }
    
    public void GolfCourseDataOnDemand.setPriceRangeWeekdaysHigh(GolfCourse obj, int index) {
        Double priceRangeWeekdaysHigh = new Integer(index).doubleValue();
        obj.setPriceRangeWeekdaysHigh(priceRangeWeekdaysHigh);
    }
    
    public void GolfCourseDataOnDemand.setPriceRangeWeekdaysLow(GolfCourse obj, int index) {
        Double priceRangeWeekdaysLow = new Integer(index).doubleValue();
        obj.setPriceRangeWeekdaysLow(priceRangeWeekdaysLow);
    }
    
    public void GolfCourseDataOnDemand.setPriceRangeWeekendsHigh(GolfCourse obj, int index) {
        Double priceRangeWeekendsHigh = new Integer(index).doubleValue();
        obj.setPriceRangeWeekendsHigh(priceRangeWeekendsHigh);
    }
    
    public void GolfCourseDataOnDemand.setPriceRangeWeekendsLow(GolfCourse obj, int index) {
        Double priceRangeWeekendsLow = new Integer(index).doubleValue();
        obj.setPriceRangeWeekendsLow(priceRangeWeekendsLow);
    }
    
    public void GolfCourseDataOnDemand.setProShop(GolfCourse obj, int index) {
        Boolean proShop = Boolean.TRUE;
        obj.setProShop(proShop);
    }
    
    public void GolfCourseDataOnDemand.setPuttingGreen(GolfCourse obj, int index) {
        Boolean puttingGreen = Boolean.TRUE;
        obj.setPuttingGreen(puttingGreen);
    }
    
    public void GolfCourseDataOnDemand.setRentalClubs(GolfCourse obj, int index) {
        Boolean rentalClubs = Boolean.TRUE;
        obj.setRentalClubs(rentalClubs);
    }
    
    public void GolfCourseDataOnDemand.setRentalGolfCart(GolfCourse obj, int index) {
        Boolean rentalGolfCart = Boolean.TRUE;
        obj.setRentalGolfCart(rentalGolfCart);
    }
    
    public void GolfCourseDataOnDemand.setRentalGolfTrolley(GolfCourse obj, int index) {
        Boolean rentalGolfTrolley = Boolean.TRUE;
        obj.setRentalGolfTrolley(rentalGolfTrolley);
    }
    
    public void GolfCourseDataOnDemand.setScoreCard(GolfCourse obj, int index) {
        ScoreCard scoreCard = scoreCardDataOnDemand.getSpecificScoreCard(index);
        obj.setScoreCard(scoreCard);
    }
    
    public void GolfCourseDataOnDemand.setTeachingPro(GolfCourse obj, int index) {
        Boolean teachingPro = Boolean.TRUE;
        obj.setTeachingPro(teachingPro);
    }
    
    public void GolfCourseDataOnDemand.setWebsite(GolfCourse obj, int index) {
        String website = "website_" + index;
        if (website.length() > 40) {
            website = website.substring(0, 40);
        }
        obj.setWebsite(website);
    }
    
    public void GolfCourseDataOnDemand.setYearBuilt(GolfCourse obj, int index) {
        Integer yearBuilt = new Integer(index);
        if (yearBuilt < 1550 || yearBuilt > 2100) {
            yearBuilt = 2100;
        }
        obj.setYearBuilt(yearBuilt);
    }
    
    public GolfCourse GolfCourseDataOnDemand.getSpecificGolfCourse(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        GolfCourse obj = data.get(index);
        BigInteger id = obj.getId();
        return golfCoursesRepository.findOne(id);
    }
    
    public GolfCourse GolfCourseDataOnDemand.getRandomGolfCourse() {
        init();
        GolfCourse obj = data.get(rnd.nextInt(data.size()));
        BigInteger id = obj.getId();
        return golfCoursesRepository.findOne(id);
    }
    
    public boolean GolfCourseDataOnDemand.modifyGolfCourse(GolfCourse obj) {
        return false;
    }
    
    public void GolfCourseDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = golfCoursesRepository.findAll(new org.springframework.data.domain.PageRequest(from / to, to)).getContent();
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'GolfCourse' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<GolfCourse>();
        for (int i = 0; i < 10; i++) {
            GolfCourse obj = getNewTransientGolfCourse(i);
            try {
                golfCoursesRepository.save(obj);
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            data.add(obj);
        }
    }
    
}
