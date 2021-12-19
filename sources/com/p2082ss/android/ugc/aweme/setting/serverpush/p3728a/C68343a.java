package com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.a */
public final class C68343a implements Serializable {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    String f152929a;
    @AbstractC27891c(mo46611a = "en_name")

    /* renamed from: b */
    String f152930b;
    @AbstractC27891c(mo46611a = "local_name")

    /* renamed from: c */
    String f152931c;

    static {
        Covode.recordClassIndex(80568);
    }

    public final String getEnglishName() {
        return this.f152930b;
    }

    public final String getLanguageCode() {
        return this.f152929a;
    }

    public final String getLocalName() {
        return this.f152931c;
    }

    public final void setEnglishName(String str) {
        this.f152930b = str;
    }

    public final void setLanguageCode(String str) {
        this.f152929a = str;
    }

    public final void setLocalName(String str) {
        this.f152931c = str;
    }
}
