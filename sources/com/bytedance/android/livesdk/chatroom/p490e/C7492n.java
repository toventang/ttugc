package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.model.message.C9887q;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.n */
public final class C7492n extends AbstractC7501r<AbstractC7493a> implements OnMessageListener {

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.n$a */
    public interface AbstractC7493a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8263);
        }

        /* renamed from: a */
        void mo13741a(C9887q qVar);
    }

    static {
        Covode.recordClassIndex(8262);
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7493a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo10297a((AbstractC8094bq) aVar);
        IMessageManager iMessageManager = this.f18625x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.DONATION_INFO.getIntType(), this);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C89219l.m154721d(iMessage, "");
        if ((iMessage instanceof AbstractC6571a) && ((C11777a) iMessage).f28131L == EnumC9596a.DONATION_INFO) {
            C9887q qVar = (C9887q) iMessage;
            AbstractC7493a aVar = (AbstractC7493a) this.f38654y;
            if (aVar != null) {
                aVar.mo13741a(qVar);
            }
        }
    }
}
