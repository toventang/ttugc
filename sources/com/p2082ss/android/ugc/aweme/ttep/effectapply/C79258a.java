package com.p2082ss.android.ugc.aweme.ttep.effectapply;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.effectapply.a */
public final class C79258a {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final String f178077a;
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: b */
    public final String f178078b;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: c */
    public final int f178079c;
    @AbstractC27891c(mo46611a = "loki_busi_msg")

    /* renamed from: d */
    public final String f178080d;

    static {
        Covode.recordClassIndex(92446);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79258a)) {
            return false;
        }
        C79258a aVar = (C79258a) obj;
        return C89219l.m154714a(this.f178077a, aVar.f178077a) && C89219l.m154714a(this.f178078b, aVar.f178078b) && this.f178079c == aVar.f178079c && C89219l.m154714a(this.f178080d, aVar.f178080d);
    }

    public final int hashCode() {
        String str = this.f178077a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f178078b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f178079c) * 31;
        String str3 = this.f178080d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EffectFetchApiResBean(data=" + this.f178077a + ", message=" + this.f178078b + ", status=" + this.f178079c + ", lokiBusiMsg=" + this.f178080d + ")";
    }

    private /* synthetic */ C79258a() {
        this("", "", "");
    }

    private C79258a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f178077a = str;
        this.f178078b = str2;
        this.f178079c = 0;
        this.f178080d = str3;
    }
}
