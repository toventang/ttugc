package com.bytedance.lynx.hybrid.p1515a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.a.n */
public final class C21160n {

    /* renamed from: a */
    public final String f50186a;

    static {
        Covode.recordClassIndex(24776);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C21160n) && C89219l.m154714a(this.f50186a, ((C21160n) obj).f50186a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f50186a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SessionInfo(id=" + this.f50186a + ")";
    }

    public C21160n(String str) {
        C89219l.m154719c(str, "");
        this.f50186a = str;
    }
}
