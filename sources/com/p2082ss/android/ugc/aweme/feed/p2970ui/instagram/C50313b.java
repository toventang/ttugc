package com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.b */
public final class C50313b {

    /* renamed from: a */
    public final String f116177a;

    /* renamed from: b */
    public final String f116178b;

    /* renamed from: c */
    public final String f116179c;

    /* renamed from: d */
    public final String f116180d;

    static {
        Covode.recordClassIndex(59441);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C50313b) && C89219l.m154714a(this.f116180d, ((C50313b) obj).f116180d);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f116180d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoreKey(platformName=" + this.f116180d + ")";
    }

    public C50313b(String str) {
        C89219l.m154721d(str, "");
        this.f116180d = str;
        this.f116177a = str + "_dialog_bind_phone_or_email";
        this.f116178b = str + "_dialog_last_time_appear";
        this.f116179c = str + "_dialog_has_bind";
    }
}
