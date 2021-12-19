package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfoStruct */
public class HotSearchInfoStruct implements Serializable {
    @AbstractC27891c(mo46611a = "ailab_extra")
    String aiLabExtra;
    @AbstractC27891c(mo46611a = "biz_extra")
    String bizExtra;
    @AbstractC27891c(mo46611a = "rec_extra")
    String recExtra;
    @AbstractC27891c(mo46611a = "sentence")
    String sentence;

    static {
        Covode.recordClassIndex(58706);
    }

    public String getAiLabExtra() {
        return this.aiLabExtra;
    }

    public String getBizExtra() {
        return this.bizExtra;
    }

    public String getRecExtra() {
        return this.recExtra;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setAiLabExtra(String str) {
        this.aiLabExtra = str;
    }

    public void setBizExtra(String str) {
        this.bizExtra = str;
    }

    public void setRecExtra(String str) {
        this.recExtra = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }
}
