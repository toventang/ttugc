package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.LiveEvent */
public final class LiveEvent implements Serializable {
    @AbstractC27891c(mo46611a = "customActionItems")
    private List<String> customActionItems;
    @AbstractC27891c(mo46611a = "eventID")
    private String eventID;
    @AbstractC27891c(mo46611a = "internalURL")
    private String internalURL;
    @AbstractC27891c(mo46611a = "isAnchor")
    private String isAnchor;
    @AbstractC27891c(mo46611a = "organizer")
    private User organizer;
    @AbstractC27891c(mo46611a = "shareURL")
    private String shareURL;
    @AbstractC27891c(mo46611a = "showsIMForActivity")
    private Boolean showsIMForActivity = true;
    @AbstractC27891c(mo46611a = "startTime")
    private String startTime;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = "track_info")
    private String trackInfo;

    static {
        Covode.recordClassIndex(58721);
    }

    public final List<String> getCustomActionItems() {
        return this.customActionItems;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getInternalURL() {
        return this.internalURL;
    }

    public final User getOrganizer() {
        return this.organizer;
    }

    public final String getShareURL() {
        return this.shareURL;
    }

    public final Boolean getShowsIMForActivity() {
        return this.showsIMForActivity;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackInfo() {
        return this.trackInfo;
    }

    public final String isAnchor() {
        return this.isAnchor;
    }

    public final void setAnchor(String str) {
        this.isAnchor = str;
    }

    public final void setCustomActionItems(List<String> list) {
        this.customActionItems = list;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setInternalURL(String str) {
        this.internalURL = str;
    }

    public final void setOrganizer(User user) {
        this.organizer = user;
    }

    public final void setShareURL(String str) {
        this.shareURL = str;
    }

    public final void setShowsIMForActivity(Boolean bool) {
        this.showsIMForActivity = bool;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTrackInfo(String str) {
        this.trackInfo = str;
    }
}
