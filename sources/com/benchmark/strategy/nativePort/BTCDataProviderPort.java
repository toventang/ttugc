package com.benchmark.strategy.nativePort;

import android.os.Bundle;
import com.benchmark.ByteBenchBundle;
import com.benchmark.port.C2497a;
import com.benchmark.tools.C2512a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BTCDataProviderPort {
    static {
        Covode.recordClassIndex(2879);
    }

    private native void native_clearRepo(int i);

    private native void native_closeRepo(int i);

    private native boolean native_deleteRepo(int i);

    private native void native_dumpRepo(int i);

    private native boolean native_getBoolean(int i, String str, boolean z);

    private native int native_getDeviceFeature(int i, long j);

    private native float native_getFloat(int i, String str, float f);

    private native int native_getInt(int i, String str, int i2);

    private native long native_getLong(int i, String str, long j);

    private native String native_getString(int i, String str);

    private native int native_init(String str);

    private native void native_isOpenRuntimeDecision(boolean z);

    private native void native_openRepo(int i);

    private native void native_storeBoolean(int i, String str, boolean z, boolean z2);

    private native void native_storeFloat(int i, String str, boolean z, float f);

    private native void native_storeInt(int i, String str, boolean z, int i2);

    private native void native_storeLong(int i, String str, boolean z, long j);

    private native void native_storeString(int i, String str, boolean z, String str2);

    private boolean ifEnableNativeEnvironment() {
        return C2512a.f7621a;
    }

    /* renamed from: com.benchmark.strategy.nativePort.BTCDataProviderPort$1 */
    static /* synthetic */ class C25111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7620a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 2880(0xb40, float:4.036E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.benchmark.port.a$a[] r0 = com.benchmark.port.C2497a.EnumC2498a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.benchmark.strategy.nativePort.BTCDataProviderPort.C25111.f7620a = r2
                com.benchmark.port.a$a r0 = com.benchmark.port.C2497a.EnumC2498a.INT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.C25111.f7620a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.benchmark.port.a$a r0 = com.benchmark.port.C2497a.EnumC2498a.FLOAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.C25111.f7620a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.benchmark.port.a$a r0 = com.benchmark.port.C2497a.EnumC2498a.STRING     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.C25111.f7620a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.benchmark.port.a$a r0 = com.benchmark.port.C2497a.EnumC2498a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.strategy.nativePort.BTCDataProviderPort.C25111.<clinit>():void");
        }
    }

    public void clearRepo(int i) {
        MethodCollector.m26663i(10292);
        if (ifEnableNativeEnvironment()) {
            native_clearRepo(i);
        }
        MethodCollector.m26664o(10292);
    }

    public void closeRepo(int i) {
        MethodCollector.m26663i(9973);
        if (ifEnableNativeEnvironment()) {
            native_closeRepo(i);
        }
        MethodCollector.m26664o(9973);
    }

    public Boolean deleteRepo(int i) {
        MethodCollector.m26663i(10127);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10127);
            return false;
        }
        Boolean valueOf = Boolean.valueOf(native_deleteRepo(i));
        MethodCollector.m26664o(10127);
        return valueOf;
    }

    public void dumpRepo(int i) {
        MethodCollector.m26663i(10293);
        if (ifEnableNativeEnvironment()) {
            native_dumpRepo(i);
        }
        MethodCollector.m26664o(10293);
    }

    public int init(String str) {
        MethodCollector.m26663i(9675);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(9675);
            return -1;
        }
        int native_init = native_init(str);
        MethodCollector.m26664o(9675);
        return native_init;
    }

    public void isOpenRuntimeDecision(boolean z) {
        MethodCollector.m26663i(9824);
        if (ifEnableNativeEnvironment()) {
            native_isOpenRuntimeDecision(z);
        }
        MethodCollector.m26664o(9824);
    }

    public void openRepo(int i) {
        MethodCollector.m26663i(9826);
        if (ifEnableNativeEnvironment()) {
            native_openRepo(i);
        }
        MethodCollector.m26664o(9826);
    }

    public String getString(int i, String str) {
        MethodCollector.m26663i(10444);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10444);
            return null;
        }
        String native_getString = native_getString(i, str);
        MethodCollector.m26664o(10444);
        return native_getString;
    }

    public boolean getBoolean(int i, String str, boolean z) {
        MethodCollector.m26663i(10889);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10889);
            return z;
        }
        boolean native_getBoolean = native_getBoolean(i, str, z);
        MethodCollector.m26664o(10889);
        return native_getBoolean;
    }

    public float getFloat(int i, String str, float f) {
        MethodCollector.m26663i(10743);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10743);
            return f;
        }
        float native_getFloat = native_getFloat(i, str, f);
        MethodCollector.m26664o(10743);
        return native_getFloat;
    }

    public int getInt(int i, String str, int i2) {
        MethodCollector.m26663i(10603);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10603);
            return i2;
        }
        int native_getInt = native_getInt(i, str, i2);
        MethodCollector.m26664o(10603);
        return native_getInt;
    }

    public long getLong(int i, String str, long j) {
        MethodCollector.m26663i(10742);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(10742);
            return j;
        }
        long native_getLong = native_getLong(i, str, j);
        MethodCollector.m26664o(10742);
        return native_getLong;
    }

    public void getDeviceFeature(int i, C2497a[] aVarArr, Bundle bundle) {
        MethodCollector.m26663i(11037);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11037);
            return;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        native_getDeviceFeature(i, obtain.getHandle());
        for (C2497a aVar : aVarArr) {
            int i2 = C25111.f7620a[aVar.f7580k.ordinal()];
            if (i2 == 1) {
                bundle.putInt(aVar.f7579j, obtain.getInt(aVar.f7579j));
            } else if (i2 == 2) {
                bundle.putFloat(aVar.f7579j, obtain.getFloat(aVar.f7579j));
            } else if (i2 == 3) {
                bundle.putString(aVar.f7579j, obtain.getString(aVar.f7579j));
            } else if (i2 == 4) {
                bundle.putBoolean(aVar.f7579j, obtain.getBool(aVar.f7579j));
            }
        }
        obtain.recycle();
        MethodCollector.m26664o(11037);
    }

    public void storeBoolean(int i, String str, boolean z, boolean z2) {
        MethodCollector.m26663i(11187);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11187);
            return;
        }
        native_storeBoolean(i, str, z, z2);
        MethodCollector.m26664o(11187);
    }

    public void storeFloat(int i, String str, boolean z, float f) {
        MethodCollector.m26663i(11336);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11336);
            return;
        }
        native_storeFloat(i, str, z, f);
        MethodCollector.m26664o(11336);
    }

    public void storeInt(int i, String str, boolean z, int i2) {
        MethodCollector.m26663i(11038);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11038);
            return;
        }
        native_storeInt(i, str, z, i2);
        MethodCollector.m26664o(11038);
    }

    public void storeLong(int i, String str, boolean z, long j) {
        MethodCollector.m26663i(11185);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11185);
            return;
        }
        native_storeLong(i, str, z, j);
        MethodCollector.m26664o(11185);
    }

    public void storeString(int i, String str, boolean z, String str2) {
        MethodCollector.m26663i(11186);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.m26664o(11186);
            return;
        }
        native_storeString(i, str, z, str2);
        MethodCollector.m26664o(11186);
    }
}
