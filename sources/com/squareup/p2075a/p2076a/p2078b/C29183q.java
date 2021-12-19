package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.C29098a;
import com.squareup.p2075a.C29237q;
import com.squareup.p2075a.C29252z;
import com.squareup.p2075a.p2076a.C29205i;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.squareup.a.a.b.q */
public final class C29183q {

    /* renamed from: a */
    final C29098a f69104a;

    /* renamed from: b */
    final C29205i f69105b;

    /* renamed from: c */
    private Proxy f69106c;

    /* renamed from: d */
    private InetSocketAddress f69107d;

    /* renamed from: e */
    private List<Proxy> f69108e = Collections.emptyList();

    /* renamed from: f */
    private int f69109f;

    /* renamed from: g */
    private List<InetSocketAddress> f69110g = Collections.emptyList();

    /* renamed from: h */
    private int f69111h;

    /* renamed from: i */
    private final List<C29252z> f69112i = new ArrayList();

    static {
        Covode.recordClassIndex(35532);
    }

    /* renamed from: c */
    private boolean m58334c() {
        if (this.f69109f < this.f69108e.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m58335d() {
        if (this.f69111h < this.f69110g.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m58336e() {
        if (!this.f69112i.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo50886a() {
        if (m58335d() || m58334c() || m58336e()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C29252z mo50887b() {
        while (true) {
            if (!m58335d()) {
                if (!m58334c()) {
                    if (m58336e()) {
                        return this.f69112i.remove(0);
                    }
                    throw new NoSuchElementException();
                } else if (m58334c()) {
                    List<Proxy> list = this.f69108e;
                    int i = this.f69109f;
                    this.f69109f = i + 1;
                    Proxy proxy = list.get(i);
                    m58333a(proxy);
                    this.f69106c = proxy;
                } else {
                    throw new SocketException("No route to " + this.f69104a.f68782a.f69286d + "; exhausted proxy configurations: " + this.f69108e);
                }
            }
            if (m58335d()) {
                List<InetSocketAddress> list2 = this.f69110g;
                int i2 = this.f69111h;
                this.f69111h = i2 + 1;
                this.f69107d = list2.get(i2);
                C29252z zVar = new C29252z(this.f69104a, this.f69106c, this.f69107d);
                if (!this.f69105b.mo50941c(zVar)) {
                    return zVar;
                }
                this.f69112i.add(zVar);
            } else {
                throw new SocketException("No route to " + this.f69104a.f68782a.f69286d + "; exhausted inet socket addresses: " + this.f69110g);
            }
        }
    }

    /* renamed from: a */
    private void m58333a(Proxy proxy) {
        int i;
        String str;
        this.f69110g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f69104a.f68782a.f69286d;
            i = this.f69104a.f68782a.f69287e;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i <= 0 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f69110g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List<InetAddress> a = this.f69104a.f68783b.mo50973a(str);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f69110g.add(new InetSocketAddress(a.get(i2), i));
            }
        }
        this.f69111h = 0;
    }

    public C29183q(C29098a aVar, C29205i iVar) {
        this.f69104a = aVar;
        this.f69105b = iVar;
        C29237q qVar = aVar.f68782a;
        Proxy proxy = aVar.f68789h;
        if (proxy != null) {
            this.f69108e = Collections.singletonList(proxy);
        } else {
            this.f69108e = new ArrayList();
            List<Proxy> select = aVar.f68788g.select(qVar.mo50989b());
            if (select != null) {
                this.f69108e.addAll(select);
            }
            this.f69108e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f69108e.add(Proxy.NO_PROXY);
        }
        this.f69109f = 0;
    }
}
