package com.bytedance.vcloud.mlcomponent_api;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class MLEngineImpLoader {
    public static volatile String exception = "";
    public static volatile boolean isPredictTFEngineLibraryLoaded;

    static {
        Covode.recordClassIndex(27609);
    }

    public static synchronized void loadPredictTFEngineLibrary() {
        synchronized (MLEngineImpLoader.class) {
            MethodCollector.m26663i(3283);
            try {
                if (!isPredictTFEngineLibraryLoaded) {
                    try {
                        m44262x725a4e75("tensorflowlite");
                        m44262x725a4e75("networkpredict_tfengine");
                        isPredictTFEngineLibraryLoaded = true;
                    } catch (Throwable th) {
                        exception = th.toString();
                        MethodCollector.m26664o(3283);
                        return;
                    }
                }
                MethodCollector.m26664o(3283);
            } catch (Throwable th2) {
                exception = th2.toString();
                MethodCollector.m26664o(3283);
            }
        }
    }

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLEngineImpLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m44262x725a4e75(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
