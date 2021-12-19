package com.bytedance.ies.bullet.kit.lynx.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.model.d */
public final class C16447d {

    /* renamed from: a */
    public final String f39505a;

    /* renamed from: b */
    public final String f39506b;

    static {
        Covode.recordClassIndex(18755);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16447d)) {
            return false;
        }
        C16447d dVar = (C16447d) obj;
        return C89219l.m154714a(this.f39505a, dVar.f39505a) && C89219l.m154714a(this.f39506b, dVar.f39506b);
    }

    public final int hashCode() {
        String str = this.f39505a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f39506b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LynxCommonData(containerID=" + this.f39505a + ", protocolVersion=" + this.f39506b + ")";
    }

    public /* synthetic */ C16447d(String str) {
        this(str, "1.0");
    }

    private C16447d(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f39505a = str;
        this.f39506b = str2;
    }
}
