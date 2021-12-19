package com.bytedance.android.live.broadcast.api.blockword.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.blockword.model.a */
public final class C3043a {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public int f8883a = -1;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    public String f8884b;

    static {
        Covode.recordClassIndex(3521);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3043a)) {
            return false;
        }
        C3043a aVar = (C3043a) obj;
        return this.f8883a == aVar.f8883a && C89219l.m154714a(this.f8884b, aVar.f8884b);
    }

    public final int hashCode() {
        int i = this.f8883a * 31;
        String str = this.f8884b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BlockWord(id=" + this.f8883a + ", content=" + this.f8884b + ")";
    }

    public C3043a(String str) {
        C89219l.m154721d(str, "");
        this.f8884b = str;
    }
}
