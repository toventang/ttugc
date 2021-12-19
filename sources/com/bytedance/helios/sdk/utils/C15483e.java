package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.utils.e */
public final class C15483e {

    /* renamed from: a */
    public final String f37731a;

    /* renamed from: b */
    public String f37732b;

    /* renamed from: c */
    public final String f37733c;

    /* renamed from: d */
    public final Throwable f37734d;

    /* renamed from: e */
    public final long f37735e;

    static {
        Covode.recordClassIndex(17737);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15483e)) {
            return false;
        }
        C15483e eVar = (C15483e) obj;
        return C89219l.m154714a(this.f37731a, eVar.f37731a) && C89219l.m154714a(this.f37732b, eVar.f37732b) && C89219l.m154714a(this.f37733c, eVar.f37733c) && C89219l.m154714a(this.f37734d, eVar.f37734d) && this.f37735e == eVar.f37735e;
    }

    public final int hashCode() {
        String str = this.f37731a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37732b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37733c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Throwable th = this.f37734d;
        if (th != null) {
            i = th.hashCode();
        }
        long j = this.f37735e;
        return ((hashCode3 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "LogModel(tag=" + this.f37731a + ", msg=" + this.f37732b + ", level=" + this.f37733c + ", throwable=" + this.f37734d + ", timestamp=" + this.f37735e + ")";
    }

    public /* synthetic */ C15483e(String str, String str2, String str3, Throwable th) {
        this(str, str2, str3, th, System.currentTimeMillis());
    }

    private C15483e(String str, String str2, String str3, Throwable th, long j) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str3, "");
        this.f37731a = str;
        this.f37732b = str2;
        this.f37733c = str3;
        this.f37734d = th;
        this.f37735e = j;
    }
}
