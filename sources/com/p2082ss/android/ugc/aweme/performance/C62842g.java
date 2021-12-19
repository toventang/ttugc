package com.p2082ss.android.ugc.aweme.performance;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.performance.g */
public final class C62842g {

    /* renamed from: a */
    private static final FileFilter f142512a = new FileFilter() {
        /* class com.p2082ss.android.ugc.aweme.performance.C62842g.C628431 */

        static {
            Covode.recordClassIndex(73669);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    static {
        Covode.recordClassIndex(73668);
    }

    /* renamed from: a */
    public static int m113247a() {
        int i = Build.VERSION.SDK_INT;
        try {
            int a = m113248a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m113248a("/sys/devices/system/cpu/present");
            }
            if (a == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(f142512a).length;
            }
            return a;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m113253b() {
        MethodCollector.m26663i(12716);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < m113247a(); i3++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.m26664o(12716);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int a = m113249a("cpu MHz", fileInputStream2) * 1000;
                if (a > i2) {
                    i2 = a;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.m26664o(12716);
                throw th2;
            }
        }
        i = i2;
        MethodCollector.m26664o(12716);
        return i;
    }

    /* renamed from: a */
    private static void m113252a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m113250a(Context context) {
        MethodCollector.m26663i(12905);
        int i = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) m113251a(context, "activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        MethodCollector.m26664o(12905);
        return j;
    }

    /* renamed from: a */
    private static int m113248a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.m26663i(12489);
        int i = -1;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.matches("0-[\\d]+$")) {
                            i = Integer.parseInt(readLine.substring(2)) + 1;
                        }
                    }
                    m113252a(fileInputStream2);
                    m113252a(bufferedReader);
                    MethodCollector.m26664o(12489);
                    return i;
                } catch (IOException unused) {
                    fileInputStream = fileInputStream2;
                    m113252a(fileInputStream);
                    m113252a(bufferedReader);
                    MethodCollector.m26664o(12489);
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m113252a(fileInputStream);
                    m113252a(bufferedReader);
                    MethodCollector.m26664o(12489);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                m113252a(fileInputStream);
                m113252a(bufferedReader);
                MethodCollector.m26664o(12489);
                return -1;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                m113252a(fileInputStream);
                m113252a(bufferedReader);
                MethodCollector.m26664o(12489);
                throw th;
            }
        } catch (IOException unused3) {
            bufferedReader = null;
            m113252a(fileInputStream);
            m113252a(bufferedReader);
            MethodCollector.m26664o(12489);
            return -1;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            m113252a(fileInputStream);
            m113252a(bufferedReader);
            MethodCollector.m26664o(12489);
            throw th;
        }
    }

    /* renamed from: a */
    private static int m113249a(String str, FileInputStream fileInputStream) {
        MethodCollector.m26663i(13088);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (i2 < read) {
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, 0, i2, i4 - i2));
                                    MethodCollector.m26664o(13088);
                                    return parseInt;
                                }
                                i2++;
                            }
                            MethodCollector.m26664o(13088);
                            return -1;
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.m26664o(13088);
        return -1;
    }

    /* renamed from: a */
    private static Object m113251a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12993);
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
                    MethodCollector.m26664o(12993);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
