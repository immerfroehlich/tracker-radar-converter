import com.fasterxml.jackson.annotation.JsonProperty;

public class Resource {
    private String rule;
    private int cookies;
    private int fingerprinting;
    private String[] subdomains;
    private Apis apis;
    private int sites;
    private double prevalence;
    private String[] cnames; //assumed data type to be string
    private String[] responseHashes;
    private String type;
    private Apis firstPartyCookies;
    private Apis firstPartyCookiesSent;
    private Resource[] exampleSites;

    @JsonProperty("rule")
    public String getRule() {
        return rule;
    }

    @JsonProperty("rule")
    public void setRule(String rule) {
        this.rule = rule;
    }

    @JsonProperty("cookies")
    public int getCookies() {
        return cookies;
    }

    @JsonProperty("cookies")
    public void setCookies(int cookies) {
        this.cookies = cookies;
    }

    @JsonProperty("fingerprinting")
    public int getFingerprinting() {
        return fingerprinting;
    }

    @JsonProperty("fingerprinting")
    public void setFingerprinting(int fingerprinting) {
        this.fingerprinting = fingerprinting;
    }

    @JsonProperty("subdomains")
    public String[] getSubdomains() {
        return subdomains;
    }

    @JsonProperty("subdomains")
    public void setSubdomains(String[] subdomains) {
        this.subdomains = subdomains;
    }

    //@JsonProperty("apis")
    public Apis getApis() {
        return apis;
    }

    //@JsonProperty("apis")
    public void setApis(Apis apis) {
        this.apis = apis;
    }

    @JsonProperty("sites")
    public int getSites() {
        return sites;
    }

    @JsonProperty("sites")
    public void setSites(int sites) {
        this.sites = sites;
    }

    @JsonProperty("prevalence")
    public double getPrevalence() {
        return prevalence;
    }

    @JsonProperty("prevalence")
    public void setPrevalence(double prevalence) {
        this.prevalence = prevalence;
    }

    @JsonProperty("cnames")
    public String[] getCnames() {
        return cnames;
    }

    @JsonProperty("cnames")
    public void setCnames(String[] cnames) {
        this.cnames = cnames;
    }

    @JsonProperty("responseHashes")
    public String[] getResponseHashes() {
        return responseHashes;
    }

    @JsonProperty("responseHashes")
    public void setResponseHashes(String[] responseHashes) {
        this.responseHashes = responseHashes;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("firstPartyCookies")
    public Apis getFirstPartyCookies() {
        return firstPartyCookies;
    }

    @JsonProperty("firstPartyCookies")
    public void setFirstPartyCookies(Apis firstPartyCookies) {
        this.firstPartyCookies = firstPartyCookies;
    }

    @JsonProperty("firstPartyCookiesSent")
    public Apis getFirstPartyCookiesSent() {
        return firstPartyCookiesSent;
    }

    @JsonProperty("firstPartyCookiesSent")
    public void setFirstPartyCookiesSent(Apis firstPartyCookiesSent) {
        this.firstPartyCookiesSent = firstPartyCookiesSent;
    }

    @JsonProperty("exampleSites")
    public Resource[] getExampleSites() {
        return exampleSites;
    }

    @JsonProperty("exampleSites")
    public void setExampleSites(Resource[] exampleSites) {
        this.exampleSites = exampleSites;
    }
}