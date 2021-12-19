package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.i */
public final class C36394i {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final int f86075a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final String f86076b;
    @AbstractC27891c(mo46611a = "body")

    /* renamed from: c */
    public final String f86077c;
    @AbstractC27891c(mo46611a = "pin")

    /* renamed from: d */
    public final String f86078d;
    @AbstractC27891c(mo46611a = "unpin")

    /* renamed from: e */
    public final String f86079e;

    static {
        Covode.recordClassIndex(43689);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36394i)) {
            return false;
        }
        C36394i iVar = (C36394i) obj;
        return this.f86075a == iVar.f86075a && C89219l.m154714a(this.f86076b, iVar.f86076b) && C89219l.m154714a(this.f86077c, iVar.f86077c) && C89219l.m154714a(this.f86078d, iVar.f86078d) && C89219l.m154714a(this.f86079e, iVar.f86079e);
    }

    public final int hashCode() {
        int i = this.f86075a * 31;
        String str = this.f86076b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f86077c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86078d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86079e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PinNotice(type=" + this.f86075a + ", title=" + this.f86076b + ", body=" + this.f86077c + ", pin=" + this.f86078d + ", unpin=" + this.f86079e + ")";
    }

    private /* synthetic */ C36394i() {
        this("", "", "", "");
    }

    private C36394i(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f86075a = 0;
        this.f86076b = str;
        this.f86077c = str2;
        this.f86078d = str3;
        this.f86079e = str4;
    }
}
