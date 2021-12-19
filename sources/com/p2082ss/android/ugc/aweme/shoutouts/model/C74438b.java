package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.b */
public final class C74438b {
    @AbstractC27891c(mo46611a = "order_id")

    /* renamed from: a */
    public final String f167400a;
    @AbstractC27891c(mo46611a = "video_info")

    /* renamed from: b */
    public final Aweme f167401b;

    static {
        Covode.recordClassIndex(87228);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74438b)) {
            return false;
        }
        C74438b bVar = (C74438b) obj;
        return C89219l.m154714a(this.f167400a, bVar.f167400a) && C89219l.m154714a(this.f167401b, bVar.f167401b);
    }

    public final int hashCode() {
        String str = this.f167400a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f167401b;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShoutoutsOrder(orderId=" + this.f167400a + ", aweme=" + this.f167401b + ")";
    }
}
