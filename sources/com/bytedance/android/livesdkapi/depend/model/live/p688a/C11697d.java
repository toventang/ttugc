package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.d */
public final class C11697d {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public C11694a f27992a;

    static {
        Covode.recordClassIndex(13385);
    }

    public C11697d(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C11697d) && C89219l.m154714a(this.f27992a, ((C11697d) obj).f27992a);
        }
        return true;
    }

    public final int hashCode() {
        C11694a aVar = this.f27992a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "BattleUserInfo(user=" + this.f27992a + ")";
    }

    private /* synthetic */ C11697d() {
        this((C11694a) null);
    }

    public C11697d(C11694a aVar) {
        this.f27992a = aVar;
    }
}
