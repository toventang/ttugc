package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90191p;
import okhttp3.C90017a;
import okhttp3.C90034ae;
import okhttp3.C90200t;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.internal.b.f */
public final class C90080f {

    /* renamed from: a */
    final C90017a f204420a;

    /* renamed from: b */
    final C90078d f204421b;

    /* renamed from: c */
    private final AbstractC90049e f204422c;

    /* renamed from: d */
    private final AbstractC90191p f204423d;

    /* renamed from: e */
    private List<Proxy> f204424e = Collections.emptyList();

    /* renamed from: f */
    private int f204425f;

    /* renamed from: g */
    private List<InetSocketAddress> f204426g = Collections.emptyList();

    /* renamed from: h */
    private final List<C90034ae> f204427h = new ArrayList();

    static {
        Covode.recordClassIndex(106252);
    }

    /* renamed from: okhttp3.internal.b.f$a */
    public static final class C90081a {

        /* renamed from: a */
        final List<C90034ae> f204428a;

        /* renamed from: b */
        int f204429b;

        static {
            Covode.recordClassIndex(106253);
        }

        /* renamed from: a */
        public final boolean mo144834a() {
            if (this.f204429b < this.f204428a.size()) {
                return true;
            }
            return false;
        }

        C90081a(List<C90034ae> list) {
            this.f204428a = list;
        }
    }

    /* renamed from: c */
    private boolean m156382c() {
        if (this.f204425f < this.f204424e.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo144832a() {
        if (m156382c() || !this.f204427h.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C90081a mo144833b() {
        if (mo144832a()) {
            ArrayList arrayList = new ArrayList();
            while (m156382c()) {
                if (m156382c()) {
                    List<Proxy> list = this.f204424e;
                    int i = this.f204425f;
                    this.f204425f = i + 1;
                    Proxy proxy = list.get(i);
                    m156381a(proxy);
                    int size = this.f204426g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C90034ae aeVar = new C90034ae(this.f204420a, proxy, this.f204426g.get(i2));
                        if (this.f204421b.mo144828c(aeVar)) {
                            this.f204427h.add(aeVar);
                        } else {
                            arrayList.add(aeVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    throw new SocketException("No route to " + this.f204420a.f204069a.f204861d + "; exhausted proxy configurations: " + this.f204424e);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f204427h);
                this.f204427h.clear();
            }
            return new C90081a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private void m156381a(Proxy proxy) {
        int i;
        String str;
        this.f204426g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f204420a.f204069a.f204861d;
            i = this.f204420a.f204069a.f204862e;
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
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f204426g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f204423d.dnsStart(this.f204422c, str);
            List<InetAddress> a = this.f204420a.f204070b.mo23717a(str);
            if (!a.isEmpty()) {
                this.f204423d.dnsEnd(this.f204422c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f204426g.add(new InetSocketAddress(a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f204420a.f204070b + " returned no addresses for " + str);
        }
    }

    public C90080f(C90017a aVar, C90078d dVar, AbstractC90049e eVar, AbstractC90191p pVar) {
        List<Proxy> a;
        this.f204420a = aVar;
        this.f204421b = dVar;
        this.f204422c = eVar;
        this.f204423d = pVar;
        C90200t tVar = aVar.f204069a;
        Proxy proxy = aVar.f204076h;
        if (proxy != null) {
            a = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = aVar.f204075g.select(tVar.mo145047b());
            if (select == null || select.isEmpty()) {
                a = C90084c.m156411a(Proxy.NO_PROXY);
            } else {
                a = C90084c.m156410a(select);
            }
        }
        this.f204424e = a;
        this.f204425f = 0;
    }
}
