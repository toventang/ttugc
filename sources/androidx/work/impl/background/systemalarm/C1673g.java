package androidx.work.impl.background.systemalarm;

import androidx.work.AbstractC1600g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemalarm.g */
public final class C1673g {

    /* renamed from: e */
    private static final String f5401e = AbstractC1600g.m5318a("WorkTimer");

    /* renamed from: a */
    public final ScheduledExecutorService f5402a;

    /* renamed from: b */
    final Map<String, RunnableC1676b> f5403b = new HashMap();

    /* renamed from: c */
    final Map<String, AbstractC1675a> f5404c = new HashMap();

    /* renamed from: d */
    final Object f5405d = new Object();

    /* renamed from: f */
    private final ThreadFactory f5406f;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    public interface AbstractC1675a {
        static {
            Covode.recordClassIndex(1839);
        }

        /* renamed from: a */
        void mo5451a(String str);
    }

    static {
        Covode.recordClassIndex(1837);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    public static class RunnableC1676b implements Runnable {

        /* renamed from: a */
        private final C1673g f5409a;

        /* renamed from: b */
        private final String f5410b;

        static {
            Covode.recordClassIndex(1840);
        }

        public final void run() {
            synchronized (this.f5409a.f5405d) {
                if (this.f5409a.f5403b.remove(this.f5410b) != null) {
                    AbstractC1675a remove = this.f5409a.f5404c.remove(this.f5410b);
                    if (remove != null) {
                        remove.mo5451a(this.f5410b);
                    }
                } else {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Timer with %s is already marked as complete.", new Object[]{this.f5410b});
                }
            }
        }

        RunnableC1676b(C1673g gVar, String str) {
            this.f5409a = gVar;
            this.f5410b = str;
        }
    }

    C1673g() {
        ThreadFactoryC16741 r2 = new ThreadFactory() {
            /* class androidx.work.impl.background.systemalarm.C1673g.ThreadFactoryC16741 */

            /* renamed from: b */
            private int f5408b;

            static {
                Covode.recordClassIndex(1838);
            }

            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f5408b);
                this.f5408b++;
                return newThread;
            }
        };
        this.f5406f = r2;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95509g = r2;
        this.f5402a = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5459a(String str) {
        synchronized (this.f5405d) {
            if (this.f5403b.remove(str) != null) {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Stopping timer for %s", new Object[]{str});
                this.f5404c.remove(str);
            }
        }
    }
}
