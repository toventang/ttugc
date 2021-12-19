package org.chromium;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.chromium.f */
public final class C90232f {

    /* renamed from: a */
    private static String f204971a;

    static {
        Covode.recordClassIndex(106492);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[SYNTHETIC, Splitter:B:21:0x0074] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m156942a() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.C90232f.m156942a():java.lang.String");
    }

    /* renamed from: b */
    private static boolean m156945b(Context context) {
        String c = m156946c(context);
        if (c == null || c.contains(":") || !c.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m156944a(Context context) {
        int q = C90228c.m156904a().mo145279q();
        if (C90229d.m156924a().loggerDebug()) {
            C90229d.m156924a().loggerD("Utils", "CronetAppProvider ProcessFlag: ".concat(String.valueOf(q)));
        }
        if (q == 1) {
            return true;
        }
        if (q != 2) {
            return m156945b(context);
        }
        return false;
    }

    /* renamed from: c */
    private static String m156946c(Context context) {
        String str = f204971a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m156941a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (C90229d.m156924a().loggerDebug()) {
                        C90229d.m156924a().loggerD("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f204971a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m156942a();
        f204971a = a;
        return a;
    }

    /* renamed from: a */
    public static List m156943a(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Object obj : m156943a(interfaces[i])) {
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return arrayList;
    }

    /* renamed from: a */
    private static Object m156941a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4641);
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
                    MethodCollector.m26664o(4641);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
