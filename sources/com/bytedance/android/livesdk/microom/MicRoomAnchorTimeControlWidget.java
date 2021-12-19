package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.p379n.C5789u;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.C9532ap;
import com.bytedance.android.livesdk.model.message.C9665bc;
import com.bytedance.android.livesdk.model.message.C9666bd;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;

public final class MicRoomAnchorTimeControlWidget extends LiveRecyclableWidget implements AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    private IMessageManager f23036a;

    /* renamed from: b */
    private Room f23037b;

    /* renamed from: c */
    private AbstractC88412b f23038c;

    /* renamed from: d */
    private AbstractC88412b f23039d;

    static {
        Covode.recordClassIndex(11003);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        AbstractC88412b bVar = this.f23038c;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f23039d;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        IMessageManager iMessageManager = this.f23036a;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    /* renamed from: a */
    public final void mo16304a() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5789u.class, true);
        }
        Room room = this.f23037b;
        if (room != null) {
            ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).setRankEnabled(room.getId(), false);
        }
    }

    /* renamed from: b */
    public final void mo16305b() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5789u.class, false);
        }
        Room room = this.f23037b;
        if (room != null) {
            ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).setRankEnabled(room.getId(), true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAnchorTimeControlWidget$a */
    public static final class C9494a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAnchorTimeControlWidget f23040a;

        static {
            Covode.recordClassIndex(11004);
        }

        C9494a(MicRoomAnchorTimeControlWidget micRoomAnchorTimeControlWidget) {
            this.f23040a = micRoomAnchorTimeControlWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f23040a.mo16305b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAnchorTimeControlWidget$b */
    public static final class C9495b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAnchorTimeControlWidget f23041a;

        static {
            Covode.recordClassIndex(11005);
        }

        C9495b(MicRoomAnchorTimeControlWidget micRoomAnchorTimeControlWidget) {
            this.f23041a = micRoomAnchorTimeControlWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f23041a.mo16304a();
        }
    }

    /* renamed from: a */
    private final void m17792a(long j) {
        AbstractC88412b bVar = this.f23038c;
        if (bVar != null) {
            bVar.dispose();
        }
        long a = j - (C11200a.m19851a() / 1000);
        if (a <= 10) {
            mo16304a();
        } else {
            this.f23038c = AbstractC88979t.m154307b(a - 10, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C9495b(this));
        }
    }

    /* renamed from: b */
    private final void m17793b(long j) {
        AbstractC88412b bVar = this.f23039d;
        if (bVar != null) {
            bVar.dispose();
        }
        long a = j - (C11200a.m19851a() / 1000);
        if (a <= 0) {
            mo16305b();
        } else {
            this.f23039d = AbstractC88979t.m154307b(a, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C9494a(this));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        C9532ap apVar;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) == null) {
            iMessageManager = null;
        } else {
            iMessageManager.addMessageListener(EnumC9596a.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC9596a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this);
        }
        this.f23036a = iMessageManager;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.mo28318b(C9093de.class);
        }
        this.f23037b = room;
        if (room != null && (apVar = room.officialChannelInfo) != null) {
            m17792a(apVar.f23138c);
            m17793b(apVar.f23139d);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Integer num;
        if (iMessage != null) {
            num = Integer.valueOf(iMessage.getIntType());
        } else {
            num = null;
        }
        int intType = EnumC9596a.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getIntType();
        if (num != null && num.intValue() == intType) {
            if (!(iMessage instanceof C9665bc)) {
                iMessage = null;
            }
            C9665bc bcVar = (C9665bc) iMessage;
            if (bcVar != null) {
                m17792a(bcVar.f23520a);
                m17793b(bcVar.f23521f);
                return;
            }
            return;
        }
        int intType2 = EnumC9596a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType();
        if (num != null && num.intValue() == intType2) {
            if (!(iMessage instanceof C9666bd)) {
                iMessage = null;
            }
            C9666bd bdVar = (C9666bd) iMessage;
            if (bdVar != null) {
                m17793b(bdVar.f23522a);
            }
        }
    }
}
