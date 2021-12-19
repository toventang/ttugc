package com.p2082ss.android.ugc.aweme.utils;

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
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.utils.bs */
public final class C80272bs {
    static {
        Covode.recordClassIndex(93540);
    }

    /* renamed from: a */
    public static final long m139142a(Context context) {
        MethodCollector.m26663i(370);
        C89219l.m154721d(context, "");
        int i = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object a = m139143a(context, "activity");
        if (a != null) {
            ((ActivityManager) a).getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            MethodCollector.m26664o(370);
            return j;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        MethodCollector.m26664o(370);
        throw nullPointerException;
    }

    /* renamed from: a */
    private static final int m139141a(String str, FileInputStream fileInputStream) {
        MethodCollector.m26663i(433);
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
                        if (bArr[i2] != ((byte) str.charAt(i3))) {
                            continue;
                            break;
                        } else if (i3 == str.length() - 1) {
                            while (i2 < 1024 && bArr[i2] != 10) {
                                if (Character.isDigit(bArr[i2])) {
                                    int i4 = i2 + 1;
                                    while (i4 < 1024 && Character.isDigit(bArr[i4])) {
                                        i4++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, i2, i4 - i2, C89338d.f202990a));
                                    MethodCollector.m26664o(433);
                                    return parseInt;
                                }
                                i2++;
                            }
                            MethodCollector.m26664o(433);
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
        MethodCollector.m26664o(433);
        return -1;
    }

    /* renamed from: a */
    private static Object m139143a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(400);
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
                    MethodCollector.m26664o(400);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
