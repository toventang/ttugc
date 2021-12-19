package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.blockword.model.b */
public final class C3044b {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final Integer f8885a;

    static {
        Covode.recordClassIndex(3522);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3044b) && C89219l.m154714a(this.f8885a, ((C3044b) obj).f8885a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f8885a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BlockWordAddResponse(id=" + this.f8885a + ")";
    }
}
