package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;

/* renamed from: com.d.a.a.a.b.j */
public final class C23779j {

    /* renamed from: a */
    public final String f56252a;

    /* renamed from: b */
    public final String f56253b;

    static {
        Covode.recordClassIndex(27887);
    }

    private C23779j(String str, String str2) {
        this.f56252a = str;
        this.f56253b = str2;
    }

    /* renamed from: a */
    public static C23779j m44937a(String str, String str2) {
        C23801d.m44993a(str, "Name is null or empty");
        C23801d.m44993a(str2, "Version is null or empty");
        return new C23779j(str, str2);
    }
}
