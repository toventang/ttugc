package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.d */
public final class C9370d {

    /* renamed from: a */
    public final String f22859a;

    /* renamed from: b */
    public final int f22860b;

    static {
        Covode.recordClassIndex(10877);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9370d)) {
            return false;
        }
        C9370d dVar = (C9370d) obj;
        return C89219l.m154714a(this.f22859a, dVar.f22859a) && this.f22860b == dVar.f22860b;
    }

    public final int hashCode() {
        String str = this.f22859a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f22860b;
    }

    public final String toString() {
        return "LynxCard(containerId=" + this.f22859a + ", priority=" + this.f22860b + ")";
    }

    public C9370d(String str, int i) {
        C89219l.m154721d(str, "");
        this.f22859a = str;
        this.f22860b = i;
    }
}
