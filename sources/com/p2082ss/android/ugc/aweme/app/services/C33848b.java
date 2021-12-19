package com.p2082ss.android.ugc.aweme.app.services;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.boost_multidex.BoostMultiDex;
import com.bytedance.boost_multidex.Monitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.application.C33914o;

/* renamed from: com.ss.android.ugc.aweme.app.services.b */
public final class C33848b {
    static {
        Covode.recordClassIndex(40761);
    }

    /* renamed from: a */
    public static boolean m69285a(Application application) {
        if (Build.VERSION.SDK_INT > 19) {
            return false;
        }
        String b = C29843f.m60132b(application);
        if (BoostMultiDex.isOptimizeProcess(b)) {
            return true;
        }
        BoostMultiDex.install(application, new Monitor() {
            /* class com.p2082ss.android.ugc.aweme.app.services.C33848b.C338491 */

            static {
                Covode.recordClassIndex(40762);
            }

            @Override // com.bytedance.boost_multidex.Monitor
            public final void loadLibrary(String str) {
                if (C33914o.f80220b.get(str) == null) {
                    Librarian.m38964a(str, false, (Context) null);
                }
            }
        }.setProcessName(b));
        return false;
    }
}
