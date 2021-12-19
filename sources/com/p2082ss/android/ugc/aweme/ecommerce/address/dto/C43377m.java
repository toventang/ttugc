package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.m */
public final class C43377m {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    public final String f101237a;

    static {
        Covode.recordClassIndex(51603);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43377m) && C89219l.m154714a(this.f101237a, ((C43377m) obj).f101237a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f101237a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ViewItem(text=" + this.f101237a + ")";
    }

    public C43377m(String str) {
        this.f101237a = str;
    }
}
