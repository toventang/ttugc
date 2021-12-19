package com.p2082ss.android.socialbase.downloader.p2184g;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.p2184g.p2185a.C30445b;
import com.p2082ss.android.socialbase.downloader.p2188j.C30519e;
import com.p2082ss.android.socialbase.downloader.p2189k.C30580i;
import java.net.InetAddress;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.g.c */
public final class C30451c {

    /* renamed from: a */
    final C30580i<String, C30455b> f72591a;

    /* renamed from: b */
    final Handler f72592b;

    /* renamed from: c */
    private final Handler f72593c;

    /* renamed from: com.ss.android.socialbase.downloader.g.c$a */
    public interface AbstractC30454a {
        static {
            Covode.recordClassIndex(36981);
        }

        /* renamed from: a */
        void mo54248a(String str, List<InetAddress> list);
    }

    static {
        Covode.recordClassIndex(36978);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.downloader.g.c$b */
    public static class C30455b {

        /* renamed from: a */
        List<InetAddress> f72602a;

        /* renamed from: b */
        long f72603b;

        static {
            Covode.recordClassIndex(36982);
        }

        private C30455b() {
        }

        /* synthetic */ C30455b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.c$c */
    public static class C30456c {

        /* renamed from: a */
        public static final C30451c f72604a = new C30451c((byte) 0);

        static {
            Covode.recordClassIndex(36983);
        }
    }

    private C30451c() {
        this.f72591a = new C30580i<>(4, 16, false);
        this.f72593c = new Handler(C30445b.f72563a.getLooper());
        this.f72592b = new Handler(C30519e.C30520a.f72818a);
    }

    /* synthetic */ C30451c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo54244a(final String str, final AbstractC30454a aVar) {
        this.f72593c.post(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2184g.C30451c.RunnableC304521 */

            /* renamed from: c */
            final /* synthetic */ long f72596c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

            static {
                Covode.recordClassIndex(36979);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
                if (r3.isEmpty() == false) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
                if (r3 == null) goto L_0x007e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
                if (r3.isEmpty() == false) goto L_0x0081;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
                if (r2 == null) goto L_0x0087;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
                r8.mo54245a(r5, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
                r3 = r2.f72602a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
                r8.f72592b.removeCallbacks(r9);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
                if (r6 == null) goto L_0x0091;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
                r6.mo54248a(r7, r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8769);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 159
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.p2184g.C30451c.RunnableC304521.run():void");
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54245a(String str, List<InetAddress> list) {
        MethodCollector.m26663i(6719);
        synchronized (this.f72591a) {
            try {
                C30455b bVar = (C30455b) this.f72591a.get(str);
                if (bVar == null) {
                    bVar = new C30455b((byte) 0);
                    this.f72591a.put(str, bVar);
                }
                bVar.f72602a = list;
                bVar.f72603b = System.currentTimeMillis();
            } finally {
                MethodCollector.m26664o(6719);
            }
        }
    }
}
