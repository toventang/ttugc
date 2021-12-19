package com.p2082ss.android.ugc.aweme.commercialize.live.p2575a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.a.b */
public final class C38049b {
    @AbstractC27891c(mo46611a = "card_info")

    /* renamed from: a */
    public final CardStruct f89911a;

    static {
        Covode.recordClassIndex(45514);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C38049b) && C89219l.m154714a(this.f89911a, ((C38049b) obj).f89911a);
        }
        return true;
    }

    public final int hashCode() {
        CardStruct cardStruct = this.f89911a;
        if (cardStruct != null) {
            return cardStruct.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ComponentData(cardInfo=" + this.f89911a + ")";
    }
}
