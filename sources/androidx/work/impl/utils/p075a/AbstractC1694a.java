package androidx.work.impl.utils.p075a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import java.util.Locale;
import java.util.Objects;
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

/* renamed from: androidx.work.impl.utils.a.a */
public abstract class AbstractC1694a<V> implements AbstractFutureC27655q<V> {

    /* renamed from: a */
    static final boolean f5481a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: b */
    static final AbstractC1695a f5482b;

    /* renamed from: f */
    private static final Logger f5483f = Logger.getLogger(AbstractC1694a.class.getName());

    /* renamed from: g */
    private static final Object f5484g = new Object();

    /* renamed from: c */
    volatile Object f5485c;

    /* renamed from: d */
    volatile C1699d f5486d;

    /* renamed from: e */
    volatile C1703h f5487e;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$a */
    public static abstract class AbstractC1695a {
        static {
            Covode.recordClassIndex(1862);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo5491a(C1703h hVar, C1703h hVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo5492a(C1703h hVar, Thread thread);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo5493a(AbstractC1694a<?> aVar, C1699d dVar, C1699d dVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo5494a(AbstractC1694a<?> aVar, C1703h hVar, C1703h hVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo5495a(AbstractC1694a<?> aVar, Object obj, Object obj2);

        private AbstractC1695a() {
        }

        /* synthetic */ AbstractC1695a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$h */
    public static final class C1703h {

        /* renamed from: a */
        static final C1703h f5505a = new C1703h();

        /* renamed from: b */
        volatile Thread f5506b;

        /* renamed from: c */
        volatile C1703h f5507c;

        C1703h() {
        }

        static {
            Covode.recordClassIndex(1870);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5498a() {
            Thread thread = this.f5506b;
            if (thread != null) {
                this.f5506b = null;
                LockSupport.unpark(thread);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5499a(C1703h hVar) {
            AbstractC1694a.f5482b.mo5491a(this, hVar);
        }

        C1703h(byte b) {
            AbstractC1694a.f5482b.mo5492a(this, Thread.currentThread());
        }
    }

    protected AbstractC1694a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5483a(V v) {
        if (v == null) {
            v = (V) f5484g;
        }
        if (!f5482b.mo5495a((AbstractC1694a<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        m5568a((AbstractC1694a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5484a(Throwable th) {
        if (!f5482b.mo5495a((AbstractC1694a<?>) this, (Object) null, (Object) new C1697c((Throwable) m5571b(th)))) {
            return false;
        }
        m5568a((AbstractC1694a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5482a(AbstractFutureC27655q<? extends V> qVar) {
        RunnableC1701f fVar;
        C1697c cVar;
        m5571b((Object) qVar);
        Object obj = this.f5485c;
        if (obj == null) {
            if (qVar.isDone()) {
                if (!f5482b.mo5495a((AbstractC1694a<?>) this, (Object) null, m5570b((AbstractFutureC27655q<?>) qVar))) {
                    return false;
                }
                m5568a((AbstractC1694a<?>) this);
                return true;
            }
            fVar = new RunnableC1701f(this, qVar);
            if (f5482b.mo5495a((AbstractC1694a<?>) this, (Object) null, (Object) fVar)) {
                try {
                    qVar.mo5481a(fVar, EnumC1704b.INSTANCE);
                } catch (Throwable unused) {
                    cVar = C1697c.f5492a;
                }
                return true;
            }
            obj = this.f5485c;
        }
        if (obj instanceof C1696b) {
            qVar.cancel(((C1696b) obj).f5490c);
        }
        return false;
        f5482b.mo5495a((AbstractC1694a<?>) this, (Object) fVar, (Object) cVar);
        return true;
    }

    /* renamed from: androidx.work.impl.utils.a.a$g */
    static final class C1702g extends AbstractC1695a {
        static {
            Covode.recordClassIndex(1869);
        }

        C1702g() {
            super((byte) 0);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final void mo5491a(C1703h hVar, C1703h hVar2) {
            hVar.f5507c = hVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final void mo5492a(C1703h hVar, Thread thread) {
            hVar.f5506b = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5493a(AbstractC1694a<?> aVar, C1699d dVar, C1699d dVar2) {
            synchronized (aVar) {
                if (aVar.f5486d != dVar) {
                    return false;
                }
                aVar.f5486d = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5494a(AbstractC1694a<?> aVar, C1703h hVar, C1703h hVar2) {
            synchronized (aVar) {
                if (aVar.f5487e != hVar) {
                    return false;
                }
                aVar.f5487e = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5495a(AbstractC1694a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5485c != obj) {
                    return false;
                }
                aVar.f5485c = obj2;
                return true;
            }
        }
    }

    public final boolean isCancelled() {
        return this.f5485c instanceof C1696b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$d */
    public static final class C1699d {

        /* renamed from: a */
        static final C1699d f5494a = new C1699d(null, null);

        /* renamed from: b */
        final Runnable f5495b;

        /* renamed from: c */
        final Executor f5496c;

        /* renamed from: d */
        C1699d f5497d;

        static {
            Covode.recordClassIndex(1866);
        }

        C1699d(Runnable runnable, Executor executor) {
            this.f5495b = runnable;
            this.f5496c = executor;
        }
    }

    public final boolean isDone() {
        boolean z;
        Object obj = this.f5485c;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC1701f)) & z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$b */
    public static final class C1696b {

        /* renamed from: a */
        static final C1696b f5488a;

        /* renamed from: b */
        static final C1696b f5489b;

        /* renamed from: c */
        final boolean f5490c;

        /* renamed from: d */
        final Throwable f5491d;

        static {
            Covode.recordClassIndex(1863);
            if (AbstractC1694a.f5481a) {
                f5489b = null;
                f5488a = null;
                return;
            }
            f5489b = new C1696b(false, null);
            f5488a = new C1696b(true, null);
        }

        C1696b(boolean z, Throwable th) {
            this.f5490c = z;
            this.f5491d = th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$c */
    public static final class C1697c {

        /* renamed from: a */
        static final C1697c f5492a = new C1697c(new Throwable("Failure occurred while trying to finish a future.") {
            /* class androidx.work.impl.utils.p075a.AbstractC1694a.C1697c.C16981 */

            static {
                Covode.recordClassIndex(1865);
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f5493b;

        static {
            Covode.recordClassIndex(1864);
        }

        C1697c(Throwable th) {
            this.f5493b = (Throwable) AbstractC1694a.m5571b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.utils.a.a$f */
    public static final class RunnableC1701f<V> implements Runnable {

        /* renamed from: a */
        final AbstractC1694a<V> f5503a;

        /* renamed from: b */
        final AbstractFutureC27655q<? extends V> f5504b;

        static {
            Covode.recordClassIndex(1868);
        }

        public final void run() {
            if (this.f5503a.f5485c == this) {
                if (AbstractC1694a.f5482b.mo5495a((AbstractC1694a<?>) this.f5503a, (Object) this, AbstractC1694a.m5570b((AbstractFutureC27655q<?>) this.f5504b))) {
                    AbstractC1694a.m5568a((AbstractC1694a<?>) this.f5503a);
                }
            }
        }

        RunnableC1701f(AbstractC1694a<V> aVar, AbstractFutureC27655q<? extends V> qVar) {
            this.f5503a = aVar;
            this.f5504b = qVar;
        }
    }

    static {
        AbstractC1695a aVar;
        Throwable th;
        Covode.recordClassIndex(1861);
        try {
            aVar = new C1700e(AtomicReferenceFieldUpdater.newUpdater(C1703h.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(C1703h.class, C1703h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694a.class, C1703h.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694a.class, C1699d.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1694a.class, Object.class, "c"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            aVar = new C1702g();
        }
        f5482b = aVar;
        if (th != null) {
            f5483f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    /* renamed from: a */
    private void m5566a() {
        C1703h hVar;
        do {
            hVar = this.f5487e;
        } while (!f5482b.mo5494a((AbstractC1694a<?>) this, hVar, C1703h.f5505a));
        while (hVar != null) {
            hVar.mo5498a();
            hVar = hVar.f5507c;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5485c;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj2 instanceof RunnableC1701f))) {
                return (V) m5573c(obj2);
            }
            C1703h hVar = this.f5487e;
            if (hVar != C1703h.f5505a) {
                C1703h hVar2 = new C1703h((byte) 0);
                do {
                    hVar2.mo5499a(hVar);
                    if (f5482b.mo5494a((AbstractC1694a<?>) this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5485c;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                m5567a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & (!(obj instanceof RunnableC1701f))));
                        return (V) m5573c(obj);
                    }
                    hVar = this.f5487e;
                } while (hVar != C1703h.f5505a);
            }
            return (V) m5573c(this.f5485c);
        }
        throw new InterruptedException();
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            m5569a(append);
        } else {
            try {
                Object obj = this.f5485c;
                if (obj instanceof RunnableC1701f) {
                    str = "setFuture=[" + m5574d(((RunnableC1701f) obj).f5504b) + "]";
                } else if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                append.append("PENDING, info=[").append(str).append("]");
            } else if (isDone()) {
                m5569a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    /* renamed from: b */
    static <T> T m5571b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    private String m5574d(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private C1699d m5563a(C1699d dVar) {
        C1699d dVar2;
        do {
            dVar2 = this.f5486d;
        } while (!f5482b.mo5493a((AbstractC1694a<?>) this, dVar2, C1699d.f5494a));
        while (dVar2 != null) {
            C1699d dVar3 = dVar2.f5497d;
            dVar2.f5497d = dVar;
            dVar = dVar2;
            dVar2 = dVar3;
        }
        return dVar;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: a */
    private static <V> V m5564a(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) v.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static V m5573c(Object obj) {
        if (obj instanceof C1696b) {
            throw m5565a("Task was cancelled.", ((C1696b) obj).f5491d);
        } else if (obj instanceof C1697c) {
            throw new ExecutionException(((C1697c) obj).f5493b);
        } else if (obj == f5484g) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: b */
    static Object m5570b(AbstractFutureC27655q<?> qVar) {
        if (qVar instanceof AbstractC1694a) {
            Object obj = ((AbstractC1694a) qVar).f5485c;
            if (!(obj instanceof C1696b)) {
                return obj;
            }
            C1696b bVar = (C1696b) obj;
            if (!bVar.f5490c) {
                return obj;
            }
            if (bVar.f5491d != null) {
                return new C1696b(false, bVar.f5491d);
            }
            return C1696b.f5489b;
        }
        boolean isCancelled = qVar.isCancelled();
        if ((!f5481a) && isCancelled) {
            return C1696b.f5489b;
        }
        try {
            Object a = m5564a((Future) qVar);
            if (a == null) {
                return f5484g;
            }
            return a;
        } catch (ExecutionException e) {
            return new C1697c(e.getCause());
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new C1697c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(qVar)), e2));
            }
            return new C1696b(false, e2);
        } catch (Throwable th) {
            return new C1697c(th);
        }
    }

    public final boolean cancel(boolean z) {
        boolean z2;
        C1696b bVar;
        boolean z3;
        Object obj = this.f5485c;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !(obj instanceof RunnableC1701f)) {
            return false;
        }
        if (f5481a) {
            bVar = new C1696b(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            bVar = C1696b.f5488a;
        } else {
            bVar = C1696b.f5489b;
        }
        boolean z4 = false;
        AbstractC1694a<V> aVar = this;
        while (true) {
            if (f5482b.mo5495a((AbstractC1694a<?>) aVar, obj, (Object) bVar)) {
                m5568a((AbstractC1694a<?>) aVar);
                if (!(obj instanceof RunnableC1701f)) {
                    return true;
                }
                AbstractFutureC27655q<? extends V> qVar = ((RunnableC1701f) obj).f5504b;
                if (qVar instanceof AbstractC1694a) {
                    aVar = (AbstractC1694a) qVar;
                    obj = aVar.f5485c;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof RunnableC1701f)) {
                        return true;
                    }
                    z4 = true;
                } else {
                    qVar.cancel(z);
                    return true;
                }
            } else {
                obj = aVar.f5485c;
                if (!(obj instanceof RunnableC1701f)) {
                    return z4;
                }
            }
        }
    }

    /* renamed from: a */
    private void m5567a(C1703h hVar) {
        hVar.f5506b = null;
        while (true) {
            C1703h hVar2 = this.f5487e;
            if (hVar2 != C1703h.f5505a) {
                C1703h hVar3 = null;
                while (hVar2 != null) {
                    C1703h hVar4 = hVar2.f5507c;
                    if (hVar2.f5506b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f5507c = hVar4;
                        if (hVar3.f5506b == null) {
                        }
                    } else if (f5482b.mo5494a((AbstractC1694a<?>) this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.a.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.a.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.impl.utils.a.a, androidx.work.impl.utils.a.a<V>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.work.impl.utils.a.a$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m5568a(androidx.work.impl.utils.p075a.AbstractC1694a<?> r4) {
        /*
            r3 = 0
        L_0x0001:
            r4.m5566a()
            androidx.work.impl.utils.a.a$d r1 = r4.m5563a(r3)
        L_0x0008:
            if (r1 == 0) goto L_0x0030
            androidx.work.impl.utils.a.a$d r3 = r1.f5497d
            java.lang.Runnable r2 = r1.f5495b
            boolean r0 = r2 instanceof androidx.work.impl.utils.p075a.AbstractC1694a.RunnableC1701f
            if (r0 == 0) goto L_0x002a
            androidx.work.impl.utils.a.a$f r2 = (androidx.work.impl.utils.p075a.AbstractC1694a.RunnableC1701f) r2
            androidx.work.impl.utils.a.a<V> r4 = r2.f5503a
            java.lang.Object r0 = r4.f5485c
            if (r0 != r2) goto L_0x0028
            com.google.c.h.a.q<? extends V> r0 = r2.f5504b
            java.lang.Object r1 = m5570b(r0)
            androidx.work.impl.utils.a.a$a r0 = androidx.work.impl.utils.p075a.AbstractC1694a.f5482b
            boolean r0 = r0.mo5495a(r4, r2, r1)
            if (r0 != 0) goto L_0x0001
        L_0x0028:
            r1 = r3
            goto L_0x0008
        L_0x002a:
            java.util.concurrent.Executor r0 = r1.f5496c
            m5572b(r2, r0)
            goto L_0x0028
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p075a.AbstractC1694a.m5568a(androidx.work.impl.utils.a.a):void");
    }

    /* renamed from: a */
    private void m5569a(StringBuilder sb) {
        try {
            sb.append("SUCCESS, result=[").append(m5574d(m5564a((Future) this))).append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[").append(e.getCause()).append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[").append(e2.getClass()).append(" thrown from get()]");
        }
    }

    /* renamed from: androidx.work.impl.utils.a.a$e */
    static final class C1700e extends AbstractC1695a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1703h, Thread> f5498a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1703h, C1703h> f5499b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC1694a, C1703h> f5500c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC1694a, C1699d> f5501d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC1694a, Object> f5502e;

        static {
            Covode.recordClassIndex(1867);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final void mo5491a(C1703h hVar, C1703h hVar2) {
            this.f5499b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final void mo5492a(C1703h hVar, Thread thread) {
            this.f5498a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5493a(AbstractC1694a<?> aVar, C1699d dVar, C1699d dVar2) {
            return this.f5501d.compareAndSet(aVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5494a(AbstractC1694a<?> aVar, C1703h hVar, C1703h hVar2) {
            return this.f5500c.compareAndSet(aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.p075a.AbstractC1694a.AbstractC1695a
        /* renamed from: a */
        public final boolean mo5495a(AbstractC1694a<?> aVar, Object obj, Object obj2) {
            return this.f5502e.compareAndSet(aVar, obj, obj2);
        }

        C1700e(AtomicReferenceFieldUpdater<C1703h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1703h, C1703h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC1694a, C1703h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC1694a, C1699d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC1694a, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.f5498a = atomicReferenceFieldUpdater;
            this.f5499b = atomicReferenceFieldUpdater2;
            this.f5500c = atomicReferenceFieldUpdater3;
            this.f5501d = atomicReferenceFieldUpdater4;
            this.f5502e = atomicReferenceFieldUpdater5;
        }
    }

    /* renamed from: a */
    private static CancellationException m5565a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    private static void m5572b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f5483f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f5485c;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!(obj instanceof RunnableC1701f))) {
                return (V) m5573c(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                C1703h hVar = this.f5487e;
                if (hVar != C1703h.f5505a) {
                    C1703h hVar2 = new C1703h((byte) 0);
                    do {
                        hVar2.mo5499a(hVar);
                        if (f5482b.mo5494a((AbstractC1694a<?>) this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5485c;
                                    if (obj2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 && (!(obj2 instanceof RunnableC1701f))) {
                                        return (V) m5573c(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    m5567a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5567a(hVar2);
                        } else {
                            hVar = this.f5487e;
                        }
                    } while (hVar != C1703h.f5505a);
                }
                return (V) m5573c(this.f5485c);
            }
            while (nanos > 0) {
                Object obj3 = this.f5485c;
                if (obj3 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && (!(obj3 instanceof RunnableC1701f))) {
                    return (V) m5573c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert == 0 || nanos2 > 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q
    /* renamed from: a */
    public final void mo5481a(Runnable runnable, Executor executor) {
        m5571b(runnable);
        m5571b(executor);
        C1699d dVar = this.f5486d;
        if (dVar != C1699d.f5494a) {
            C1699d dVar2 = new C1699d(runnable, executor);
            do {
                dVar2.f5497d = dVar;
                if (!f5482b.mo5493a((AbstractC1694a<?>) this, dVar, dVar2)) {
                    dVar = this.f5486d;
                } else {
                    return;
                }
            } while (dVar != C1699d.f5494a);
        }
        m5572b(runnable, executor);
    }
}
