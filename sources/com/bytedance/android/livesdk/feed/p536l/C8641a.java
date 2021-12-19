package com.bytedance.android.livesdk.feed.p536l;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.feed.l.a */
public final class C8641a {

    /* renamed from: a */
    public List<FeedItem> f21360a;

    /* renamed from: b */
    public C2965a f21361b;

    static {
        Covode.recordClassIndex(9498);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8641a)) {
            return false;
        }
        C8641a aVar = (C8641a) obj;
        return C89219l.m154714a(this.f21360a, aVar.f21360a) && C89219l.m154714a(this.f21361b, aVar.f21361b);
    }

    public final int hashCode() {
        List<FeedItem> list = this.f21360a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C2965a aVar = this.f21361b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FeedData(feedItems=" + this.f21360a + ", feedExtra=" + this.f21361b + ")";
    }

    public C8641a(List<FeedItem> list, C2965a aVar) {
        this.f21360a = list;
        this.f21361b = aVar;
    }
}
