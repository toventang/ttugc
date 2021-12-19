package com.adm.push;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adm.push.b */
final class C1882b {
    static {
        Covode.recordClassIndex(2056);
    }

    /* renamed from: a */
    static boolean m6062a(Context context) {
        boolean z;
        MethodCollector.m26663i(13334);
        try {
            InputStream open = context.getAssets().open("api_key.txt");
            z = true;
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        } catch (Throwable th) {
            MethodCollector.m26664o(13334);
            throw th;
        }
        MethodCollector.m26664o(13334);
        return z;
    }
}
