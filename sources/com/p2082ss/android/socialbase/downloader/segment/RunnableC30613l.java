package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.C30592b;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30533f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.socialbase.downloader.segment.l */
public final class RunnableC30613l implements Runnable {

    /* renamed from: A */
    private final C30472a f73112A;

    /* renamed from: B */
    private AbstractC30462i f73113B;

    /* renamed from: C */
    private C30592b f73114C;

    /* renamed from: D */
    private final List<C30607i> f73115D = new ArrayList();

    /* renamed from: E */
    private volatile boolean f73116E;

    /* renamed from: F */
    private volatile boolean f73117F;

    /* renamed from: G */
    private volatile boolean f73118G;

    /* renamed from: H */
    private Thread f73119H;

    /* renamed from: I */
    private int f73120I;

    /* renamed from: J */
    private long f73121J;

    /* renamed from: K */
    private boolean f73122K;

    /* renamed from: L */
    private C30533f f73123L;

    /* renamed from: a */
    final AbstractC30604f f73124a;

    /* renamed from: b */
    volatile C30607i f73125b;

    /* renamed from: c */
    C30616o f73126c;

    /* renamed from: d */
    public long f73127d;

    /* renamed from: e */
    volatile long f73128e;

    /* renamed from: f */
    volatile long f73129f;

    /* renamed from: g */
    public volatile long f73130g = -1;

    /* renamed from: h */
    volatile long f73131h;

    /* renamed from: i */
    public Future f73132i;

    /* renamed from: j */
    final int f73133j;

    /* renamed from: k */
    volatile boolean f73134k;

    /* renamed from: l */
    public int f73135l;

    /* renamed from: m */
    public int f73136m;

    /* renamed from: n */
    int f73137n;

    /* renamed from: o */
    public BaseException f73138o;

    /* renamed from: p */
    public boolean f73139p;

    /* renamed from: q */
    public boolean f73140q;

    /* renamed from: r */
    volatile long f73141r;

    /* renamed from: s */
    volatile long f73142s;

    /* renamed from: t */
    volatile long f73143t;

    /* renamed from: u */
    volatile long f73144u;

    /* renamed from: v */
    String f73145v;

    /* renamed from: w */
    String f73146w;

    /* renamed from: x */
    String f73147x;

    /* renamed from: y */
    private final AbstractC30601c f73148y;

    /* renamed from: z */
    private final DownloadInfo f73149z;

    static {
        Covode.recordClassIndex(37148);
    }

