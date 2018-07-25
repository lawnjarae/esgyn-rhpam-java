package com.esgyn.drools;

import java.util.ArrayList;
import java.util.List;

import org.drools.core.spi.Tuple;

public class RulesInfoHelper {

	List<String> firedRules = new ArrayList<>();
	List<Tuple> firedTuples = new ArrayList<>();

	public List<String> getFiredRules() {
		return firedRules;
	}

	public void setFiredRules(List<String> firedRules) {
		this.firedRules = firedRules;
	}

	public List<Tuple> getFiredTuples() {
		return firedTuples;
	}

	public void setFiredTuples(List<Tuple> firedTuples) {
		this.firedTuples = firedTuples;
	}

	public RulesInfoHelper() {
		super();
	}

	@Override
	public String toString() {
		return "RulesInfoHelper [firedRules=" + firedRules + "]";
		//return "RulesInfoHelper [firedRules=" + firedRules + ", firedRulesTuples=" + firedTuples + "]";
	}
}
