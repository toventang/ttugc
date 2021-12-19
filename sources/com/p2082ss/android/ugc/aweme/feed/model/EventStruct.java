package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.EventStruct */
public final class EventStruct implements Serializable {
    @AbstractC27891c(mo46611a = "desc")
    private String desc;
    @AbstractC27891c(mo46611a = "duration")
    private long duration;
    @AbstractC27891c(mo46611a = "enable_update")
    private boolean enableUpdate;
    @AbstractC27891c(mo46611a = "has_subscribed")
    private boolean hasSubscribed;
    @AbstractC27891c(mo46611a = "host")
    private User host;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f114477id;
    @AbstractC27891c(mo46611a = "start_time")
    private long startTime;
    @AbstractC27891c(mo46611a = "status")
    private int status;
    @AbstractC27891c(mo46611a = "subscriber_count")
    private long subscriberCount;
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(58679);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableUpdate() {
        return this.enableUpdate;
    }

    public final boolean getHasSubscribed() {
        return this.hasSubscribed;
    }

    public final User getHost() {
        return this.host;
    }

    public final String getId() {
        return this.f114477id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubscriberCount() {
        return this.subscriberCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableUpdate(boolean z) {
        this.enableUpdate = z;
    }

    public final void setHasSubscribed(boolean z) {
        this.hasSubscribed = z;
    }

    public final void setHost(User user) {
        this.host = user;
    }

    public final void setId(String str) {
        this.f114477id = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSubscriberCount(long j) {
        this.subscriberCount = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
