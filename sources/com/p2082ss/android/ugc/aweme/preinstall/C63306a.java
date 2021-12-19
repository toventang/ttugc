package com.p2082ss.android.ugc.aweme.preinstall;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preinstall.a */
public final class C63306a {

    /* renamed from: a */
    public final String f143690a;

    static {
        Covode.recordClassIndex(74586);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C63306a) && C89219l.m154714a(this.f143690a, ((C63306a) obj).f143690a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f143690a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PreInstallParams(transsonicCode=" + this.f143690a + ")";
    }
}
