package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C90200t;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.a */
public final class C90017a {

    /* renamed from: a */
    public final C90200t f204069a;

    /* renamed from: b */
    public final AbstractC90189o f204070b;

    /* renamed from: c */
    public final SocketFactory f204071c;

    /* renamed from: d */
    public final AbstractC90038b f204072d;

    /* renamed from: e */
    public final List<EnumC90211z> f204073e;

    /* renamed from: f */
    public final List<C90182k> f204074f;

    /* renamed from: g */
    public final ProxySelector f204075g;

    /* renamed from: h */
    public final Proxy f204076h;

    /* renamed from: i */
    public final SSLSocketFactory f204077i;

    /* renamed from: j */
    public final HostnameVerifier f204078j;

    /* renamed from: k */
    public final C90052g f204079k;

    static {
        Covode.recordClassIndex(106189);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((this.f204069a.hashCode() + 527) * 31) + this.f204070b.hashCode()) * 31) + this.f204072d.hashCode()) * 31) + this.f204073e.hashCode()) * 31) + this.f204074f.hashCode()) * 31) + this.f204075g.hashCode()) * 31;
        Proxy proxy = this.f204076h;
        int i4 = 0;
        if (proxy != null) {
            i = proxy.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.f204077i;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        HostnameVerifier hostnameVerifier = this.f204078j;
        if (hostnameVerifier != null) {
            i3 = hostnameVerifier.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        C90052g gVar = this.f204079k;
        if (gVar != null) {
            i4 = gVar.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("Address{").append(this.f204069a.f204861d).append(":").append(this.f204069a.f204862e);
        if (this.f204076h != null) {
            append.append(", proxy=").append(this.f204076h);
        } else {
            append.append(", proxySelector=").append(this.f204075g);
        }
        append.append("}");
        return append.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90017a)) {
            return false;
        }
        C90017a aVar = (C90017a) obj;
        if (!this.f204069a.equals(aVar.f204069a) || !mo144701a(aVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo144701a(C90017a aVar) {
        if (!this.f204070b.equals(aVar.f204070b) || !this.f204072d.equals(aVar.f204072d) || !this.f204073e.equals(aVar.f204073e) || !this.f204074f.equals(aVar.f204074f) || !this.f204075g.equals(aVar.f204075g) || !C90084c.m156418a(this.f204076h, aVar.f204076h) || !C90084c.m156418a(this.f204077i, aVar.f204077i) || !C90084c.m156418a(this.f204078j, aVar.f204078j) || !C90084c.m156418a(this.f204079k, aVar.f204079k) || this.f204069a.f204862e != aVar.f204069a.f204862e) {
            return false;
        }
        return true;
    }

    public C90017a(String str, int i, AbstractC90189o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C90052g gVar, AbstractC90038b bVar, Proxy proxy, List<EnumC90211z> list, List<C90182k> list2, ProxySelector proxySelector) {
        String str2;
        C90200t.C90201a aVar = new C90200t.C90201a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            aVar.f204867a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.f204867a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        C90200t.C90201a c = aVar.mo145069c(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        c.f204871e = i;
        this.f204069a = c.mo145068b();
        Objects.requireNonNull(oVar, "dns == null");
        this.f204070b = oVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f204071c = socketFactory;
        Objects.requireNonNull(bVar, "proxyAuthenticator == null");
        this.f204072d = bVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f204073e = C90084c.m156410a(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f204074f = C90084c.m156410a(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f204075g = proxySelector;
        this.f204076h = proxy;
        this.f204077i = sSLSocketFactory;
        this.f204078j = hostnameVerifier;
        this.f204079k = gVar;
    }
}
