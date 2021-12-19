package androidx.p053i;

import androidx.p053i.C1034h;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.i.d */
public abstract class AbstractC1012d<Key, Value> {

    /* renamed from: a */
    AtomicBoolean f3582a = new AtomicBoolean(false);

    /* renamed from: b */
    private CopyOnWriteArrayList<AbstractC1014b> f3583b = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.i.d$a */
    public static abstract class AbstractC1013a<Key, Value> {
        static {
            Covode.recordClassIndex(1106);
        }

        /* renamed from: a */
        public abstract AbstractC1012d<Key, Value> mo3720a();
    }

    /* renamed from: androidx.i.d$b */
    public interface AbstractC1014b {
        static {
            Covode.recordClassIndex(1107);
        }

        /* renamed from: a */
        void mo3721a();
    }

    static {
        Covode.recordClassIndex(1105);
    }

    /* renamed from: androidx.i.d$c */
    static class C1015c<T> {

        /* renamed from: a */
        final int f3584a;

        /* renamed from: b */
        public final C1034h.AbstractC1035a<T> f3585b;

        /* renamed from: c */
        private final AbstractC1012d f3586c;

        /* renamed from: d */
        private final Object f3587d = new Object();

        /* renamed from: e */
        private Executor f3588e = null;

        /* renamed from: f */
        private boolean f3589f = false;

        static {
            Covode.recordClassIndex(1108);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo3724a() {
            if (!this.f3586c.f3582a.get()) {
                return false;
            }
            mo3722a(C1034h.f3628b);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3723a(Executor executor) {
            synchronized (this.f3587d) {
                this.f3588e = executor;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3722a(final C1034h<T> hVar) {
            Executor executor;
            synchronized (this.f3587d) {
                if (!this.f3589f) {
                    this.f3589f = true;
                    executor = this.f3588e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new Runnable() {
                    /* class androidx.p053i.AbstractC1012d.C1015c.RunnableC10161 */

                    static {
                        Covode.recordClassIndex(1109);
                    }

                    public final void run() {
                        C1015c.this.f3585b.mo3714a(C1015c.this.f3584a, hVar);
                    }
                });
            } else {
                this.f3585b.mo3714a(this.f3584a, hVar);
            }
        }

        C1015c(AbstractC1012d dVar, int i, Executor executor, C1034h.AbstractC1035a<T> aVar) {
            this.f3586c = dVar;
            this.f3584a = i;
            this.f3588e = executor;
            this.f3585b = aVar;
        }
    }

    AbstractC1012d() {
    }

    /* renamed from: f_ */
    public final void mo3719f_() {
        if (this.f3582a.compareAndSet(false, true)) {
            Iterator<AbstractC1014b> it = this.f3583b.iterator();
            while (it.hasNext()) {
                it.next().mo3721a();
            }
        }
    }

    /* renamed from: a */
    public final void mo3717a(AbstractC1014b bVar) {
        this.f3583b.add(bVar);
    }

    /* renamed from: b */
    public final void mo3718b(AbstractC1014b bVar) {
        this.f3583b.remove(bVar);
    }
}
