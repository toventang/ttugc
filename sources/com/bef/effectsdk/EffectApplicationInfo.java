package com.bef.effectsdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

public class EffectApplicationInfo {
    private static Context appContext;

    static {
        Covode.recordClassIndex(2666);
    }

    private static native int nativeSetHomeDir(String str);

    public static Context getAppContext() {
        return appContext;
    }

    private static void onSetAppContext() {
        MethodCollector.m26663i(4387);
        Context context = appContext;
        if (context != null) {
            nativeSetHomeDir(m7233x47b588a4(context).getAbsolutePath());
        }
        MethodCollector.m26664o(4387);
    }

    public static void setAppContext(Context context) {
        appContext = context;
        onSetAppContext();
    }

    /* renamed from: com_bef_effectsdk_EffectApplicationInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m7233x47b588a4(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }
}
