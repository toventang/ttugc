package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.h */
public final class C53752h extends AbstractC53732a {

    /* renamed from: a */
    public final C19638h f123288a;

    static {
        Covode.recordClassIndex(63332);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53752h) && C89219l.m154714a(this.f123288a, ((C53752h) obj).f123288a);
        }
        return true;
    }

    public final int hashCode() {
        C19638h hVar = this.f123288a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnCreateConversationEvent(conversation=" + this.f123288a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53752h(C19638h hVar) {
        super((byte) 0);
        C89219l.m154721d(hVar, "");
        this.f123288a = hVar;
    }
}
