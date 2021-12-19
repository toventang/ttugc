package com.p2082ss.android.ugc.aweme.music.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo */
public class MatchedPGCSoundInfo implements Serializable {
    @AbstractC27891c(mo46611a = "author")
    public String author;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public String f138248id;
    @AbstractC27891c(mo46611a = "mixed_author")
    public String mixedAuthor;
    @AbstractC27891c(mo46611a = "mixed_title")
    public String mixedTitle;
    @AbstractC27891c(mo46611a = "title")
    public String title;

    static {
        Covode.recordClassIndex(71397);
    }

    public String getAuthor() {
        return this.author;
    }

    public String getId() {
        return this.f138248id;
    }

    public String getMixedAuthor() {
        return this.mixedAuthor;
    }

    public String getMixedTitle() {
        return this.mixedTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getShowInfo() {
        if (TextUtils.isEmpty(this.title) && TextUtils.isEmpty(this.author)) {
            return "";
        }
        if (TextUtils.isEmpty(this.title)) {
            return this.author;
        }
        if (TextUtils.isEmpty(this.author)) {
            return this.title;
        }
        return this.title + " - " + this.author;
    }
}
