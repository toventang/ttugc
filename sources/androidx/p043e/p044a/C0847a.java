package androidx.p043e.p044a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.e.a.a */
public final class C0847a {

    /* renamed from: a */
    public static final ThreadLocal<C0847a> f3122a = new ThreadLocal<>();

    /* renamed from: b */
    final C0497g<AbstractC0849b, Long> f3123b = new C0497g<>();

    /* renamed from: c */
    final ArrayList<AbstractC0849b> f3124c = new ArrayList<>();

    /* renamed from: d */
    public AbstractC0850c f3125d;

    /* renamed from: e */
    long f3126e = 0;

    /* renamed from: f */
    boolean f3127f = false;

    /* renamed from: g */
    private final C0848a f3128g = new C0848a();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$b */
    public interface AbstractC0849b {
        static {
            Covode.recordClassIndex(935);
        }

        /* renamed from: a */
        boolean mo3141a(long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$e */
    public static class C0853e extends AbstractC0850c {

        /* renamed from: b */
        private final Choreographer f3135b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f3136c = new Choreographer.FrameCallback() {
            /* class androidx.p043e.p044a.C0847a.C0853e.Choreographer$FrameCallbackC08541 */

            static {
                Covode.recordClassIndex(940);
            }

            public final void doFrame(long j) {
                C0853e.this.f3130a.mo3140a();
            }
        };

        static {
            Covode.recordClassIndex(939);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p043e.p044a.C0847a.AbstractC0850c
        /* renamed from: a */
        public final void mo3142a() {
            this.f3135b.postFrameCallback(this.f3136c);
        }

        C0853e(C0848a aVar) {
            super(aVar);
        }
    }

    static {
        Covode.recordClassIndex(933);
    }

    /* renamed from: androidx.e.a.a$d */
    static class C0851d extends AbstractC0850c {

        /* renamed from: b */
        long f3131b = -1;

        /* renamed from: c */
        private final Runnable f3132c = new Runnable() {
            /* class androidx.p043e.p044a.C0847a.C0851d.RunnableC08521 */

            static {
                Covode.recordClassIndex(938);
            }

            public final void run() {
                C0851d.this.f3131b = SystemClock.uptimeMillis();
                C0851d.this.f3130a.mo3140a();
            }
        };

        /* renamed from: d */
        private final Handler f3133d = new Handler(Looper.myLooper());

        static {
            Covode.recordClassIndex(937);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.p043e.p044a.C0847a.AbstractC0850c
        /* renamed from: a */
        public final void mo3142a() {
            this.f3133d.postDelayed(this.f3132c, Math.max(10 - (SystemClock.uptimeMillis() - this.f3131b), 0L));
        }

        C0851d(C0848a aVar) {
            super(aVar);
        }
    }

    C0847a() {
    }

    /* renamed from: a */
    public static C0847a m2992a() {
        ThreadLocal<C0847a> threadLocal = f3122a;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0847a());
        }
        return threadLocal.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0850c mo3139b() {
        if (this.f3125d == null) {
            int i = Build.VERSION.SDK_INT;
            this.f3125d = new C0853e(this.f3128g);
        }
        return this.f3125d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$a */
    public class C0848a {
        static {
            Covode.recordClassIndex(934);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3140a() {
            C0847a.this.f3126e = SystemClock.uptimeMillis();
            C0847a aVar = C0847a.this;
            long j = aVar.f3126e;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < aVar.f3124c.size(); i++) {
                AbstractC0849b bVar = aVar.f3124c.get(i);
                if (bVar != null) {
                    Long l = aVar.f3123b.get(bVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            aVar.f3123b.remove(bVar);
                        }
                    }
                    bVar.mo3141a(j);
                }
            }
            if (aVar.f3127f) {
                for (int size = aVar.f3124c.size() - 1; size >= 0; size--) {
                    if (aVar.f3124c.get(size) == null) {
                        aVar.f3124c.remove(size);
                    }
                }
                aVar.f3127f = false;
            }
            if (C0847a.this.f3124c.size() > 0) {
                C0847a.this.mo3139b().mo3142a();
            }
        }

        C0848a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.e.a.a$c */
    public static abstract class AbstractC0850c {

        /* renamed from: a */
        final C0848a f3130a;

        static {
            Covode.recordClassIndex(936);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3142a();

        AbstractC0850c(C0848a aVar) {
            this.f3130a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo3138a(AbstractC0849b bVar) {
        this.f3123b.remove(bVar);
        int indexOf = this.f3124c.indexOf(bVar);
        if (indexOf >= 0) {
            this.f3124c.set(indexOf, null);
            this.f3127f = true;
        }
    }
}
