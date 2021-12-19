package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.settings.s */
public final class C68753s {
    @AbstractC27891c(mo46611a = "xss_callback_id_switch")

    /* renamed from: a */
    public final boolean f153791a;
    @AbstractC27891c(mo46611a = "xss_url_change_switch")

    /* renamed from: b */
    public final boolean f153792b;

    static {
        Covode.recordClassIndex(81022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68753s)) {
            return false;
        }
        C68753s sVar = (C68753s) obj;
        return this.f153791a == sVar.f153791a && this.f153792b == sVar.f153792b;
    }

    public final int hashCode() {
        boolean z = this.f153791a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f153792b) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "Js2XssConfig(xssCallBackEnable=" + this.f153791a + ", xssUrlChangedEnable=" + this.f153792b + ")";
    }

    private C68753s() {
        this.f153791a = false;
        this.f153792b = false;
    }

    public /* synthetic */ C68753s(byte b) {
        this();
    }
}
