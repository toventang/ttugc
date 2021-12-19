package com.p2082ss.android.ugc.aweme.p4173ug.p4178d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.d.a */
public final class C79597a {
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public final String f178602a;
    @AbstractC27891c(mo46611a = "cdnUrl")

    /* renamed from: b */
    public final String f178603b;
    @AbstractC27891c(mo46611a = "hash")

    /* renamed from: c */
    public final String f178604c;
    @AbstractC27891c(mo46611a = "size")

    /* renamed from: d */
    public final int f178605d;

    static {
        Covode.recordClassIndex(92805);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79597a)) {
            return false;
        }
        C79597a aVar = (C79597a) obj;
        return C89219l.m154714a(this.f178602a, aVar.f178602a) && C89219l.m154714a(this.f178603b, aVar.f178603b) && C89219l.m154714a(this.f178604c, aVar.f178604c) && this.f178605d == aVar.f178605d;
    }

    public final int hashCode() {
        String str = this.f178602a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f178603b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f178604c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f178605d;
    }

    public final String toString() {
        return "DynamicResource(key=" + this.f178602a + ", cdnUrl=" + this.f178603b + ", hash=" + this.f178604c + ", size=" + this.f178605d + ")";
    }

    private /* synthetic */ C79597a() {
        this("", "", "");
    }

    private C79597a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f178602a = str;
        this.f178603b = str2;
        this.f178604c = str3;
        this.f178605d = 0;
    }
}
