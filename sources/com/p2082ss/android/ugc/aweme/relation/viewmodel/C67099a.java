package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.a */
public final class C67099a {

    /* renamed from: a */
    public final boolean f150481a;

    /* renamed from: b */
    public final int f150482b;

    static {
        Covode.recordClassIndex(78681);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67099a)) {
            return false;
        }
        C67099a aVar = (C67099a) obj;
        return this.f150481a == aVar.f150481a && this.f150482b == aVar.f150482b;
    }

    public final int hashCode() {
        boolean z = this.f150481a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f150482b;
    }

    public final String toString() {
        return "DoubleCursor(isFirst=" + this.f150481a + ", cursor=" + this.f150482b + ")";
    }

    public C67099a(boolean z, int i) {
        this.f150481a = z;
        this.f150482b = i;
    }
}
