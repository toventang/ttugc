package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.x */
public final class C53768x extends AbstractC53732a {

    /* renamed from: a */
    public final String f123317a;

    /* renamed from: b */
    public final int f123318b;

    static {
        Covode.recordClassIndex(63348);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53768x)) {
            return false;
        }
        C53768x xVar = (C53768x) obj;
        return C89219l.m154714a(this.f123317a, xVar.f123317a) && this.f123318b == xVar.f123318b;
    }

    public final int hashCode() {
        String str = this.f123317a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f123318b;
    }

    public final String toString() {
        return "OnSilentConversationEvent(conversationId=" + this.f123317a + ", status=" + this.f123318b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53768x(String str, int i) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        this.f123317a = str;
        this.f123318b = i;
    }
}
