package com.google.p1998c.p2006h.p2007a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27230c;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27254p;
import com.google.p1998c.p2006h.p2007a.C27659u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.c.h.a.b */
public abstract class AbstractC27620b<V> extends AbstractC27641h<V> {

    /* renamed from: a */
    private static final Logger f65002a = Logger.getLogger(AbstractC27620b.class.getName());

    /* renamed from: b */
    private static final Object f65003b = new Object();

    /* renamed from: d */
    public static final boolean f65004d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final AbstractC27621a f65005e;

    /* renamed from: f */
    public volatile Object f65006f;

    /* renamed from: g */
    public volatile C27625d f65007g;

    /* renamed from: h */
    public volatile C27632j f65008h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo46222b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo46228c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$a */
    public static abstract class AbstractC27621a {
        static {
            Covode.recordClassIndex(33201);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo46236a(C27632j jVar, C27632j jVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo46237a(C27632j jVar, Thread thread);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo46238a(AbstractC27620b<?> bVar, C27625d dVar, C27625d dVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo46239a(AbstractC27620b<?> bVar, C27632j jVar, C27632j jVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo46240a(AbstractC27620b<?> bVar, Object obj, Object obj2);

        private AbstractC27621a() {
        }

        /* synthetic */ AbstractC27621a(byte b) {
            this();
        }
    }

    /* renamed from: com.google.c.h.a.b$h */
    public static abstract class AbstractC27629h<V> extends AbstractC27620b<V> {
        static {
            Covode.recordClassIndex(33209);
        }

        AbstractC27629h() {
        }

        @Override // java.util.concurrent.Future, com.google.p1998c.p2006h.p2007a.AbstractC27620b
        public final V get() {
            return (V) AbstractC27620b.super.get();
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
        public final boolean isCancelled() {
            return AbstractC27620b.super.isCancelled();
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
        public final boolean isDone() {
            return AbstractC27620b.super.isDone();
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b
        public final boolean cancel(boolean z) {
            return AbstractC27620b.super.cancel(z);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q, com.google.p1998c.p2006h.p2007a.AbstractC27620b
        /* renamed from: a */
        public final void mo5481a(Runnable runnable, Executor executor) {
            AbstractC27620b.super.mo5481a(runnable, executor);
        }

        @Override // java.util.concurrent.Future, com.google.p1998c.p2006h.p2007a.AbstractC27620b
        public final V get(long j, TimeUnit timeUnit) {
            return (V) AbstractC27620b.super.get(j, timeUnit);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$j */
    public static final class C27632j {

        /* renamed from: a */
        static final C27632j f65032a = new C27632j();

        /* renamed from: b */
        volatile Thread f65033b;

        /* renamed from: c */
        volatile C27632j f65034c;

        C27632j() {
        }

        static {
            Covode.recordClassIndex(33212);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46244a() {
            Thread thread = this.f65033b;
            if (thread != null) {
                this.f65033b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46245a(C27632j jVar) {
            AbstractC27620b.f65005e.mo46236a(this, jVar);
        }

        C27632j(byte b) {
            AbstractC27620b.f65005e.mo46237a(this, Thread.currentThread());
        }
    }

    /* renamed from: a */
    public boolean mo46226a(Throwable th) {
        if (!f65005e.mo46240a((AbstractC27620b<?>) this, (Object) null, (Object) new C27623c((Throwable) C27245k.m54229a(th)))) {
            return false;
        }
        m55235a((AbstractC27620b<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo46225a(AbstractFutureC27655q<? extends V> qVar) {
        RunnableC27627f fVar;
        C27623c cVar;
        C27245k.m54229a(qVar);
        Object obj = this.f65006f;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f65005e.mo46240a((AbstractC27620b<?>) this, (Object) null, m55237b((AbstractFutureC27655q<?>) qVar))) {
                    return false;
                }
                m55235a((AbstractC27620b<?>) this);
                return true;
            }
            fVar = new RunnableC27627f(this, qVar);
            if (f65005e.mo46240a((AbstractC27620b<?>) this, (Object) null, (Object) fVar)) {
                try {
                    qVar.mo5481a(fVar, C27659u.EnumC27662a.INSTANCE);
                } catch (Throwable unused) {
                    cVar = C27623c.f65013a;
                }
                return true;
            }
            obj = this.f65006f;
        }
        if (obj instanceof C27622b) {
            qVar.cancel(((C27622b) obj).f65011c);
        }
        return false;
        f65005e.mo46240a((AbstractC27620b<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46224a(Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && isCancelled()) {
            future.cancel(mo46230d());
        }
    }

    /* renamed from: com.google.c.h.a.b$g */
    static final class C27628g extends AbstractC27621a {
        static {
            Covode.recordClassIndex(33208);
        }

        private C27628g() {
            super((byte) 0);
        }

        /* synthetic */ C27628g(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46236a(C27632j jVar, C27632j jVar2) {
            jVar.f65034c = jVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46237a(C27632j jVar, Thread thread) {
            jVar.f65033b = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46238a(AbstractC27620b<?> bVar, C27625d dVar, C27625d dVar2) {
            MethodCollector.m26663i(2372);
            synchronized (bVar) {
                try {
                    if (bVar.f65007g == dVar) {
                        bVar.f65007g = dVar2;
                        return true;
                    }
                    MethodCollector.m26664o(2372);
                    return false;
                } finally {
                    MethodCollector.m26664o(2372);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46239a(AbstractC27620b<?> bVar, C27632j jVar, C27632j jVar2) {
            MethodCollector.m26663i(2369);
            synchronized (bVar) {
                try {
                    if (bVar.f65008h == jVar) {
                        bVar.f65008h = jVar2;
                        return true;
                    }
                    MethodCollector.m26664o(2369);
                    return false;
                } finally {
                    MethodCollector.m26664o(2369);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46240a(AbstractC27620b<?> bVar, Object obj, Object obj2) {
            MethodCollector.m26663i(2374);
            synchronized (bVar) {
                try {
                    if (bVar.f65006f == obj) {
                        bVar.f65006f = obj2;
                        return true;
                    }
                    MethodCollector.m26664o(2374);
                    return false;
                } finally {
                    MethodCollector.m26664o(2374);
                }
            }
        }
    }

    /* renamed from: com.google.c.h.a.b$i */
    static final class C27630i extends AbstractC27621a {

        /* renamed from: a */
        static final Unsafe f65026a;

        /* renamed from: b */
        static final long f65027b;

        /* renamed from: c */
        static final long f65028c;

        /* renamed from: d */
        static final long f65029d;

        /* renamed from: e */
        static final long f65030e;

        /* renamed from: f */
        static final long f65031f;

        private C27630i() {
            super((byte) 0);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2006h.p2007a.AbstractC27620b.C27630i.<clinit>():void");
        }

        /* synthetic */ C27630i(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46236a(C27632j jVar, C27632j jVar2) {
            f65026a.putObject(jVar, f65031f, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46237a(C27632j jVar, Thread thread) {
            f65026a.putObject(jVar, f65030e, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46238a(AbstractC27620b<?> bVar, C27625d dVar, C27625d dVar2) {
            return f65026a.compareAndSwapObject(bVar, f65027b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46239a(AbstractC27620b<?> bVar, C27632j jVar, C27632j jVar2) {
            return f65026a.compareAndSwapObject(bVar, f65028c, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46240a(AbstractC27620b<?> bVar, Object obj, Object obj2) {
            return f65026a.compareAndSwapObject(bVar, f65029d, obj, obj2);
        }
    }

    public boolean isCancelled() {
        return this.f65006f instanceof C27622b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$d */
    public static final class C27625d {

        /* renamed from: a */
        static final C27625d f65015a = new C27625d(null, null);

        /* renamed from: b */
        final Runnable f65016b;

        /* renamed from: c */
        final Executor f65017c;

        /* renamed from: d */
        C27625d f65018d;

        static {
            Covode.recordClassIndex(33205);
        }

        C27625d(Runnable runnable, Executor executor) {
            this.f65016b = runnable;
            this.f65017c = executor;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo46230d() {
        Object obj = this.f65006f;
        if (!(obj instanceof C27622b) || !((C27622b) obj).f65011c) {
            return false;
        }
        return true;
    }

    public boolean isDone() {
        boolean z;
        Object obj = this.f65006f;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC27627f)) & z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$c */
    public static final class C27623c {

        /* renamed from: a */
        static final C27623c f65013a = new C27623c(new Throwable("Failure occurred while trying to finish a future.") {
            /* class com.google.p1998c.p2006h.p2007a.AbstractC27620b.C27623c.C276241 */

            static {
                Covode.recordClassIndex(33204);
            }

            public final synchronized Throwable fillInStackTrace() {
                MethodCollector.m26663i(2379);
                MethodCollector.m26664o(2379);
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f65014b;

        static {
            Covode.recordClassIndex(33203);
        }

        C27623c(Throwable th) {
            this.f65014b = (Throwable) C27245k.m54229a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$f */
    public static final class RunnableC27627f<V> implements Runnable {

        /* renamed from: a */
        final AbstractC27620b<V> f65024a;

        /* renamed from: b */
        final AbstractFutureC27655q<? extends V> f65025b;

        static {
            Covode.recordClassIndex(33207);
        }

        public final void run() {
            if (this.f65024a.f65006f == this) {
                if (AbstractC27620b.f65005e.mo46240a((AbstractC27620b<?>) this.f65024a, (Object) this, AbstractC27620b.m55237b((AbstractFutureC27655q<?>) this.f65025b))) {
                    AbstractC27620b.m55235a((AbstractC27620b<?>) this.f65024a);
                }
            }
        }

        RunnableC27627f(AbstractC27620b<V> bVar, AbstractFutureC27655q<? extends V> qVar) {
            this.f65024a = bVar;
            this.f65025b = qVar;
        }
    }

    /* renamed from: e */
    private void mo116317e() {
        C27632j jVar;
        do {
            jVar = this.f65008h;
        } while (!f65005e.mo46239a((AbstractC27620b<?>) this, jVar, C27632j.f65032a));
        while (jVar != null) {
            jVar.mo46244a();
            jVar = jVar.f65034c;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.h.a.b$b */
    public static final class C27622b {

        /* renamed from: a */
        static final C27622b f65009a;

        /* renamed from: b */
        static final C27622b f65010b;

        /* renamed from: c */
        final boolean f65011c;

        /* renamed from: d */
        final Throwable f65012d;

        static {
            Covode.recordClassIndex(33202);
            if (AbstractC27620b.f65004d) {
                f65010b = null;
                f65009a = null;
                return;
            }
            f65010b = new C27622b(false, null);
            f65009a = new C27622b(true, null);
        }

        C27622b(boolean z, Throwable th) {
            this.f65011c = z;
            this.f65012d = th;
        }
    }

    static {
        AbstractC27621a aVar;
        Throwable th;
        Covode.recordClassIndex(33200);
        Throwable th2 = null;
        try {
            aVar = new C27630i((byte) 0);
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            aVar = new C27628g((byte) 0);
        }
        f65005e = aVar;
        if (th2 != null) {
            Logger logger = f65002a;
            logger.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            logger.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.f65006f;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj2 instanceof RunnableC27627f))) {
                return (V) mo46221a(obj2);
            }
            C27632j jVar = this.f65008h;
            if (jVar != C27632j.f65032a) {
                C27632j jVar2 = new C27632j((byte) 0);
                do {
                    jVar2.mo46245a(jVar);
                    if (f65005e.mo46239a((AbstractC27620b<?>) this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f65006f;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                m55234a(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof RunnableC27627f))));
                        return (V) mo46221a(obj);
                    }
                    jVar = this.f65008h;
                } while (jVar != C27632j.f65032a);
            }
            return (V) mo46221a(this.f65006f);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            m55236a(append);
        } else {
            try {
                str = mo46220a();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (!C27254p.m54261a(str)) {
                append.append("PENDING, info=[").append(str).append("]");
            } else if (isDone()) {
                m55236a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo46220a() {
        Object obj = this.f65006f;
        if (obj instanceof RunnableC27627f) {
            return "setFuture=[" + m55239c(((RunnableC27627f) obj).f65025b) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* renamed from: c */
    private String m55239c(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C27625d m55231a(C27625d dVar) {
        C27625d dVar2;
        do {
            dVar2 = this.f65007g;
        } while (!f65005e.mo46238a((AbstractC27620b<?>) this, dVar2, C27625d.f65015a));
        while (dVar2 != null) {
            C27625d dVar3 = dVar2.f65018d;
            dVar2.f65018d = dVar;
            dVar = dVar2;
            dVar2 = dVar3;
        }
        return dVar;
    }

    /* renamed from: b */
    public boolean mo46227b(V v) {
        if (v == null) {
            v = (V) f65003b;
        }
        if (!f65005e.mo46240a((AbstractC27620b<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        m55235a((AbstractC27620b<?>) this);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static V mo46221a(Object obj) {
        if (obj instanceof C27622b) {
            throw m55233a("Task was cancelled.", ((C27622b) obj).f65012d);
        } else if (obj instanceof C27623c) {
            throw new ExecutionException(((C27623c) obj).f65014b);
        } else if (obj == f65003b) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: a */
    private void m55234a(C27632j jVar) {
        jVar.f65033b = null;
        while (true) {
            C27632j jVar2 = this.f65008h;
            if (jVar2 != C27632j.f65032a) {
                C27632j jVar3 = null;
                while (jVar2 != null) {
                    C27632j jVar4 = jVar2.f65034c;
                    if (jVar2.f65033b != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.f65034c = jVar4;
                        if (jVar3.f65033b == null) {
                        }
                    } else if (f65005e.mo46239a((AbstractC27620b<?>) this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: b */
    public static Object m55237b(AbstractFutureC27655q<?> qVar) {
        if (qVar instanceof AbstractC27629h) {
            Object obj = ((AbstractC27620b) qVar).f65006f;
            if (!(obj instanceof C27622b)) {
                return obj;
            }
            C27622b bVar = (C27622b) obj;
            if (!bVar.f65011c) {
                return obj;
            }
            if (bVar.f65012d != null) {
                return new C27622b(false, bVar.f65012d);
            }
            return C27622b.f65010b;
        }
        try {
            Object a = C27646l.m55297a((Future) qVar);
            if (a == null) {
                return f65003b;
            }
            return a;
        } catch (ExecutionException e) {
            return new C27623c(e.getCause());
        } catch (CancellationException e2) {
            return new C27622b(false, e2);
        } catch (Throwable th) {
            return new C27623c(th);
        }
    }

    public boolean cancel(boolean z) {
        boolean z2;
        C27622b bVar;
        boolean z3;
        Object obj = this.f65006f;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof RunnableC27627f)) {
            return false;
        }
        if (f65004d) {
            bVar = new C27622b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C27622b.f65009a;
        } else {
            bVar = C27622b.f65010b;
        }
        boolean z4 = false;
        AbstractC27620b<V> bVar2 = this;
        while (true) {
            if (f65005e.mo46240a((AbstractC27620b<?>) bVar2, obj, (Object) bVar)) {
                if (z) {
                    bVar2.mo46228c();
                }
                m55235a((AbstractC27620b<?>) bVar2);
                if (!(obj instanceof RunnableC27627f)) {
                    return true;
                }
                AbstractFutureC27655q<? extends V> qVar = ((RunnableC27627f) obj).f65025b;
                if (qVar instanceof AbstractC27629h) {
                    bVar2 = (AbstractC27620b) qVar;
                    obj = bVar2.f65006f;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof RunnableC27627f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    qVar.cancel(z);
                    return true;
                }
            } else {
                obj = bVar2.f65006f;
                if (!(obj instanceof RunnableC27627f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.c.h.a.b<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.c.h.a.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.c.h.a.b, com.google.c.h.a.b<V>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.c.h.a.b$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m55235a(com.google.p1998c.p2006h.p2007a.AbstractC27620b<?> r4) {
        /*
            r3 = 0
        L_0x0001:
            r4.mo116317e()
            r4.mo46222b()
            com.google.c.h.a.b$d r1 = r4.m55231a(r3)
        L_0x000b:
            if (r1 == 0) goto L_0x0033
            com.google.c.h.a.b$d r3 = r1.f65018d
            java.lang.Runnable r2 = r1.f65016b
            boolean r0 = r2 instanceof com.google.p1998c.p2006h.p2007a.AbstractC27620b.RunnableC27627f
            if (r0 == 0) goto L_0x002d
            com.google.c.h.a.b$f r2 = (com.google.p1998c.p2006h.p2007a.AbstractC27620b.RunnableC27627f) r2
            com.google.c.h.a.b<V> r4 = r2.f65024a
            java.lang.Object r0 = r4.f65006f
            if (r0 != r2) goto L_0x002b
            com.google.c.h.a.q<? extends V> r0 = r2.f65025b
            java.lang.Object r1 = m55237b(r0)
            com.google.c.h.a.b$a r0 = com.google.p1998c.p2006h.p2007a.AbstractC27620b.f65005e
            boolean r0 = r0.mo46240a(r4, r2, r1)
            if (r0 != 0) goto L_0x0001
        L_0x002b:
            r1 = r3
            goto L_0x000b
        L_0x002d:
            java.util.concurrent.Executor r0 = r1.f65017c
            mo104629b(r2, r0)
            goto L_0x002b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2006h.p2007a.AbstractC27620b.m55235a(com.google.c.h.a.b):void");
    }

    /* renamed from: a */
    private void m55236a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(m55239c(C27646l.m55297a((Future) this))).append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[").append(e.getCause()).append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[").append(e2.getClass()).append(" thrown from get()]");
        }
    }

    /* renamed from: com.google.c.h.a.b$e */
    static final class C27626e extends AbstractC27621a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C27632j, Thread> f65019a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C27632j, C27632j> f65020b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC27620b, C27632j> f65021c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC27620b, C27625d> f65022d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC27620b, Object> f65023e;

        static {
            Covode.recordClassIndex(33206);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46236a(C27632j jVar, C27632j jVar2) {
            this.f65020b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final void mo46237a(C27632j jVar, Thread thread) {
            this.f65019a.lazySet(jVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46238a(AbstractC27620b<?> bVar, C27625d dVar, C27625d dVar2) {
            return this.f65022d.compareAndSet(bVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46239a(AbstractC27620b<?> bVar, C27632j jVar, C27632j jVar2) {
            return this.f65021c.compareAndSet(bVar, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27620b.AbstractC27621a
        /* renamed from: a */
        public final boolean mo46240a(AbstractC27620b<?> bVar, Object obj, Object obj2) {
            return this.f65023e.compareAndSet(bVar, obj, obj2);
        }

        C27626e(AtomicReferenceFieldUpdater<C27632j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C27632j, C27632j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC27620b, C27632j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC27620b, C27625d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC27620b, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.f65019a = atomicReferenceFieldUpdater;
            this.f65020b = atomicReferenceFieldUpdater2;
            this.f65021c = atomicReferenceFieldUpdater3;
            this.f65022d = atomicReferenceFieldUpdater4;
            this.f65023e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: a */
    private static CancellationException m55233a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void mo104629b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f65002a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f65006f;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj instanceof RunnableC27627f))) {
                return (V) mo46221a(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C27632j jVar = this.f65008h;
                if (jVar != C27632j.f65032a) {
                    C27632j jVar2 = new C27632j((byte) 0);
                    do {
                        jVar2.mo46245a(jVar);
                        if (f65005e.mo46239a((AbstractC27620b<?>) this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f65006f;
                                    if (obj2 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3 && (!(obj2 instanceof RunnableC27627f))) {
                                        return (V) mo46221a(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m55234a(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m55234a(jVar2);
                        } else {
                            jVar = this.f65008h;
                        }
                    } while (jVar != C27632j.f65032a);
                }
                return (V) mo46221a(this.f65006f);
            }
            while (nanos > 0) {
                Object obj3 = this.f65006f;
                if (obj3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (!(obj3 instanceof RunnableC27627f))) {
                    return (V) mo46221a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String bVar = toString();
            if (isDone()) {
                throw new TimeoutException("Waited " + j + " " + C27230c.m54196a(timeUnit.toString()) + " but future completed as timeout expired");
            }
            throw new TimeoutException("Waited " + j + " " + C27230c.m54196a(timeUnit.toString()) + " for " + bVar);
        }
        throw new InterruptedException();
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q
    /* renamed from: a */
    public void mo5481a(Runnable runnable, Executor executor) {
        C27245k.m54230a(runnable, "Runnable was null.");
        C27245k.m54230a(executor, "Executor was null.");
        C27625d dVar = this.f65007g;
        if (dVar != C27625d.f65015a) {
            C27625d dVar2 = new C27625d(runnable, executor);
            do {
                dVar2.f65018d = dVar;
                if (!f65005e.mo46238a((AbstractC27620b<?>) this, dVar, dVar2)) {
                    dVar = this.f65007g;
                } else {
                    return;
                }
            } while (dVar != C27625d.f65015a);
        }
        mo104629b(runnable, executor);
    }
}
