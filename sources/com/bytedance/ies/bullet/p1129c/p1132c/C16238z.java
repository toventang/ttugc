package com.bytedance.ies.bullet.p1129c.p1132c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.z */
public final class C16238z {

    /* renamed from: a */
    public final String f39033a;

    static {
        Covode.recordClassIndex(18531);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C16238z) && C89219l.m154714a(this.f39033a, ((C16238z) obj).f39033a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f39033a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SessionInfo(id=" + this.f39033a + ")";
    }

    public C16238z(String str) {
        C89219l.m154719c(str, "");
        this.f39033a = str;
    }
}
