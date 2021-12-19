package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90191p;
import okhttp3.AbstractC90202u;
import okhttp3.C90017a;
import okhttp3.C90034ae;
import okhttp3.C90180j;
import okhttp3.C90208y;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90080f;
import okhttp3.internal.p4655c.AbstractC90090c;
import okhttp3.internal.p4656d.C90101a;
import okhttp3.internal.p4657e.C90108a;
import okhttp3.internal.p4657e.C90116f;
import okhttp3.internal.p4657e.C90148n;
import okhttp3.internal.p4657e.EnumC90109b;

/* renamed from: okhttp3.internal.b.g */
public final class C90082g {

    /* renamed from: i */
    public static final /* synthetic */ boolean f204430i = true;

    /* renamed from: a */
    public final C90017a f204431a;

    /* renamed from: b */
    public C90034ae f204432b;

    /* renamed from: c */
    public final C90180j f204433c;

    /* renamed from: d */
    public final AbstractC90049e f204434d;

    /* renamed from: e */
    public final AbstractC90191p f204435e;

    /* renamed from: f */
    public C90076c f204436f;

    /* renamed from: g */
    public boolean f204437g;

    /* renamed from: h */
    public AbstractC90090c f204438h;

    /* renamed from: j */
    private C90080f.C90081a f204439j;

    /* renamed from: k */
    private final Object f204440k;

    /* renamed from: l */
    private final C90080f f204441l;

    /* renamed from: m */
    private int f204442m;

    /* renamed from: n */
    private boolean f204443n;

    /* renamed from: o */
    private boolean f204444o;

