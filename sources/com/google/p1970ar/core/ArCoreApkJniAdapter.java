package com.google.p1970ar.core;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.ArCoreApk;
import com.google.p1970ar.core.exceptions.ResourceExhaustedException;
import com.google.p1970ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p1970ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p1970ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p1970ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
class ArCoreApkJniAdapter {

    /* renamed from: a */
    private static final Map<Class<? extends Throwable>, Integer> f64063a;

    ArCoreApkJniAdapter() {
    }

    static {
        Covode.recordClassIndex(32565);
        HashMap hashMap = new HashMap();
        f64063a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(EnumC27098g.ERROR_INVALID_ARGUMENT.f64150G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(EnumC27098g.ERROR_RESOURCE_EXHAUSTED.f64150G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(EnumC27098g.UNAVAILABLE_ARCORE_NOT_INSTALLED.f64150G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(EnumC27098g.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f64150G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(EnumC27098g.UNAVAILABLE_APK_TOO_OLD.f64150G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(EnumC27098g.UNAVAILABLE_SDK_TOO_OLD.f64150G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(EnumC27098g.UNAVAILABLE_USER_DECLINED_INSTALLATION.f64150G));
    }

    /* renamed from: a */
    private static int m53827a(Throwable th) {
        Class<?> cls = th.getClass();
        Map<Class<? extends Throwable>, Integer> map = f64063a;
        if (map.containsKey(cls)) {
            return map.get(cls).intValue();
        }
        return EnumC27098g.ERROR_FATAL.f64150G;
    }

    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            m53827a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return EnumC27098g.SUCCESS.f64150G;
        } catch (Throwable th) {
            return m53827a(th);
        }
    }

    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return EnumC27098g.SUCCESS.f64150G;
        } catch (Throwable th) {
            return m53827a(th);
        }
    }
}