    /* renamed from: e */
    private void m62853e() {
        this.f73121J = this.f73141r;
        this.f73141r = -1;
        this.f73142s = -1;
        this.f73143t = -1;
        this.f73144u = -1;
        m62854f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54853a() {
        int backUpUrlRetryCount;
        if (this.f73126c.f73155d) {
            backUpUrlRetryCount = this.f73149z.getRetryCount();
        } else {
            backUpUrlRetryCount = this.f73149z.getBackUpUrlRetryCount();
        }
        this.f73135l = backUpUrlRetryCount;
        this.f73136m = 0;
    }

    /* renamed from: b */
    public final long mo54856b() {
        long c;
        MethodCollector.m26663i(8115);
        synchronized (this.f73124a) {
            try {
                c = this.f73131h + mo54857c();
            } finally {
                MethodCollector.m26664o(8115);
            }
        }
        return c;
    }

    /* renamed from: f */
    private void m62854f() {
        AbstractC30462i iVar = this.f73113B;
        if (iVar != null) {
            try {
                C30434a.m62028c("SegmentReader", "closeConnection: thread = " + this.f73133j);
                iVar.mo54238d();
                iVar.mo54235b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final long mo54857c() {
        MethodCollector.m26663i(8117);
        synchronized (this.f73124a) {
            try {
                long j = this.f73130g;
                long j2 = this.f73127d;
                if (j2 < 0 || j <= j2) {
                    MethodCollector.m26664o(8117);
                    return 0;
                }
                return j - j2;
            } finally {
                MethodCollector.m26664o(8117);
            }
        }
    }

    /* renamed from: d */
    public final void mo54858d() {
        MethodCollector.m26663i(8251);
        C30434a.m62028c("SegmentReader", "close: threadIndex = " + this.f73133j);
        synchronized (this) {
            try {
                this.f73116E = true;
                this.f73134k = true;
            } finally {
                MethodCollector.m26664o(8251);
            }
        }
        m62854f();
        Future future = this.f73132i;
        if (future != null) {
            this.f73132i = null;
            try {
                future.cancel(true);
                MethodCollector.m26664o(8251);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:36|37|38|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.f73126c.mo54870b(r5);
        r5.f73124a.mo54835c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        r5.f73119H = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.RunnableC30613l.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54854a(long j) {
        long j2 = this.f73130g;
        C30533f fVar = this.f73123L;
        if (j2 >= 0 && fVar != null) {
            fVar.mo54364a(j2, j);
        }
    }

    /* renamed from: a */
    public final void mo54855a(boolean z) {
        MethodCollector.m26663i(8396);
        C30434a.m62028c("SegmentReader", "reconnect: threadIndex = " + this.f73133j);
        synchronized (this) {
            try {
                this.f73118G = z;
                this.f73117F = true;
                this.f73134k = true;
            } finally {
                MethodCollector.m26664o(8396);
            }
        }
        m62854f();
        Thread thread = this.f73119H;
        if (thread != null) {
            try {
                thread.interrupt();
                MethodCollector.m26664o(8396);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0274, code lost:
        r11 = r28.f73124a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0276, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027d, code lost:
        if (r28.f73128e == 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027f, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62028c("SegmentReader", "loopAndRead:  change readEnd = " + r3 + ", segmentNewEndOffset = " + r28.f73128e + ", segment = " + r13);
        r3 = r28.f73128e;
        r28.f73128e = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b1, code lost:
        if (r3 > 0) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02b3, code lost:
        r3 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ba, code lost:
        if (r1 <= r3) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bc, code lost:
        r9 = r3 + 1;
        r18 = r1 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c2, code lost:
        if (r18 <= 0) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62030e("SegmentReader", "loopAndRead: redundant = ".concat(java.lang.String.valueOf(r18)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0304, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r28.f73130g = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0308, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0309, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x030b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030e, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030f, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0310, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7827);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0315, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03e8, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ea, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0597, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0598, code lost:
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x059b, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05a1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a2, code lost:
        r4 = 7827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05f5, code lost:
        if (r28.f73117F != false) goto L_0x05f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05f7, code lost:
        r28.f73117F = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05fe, code lost:
        if (r28.f73118G == false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0604, code lost:
        if ((r3 instanceof com.p2082ss.android.socialbase.downloader.exception.BaseException) != false) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0606, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0608, code lost:
        if (r3 == null) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x060a, code lost:
        com.p2082ss.android.socialbase.downloader.p2182e.C30434a.m62030e("SegmentReader", "handleDownloadFailed:  e = " + r3 + ", curRetryCount = " + r28.f73136m + ", retryCount = " + r28.f73135l);
        r28.f73138o = r3;
        r28.f73126c.mo54869b();
        r28.f73124a.mo54828a(r28, r3, r28.f73136m, r28.f73135l);
        r2 = r28.f73136m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x064a, code lost:
        if (r2 < r28.f73135l) goto L_0x064c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x064c, code lost:
        r28.f73136m = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62554a(r3, "download");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0657, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x066f, code lost:
        r2 = r28.f73126c.f73152a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0681, code lost:
        r28.f73124a.mo54830a(r28, r13, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0695, code lost:
        r28.f73122K = true;
        mo54853a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x06ad, code lost:
        m62853e();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7827);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06b6, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06b7, code lost:
        r28.f73118G = false;
        r3 = new com.p2082ss.android.socialbase.downloader.segment.SegmentApplyException(5, "download");
        r2 = 7827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7827);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06c7, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06c8, code lost:
        m62853e();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7827);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06d1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        r28.f73138o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06db, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7827);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06de, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06df, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06e1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06e2, code lost:
        r2 = 7827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        com.p2082ss.android.socialbase.downloader.p2189k.C30535g.m62554a(r4, "createConn");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0161, code lost:
        r3 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x054e A[SYNTHETIC, Splitter:B:284:0x054e] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05f2 A[Catch:{ all -> 0x06d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x06d6 A[ExcHandler: SegmentApplyException (r1v1 'e' com.ss.android.socialbase.downloader.segment.SegmentApplyException A[CUSTOM_DECLARE]), Splitter:B:29:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x05f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b A[ExcHandler: all (r4v49 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0011] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m62852a(com.p2082ss.android.socialbase.downloader.segment.C30607i r29) {
        /*
        // Method dump skipped, instructions count: 1771
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.RunnableC30613l.m62852a(com.ss.android.socialbase.downloader.segment.i):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo54852a(long j, long j2) {
        C30533f fVar = this.f73123L;
        if (fVar == null) {
            return -1;
        }
        return fVar.mo54365b(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 != -1) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.socialbase.downloader.segment.C30599a m62851a(com.p2082ss.android.socialbase.downloader.segment.AbstractC30601c r7, java.io.InputStream r8) {
        /*
            r6 = 7831(0x1e97, float:1.0974E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            com.ss.android.socialbase.downloader.segment.a r5 = r7.mo54823b()
            r4 = -1
            byte[] r0 = r5.f73032a     // Catch:{ all -> 0x002e }
            int r3 = r8.read(r0)     // Catch:{ all -> 0x002e }
            if (r3 == r4) goto L_0x001d
            r5.f73034c = r3     // Catch:{ all -> 0x002a }
            if (r3 != r4) goto L_0x0019
            r7.mo54822a(r5)
        L_0x0019:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        L_0x001d:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException
            r1 = 1073(0x431, float:1.504E-42)
            java.lang.String r0 = "probe"
            r2.<init>(r1, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r2
        L_0x002a:
            r1 = move-exception
            if (r3 != r4) goto L_0x0033
            goto L_0x0030
        L_0x002e:
            r1 = move-exception
            r0 = -1
        L_0x0030:
            r7.mo54822a(r5)
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.RunnableC30613l.m62851a(com.ss.android.socialbase.downloader.segment.c, java.io.InputStream):com.ss.android.socialbase.downloader.segment.a");
    }

    RunnableC30613l(DownloadInfo downloadInfo, C30609j jVar, AbstractC30601c cVar, C30616o oVar, int i) {
        this.f73149z = downloadInfo;
        this.f73124a = jVar;
        this.f73148y = cVar;
        this.f73112A = C30472a.m62087a(downloadInfo.getId(), (DownloadInfo) null);
        this.f73126c = oVar;
        this.f73133j = i;
    }
}
