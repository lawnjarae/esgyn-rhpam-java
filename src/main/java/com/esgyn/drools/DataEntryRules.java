package com.esgyn.drools;

import org.drools.core.spi.Tuple;
import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DataEntryRules { 

    public static void main(String[] args) {

        KieServices ks = KieServices.Factory.get();
        ReleaseId releaseId = ks.newReleaseId( "com.esgyn.drools", "esgyn-rules", "LATEST" );
        KieContainer kContainer = ks.newKieContainer(releaseId);
        KieSession kSession = kContainer.newKieSession("default-stateful-kie-session");
        
        RulesInfoHelper rih = new RulesInfoHelper();
        Message msg = new Message();
        msg.setFname("John");
        msg.setLname("Wayne");
        msg.setCity("Los Angeles");
        msg.setState("California");
        msg.setZip("90201");

        msg.setVehicle_make("BWM");
        msg.setModel_year(2016);
        msg.setAnnual_miles(5000);
        msg.setUse("pleasure");

        msg.setFav_food("steak");
        msg.setFav_movie("Star Wars");
        msg.setFav_sport("Basketbakll");
        msg.setFav_team("Warriors");

        kSession.insert(rih);
        kSession.insert(msg);
        kSession.fireAllRules();

        System.out.println("Points=" + msg.getPoints());
        System.out.println(rih);
        for (Tuple tuple : rih.getFiredTuples())
        {
        	tuple.toString();
        }
        kSession.dispose();
        kContainer.dispose();
    }
}

