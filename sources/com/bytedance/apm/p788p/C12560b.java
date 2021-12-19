package com.bytedance.apm.p788p;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21450d;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import com.bytedance.monitor.p1546a.p1548b.C21448c;
import com.bytedance.monitor.p1546a.p1548b.EnumC21447b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.apm.p.b */
public final class C12560b {

    /* renamed from: c */
    public static long f30555c = 30000;

    /* renamed from: d */
    public static long f30556d = 30000;

    /* renamed from: a */
    public volatile ExecutorService f30557a;

    /* renamed from: b */
    public volatile boolean f30558b;

    /* renamed from: e */
    public AbstractC21450d f30559e;

    /* renamed from: f */
    public final AbstractRunnableC21452e f30560f;

    /* renamed from: g */
    public final AbstractRunnableC21452e f30561g;

    /* renamed from: h */
    public CopyOnWriteArraySet<AbstractC12565b> f30562h;

    /* renamed from: i */
    public CopyOnWriteArraySet<AbstractC12565b> f30563i;

    /* renamed from: com.bytedance.apm.p.b$b */
    public interface AbstractC12565b {
        static {
            Covode.recordClassIndex(14382);
        }

        /* renamed from: a */
        void mo20219a(long j);
    }

    /* renamed from: com.bytedance.apm.p.b$a */
    public static final class C12564a {

        /* renamed from: a */
        public static final C12560b f30567a = new C12560b((byte) 0);

        static {
            Covode.recordClassIndex(14381);
        }
    }

    static {
        Covode.recordClassIndex(14377);
    }

    private C12560b() {
        this.f30558b = true;
        this.f30560f = new AbstractRunnableC21452e() {
            /* class com.bytedance.apm.p788p.C12560b.C125611 */

            static {
                Covode.recordClassIndex(14378);
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: a */
            public final String mo20277a() {
                return "AsyncEventManager-mTimerRunnable";
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: b */
            public final EnumC21447b mo20278b() {
                return EnumC21447b.LIGHT_WEIGHT;
            }

            public final void run() {
                Iterator<AbstractC12565b> it = C12560b.this.f30562h.iterator();
                while (it.hasNext()) {
                    it.next().mo20219a(System.currentTimeMillis());
                }
                if (C12560b.this.f30558b) {
                    C12560b.this.mo20386a((AbstractRunnableC21452e) this, C12560b.f30555c);
                }
            }
        };
        this.f30561g = new AbstractRunnableC21452e() {
            /* class com.bytedance.apm.p788p.C12560b.C125622 */

            static {
                Covode.recordClassIndex(14379);
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: a */
            public final String mo20277a() {
                return "AsyncEventManager-mControlledTimerRunnable";
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: b */
            public final EnumC21447b mo20278b() {
                return EnumC21447b.LIGHT_WEIGHT;
            }

            public final void run() {
                Iterator<AbstractC12565b> it = C12560b.this.f30563i.iterator();
                while (it.hasNext()) {
                    it.next().mo20219a(System.currentTimeMillis());
                }
                if (C12560b.this.f30558b) {
                    C12560b.this.mo20386a((AbstractRunnableC21452e) this, C12560b.f30556d);
                }
            }
        };
        this.f30562h = new CopyOnWriteArraySet<>();
        this.f30563i = new CopyOnWriteArraySet<>();
        this.f30559e = C21435a.C21439a.f50832a;
    }

    /* renamed from: a */
    public final boolean mo20389a() {
        if (this.f30559e == null || Thread.currentThread().getId() != this.f30559e.mo35031a(EnumC21447b.LIGHT_WEIGHT)) {
            return false;
        }
        return true;
    }

    /* synthetic */ C12560b(byte b) {
        this();
    }

    /* renamed from: b */
    public final void mo20390b(AbstractC12565b bVar) {
        try {
            this.f30562h.remove(bVar);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static ExecutorService m22597a(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public final void mo20384a(AbstractC12565b bVar) {
        try {
            if (this.f30558b && !this.f30562h.contains(bVar)) {
                this.f30562h.add(bVar);
                mo20385a(this.f30560f);
                mo20386a(this.f30560f, f30555c);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo20391b(Runnable runnable) {
        if (this.f30557a == null) {
            synchronized (this) {
                if (this.f30557a == null) {
                    AbstractC21450d dVar = this.f30559e;
                    if (dVar != null) {
                        this.f30557a = dVar.mo35032a();
                    } else {
                        this.f30557a = m22597a(new ThreadFactory() {
                            /* class com.bytedance.apm.p788p.C12560b.ThreadFactoryC125633 */

                            static {
                                Covode.recordClassIndex(14380);
                            }

                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, "Apm_Normal");
                            }
                        });
                    }
                }
            }
        }
        this.f30557a.submit(runnable);
    }

    /* renamed from: a */
    public final void mo20385a(AbstractRunnableC21452e eVar) {
        AbstractC21450d dVar = this.f30559e;
        if (dVar != null && eVar != null) {
            dVar.mo35040b(eVar);
        }
    }

    /* renamed from: a */
    public final void mo20387a(Runnable runnable) {
        if (this.f30559e != null && runnable != null && this.f30558b) {
            this.f30559e.mo35034a(m22596a(runnable, UGCMonitor.TYPE_POST));
        }
    }

    /* renamed from: a */
    private static AbstractRunnableC21452e m22596a(Runnable runnable, String str) {
        return C21448c.m40280a("AsyncEventManager-".concat(String.valueOf(str)), runnable);
    }

    /* renamed from: a */
    public final void mo20386a(AbstractRunnableC21452e eVar, long j) {
        if (this.f30559e != null && eVar != null && this.f30558b) {
            this.f30559e.mo35035a(eVar, j);
        }
    }

    /* renamed from: a */
    public final void mo20388a(Runnable runnable, long j) {
        if (this.f30559e != null && this.f30558b) {
            this.f30559e.mo35035a(m22596a(runnable, "postDelayed"), j);
        }
    }
}
