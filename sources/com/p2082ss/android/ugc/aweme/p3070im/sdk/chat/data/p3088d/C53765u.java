package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.u */
public final class C53765u extends AbstractC53746c {

    /* renamed from: a */
    public final C19538ai f123310a;

    /* renamed from: b */
    public final boolean f123311b;

    static {
        Covode.recordClassIndex(63345);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53765u)) {
            return false;
        }
        C53765u uVar = (C53765u) obj;
        return C89219l.m154714a(this.f123310a, uVar.f123310a) && this.f123311b == uVar.f123311b;
    }

    public final int hashCode() {
        C19538ai aiVar = this.f123310a;
        int hashCode = (aiVar != null ? aiVar.hashCode() : 0) * 31;
        boolean z = this.f123311b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "OnSendMessageAsyncRespEvent(message=" + this.f123310a + ", hasChanged=" + this.f123311b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53765u(C19538ai aiVar, boolean z) {
        super((byte) 0);
        C89219l.m154721d(aiVar, "");
        this.f123310a = aiVar;
        this.f123311b = z;
    }
}
