package com.appsflyer;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.internal.C2327r;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFSensorManager {
    public static volatile AFSensorManager sInstance;

    /* renamed from: ȷ */
    private static final BitSet f6844;

    /* renamed from: ɪ */
    private static final Handler f6845 = new Handler(Looper.getMainLooper());

    /* renamed from: ı */
    final Handler f6846;

    /* renamed from: Ɩ */
    int f6847;

    /* renamed from: ǃ */
    final Map<C2327r, C2327r> f6848;

    /* renamed from: ɨ */
    private final Runnable f6849;

    /* renamed from: ɩ */
    final SensorManager f6850;

    /* renamed from: ɹ */
    final Runnable f6851;

    /* renamed from: ɾ */
    long f6852;

    /* renamed from: Ι */
    boolean f6853;

    /* renamed from: ι */
    final Object f6854 = new Object();

    /* renamed from: І */
    final Runnable f6855;

    /* renamed from: і */
    final Runnable f6856;

    /* renamed from: Ӏ */
    boolean f6857;

    /* renamed from: ӏ */
    private final Map<C2327r, Map<String, Object>> f6858;

    static {
        Covode.recordClassIndex(2492);
        BitSet bitSet = new BitSet(6);
        f6844 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final List<Map<String, Object>> mo6270() {
        for (C2327r rVar : this.f6848.values()) {
            rVar.mo6480(this.f6858, true);
        }
        Map<C2327r, Map<String, Object>> map = this.f6858;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.f6858.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final void mo6271() {
        try {
            if (!this.f6848.isEmpty()) {
                for (C2327r rVar : this.f6848.values()) {
                    this.f6850.unregisterListener(rVar);
                    rVar.mo6480(this.f6858, true);
                }
            }
        } catch (Throwable unused) {
        }
        this.f6847 = 0;
        this.f6857 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final List<Map<String, Object>> mo6272() {
        MethodCollector.m26663i(4328);
        synchronized (this.f6854) {
            try {
                if (!this.f6848.isEmpty() && this.f6857) {
                    for (C2327r rVar : this.f6848.values()) {
                        rVar.mo6480(this.f6858, false);
                    }
                }
                if (this.f6858.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f6858.values());
                MethodCollector.m26664o(4328);
                return copyOnWriteArrayList;
            } finally {
                MethodCollector.m26664o(4328);
            }
        }
    }

    /* renamed from: com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m6928x1744e88b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: ɩ */
    static boolean m6933(int i) {
        if (i < 0 || !f6844.get(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ */
    static AFSensorManager m6932(Context context) {
        if (sInstance != null) {
            return sInstance;
        }
        return m6929((SensorManager) m6927xd1be86d7(m6928x1744e88b(context), "sensor"), f6845);
    }

    /* renamed from: ǃ */
    private static AFSensorManager m6929(SensorManager sensorManager, Handler handler) {
        MethodCollector.m26663i(4204);
        if (sInstance == null) {
            synchronized (AFSensorManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AFSensorManager(sensorManager, handler);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4204);
                    throw th;
                }
            }
        }
        AFSensorManager aFSensorManager = sInstance;
        MethodCollector.m26664o(4204);
        return aFSensorManager;
    }

    private AFSensorManager(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = f6844;
        this.f6848 = new HashMap(bitSet.size());
        this.f6858 = new ConcurrentHashMap(bitSet.size());
        this.f6851 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC22712 */

            static {
                Covode.recordClassIndex(2493);
            }

            public final void run() {
                MethodCollector.m26663i(2151);
                synchronized (AFSensorManager.this.f6854) {
                    try {
                        AFSensorManager aFSensorManager = AFSensorManager.this;
                        try {
                            for (Sensor sensor : aFSensorManager.f6850.getSensorList(-1)) {
                                if (AFSensorManager.m6933(sensor.getType())) {
                                    C2327r rVar = new C2327r(sensor.getType(), sensor.getName(), sensor.getVendor());
                                    if (!aFSensorManager.f6848.containsKey(rVar)) {
                                        aFSensorManager.f6848.put(rVar, rVar);
                                    }
                                    aFSensorManager.f6850.registerListener(aFSensorManager.f6848.get(rVar), sensor, 0);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        aFSensorManager.f6857 = true;
                        AFSensorManager.this.f6846.postDelayed(AFSensorManager.this.f6849, 100);
                        AFSensorManager.this.f6853 = true;
                    } finally {
                        MethodCollector.m26664o(2151);
                    }
                }
            }
        };
        this.f6856 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC22745 */

            static {
                Covode.recordClassIndex(2496);
            }

            public final void run() {
                MethodCollector.m26663i(1365);
                synchronized (AFSensorManager.this.f6854) {
                    try {
                        AFSensorManager.this.mo6271();
                    } finally {
                        MethodCollector.m26664o(1365);
                    }
                }
            }
        };
        this.f6855 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC22723 */

            static {
                Covode.recordClassIndex(2494);
            }

            public final void run() {
                MethodCollector.m26663i(4477);
                synchronized (AFSensorManager.this.f6854) {
                    try {
                        if (AFSensorManager.this.f6853) {
                            AFSensorManager.this.f6846.removeCallbacks(AFSensorManager.this.f6851);
                            AFSensorManager.this.f6846.removeCallbacks(AFSensorManager.this.f6856);
                            AFSensorManager.this.mo6271();
                            AFSensorManager.this.f6853 = false;
                        }
                    } finally {
                        MethodCollector.m26664o(4477);
                    }
                }
            }
        };
        this.f6847 = 1;
        this.f6852 = 0;
        this.f6849 = new Runnable() {
            /* class com.appsflyer.AFSensorManager.RunnableC22734 */

            static {
                Covode.recordClassIndex(2495);
            }

            public final void run() {
                MethodCollector.m26663i(1569);
                synchronized (AFSensorManager.this.f6854) {
                    try {
                        if (AFSensorManager.this.f6847 == 0) {
                            AFSensorManager.this.f6847 = 1;
                        }
                        AFSensorManager.this.f6846.postDelayed(AFSensorManager.this.f6856, ((long) AFSensorManager.this.f6847) * 500);
                    } finally {
                        MethodCollector.m26664o(1569);
                    }
                }
            }
        };
        this.f6850 = sensorManager;
        this.f6846 = handler;
    }

    /* renamed from: com_appsflyer_AFSensorManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m6927xd1be86d7(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4203);
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
                    MethodCollector.m26664o(4203);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
