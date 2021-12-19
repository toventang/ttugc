package com.bytedance.android.livesdk.p435ae;

import android.os.SystemClock;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p255l.AbstractC4374a;
import com.bytedance.android.livesdk.livesetting.NegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.performance.NegativeTestAudienceExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.livesdk.ae.a */
public final class C6633a implements AbstractC4374a {

    /* renamed from: b */
    public static final AbstractC89244h f16527b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C6635b.f16530a);

    /* renamed from: c */
    public static final C6634a f16528c = new C6634a((byte) 0);

    /* renamed from: a */
    public ExecutorService f16529a;

    /* renamed from: com.bytedance.android.livesdk.ae.a$a */
    public static final class C6634a {
        static {
            Covode.recordClassIndex(7372);
        }

        private C6634a() {
        }

        public /* synthetic */ C6634a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ae.a$b */
    static final class C6635b extends AbstractC89220m implements AbstractC89171a<C6633a> {

        /* renamed from: a */
        public static final C6635b f16530a = new C6635b();

        static {
            Covode.recordClassIndex(7373);
        }

        C6635b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6633a invoke() {
            return new C6633a();
        }
    }

    static {
        Covode.recordClassIndex(7371);
    }

    /* renamed from: com.bytedance.android.livesdk.ae.a$c */
    static final class RunnableC6636c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f16531a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f16532b;

        static {
            Covode.recordClassIndex(7374);
        }

        RunnableC6636c(boolean z, C89233z.C89237d dVar) {
            this.f16531a = z;
            this.f16532b = dVar;
        }

        public final void run() {
            long cyclePeriod;
            MethodCollector.m26663i(763);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            while (true) {
                Thread currentThread = Thread.currentThread();
                C89219l.m154716b(currentThread, "");
                if (currentThread.isInterrupted()) {
                    MethodCollector.m26664o(763);
                    return;
                }
                if (this.f16531a) {
                    cyclePeriod = NegativeTestExperiment.INSTANCE.getCyclePeriod();
                } else {
                    cyclePeriod = NegativeTestAudienceExperiment.INSTANCE.getCyclePeriod();
                }
                if (elapsedRealtime2 - elapsedRealtime < cyclePeriod - this.f16532b.element) {
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                } else {
                    try {
                        C3854a.m9453a(4, "negative_test", "sleep " + this.f16532b.element + "ms then set preTime and curTime");
                        Thread.sleep(this.f16532b.element);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        C3854a.m9453a(4, "negative_test", "sleep " + this.f16532b.element + "ms end");
                    } catch (InterruptedException unused) {
                        C3854a.m9453a(4, "negative_test", "interceptor!!---> exit dead loop");
                        MethodCollector.m26664o(763);
                        return;
                    } catch (Exception e) {
                        C3854a.m9453a(4, "negative_test", e.toString());
                        MethodCollector.m26664o(763);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p255l.AbstractC4374a
    /* renamed from: b */
    public final void mo10135b(boolean z) {
        if (z) {
            if (!NegativeTestExperiment.INSTANCE.isEnable(true)) {
                return;
            }
        } else if (!NegativeTestAudienceExperiment.INSTANCE.isEnable(false)) {
            return;
        }
        ExecutorService executorService = this.f16529a;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        this.f16529a = null;
    }

    @Override // com.bytedance.android.live.p255l.AbstractC4374a
    /* renamed from: a */
    public final void mo10134a(boolean z) {
        long cpuSleepTime;
        if (z) {
            if (!NegativeTestExperiment.INSTANCE.isEnable(true)) {
                return;
            }
        } else if (!NegativeTestAudienceExperiment.INSTANCE.isEnable(false)) {
            return;
        }
        C89233z.C89237d dVar = new C89233z.C89237d();
        if (z) {
            cpuSleepTime = NegativeTestExperiment.INSTANCE.getCpuSleepTime();
        } else {
            cpuSleepTime = NegativeTestAudienceExperiment.INSTANCE.getCpuSleepTime();
        }
        dVar.element = cpuSleepTime;
        ExecutorService a = C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a());
        this.f16529a = a;
        if (a != null) {
            a.submit(new RunnableC6636c(z, dVar));
        }
    }
}
