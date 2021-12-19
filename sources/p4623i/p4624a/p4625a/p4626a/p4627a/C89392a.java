package p4623i.p4624a.p4625a.p4626a.p4627a;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: i.a.a.a.a.a */
public class C89392a {

    /* renamed from: a */
    private static String f203058a;

    static {
        Covode.recordClassIndex(105476);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[SYNTHETIC, Splitter:B:21:0x006d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m154945a() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: p4623i.p4624a.p4625a.p4626a.p4627a.C89392a.m154945a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m154946a(Context context) {
        String b = m154947b(context);
        if (b == null || b.contains(":") || !b.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m154947b(Context context) {
        String str = f203058a;
        if (!C13627m.m24498a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m154944a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        C3854a.m9453a(3, "Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f203058a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m154945a();
        f203058a = a;
        return a;
    }

    /* renamed from: a */
    private static Object m154944a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11927);
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
                    MethodCollector.m26664o(11927);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
