package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.i */
public final class C65852i {
    @AbstractC27891c(mo46611a = "block_type")

    /* renamed from: a */
    public Integer f148400a;
    @AbstractC27891c(mo46611a = "mention_type")

    /* renamed from: b */
    public final Integer f148401b;

    static {
        Covode.recordClassIndex(77353);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65852i)) {
            return false;
        }
        C65852i iVar = (C65852i) obj;
        return C89219l.m154714a(this.f148400a, iVar.f148400a) && C89219l.m154714a(this.f148401b, iVar.f148401b);
    }

    public final int hashCode() {
        Integer num = this.f148400a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f148401b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserBlockedResult(blockType=" + this.f148400a + ", mentionType=" + this.f148401b + ")";
    }
}
