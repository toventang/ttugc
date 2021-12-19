package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ttnet.p1703d.C22944d;

/* renamed from: com.bytedance.android.livesdk.aa */
public final class C6496aa {

    /* renamed from: a */
    public static final C6496aa f16143a = new C6496aa();

    private C6496aa() {
    }

    static {
        Covode.recordClassIndex(7232);
    }

    /* renamed from: a */
    public static final Object m13886a() {
        if (LiveMessageTimeoutSetting.INSTANCE.getHttpFetchRequestTimeout() <= 0) {
            return null;
        }
        C22944d dVar = new C22944d();
        dVar.f35406i = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchRequestTimeout();
        return dVar;
    }
}
