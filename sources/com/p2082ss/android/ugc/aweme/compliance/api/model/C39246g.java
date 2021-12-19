package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.g */
public final class C39246g {
    @AbstractC27891c(mo46611a = "download")

    /* renamed from: a */
    public int f92701a;
    @AbstractC27891c(mo46611a = "duet")

    /* renamed from: b */
    public int f92702b;
    @AbstractC27891c(mo46611a = "stitch")

    /* renamed from: c */
    public int f92703c;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)

    /* renamed from: d */
    public int f92704d;

    static {
        Covode.recordClassIndex(46904);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39246g)) {
            return false;
        }
        C39246g gVar = (C39246g) obj;
        return this.f92701a == gVar.f92701a && this.f92702b == gVar.f92702b && this.f92703c == gVar.f92703c && this.f92704d == gVar.f92704d;
    }

    public final int hashCode() {
        return (((((this.f92701a * 31) + this.f92702b) * 31) + this.f92703c) * 31) + this.f92704d;
    }

    public final String toString() {
        return "ItemSettings(download=" + this.f92701a + ", duet=" + this.f92702b + ", stitch=" + this.f92703c + ", comment=" + this.f92704d + ")";
    }

    public C39246g(int i, int i2, int i3, int i4) {
        this.f92701a = i;
        this.f92702b = i2;
        this.f92703c = i3;
        this.f92704d = i4;
    }
}
