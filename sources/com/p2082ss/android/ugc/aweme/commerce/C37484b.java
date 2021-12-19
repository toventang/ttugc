package com.p2082ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.b */
public final class C37484b implements Serializable {
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    private String f88472a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    private String f88473b;
    @AbstractC27891c(mo46611a = "button_text")

    /* renamed from: c */
    private String f88474c;
    @AbstractC27891c(mo46611a = "landing_page_schema")

    /* renamed from: d */
    private String f88475d;
    @AbstractC27891c(mo46611a = "message_id")

    /* renamed from: e */
    private String f88476e;

    static {
        Covode.recordClassIndex(44870);
    }

    public final String getBodyText() {
        return this.f88473b;
    }

    public final String getButtonText() {
        return this.f88474c;
    }

    public final String getLandingPageSchema() {
        return this.f88475d;
    }

    public final String getMessageId() {
        return this.f88476e;
    }

    public final String getTitle() {
        return this.f88472a;
    }

    public final void setBodyText(String str) {
        this.f88473b = str;
    }

    public final void setButtonText(String str) {
        this.f88474c = str;
    }

    public final void setLandingPageSchema(String str) {
        this.f88475d = str;
    }

    public final void setMessageId(String str) {
        this.f88476e = str;
    }

    public final void setTitle(String str) {
        this.f88472a = str;
    }
}
