package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class SubscribeInfo {
    @AbstractC27891c(mo46611a = "enable_subscription")
    boolean anchorEnableSubscription;
    @AbstractC27891c(mo46611a = "qualification")
    boolean isAnchorQualified;
    @AbstractC27891c(mo46611a = "is_subscribe")
    boolean isSubscribed;
    @AbstractC27891c(mo46611a = "badge")
    SubscribeBadge subscribeBadge;
    @AbstractC27891c(mo46611a = "subscriber_count")
    int subscriberCount;

    static {
        Covode.recordClassIndex(3451);
    }

    public SubscribeBadge getSubscribeBadge() {
        return this.subscribeBadge;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public boolean isAnchorQualified() {
        return this.isAnchorQualified;
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public void setAnchorQualified(boolean z) {
        this.isAnchorQualified = z;
    }

    public void setSubscribeBadge(SubscribeBadge subscribeBadge2) {
        this.subscribeBadge = subscribeBadge2;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public void setSubscriberCount(int i) {
        this.subscriberCount = i;
    }
}
