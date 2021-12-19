package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.b */
public final class C53870b {

    /* renamed from: a */
    public final long f123518a;

    /* renamed from: b */
    public int f123519b;

    /* renamed from: c */
    public String f123520c;

    /* renamed from: d */
    public String f123521d;

    /* renamed from: e */
    public final String f123522e;

    static {
        Covode.recordClassIndex(63531);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53870b)) {
            return false;
        }
        C53870b bVar = (C53870b) obj;
        return this.f123518a == bVar.f123518a && this.f123519b == bVar.f123519b && C89219l.m154714a(this.f123520c, bVar.f123520c) && C89219l.m154714a(this.f123521d, bVar.f123521d) && C89219l.m154714a(this.f123522e, bVar.f123522e);
    }

    public final String toString() {
        return "KeywordMessage(messageId=" + this.f123518a + ", status=" + this.f123519b + ", keyword=" + this.f123520c + ", content=" + this.f123521d + ", message=" + this.f123522e + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.f123518a;
        int i3 = ((((int) (j ^ (j >>> 32))) * 31) + this.f123519b) * 31;
        String str = this.f123520c;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f123521d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f123522e;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    public /* synthetic */ C53870b(long j, int i, String str, String str2) {
        this(j, i, str, str2, null);
    }

    public C53870b(long j, int i, String str, String str2, String str3) {
        this.f123518a = j;
        this.f123519b = i;
        this.f123520c = str;
        this.f123521d = str2;
        this.f123522e = str3;
    }
}
