package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.d */
public final class C50696d {

    /* renamed from: a */
    public final int f117041a;

    /* renamed from: b */
    public final EnumC50699g f117042b;

    /* renamed from: c */
    public final String f117043c;

    /* renamed from: d */
    public final String f117044d;

    static {
        Covode.recordClassIndex(59858);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50696d)) {
            return false;
        }
        C50696d dVar = (C50696d) obj;
        return this.f117041a == dVar.f117041a && C89219l.m154714a(this.f117042b, dVar.f117042b) && C89219l.m154714a(this.f117043c, dVar.f117043c) && C89219l.m154714a(this.f117044d, dVar.f117044d);
    }

    public final int hashCode() {
        int i = this.f117041a * 31;
        EnumC50699g gVar = this.f117042b;
        int i2 = 0;
        int hashCode = (i + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f117043c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f117044d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FilterInfo(id=" + this.f117041a + ", state=" + this.f117042b + ", filterFilePath=" + this.f117043c + ", filterFolder=" + this.f117044d + ")";
    }

    public C50696d(int i, EnumC50699g gVar, String str, String str2) {
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f117041a = i;
        this.f117042b = gVar;
        this.f117043c = str;
        this.f117044d = str2;
    }
}
