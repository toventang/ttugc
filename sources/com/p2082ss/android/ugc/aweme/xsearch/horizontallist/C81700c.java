package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.lynx.react.bridge.JavaOnlyMap;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.c */
public final class C81700c implements Serializable {
    @AbstractC27891c(mo46611a = "card_data")

    /* renamed from: a */
    private JavaOnlyMap f182683a;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: b */
    private String f182684b;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: c */
    private Integer f182685c;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: d */
    private Integer f182686d;
    @AbstractC27891c(mo46611a = "horizontal_card_name")

    /* renamed from: e */
    private String f182687e;

    static {
        Covode.recordClassIndex(95105);
    }

    public final String getCardName() {
        return this.f182687e;
    }

    public final Integer getHeight() {
        return this.f182686d;
    }

    public final JavaOnlyMap getRawData() {
        return this.f182683a;
    }

    public final String getSchema() {
        return this.f182684b;
    }

    public final Integer getWidth() {
        return this.f182685c;
    }

    public final String toString() {
        return "LynxSearchHorizontalCardData(rawData=" + this.f182683a + ", schema=" + this.f182684b + ", width=" + this.f182685c + ", height=" + this.f182686d + ", cardName=" + this.f182687e + ')';
    }

    public final void setCardName(String str) {
        this.f182687e = str;
    }

    public final void setHeight(Integer num) {
        this.f182686d = num;
    }

    public final void setRawData(JavaOnlyMap javaOnlyMap) {
        this.f182683a = javaOnlyMap;
    }

    public final void setSchema(String str) {
        this.f182684b = str;
    }

    public final void setWidth(Integer num) {
        this.f182685c = num;
    }
}
