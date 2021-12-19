package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.i */
public final class C53753i extends AbstractC53746c {

    /* renamed from: a */
    public final C19538ai f123289a;

    static {
        Covode.recordClassIndex(63333);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53753i) && C89219l.m154714a(this.f123289a, ((C53753i) obj).f123289a);
        }
        return true;
    }

    public final int hashCode() {
        C19538ai aiVar = this.f123289a;
        if (aiVar != null) {
            return aiVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnDelMessageEvent(message=" + this.f123289a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53753i(C19538ai aiVar) {
        super((byte) 0);
        C89219l.m154721d(aiVar, "");
        this.f123289a = aiVar;
    }
}
