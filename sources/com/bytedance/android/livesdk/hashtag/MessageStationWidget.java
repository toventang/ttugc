package com.bytedance.android.livesdk.hashtag;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.C9599ac;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9024ar;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class MessageStationWidget extends LiveRecyclableWidget implements AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    private IMessageManager f21997a;

    static {
        Covode.recordClassIndex(9815);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f21997a = (IMessageManager) this.dataChannel.mo28318b(C9068cg.class);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager = this.f21997a;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.HASHTAG.getIntType(), this);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C9698b bVar;
        Hashtag hashtag;
        if (iMessage instanceof C9599ac) {
            C9599ac acVar = (C9599ac) iMessage;
            C11778b bVar2 = acVar.f28134O;
            if (!(bVar2 == null || (bVar = bVar2.f28144j) == null || (hashtag = acVar.f23302a) == null)) {
                hashtag.title = C7557c.m15538a(bVar, "").toString();
            }
            Hashtag hashtag2 = acVar.f23302a;
            if (hashtag2 != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C9023aq.class, hashtag2);
                }
                DataChannelGlobal.f42558d.mo28321a(C9024ar.class, hashtag2);
            }
        }
    }
}
