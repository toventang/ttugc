package com.p2082ss.android.ttve.monitor;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ttve.monitor.d */
public final class C30687d {

    /* renamed from: a */
    private static String f73389a;

    static {
        Covode.recordClassIndex(37257);
    }

    /* renamed from: c */
    public static int m63046c() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                /* class com.p2082ss.android.ttve.monitor.C30687d.C306881 */

                static {
                    Covode.recordClassIndex(37258);
                }

                public final boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    /* renamed from: b */
    public static String m63045b() {
        String str;
        MethodCollector.m26663i(2177);
        InputStream inputStream = null;
        try {
            inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            str = "0";
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            MethodCollector.m26664o(2177);
            throw th;
        }
        String trim = str.trim();
        MethodCollector.m26664o(2177);
        return trim;
    }

    /* renamed from: a */
    public static String m63042a() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(2101);
        if (!TextUtils.isEmpty(f73389a)) {
            String str = f73389a;
            MethodCollector.m26664o(2101);
            return str;
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String readLine = bufferedReader.readLine();
                    while (true) {
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware") && readLine.contains(":")) {
                            String substring = readLine.substring(readLine.indexOf(":") + 1);
                            if (!TextUtils.isEmpty(substring)) {
                                f73389a = substring.trim();
                                break;
                            }
                        }
                        readLine = bufferedReader.readLine();
                    }
                    if (TextUtils.isEmpty(f73389a)) {
                        f73389a = m63043a("ro.board.platform");
                    }
                    String str2 = f73389a;
                    m63044a(bufferedReader);
                    m63044a(fileReader);
                    MethodCollector.m26664o(2101);
                    return str2;
                } catch (IOException unused) {
                    m63044a(bufferedReader);
                    m63044a(fileReader);
                    MethodCollector.m26664o(2101);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    m63044a(bufferedReader2);
                    m63044a(fileReader);
                    MethodCollector.m26664o(2101);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                m63044a(bufferedReader);
                m63044a(fileReader);
                MethodCollector.m26664o(2101);
                return null;
            } catch (Throwable th3) {
                th = th3;
                m63044a(bufferedReader2);
                m63044a(fileReader);
                MethodCollector.m26664o(2101);
                throw th;
            }
        } catch (IOException unused3) {
            fileReader = null;
            bufferedReader = null;
            m63044a(bufferedReader);
            m63044a(fileReader);
            MethodCollector.m26664o(2101);
            return null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            m63044a(bufferedReader2);
            m63044a(fileReader);
            MethodCollector.m26664o(2101);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r4 == null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0066 A[SYNTHETIC, Splitter:B:38:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0070 A[SYNTHETIC, Splitter:B:43:0x0070] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m63047d() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.monitor.C30687d.m63047d():long");
    }

    /* renamed from: a */
    private static void m63044a(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static int m63040a(Context context) {
        if (context == null) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) m63041a(context, "window")).getDefaultDisplay();
        int i = Build.VERSION.SDK_INT;
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    /* renamed from: a */
    private static String m63043a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: a */
    public static Object m63041a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(2222);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(2222);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
