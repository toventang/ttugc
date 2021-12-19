package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: okhttp3.ae */
public final class C90034ae {

    /* renamed from: a */
    public final C90017a f204137a;

    /* renamed from: b */
    public final Proxy f204138b;

    /* renamed from: c */
    public final InetSocketAddress f204139c;

    static {
        Covode.recordClassIndex(106206);
    }

    /* renamed from: a */
    public final boolean mo144737a() {
        if (this.f204137a.f204077i == null || this.f204138b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f204137a.hashCode() + 527) * 31) + this.f204138b.hashCode()) * 31) + this.f204139c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.f204139c + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C90034ae)) {
            return false;
        }
        C90034ae aeVar = (C90034ae) obj;
        if (!aeVar.f204137a.equals(this.f204137a) || !aeVar.f204138b.equals(this.f204138b) || !aeVar.f204139c.equals(this.f204139c)) {
            return false;
        }
        return true;
    }

    public C90034ae(C90017a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f204137a = aVar;
        this.f204138b = proxy;
        this.f204139c = inetSocketAddress;
    }
}
