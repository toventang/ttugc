package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.LongVideoTag */
public final class LongVideoTag implements Serializable {
    @AbstractC27891c(mo46611a = "tag_bg_img")
    private String tagBgImg = "";
    @AbstractC27891c(mo46611a = "tag_word")
    private String tagWord = "";
    @AbstractC27891c(mo46611a = "tag_word_color")
    private String tagWordColor = "";

    static {
        Covode.recordClassIndex(50466);
    }

    public final String getTagBgImg() {
        return this.tagBgImg;
    }

    public final String getTagWord() {
        return this.tagWord;
    }

    public final String getTagWordColor() {
        return this.tagWordColor;
    }

    public final void setTagBgImg(String str) {
        C89219l.m154721d(str, "");
        this.tagBgImg = str;
    }

    public final void setTagWord(String str) {
        C89219l.m154721d(str, "");
        this.tagWord = str;
    }

    public final void setTagWordColor(String str) {
        C89219l.m154721d(str, "");
        this.tagWordColor = str;
    }
}
