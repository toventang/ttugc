package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.bd */
public final class C86372bd {

    /* renamed from: a */
    static final C86372bd f193500a = new C86372bd();

    /* renamed from: b */
    private HashMap<Long, C86313ai> f193501b = new HashMap<>();

    /* renamed from: c */
    private long f193502c;

    /* renamed from: d */
    private long f193503d;

    /* renamed from: com.ss.ttvideoengine.bd$a */
    public static class RunnableC86373a implements Runnable {

        /* renamed from: a */
        long f193504a;

        static {
            Covode.recordClassIndex(101601);
        }

        public final void run() {
            C86372bd bdVar = C86372bd.f193500a;
            if (bdVar != null) {
                bdVar.mo137338b(this.f193504a);
            }
        }

        public RunnableC86373a(long j) {
            this.f193504a = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.bd$c */
    public static class RunnableC86375c implements Runnable {

        /* renamed from: a */
        long f193507a;

        static {
            Covode.recordClassIndex(101603);
        }

        public final void run() {
            C86372bd bdVar = C86372bd.f193500a;
            if (bdVar != null) {
                bdVar.mo137335a(this.f193507a);
            }
        }

        public RunnableC86375c(long j) {
            this.f193507a = j;
        }
    }

    static {
        Covode.recordClassIndex(101600);
    }

    private C86372bd() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.bd$b */
    public static class RunnableC86374b implements Runnable {

        /* renamed from: a */
        long f193505a;

        /* renamed from: b */
        private final WeakReference<C86313ai> f193506b;

        static {
            Covode.recordClassIndex(101602);
        }

        public final void run() {
            C86372bd bdVar;
            C86313ai aiVar = this.f193506b.get();
            if (aiVar != null && (bdVar = C86372bd.f193500a) != null) {
                bdVar.mo137336a(this.f193505a, aiVar);
            }
        }

        public RunnableC86374b(C86313ai aiVar, long j) {
            this.f193506b = new WeakReference<>(aiVar);
            this.f193505a = j;
        }
    }

    /* renamed from: b */
    public final synchronized long mo137337b() {
        long j;
        MethodCollector.m26663i(2959);
        j = this.f193503d;
        this.f193503d = 0;
        MethodCollector.m26664o(2959);
        return j;
    }

    /* renamed from: a */
    public final synchronized long mo137334a() {
        long j;
        MethodCollector.m26663i(2956);
        j = this.f193502c;
        this.f193502c = 0;
        try {
            for (C86313ai aiVar : this.f193501b.values()) {
                long m = aiVar.mo137257m(81);
                if (m > 0) {
                    j += m;
                }
            }
            C86641i.m150113b("VideoInfoCollecor", "get play waste data size: ".concat(String.valueOf(j)));
            MethodCollector.m26664o(2956);
        } catch (Exception unused) {
            MethodCollector.m26664o(2956);
            return j;
        }
        return j;
    }

    /* renamed from: b */
    public final synchronized void mo137338b(long j) {
        MethodCollector.m26663i(2960);
        if (j > 0) {
            this.f193503d += j;
        }
        MethodCollector.m26664o(2960);
    }

    /* renamed from: a */
    public final synchronized void mo137335a(long j) {
        MethodCollector.m26663i(2278);
        try {
            if (this.f193501b.containsKey(Long.valueOf(j))) {
                long m = this.f193501b.get(Long.valueOf(j)).mo137257m(81);
                if (m > 0) {
                    this.f193502c += m;
                }
                this.f193501b.remove(Long.valueOf(j));
                C86641i.m150113b("VideoInfoCollecor", "delete engine: " + j + ", waste data: " + m);
            }
            MethodCollector.m26664o(2278);
        } catch (Exception unused) {
            MethodCollector.m26664o(2278);
        }
    }

    /* renamed from: a */
    public final synchronized void mo137336a(long j, C86313ai aiVar) {
        MethodCollector.m26663i(2269);
        if (this.f193501b.containsKey(Long.valueOf(j))) {
            MethodCollector.m26664o(2269);
            return;
        }
        this.f193501b.put(Long.valueOf(j), aiVar);
        C86641i.m150113b("VideoInfoCollecor", "new engine: ".concat(String.valueOf(j)));
        MethodCollector.m26664o(2269);
    }
}
