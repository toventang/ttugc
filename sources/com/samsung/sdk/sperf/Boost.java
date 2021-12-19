package com.samsung.sdk.sperf;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* access modifiers changed from: package-private */
public class Boost {
    private static boolean isLoadLib;

    static {
        Covode.recordClassIndex(35070);
    }

    Boost() {
    }

    /* renamed from: com_samsung_sdk_sperf_Boost_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m57959xcd400c47(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38962a(str);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static boolean init() {
        if (isLoadLib) {
            return true;
        }
        try {
            m57959xcd400c47("perfsdk.performance.samsung");
            isLoadLib = true;
        } catch (UnsatisfiedLinkError e) {
            SPerfUtil.log("ERROR : Library load fail.. not exist or check permission");
            e.printStackTrace();
        } catch (Exception e2) {
            SPerfUtil.log("Library has problem");
            e2.printStackTrace();
        }
        return isLoadLib;
        isLoadLib = false;
        return isLoadLib;
    }

    public static native int releaseBoost();

    public static native int releaseBoost(int i);

    public static int releaseNativeBoost() {
        int defaultLevel;
        MethodCollector.m26663i(5394);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.m26664o(5394);
            return -1;
        }
        releaseBoost();
        SPerfUtil.log("release all boost");
        int i = 0;
        do {
            BoostResource boostResource = BoostLevelControl.getBoostResource(i);
            if (!(boostResource == null || (defaultLevel = boostResource.getDefaultLevel()) == 64532198)) {
                int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i);
                if (CustomParams.getBoostType(i) == 1) {
                    requestBoost(i, realBoostLevel, PerformanceManager.getPid());
                } else {
                    requestBoost(i, realBoostLevel, 0);
                }
            }
            i++;
        } while (i < 11);
        MethodCollector.m26664o(5394);
        return 0;
    }

    public static int releaseNativeBoost(int i, int i2) {
        MethodCollector.m26663i(5396);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.m26664o(5396);
            return -1;
        }
        BoostResource boostResource = BoostLevelControl.getBoostResource(i);
        if (boostResource == null) {
            MethodCollector.m26664o(5396);
            return -1;
        }
        int defaultLevel = boostResource.getDefaultLevel();
        if (defaultLevel == 64532198) {
            releaseBoost(i);
        } else {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(defaultLevel, i);
            if (i2 < 0) {
                requestBoost(i, realBoostLevel, 0);
            } else {
                requestBoost(i, realBoostLevel, i2);
            }
        }
        SPerfUtil.log("release all boost");
        MethodCollector.m26664o(5396);
        return 0;
    }

    public static native int requestBoost(int i, int i2, int i3);

    public static int requestNativeBoost(BoostObject boostObject) {
        MethodCollector.m26663i(5516);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.m26664o(5516);
            return -1;
        }
        int i = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i);
            int timeout = boostObject.getTimeout(i);
            if (!(realBoostLevel == 64532198 || timeout == 64532198)) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                if (CustomParams.getBoostType(i) == 1) {
                    timeout = PerformanceManager.getPid();
                    SPerfManager.startTaskReleaseHandler(i, timeout);
                }
                requestBoost(i, realBoostLevel, timeout);
            }
            i++;
        } while (i < 11);
        MethodCollector.m26664o(5516);
        return 0;
    }

    public static int requestNativeBoostForProcess(BoostObject boostObject) {
        MethodCollector.m26663i(5628);
        if (!isLoadLib) {
            SPerfUtil.log("ERR : Native Library load Fail... request boost not available");
            MethodCollector.m26664o(5628);
            return -1;
        }
        int i = 0;
        do {
            int realBoostLevel = BoostLevelControl.getRealBoostLevel(boostObject, i);
            int timeout = boostObject.getTimeout(i);
            if (!(realBoostLevel == 64532198 || timeout == 64532198)) {
                if (timeout == 99999999) {
                    timeout = -1;
                }
                SPerfUtil.log("acquire boost - type : " + i + "   value : " + realBoostLevel + "   timeouts : " + timeout);
                requestBoost(i, realBoostLevel, timeout);
            }
            i++;
        } while (i < 11);
        MethodCollector.m26664o(5628);
        return 0;
    }

    public static int setNativePkgName(String str) {
        int i;
        MethodCollector.m26663i(5631);
        if (str == null) {
            SPerfUtil.log("ERR : PkgName is Null.. check it again");
            i = -1;
        } else {
            setPkgName(str);
            SPerfUtil.log("Unique Pkg Name set : " + str);
            i = 0;
        }
        MethodCollector.m26664o(5631);
        return i;
    }

    public static native int setPkgName(String str);
}
