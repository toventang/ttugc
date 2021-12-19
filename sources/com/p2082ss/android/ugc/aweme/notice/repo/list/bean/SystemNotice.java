package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNotice */
public class SystemNotice {
    @AbstractC27891c(mo46611a = "aweme")
    Aweme aweme;
    @AbstractC27891c(mo46611a = "content")
    String content;

    static {
        Covode.recordClassIndex(72350);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getContent() {
        return this.content;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
