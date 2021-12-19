package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.y */
public final class C68720y {
    @AbstractC27891c(mo46611a = "promotion_url")

    /* renamed from: a */
    public final String f153731a;
    @AbstractC27891c(mo46611a = "enable_video_gift")

    /* renamed from: b */
    public final boolean f153732b;
    @AbstractC27891c(mo46611a = "privacy_url")

    /* renamed from: c */
    public final C68029bo f153733c;

    static {
        Covode.recordClassIndex(80987);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68720y)) {
            return false;
        }
        C68720y yVar = (C68720y) obj;
        return C89219l.m154714a(this.f153731a, yVar.f153731a) && this.f153732b == yVar.f153732b && C89219l.m154714a(this.f153733c, yVar.f153733c);
    }

    public final int hashCode() {
        String str = this.f153731a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f153732b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        C68029bo boVar = this.f153733c;
        if (boVar != null) {
            i = boVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "GiftSettings(promotionUrl=" + this.f153731a + ", enableVideoGift=" + this.f153732b + ", privacyUrls=" + this.f153733c + ")";
    }
}
