package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.p */
public final class C7498p extends AbstractC7501r<AbstractC7499a> implements OnMessageListener {

    /* renamed from: a */
    public final boolean f18618a;

    /* renamed from: b */
    public final Room f18619b;

    /* renamed from: c */
    private boolean f18620c = LiveBannerExperiment.isNewBannerEnable();

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.p$a */
    public interface AbstractC7499a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8269);
        }

        /* renamed from: a */
        void mo13746a(C9603ag agVar);
    }

    static {
        Covode.recordClassIndex(8268);
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7499a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        if (this.f18625x != null) {
            this.f18625x.addMessageListener(EnumC9596a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (this.f38654y != null && (iMessage instanceof C9603ag)) {
            int i = ((C9603ag) iMessage).f23311f;
            if (i == 2 || i == 5 || (i == 1 && this.f18620c)) {
                ((AbstractC7499a) this.f38654y).mo13746a((C9603ag) iMessage);
            }
        }
    }

    public C7498p(Room room, boolean z) {
        this.f18619b = room;
        this.f18618a = z;
    }
}
