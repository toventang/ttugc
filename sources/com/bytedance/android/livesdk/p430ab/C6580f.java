package com.bytedance.android.livesdk.p430ab;

import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.ab.f */
public final class C6580f implements OnMessageListener {

    /* renamed from: a */
    AbstractC6572c f16460a;

    static {
        Covode.recordClassIndex(7316);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC6572c cVar = this.f16460a;
        if (cVar != null) {
            cVar.mo12733a((AbstractC6571a) iMessage);
        }
    }
}
