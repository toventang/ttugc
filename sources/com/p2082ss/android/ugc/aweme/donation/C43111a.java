package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.a */
public final class C43111a {
    @AbstractC27891c(mo46611a = "banner_schema_url")

    /* renamed from: a */
    public final String f100455a;
    @AbstractC27891c(mo46611a = "banner_url")

    /* renamed from: b */
    public final String f100456b;

    static {
        Covode.recordClassIndex(51282);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43111a)) {
            return false;
        }
        C43111a aVar = (C43111a) obj;
        return C89219l.m154714a(this.f100455a, aVar.f100455a) && C89219l.m154714a(this.f100456b, aVar.f100456b);
    }

    public final int hashCode() {
        String str = this.f100455a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100456b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BannerStruct(bannerSiteUrl=" + this.f100455a + ", bannerImageUrl=" + this.f100456b + ")";
    }
}
