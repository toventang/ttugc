package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.r */
public final class C15324r implements AbstractC15308f {

    /* renamed from: a */
    public final String f37399a;

    /* renamed from: b */
    public final String f37400b;

    static {
        Covode.recordClassIndex(17554);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15324r)) {
            return false;
        }
        C15324r rVar = (C15324r) obj;
        return C89219l.m154714a(this.f37399a, rVar.f37399a) && C89219l.m154714a(this.f37400b, rVar.f37400b);
    }

    public final int hashCode() {
        String str = this.f37399a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37400b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UploadALogEvent(code=" + this.f37399a + ", message=" + this.f37400b + ")";
    }

    private /* synthetic */ C15324r() {
        this(null, null);
    }

    public C15324r(String str, String str2) {
        this.f37399a = str;
        this.f37400b = str2;
    }
}
