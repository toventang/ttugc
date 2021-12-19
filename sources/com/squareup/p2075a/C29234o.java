package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.security.cert.Certificate;
import java.util.List;

/* renamed from: com.squareup.a.o */
public final class C29234o {

    /* renamed from: a */
    public final String f69277a;

    /* renamed from: b */
    public final List<Certificate> f69278b;

    /* renamed from: c */
    public final List<Certificate> f69279c;

    static {
        Covode.recordClassIndex(35583);
    }

    public final int hashCode() {
        return ((((this.f69277a.hashCode() + 527) * 31) + this.f69278b.hashCode()) * 31) + this.f69279c.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.p2075a.C29234o m58495a(javax.net.ssl.SSLSession r4) {
        /*
            java.lang.String r3 = r4.getCipherSuite()
            if (r3 == 0) goto L_0x002b
            java.security.cert.Certificate[] r0 = r4.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0011 }
            if (r0 == 0) goto L_0x0012
            java.util.List r2 = com.squareup.p2075a.p2076a.C29206j.m58434a(r0)
            goto L_0x0016
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0016:
            java.security.cert.Certificate[] r0 = r4.getLocalCertificates()
            if (r0 == 0) goto L_0x0026
            java.util.List r1 = com.squareup.p2075a.p2076a.C29206j.m58434a(r0)
        L_0x0020:
            com.squareup.a.o r0 = new com.squareup.a.o
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0026:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0020
        L_0x002b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29234o.m58495a(javax.net.ssl.SSLSession):com.squareup.a.o");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29234o)) {
            return false;
        }
        C29234o oVar = (C29234o) obj;
        if (!this.f69277a.equals(oVar.f69277a) || !this.f69278b.equals(oVar.f69278b) || !this.f69279c.equals(oVar.f69279c)) {
            return false;
        }
        return true;
    }

    C29234o(String str, List<Certificate> list, List<Certificate> list2) {
        this.f69277a = str;
        this.f69278b = list;
        this.f69279c = list2;
    }
}
