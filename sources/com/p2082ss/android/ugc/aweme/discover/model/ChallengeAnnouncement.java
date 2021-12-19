package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement */
public class ChallengeAnnouncement implements Serializable {
    @AbstractC27891c(mo46611a = "body")
    public String content;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(50432);
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
