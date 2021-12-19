package com.p2082ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.j */
public final class C59619j implements AbstractC12798a {

    /* renamed from: a */
    public final int f135987a;

    /* renamed from: b */
    public String f135988b;

    /* renamed from: c */
    public String f135989c;

    static {
        Covode.recordClassIndex(70016);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59619j)) {
            return false;
        }
        C59619j jVar = (C59619j) obj;
        return this.f135987a == jVar.f135987a && C89219l.m154714a(this.f135988b, jVar.f135988b) && C89219l.m154714a(this.f135989c, jVar.f135989c);
    }

    public final int hashCode() {
        int i = this.f135987a * 31;
        String str = this.f135988b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f135989c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EditPlayListNameFragmentData(openFragmentType=" + this.f135987a + ", lastName=" + this.f135988b + ", mixId=" + this.f135989c + ")";
    }

    public /* synthetic */ C59619j() {
        this(1, null, null);
    }

    public C59619j(int i, String str, String str2) {
        this.f135987a = i;
        this.f135988b = str;
        this.f135989c = str2;
    }
}
