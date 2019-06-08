package app.student;

public class SGE {

    private String registrationId;
    private int totalScore;
    private boolean hasMapped = false;

    public SGE(String registrationId){
        this.registrationId = registrationId;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationIdId(String id) {
        this.registrationId = id;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public boolean hasMapped() {
        return hasMapped;
    }

    public void setHasMapped(boolean hasMapped) {
        this.hasMapped = hasMapped;
    }
}
