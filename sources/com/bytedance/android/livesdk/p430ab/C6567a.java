package com.bytedance.android.livesdk.p430ab;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.ab.a */
public final class C6567a implements OnMessageListener {

    /* renamed from: a */
    public AbstractC3063c f16438a;

    /* renamed from: b */
    private final C10935a f16439b;

    /* renamed from: c */
    private final Room f16440c;

    static {
        Covode.recordClassIndex(7303);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9688bt) {
            C9688bt btVar = (C9688bt) iMessage;
            if (btVar.f28131L == EnumC9596a.REMIND && 5 == btVar.f23579f) {
                if (this.f16438a == null) {
                    this.f16438a = ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createCoverController(this.f16439b, this.f16440c);
                }
                this.f16438a.mo8327a(btVar);
            }
        }
    }

    public C6567a(C10935a aVar, DataChannel dataChannel) {
        this.f16439b = aVar;
        this.f16440c = (Room) dataChannel.mo28318b(C9093de.class);
        IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.REMIND.getIntType(), this);
        }
    }
}
