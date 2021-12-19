package com.bytedance.p1782z.p1783a.p1785b.p1787b;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p1782z.p1783a.p1785b.AbstractC23729b;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.z.a.b.b.a */
public final class C23730a extends AbstractC23729b {

    /* renamed from: c */
    public PowerManager f56159c = ((PowerManager) m44860a(this.f56157a, "power"));

    /* renamed from: d */
    public boolean f56160d;

    /* renamed from: e */
    public int f56161e;

    /* renamed from: f */
    public float f56162f;

    /* renamed from: g */
    private BatteryManager f56163g = ((BatteryManager) m44860a(this.f56157a, "batterymanager"));

    /* renamed from: h */
    private int f56164h = -1;

    /* renamed from: i */
    private long f56165i;

    static {
        Covode.recordClassIndex(27835);
    }

    /* renamed from: b */
    public final void mo39177b() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f56165i;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.f56165i = elapsedRealtime;
            Intent b = m44861b(this.f56157a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = b.getIntExtra("status", -1);
            this.f56164h = intExtra;
            if (intExtra == 2 || (intExtra == 5 && Build.VERSION.SDK_INT >= 23 && this.f56163g.isCharging())) {
                z = true;
            } else {
                z = false;
            }
            this.f56160d = z;
            this.f56161e = b.getIntExtra("level", 0);
            int intExtra2 = b.getIntExtra("temperature", 0);
            if (intExtra2 > 0) {
                this.f56162f = ((float) intExtra2) / 10.0f;
            }
        }
    }

    public C23730a(Context context, AbstractC23724c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    private static Intent m44859a(Context context, IntentFilter intentFilter) {
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
    private static Intent m44861b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m44859a(context, intentFilter);
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
    private static Object m44860a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1204);
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
                    MethodCollector.m26664o(1204);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
