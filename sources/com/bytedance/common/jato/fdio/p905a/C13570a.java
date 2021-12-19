package com.bytedance.common.jato.fdio.p905a;

import android.content.SharedPreferences;
import android.os.Trace;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.p903b.C13533c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.common.jato.fdio.a.a */
public final class C13570a {

    /* renamed from: a */
    public static boolean f33010a;

    /* renamed from: b */
    public static boolean f33011b;

    /* renamed from: c */
    private static boolean f33012c;

    static {
        Covode.recordClassIndex(15587);
    }

    /* renamed from: a */
    public static synchronized void m24370a() {
        synchronized (C13570a.class) {
            MethodCollector.m26663i(11926);
            if (f33012c) {
                MethodCollector.m26664o(11926);
                return;
            }
            Jato.getWorkExecutorService().execute(new Runnable() {
                /* class com.bytedance.common.jato.fdio.p905a.C13570a.RunnableC135711 */

                static {
                    Covode.recordClassIndex(15588);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:36:0x0146, code lost:
                    if (new java.io.File(r3).exists() != false) goto L_0x00bb;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:40:0x0186, code lost:
                    if (new java.io.File(r3).exists() != false) goto L_0x00bb;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:41:0x018a, code lost:
                    r3 = "";
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 401
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.fdio.p905a.C13570a.RunnableC135711.run():void");
                }
            });
            f33012c = true;
            MethodCollector.m26664o(11926);
        }
    }

    /* renamed from: a */
    public static synchronized void m24371a(final boolean z) {
        synchronized (C13570a.class) {
            MethodCollector.m26663i(12065);
            if (!f33012c) {
                MethodCollector.m26664o(12065);
                return;
            }
            Trace.beginSection("stop_fdio");
            Jato.getWorkExecutorService().execute(new Runnable() {
                /* class com.bytedance.common.jato.fdio.p905a.C13570a.RunnableC135732 */

                static {
                    Covode.recordClassIndex(15590);
                }

                public final void run() {
                    if (z && C13570a.f33011b) {
                        SharedPreferences a = C13533c.m24312a();
                        a.edit().putInt("start_up_retry_time", a.getInt("start_up_retry_time", 0) - 1).apply();
                    }
                    Jato.endFDIOOperator("jato_start_up_default_2", z);
                }
            });
            f33012c = false;
            Trace.endSection();
            MethodCollector.m26664o(12065);
        }
    }
}
