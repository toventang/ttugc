package com.bytedance.android.ecommerce.ocr.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.ecommerce.ocr.view.e */
public final class C2899e implements SensorEventListener {

    /* renamed from: a */
    boolean f8630a;

    /* renamed from: b */
    public AbstractC2900a f8631b;

    /* renamed from: c */
    private SensorManager f8632c;

    /* renamed from: d */
    private Sensor f8633d;

    /* renamed from: e */
    private int f8634e;

    /* renamed from: f */
    private int f8635f;

    /* renamed from: g */
    private int f8636g;

    /* renamed from: h */
    private long f8637h;

    /* renamed from: i */
    private int f8638i;

    /* renamed from: j */
    private int f8639j = 1000;

    /* renamed from: com.bytedance.android.ecommerce.ocr.view.e$a */
    public interface AbstractC2900a {
        static {
            Covode.recordClassIndex(3329);
        }

        /* renamed from: a */
        void mo7526a();
    }

    static {
        Covode.recordClassIndex(3328);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C2899e(Context context) {
        SensorManager sensorManager = (SensorManager) m8209a(context, "sensor");
        this.f8632c = sensorManager;
        this.f8633d = sensorManager.getDefaultSensor(1);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC2900a aVar;
        if (sensorEvent.sensor != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f8637h >= ((long) this.f8639j)) {
                if (this.f8630a) {
                    this.f8638i = 0;
                    this.f8634e = 0;
                    this.f8635f = 0;
                    this.f8636g = 0;
                } else if (sensorEvent.sensor.getType() == 1) {
                    int i = (int) sensorEvent.values[0];
                    int i2 = (int) sensorEvent.values[1];
                    int i3 = (int) sensorEvent.values[2];
                    if (this.f8638i != 0) {
                        int abs = Math.abs(this.f8634e - i);
                        int abs2 = Math.abs(this.f8635f - i2);
                        int abs3 = Math.abs(this.f8636g - i3);
                        if (Math.sqrt((double) ((abs * abs) + (abs2 * abs2) + (abs3 * abs3))) >= 1.4d) {
                            this.f8638i = 2;
                        } else {
                            if (this.f8638i == 2) {
                                this.f8637h = elapsedRealtime;
                                if (!this.f8630a && (aVar = this.f8631b) != null) {
                                    aVar.mo7526a();
                                }
                            }
                            this.f8638i = 1;
                        }
                    } else {
                        this.f8637h = elapsedRealtime;
                        this.f8638i = 1;
                    }
                    this.f8634e = i;
                    this.f8635f = i2;
                    this.f8636g = i3;
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m8209a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(3271);
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
                    MethodCollector.m26664o(3271);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
