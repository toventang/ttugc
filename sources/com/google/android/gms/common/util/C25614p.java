package com.google.android.gms.common.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.common.util.p */
public final class C25614p {

    /* renamed from: a */
    public static final IntentFilter f60733a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f60734b;

    /* renamed from: c */
    private static float f60735c = Float.NaN;

    static {
        Covode.recordClassIndex(31024);
    }

    /* renamed from: a */
    public static Context m49444a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static synchronized float m49447b(Context context) {
        synchronized (C25614p.class) {
            MethodCollector.m26663i(8534);
            if (SystemClock.elapsedRealtime() - f60734b >= 60000 || Float.isNaN(f60735c)) {
                Intent a = m49445a(m49444a(context), f60733a);
                if (a != null) {
                    f60735c = ((float) a.getIntExtra("level", -1)) / ((float) a.getIntExtra("scale", -1));
                }
                f60734b = SystemClock.elapsedRealtime();
                float f = f60735c;
                MethodCollector.m26664o(8534);
                return f;
            }
            float f2 = f60735c;
            MethodCollector.m26664o(8534);
            return f2;
        }
    }

    /* renamed from: b */
    private static Intent m49448b(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Intent m49445a(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m49448b(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Object m49446a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8380);
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
                    MethodCollector.m26664o(8380);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
