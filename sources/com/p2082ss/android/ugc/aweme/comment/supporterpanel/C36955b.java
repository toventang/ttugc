package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.b */
public final class C36955b {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f87019a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f87020b;
    @AbstractC27891c(mo46611a = "senders")

    /* renamed from: c */
    public final List<C36957d> f87021c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public final boolean f87022d;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: e */
    public final Long f87023e;

    static {
        Covode.recordClassIndex(44303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36955b)) {
            return false;
        }
        C36955b bVar = (C36955b) obj;
        return this.f87019a == bVar.f87019a && C89219l.m154714a(this.f87020b, bVar.f87020b) && C89219l.m154714a(this.f87021c, bVar.f87021c) && this.f87022d == bVar.f87022d && C89219l.m154714a(this.f87023e, bVar.f87023e);
    }

    public final int hashCode() {
        int i = this.f87019a * 31;
        String str = this.f87020b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<C36957d> list = this.f87021c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f87022d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        Long l = this.f87023e;
        if (l != null) {
            i2 = l.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "GiftListPanelResponse(code=" + this.f87019a + ", msg=" + this.f87020b + ", senders=" + this.f87021c + ", hasMore=" + this.f87022d + ", cursor=" + this.f87023e + ")";
    }
}
