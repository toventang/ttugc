package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.z */
public final class C53770z extends AbstractC53732a {

    /* renamed from: a */
    public final C19638h f123322a;

    /* renamed from: b */
    public final int f123323b;

    static {
        Covode.recordClassIndex(63350);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53770z)) {
            return false;
        }
        C53770z zVar = (C53770z) obj;
        return C89219l.m154714a(this.f123322a, zVar.f123322a) && this.f123323b == zVar.f123323b;
    }

    public final int hashCode() {
        C19638h hVar = this.f123322a;
        return ((hVar != null ? hVar.hashCode() : 0) * 31) + this.f123323b;
    }

    public final String toString() {
        return "OnUpdateConversationEvent(conversation=" + this.f123322a + ", reason=" + this.f123323b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53770z(C19638h hVar, int i) {
        super((byte) 0);
        C89219l.m154721d(hVar, "");
        this.f123322a = hVar;
        this.f123323b = i;
    }
}
