package com.p2082ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.a */
public final class C49015a {

    /* renamed from: a */
    public Aweme f112938a;

    /* renamed from: b */
    public String f112939b;

    static {
        Covode.recordClassIndex(57806);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49015a)) {
            return false;
        }
        C49015a aVar = (C49015a) obj;
        return C89219l.m154714a(this.f112938a, aVar.f112938a) && C89219l.m154714a(this.f112939b, aVar.f112939b);
    }

    public final int hashCode() {
        Aweme aweme = this.f112938a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f112939b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AnimateItem(aweme=" + this.f112938a + ", eventType=" + this.f112939b + ")";
    }

    public C49015a(Aweme aweme, String str) {
        this.f112938a = aweme;
        this.f112939b = str;
    }
}
