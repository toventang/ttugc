package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.b */
public final class C32378b {
    @AbstractC27891c(mo46611a = "result")

    /* renamed from: a */
    public final String f77208a = null;
    @AbstractC27891c(mo46611a = "verify_ticket")

    /* renamed from: b */
    public final String f77209b = null;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: c */
    public final String f77210c = null;
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: d */
    public final Integer f77211d = null;

    static {
        Covode.recordClassIndex(39146);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32378b)) {
            return false;
        }
        C32378b bVar = (C32378b) obj;
        return C89219l.m154714a(this.f77208a, bVar.f77208a) && C89219l.m154714a(this.f77209b, bVar.f77209b) && C89219l.m154714a(this.f77210c, bVar.f77210c) && C89219l.m154714a(this.f77211d, bVar.f77211d);
    }

    public final int hashCode() {
        String str = this.f77208a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77209b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77210c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f77211d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Check2SvPushClickResponse(result=" + this.f77208a + ", verify_ticket=" + this.f77209b + ", description=" + this.f77210c + ", error_code=" + this.f77211d + ")";
    }

    private C32378b() {
    }
}
