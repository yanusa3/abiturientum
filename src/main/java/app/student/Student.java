package app.student;

import app.information.Passport;
import app.information.Sport;
import app.information.Volunteer;

public class Student {

    private String uuid;
    private Passport passport;
    private Diploma attestat;
    private SGE sge;
    private RWD rwd;
    private boolean juniorArmy = false;
    private Sport sport;
    private Volunteer volunteer;
    private Region region;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Diploma getAttestat() {
        return attestat;
    }

    public void setAttestat(Diploma attestat) {
        this.attestat = attestat;
    }

    public RWD getRwd() {
        return rwd;
    }

    public void setRwd(RWD rwd) {
        this.rwd = rwd;
    }

    public boolean isJuniorArmy() {
        return juniorArmy;
    }

    public void setJuniorArmy(boolean juniorArmy) {
        this.juniorArmy = juniorArmy;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public SGE getSge() {
        return sge;
    }

    public void setSge(SGE sge) {
        this.sge = sge;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
