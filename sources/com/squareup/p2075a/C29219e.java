package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.AbstractC29240r;
import com.squareup.p2075a.p2076a.p2078b.C29154a;
import com.squareup.p2075a.p2076a.p2078b.C29170h;
import com.squareup.p2075a.p2076a.p2080d.C29194d;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProxySelector;
import javax.net.SocketFactory;

/* renamed from: com.squareup.a.e */
public final class C29219e {

    /* renamed from: a */
    public final C29243t f69234a;

    /* renamed from: b */
    public volatile boolean f69235b;

    /* renamed from: c */
    C29246v f69236c;

    /* renamed from: d */
    C29170h f69237d;

    /* renamed from: e */
    private boolean f69238e;

    static {
        Covode.recordClassIndex(35568);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e3, code lost:
        if (r1.toString() == null) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0209, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020a, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0210, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0277, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027a, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x027d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027e, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0283, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0284, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0289, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028a, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0290, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0295, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0296, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x029b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x029c, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02a1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a2, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02a7, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02a8, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02b7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b8, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02bd, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02be, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x042f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0430, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0434, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0435, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0439, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x043c, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x043f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0442, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0445, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0447, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x044b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x044d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0451, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0453, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0455, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0456, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x045b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x045c, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0461, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0463, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0465, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0467, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x047a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0481, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0486, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0487, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x048c, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x048d, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04e9, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04ec, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x068d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0690, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0693, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0696, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0699, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x069c, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x069f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06a2, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07cd, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x07cf, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x07d1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x07d3, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x07d5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07df, code lost:
        r5 = r4.f69118c.f69131e;
        r4.mo50893a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07e7, code lost:
        if (r5 == 1) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0804, code lost:
        if (r1.f69065b.f69332w == false) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0807, code lost:
        r3 = new com.squareup.p2075a.p2076a.p2078b.C29170h(r1.f69065b, r1.f69072i, r1.f69071h, r1.f69078o, r1.f69079p, r1.mo50875b(), null, r1.f69067d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x081d, code lost:
        if (r3 != null) goto L_0x081f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        r0.f69237d = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0823, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x082d, code lost:
        r3.mo50893a(r4.getLastConnectException());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x084f, code lost:
        if ((r3 instanceof java.io.InterruptedIOException) != false) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0853, code lost:
        if ((r3 instanceof java.net.SocketTimeoutException) == false) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0858, code lost:
        if ((r3 instanceof javax.net.ssl.SSLHandshakeException) != false) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0860, code lost:
        if ((r3.getCause() instanceof java.security.cert.CertificateException) != false) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0865, code lost:
        if ((r3 instanceof javax.net.ssl.SSLPeerUnverifiedException) != false) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x088a, code lost:
        r0.f69237d = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x088e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x088f, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0893, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x08c0, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x08c5, code lost:
        throw r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08d4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0120, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a6, code lost:
        if (r2 > 0) goto L_0x01e8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0624 A[Catch:{ m -> 0x08c0, p -> 0x0690, IOException -> 0x068d }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0690 A[ExcHandler: p (e com.squareup.a.a.b.p), Splitter:B:333:0x0569] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0755  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0794  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x07df A[Catch:{ all -> 0x08c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0800 A[Catch:{ all -> 0x08c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x082d  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0838  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x088e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:43:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0893 A[ExcHandler: m (e com.squareup.a.a.b.m), Splitter:B:13:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x08c0 A[ExcHandler: m (e com.squareup.a.a.b.m), Splitter:B:9:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0848 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x06de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x07ff A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.p2075a.C29249x mo50955a(com.squareup.p2075a.C29246v r36, boolean r37) {
        /*
        // Method dump skipped, instructions count: 2292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.C29219e.mo50955a(com.squareup.a.v, boolean):com.squareup.a.x");
    }

    /* renamed from: a */
    public final C29249x mo50954a() {
        MethodCollector.m26663i(5046);
        synchronized (this) {
            try {
                if (!this.f69238e) {
                    this.f69238e = true;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Already Executed");
                    MethodCollector.m26664o(5046);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(5046);
                throw th;
            }
        }
        try {
            this.f69234a.f69313d.mo50971a(this);
            C29249x a = new C29220a(0, this.f69236c, false).mo50880a(this.f69236c);
            if (a != null) {
                return a;
            }
            IOException iOException = new IOException("Canceled");
            MethodCollector.m26664o(5046);
            throw iOException;
        } finally {
            this.f69234a.f69313d.mo50972b(this);
            MethodCollector.m26664o(5046);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.e$a */
    public class C29220a implements AbstractC29240r.AbstractC29241a {

        /* renamed from: b */
        private final int f69240b;

        /* renamed from: c */
        private final C29246v f69241c;

        /* renamed from: d */
        private final boolean f69242d;

        static {
            Covode.recordClassIndex(35569);
        }

        @Override // com.squareup.p2075a.AbstractC29240r.AbstractC29241a
        /* renamed from: a */
        public final C29249x mo50880a(C29246v vVar) {
            if (this.f69240b >= C29219e.this.f69234a.f69317h.size()) {
                return C29219e.this.mo50955a(vVar, this.f69242d);
            }
            new C29220a(this.f69240b + 1, vVar, this.f69242d);
            AbstractC29240r rVar = C29219e.this.f69234a.f69317h.get(this.f69240b);
            C29249x a = rVar.mo51004a();
            if (a != null) {
                return a;
            }
            throw new NullPointerException("application interceptor " + rVar + " returned null");
        }

        C29220a(int i, C29246v vVar, boolean z) {
            this.f69240b = i;
            this.f69241c = vVar;
            this.f69242d = z;
        }
    }

    protected C29219e(C29243t tVar, C29246v vVar) {
        C29243t tVar2 = new C29243t(tVar);
        if (tVar2.f69319j == null) {
            tVar2.f69319j = ProxySelector.getDefault();
        }
        if (tVar2.f69320k == null) {
            tVar2.f69320k = CookieHandler.getDefault();
        }
        if (tVar2.f69323n == null) {
            tVar2.f69323n = SocketFactory.getDefault();
        }
        if (tVar2.f69324o == null) {
            tVar2.f69324o = tVar.mo51010a();
        }
        if (tVar2.f69325p == null) {
            tVar2.f69325p = C29194d.f69151a;
        }
        if (tVar2.f69326q == null) {
            tVar2.f69326q = C29221f.f69243a;
        }
        if (tVar2.f69327r == null) {
            tVar2.f69327r = C29154a.f69005a;
        }
        if (tVar2.f69328s == null) {
            tVar2.f69328s = C29226j.f69250a;
        }
        if (tVar2.f69315f == null) {
            tVar2.f69315f = C29243t.f69310a;
        }
        if (tVar2.f69316g == null) {
            tVar2.f69316g = C29243t.f69311b;
        }
        if (tVar2.f69329t == null) {
            tVar2.f69329t = AbstractC29232n.f69276a;
        }
        this.f69234a = tVar2;
        this.f69236c = vVar;
    }
}
