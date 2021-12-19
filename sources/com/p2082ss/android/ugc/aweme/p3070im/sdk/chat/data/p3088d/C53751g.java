package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.g */
public final class C53751g extends AbstractC53746c {

    /* renamed from: a */
    public final String f123286a;

    /* renamed from: b */
    public final boolean f123287b = true;

    static {
        Covode.recordClassIndex(63331);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53751g)) {
            return false;
        }
        C53751g gVar = (C53751g) obj;
        return C89219l.m154714a(this.f123286a, gVar.f123286a) && this.f123287b == gVar.f123287b;
    }

    public final int hashCode() {
        String str = this.f123286a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f123287b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "OnClearMessageEvent(conversationId=" + this.f123286a + ", needNotify=" + this.f123287b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53751g(String str) {
        super((byte) 0);
        C89219l.m154721d(str, "");
        this.f123286a = str;
    }
}
