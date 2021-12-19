package com.p2082ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.d */
public final class C50721d {

    /* renamed from: a */
    public final String f117088a;

    /* renamed from: b */
    public final String f117089b;

    static {
        Covode.recordClassIndex(59883);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50721d)) {
            return false;
        }
        C50721d dVar = (C50721d) obj;
        return C89219l.m154714a(this.f117088a, dVar.f117088a) && C89219l.m154714a(this.f117089b, dVar.f117089b);
    }

    public final int hashCode() {
        String str = this.f117088a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117089b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterPaths(filterFilePath=" + this.f117088a + ", filterFolder=" + this.f117089b + ")";
    }

    public C50721d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f117088a = str;
        this.f117089b = str2;
    }
}
