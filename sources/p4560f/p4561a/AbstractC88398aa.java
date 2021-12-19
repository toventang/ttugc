package p4560f.p4561a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.C88445f;
import p4560f.p4561a.p4568e.p4569a.EnumC88442c;
import p4560f.p4561a.p4568e.p4581g.C88871h;
import p4560f.p4561a.p4568e.p4584j.C88906h;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.aa */
public abstract class AbstractC88398aa {

    /* renamed from: b */
    static final long f200670b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: a */
    public abstract AbstractC88401c mo20704a();

    /* renamed from: b */
    public void mo142902b() {
    }

    /* renamed from: f.a.aa$b */
    static final class RunnableC88400b implements AbstractC88412b, Runnable {

        /* renamed from: a */
        final Runnable f200674a;

        /* renamed from: b */
        final AbstractC88401c f200675b;

        /* renamed from: c */
        volatile boolean f200676c;

        static {
            Covode.recordClassIndex(104442);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200676c;
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            this.f200676c = true;
            this.f200675b.dispose();
        }

        public final void run() {
            if (!this.f200676c) {
                try {
                    this.f200674a.run();
                } catch (Throwable th) {
                    C88422b.m153670a(th);
                    this.f200675b.dispose();
                    throw C88906h.m154104a(th);
                }
            }
        }

        RunnableC88400b(Runnable runnable, AbstractC88401c cVar) {
            this.f200674a = runnable;
            this.f200675b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.aa$a */
    public static final class RunnableC88399a implements AbstractC88412b, Runnable {

        /* renamed from: a */
        final Runnable f200671a;

        /* renamed from: b */
        final AbstractC88401c f200672b;

        /* renamed from: c */
        Thread f200673c;

        static {
            Covode.recordClassIndex(104441);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return this.f200672b.isDisposed();
        }

        public final void run() {
            this.f200673c = Thread.currentThread();
            try {
                this.f200671a.run();
            } finally {
                dispose();
                this.f200673c = null;
            }
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            if (this.f200673c == Thread.currentThread()) {
                AbstractC88401c cVar = this.f200672b;
                if (cVar instanceof C88871h) {
                    C88871h hVar = (C88871h) cVar;
                    if (!hVar.f201837c) {
                        hVar.f201837c = true;
                        hVar.f201836b.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f200672b.dispose();
        }

        RunnableC88399a(Runnable runnable, AbstractC88401c cVar) {
            this.f200671a = runnable;
            this.f200672b = cVar;
        }
    }

    static {
        Covode.recordClassIndex(104440);
    }

    /* renamed from: f.a.aa$c */
    public static abstract class AbstractC88401c implements AbstractC88412b {
        static {
            Covode.recordClassIndex(104443);
        }

        /* renamed from: a */
        public abstract AbstractC88412b mo20706a(Runnable runnable, long j, TimeUnit timeUnit);

        /* access modifiers changed from: package-private */
        /* renamed from: f.a.aa$c$a */
        public final class RunnableC88402a implements Runnable {

            /* renamed from: a */
            final Runnable f200677a;

            /* renamed from: b */
            final C88445f f200678b;

            /* renamed from: c */
            final long f200679c;

            /* renamed from: d */
            long f200680d;

            /* renamed from: e */
            long f200681e;

            /* renamed from: f */
            long f200682f;

            static {
                Covode.recordClassIndex(104444);
            }

            public final void run() {
                long j;
                this.f200677a.run();
                if (!this.f200678b.isDisposed()) {
                    long a = AbstractC88401c.m153592a(TimeUnit.NANOSECONDS);
                    long j2 = this.f200681e;
                    if (AbstractC88398aa.f200670b + a < j2 || a >= j2 + this.f200679c + AbstractC88398aa.f200670b) {
                        long j3 = this.f200679c;
                        j = a + j3;
                        long j4 = this.f200680d + 1;
                        this.f200680d = j4;
                        this.f200682f = j - (j3 * j4);
                    } else {
                        long j5 = this.f200682f;
                        long j6 = this.f200680d + 1;
                        this.f200680d = j6;
                        j = j5 + (j6 * this.f200679c);
                    }
                    this.f200681e = a;
                    this.f200678b.replace(AbstractC88401c.this.mo20706a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }

            RunnableC88402a(long j, Runnable runnable, long j2, C88445f fVar, long j3) {
                this.f200677a = runnable;
                this.f200678b = fVar;
                this.f200679c = j3;
                this.f200681e = j2;
                this.f200682f = j;
            }
        }

        /* renamed from: a */
        public static long m153592a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: a */
        public AbstractC88412b mo101910a(Runnable runnable) {
            return mo20706a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public final AbstractC88412b mo142905a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            C88445f fVar = new C88445f();
            C88445f fVar2 = new C88445f(fVar);
            Runnable a = C88925a.m154175a(runnable);
            long nanos = timeUnit.toNanos(j2);
            long a2 = m153592a(TimeUnit.NANOSECONDS);
            AbstractC88412b a3 = mo20706a(new RunnableC88402a(a2 + timeUnit.toNanos(j), a, a2, fVar2, nanos), j, timeUnit);
            if (a3 == EnumC88442c.INSTANCE) {
                return a3;
            }
            fVar.replace(a3);
            return fVar2;
        }
    }

    /* renamed from: a */
    public AbstractC88412b mo142900a(Runnable runnable) {
        return mo20705a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public AbstractC88412b mo20705a(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC88401c a = mo20704a();
        RunnableC88399a aVar = new RunnableC88399a(C88925a.m154175a(runnable), a);
        a.mo20706a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public AbstractC88412b mo142901a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AbstractC88401c a = mo20704a();
        RunnableC88400b bVar = new RunnableC88400b(C88925a.m154175a(runnable), a);
        AbstractC88412b a2 = a.mo142905a(bVar, j, j2, timeUnit);
        if (a2 == EnumC88442c.INSTANCE) {
            return a2;
        }
        return bVar;
    }
}
