package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.blockword.model.c */
public final class C3045c {
    @AbstractC27891c(mo46611a = "word")

    /* renamed from: a */
    public final List<C3043a> f8886a;

    static {
        Covode.recordClassIndex(3523);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3045c) && C89219l.m154714a(this.f8886a, ((C3045c) obj).f8886a);
        }
        return true;
    }

    public final int hashCode() {
        List<C3043a> list = this.f8886a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BlockWordGetResponse(words=" + this.f8886a + ")";
    }
}
