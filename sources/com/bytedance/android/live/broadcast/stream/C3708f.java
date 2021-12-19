package com.bytedance.android.live.broadcast.stream;

import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.stream.f */
public final class C3708f {
    static {
        Covode.recordClassIndex(4221);
    }

    /* renamed from: a */
    private static final long m9211a() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            return b.mo13161c();
        }
        return 0;
    }

    /* renamed from: a */
    public static final void m9212a(String str) {
        C3051c.C3052a.m8359a("ttlive_broadcast_action_all").mo12637b("action", str).mo12636b("user_id", Long.valueOf(m9211a())).mo12632a();
    }
}
