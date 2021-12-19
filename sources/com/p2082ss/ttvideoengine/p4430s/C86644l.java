package com.p2082ss.ttvideoengine.p4430s;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.ttvideoengine.s.l */
public class C86644l {

    /* renamed from: a */
    public static String f195278a;

    /* renamed from: b */
    public static C86646a f195279b = new C86646a();

    /* renamed from: c */
    public static int f195280c = 0;

    /* renamed from: d */
    public static boolean f195281d = true;

    /* renamed from: e */
    public static int f195282e = 0;

    /* renamed from: com.ss.ttvideoengine.s.l$a */
    public static class C86646a {

        /* renamed from: a */
        public long f195284a = -1;

        /* renamed from: b */
        public long f195285b = -1;

        static {
            Covode.recordClassIndex(101874);
        }

        C86646a() {
        }

        /* renamed from: a */
        public final boolean mo137914a() {
            if (this.f195284a > 0) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(101872);
    }

    /* renamed from: a */
    public static long m150121a() {
        MethodCollector.m26663i(5448);
        if (!f195281d) {
            synchronized (C86644l.class) {
                try {
                    C86646a aVar = f195279b;
                    if (aVar != null && aVar.mo137914a()) {
                        return (f195279b.f195284a + SystemClock.elapsedRealtime()) - f195279b.f195285b;
                    }
                } finally {
                    MethodCollector.m26664o(5448);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        MethodCollector.m26664o(5448);
        return currentTimeMillis;
    }

    /* renamed from: b */
    public static boolean m150123b() {
        MethodCollector.m26663i(5451);
        synchronized (C86644l.class) {
            try {
                C86646a aVar = f195279b;
                if (aVar != null) {
                    return aVar.mo137914a();
                }
                MethodCollector.m26664o(5451);
                return false;
            } finally {
                MethodCollector.m26664o(5451);
            }
        }
    }

    /* renamed from: a */
    public static String m150122a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }
}
