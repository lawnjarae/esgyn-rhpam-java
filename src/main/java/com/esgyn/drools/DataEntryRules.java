package com.esgyn.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.esgyn.drools.Message;
import com.esgyn.drools.RulesInfoHelper;

public class DataEntryRules { 

    public static void main(String[] args) {

        KieServices ks = KieServices.Factory.get();
        ReleaseId releaseId = ks.newReleaseId( "com.esgyn.drools", "esgyn-rules", "LATEST" );
        KieContainer kContainer = ks.newKieContainer(releaseId);
        KieSession kSession = kContainer.newKieSession("default-stateful-kie-session");
        
        kSession.addEventListener(new DebugAgendaEventListener());
        
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

        msg.setFav_food("STEAK");
        msg.setFav_movie("STAR WARS");
        msg.setFav_sport("SOCCER");
        msg.setFav_team("ROCKIES");

        kSession.insert(rih);
        kSession.insert(msg);
        kSession.fireAllRules();

        System.out.println("Points=" + msg.getPoints());
        System.out.println(rih);
        
        kSession.dispose();
        kContainer.dispose();
    }
}

