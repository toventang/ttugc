package com.benchmark.tools;

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
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.benchmark.tools.j */
public final class C2527j {
    static {
        Covode.recordClassIndex(2898);
    }

    /* renamed from: a */
    public static int m7406a() {
        int i = Build.VERSION.SDK_INT;
        return Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: b */
    public static long m7409b() {
        String str;
        MethodCollector.m26663i(9317);
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            str = "";
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            str = "0";
        }
        long parseLong = Long.parseLong(str.trim());
        MethodCollector.m26664o(9317);
        return parseLong;
    }

    /* renamed from: a */
    public static float m7405a(float f) {
        return ((float) Math.floor((double) (f * 100.0f))) / 100.0f;
    }

    /* renamed from: a */
    public static synchronized String m7408a(String str) {
        byte[] digest;
        String str2;
        synchronized (C2527j.class) {
            MethodCollector.m26663i(9475);
            byte[] bytes = str.getBytes();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(bytes);
                str2 = "";
                for (byte b : instance.digest()) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        str2 = str2 + "0";
                    }
                    str2 = str2 + hexString;
                }
                MethodCollector.m26664o(9475);
            } catch (NoSuchAlgorithmException unused) {
                MethodCollector.m26664o(9475);
                return null;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static Object m7407a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9315);
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
                    MethodCollector.m26664o(9315);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
