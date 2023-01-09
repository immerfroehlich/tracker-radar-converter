import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner {
    private String name;
    private String displayName;
    private String privacyPolicy;
    private String url;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("privacyPolicy")
    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    @JsonProperty("privacyPolicy")
    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}