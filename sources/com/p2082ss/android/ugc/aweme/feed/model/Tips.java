package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Tips */
public final class Tips implements Serializable {
    @AbstractC27891c(mo46611a = "key_id")
    private Integer key_id = 0;
    @AbstractC27891c(mo46611a = "text")
    private String text;
    @AbstractC27891c(mo46611a = StringSet.type)
    private String type;

    static {
        Covode.recordClassIndex(58762);
    }

    public final Integer getKey_id() {
        return this.key_id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final String toString() {
        return "Tips(type=" + this.type + ", text=" + this.text + ')';
    }

    public final void setKey_id(Integer num) {
        this.key_id = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
