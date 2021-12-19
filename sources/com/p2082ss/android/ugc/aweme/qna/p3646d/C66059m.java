package com.p2082ss.android.ugc.aweme.qna.p3646d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.d.m */
public final class C66059m {

    /* renamed from: a */
    public final boolean f148759a;

    /* renamed from: b */
    public final String f148760b;

    /* renamed from: c */
    public final String f148761c;

    /* renamed from: d */
    public final String f148762d;

    static {
        Covode.recordClassIndex(77565);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66059m)) {
            return false;
        }
        C66059m mVar = (C66059m) obj;
        return this.f148759a == mVar.f148759a && C89219l.m154714a(this.f148760b, mVar.f148760b) && C89219l.m154714a(this.f148761c, mVar.f148761c) && C89219l.m154714a(this.f148762d, mVar.f148762d);
    }

    public final int hashCode() {
        boolean z = this.f148759a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f148760b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f148761c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f148762d;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "TranslationResult(translationSuccess=" + this.f148759a + ", questionId=" + this.f148760b + ", originalString=" + this.f148761c + ", translatedString=" + this.f148762d + ")";
    }

    public C66059m(boolean z, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f148759a = z;
        this.f148760b = str;
        this.f148761c = str2;
        this.f148762d = str3;
    }
}
