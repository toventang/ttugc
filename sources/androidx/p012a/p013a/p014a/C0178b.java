package androidx.p012a.p013a.p014a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.a.a.a.b */
public final class C0178b extends AbstractC0180c {

    /* renamed from: a */
    private final Object f471a = new Object();

    /* renamed from: b */
    private final ExecutorService f472b;

    /* renamed from: c */
    private volatile Handler f473c;

    static {
        Covode.recordClassIndex(202);
    }

    public C0178b() {
        ThreadFactoryC01791 r2 = new ThreadFactory() {
            /* class androidx.p012a.p013a.p014a.C0178b.ThreadFactoryC01791 */

            /* renamed from: b */
            private final AtomicInteger f475b = new AtomicInteger(0);

            static {
                Covode.recordClassIndex(203);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName(C1764a.m5928a("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f475b.getAndIncrement())}));
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 4;
        a.f95509g = r2;
        this.f472b = C40780g.m82242a(a.mo70028a());
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: b */
    public final boolean mo338b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: a */
    public final void mo336a(Runnable runnable) {
        this.f472b.execute(runnable);
    }

    @Override // androidx.p012a.p013a.p014a.AbstractC0180c
    /* renamed from: b */
    public final void mo337b(Runnable runnable) {
        if (this.f473c == null) {
            synchronized (this.f471a) {
                if (this.f473c == null) {
                    this.f473c = m585a(Looper.getMainLooper());
                }
            }
        }
        this.f473c.post(runnable);
    }

    /* renamed from: a */
    private static Handler m585a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        int i = Build.VERSION.SDK_INT;
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
