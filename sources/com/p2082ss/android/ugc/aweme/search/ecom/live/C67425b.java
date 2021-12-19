package com.p2082ss.android.ugc.aweme.search.ecom.live;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.live.b */
public final class C67425b {

    /* renamed from: a */
    public Aweme f151057a;

    /* renamed from: b */
    public int f151058b;

    /* renamed from: c */
    public final List<String> f151059c;

    static {
        Covode.recordClassIndex(79059);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67425b)) {
            return false;
        }
        C67425b bVar = (C67425b) obj;
        return C89219l.m154714a(this.f151057a, bVar.f151057a) && this.f151058b == bVar.f151058b && C89219l.m154714a(this.f151059c, bVar.f151059c);
    }

    public final int hashCode() {
        Aweme aweme = this.f151057a;
        int i = 0;
        int hashCode = (((aweme != null ? aweme.hashCode() : 0) * 31) + this.f151058b) * 31;
        List<String> list = this.f151059c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LiveWithProductModel(aweme=" + this.f151057a + ", productIndex=" + this.f151058b + ", hasLogAnchorShow=" + this.f151059c + ")";
    }

    public /* synthetic */ C67425b(Aweme aweme) {
        this(aweme, new ArrayList());
    }

    private C67425b(Aweme aweme, List<String> list) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        this.f151057a = aweme;
        this.f151058b = 0;
        this.f151059c = list;
    }
}
