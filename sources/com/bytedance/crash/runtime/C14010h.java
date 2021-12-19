package com.bytedance.crash.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.runtime.h */
public final class C14010h {
    static {
        Covode.recordClassIndex(16075);
    }

    /* renamed from: a */
    public static C14004d m25403a(Context context) {
        return new C14004d(context, new ICommonParams() {
            /* class com.bytedance.crash.runtime.C14010h.C140111 */

            static {
                Covode.recordClassIndex(16076);
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final long getUserId() {
                return 0;
            }

            @Override // com.bytedance.crash.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }
        });
    }
}
