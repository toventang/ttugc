package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.model.message.b.n */
public final class C9650n {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public Long f23512a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public Boolean f23513b;

    static {
        Covode.recordClassIndex(11192);
    }

    public C9650n(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9650n)) {
            return false;
        }
        C9650n nVar = (C9650n) obj;
        return C89219l.m154714a(this.f23512a, nVar.f23512a) && C89219l.m154714a(this.f23513b, nVar.f23513b);
    }

    public final int hashCode() {
        Long l = this.f23512a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Boolean bool = this.f23513b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SupportedActionsWrapper(actionType=" + this.f23512a + ", switch=" + this.f23513b + ")";
    }

    private C9650n() {
        this.f23512a = null;
        this.f23513b = null;
    }

    private /* synthetic */ C9650n(byte b) {
        this();
    }
}
