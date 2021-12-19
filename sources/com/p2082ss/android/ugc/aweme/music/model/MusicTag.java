package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicTag */
public final class MusicTag implements Serializable {
    @AbstractC27891c(mo46611a = "tag_color")
    private String tagColor;
    @AbstractC27891c(mo46611a = "tag_title")
    private String tagTitle;
    @AbstractC27891c(mo46611a = "tag_title_color")
    private String tagTitleColor;

    static {
        Covode.recordClassIndex(71413);
    }

    public final String getTagColor() {
        return this.tagColor;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTagTitleColor() {
        return this.tagTitleColor;
    }

    public final void setTagColor(String str) {
        this.tagColor = str;
    }

    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    public final void setTagTitleColor(String str) {
        this.tagTitleColor = str;
    }
}
