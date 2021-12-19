package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.b */
public abstract class AbstractC1185b<T> {

    /* renamed from: a */
    final Executor f3971a;

    /* renamed from: b */
    public final LiveData<T> f3972b;

    /* renamed from: c */
    final AtomicBoolean f3973c = new AtomicBoolean(true);

    /* renamed from: d */
    final AtomicBoolean f3974d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f3975e = new Runnable() {
        /* class androidx.lifecycle.AbstractC1185b.RunnableC11872 */

        static {
            Covode.recordClassIndex(1294);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: androidx.lifecycle.LiveData<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x000c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
            L_0x0000:
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3974d
                r3 = 0
                r4 = 1
                boolean r0 = r0.compareAndSet(r3, r4)
                if (r0 == 0) goto L_0x003c
                r2 = 0
                r1 = 0
            L_0x000e:
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this     // Catch:{ all -> 0x003d }
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3973c     // Catch:{ all -> 0x003d }
                boolean r0 = r0.compareAndSet(r4, r3)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0020
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this     // Catch:{ all -> 0x003d }
                java.lang.Object r2 = r0.mo3733a()     // Catch:{ all -> 0x003d }
                r1 = 1
                goto L_0x000e
            L_0x0020:
                if (r1 == 0) goto L_0x0029
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this     // Catch:{ all -> 0x003d }
                androidx.lifecycle.LiveData<T> r0 = r0.f3972b     // Catch:{ all -> 0x003d }
                r0.postValue(r2)     // Catch:{ all -> 0x003d }
            L_0x0029:
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3974d
                r0.set(r3)
                if (r1 == 0) goto L_0x003c
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3973c
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0000
            L_0x003c:
                return
            L_0x003d:
                r1 = move-exception
                androidx.lifecycle.b r0 = androidx.lifecycle.AbstractC1185b.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f3974d
                r0.set(r3)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC1185b.RunnableC11872.run():void");
        }
    };

    /* renamed from: f */
    public final Runnable f3976f = new Runnable() {
        /* class androidx.lifecycle.AbstractC1185b.RunnableC11883 */

        static {
            Covode.recordClassIndex(1295);
        }

        public final void run() {
            boolean hasActiveObservers = AbstractC1185b.this.f3972b.hasActiveObservers();
            if (AbstractC1185b.this.f3973c.compareAndSet(false, true) && hasActiveObservers) {
                AbstractC1185b.this.f3971a.execute(AbstractC1185b.this.f3975e);
            }
        }
    };

    static {
        Covode.recordClassIndex(1292);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo3733a();

    public AbstractC1185b(Executor executor) {
        this.f3971a = executor;
        this.f3972b = new LiveData<T>() {
            /* class androidx.lifecycle.AbstractC1185b.C11861 */

            static {
                Covode.recordClassIndex(1293);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.lifecycle.LiveData
            public final void onActive() {
                AbstractC1185b.this.f3971a.execute(AbstractC1185b.this.f3975e);
            }
        };
    }
}
