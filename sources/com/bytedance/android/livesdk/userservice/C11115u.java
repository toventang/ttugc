package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.userservice.u */
public class C11115u {

    /* renamed from: a */
    private static volatile C11115u f26722a;

    /* renamed from: b */
    private AbstractC6872f f26723b;

    static {
        Covode.recordClassIndex(12738);
    }

    private C11115u() {
    }

    /* renamed from: b */
    public final AbstractC6872f mo17915b() {
        if (this.f26723b == null) {
            this.f26723b = new C11092c((IHostUser) C6193a.m13435a(IHostUser.class));
        }
        return this.f26723b;
    }

    /* renamed from: a */
    public static C11115u m19743a() {
        MethodCollector.m26663i(12025);
        if (f26722a == null) {
            synchronized (C11115u.class) {
                try {
                    if (f26722a == null) {
                        f26722a = new C11115u();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12025);
                    throw th;
                }
            }
        }
        C11115u uVar = f26722a;
        MethodCollector.m26664o(12025);
        return uVar;
    }
}
