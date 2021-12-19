package com.bytedance.vcloud.mlcomponent_api;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class MLComponentJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;

    static {
        Covode.recordClassIndex(27606);
    }

    public static synchronized void loadLibrary() {
        synchronized (MLComponentJniLoader.class) {
            MethodCollector.m26663i(2376);
            try {
                if (!isLibraryLoaded) {
                    m44250x73d6b371("mlcomponent");
                    isLibraryLoaded = true;
                }
                MethodCollector.m26664o(2376);
            } catch (Throwable th) {
                exception = th.toString();
                MethodCollector.m26664o(2376);
            }
        }
    }

    /* renamed from: com_bytedance_vcloud_mlcomponent_api_MLComponentJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m44250x73d6b371(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