    /* renamed from: a */
    public final void mo144840a(boolean z, AbstractC90090c cVar, long j, IOException iOException) {
        C90076c cVar2;
        Socket a;
        boolean z2;
        MethodCollector.m26663i(5609);
        this.f204435e.responseBodyEnd(this.f204434d, j);
        synchronized (this.f204433c) {
            if (cVar != null) {
                try {
                    if (cVar == this.f204438h) {
                        if (!z) {
                            this.f204436f.f204409i++;
                        }
                        cVar2 = this.f204436f;
                        a = mo144835a(z, false, true);
                        if (this.f204436f != null) {
                            cVar2 = null;
                        }
                        z2 = this.f204444o;
                    }
                } finally {
                    MethodCollector.m26664o(5609);
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("expected " + this.f204438h + " but was " + cVar);
            MethodCollector.m26664o(5609);
            throw illegalStateException;
        }
        C90084c.m156416a(a);
        if (cVar2 != null) {
            this.f204435e.connectionReleased(this.f204434d, cVar2);
        }
        if (iOException != null) {
            this.f204435e.callFailed(this.f204434d, AbstractC90058a.f204330a.mo144782a(this.f204434d, iOException));
            MethodCollector.m26664o(5609);
            return;
        }
        if (z2) {
            AbstractC90058a.f204330a.mo144782a(this.f204434d, (IOException) null);
            this.f204435e.callEnd(this.f204434d);
        }
    }

    /* renamed from: a */
    public final void mo144839a(C90076c cVar, boolean z) {
        if (!f204430i && !Thread.holdsLock(this.f204433c)) {
            throw new AssertionError();
        } else if (this.f204436f == null) {
            this.f204436f = cVar;
            this.f204443n = z;
            cVar.f204411k.add(new C90083a(this, this.f204440k));
        } else {
            throw new IllegalStateException();
        }
    }

    static {
        Covode.recordClassIndex(106254);
    }

    /* renamed from: f */
    private C90078d m156389f() {
        return AbstractC90058a.f204330a.mo144786a(this.f204433c);
    }

    /* renamed from: b */
    public final synchronized C90076c mo144841b() {
        C90076c cVar;
        MethodCollector.m26663i(5740);
        cVar = this.f204436f;
        MethodCollector.m26664o(5740);
        return cVar;
    }

    /* renamed from: a */
    public final AbstractC90090c mo144836a() {
        AbstractC90090c cVar;
        MethodCollector.m26663i(5738);
        synchronized (this.f204433c) {
            try {
                cVar = this.f204438h;
            } finally {
                MethodCollector.m26664o(5738);
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public final boolean mo144844e() {
        if (this.f204432b != null) {
            return true;
        }
        C90080f.C90081a aVar = this.f204439j;
        if ((aVar == null || !aVar.mo144834a()) && !this.f204441l.mo144832a()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        C90076c b = mo144841b();
        if (b != null) {
            return b.toString();
        }
        return this.f204431a.toString();
    }

    /* renamed from: c */
    public final void mo144842c() {
        C90076c cVar;
        Socket a;
        MethodCollector.m26663i(5876);
        synchronized (this.f204433c) {
            try {
                cVar = this.f204436f;
                a = mo144835a(false, true, false);
                if (this.f204436f != null) {
                    cVar = null;
                }
            } finally {
                MethodCollector.m26664o(5876);
            }
        }
        C90084c.m156416a(a);
        if (cVar != null) {
            AbstractC90058a.f204330a.mo144782a(this.f204434d, (IOException) null);
            this.f204435e.connectionReleased(this.f204434d, cVar);
            this.f204435e.callEnd(this.f204434d);
        }
    }

    /* renamed from: d */
    public final void mo144843d() {
        C90076c cVar;
        Socket a;
        MethodCollector.m26663i(5877);
        synchronized (this.f204433c) {
            try {
                cVar = this.f204436f;
                a = mo144835a(true, false, false);
                if (this.f204436f != null) {
                    cVar = null;
                }
            } finally {
                MethodCollector.m26664o(5877);
            }
        }
        C90084c.m156416a(a);
        if (cVar != null) {
            this.f204435e.connectionReleased(this.f204434d, cVar);
        }
    }

    /* renamed from: a */
    private void m156388a(C90076c cVar) {
        int size = cVar.f204411k.size();
        for (int i = 0; i < size; i++) {
            if (cVar.f204411k.get(i).get() == this) {
                cVar.f204411k.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo144838a(IOException iOException) {
        C90076c cVar;
        boolean z;
        Socket a;
        MethodCollector.m26663i(5880);
        synchronized (this.f204433c) {
            try {
                cVar = null;
                if (iOException instanceof C90148n) {
                    EnumC90109b bVar = ((C90148n) iOException).errorCode;
                    if (bVar == EnumC90109b.REFUSED_STREAM) {
                        int i = this.f204442m + 1;
                        this.f204442m = i;
                        if (i > 1) {
                        }
                    } else if (bVar != EnumC90109b.CANCEL) {
                        this.f204432b = null;
                        z = true;
                        C90076c cVar2 = this.f204436f;
                        a = mo144835a(z, false, true);
                        if (this.f204436f == null && this.f204443n) {
                            cVar = cVar2;
                        }
                    }
                    z = false;
                    C90076c cVar22 = this.f204436f;
                    a = mo144835a(z, false, true);
                    cVar = cVar22;
                } else {
                    C90076c cVar3 = this.f204436f;
                    if (cVar3 != null && (!cVar3.mo144823d() || (iOException instanceof C90108a))) {
                        if (this.f204436f.f204409i == 0) {
                            C90034ae aeVar = this.f204432b;
                            if (!(aeVar == null || iOException == null)) {
                                C90080f fVar = this.f204441l;
                                if (!(aeVar.f204138b.type() == Proxy.Type.DIRECT || fVar.f204420a.f204075g == null)) {
                                    fVar.f204420a.f204075g.connectFailed(fVar.f204420a.f204069a.mo145047b(), aeVar.f204138b.address(), iOException);
                                }
                                fVar.f204421b.mo144826a(aeVar);
                            }
                        }
                        z = true;
                        C90076c cVar222 = this.f204436f;
                        a = mo144835a(z, false, true);
                        cVar = cVar222;
                    }
                    z = false;
                    C90076c cVar2222 = this.f204436f;
                    a = mo144835a(z, false, true);
                    cVar = cVar2222;
                }
                this.f204432b = null;
                z = true;
                C90076c cVar22222 = this.f204436f;
                a = mo144835a(z, false, true);
                cVar = cVar22222;
            } finally {
                MethodCollector.m26664o(5880);
            }
        }
        C90084c.m156416a(a);
        if (cVar != null) {
            this.f204435e.connectionReleased(this.f204434d, cVar);
        }
    }

    /* renamed from: okhttp3.internal.b.g$a */
    public static final class C90083a extends WeakReference<C90082g> {

        /* renamed from: a */
        public final Object f204445a;

        static {
            Covode.recordClassIndex(106255);
        }

        C90083a(C90082g gVar, Object obj) {
            super(gVar);
            this.f204445a = obj;
        }
    }

    /* renamed from: a */
    public final Socket mo144835a(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (f204430i || Thread.holdsLock(this.f204433c)) {
            if (z3) {
                this.f204438h = null;
            }
            if (z2) {
                this.f204444o = true;
            }
            C90076c cVar = this.f204436f;
            if (cVar == null) {
                return null;
            }
            if (z) {
                cVar.f204408h = true;
            }
            if (this.f204438h != null) {
                return null;
            }
            if (!this.f204444o && !this.f204436f.f204408h) {
                return null;
            }
            m156388a(this.f204436f);
            if (this.f204436f.f204411k.isEmpty()) {
                this.f204436f.f204412l = System.nanoTime();
                if (AbstractC90058a.f204330a.mo144792a(this.f204433c, this.f204436f)) {
                    socket = this.f204436f.f204403c;
                    this.f204436f = null;
                    return socket;
                }
            }
            socket = null;
            this.f204436f = null;
            return socket;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final AbstractC90090c mo144837a(C90208y yVar, AbstractC90202u.AbstractC90203a aVar, boolean z) {
        AbstractC90090c aVar2;
        MethodCollector.m26663i(5386);
        try {
            C90076c a = m156387a(aVar.mo144860c(), aVar.mo144861d(), aVar.mo144862e(), yVar.f204904D, yVar.f204927y, z);
            if (a.f204405e != null) {
                aVar2 = new C90116f(yVar, aVar, this, a.f204405e);
            } else {
                a.f204403c.setSoTimeout(aVar.mo144861d());
                a.f204406f.timeout().mo143784a((long) aVar.mo144861d(), TimeUnit.MILLISECONDS);
                a.f204407g.timeout().mo143784a((long) aVar.mo144862e(), TimeUnit.MILLISECONDS);
                aVar2 = new C90101a(yVar, this, a.f204406f, a.f204407g);
            }
            synchronized (this.f204433c) {
                try {
                    this.f204438h = aVar2;
                } finally {
                    MethodCollector.m26664o(5386);
                }
            }
            return aVar2;
        } catch (IOException e) {
            C90079e eVar = new C90079e(e);
            MethodCollector.m26664o(5386);
            throw eVar;
        }
    }

    public C90082g(C90180j jVar, C90017a aVar, AbstractC90049e eVar, AbstractC90191p pVar, Object obj) {
        this.f204433c = jVar;
        this.f204431a = aVar;
        this.f204434d = eVar;
        this.f204435e = pVar;
        this.f204441l = new C90080f(aVar, m156389f(), eVar, pVar);
        this.f204440k = obj;
    }

    /* renamed from: a */
    private C90076c m156386a(int i, int i2, int i3, int i4, boolean z) {
        C90076c cVar;
        Socket socket;
        Socket socket2;
        C90076c cVar2;
        boolean z2;
        C90034ae aeVar;
        boolean z3;
        C90080f.C90081a aVar;
        MethodCollector.m26663i(5501);
        synchronized (this.f204433c) {
            try {
                if (this.f204444o) {
                    IllegalStateException illegalStateException = new IllegalStateException("released");
                    MethodCollector.m26664o(5501);
                    throw illegalStateException;
                } else if (this.f204438h != null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("codec != null");
                    MethodCollector.m26664o(5501);
                    throw illegalStateException2;
                } else if (!this.f204437g) {
                    cVar = this.f204436f;
                    if (f204430i || Thread.holdsLock(this.f204433c)) {
                        C90076c cVar3 = this.f204436f;
                        socket = null;
                        if (cVar3 == null || !cVar3.f204408h) {
                            socket2 = null;
                        } else {
                            socket2 = mo144835a(false, false, true);
                        }
                        cVar2 = this.f204436f;
                        if (cVar2 != null) {
                            cVar = null;
                        } else {
                            cVar2 = null;
                        }
                        if (!this.f204443n) {
                            cVar = null;
                        }
                        if (cVar2 == null) {
                            AbstractC90058a.f204330a.mo144785a(this.f204433c, this.f204431a, this, null);
                            C90076c cVar4 = this.f204436f;
                            if (cVar4 != null) {
                                cVar2 = cVar4;
                                z2 = true;
                                aeVar = null;
                            } else {
                                aeVar = this.f204432b;
                            }
                        } else {
                            aeVar = null;
                        }
                        z2 = false;
                    } else {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(5501);
                        throw assertionError;
                    }
                } else {
                    IOException iOException = new IOException("Canceled");
                    MethodCollector.m26664o(5501);
                    throw iOException;
                }
            } finally {
                MethodCollector.m26664o(5501);
            }
        }
        C90084c.m156416a(socket2);
        if (cVar != null) {
            this.f204435e.connectionReleased(this.f204434d, cVar);
        }
        if (z2) {
            this.f204435e.connectionAcquired(this.f204434d, cVar2);
        }
        if (cVar2 != null) {
            this.f204432b = this.f204436f.f204401a;
            MethodCollector.m26664o(5501);
            return cVar2;
        }
        if (aeVar != null || ((aVar = this.f204439j) != null && aVar.mo144834a())) {
            z3 = false;
        } else {
            this.f204439j = this.f204441l.mo144833b();
            z3 = true;
        }
        synchronized (this.f204433c) {
            try {
                if (!this.f204437g) {
                    if (z3) {
                        ArrayList arrayList = new ArrayList(this.f204439j.f204428a);
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                break;
                            }
                            C90034ae aeVar2 = (C90034ae) arrayList.get(i5);
                            AbstractC90058a.f204330a.mo144785a(this.f204433c, this.f204431a, this, aeVar2);
                            C90076c cVar5 = this.f204436f;
                            if (cVar5 != null) {
                                this.f204432b = aeVar2;
                                cVar2 = cVar5;
                                z2 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (!z2) {
                        if (aeVar == null) {
                            C90080f.C90081a aVar2 = this.f204439j;
                            if (aVar2.mo144834a()) {
                                List<C90034ae> list = aVar2.f204428a;
                                int i6 = aVar2.f204429b;
                                aVar2.f204429b = i6 + 1;
                                aeVar = list.get(i6);
                            } else {
                                NoSuchElementException noSuchElementException = new NoSuchElementException();
                                MethodCollector.m26664o(5501);
                                throw noSuchElementException;
                            }
                        }
                        this.f204432b = aeVar;
                        this.f204442m = 0;
                        cVar2 = new C90076c(this.f204433c, aeVar);
                        mo144839a(cVar2, false);
                    }
                } else {
                    IOException iOException2 = new IOException("Canceled");
                    MethodCollector.m26664o(5501);
                    throw iOException2;
                }
            } finally {
                MethodCollector.m26664o(5501);
            }
        }
        if (z2) {
            this.f204435e.connectionAcquired(this.f204434d, cVar2);
            MethodCollector.m26664o(5501);
            return cVar2;
        }
        cVar2.mo144817a(i, i2, i3, i4, z, this.f204434d, this.f204435e);
        m156389f().mo144827b(cVar2.f204401a);
        synchronized (this.f204433c) {
            try {
                this.f204443n = true;
                AbstractC90058a.f204330a.mo144793b(this.f204433c, cVar2);
                if (cVar2.mo144823d()) {
                    socket = AbstractC90058a.f204330a.mo144783a(this.f204433c, this.f204431a, this);
                    cVar2 = this.f204436f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C90084c.m156416a(socket);
        this.f204435e.connectionAcquired(this.f204434d, cVar2);
        MethodCollector.m26664o(5501);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r2.mo144822a(r10) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.p4654b.C90076c m156387a(int r5, int r6, int r7, int r8, boolean r9, boolean r10) {
        /*
            r4 = this;
            r3 = 5496(0x1578, float:7.702E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
        L_0x0005:
            okhttp3.internal.b.c r2 = r4.m156386a(r5, r6, r7, r8, r9)
            okhttp3.j r1 = r4.f204433c
            monitor-enter(r1)
            int r0 = r2.f204409i     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.mo144823d()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0023
        L_0x0018:
            monitor-exit(r1)
            boolean r0 = r2.mo144822a(r10)
            if (r0 != 0) goto L_0x0027
            r4.mo144843d()
            goto L_0x0005
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x0027:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4654b.C90082g.m156387a(int, int, int, int, boolean, boolean):okhttp3.internal.b.c");
    }
}
