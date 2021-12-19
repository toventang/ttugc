package com.p2082ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.vesdk.C85315al;

/* renamed from: com.ss.android.medialib.VideoSdkCore */
public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT = null;
    private static final String TAG = VideoSdkCore.class.getSimpleName();
    private static boolean inited = false;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    private static native String nativeGetString(String str);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetBoolean(String str, boolean z);

    private static native void nativeSetInt(String str, int i);

    private static native void nativeSetString(String str, String str2);

    public static String getSdkVersionCode() {
        MethodCollector.m26663i(3102);
        String nativeGetString = nativeGetString("VersionCode");
        MethodCollector.m26664o(3102);
        return nativeGetString;
    }

    public static String getSdkVersionName() {
        MethodCollector.m26663i(3100);
        String nativeGetString = nativeGetString("VersionName");
        MethodCollector.m26664o(3100);
        return nativeGetString;
    }

    static {
        Covode.recordClassIndex(36425);
        C30731d.m63118c();
    }

    /* renamed from: com_ss_android_medialib_VideoSdkCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m60494x38acfc77(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        MethodCollector.m26663i(3091);
        nativeSetBoolean("enableEffectAudioManagerCallback", z);
        MethodCollector.m26664o(3091);
    }

    public static void enableGLES3(boolean z) {
        MethodCollector.m26663i(2726);
        nativeSetBoolean("GLES3", z);
        MethodCollector.m26664o(2726);
    }

    public static void enableMakeupSegmentation(boolean z) {
        MethodCollector.m26663i(2967);
        nativeSetBoolean("enableMakeupSegmentation", z);
        MethodCollector.m26664o(2967);
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        MethodCollector.m26663i(3096);
        nativeSetBoolean("ABbUseBuildinAmazing", z);
        MethodCollector.m26664o(3096);
    }

    public static void setAmazingShareDir(String str) {
        MethodCollector.m26663i(2796);
        nativeSetString("AmazingShareDir", str);
        MethodCollector.m26664o(2796);
    }

    public static void setEffectJsonConfig(String str) {
        MethodCollector.m26663i(3095);
        nativeSetString("EffectJsonConfig", str);
        MethodCollector.m26664o(3095);
    }

    public static void setEffectLogLevel(int i) {
        MethodCollector.m26663i(2865);
        nativeSetInt("EffectLogLevel", i);
        MethodCollector.m26664o(2865);
    }

    public static void setEffectMaxMemoryCache(int i) {
        MethodCollector.m26663i(2871);
        nativeSetInt("EffectMaxMemoryCache", i);
        MethodCollector.m26664o(2871);
    }

    public static void setEnableAssetManager(boolean z) {
        MethodCollector.m26663i(3098);
        nativeSetBoolean("AssertManagerEnable", z);
        MethodCollector.m26664o(3098);
    }

    public static void setProduct(int i) {
        MethodCollector.m26663i(2725);
        nativeSetInt("Product", i);
        MethodCollector.m26664o(2725);
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C85315al.m146642d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j);
        }
        C85315al.m146642d(TAG, "Error call finder related interface.");
        return 0;
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C85315al.m146642d(TAG, "getNativeFinder effectHandler is null");
            return;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder == null) {
            C85315al.m146642d(TAG, "Error call finder related interface.");
        } else {
            resourceFinder.release(j);
        }
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        MethodCollector.m26663i(2792);
        sFinder = resourceFinder;
        nativeSetBoolean("ResourceFinderEnable", true);
        MethodCollector.m26664o(2792);
    }

    public static void init(Context context) {
        MethodCollector.m26663i(2724);
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                try {
                    if (!inited) {
                        APPLICATION_CONTEXT = m60494x38acfc77(context);
                        nativeSetAssertManagerFromJava(context.getAssets());
                        inited = true;
                    }
                } finally {
                    MethodCollector.m26664o(2724);
                }
            }
            return;
        }
        MethodCollector.m26664o(2724);
    }
}
