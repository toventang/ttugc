package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.g */
public final class C43371g {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    public final String f101229a;

    static {
        Covode.recordClassIndex(51597);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43371g) && C89219l.m154714a(this.f101229a, ((C43371g) obj).f101229a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f101229a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CandiHeader(text=" + this.f101229a + ")";
    }
}
