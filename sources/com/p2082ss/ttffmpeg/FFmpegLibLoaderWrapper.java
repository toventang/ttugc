package com.p2082ss.ttffmpeg;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.ttffmpeg.FFmpegLibLoaderWrapper */
public final class FFmpegLibLoaderWrapper {

    /* renamed from: a */
    private static volatile AbstractC86217a f192432a;

    /* renamed from: b */
    private static boolean f192433b;

    static {
        Covode.recordClassIndex(101361);
    }

    /* renamed from: a */
    public static List<String> m148177a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ttcrypto");
        arrayList.add("ttboringssl");
        arrayList.add("ttffmpeg");
        return arrayList;
    }

    public static synchronized String getFFmpegVersion() {
        synchronized (FFmpegLibLoaderWrapper.class) {
            MethodCollector.m26663i(5399);
            MethodCollector.m26664o(5399);
        }
        return "1.1.60.20-mt";
    }

    /* renamed from: b */
    public static synchronized boolean m148179b() {
        synchronized (FFmpegLibLoaderWrapper.class) {
            MethodCollector.m26663i(5401);
            boolean z = true;
            if (f192433b) {
                MethodCollector.m26664o(5401);
                return true;
            } else if (f192432a != null) {
                boolean a = f192432a.mo136611a();
                f192433b = a;
                MethodCollector.m26664o(5401);
                return a;
            } else {
                try {
                    m148178a("ttmverify");
                } catch (UnsatisfiedLinkError unused) {
                    try {
                        m148178a("ttmverifylite");
                        CustomVerify._init();
                    } catch (UnsatisfiedLinkError unused2) {
                        z = false;
                    }
                }
                f192433b = z;
                MethodCollector.m26664o(5401);
                return z;
            }
        }
    }

    /* renamed from: a */
    private static void m148178a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
