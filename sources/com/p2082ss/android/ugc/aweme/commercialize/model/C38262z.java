package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.z */
public class C38262z implements Serializable {
    @AbstractC27891c(mo46611a = "open_url")

    /* renamed from: a */
    String f90423a;
    @AbstractC27891c(mo46611a = "web_url")

    /* renamed from: b */
    String f90424b;
    @AbstractC27891c(mo46611a = "web_title")

    /* renamed from: c */
    String f90425c;
    @AbstractC27891c(mo46611a = "source_type")

    /* renamed from: d */
    String f90426d;
    @AbstractC27891c(mo46611a = "source_url")

    /* renamed from: e */
    UrlModel f90427e;
    @AbstractC27891c(mo46611a = "is_h5")

    /* renamed from: f */
    boolean f90428f;
    @AbstractC27891c(mo46611a = "easter_egg_id")

    /* renamed from: g */
    String f90429g;
    @AbstractC27891c(mo46611a = "easter_egg_name")

    /* renamed from: h */
    String f90430h;

    static {
        Covode.recordClassIndex(45746);
    }

    public String getId() {
        return this.f90429g;
    }

    public String getName() {
        return this.f90430h;
    }

    public String getOpenUrl() {
        return this.f90423a;
    }

    public String getSourceType() {
        return this.f90426d;
    }

    public UrlModel getSourceUrl() {
        return this.f90427e;
    }

    public String getWebTitle() {
        return this.f90425c;
    }

    public String getWebUrl() {
        return this.f90424b;
    }

    public boolean isH5() {
        return this.f90428f;
    }

    public void setId(String str) {
        this.f90429g = str;
    }

    public void setName(String str) {
        this.f90430h = str;
    }

    public void setOpenUrl(String str) {
        this.f90423a = str;
    }

    public void setSourceType(String str) {
        this.f90426d = str;
    }

    public void setSourceUrl(UrlModel urlModel) {
        this.f90427e = urlModel;
    }

    public void setWebTitle(String str) {
        this.f90425c = str;
    }

    public void setWebUrl(String str) {
        this.f90424b = str;
    }
}
