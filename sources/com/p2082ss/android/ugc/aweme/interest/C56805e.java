package com.p2082ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.e */
public final class C56805e {

    /* renamed from: a */
    public final String f129370a;

    /* renamed from: b */
    public final String f129371b;

    /* renamed from: c */
    public final int f129372c;

    static {
        Covode.recordClassIndex(66671);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56805e)) {
            return false;
        }
        C56805e eVar = (C56805e) obj;
        return C89219l.m154714a(this.f129370a, eVar.f129370a) && C89219l.m154714a(this.f129371b, eVar.f129371b) && this.f129372c == eVar.f129372c;
    }

    public final int hashCode() {
        String str = this.f129370a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129371b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f129372c;
    }

    public final String toString() {
        return "UploadData(categoryData=" + this.f129370a + ", selectedInterestData=" + this.f129371b + ", selectedInterestsCount=" + this.f129372c + ")";
    }

    private /* synthetic */ C56805e() {
        this("", "", 0);
    }

    public C56805e(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f129370a = str;
        this.f129371b = str2;
        this.f129372c = i;
    }
}
