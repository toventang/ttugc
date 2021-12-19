package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.k */
public final class C90182k {

    /* renamed from: a */
    public static final C90182k f204798a;

    /* renamed from: b */
    public static final C90182k f204799b;

    /* renamed from: c */
    public static final C90182k f204800c;

    /* renamed from: d */
    public static final C90182k f204801d = new C90183a(false).mo145007b();

    /* renamed from: i */
    private static final C90055h[] f204802i;

    /* renamed from: j */
    private static final C90055h[] f204803j;

    /* renamed from: e */
    public final boolean f204804e;

    /* renamed from: f */
    public final boolean f204805f;

    /* renamed from: g */
    final String[] f204806g;

    /* renamed from: h */
    final String[] f204807h;

    /* renamed from: okhttp3.k$a */
    public static final class C90183a {

        /* renamed from: a */
        boolean f204808a;

        /* renamed from: b */
        String[] f204809b;

        /* renamed from: c */
        String[] f204810c;

        /* renamed from: d */
        boolean f204811d;

        static {
            Covode.recordClassIndex(106356);
        }

        /* renamed from: b */
        public final C90182k mo145007b() {
            return new C90182k(this);
        }

        /* renamed from: a */
        public final C90183a mo145002a() {
            if (this.f204808a) {
                this.f204811d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        C90183a(boolean z) {
            this.f204808a = z;
        }

        public C90183a(C90182k kVar) {
            this.f204808a = kVar.f204804e;
            this.f204809b = kVar.f204806g;
            this.f204810c = kVar.f204807h;
            this.f204811d = kVar.f204805f;
        }

        /* renamed from: a */
        public final C90183a mo145003a(String... strArr) {
            if (!this.f204808a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f204809b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: b */
        public final C90183a mo145006b(String... strArr) {
            if (!this.f204808a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f204810c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a */
        public final C90183a mo145004a(EnumC90035af... afVarArr) {
            if (this.f204808a) {
                String[] strArr = new String[afVarArr.length];
                for (int i = 0; i < afVarArr.length; i++) {
                    strArr[i] = afVarArr[i].f204141a;
                }
                return mo145006b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: a */
        public final C90183a mo145005a(C90055h... hVarArr) {
            if (this.f204808a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f204329bq;
                }
                return mo145003a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
    }

    public final int hashCode() {
        if (this.f204804e) {
            return ((((Arrays.hashCode(this.f204806g) + 527) * 31) + Arrays.hashCode(this.f204807h)) * 31) + (!this.f204805f ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: a */
    private List<EnumC90035af> m156735a() {
        String[] strArr = this.f204807h;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC90035af.forJavaName(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        String str;
        if (!this.f204804e) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f204806g;
        String str2 = "[all enabled]";
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(C90055h.m156303a(str3));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        } else {
            str = str2;
        }
        if (this.f204807h != null) {
            str2 = m156735a().toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f204805f + ")";
    }

    static {
        Covode.recordClassIndex(106355);
        C90055h[] hVarArr = {C90055h.f204299bl, C90055h.f204300bm, C90055h.f204301bn, C90055h.f204302bo, C90055h.f204303bp, C90055h.f204258aX, C90055h.f204289bb, C90055h.f204259aY, C90055h.f204290bc, C90055h.f204296bi, C90055h.f204295bh};
        f204802i = hVarArr;
        C90055h[] hVarArr2 = {C90055h.f204299bl, C90055h.f204300bm, C90055h.f204301bn, C90055h.f204302bo, C90055h.f204303bp, C90055h.f204258aX, C90055h.f204289bb, C90055h.f204259aY, C90055h.f204290bc, C90055h.f204296bi, C90055h.f204295bh, C90055h.f204243aI, C90055h.f204244aJ, C90055h.f204267ag, C90055h.f204268ah, C90055h.f204212E, C90055h.f204216I, C90055h.f204311i};
        f204803j = hVarArr2;
        f204798a = new C90183a(true).mo145005a(hVarArr).mo145004a(EnumC90035af.TLS_1_3, EnumC90035af.TLS_1_2).mo145002a().mo145007b();
        f204799b = new C90183a(true).mo145005a(hVarArr2).mo145004a(EnumC90035af.TLS_1_3, EnumC90035af.TLS_1_2, EnumC90035af.TLS_1_1, EnumC90035af.TLS_1_0).mo145002a().mo145007b();
        f204800c = new C90183a(true).mo145005a(hVarArr2).mo145004a(EnumC90035af.TLS_1_0).mo145002a().mo145007b();
    }

    C90182k(C90183a aVar) {
        this.f204804e = aVar.f204808a;
        this.f204806g = aVar.f204809b;
        this.f204807h = aVar.f204810c;
        this.f204805f = aVar.f204811d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90182k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C90182k kVar = (C90182k) obj;
        boolean z = this.f204804e;
        if (z != kVar.f204804e) {
            return false;
        }
        if (!z || (Arrays.equals(this.f204806g, kVar.f204806g) && Arrays.equals(this.f204807h, kVar.f204807h) && this.f204805f == kVar.f204805f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo144998a(SSLSocket sSLSocket) {
        if (!this.f204804e) {
            return false;
        }
        if (this.f204807h != null && !C90084c.m156425b(C90084c.f204453h, this.f204807h, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f204806g == null || C90084c.m156425b(C90055h.f204234a, this.f204806g, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
