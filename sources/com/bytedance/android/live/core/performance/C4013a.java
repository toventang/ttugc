package com.bytedance.android.live.core.performance;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.performance.p227a.C4014a;
import com.bytedance.android.live.core.performance.p227a.C4016c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.bytedance.android.live.core.performance.a */
public final class C4013a {

    /* renamed from: a */
    private static long f10993a = -1;

    /* renamed from: b */
    private static C4014a f10994b;

    static {
        Covode.recordClassIndex(4547);
    }

    /* renamed from: b */
    public static boolean m9782b() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static long m9785e() {
        long f;
        if (f10993a == -1) {
            long j = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                f = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i = Build.VERSION.SDK_INT;
                f = m9786f();
            }
            if (f > 0) {
                j = f;
            }
            f10993a = j;
        }
        return f10993a;
    }

    /* renamed from: c */
    private static long m9783c() {
        BufferedReader bufferedReader;
        MethodCollector.m26663i(13325);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                C4016c.m9791a(bufferedReader);
                MethodCollector.m26664o(13325);
                return parseLong;
            } catch (Throwable unused) {
                C4016c.m9791a(bufferedReader);
                MethodCollector.m26664o(13325);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C4016c.m9791a(bufferedReader);
            MethodCollector.m26664o(13325);
            return -1;
        }
    }

    /* renamed from: d */
    private static long m9784d() {
        BufferedReader bufferedReader;
        MethodCollector.m26663i(13456);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                C4016c.m9791a(bufferedReader);
                MethodCollector.m26664o(13456);
                return parseLong;
            } catch (Throwable unused) {
                C4016c.m9791a(bufferedReader);
                MethodCollector.m26664o(13456);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C4016c.m9791a(bufferedReader);
            MethodCollector.m26664o(13456);
            return -1;
        }
    }

    /* renamed from: f */
    private static long m9786f() {
        try {
            int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i))).longValue();
        } catch (Exception unused) {
            return 100;
        }
    }

    /* renamed from: a */
    public static double m9781a() {
        long j;
        double d;
        double d2;
        MethodCollector.m26663i(13387);
        if (f10994b == null) {
            f10994b = new C4014a();
        }
        C4014a aVar = f10994b;
        long currentTimeMillis = System.currentTimeMillis();
        long c = m9783c();
        if (aVar.f11004j) {
            j = m9784d();
        } else {
            j = 0;
        }
        double d3 = 0.0d;
        if (aVar.f10998d == 1) {
            try {
                Thread.sleep(360);
            } catch (InterruptedException unused) {
            }
            long c2 = m9783c();
            if (aVar.f11004j) {
                long d4 = m9784d() - j;
                if (d4 > 0) {
                    d2 = (double) ((((float) c2) - ((float) c)) / ((float) d4));
                    double d5 = (double) c2;
                    double d6 = (double) c;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    double currentTimeMillis2 = (double) (System.currentTimeMillis() - currentTimeMillis);
                    Double.isNaN(currentTimeMillis2);
                    double d7 = ((d5 - d6) * 1000.0d) / currentTimeMillis2;
                    double e = (double) m9785e();
                    Double.isNaN(e);
                    aVar.mo9383a(currentTimeMillis, d2, d7 / e, c, j);
                }
            }
            d2 = 0.0d;
            double d52 = (double) c2;
            double d62 = (double) c;
            Double.isNaN(d52);
            Double.isNaN(d62);
            double currentTimeMillis22 = (double) (System.currentTimeMillis() - currentTimeMillis);
            Double.isNaN(currentTimeMillis22);
            double d72 = ((d52 - d62) * 1000.0d) / currentTimeMillis22;
            double e2 = (double) m9785e();
            Double.isNaN(e2);
            aVar.mo9383a(currentTimeMillis, d2, d72 / e2, c, j);
        } else {
            if (aVar.f11002h > -1) {
                if (aVar.f11004j) {
                    double d8 = (double) (c - aVar.f11001g);
                    Double.isNaN(d8);
                    double d9 = (double) (j - aVar.f11000f);
                    Double.isNaN(d9);
                    d3 = (d8 * 1.0d) / d9;
                }
                double d10 = (double) c;
                double d11 = (double) aVar.f11001g;
                Double.isNaN(d10);
                Double.isNaN(d11);
                double d12 = (double) (currentTimeMillis - aVar.f11002h);
                Double.isNaN(d12);
                double d13 = ((d10 - d11) * 1000.0d) / d12;
                double e3 = (double) m9785e();
                Double.isNaN(e3);
                d = d13 / e3;
            } else {
                d3 = 0.0d;
                d = 0.0d;
            }
            aVar.mo9383a(currentTimeMillis, d3, d, c, j);
        }
        C3854a.m9453a(3, "CommonMonitorUtil", "cpu Rate: " + f10994b.f10999e + ", cpu speed" + f10994b.f11003i);
        double d14 = f10994b.f10999e;
        MethodCollector.m26664o(13387);
        return d14;
    }
}
