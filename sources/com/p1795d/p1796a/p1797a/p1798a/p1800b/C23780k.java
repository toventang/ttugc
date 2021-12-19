package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import java.net.URL;

/* renamed from: com.d.a.a.a.b.k */
public final class C23780k {

    /* renamed from: a */
    public final String f56254a;

    /* renamed from: b */
    public final URL f56255b;

    /* renamed from: c */
    public final String f56256c;

    static {
        Covode.recordClassIndex(27888);
    }

    private C23780k(String str, URL url, String str2) {
        this.f56254a = str;
        this.f56255b = url;
        this.f56256c = str2;
    }

    /* renamed from: a */
    public static C23780k m44938a(String str, URL url, String str2) {
        C23801d.m44993a(str, "VendorKey is null or empty");
        C23801d.m44992a(url, "ResourceURL is null");
        C23801d.m44993a(str2, "VerificationParameters is null or empty");
        return new C23780k(str, url, str2);
    }
}
