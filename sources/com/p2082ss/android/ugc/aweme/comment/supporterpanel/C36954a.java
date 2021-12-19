package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.a */
public final class C36954a {
    @AbstractC27891c(mo46611a = "gift")

    /* renamed from: a */
    public final C36956c f87016a;
    @AbstractC27891c(mo46611a = "senders")

    /* renamed from: b */
    public final List<C36957d> f87017b;

    /* renamed from: c */
    public String f87018c;

    static {
        Covode.recordClassIndex(44302);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36954a)) {
            return false;
        }
        C36954a aVar = (C36954a) obj;
        return C89219l.m154714a(this.f87016a, aVar.f87016a) && C89219l.m154714a(this.f87017b, aVar.f87017b) && C89219l.m154714a(this.f87018c, aVar.f87018c);
    }

    public final int hashCode() {
        C36956c cVar = this.f87016a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        List<C36957d> list = this.f87017b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f87018c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "GiftAndSenders(gift=" + this.f87016a + ", giftSenders=" + this.f87017b + ", selectedType=" + this.f87018c + ")";
    }

    /* renamed from: a */
    public final void mo64442a(String str) {
        C89219l.m154721d(str, "");
        this.f87018c = str;
    }
}
