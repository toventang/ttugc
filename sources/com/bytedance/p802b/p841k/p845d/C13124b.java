package com.bytedance.p802b.p841k.p845d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13134j;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.b.k.d.b */
public final class C13124b {

    /* renamed from: a */
    private static Map<EnumC13126c, C13124b> f31964a = new HashMap();

    /* renamed from: b */
    private ScheduledThreadPoolExecutor f31965b;

    /* renamed from: c */
    private ConcurrentHashMap<AbstractRunnableC13123a, ScheduledFuture> f31966c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private ConcurrentHashMap<AbstractRunnableC13123a, Runnable> f31967d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14960);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.k.d.b$a */
    public class RunnableC13125a implements Runnable {

        /* renamed from: b */
        private AbstractRunnableC13123a f31969b;

        static {
            Covode.recordClassIndex(14961);
        }

        public final void run() {
            C13134j.m23621a("APM-Task");
            try {
                this.f31969b.run();
            } catch (Throwable th) {
                C13118b.m23587a("APM-AsyncTask", "thread " + Thread.currentThread().getName() + " exception", th);
            }
            C13134j.m23620a();
        }

        private RunnableC13125a(AbstractRunnableC13123a aVar) {
            this.f31969b = aVar;
        }

        /* synthetic */ RunnableC13125a(C13124b bVar, AbstractRunnableC13123a aVar, byte b) {
            this(aVar);
        }
    }

    private C13124b(String str) {
        this.f31965b = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC13127d(str));
    }

    /* renamed from: a */
    public static synchronized C13124b m23597a(EnumC13126c cVar) {
        C13124b bVar;
        synchronized (C13124b.class) {
            if (cVar != null) {
                bVar = f31964a.get(cVar);
                if (bVar == null) {
                    bVar = new C13124b(cVar.name());
                    f31964a.put(cVar, bVar);
                }
            } else {
                throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo20944b(AbstractRunnableC13123a aVar) {
        try {
            this.f31965b.remove(this.f31967d.remove(aVar));
            ScheduledFuture remove = this.f31966c.remove(aVar);
            if (remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            C13118b.m23587a("APM-AsyncTask", "removeTask failed", th);
        }
    }

    /* renamed from: a */
    public final void mo20943a(AbstractRunnableC13123a aVar) {
        ScheduledFuture<?> schedule;
        if (aVar != null) {
            try {
                RunnableC13125a aVar2 = new RunnableC13125a(this, aVar, (byte) 0);
                if (aVar.f31962f) {
                    schedule = this.f31965b.scheduleWithFixedDelay(aVar2, aVar.f31961e, aVar.f31963g, TimeUnit.MILLISECONDS);
                } else {
                    schedule = this.f31965b.schedule(aVar2, aVar.f31961e, TimeUnit.MILLISECONDS);
                }
                this.f31967d.put(aVar, aVar2);
                this.f31966c.put(aVar, schedule);
            } catch (Throwable th) {
                C13118b.m23587a("APM-AsyncTask", "sendTask failed.", th);
            }
        }
    }
}
