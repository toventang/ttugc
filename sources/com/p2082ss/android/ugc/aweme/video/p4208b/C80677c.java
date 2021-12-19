package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.b.c */
public final class C80677c {
    @AbstractC27891c(mo46611a = "dynamic_option_keys")

    /* renamed from: a */
    public final List<C80678d> f180374a = null;

    static {
        Covode.recordClassIndex(93958);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C80677c) && C89219l.m154714a(this.f180374a, ((C80677c) obj).f180374a);
        }
        return true;
    }

    public final int hashCode() {
        List<C80678d> list = this.f180374a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DynamicOptionConfig(dynamicOptionModelList=" + this.f180374a + ")";
    }

    private C80677c() {
    }
}
