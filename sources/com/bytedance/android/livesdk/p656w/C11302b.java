package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMtIgnoreRoomCheckSetting;
import com.bytedance.android.livesdk.model.message.C9601ae;
import com.bytedance.android.livesdk.model.message.C9620at;
import com.bytedance.android.livesdk.model.message.C9625ax;
import com.bytedance.android.livesdk.model.message.C9892v;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.w.b */
public final class C11302b implements IInterceptor {

    /* renamed from: a */
    private long f27034a;

    static {
        Covode.recordClassIndex(12939);
    }

    public C11302b(long j) {
        this.f27034a = j;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        AbstractC6571a aVar = (AbstractC6571a) iMessage;
        if ((aVar instanceof C9620at) && aVar.f28134O != null) {
            ((C9620at) aVar).f28134O.f28137c = this.f27034a;
            return false;
        } else if ((aVar instanceof C9601ae) || (aVar instanceof C9625ax) || (aVar instanceof C9892v) || LiveMtIgnoreRoomCheckSetting.INSTANCE.getValue() || aVar.f28134O == null || aVar.f28134O.f28137c == this.f27034a) {
            return false;
        } else {
            return true;
        }
    }
}
