package androidx.work.impl.utils.p076b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.work.impl.utils.b.b */
public final class C1708b implements AbstractC1707a {

    /* renamed from: a */
    final Handler f5511a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    volatile Thread f5512b;

    /* renamed from: c */
    private final Executor f5513c = new Executor() {
        /* class androidx.work.impl.utils.p076b.C1708b.ExecutorC17091 */

        static {
            Covode.recordClassIndex(1876);
        }

        public final void execute(Runnable runnable) {
            C1708b.this.f5511a.post(runnable);
        }
    };

    /* renamed from: d */
    private final ThreadFactory f5514d;

    /* renamed from: e */
    private final ExecutorService f5515e;

    static {
        Covode.recordClassIndex(1875);
    }

    @Override // androidx.work.impl.utils.p076b.AbstractC1707a
    /* renamed from: a */
    public final Executor mo5502a() {
        return this.f5513c;
    }

    @Override // androidx.work.impl.utils.p076b.AbstractC1707a
    /* renamed from: b */
    public final Thread mo5504b() {
        return this.f5512b;
    }

    @Override // androidx.work.impl.utils.p076b.AbstractC1707a
    /* renamed from: c */
    public final Executor mo5505c() {
        return this.f5515e;
    }

    public C1708b() {
        ThreadFactoryC17102 r2 = new ThreadFactory() {
            /* class androidx.work.impl.utils.p076b.C1708b.ThreadFactoryC17102 */

            /* renamed from: b */
            private int f5518b;

            static {
                Covode.recordClassIndex(1877);
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkManagerTaskExecutor-thread-" + this.f5518b);
                this.f5518b++;
                C1708b.this.f5512b = newThread;
                return newThread;
            }
        };
        this.f5514d = r2;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f5515e = C40780g.m82242a(a.mo70028a());
    }

    @Override // androidx.work.impl.utils.p076b.AbstractC1707a
    /* renamed from: a */
    public final void mo5503a(Runnable runnable) {
        this.f5515e.execute(runnable);
    }
}
