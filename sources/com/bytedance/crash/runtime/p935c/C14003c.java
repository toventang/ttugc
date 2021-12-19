package com.bytedance.crash.runtime.p935c;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C14031r;
import com.bytedance.crash.util.C14075v;

/* renamed from: com.bytedance.crash.runtime.c.c */
public final class C14003c extends AbstractRunnableC14001a {
    static {
        Covode.recordClassIndex(16068);
    }

    public final void run() {
        C14031r b = C13933m.m25226b();
        if (TextUtils.isEmpty(b.f34192a) || "0".equals(b.f34192a)) {
            String c = C13933m.m25221a().mo22520c();
            if (TextUtils.isEmpty(c) || "0".equals(c)) {
                mo22515a(this.f34135a);
                C14075v.m25650a("[DeviceIdTask] did is null, continue check.");
                return;
            }
            C13933m.m25226b().mo22550a(c);
            C14075v.m25650a("[DeviceIdTask] did is ".concat(String.valueOf(c)));
        }
    }

    public C14003c(Handler handler) {
        super(handler, 5000);
    }
}
