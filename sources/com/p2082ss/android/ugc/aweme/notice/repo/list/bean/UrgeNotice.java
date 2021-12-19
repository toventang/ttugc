package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.UrgeNotice */
public class UrgeNotice {
    @AbstractC27891c(mo46611a = "blcok_urge_setting")
    private int blcokUrgeSetting;
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "urge_unread_count")
    private long urgeUnreadCount;

    static {
        Covode.recordClassIndex(72351);
    }

    public int getBlcokUrgeSetting() {
        return this.blcokUrgeSetting;
    }

    public String getContent() {
        return this.content;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public void setBlcokUrgeSetting(int i) {
        this.blcokUrgeSetting = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }
}
