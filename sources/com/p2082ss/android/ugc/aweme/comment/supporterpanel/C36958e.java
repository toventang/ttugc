package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.e */
public final class C36958e {
    @AbstractC27891c(mo46611a = "top_banner")

    /* renamed from: a */
    public final C36960g f87037a;
    @AbstractC27891c(mo46611a = "gift_and_senders")

    /* renamed from: b */
    public final List<C36954a> f87038b;

    static {
        Covode.recordClassIndex(44306);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36958e)) {
            return false;
        }
        C36958e eVar = (C36958e) obj;
        return C89219l.m154714a(this.f87037a, eVar.f87037a) && C89219l.m154714a(this.f87038b, eVar.f87038b);
    }

    public final int hashCode() {
        C36960g gVar = this.f87037a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        List<C36954a> list = this.f87038b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GiftSupporterPanelInfo(topBanner=" + this.f87037a + ", otherGifts=" + this.f87038b + ")";
    }
}
