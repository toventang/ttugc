package com.bytedance.ies.bullet.kit.p1156rn;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.rn.k */
public final class C16467k {

    /* renamed from: a */
    public final List<String> f39510a;

    /* renamed from: b */
    public final String f39511b = null;

    static {
        Covode.recordClassIndex(18864);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16467k)) {
            return false;
        }
        C16467k kVar = (C16467k) obj;
        return C89219l.m154714a(this.f39510a, kVar.f39510a) && C89219l.m154714a(this.f39511b, kVar.f39511b);
    }

    public final int hashCode() {
        List<String> list = this.f39510a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f39511b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SourceUrlSettings(whiteListHosts=" + this.f39510a + ", debugSafeHost=" + this.f39511b + ")";
    }

    public C16467k(List<String> list) {
        C89219l.m154719c(list, "");
        this.f39510a = list;
    }
}
