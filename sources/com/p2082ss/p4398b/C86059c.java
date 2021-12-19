package com.p2082ss.p4398b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.lang.reflect.Field;

/* renamed from: com.ss.b.c */
public class C86059c {

    /* renamed from: a */
    private static BatteryManager f192006a;

    /* renamed from: b */
    private static IntentFilter f192007b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    static {
        Covode.recordClassIndex(100767);
    }

    /* renamed from: d */
    public static long m147823d(Context context) {
        return m147818a(context).getLongProperty(4);
    }

    /* renamed from: b */
    public static float m147820b(Context context) {
        return ((float) m147821b(context, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("voltage", -1)) / 1000.0f;
    }

    /* renamed from: a */
    public static BatteryManager m147818a(Context context) {
        MethodCollector.m26663i(9226);
        if (f192006a == null) {
            synchronized (C86059c.class) {
                try {
                    if (f192006a == null) {
                        if (Build.VERSION.SDK_INT < 21) {
                            return null;
                        }
                        f192006a = (BatteryManager) m147819a(context, "batterymanager");
                    }
                } finally {
                    MethodCollector.m26664o(9226);
                }
            }
        }
        BatteryManager batteryManager = f192006a;
        MethodCollector.m26664o(9226);
        return batteryManager;
    }

    /* renamed from: c */
    public static float m147822c(Context context) {
        float longProperty = (float) m147818a(context).getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (C86060d.m147825b() || C86060d.m147826c()) {
            if (longProperty < -10000.0f) {
                longProperty /= 1000.0f;
            }
            return -longProperty;
        } else if (!C86060d.m147824a()) {
            return longProperty / 1000.0f;
        } else {
            if (longProperty > 10000.0f) {
                return longProperty / 1000.0f;
            }
            return longProperty;
        }
    }

    /* renamed from: a */
    private static Intent m147817a(Context context, IntentFilter intentFilter) {
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
    /* renamed from: b */
    private static Intent m147821b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m147817a(context, intentFilter);
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
    private static Object m147819a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9377);
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
                    MethodCollector.m26664o(9377);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
