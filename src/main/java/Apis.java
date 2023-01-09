import com.fasterxml.jackson.annotation.JsonProperty;

public class Apis {
    private int DateprototypegetTimezoneOffset;
    private int IntlDateTimeFormatprototyperesolvedOptions;
    private int windowlocalStorage;
    private int PerformanceTimingprototypenavigationStart;
    private int NavigatorprototypeappVersion;

    @JsonProperty("Date.prototype.getTimezoneOffset")
    public int getDateprototypegetTimezoneOffset() {
        return DateprototypegetTimezoneOffset;
    }

    @JsonProperty("Date.prototype.getTimezoneOffset")
    public void setDateprototypegetTimezoneOffset(int DateprototypegetTimezoneOffset) {
        this.DateprototypegetTimezoneOffset = DateprototypegetTimezoneOffset;
    }

    @JsonProperty("Intl.DateTimeFormat.prototype.resolvedOptions")
    public int getIntlDateTimeFormatprototyperesolvedOptions() {
        return IntlDateTimeFormatprototyperesolvedOptions;
    }

    @JsonProperty("Intl.DateTimeFormat.prototype.resolvedOptions")
    public void setIntlDateTimeFormatprototyperesolvedOptions(int IntlDateTimeFormatprototyperesolvedOptions) {
        this.IntlDateTimeFormatprototyperesolvedOptions = IntlDateTimeFormatprototyperesolvedOptions;
    }

    @JsonProperty("window.localStorage")
    public int getWindowlocalStorage() {
        return windowlocalStorage;
    }

    @JsonProperty("window.localStorage")
    public void setWindowlocalStorage(int windowlocalStorage) {
        this.windowlocalStorage = windowlocalStorage;
    }

    @JsonProperty("PerformanceTiming.prototype.navigationStart")
    public int getPerformanceTimingprototypenavigationStart() {
        return PerformanceTimingprototypenavigationStart;
    }

    @JsonProperty("PerformanceTiming.prototype.navigationStart")
    public void setPerformanceTimingprototypenavigationStart(int PerformanceTimingprototypenavigationStart) {
        this.PerformanceTimingprototypenavigationStart = PerformanceTimingprototypenavigationStart;
    }

    @JsonProperty("Navigator.prototype.appVersion")
    public int getNavigatorprototypeappVersion() {
        return NavigatorprototypeappVersion;
    }

    @JsonProperty("Navigator.prototype.appVersion")
    public void setNavigatorprototypeappVersion(int NavigatorprototypeappVersion) {
        this.NavigatorprototypeappVersion = NavigatorprototypeappVersion;
    }
}