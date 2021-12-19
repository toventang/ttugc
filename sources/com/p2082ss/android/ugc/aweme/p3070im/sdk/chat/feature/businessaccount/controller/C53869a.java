package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.a */
public final class C53869a {

    /* renamed from: a */
    public final Long f123514a;

    /* renamed from: b */
    public final int f123515b;

    /* renamed from: c */
    public final String f123516c;

    /* renamed from: d */
    public final String f123517d;

    static {
        Covode.recordClassIndex(63530);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53869a)) {
            return false;
        }
        C53869a aVar = (C53869a) obj;
        return C89219l.m154714a(this.f123514a, aVar.f123514a) && this.f123515b == aVar.f123515b && C89219l.m154714a(this.f123516c, aVar.f123516c) && C89219l.m154714a(this.f123517d, aVar.f123517d);
    }

    public final int hashCode() {
        Long l = this.f123514a;
        int i = 0;
        int hashCode = (((l != null ? l.hashCode() : 0) * 31) + this.f123515b) * 31;
        String str = this.f123516c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f123517d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AutoMessage(wslMsgId=" + this.f123514a + ", status=" + this.f123515b + ", content=" + this.f123516c + ", message=" + this.f123517d + ")";
    }

    public /* synthetic */ C53869a(Long l, int i, String str) {
        this(l, i, str, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C53869a m99136a(C53869a aVar, int i, String str) {
        Long l = aVar.f123514a;
        String str2 = aVar.f123517d;
        C89219l.m154721d(str, "");
        return new C53869a(l, i, str, str2);
    }

    public C53869a(Long l, int i, String str, String str2) {
        C89219l.m154721d(str, "");
        this.f123514a = l;
        this.f123515b = i;
        this.f123516c = str;
        this.f123517d = str2;
    }
}
