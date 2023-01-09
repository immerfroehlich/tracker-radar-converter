import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RootObject {
	@JsonProperty("domain")
    public String domain;
//    private Owner owner;
//    private String[] source;
//    private double prevalence;
//    private int sites;
	@JsonProperty("subdomains")
	public String[] subdomains;
//	@JsonProperty("cnames")
//    public String[] cnames; //assumed data type to be string
	@JsonProperty("fingerprinting")
    public int fingerprinting;
//    private Resource resources;
	@JsonProperty("categories")
    private String[] categories;
//    private Apis performance;
//    private double cookies;
//    private TopInitiator[] topInitiators;
//    private Types types;
//    private String[] nameservers;

//    @JsonProperty("domain")
//    public String getDomain() {
//        return domain;
//    }
//
//    @JsonProperty("domain")
//    public void setDomain(String domain) {
//        this.domain = domain;
//    }
//
//    @JsonProperty("owner")
//    public Owner getOwner() {
//        return owner;
//    }
//
//    @JsonProperty("owner")
//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }
//
//    @JsonProperty("source")
//    public String[] getSource() {
//        return source;
//    }
//
//    @JsonProperty("source")
//    public void setSource(String[] source) {
//        this.source = source;
//    }
//
//    @JsonProperty("prevalence")
//    public double getPrevalence() {
//        return prevalence;
//    }
//
//    @JsonProperty("prevalence")
//    public void setPrevalence(double prevalence) {
//        this.prevalence = prevalence;
//    }
//
//    @JsonProperty("sites")
//    public int getSites() {
//        return sites;
//    }
//
//    @JsonProperty("sites")
//    public void setSites(int sites) {
//        this.sites = sites;
//    }
//
//    @JsonProperty("subdomains")
//    public String[] getSubdomains() {
//        return subdomains;
//    }
//
//    @JsonProperty("subdomains")
//    public void setSubdomains(String[] subdomains) {
//        this.subdomains = subdomains;
//    }
//
//    @JsonProperty("cnames")
//    public String[] getCnames() {
//        return cnames;
//    }
//
//    @JsonProperty("cnames")
//    public void setCnames(String[] cnames) {
//        this.cnames = cnames;
//    }
//
//    @JsonProperty("fingerprinting")
//    public int getFingerprinting() {
//        return fingerprinting;
//    }
//
//    @JsonProperty("fingerprinting")
//    public void setFingerprinting(int fingerprinting) {
//        this.fingerprinting = fingerprinting;
//    }
//
//    //@JsonProperty("resources")
//    public Resource getResources() {
//        return resources;
//    }
//
//    //@JsonProperty("resources")
//    public void setResources(Resource resources) {
//        this.resources = resources;
//    }
//
//    @JsonProperty("categories")
//    public String[] getCategories() {
//        return categories;
//    }
//
//    @JsonProperty("categories")
//    public void setCategories(String[] categories) {
//        this.categories = categories;
//    }
//
//    @JsonProperty("performance")
//    public Apis getPerformance() {
//        return performance;
//    }
//
//    @JsonProperty("performance")
//    public void setPerformance(Apis performance) {
//        this.performance = performance;
//    }
//
//    @JsonProperty("cookies")
//    public double getCookies() {
//        return cookies;
//    }
//
//    @JsonProperty("cookies")
//    public void setCookies(double cookies) {
//        this.cookies = cookies;
//    }
//
//    @JsonProperty("topInitiators")
//    public TopInitiator[] getTopInitiators() {
//        return topInitiators;
//    }
//
//    @JsonProperty("topInitiators")
//    public void setTopInitiators(TopInitiator[] topInitiators) {
//        this.topInitiators = topInitiators;
//    }
//
//    @JsonProperty("types")
//    public Types getTypes() {
//        return types;
//    }
//
//    @JsonProperty("types")
//    public void setTypes(Types types) {
//        this.types = types;
//    }
//
//    @JsonProperty("nameservers")
//    public String[] getNameservers() {
//        return nameservers;
//    }
//
//    @JsonProperty("nameservers")
//    public void setNameservers(String[] nameservers) {
//        this.nameservers = nameservers;
//    }
}