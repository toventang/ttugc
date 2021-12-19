package com.p2082ss.android.p2140di.push;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.awemepushapi.IPushApi;
import com.p2082ss.android.ugc.awemepushlib.interaction.PushService;

/* renamed from: com.ss.android.di.push.a */
public final class C29902a {
    static {
        Covode.recordClassIndex(36313);
    }

    /* renamed from: a */
    public static IPushApi m60273a() {
        IPushApi iPushApi;
        try {
            iPushApi = PushService.createIPushApibyMonsterPlugin(false);
        } catch (Exception unused) {
            iPushApi = null;
        }
        if (iPushApi == null) {
            return new PushServiceMock();
        }
        return iPushApi;
    }
}
