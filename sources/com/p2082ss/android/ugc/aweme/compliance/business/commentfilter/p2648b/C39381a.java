package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2648b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.b.a */
public final class C39381a {
    @AbstractC27891c(mo46611a = "words")

    /* renamed from: a */
    public final List<String> f92962a;

    static {
        Covode.recordClassIndex(47067);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39381a) && C89219l.m154714a(this.f92962a, ((C39381a) obj).f92962a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f92962a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Words(words=" + this.f92962a + ")";
    }

    private /* synthetic */ C39381a() {
        this(new ArrayList());
    }

    private C39381a(List<String> list) {
        C89219l.m154721d(list, "");
        this.f92962a = list;
    }
}
