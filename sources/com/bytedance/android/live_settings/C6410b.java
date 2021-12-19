package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live_settings.b */
public final class C6410b {
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: a */
    public AbstractC28019l f15978a;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: b */
    public final String f15979b;
    @AbstractC27891c(mo46611a = "isDefault")

    /* renamed from: c */
    public final boolean f15980c;

    static {
        Covode.recordClassIndex(7142);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6410b)) {
            return false;
        }
        C6410b bVar = (C6410b) obj;
        return C89219l.m154714a(this.f15978a, bVar.f15978a) && C89219l.m154714a(this.f15979b, bVar.f15979b) && this.f15980c == bVar.f15980c;
    }

    public final int hashCode() {
        AbstractC28019l lVar = this.f15978a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        String str = this.f15979b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f15980c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "Group(value=" + this.f15978a + ", desc=" + this.f15979b + ", isDefault=" + this.f15980c + ")";
    }

    public C6410b(AbstractC28019l lVar, String str, boolean z) {
        C89219l.m154719c(lVar, "");
        C89219l.m154719c(str, "");
        this.f15978a = lVar;
        this.f15979b = str;
        this.f15980c = z;
    }
}
