package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11697d;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.model.message.b.l */
public final class C9648l {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public Long f23508a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public C11697d f23509b;

    static {
        Covode.recordClassIndex(11190);
    }

    public C9648l(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9648l)) {
            return false;
        }
        C9648l lVar = (C9648l) obj;
        return C89219l.m154714a(this.f23508a, lVar.f23508a) && C89219l.m154714a(this.f23509b, lVar.f23509b);
    }

    public final int hashCode() {
        Long l = this.f23508a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        C11697d dVar = this.f23509b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BattleUserInfoWrapper(userId=" + this.f23508a + ", userInfo=" + this.f23509b + ")";
    }

    private C9648l() {
        this.f23508a = null;
        this.f23509b = null;
    }

    private /* synthetic */ C9648l(byte b) {
        this();
    }
}
