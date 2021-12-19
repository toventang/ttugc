package com.p2082ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85615x;

/* renamed from: com.ss.android.vesdk.runtime.VEEffectConfig */
public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static String sCacheDir = "";
    private static AssetManager sEffectAssetManager = null;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeEnableAlgoParamisForce(boolean z, boolean z2);

    private static native void nativeEnableEffectAudioManagerCallback(boolean z);

    private static native void nativeEnableEffectRT(boolean z);

    private static native void nativeEnableMakeupSegmentation(boolean z);

    private static native String nativeGetABConfigList();

    private static native void nativeSetABConfigValue(String str, boolean z, int i, float f, String str2, int i2);

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetCacheDir(String str);

    private static native void nativeSetEffectAsynAPI(boolean z);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetEffectSyncTimeDomain(boolean z);

    private static native void nativeSetEnableStickerAmazing(boolean z);

    private static native void nativeSetShareDir(String str);

    private static native void nativeUseNewEffectAlgorithmApi(boolean z);

    private static native void nativesetEnableStickerReleaseTexture(boolean z);

    public static String getCacheDir() {
        return sCacheDir;
    }

    public static String getABConfigList() {
        MethodCollector.m26663i(4808);
        String nativeGetABConfigList = nativeGetABConfigList();
        MethodCollector.m26664o(4808);
        return nativeGetABConfigList;
    }

    static {
        Covode.recordClassIndex(99713);
        C30731d.m63114a();
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        MethodCollector.m26663i(1542);
        nativeEnableEffectAudioManagerCallback(z);
        MethodCollector.m26664o(1542);
    }

    public static boolean enableEffectRT(boolean z) {
        MethodCollector.m26663i(4697);
        nativeEnableEffectRT(z);
        MethodCollector.m26664o(4697);
        return true;
    }

    public static void enableMakeupSegmentation(boolean z) {
        MethodCollector.m26663i(1539);
        nativeEnableMakeupSegmentation(z);
        MethodCollector.m26664o(1539);
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        MethodCollector.m26663i(4695);
        nativeSetABbUseBuildinAmazing(z);
        MethodCollector.m26664o(4695);
        return true;
    }

    public static void setCacheDir(String str) {
        MethodCollector.m26663i(4599);
        sCacheDir = str;
        nativeSetCacheDir(str);
        MethodCollector.m26664o(4599);
    }

    public static void setEffectAsynAPI(boolean z) {
        MethodCollector.m26663i(4795);
        nativeSetEffectAsynAPI(z);
        MethodCollector.m26664o(4795);
    }

    public static void setEffectForceDetectFace(boolean z) {
        MethodCollector.m26663i(4710);
        nativeSetEffectForceDetectFace(z);
        MethodCollector.m26664o(4710);
    }

    public static boolean setEffectJsonConfig(String str) {
        MethodCollector.m26663i(4692);
        nativeSetEffectJsonConfig(str);
        MethodCollector.m26664o(4692);
        return true;
    }

    public static boolean setEffectLogLevel(int i) {
        MethodCollector.m26663i(4604);
        nativeSetEffectLogLevel(i);
        MethodCollector.m26664o(4604);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i) {
        MethodCollector.m26663i(4607);
        nativeSetEffectMaxMemoryCache(i);
        MethodCollector.m26664o(4607);
        return true;
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        MethodCollector.m26663i(4714);
        nativeSetEffectSyncTimeDomain(z);
        MethodCollector.m26664o(4714);
    }

    public static void setEnableStickerAmazing(boolean z) {
        MethodCollector.m26663i(4717);
        nativeSetEnableStickerAmazing(z);
        MethodCollector.m26664o(4717);
    }

    public static void setEnableStickerReleaseTexture(boolean z) {
        MethodCollector.m26663i(4781);
        nativesetEnableStickerReleaseTexture(z);
        MethodCollector.m26664o(4781);
    }

    public static boolean setShareDir(String str) {
        MethodCollector.m26663i(4602);
        nativeSetShareDir(str);
        MethodCollector.m26664o(4602);
        return true;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        MethodCollector.m26663i(1535);
        nativeUseNewEffectAlgorithmApi(z);
        MethodCollector.m26664o(1535);
    }

    public static long getNativeFinder(long j) {
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j);
        }
        throw new C85615x(-1, "Error call finder related interface.");
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C85315al.m146642d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            C85315al.m146637a(TAG, "getNativeFinder effectHandler " + sFinder.getClass().getCanonicalName());
            sFinder.release(j);
        } else {
            throw new C85615x(-1, "Error call finder related interface.");
        }
    }

    public static void enableAlgoParamIsForce(boolean z, boolean z2) {
        MethodCollector.m26663i(4891);
        nativeEnableAlgoParamisForce(z, z2);
        MethodCollector.m26664o(4891);
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        MethodCollector.m26663i(4707);
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
        MethodCollector.m26664o(4707);
    }

    public static void setABConfigValue(String str, Object obj, int i) {
        MethodCollector.m26663i(4885);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (obj instanceof String)) {
                        nativeSetABConfigValue(str, false, 0, 0.0f, (String) obj, 3);
                    }
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeSetABConfigValue(str, false, 0, ((Number) obj).floatValue(), null, 2);
                    MethodCollector.m26664o(4885);
                    return;
                }
            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                nativeSetABConfigValue(str, false, ((Number) obj).intValue(), 0.0f, null, 1);
                MethodCollector.m26664o(4885);
                return;
            }
        } else if (obj instanceof Boolean) {
            nativeSetABConfigValue(str, ((Boolean) obj).booleanValue(), 0, 0.0f, null, 0);
            MethodCollector.m26664o(4885);
            return;
        }
        MethodCollector.m26664o(4885);
    }
}
