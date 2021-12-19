package com.google.p1998c.p2000b;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27238h;
import com.google.p1998c.p1999a.C27245k;
import java.util.Arrays;

/* renamed from: com.google.c.b.e */
public final class C27273e {

    /* renamed from: a */
    public final long f64454a = 0;

    /* renamed from: b */
    public final long f64455b = 0;

    /* renamed from: c */
    public final long f64456c = 0;

    /* renamed from: d */
    public final long f64457d = 0;

    /* renamed from: e */
    public final long f64458e = 0;

    /* renamed from: f */
    public final long f64459f = 0;

    static {
        Covode.recordClassIndex(32853);
    }

    public C27273e() {
        C27245k.m54235a(true);
        C27245k.m54235a(true);
        C27245k.m54235a(true);
        C27245k.m54235a(true);
        C27245k.m54235a(true);
        C27245k.m54235a(true);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f64454a), Long.valueOf(this.f64455b), Long.valueOf(this.f64456c), Long.valueOf(this.f64457d), Long.valueOf(this.f64458e), Long.valueOf(this.f64459f)});
    }

    public final String toString() {
        return C27238h.m54215a(this).mo45327a("hitCount", this.f64454a).mo45327a("missCount", this.f64455b).mo45327a("loadSuccessCount", this.f64456c).mo45327a("loadExceptionCount", this.f64457d).mo45327a("totalLoadTime", this.f64458e).mo45327a("evictionCount", this.f64459f).toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27273e) {
            C27273e eVar = (C27273e) obj;
            if (this.f64454a == eVar.f64454a && this.f64455b == eVar.f64455b && this.f64456c == eVar.f64456c && this.f64457d == eVar.f64457d && this.f64458e == eVar.f64458e && this.f64459f == eVar.f64459f) {
                return true;
            }
            return false;
        }
        return false;
    }
}
