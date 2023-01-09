import com.fasterxml.jackson.annotation.JsonProperty;

public class Types {
    private int Script;
    private int Image;

    @JsonProperty("Script")
    public int getScript() {
        return Script;
    }

    @JsonProperty("Script")
    public void setScript(int Script) {
        this.Script = Script;
    }

    @JsonProperty("Image")
    public int getImage() {
        return Image;
    }

    @JsonProperty("Image")
    public void setImage(int Image) {
        this.Image = Image;
    }
}