package com.p2082ss.android.ttve.audio;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ttve.model.EnumC30678f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ttve.audio.a */
public class C30635a {

    /* renamed from: a */
    private static final String f73232a = C30635a.class.getSimpleName();

    static {
        Covode.recordClassIndex(37174);
    }

    /* renamed from: b */
    public static AudioDeviceInfo m62962b() {
        AudioDeviceInfo[] devices = ((AudioManager) m62961a(VERuntime.EnumC85549a.INSTANCE.f191667b.f191642a, DataType.AUDIO)).getDevices(1);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 15) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static EnumC30678f m62960a() {
        boolean[] zArr = new boolean[EnumC30678f.values().length];
        int ordinal = EnumC30678f.BLUETOOTH.ordinal();
        int ordinal2 = EnumC30678f.WIRED.ordinal();
        AudioDeviceInfo[] devices = ((AudioManager) m62961a(VERuntime.EnumC85549a.INSTANCE.f191667b.f191642a, DataType.AUDIO)).getDevices(2);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                zArr[ordinal] = true;
            } else if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                zArr[ordinal2] = true;
            }
        }
        if (zArr[ordinal2]) {
            return EnumC30678f.WIRED;
        }
        if (zArr[ordinal]) {
            return EnumC30678f.BLUETOOTH;
        }
        return EnumC30678f.DEFAULT;
    }

    /* renamed from: a */
    private static Object m62961a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5741);
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
                    MethodCollector.m26664o(5741);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
