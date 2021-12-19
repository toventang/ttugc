package com.p2082ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.m */
public final class C71848m {

    /* renamed from: a */
    public final int f161017a;

    /* renamed from: b */
    public final String f161018b;

    static {
        Covode.recordClassIndex(84397);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71848m)) {
            return false;
        }
        C71848m mVar = (C71848m) obj;
        return this.f161017a == mVar.f161017a && C89219l.m154714a(this.f161018b, mVar.f161018b);
    }

    public final int hashCode() {
        int i = this.f161017a * 31;
        String str = this.f161018b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "WaterFile(index=" + this.f161017a + ", path=" + this.f161018b + ")";
    }

    public C71848m(int i, String str) {
        C89219l.m154721d(str, "");
        this.f161017a = i;
        this.f161018b = str;
    }
}
