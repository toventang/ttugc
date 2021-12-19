package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.s */
public final class C53763s extends AbstractC53746c {

    /* renamed from: a */
    public final C19538ai f123308a;

    static {
        Covode.recordClassIndex(63343);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53763s) && C89219l.m154714a(this.f123308a, ((C53763s) obj).f123308a);
        }
        return true;
    }

    public final int hashCode() {
        C19538ai aiVar = this.f123308a;
        if (aiVar != null) {
            return aiVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnRecallMessageEvent(message=" + this.f123308a + ")";
    }
}
