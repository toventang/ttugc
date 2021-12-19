package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.firstrecharge.C8741f;
import com.bytedance.android.livesdk.firstrecharge.C8742g;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.service.C10695b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ay */
public final class C11479ay implements OnMessageListener {

    /* renamed from: a */
    public IMessageManager f27541a;

    /* renamed from: b */
    public DataChannel f27542b;

    static {
        Covode.recordClassIndex(13138);
    }

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ay$a */
    public static final class C11480a extends AbstractC8807b {
        static {
            Covode.recordClassIndex(13139);
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: a */
        public final void mo8519a(List<C9904t> list) {
        }

        C11480a() {
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: b */
        public final void mo8520b(List<GiftPage> list) {
            super.mo8520b(list);
            if (C8729d.f21542u.mo15005a(list)) {
                C8729d.f21542u.mo15001a();
                C6779a.m14563a().mo13053a(new C8742g());
                C8729d.f21542u.mo15015k();
                C6779a.m14563a().mo13053a(new C10695b());
                ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
                C6779a.m14563a().mo13053a(new C8741f());
                C8740e.m17061b(C8374a.C8375a.C8376a.f20718a.f20711e);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        boolean z;
        Room room;
        Room room2;
        C8729d.f21542u.mo15008c();
        GiftManager inst = GiftManager.inst();
        C11480a aVar = new C11480a();
        DataChannel dataChannel = this.f27542b;
        long j2 = 0;
        if (dataChannel == null || (room2 = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room2.getId();
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        DataChannel dataChannel2 = this.f27542b;
        if (!(dataChannel2 == null || (room = (Room) dataChannel2.mo28318b(C9093de.class)) == null)) {
            j2 = room.getOwnerUserId();
        }
        if (c == j2) {
            z = true;
        } else {
            z = false;
        }
        inst.syncGiftList(aVar, j, 5, z);
    }
}
