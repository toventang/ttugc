package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.model.message.b.o */
public final class C9651o {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public Long f23514a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public C9645j f23515b;

    static {
        Covode.recordClassIndex(11193);
    }

    public C9651o(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9651o)) {
            return false;
        }
        C9651o oVar = (C9651o) obj;
        return C89219l.m154714a(this.f23514a, oVar.f23514a) && C89219l.m154714a(this.f23515b, oVar.f23515b);
    }

    public final int hashCode() {
        Long l = this.f23514a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        C9645j jVar = this.f23515b;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserArmiesWrapper(userId=" + this.f23514a + ", userArmies=" + this.f23515b + ")";
    }

    private C9651o() {
        this.f23514a = null;
        this.f23515b = null;
    }

    private /* synthetic */ C9651o(byte b) {
        this();
    }
}
