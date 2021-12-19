package com.bytedance.framwork.core.p1005c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p1005c.AbstractC14801a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.framwork.core.c.f */
public final class C14811f extends Thread {

    /* renamed from: a */
    final Object f36095a = new Object();

    /* renamed from: b */
    private final Context f36096b;

    /* renamed from: c */
    private final AtomicBoolean f36097c;

    /* renamed from: d */
    private final C14810e f36098d;

    /* renamed from: e */
    private long f36099e = -1;

    /* renamed from: f */
    private long f36100f = 0;

    /* renamed from: g */
    private long f36101g = 120000;

    /* renamed from: h */
    private C14809d f36102h;

    /* renamed from: i */
    private final LinkedList<C14805b> f36103i;

    /* renamed from: j */
    private int f36104j;

    static {
        Covode.recordClassIndex(16911);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r7.f36098d.mo23838a(r3.f36083f, r3.f36079b) < Long.MAX_VALUE) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r7.f36098d.mo23842b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r7.f36098d.mo23842b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27197a() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p1005c.C14811f.m27197a():boolean");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r6 = 13858(0x3622, float:1.9419E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f36097c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            boolean r1 = r7.m27197a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f36097c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            boolean r0 = r7.m27199b()
            if (r0 != 0) goto L_0x0021
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            r1 = 1
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f36097c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x004c
            if (r1 != 0) goto L_0x0005
            java.lang.Object r5 = r7.f36095a
            monitor-enter(r5)
            long r3 = r7.f36101g     // Catch:{ InterruptedException -> 0x0042 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r7.f36095a     // Catch:{ InterruptedException -> 0x0042 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0042 }
            goto L_0x0042
        L_0x003d:
            java.lang.Object r0 = r7.f36095a     // Catch:{ InterruptedException -> 0x0042 }
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x0042 }
        L_0x0042:
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0005
        L_0x0044:
            r1 = 0
            goto L_0x0022
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p1005c.C14811f.run():void");
    }

    /* renamed from: b */
    private boolean m27199b() {
        boolean z;
        String str;
        AbstractC14801a.AbstractC14803b bVar;
        boolean z2 = false;
        if (this.f36097c.get()) {
            return false;
        }
        AbstractC14801a.AbstractC14803b bVar2 = null;
        if (this.f36099e < 0 && System.currentTimeMillis() - this.f36100f > 600000) {
            this.f36099e = 0;
            if (!this.f36097c.get()) {
                Map<String, AbstractC14801a> map = this.f36102h.f36087a;
                if (map != null && !map.isEmpty()) {
                    for (String str2 : map.keySet()) {
                        if (this.f36097c.get()) {
                            break;
                        }
                        AbstractC14801a aVar = map.get(str2);
                        if (!(aVar == null || (bVar = aVar.f36073d) == null)) {
                            this.f36098d.mo23840a(str2, bVar.mo23808c(), 604800000);
                        }
                    }
                }
                this.f36098d.mo23840a(null, -1, 864000000);
            }
            this.f36100f = System.currentTimeMillis();
        }
        if (!C14806c.f36084a.mo23834a(this.f36096b)) {
            this.f36101g = 120000;
            return false;
        }
        C14805b a = this.f36098d.mo23839a(this.f36099e);
        if (a != null) {
            if (this.f36099e < a.f36078a) {
                this.f36099e = a.f36078a;
            } else {
                this.f36099e++;
            }
            if (a.f36079b == null || a.f36079b.length <= 0) {
                z2 = true;
                z = false;
            } else {
                AbstractC14801a a2 = this.f36102h.mo23835a(a.f36083f);
                if (a2 == null) {
                    return true;
                }
                bVar2 = a2.f36073d;
                AbstractC14801a.AbstractC14804c cVar = a2.f36076g;
                long currentTimeMillis = System.currentTimeMillis();
                long d = bVar2.mo23809d();
                if (cVar != null) {
                    if (cVar.mo23811a()) {
                        z = true;
                    } else {
                        long b = cVar.mo23812b();
                        if (b > 0 && currentTimeMillis - a2.f36077h < b) {
                            return true;
                        }
                        a2.f36077h = System.currentTimeMillis();
                    }
                }
                if (d > 0 && a.f36081d > 0 && currentTimeMillis - a.f36082e < d * ((long) a.f36081d)) {
                    return true;
                }
                String str3 = a2.f36075f;
                List<String> b2 = bVar2.mo23807b();
                if (b2 == null) {
                    return true;
                }
                try {
                    String e = bVar2.mo23810e();
                    if (!TextUtils.isEmpty(e)) {
                        z = m27198a(a2, e, a.f36079b);
                    } else if (!TextUtils.isEmpty(str3)) {
                        z = m27198a(a2, str3, a.f36079b);
                        if (!z) {
                            try {
                                a2.f36075f = "";
                            } catch (Throwable unused) {
                            }
                        }
                    } else {
                        if (cVar.mo23813c()) {
                            this.f36104j++;
                        }
                        int size = b2.size();
                        int i = this.f36104j;
                        if (size <= i || i < 0) {
                            this.f36104j = 0;
                            str = b2.get(0);
                        } else {
                            str = b2.get(i);
                        }
                        z = m27198a(a2, str, a.f36079b);
                        if (z) {
                            a2.f36075f = str;
                        }
                    }
                } catch (Throwable unused2) {
                    z = false;
                }
            }
            if (this.f36097c.get()) {
                return true;
            }
            if (z2) {
                this.f36098d.mo23841a(a.f36078a, true, 0, 0);
            } else if (this.f36098d.mo23841a(a.f36078a, z, 604800000, bVar2.mo23808c())) {
                long d2 = bVar2.mo23809d() * ((long) (a.f36081d + 1));
                if (d2 > 0) {
                    this.f36101g = d2;
                }
                this.f36101g = Math.min(120000L, this.f36101g);
            } else {
                this.f36101g = 120000;
            }
            return true;
        } else if (this.f36099e == 0 && this.f36098d.mo23837a() == 0) {
            this.f36101g = 0;
            return false;
        } else {
            if (this.f36099e == -1) {
                this.f36101g = 120000;
            }
            this.f36099e = -1;
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m27198a(AbstractC14801a aVar, String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || aVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return aVar.mo23814a(str, bArr);
    }

    C14811f(Context context, C14809d dVar, LinkedList<C14805b> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f36102h = dVar;
        this.f36096b = context;
        this.f36103i = linkedList;
        this.f36097c = atomicBoolean;
        this.f36098d = C14810e.m27188a(context);
    }
}
