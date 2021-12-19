package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ab */
public final class C38213ab implements Serializable {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    private boolean f90270a;
    @AbstractC27891c(mo46611a = "open_url")

    /* renamed from: b */
    private String f90271b;
    @AbstractC27891c(mo46611a = "web_url")

    /* renamed from: c */
    private String f90272c;
    @AbstractC27891c(mo46611a = "web_title")

    /* renamed from: d */
    private String f90273d;
    @AbstractC27891c(mo46611a = "appleid")

    /* renamed from: e */
    private String f90274e;
    @AbstractC27891c(mo46611a = "package")

    /* renamed from: f */
    private String f90275f;

    static {
        Covode.recordClassIndex(45697);
    }

    public final String getAppleId() {
        return this.f90274e;
    }

    public final boolean getEnable() {
        return this.f90270a;
    }

    public final String getOpenUrl() {
        return this.f90271b;
    }

    public final String getPackageName() {
        return this.f90275f;
    }

    public final String getWebTitle() {
        return this.f90273d;
    }

    public final String getWebUrl() {
        return this.f90272c;
    }

    public final void setAppleId(String str) {
        this.f90274e = str;
    }

    public final void setEnable(boolean z) {
        this.f90270a = z;
    }

    public final void setOpenUrl(String str) {
        this.f90271b = str;
    }

    public final void setPackageName(String str) {
        this.f90275f = str;
    }

    public final void setWebTitle(String str) {
        this.f90273d = str;
    }

    public final void setWebUrl(String str) {
        this.f90272c = str;
    }
}
