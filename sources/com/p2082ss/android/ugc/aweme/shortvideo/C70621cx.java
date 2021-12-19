package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cx */
public final class C70621cx {

    /* renamed from: a */
    public final String f158049a;

    /* renamed from: b */
    public final String f158050b;

    /* renamed from: c */
    public final String f158051c;

    static {
        Covode.recordClassIndex(83087);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70621cx)) {
            return false;
        }
        C70621cx cxVar = (C70621cx) obj;
        return C89219l.m154714a(this.f158049a, cxVar.f158049a) && C89219l.m154714a(this.f158050b, cxVar.f158050b) && C89219l.m154714a(this.f158051c, cxVar.f158051c);
    }

    public final int hashCode() {
        String str = this.f158049a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f158050b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f158051c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RecordCommonParameter(shootWay=" + this.f158049a + ", creationId=" + this.f158050b + ", enterForm=" + this.f158051c + ")";
    }

    public /* synthetic */ C70621cx() {
        this("", "", "");
    }

    public C70621cx(String str, String str2, String str3) {
        this.f158049a = str;
        this.f158050b = str2;
        this.f158051c = str3;
    }
}
