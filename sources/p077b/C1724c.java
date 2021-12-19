package p077b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b.c */
final class C1724c {

    /* renamed from: a */
    static final C1724c f5546a = new C1724c();

    /* renamed from: b */
    final Executor f5547b;

    /* renamed from: c */
    private final ExecutorService f5548c;

    /* renamed from: d */
    private final ScheduledExecutorService f5549d;

    /* renamed from: b.c$a */
    static class ExecutorC1725a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f5550a;

        static {
            Covode.recordClassIndex(1894);
        }

        private ExecutorC1725a() {
            this.f5550a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m5624a() {
            Integer num = this.f5550a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f5550a.remove();
            } else {
                this.f5550a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* synthetic */ ExecutorC1725a(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            Integer num = this.f5550a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f5550a.set(Integer.valueOf(intValue));
            if (intValue <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m5624a();
                    throw th;
                }
            } else {
                C40780g.m82245b().execute(runnable);
            }
            m5624a();
        }
    }

    static {
        Covode.recordClassIndex(1893);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1724c() {
        /*
            r11 = this;
            r11.<init>()
            r3 = 2480(0x9b0, float:3.475E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r0 = 0
        L_0x0012:
            r1 = 1
            if (r0 != 0) goto L_0x003a
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()
        L_0x0019:
            r11.f5548c = r4
            com.ss.android.ugc.aweme.cv.o r0 = com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o.SCHEDULED
            com.ss.android.ugc.aweme.cv.l$a r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40787l.m82269a(r0)
            r0.f95505c = r1
            com.ss.android.ugc.aweme.cv.l r0 = r0.mo70028a()
            java.util.concurrent.ExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82242a(r0)
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r11.f5549d = r0
            b.c$a r0 = new b.c$a
            r0.<init>(r2)
            r11.f5547b = r0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x003a:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            int r5 = p077b.C1722b.f5542c
            int r6 = p077b.C1722b.f5543d
            r7 = 1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r4.<init>(r5, r6, r7, r9, r10)
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 9
            r4.allowCoreThreadTimeOut(r1)
            goto L_0x0019
        L_0x0054:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "android"
            boolean r0 = r1.contains(r0)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: p077b.C1724c.<init>():void");
    }
}
