package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.g */
public final class C36960g {
    @AbstractC27891c(mo46611a = "gift_and_senders")

    /* renamed from: a */
    public final C36954a f87042a;

    static {
        Covode.recordClassIndex(44308);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C36960g) && C89219l.m154714a(this.f87042a, ((C36960g) obj).f87042a);
        }
        return true;
    }

    public final int hashCode() {
        C36954a aVar = this.f87042a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiftSupporterPanelTopBanner(topGiftAndSenders=" + this.f87042a + ")";
    }
}
