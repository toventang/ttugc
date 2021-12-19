package com.google.p1971b.p1972a.p1983d.p1985b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.google.p1971b.p1972a.p1983d.AbstractC27148h;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.b.a.d.b.c */
public final class C27142c extends AbstractC27148h {

    /* renamed from: b */
    private static final String[] f64276b;

    /* renamed from: c */
    private final AbstractC27140a f64277c;

    /* renamed from: d */
    private final SSLSocketFactory f64278d;

    /* renamed from: e */
    private final HostnameVerifier f64279e;

    public C27142c() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(32722);
        String[] strArr = {C14420a.f34884d, "GET", "HEAD", C14420a.f34885e, "POST", C14420a.f34883c, "TRACE"};
        f64276b = strArr;
        Arrays.sort(strArr);
    }

    private C27142c(byte b) {
        this.f64277c = new C27141b();
        this.f64278d = null;
        this.f64279e = null;
    }
}
