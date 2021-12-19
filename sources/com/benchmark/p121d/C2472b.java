package com.benchmark.p121d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.benchmark.d.b */
public final class C2472b {

    /* renamed from: a */
    public static C2472b f7412a = new C2472b();

    /* renamed from: b */
    public AtomicBoolean f7413b = new AtomicBoolean(true);

    /* renamed from: c */
    public AtomicBoolean f7414c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Object f7415d = new Object();

    /* renamed from: e */
    public ScheduledExecutorService f7416e;

    /* renamed from: f */
    public volatile LinkedList<C2475c> f7417f;

    /* renamed from: g */
    public long f7418g;

    /* renamed from: h */
    private Runnable f7419h;

    static {
        Covode.recordClassIndex(2827);
    }

    private C2472b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = availableProcessors;
        this.f7416e = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        this.f7417f = new LinkedList<>();
        this.f7418g = 10;
        RunnableC24731 r1 = new Runnable() {
            /* class com.benchmark.p121d.C2472b.RunnableC24731 */

            static {
                Covode.recordClassIndex(2828);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|61|58|4|3) */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
                r0.printStackTrace();
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
            /* JADX WARNING: Removed duplicated region for block: B:3:0x000f A[LOOP:1: B:3:0x000f->B:58:0x000f, LOOP_START, SYNTHETIC, Splitter:B:3:0x000f] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 201
                */
                throw new UnsupportedOperationException("Method not decompiled: com.benchmark.p121d.C2472b.RunnableC24731.run():void");
            }
        };
        this.f7419h = r1;
        this.f7416e.execute(r1);
    }

    /* renamed from: a */
    public final List<C2475c> mo6853a() {
        MethodCollector.m26663i(6969);
        ArrayList arrayList = new ArrayList();
        synchronized (this.f7415d) {
            try {
                int size = this.f7417f.size();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < size; i++) {
                    C2475c cVar = this.f7417f.get(i);
                    Date date = cVar.f7423a;
                    date.getTime();
                    if (date.getTime() - currentTimeMillis < this.f7418g) {
                        arrayList.add(cVar);
                    }
                }
                this.f7417f.removeAll(arrayList);
            } catch (Throwable th) {
                MethodCollector.m26664o(6969);
                throw th;
            }
        }
        arrayList.size();
        MethodCollector.m26664o(6969);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6854a(C2475c cVar) {
        MethodCollector.m26663i(7119);
        synchronized (this.f7415d) {
            int i = 0;
            try {
                if (this.f7417f.isEmpty()) {
                    this.f7417f.add(cVar);
                } else {
                    Iterator<C2475c> it = this.f7417f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().f7423a.after(cVar.f7423a)) {
                            this.f7417f.add(i, cVar);
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i == this.f7417f.size()) {
                        this.f7417f.add(cVar);
                    }
                }
                this.f7415d.notifyAll();
                this.f7417f.size();
            } finally {
                MethodCollector.m26664o(7119);
            }
        }
    }
}
