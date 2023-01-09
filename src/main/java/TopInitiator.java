import com.fasterxml.jackson.annotation.JsonProperty;

public class TopInitiator {
    private String domain;
    private double prevalence;

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("prevalence")
    public double getPrevalence() {
        return prevalence;
    }

    @JsonProperty("prevalence")
    public void setPrevalence(double prevalence) {
        this.prevalence = prevalence;
    }
}