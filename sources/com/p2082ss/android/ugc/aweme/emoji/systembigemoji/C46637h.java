package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.h */
public final class C46637h extends AbstractC56225a {

    /* renamed from: a */
    public final boolean f108754a;

    /* renamed from: b */
    public final long f108755b;

    static {
        Covode.recordClassIndex(55228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46637h)) {
            return false;
        }
        C46637h hVar = (C46637h) obj;
        return this.f108754a == hVar.f108754a && this.f108755b == hVar.f108755b;
    }

    public final int hashCode() {
        boolean z = this.f108754a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long j = this.f108755b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "StickerDownloadEventBody(success=" + this.f108754a + ", resourceID=" + this.f108755b + ")";
    }

    public C46637h(boolean z, long j) {
        super(C89041ag.m154421a(C89387v.m154943a("is_successful", Boolean.valueOf(z)), C89387v.m154943a("resource_id", Long.valueOf(j))), null, null, 6);
        this.f108754a = z;
        this.f108755b = j;
    }
}
