package com.p2082ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentLabel */
public class CommentLabel implements Serializable {
    private static final long serialVersionUID = 5974802910310825054L;
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public String color;
    @AbstractC27891c(mo46611a = "text")
    public String text;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "url")
    public String url;

    static {
        Covode.recordClassIndex(43858);
    }

    public String getLabelColor() {
        return this.color;
    }

    public String getLabelText() {
        return this.text;
    }

    public int getLabelType() {
        return this.type;
    }

    public String getLabelUrl() {
        return this.url;
    }

    public void setLabelColor(String str) {
        this.color = str;
    }

    public void setLabelText(String str) {
        this.text = str;
    }

    public void setLabelType(int i) {
        this.type = i;
    }

    public void setLabelUrl(String str) {
        this.url = str;
    }
}
