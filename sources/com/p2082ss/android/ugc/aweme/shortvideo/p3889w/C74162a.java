package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.a */
public final class C74162a {

    /* renamed from: a */
    public final boolean f166564a;

    static {
        Covode.recordClassIndex(86921);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C74162a) && this.f166564a == ((C74162a) obj).f166564a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f166564a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "CloseRecordingEvent(closeTrimmingActivity=" + this.f166564a + ")";
    }

    public C74162a(boolean z) {
        this.f166564a = z;
    }
}
