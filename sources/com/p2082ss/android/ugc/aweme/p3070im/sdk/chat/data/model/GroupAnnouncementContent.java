package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupAnnouncementContent */
public final class GroupAnnouncementContent extends BaseContent {
    @AbstractC27891c(mo46611a = "notice_content")
    private String announcement = "";
    @AbstractC27891c(mo46611a = "notice_title")
    private String title = "";

    static {
        Covode.recordClassIndex(63433);
    }

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String str = this.announcement;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setAnnouncement(String str) {
        this.announcement = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
