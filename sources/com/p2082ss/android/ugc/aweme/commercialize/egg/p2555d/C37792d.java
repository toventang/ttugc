package com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d.d */
public final class C37792d {

    /* renamed from: a */
    public final String f89242a;

    /* renamed from: b */
    public final String f89243b;

    /* renamed from: c */
    public final String f89244c;

    /* renamed from: d */
    public final String f89245d;

    /* renamed from: e */
    public final AbstractC37781a f89246e;

    static {
        Covode.recordClassIndex(45239);
    }

    public C37792d() {
        this((String) null, (String) null, (String) null, (String) null, 31);
    }

    public C37792d(String str, String str2, String str3) {
        this(str, str2, str3, (String) null, 24);
    }

    public C37792d(String str, String str2, String str3, String str4, byte b) {
        this(str, str2, str3, str4, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37792d)) {
            return false;
        }
        C37792d dVar = (C37792d) obj;
        return C89219l.m154714a(this.f89242a, dVar.f89242a) && C89219l.m154714a(this.f89243b, dVar.f89243b) && C89219l.m154714a(this.f89244c, dVar.f89244c) && C89219l.m154714a(this.f89245d, dVar.f89245d) && C89219l.m154714a(this.f89246e, dVar.f89246e);
    }

    public final int hashCode() {
        String str = this.f89242a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89243b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89244c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f89245d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AbstractC37781a aVar = this.f89246e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CommerceEggShowParam(eggType=" + this.f89242a + ", commentText=" + this.f89243b + ", enterFrom=" + this.f89244c + ", awemeId=" + this.f89245d + ", eventCallback=" + this.f89246e + ")";
    }

    private C37792d(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f89242a = str;
        this.f89243b = str2;
        this.f89244c = str3;
        this.f89245d = str4;
        this.f89246e = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ C37792d(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
