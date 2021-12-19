package com.p2082ss.android.socialbase.downloader.p2189k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.socialbase.downloader.k.f */
public final class C30533f {

    /* renamed from: a */
    private C30534a f72831a;

    /* renamed from: b */
    private C30534a f72832b;

    /* renamed from: c */
    private int f72833c;

    /* renamed from: d */
    private int f72834d = 10;

    static {
        Covode.recordClassIndex(37061);
    }

    /* renamed from: com.ss.android.socialbase.downloader.k.f$a */
    static class C30534a {

        /* renamed from: a */
        long f72835a;

        /* renamed from: b */
        long f72836b;

        /* renamed from: c */
        C30534a f72837c;

        /* renamed from: d */
        C30534a f72838d;

        static {
            Covode.recordClassIndex(37062);
        }

        private C30534a() {
        }

        /* synthetic */ C30534a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo54364a(long j, long j2) {
        C30534a aVar;
        MethodCollector.m26663i(7512);
        synchronized (this) {
            try {
                C30534a aVar2 = this.f72831a;
                if (aVar2 != null) {
                    if (j < aVar2.f72835a || j2 < aVar2.f72836b) {
                        return false;
                    }
                    C30534a aVar3 = aVar2.f72837c;
                    if (aVar3 != null && j2 - aVar3.f72836b < 1000) {
                        aVar2.f72835a = j;
                        aVar2.f72836b = j2;
                        MethodCollector.m26664o(7512);
                        return true;
                    }
                }
                int i = this.f72833c;
                if (i < this.f72834d || (aVar = this.f72832b) == null) {
                    this.f72833c = i + 1;
                    aVar = new C30534a((byte) 0);
                } else {
                    C30534a aVar4 = aVar.f72838d;
                    aVar.f72838d = null;
                    this.f72832b = aVar4;
                    if (aVar4 != null) {
                        aVar4.f72837c = null;
                    }
                }
                aVar.f72835a = j;
                aVar.f72836b = j2;
                if (aVar2 != null) {
                    aVar.f72837c = aVar2;
                    aVar2.f72838d = aVar;
                }
                this.f72831a = aVar;
                MethodCollector.m26664o(7512);
                return true;
            } finally {
                MethodCollector.m26664o(7512);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r5 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r3 = r4.f72835a - r5.f72835a;
        r14 = r14 - r5.f72836b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r3 < 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r14 <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r3 = r3 / r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7689);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7689);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7689);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        return -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo54365b(long r12, long r14) {
        /*
            r11 = this;
            r10 = 7689(0x1e09, float:1.0775E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r10)
            monitor-enter(r11)
            com.ss.android.socialbase.downloader.k.f$a r4 = r11.f72831a     // Catch:{ all -> 0x0056 }
            r8 = -1
            if (r4 != 0) goto L_0x0011
            monitor-exit(r11)     // Catch:{ all -> 0x0056 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r10)
            return r8
        L_0x0011:
            r3 = 0
            r5 = r4
        L_0x0013:
            long r0 = r5.f72836b
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0020
            com.ss.android.socialbase.downloader.k.f$a r0 = r5.f72837c
            r3 = r5
            r5 = r0
            if (r5 == 0) goto L_0x0025
            goto L_0x0013
        L_0x0020:
            if (r3 == 0) goto L_0x0051
            if (r5 == r3) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            r5 = r3
            if (r5 != 0) goto L_0x0034
            goto L_0x0051
        L_0x0029:
            long r0 = r5.f72836b
            long r6 = r12 - r0
            long r1 = r3.f72836b
            long r1 = r1 - r12
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
        L_0x0034:
            long r3 = r4.f72835a
            long r0 = r5.f72835a
            long r3 = r3 - r0
            long r0 = r5.f72836b
            long r14 = r14 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            long r3 = r3 / r14
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r10)
            return r3
        L_0x004c:
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r10)
            return r8
        L_0x0051:
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r10)
            return r8
        L_0x0056:
            r0 = move-exception
            monitor-exit(r11)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2189k.C30533f.mo54365b(long, long):long");
    }
}
