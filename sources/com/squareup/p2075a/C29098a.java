package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29237q;
import com.squareup.p2075a.p2076a.C29206j;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.squareup.a.a */
public final class C29098a {

    /* renamed from: a */
    public final C29237q f68782a;

    /* renamed from: b */
    public final AbstractC29232n f68783b;

    /* renamed from: c */
    public final SocketFactory f68784c;

    /* renamed from: d */
    public final AbstractC29209b f68785d;

    /* renamed from: e */
    public final List<EnumC29245u> f68786e;

    /* renamed from: f */
    public final List<C29228k> f68787f;

    /* renamed from: g */
    public final ProxySelector f68788g;

    /* renamed from: h */
    public final Proxy f68789h;

    /* renamed from: i */
    public final SSLSocketFactory f68790i;

    /* renamed from: j */
    public final HostnameVerifier f68791j;

    /* renamed from: k */
    public final C29221f f68792k;

    static {
        Covode.recordClassIndex(35447);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((this.f68782a.hashCode() + 527) * 31) + this.f68783b.hashCode()) * 31) + this.f68785d.hashCode()) * 31) + this.f68786e.hashCode()) * 31) + this.f68787f.hashCode()) * 31) + this.f68788g.hashCode()) * 31;
        Proxy proxy = this.f68789h;
        int i4 = 0;
        if (proxy != null) {
            i = proxy.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        SSLSocketFactory sSLSocketFactory = this.f68790i;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        HostnameVerifier hostnameVerifier = this.f68791j;
        if (hostnameVerifier != null) {
            i3 = hostnameVerifier.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        C29221f fVar = this.f68792k;
        if (fVar != null) {
            i4 = fVar.hashCode();
        }
        return i7 + i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29098a) {
            C29098a aVar = (C29098a) obj;
            if (!this.f68782a.equals(aVar.f68782a) || !this.f68783b.equals(aVar.f68783b) || !this.f68785d.equals(aVar.f68785d) || !this.f68786e.equals(aVar.f68786e) || !this.f68787f.equals(aVar.f68787f) || !this.f68788g.equals(aVar.f68788g) || !C29206j.m58441a(this.f68789h, aVar.f68789h) || !C29206j.m58441a(this.f68790i, aVar.f68790i) || !C29206j.m58441a(this.f68791j, aVar.f68791j) || !C29206j.m58441a(this.f68792k, aVar.f68792k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C29098a(String str, int i, AbstractC29232n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C29221f fVar, AbstractC29209b bVar, Proxy proxy, List<EnumC29245u> list, List<C29228k> list2, ProxySelector proxySelector) {
        String str2;
        C29237q.C29238a aVar = new C29237q.C29238a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            aVar.f69292a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.f69292a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str != null) {
            String a = C29237q.C29238a.m58532a(str, 0, str.length());
            if (a != null) {
                aVar.f69295d = a;
                if (i <= 0 || i > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
                }
                aVar.f69296e = i;
                this.f68782a = aVar.mo51002b();
                if (nVar != null) {
                    this.f68783b = nVar;
                    if (socketFactory != null) {
                        this.f68784c = socketFactory;
                        if (bVar != null) {
                            this.f68785d = bVar;
                            if (list != null) {
                                this.f68786e = C29206j.m58433a(list);
                                if (list2 != null) {
                                    this.f68787f = C29206j.m58433a(list2);
                                    if (proxySelector != null) {
                                        this.f68788g = proxySelector;
                                        this.f68789h = proxy;
                                        this.f68790i = sSLSocketFactory;
                                        this.f68791j = hostnameVerifier;
                                        this.f68792k = fVar;
                                        return;
                                    }
                                    throw new IllegalArgumentException("proxySelector == null");
                                }
                                throw new IllegalArgumentException("connectionSpecs == null");
                            }
                            throw new IllegalArgumentException("protocols == null");
                        }
                        throw new IllegalArgumentException("authenticator == null");
                    }
                    throw new IllegalArgumentException("socketFactory == null");
                }
                throw new IllegalArgumentException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("host == null");
    }
}
