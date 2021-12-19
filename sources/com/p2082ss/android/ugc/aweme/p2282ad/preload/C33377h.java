package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.h */
public final class C33377h {

    /* renamed from: a */
    public long f79320a;

    /* renamed from: b */
    public int f79321b;

    /* renamed from: c */
    public final long f79322c;

    /* renamed from: d */
    public final String f79323d;

    /* renamed from: e */
    public AwemeRawAd f79324e;

    static {
        Covode.recordClassIndex(40223);
    }

    public C33377h() {
        this(0, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33377h)) {
            return false;
        }
        C33377h hVar = (C33377h) obj;
        return this.f79322c == hVar.f79322c && C89219l.m154714a(this.f79323d, hVar.f79323d) && C89219l.m154714a(this.f79324e, hVar.f79324e);
    }

    public final String toString() {
        return "PreloadDownloadMsg(creativeId=" + this.f79322c + ", logExtra=" + this.f79323d + ", rawAd=" + this.f79324e + ")";
    }

    public final int hashCode() {
        int i;
        long j = this.f79322c;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f79323d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        AwemeRawAd awemeRawAd = this.f79324e;
        if (awemeRawAd != null) {
            i3 = awemeRawAd.hashCode();
        }
        return i4 + i3;
    }

    public C33377h(long j, String str, AwemeRawAd awemeRawAd) {
        this.f79322c = j;
        this.f79323d = str;
        this.f79324e = awemeRawAd;
        this.f79321b = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33377h(long j, String str, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? "" : str, (AwemeRawAd) null);
    }
}
