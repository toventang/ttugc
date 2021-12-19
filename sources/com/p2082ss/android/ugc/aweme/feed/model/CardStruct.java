package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct */
public class CardStruct implements Serializable {
    @AbstractC27891c(mo46611a = "card_data")
    private Object cardData;
    @AbstractC27891c(mo46611a = "card_style")
    int cardStyle;
    @AbstractC27891c(mo46611a = "card_type")
    int cardType;
    @AbstractC27891c(mo46611a = "card_url")
    String cardUrl;
    @AbstractC27891c(mo46611a = "dynamic_type")
    private int dynamicType;
    @AbstractC27891c(mo46611a = "gecko_channel")
    private List<String> geckoChannel;
    @AbstractC27891c(mo46611a = "log_extra")
    private String logExtra;
    @AbstractC27891c(mo46611a = "only_track_event_not_show")
    private Boolean onlyTrackEventNotShow = false;
    @AbstractC27891c(mo46611a = "preload_before_show")
    private int preloadBeforeVideoEnd;
    @AbstractC27891c(mo46611a = "preload_type")
    private int preloadType;
    @AbstractC27891c(mo46611a = "show_duration")
    private int showDuration;
    @AbstractC27891c(mo46611a = "show_seconds")
    int showSeconds = -1;
    @AbstractC27891c(mo46611a = "track_url_list")
    private UrlModel trackUrlList;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.CardStruct$IStatusCode */
    public interface IStatusCode {
        static {
            Covode.recordClassIndex(58667);
        }
    }

    static {
        Covode.recordClassIndex(58666);
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public Boolean getOnlyTrackEventNotShow() {
        return this.onlyTrackEventNotShow;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public int getPreloadBeforeVideoEnd() {
        return this.preloadBeforeVideoEnd * 1000;
    }

    public boolean isEnablePreload() {
        if (this.preloadType == 1) {
            return true;
        }
        return false;
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(new C27910f().mo46674b(this.cardData));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setPreloadBeforeVideoEnd(int i) {
        this.preloadBeforeVideoEnd = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
