package com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.a.a.b */
public final class C18870b {

    /* renamed from: a */
    public final long f44681a;

    /* renamed from: b */
    public final String f44682b;

    /* renamed from: c */
    public final String f44683c;

    /* renamed from: d */
    public final String f44684d;

    /* renamed from: e */
    public final String f44685e;

    /* renamed from: f */
    public final int f44686f;

    /* renamed from: g */
    public final String f44687g;

    static {
        Covode.recordClassIndex(21580);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18870b)) {
            return false;
        }
        C18870b bVar = (C18870b) obj;
        return this.f44681a == bVar.f44681a && C89219l.m154714a(this.f44682b, bVar.f44682b) && C89219l.m154714a(this.f44683c, bVar.f44683c) && C89219l.m154714a(this.f44684d, bVar.f44684d) && C89219l.m154714a(this.f44685e, bVar.f44685e) && this.f44686f == bVar.f44686f && C89219l.m154714a(this.f44687g, bVar.f44687g);
    }

    public final int hashCode() {
        long j = this.f44681a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f44682b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f44683c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f44684d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f44685e;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f44686f) * 31;
        String str5 = this.f44687g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CalendarModel(id=" + this.f44681a + ", name=" + this.f44682b + ", displayName=" + this.f44683c + ", accountType=" + this.f44684d + ", accountName=" + this.f44685e + ", visible=" + this.f44686f + ", ownerAccount=" + this.f44687g + ")";
    }

    private /* synthetic */ C18870b() {
        this(0, null, null, null, null, 0, null);
    }

    public C18870b(long j, String str, String str2, String str3, String str4, int i, String str5) {
        this.f44681a = j;
        this.f44682b = str;
        this.f44683c = str2;
        this.f44684d = str3;
        this.f44685e = str4;
        this.f44686f = i;
        this.f44687g = str5;
    }
}
