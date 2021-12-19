package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableSingleLooperPlayerPullStreamSetting;
import com.bytedance.android.livesdk.p442ai.p444b.AbstractC6713a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ai.m */
public final class C6740m implements AbstractC6723f {
    static {
        Covode.recordClassIndex(7478);
    }

    @Override // com.bytedance.android.livesdk.p442ai.AbstractC6723f
    /* renamed from: a */
    public final AbstractC6724g mo12876a(Context context, AbstractC6713a aVar) {
        C6757z zVar = new C6757z(context);
        zVar.f16787b = false;
        zVar.f16790e = aVar;
        if (EnableSingleLooperPlayerPullStreamSetting.INSTANCE.getValue()) {
            return new C6752v(zVar);
        }
        return new C6751u(zVar);
    }
}
