package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.chatroom.view.AbstractC7962a;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.k */
public final class C7487k implements OnMessageListener {

    /* renamed from: a */
    private AbstractC7962a f18599a;

    /* renamed from: b */
    private DataChannel f18600b;

    /* renamed from: c */
    private IMessageManager f18601c;

    static {
        Covode.recordClassIndex(8257);
    }

    /* renamed from: a */
    public final void mo13727a() {
        IMessageManager iMessageManager = this.f18601c;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f18599a = null;
    }

    public C7487k(DataChannel dataChannel) {
        this.f18600b = dataChannel;
    }

    /* renamed from: a */
    public final void mo13728a(AbstractC7962a aVar) {
        this.f18599a = aVar;
        IMessageManager iMessageManager = (IMessageManager) this.f18600b.mo28318b(C9068cg.class);
        this.f18601c = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.CONTROL.getIntType(), this);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AbstractC7962a aVar = this.f18599a;
        if (aVar != null) {
            aVar.mo13943a((C9883n) iMessage);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(((C9883n) iMessage).f23882a));
        C3868c.m9491a("ttlive_control_message_status", 1, hashMap);
    }
}
