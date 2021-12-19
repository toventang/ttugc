package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.share.AbstractC6108b;
import com.bytedance.android.livesdk.model.message.C9719cc;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p561j.C9099dk;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.share.e */
public final class C10770e implements AbstractC6108b, OnMessageListener {

    /* renamed from: a */
    private DataChannel f25934a;

    /* renamed from: b */
    private IMessageManager f25935b;

    static {
        Covode.recordClassIndex(12370);
    }

    @Override // com.bytedance.android.live.share.AbstractC6108b
    /* renamed from: a */
    public final void mo11992a() {
        IMessageManager iMessageManager = this.f25935b;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f25935b = null;
        this.f25934a = null;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage instanceof C9719cc) {
            C9719cc ccVar = (C9719cc) iMessage;
            if (ccVar.f23687a == 3 && (dataChannel = this.f25934a) != null) {
                dataChannel.mo28315b(C9099dk.class, Integer.valueOf(ccVar.f23692j));
            }
        }
    }

    @Override // com.bytedance.android.live.share.AbstractC6108b
    /* renamed from: a */
    public final void mo11993a(DataChannel dataChannel, IMessageManager iMessageManager, int i) {
        C89219l.m154721d(dataChannel, "");
        dataChannel.mo28315b(C9099dk.class, Integer.valueOf(i));
        this.f25934a = dataChannel;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.SOCIAL.getIntType(), this);
            this.f25935b = iMessageManager;
        }
    }
}
