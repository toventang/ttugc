package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.k */
public final class C15314k implements AbstractC15308f {

    /* renamed from: a */
    public String f37342a;

    /* renamed from: b */
    public String f37343b;

    /* renamed from: c */
    public String f37344c;

    /* renamed from: d */
    public long f37345d;

    static {
        Covode.recordClassIndex(17544);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15314k)) {
            return false;
        }
        C15314k kVar = (C15314k) obj;
        return C89219l.m154714a(this.f37342a, kVar.f37342a) && C89219l.m154714a(this.f37343b, kVar.f37343b) && C89219l.m154714a(this.f37344c, kVar.f37344c) && this.f37345d == kVar.f37345d;
    }

    public final int hashCode() {
        String str = this.f37342a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f37343b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37344c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        long j = this.f37345d;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "JsbEvent(url=" + this.f37342a + ", moduleName=" + this.f37343b + ", methodName=" + this.f37344c + ", timestamp=" + this.f37345d + ")";
    }

    public /* synthetic */ C15314k() {
        this("", "", "", System.currentTimeMillis());
    }

    private C15314k(String str, String str2, String str3, long j) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f37342a = str;
        this.f37343b = str2;
        this.f37344c = str3;
        this.f37345d = j;
    }
}
