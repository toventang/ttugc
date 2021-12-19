package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.f */
public final class C53750f extends AbstractC53746c {

    /* renamed from: a */
    public final int f123284a;

    /* renamed from: b */
    public final C19538ai f123285b;

    static {
        Covode.recordClassIndex(63330);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53750f)) {
            return false;
        }
        C53750f fVar = (C53750f) obj;
        return this.f123284a == fVar.f123284a && C89219l.m154714a(this.f123285b, fVar.f123285b);
    }

    public final int hashCode() {
        int i = this.f123284a * 31;
        C19538ai aiVar = this.f123285b;
        return i + (aiVar != null ? aiVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnAddMessageEvent(statusCode=" + this.f123284a + ", message=" + this.f123285b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53750f(int i, C19538ai aiVar) {
        super((byte) 0);
        C89219l.m154721d(aiVar, "");
        this.f123284a = i;
        this.f123285b = aiVar;
    }
}
