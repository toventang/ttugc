package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80502gk;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer */
public class ChallengeDisclaimer implements Serializable {
    @AbstractC27890b(mo46609a = C80502gk.class)
    @AbstractC27891c(mo46611a = "content")
    public String content;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(50434);
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
