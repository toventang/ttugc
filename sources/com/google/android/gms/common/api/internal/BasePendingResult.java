package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.AbstractC25482m;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.AbstractC25486q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC25554m;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult<R extends AbstractC25485p> extends AbstractC25478k<R> {

    /* renamed from: c */
    static final ThreadLocal<Boolean> f60153c = new C25431cl();

    /* renamed from: a */
    private final Object f60154a;

    /* renamed from: b */
    private final HandlerC25361a<R> f60155b;

    /* renamed from: d */
    R f60156d;

    /* renamed from: e */
    private final WeakReference<AbstractC25357i> f60157e;

    /* renamed from: f */
    private final CountDownLatch f60158f;

    /* renamed from: g */
    private final ArrayList<AbstractC25478k.AbstractC25479a> f60159g;

    /* renamed from: h */
    private AbstractC25486q<? super R> f60160h;

    /* renamed from: i */
    private final AtomicReference<AbstractC25419ca> f60161i;

    /* renamed from: j */
    private Status f60162j;

    /* renamed from: k */
    private volatile boolean f60163k;

    /* renamed from: l */
    private boolean f60164l;

    /* renamed from: m */
    private boolean f60165m;
    private C25362b mResultGuardian;

    /* renamed from: n */
    private AbstractC25554m f60166n;

    /* renamed from: o */
    private volatile C25412bv<R> f60167o;

    /* renamed from: p */
    private boolean f60168p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo41417a(Status status);

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: c */
    public final Integer mo41545c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    public final class C25362b {
        static {
            Covode.recordClassIndex(30760);
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            super.finalize();
        }

        private C25362b() {
        }

        /* synthetic */ C25362b(BasePendingResult basePendingResult, byte b) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC25361a<R extends AbstractC25485p> extends HandlerC25727g {
        static {
            Covode.recordClassIndex(30759);
        }

        public HandlerC25361a() {
            this(Looper.getMainLooper());
        }

        public HandlerC25361a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.common.api.q */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                try {
                    ((AbstractC25486q) pair.first).mo34357a((AbstractC25485p) pair.second);
                } catch (RuntimeException e) {
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo41546c(Status.f60103d);
            }
        }

        /* renamed from: a */
        public final void mo41549a(AbstractC25486q<? super R> qVar, R r) {
            sendMessage(obtainMessage(1, new Pair(qVar, r)));
        }
    }

    static {
        Covode.recordClassIndex(30758);
    }

    /* renamed from: f */
    private boolean m48779f() {
        if (this.f60158f.getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: b */
    public final boolean mo41544b() {
        boolean z;
        synchronized (this.f60154a) {
            z = this.f60164l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: a */
    public final void mo41539a() {
        synchronized (this.f60154a) {
            if (!this.f60164l && !this.f60163k) {
                this.f60164l = true;
                m48778b(mo41417a(Status.f60104e));
            }
        }
    }

    /* renamed from: d */
    public final boolean mo41547d() {
        boolean b;
        synchronized (this.f60154a) {
            if (this.f60157e.get() == null || !this.f60168p) {
                mo41539a();
            }
            b = mo41544b();
        }
        return b;
    }

    /* renamed from: e */
    public final void mo41548e() {
        boolean z;
        if (this.f60168p || f60153c.get().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f60168p = z;
    }

    BasePendingResult() {
        this.f60154a = new Object();
        this.f60158f = new CountDownLatch(1);
        this.f60159g = new ArrayList<>();
        this.f60161i = new AtomicReference<>();
        this.f60168p = false;
        this.f60155b = new HandlerC25361a<>(Looper.getMainLooper());
        this.f60157e = new WeakReference<>(null);
    }

    /* renamed from: g */
    private final R m48780g() {
        boolean z;
        R r;
        synchronized (this.f60154a) {
            if (!this.f60163k) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49321a(z, "Result has already been consumed.");
            C25565r.m49321a(m48779f(), "Result is not ready.");
            r = this.f60156d;
            this.f60156d = null;
            this.f60160h = null;
            this.f60163k = true;
        }
        AbstractC25419ca andSet = this.f60161i.getAndSet(null);
        if (andSet != null) {
            andSet.mo41636a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final void mo41540a(AbstractC25419ca caVar) {
        this.f60161i.set(caVar);
    }

    /* renamed from: c */
    public final void mo41546c(Status status) {
        synchronized (this.f60154a) {
            if (!m48779f()) {
                mo41542a(mo41417a(status));
                this.f60165m = true;
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: a */
    public final R mo41538a(TimeUnit timeUnit) {
        boolean z = true;
        C25565r.m49321a(!this.f60163k, "Result has already been consumed.");
        if (this.f60167o != null) {
            z = false;
        }
        C25565r.m49321a(z, "Cannot await if then() has been called.");
        try {
            if (!this.f60158f.await(0, timeUnit)) {
                mo41546c(Status.f60103d);
            }
        } catch (InterruptedException unused) {
            mo41546c(Status.f60101b);
        }
        C25565r.m49321a(m48779f(), "Result is not ready.");
        return m48780g();
    }

    public BasePendingResult(AbstractC25357i iVar) {
        Looper mainLooper;
        this.f60154a = new Object();
        this.f60158f = new CountDownLatch(1);
        this.f60159g = new ArrayList<>();
        this.f60161i = new AtomicReference<>();
        this.f60168p = false;
        if (iVar != null) {
            mainLooper = iVar.mo41529c();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f60155b = new HandlerC25361a<>(mainLooper);
        this.f60157e = new WeakReference<>(iVar);
    }

    /* renamed from: b */
    private final void m48778b(R r) {
        this.f60156d = r;
        this.f60166n = null;
        this.f60158f.countDown();
        this.f60162j = this.f60156d.mo41384D_();
        int i = 0;
        if (this.f60164l) {
            this.f60160h = null;
        } else if (this.f60160h != null) {
            this.f60155b.removeMessages(2);
            this.f60155b.mo41549a(this.f60160h, m48780g());
        } else if (this.f60156d instanceof AbstractC25482m) {
            this.mResultGuardian = new C25362b(this, (byte) 0);
        }
        ArrayList<AbstractC25478k.AbstractC25479a> arrayList = this.f60159g;
        int size = arrayList.size();
        while (i < size) {
            AbstractC25478k.AbstractC25479a aVar = arrayList.get(i);
            i++;
            aVar.mo41717a(this.f60162j);
        }
        this.f60159g.clear();
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: a */
    public final void mo41541a(AbstractC25478k.AbstractC25479a aVar) {
        C25565r.m49325b(true, "Callback cannot be null.");
        synchronized (this.f60154a) {
            if (m48779f()) {
                aVar.mo41717a(this.f60162j);
            } else {
                this.f60159g.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo41542a(R r) {
        boolean z;
        synchronized (this.f60154a) {
            if (!this.f60165m && !this.f60164l) {
                m48779f();
                boolean z2 = true;
                if (!m48779f()) {
                    z = true;
                } else {
                    z = false;
                }
                C25565r.m49321a(z, "Results have already been set");
                if (this.f60163k) {
                    z2 = false;
                }
                C25565r.m49321a(z2, "Result has already been consumed");
                m48778b(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25478k
    /* renamed from: a */
    public final void mo41543a(AbstractC25486q<? super R> qVar) {
        boolean z;
        synchronized (this.f60154a) {
            if (qVar == null) {
                this.f60160h = null;
                return;
            }
            boolean z2 = true;
            if (!this.f60163k) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49321a(z, "Result has already been consumed.");
            if (this.f60167o != null) {
                z2 = false;
            }
            C25565r.m49321a(z2, "Cannot set callbacks if then() has been called.");
            if (!mo41544b()) {
                if (m48779f()) {
                    this.f60155b.mo41549a(qVar, m48780g());
                } else {
                    this.f60160h = qVar;
                }
            }
        }
    }
}
