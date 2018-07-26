package com.esgyn.drools;

public class Message {
	private String fname; 
    private String lname; 
    private String city; 
    private String state; 
    private String zip;
    private String vehicle_make;
    private String use;
    private String fav_food;
    private String fav_movie;
    private String fav_sport;
    private String fav_team;
    private int    model_year;
    private int    annual_miles;

    // rules score
    private int    points = 100;

    // increment
    public void incPoints(int i) {
        this.points += i;
    }

    // getters
    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public String getVehicle_make() {
        return this.vehicle_make;
    }

    public String getUse() {
        return this.use;
    }

    public String getFav_food() {
        return this.fav_food;
    }

    public String getFav_movie() {
        return this.fav_movie;
    }

    public String getFav_sport() {
        return this.fav_sport;
    }

    public String getFav_team() {
        return this.fav_team;
    }

    public int    getModel_year() {
        return this.model_year;
    }

    public int    getAnnual_miles() {
        return this.annual_miles;
    }

    public int    getPoints() {
        return this.points;
    }

    // setters
    public void setFname(String s) {
        this.fname = s;
    }

    public void setLname(String s) {
        this.lname = s;
    }

    public void setCity(String s) {
        this.city = s;
    }

    public void setState(String s) {
        this.state = s;
    }

    public void setZip(String s) {
        this.zip = s;
    }

    public void setVehicle_make(String s) {
        this.vehicle_make = s;
    }

    public void setUse(String s) {
        this.use = s;
    }

    public void setFav_food(String s) {
        this.fav_food = s;
    }

    public void setFav_movie(String s) {
        this.fav_movie = s;
    }

    public void setFav_sport(String s) {
        this.fav_sport = s;
    }

    public void setFav_team(String s) {
        this.fav_team = s;
    }

    public void setModel_year(int i) {
        this.model_year = i;
    }

    public void setAnnual_miles(int i) {
        this.annual_miles = i;
    }

	@Override
	public String toString() {
		return "Message [fname=" + fname + ", lname=" + lname + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", vehicle_make=" + vehicle_make + ", use=" + use + ", fav_food=" + fav_food + ", fav_movie="
				+ fav_movie + ", fav_sport=" + fav_sport + ", fav_team=" + fav_team + ", model_year=" + model_year
				+ ", annual_miles=" + annual_miles + ", points=" + points + "]";
	}
}
