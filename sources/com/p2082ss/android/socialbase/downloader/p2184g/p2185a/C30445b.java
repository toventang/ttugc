package com.p2082ss.android.socialbase.downloader.p2184g.p2185a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.p2184g.p2185a.C30443a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;

/* renamed from: com.ss.android.socialbase.downloader.g.a.b */
public final class C30445b {

    /* renamed from: a */
    public static final HandlerThread f72563a;

    /* renamed from: b */
    public static final Handler f72564b;

    /* renamed from: c */
    static long f72565c = C30472a.f72639a.mo54259a("preconnect_connection_outdate_time", 300000L);

    /* renamed from: d */
    static long f72566d = C30472a.f72639a.mo54259a("preconnect_head_info_outdate_time", 300000L);

    static {
        Covode.recordClassIndex(36972);
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        f72563a = handlerThread;
        C30443a.C30444a.f72562a.f72559a = C30472a.f72639a.mo54258a("preconnect_max_cache_size", 3);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        f72564b = handler;
        handler.post(new Runnable() {
            /* class com.p2082ss.android.socialbase.downloader.p2184g.p2185a.C30445b.RunnableC304461 */

            static {
                Covode.recordClassIndex(36973);
            }

            public final void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
