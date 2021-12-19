package com.p2082ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.api.response.a */
public final class C59395a {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f135675a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f135676b;
    @AbstractC27891c(mo46611a = "is_valid")

    /* renamed from: c */
    public final boolean f135677c;
    @AbstractC27891c(mo46611a = "invalid_reason")

    /* renamed from: d */
    public final String f135678d;

    static {
        Covode.recordClassIndex(69787);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59395a)) {
            return false;
        }
        C59395a aVar = (C59395a) obj;
        return this.f135675a == aVar.f135675a && C89219l.m154714a(this.f135676b, aVar.f135676b) && this.f135677c == aVar.f135677c && C89219l.m154714a(this.f135678d, aVar.f135678d);
    }

    public final int hashCode() {
        int i = this.f135675a * 31;
        String str = this.f135676b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f135677c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        String str2 = this.f135678d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "CheckPlayResponse(statusCode=" + this.f135675a + ", statusMsg=" + this.f135676b + ", isValid=" + this.f135677c + ", invalidReason=" + this.f135678d + ")";
    }
}
