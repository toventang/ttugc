package com.p2082ss.android.token;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.token.g */
public final class C30633g {

    /* renamed from: a */
    private static String f73228a;

    static {
        Covode.recordClassIndex(37171);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[SYNTHETIC, Splitter:B:29:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m62951a() {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.token.C30633g.m62951a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m62953a(Context context) {
        String b = m62955b(context);
        if (b == null || b.contains(":") || !b.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m62955b(Context context) {
        String str = f73228a;
        if (!C13627m.m24498a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m62950a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f73228a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            C30629e.m62929a(e);
        }
        String a = m62951a();
        f73228a = a;
        return a;
    }

    /* renamed from: a */
    public static String m62952a(String str) {
        String[] split;
        String str2 = "";
        try {
            str2 = new URI(str).getHost().toLowerCase();
            Matcher matcher = Pattern.compile("[^\\.]+(\\.com|\\.net|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.app|\\.edu)").matcher(str2);
            if (matcher.find()) {
                return matcher.group();
            }
        } catch (Exception e) {
            C30629e.m62929a(e);
        }
        try {
            if (TextUtils.isEmpty(str2) || (split = str2.split("\\.")) == null || split.length <= 1) {
                return null;
            }
            return split[split.length - 2] + "." + split[split.length - 1];
        } catch (Exception e2) {
            C30629e.m62929a(e2);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m62950a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1753);
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
                    MethodCollector.m26664o(1753);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static boolean m62954a(String str, Set<String> set) {
        if (!TextUtils.isEmpty(str) && set != null && !set.isEmpty()) {
            try {
                String lowerCase = new URI(str).getHost().toLowerCase();
                if (TextUtils.isEmpty(lowerCase)) {
                    return false;
                }
                for (String str2 : set) {
                    if (!TextUtils.isEmpty(str2) && lowerCase.endsWith(str2)) {
                        return true;
                    }
                }
            } catch (Exception e) {
                C30629e.m62929a(e);
            }
        }
        return false;
    }
}
