package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.t */
public class C71518t implements Serializable {
    @AbstractC27891c(mo46611a = "appId", mo46612b = {"a"})

    /* renamed from: a */
    String f160282a;
    @AbstractC27891c(mo46611a = "appTitle", mo46612b = {"b"})

    /* renamed from: b */
    private String f160283b;
    @AbstractC27891c(mo46611a = "description", mo46612b = {"c"})

    /* renamed from: c */
    private String f160284c;
    @AbstractC27891c(mo46611a = "appUrl", mo46612b = {"d"})

    /* renamed from: d */
    private String f160285d;
    @AbstractC27891c(mo46611a = "extra", mo46612b = {"e"})

    /* renamed from: e */
    private String f160286e;
    @AbstractC27891c(mo46611a = "schema", mo46612b = {"f"})

    /* renamed from: f */
    private String f160287f;
    @AbstractC27891c(mo46611a = "cardImage", mo46612b = {"g"})

    /* renamed from: g */
    private String f160288g;
    @AbstractC27891c(mo46611a = "cardCode", mo46612b = {"h"})

    /* renamed from: h */
    private String f160289h;

    static {
        Covode.recordClassIndex(84059);
    }

    public String getAnchorTitle() {
        return this.f160283b;
    }

    public String getAppId() {
        return this.f160282a;
    }

    public String getAppTitle() {
        return this.f160283b;
    }

    public String getAppUrl() {
        return this.f160285d;
    }

    public String getCardCode() {
        return this.f160289h;
    }

    public String getCardImage() {
        return this.f160288g;
    }

    public String getDescription() {
        return this.f160284c;
    }

    public String getExtra() {
        return this.f160286e;
    }

    public String getSchema() {
        return this.f160287f;
    }

    public void setAppId(String str) {
        this.f160282a = str;
    }

    public void setAppTitle(String str) {
        this.f160283b = str;
    }

    public void setAppUrl(String str) {
        this.f160285d = str;
    }

    public void setCardCode(String str) {
        this.f160289h = str;
    }

    public void setCardImage(String str) {
        this.f160288g = str;
    }

    public void setDescription(String str) {
        this.f160284c = str;
    }

    public void setExtra(String str) {
        this.f160286e = str;
    }

    public void setSchema(String str) {
        this.f160287f = str;
    }
}
