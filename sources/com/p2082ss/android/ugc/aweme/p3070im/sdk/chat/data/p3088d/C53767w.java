package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19587an;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.w */
public final class C53767w extends AbstractC53746c {

    /* renamed from: a */
    public final int f123315a;

    /* renamed from: b */
    public final C19587an f123316b;

    static {
        Covode.recordClassIndex(63347);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53767w)) {
            return false;
        }
        C53767w wVar = (C53767w) obj;
        return this.f123315a == wVar.f123315a && C89219l.m154714a(this.f123316b, wVar.f123316b);
    }

    public final int hashCode() {
        int i = this.f123315a * 31;
        C19587an anVar = this.f123316b;
        return i + (anVar != null ? anVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnSendModifyPropertyMsgEvent(statusCode=" + this.f123315a + ", modifyMsgPropertyMsg=" + this.f123316b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53767w(int i, C19587an anVar) {
        super((byte) 0);
        C89219l.m154721d(anVar, "");
        this.f123315a = i;
        this.f123316b = anVar;
    }
}
