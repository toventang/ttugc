package com.p2082ss.ugc.live.p4460a.p4461a.p4463b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87038c;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.ugc.live.a.a.b.c */
public final class C87017c implements AbstractC87015b {

    /* renamed from: a */
    private final ExecutorService f196184a;

    static {
        Covode.recordClassIndex(102783);
    }

    public C87017c() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 3;
        this.f196184a = C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.live.a.a.b.c$a */
    public static class C87019a extends IOException {

        /* renamed from: a */
        int f196188a;

        static {
            Covode.recordClassIndex(102785);
        }

        public C87019a(String str, int i) {
            super(str);
            this.f196188a = i;
        }
    }

    @Override // com.p2082ss.ugc.live.p4460a.p4461a.p4463b.AbstractC87015b
    /* renamed from: a */
    public final void mo140625a(final C87014a aVar, final AbstractC87015b.AbstractC87016a aVar2) {
        if (C87038c.m150749a(aVar.f196182a)) {
            aVar2.mo140627a(new IllegalArgumentException("request is not valid"), 0);
        } else {
            this.f196184a.submit(new Runnable() {
                /* class com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.RunnableC870181 */

                static {
                    Covode.recordClassIndex(102784);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
                    r1 = e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
                    r2 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
                    r0 = ((com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.C87019a) r1).f196188a;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
                    r0 = 0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[Catch:{ all -> 0x0050 }] */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[Catch:{ all -> 0x0050 }] */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[SYNTHETIC, Splitter:B:24:0x0042] */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[DONT_GENERATE] */
                /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r5 = this;
                        com.ss.ugc.live.a.a.b.c r2 = com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.this
                        com.ss.ugc.live.a.a.b.a r1 = r3
                        com.ss.ugc.live.a.a.b.b$a r4 = r4
                        r0 = 5
                        r3 = 0
                        java.net.HttpURLConnection r2 = r2.mo140628a(r1, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0061 }
                        if (r2 == 0) goto L_0x004f
                        java.io.InputStream r3 = r2.getInputStream()     // Catch:{ IOException -> 0x002d }
                        java.lang.String r1 = "Content-Length"
                        r0 = -1
                        int r0 = r2.getHeaderFieldInt(r1, r0)     // Catch:{ IOException -> 0x002d }
                        long r0 = (long) r0     // Catch:{ IOException -> 0x002d }
                        r4.mo140626a(r3, r0)     // Catch:{ IOException -> 0x002d }
                        if (r3 == 0) goto L_0x0027
                        r3.close()     // Catch:{ IOException -> 0x0023 }
                        goto L_0x0027
                    L_0x0023:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x0027:
                        if (r2 == 0) goto L_0x004f
                        r2.disconnect()
                        return
                    L_0x002d:
                        r1 = move-exception
                        goto L_0x0031
                    L_0x002f:
                        r1 = move-exception
                        r2 = r3
                    L_0x0031:
                        boolean r0 = r1 instanceof com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.C87019a     // Catch:{ all -> 0x0050 }
                        if (r0 == 0) goto L_0x003e
                        r0 = r1
                        com.ss.ugc.live.a.a.b.c$a r0 = (com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.C87019a) r0     // Catch:{ all -> 0x0050 }
                        int r0 = r0.f196188a     // Catch:{ all -> 0x0050 }
                    L_0x003a:
                        r4.mo140627a(r1, r0)     // Catch:{ all -> 0x0050 }
                        goto L_0x0040
                    L_0x003e:
                        r0 = 0
                        goto L_0x003a
                    L_0x0040:
                        if (r3 == 0) goto L_0x004a
                        r3.close()     // Catch:{ IOException -> 0x0046 }
                        goto L_0x004a
                    L_0x0046:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x004a:
                        if (r2 == 0) goto L_0x004f
                        r2.disconnect()
                    L_0x004f:
                        return
                    L_0x0050:
                        r1 = move-exception
                        if (r3 == 0) goto L_0x005b
                        r3.close()     // Catch:{ IOException -> 0x0057 }
                        goto L_0x005b
                    L_0x0057:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x005b:
                        if (r2 == 0) goto L_0x0062
                        r2.disconnect()
                        goto L_0x0062
                    L_0x0061:
                        r1 = move-exception
                    L_0x0062:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.RunnableC870181.run():void");
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection mo140628a(com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87014a r8, int r9) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.live.p4460a.p4461a.p4463b.C87017c.mo140628a(com.ss.ugc.live.a.a.b.a, int):java.net.HttpURLConnection");
    }
}
