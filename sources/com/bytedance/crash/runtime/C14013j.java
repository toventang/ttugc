package com.bytedance.crash.runtime;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14045c;
import com.bytedance.crash.util.C14054h;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.C14075v;
import com.bytedance.crash.util.C14076w;
import com.bytedance.crash.util.NativeTools;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.j */
public final class C14013j {

    /* renamed from: a */
    public static AbstractC14012i f34154a;

    static {
        Covode.recordClassIndex(16078);
    }

    /* renamed from: a */
    public static JSONArray m25406a(String str) {
        if (f34154a != null && C13933m.m25229e().equals(str)) {
            try {
                return m25408b(f34154a.mo22529a());
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
        return m25405a(C14069r.m25620a(C13933m.f33936a, str));
    }

    /* renamed from: b */
    private static JSONArray m25408b(String str) {
        try {
            File file = new File(str);
            if (file.length() > 512000) {
                return C14056j.m25562a(file, file.length() - 512000);
            }
            return C14056j.m25563a(str);
        } catch (IOException unused) {
            return null;
        } catch (Throwable unused2) {
            C13933m.f33942g.isDebugMode();
            return null;
        }
    }

    /* renamed from: a */
    public static JSONArray m25405a(File file) {
        try {
            File file2 = new File(file, "logcat.txt");
            File file3 = new File(file, "logerr.txt");
            if (file3.exists()) {
                if (C14076w.m25663a(file2)) {
                    C14045c.m25526a(true, "single_logcat", 1);
                } else {
                    C14075v.m25650a("single_logcat" + " failed ver 2");
                    C14045c.m25526a(false, "single_logcat", 3);
                }
            }
            return m25408b(C14054h.m25541a(file2, file3, true).getAbsolutePath());
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m25407a(final String str, String str2, boolean z) {
        if (NativeTools.m25458a().f34209a) {
            C14045c.C14046a a = C14045c.m25525a("single_logcat");
            if (a.f34223e == 1 || a.f34220b != 2) {
                C14075v.m25650a("use native single logcat");
                NativeTools.m25458a().mo22561a(str, str2);
                if (z) {
                    SystemClock.sleep(3000);
                    return;
                }
                return;
            }
        }
        C13933m.f33942g.isDebugMode();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        RunnableC140141 r1 = new Runnable() {
            /* class com.bytedance.crash.runtime.C14013j.RunnableC140141 */

            static {
                Covode.recordClassIndex(16079);
            }

            public final void run() {
                C14075v.m25650a("dumpLogcat use java");
                try {
                    Process exec = Runtime.getRuntime().exec(new String[]{"logcat", "-b", "main,system,crash,events", "-f", str});
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            exec.waitFor(3000, TimeUnit.MILLISECONDS);
                        } else if (atomicBoolean.get()) {
                            exec.waitFor();
                        } else {
                            SystemClock.sleep(1000);
                            if (exec == null) {
                                return;
                            }
                        }
                        exec.destroy();
                    } catch (Throwable unused) {
                        if (exec != null) {
                            exec.destroy();
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        };
        try {
            new Thread(r1).start();
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            r1.run();
        }
    }
}
