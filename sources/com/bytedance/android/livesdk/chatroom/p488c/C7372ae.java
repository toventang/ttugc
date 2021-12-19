package com.bytedance.android.livesdk.chatroom.p488c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.ae */
public final class C7372ae {

    /* renamed from: a */
    public final AbstractC7394l f18273a;

    /* renamed from: b */
    public final boolean f18274b;

    static {
        Covode.recordClassIndex(8139);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7372ae)) {
            return false;
        }
        C7372ae aeVar = (C7372ae) obj;
        return C89219l.m154714a(this.f18273a, aeVar.f18273a) && this.f18274b == aeVar.f18274b;
    }

    public final int hashCode() {
        AbstractC7394l lVar = this.f18273a;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f18274b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "SendCommentResult(subject=" + this.f18273a + ", success=" + this.f18274b + ")";
    }

    public C7372ae(AbstractC7394l lVar, boolean z) {
        C89219l.m154721d(lVar, "");
        this.f18273a = lVar;
        this.f18274b = z;
    }
}
