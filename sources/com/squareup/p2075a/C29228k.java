package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.p2076a.C29206j;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* renamed from: com.squareup.a.k */
public final class C29228k {

    /* renamed from: a */
    public static final C29228k f69259a;

    /* renamed from: b */
    public static final C29228k f69260b;

    /* renamed from: c */
    public static final C29228k f69261c = new C29229a(false).mo50970b();

    /* renamed from: h */
    private static final EnumC29224h[] f69262h;

    /* renamed from: d */
    public final boolean f69263d;

    /* renamed from: e */
    public final boolean f69264e;

    /* renamed from: f */
    public final String[] f69265f;

    /* renamed from: g */
    public final String[] f69266g;

    /* renamed from: com.squareup.a.k$a */
    public static final class C29229a {

        /* renamed from: a */
        public boolean f69267a;

        /* renamed from: b */
        public String[] f69268b;

        /* renamed from: c */
        public String[] f69269c;

        /* renamed from: d */
        public boolean f69270d;

        static {
            Covode.recordClassIndex(35578);
        }

        /* renamed from: b */
        public final C29228k mo50970b() {
            return new C29228k(this, (byte) 0);
        }

        /* renamed from: a */
        public final C29229a mo50966a() {
            if (this.f69267a) {
                this.f69270d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        C29229a(boolean z) {
            this.f69267a = z;
        }

        public C29229a(C29228k kVar) {
            this.f69267a = kVar.f69263d;
            this.f69268b = kVar.f69265f;
            this.f69269c = kVar.f69266g;
            this.f69270d = kVar.f69264e;
        }

        /* renamed from: a */
        public final C29229a mo50968a(String... strArr) {
            if (!this.f69267a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f69268b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: b */
        public final C29229a mo50969b(String... strArr) {
            if (!this.f69267a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f69269c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a */
        public final C29229a mo50967a(EnumC29208aa... aaVarArr) {
            if (this.f69267a) {
                String[] strArr = new String[aaVarArr.length];
                for (int i = 0; i < aaVarArr.length; i++) {
                    strArr[i] = aaVarArr[i].f69182a;
                }
                return mo50969b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    public final int hashCode() {
        if (this.f69263d) {
            return ((((Arrays.hashCode(this.f69265f) + 527) * 31) + Arrays.hashCode(this.f69266g)) * 31) + (!this.f69264e ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f69263d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f69265f;
        int i = 0;
        String str2 = "[all enabled]";
        if (strArr != null) {
            EnumC29224h[] hVarArr = new EnumC29224h[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f69265f;
                if (i2 >= strArr2.length) {
                    break;
                }
                hVarArr[i2] = EnumC29224h.forJavaName(strArr2[i2]);
                i2++;
            }
            str = C29206j.m58434a(hVarArr).toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.f69266g;
        if (strArr3 != null) {
            EnumC29208aa[] aaVarArr = new EnumC29208aa[strArr3.length];
            while (true) {
                String[] strArr4 = this.f69266g;
                if (i >= strArr4.length) {
                    break;
                }
                aaVarArr[i] = EnumC29208aa.forJavaName(strArr4[i]);
                i++;
            }
            str2 = C29206j.m58434a(aaVarArr).toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f69264e + ")";
    }

    static {
        Covode.recordClassIndex(35577);
        EnumC29224h[] hVarArr = {EnumC29224h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC29224h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC29224h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, EnumC29224h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, EnumC29224h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, EnumC29224h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC29224h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC29224h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, EnumC29224h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, EnumC29224h.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC29224h.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC29224h.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC29224h.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f69262h = hVarArr;
        C29229a aVar = new C29229a(true);
        if (aVar.f69267a) {
            String[] strArr = new String[hVarArr.length];
            for (int i = 0; i < hVarArr.length; i++) {
                strArr[i] = hVarArr[i].f69249a;
            }
            C29228k b = aVar.mo50968a(strArr).mo50967a(EnumC29208aa.TLS_1_2, EnumC29208aa.TLS_1_1, EnumC29208aa.TLS_1_0).mo50966a().mo50970b();
            f69259a = b;
            f69260b = new C29229a(b).mo50967a(EnumC29208aa.TLS_1_0).mo50966a().mo50970b();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    private C29228k(C29229a aVar) {
        this.f69263d = aVar.f69267a;
        this.f69265f = aVar.f69268b;
        this.f69266g = aVar.f69269c;
        this.f69264e = aVar.f69270d;
    }

    /* renamed from: a */
    public final boolean mo50962a(SSLSocket sSLSocket) {
        if (!this.f69263d) {
            return false;
        }
        String[] strArr = this.f69266g;
        if (strArr != null && !m58483a(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f69265f;
        if (strArr2 == null || m58483a(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29228k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C29228k kVar = (C29228k) obj;
        boolean z = this.f69263d;
        if (z != kVar.f69263d) {
            return false;
        }
        if (!z || (Arrays.equals(this.f69265f, kVar.f69265f) && Arrays.equals(this.f69266g, kVar.f69266g) && this.f69264e == kVar.f69264e)) {
            return true;
        }
        return false;
    }

    /* synthetic */ C29228k(C29229a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    private static boolean m58483a(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                if (C29206j.m58444a(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
