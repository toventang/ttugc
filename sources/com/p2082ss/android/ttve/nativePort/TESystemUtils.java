package com.p2082ss.android.ttve.nativePort;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttve.audio.C30635a;
import com.p2082ss.android.ttve.model.EnumC30678f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttve.nativePort.TESystemUtils */
public class TESystemUtils {
    static {
        Covode.recordClassIndex(37307);
    }

    public static int getOutputAudioDeviceType() {
        if (Build.VERSION.SDK_INT >= 23) {
            return C30635a.m62960a().ordinal();
        }
        return EnumC30678f.DEFAULT.ordinal();
    }

    public static boolean hasLowLatencyFeature() {
        PackageManager packageManager;
        Context context = VERuntime.EnumC85549a.INSTANCE.f191667b.f191642a;
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context context = VERuntime.EnumC85549a.INSTANCE.f191667b.f191642a;
        if (context == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        AudioManager audioManager = (AudioManager) m63098x1fe44421(context, DataType.AUDIO);
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(property)), Integer.valueOf(Integer.parseInt(property2)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getOutputLatency(int i) {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getOutputLatency", Integer.TYPE)) == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, Integer.valueOf(i))).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return 0;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    /* renamed from: com_ss_android_ttve_nativePort_TESystemUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m63098x1fe44421(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7107);
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
                    MethodCollector.m26664o(7107);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
