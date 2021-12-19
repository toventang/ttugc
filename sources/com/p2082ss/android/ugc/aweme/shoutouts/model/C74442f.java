package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.f */
public final class C74442f {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f167416a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f167417b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final boolean f167418c;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: d */
    public final int f167419d;
    @AbstractC27891c(mo46611a = "ratings")

    /* renamed from: e */
    public final ArrayList<C74441e> f167420e;

    static {
        Covode.recordClassIndex(87232);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74442f)) {
            return false;
        }
        C74442f fVar = (C74442f) obj;
        return this.f167416a == fVar.f167416a && C89219l.m154714a(this.f167417b, fVar.f167417b) && this.f167418c == fVar.f167418c && this.f167419d == fVar.f167419d && C89219l.m154714a(this.f167420e, fVar.f167420e);
    }

    public final int hashCode() {
        int i = this.f167416a * 31;
        String str = this.f167417b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f167418c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((hashCode + i3) * 31) + this.f167419d) * 31;
        ArrayList<C74441e> arrayList = this.f167420e;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ShoutoutsProductRatingListResp(statusCode=" + this.f167416a + ", statusMsg=" + this.f167417b + ", hasMore=" + this.f167418c + ", total=" + this.f167419d + ", ratings=" + this.f167420e + ")";
    }
}
