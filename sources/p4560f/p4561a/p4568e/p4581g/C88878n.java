package p4560f.p4561a.p4568e.p4581g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f.a.e.g.n */
public final class C88878n {

    /* renamed from: a */
    public static final boolean f201846a;

    /* renamed from: b */
    public static final int f201847b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f201848c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f201849d = new ConcurrentHashMap();

    /* renamed from: f.a.e.g.n$a */
    static final class C88879a {

        /* renamed from: a */
        boolean f201850a;

        /* renamed from: b */
        int f201851b;

        static {
            Covode.recordClassIndex(104921);
        }

        C88879a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.e.g.n$b */
    public static final class RunnableC88880b implements Runnable {
        static {
            Covode.recordClassIndex(104922);
        }

        RunnableC88880b() {
        }

        public final void run() {
            Iterator it = new ArrayList(C88878n.f201849d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C88878n.f201849d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m154072a() {
        if (f201846a) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f201848c;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService b = m154074b(new ThreadFactoryC88873j("RxSchedulerPurge"));
                    if (atomicReference.compareAndSet(scheduledExecutorService, b)) {
                        RunnableC88880b bVar = new RunnableC88880b();
                        int i = f201847b;
                        b.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    b.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(104920);
        Properties properties = System.getProperties();
        C88879a aVar = new C88879a();
        if (properties.containsKey("rx2.purge-enabled")) {
            aVar.f201850a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
        } else {
            aVar.f201850a = true;
        }
        if (aVar.f201850a && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                aVar.f201851b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
            }
            f201846a = aVar.f201850a;
            f201847b = aVar.f201851b;
            m154072a();
        }
        aVar.f201851b = 1;
        f201846a = aVar.f201850a;
        f201847b = aVar.f201851b;
        m154072a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m154071a(ThreadFactory threadFactory) {
        ScheduledExecutorService b = m154074b(threadFactory);
        m154073a(f201846a, b);
        return b;
    }

    /* renamed from: b */
    private static ScheduledExecutorService m154074b(ThreadFactory threadFactory) {
        return (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(1).mo70027a(threadFactory).mo70028a());
    }

    /* renamed from: a */
    private static void m154073a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f201849d.put(scheduledExecutorService, scheduledExecutorService);
        }
    }
}
