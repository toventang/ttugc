package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.v */
public final class C53766v extends AbstractC53746c {

    /* renamed from: a */
    public final int f123312a;

    /* renamed from: b */
    public final C19538ai f123313b;

    /* renamed from: c */
    public final C19600ay f123314c;

    static {
        Covode.recordClassIndex(63346);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53766v)) {
            return false;
        }
        C53766v vVar = (C53766v) obj;
        return this.f123312a == vVar.f123312a && C89219l.m154714a(this.f123313b, vVar.f123313b) && C89219l.m154714a(this.f123314c, vVar.f123314c);
    }

    public final int hashCode() {
        int i = this.f123312a * 31;
        C19538ai aiVar = this.f123313b;
        int i2 = 0;
        int hashCode = (i + (aiVar != null ? aiVar.hashCode() : 0)) * 31;
        C19600ay ayVar = this.f123314c;
        if (ayVar != null) {
            i2 = ayVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "OnSendMessageEvent(statusCode=" + this.f123312a + ", message=" + this.f123313b + ", metrics=" + this.f123314c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53766v(int i, C19538ai aiVar, C19600ay ayVar) {
        super((byte) 0);
        C89219l.m154721d(aiVar, "");
        this.f123312a = i;
        this.f123313b = aiVar;
        this.f123314c = ayVar;
    }
}
