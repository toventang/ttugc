package com.bytedance.vcloud.strategy;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class StrategyCenterJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;

    /* renamed from: com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m44279x68b034eb(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(27641);
    }

    public static synchronized void loadLibrary() {
        synchronized (StrategyCenterJniLoader.class) {
            MethodCollector.m26663i(12271);
            try {
                if (!isLibraryLoaded) {
                    m44278x474d4e0d("preload");
                    isLibraryLoaded = true;
                }
                MethodCollector.m26664o(12271);
            } catch (Throwable th) {
                exception = th.toString();
                m44279x68b034eb("VCStrategy", "load so fail. " + exception);
                MethodCollector.m26664o(12271);
            }
        }
    }

    /* renamed from: com_bytedance_vcloud_strategy_StrategyCenterJniLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m44278x474d4e0d(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }
}
