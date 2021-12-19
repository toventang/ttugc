package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19638h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.k */
public final class C53755k extends AbstractC53732a {

    /* renamed from: a */
    public final C19638h f123291a;

    static {
        Covode.recordClassIndex(63335);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53755k) && C89219l.m154714a(this.f123291a, ((C53755k) obj).f123291a);
        }
        return true;
    }

    public final int hashCode() {
        C19638h hVar = this.f123291a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnDissolvedConversationEvent(conversation=" + this.f123291a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53755k(C19638h hVar) {
        super((byte) 0);
        C89219l.m154721d(hVar, "");
        this.f123291a = hVar;
    }
}
