package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.live.p379n.C5791w;
import com.bytedance.android.livesdk.model.message.C9724cg;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.p1114a.AbstractC16043b;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.q */
public final class C7500q extends AbstractC16043b<AbstractC16042a> implements OnMessageListener {

    /* renamed from: a */
    private IMessageManager f18621a;

    /* renamed from: b */
    private DataChannel f18622b;

    static {
        Covode.recordClassIndex(8270);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        IMessageManager iMessageManager = this.f18621a;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public C7500q(DataChannel dataChannel) {
        this.f18622b = dataChannel;
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: a */
    public final void mo10297a(AbstractC16042a aVar) {
        super.mo10297a(aVar);
        IMessageManager iMessageManager = (IMessageManager) this.f18622b.mo28318b(C9068cg.class);
        this.f18621a = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.USER_STATS.getIntType(), this);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C9724cg cgVar;
        if (iMessage != null && (cgVar = (C9724cg) iMessage) != null && cgVar.f23715f == C11115u.m19743a().mo17915b().mo13161c() && 1 == cgVar.f23716g) {
            C11115u.m19743a().mo17915b().mo13169i().mo116431a_(new C6873g());
            this.f18622b.mo28319c(C5791w.class);
        }
    }
}
