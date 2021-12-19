package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.n */
public final class C53758n extends AbstractC53732a {

    /* renamed from: a */
    public final C19638h f123298a;

    static {
        Covode.recordClassIndex(63338);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53758n) && C89219l.m154714a(this.f123298a, ((C53758n) obj).f123298a);
        }
        return true;
    }

    public final int hashCode() {
        C19638h hVar = this.f123298a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnLeaveConversationEvent(conversation=" + this.f123298a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53758n(C19638h hVar) {
        super((byte) 0);
        C89219l.m154721d(hVar, "");
        this.f123298a = hVar;
    }
}
