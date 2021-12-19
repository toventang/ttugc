package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: com.squareup.a.z */
public final class C29252z {

    /* renamed from: a */
    public final C29098a f69371a;

    /* renamed from: b */
    public final Proxy f69372b;

    /* renamed from: c */
    public final InetSocketAddress f69373c;

    static {
        Covode.recordClassIndex(35601);
    }

    public final int hashCode() {
        return ((((this.f69371a.hashCode() + 527) * 31) + this.f69372b.hashCode()) * 31) + this.f69373c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29252z) {
            C29252z zVar = (C29252z) obj;
            if (!this.f69371a.equals(zVar.f69371a) || !this.f69372b.equals(zVar.f69372b) || !this.f69373c.equals(zVar.f69373c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C29252z(C29098a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f69371a = aVar;
        this.f69372b = proxy;
        this.f69373c = inetSocketAddress;
    }
}
