package com.bytedance.android.livesdk.olddialog.p598b;

import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
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

/* renamed from: com.bytedance.android.livesdk.olddialog.b.a */
public final class C9995a implements OnMessageListener {

    /* renamed from: a */
    public AbstractC9996a f24289a;

    /* renamed from: b */
    public IMessageManager f24290b;

    /* renamed from: c */
    public DataChannel f24291c;

    /* renamed from: d */
    public String f24292d = "";

    /* renamed from: com.bytedance.android.livesdk.olddialog.b.a$a */
    public interface AbstractC9996a {
        static {
            Covode.recordClassIndex(11550);
        }

        /* renamed from: e */
        void mo16814e();
    }

    static {
        Covode.recordClassIndex(11549);
    }

    /* renamed from: com.bytedance.android.livesdk.olddialog.b.a$b */
    public static final class C9997b extends AbstractC8807b {

        /* renamed from: a */
        final /* synthetic */ C9995a f24293a;

        static {
            Covode.recordClassIndex(11551);
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: a */
        public final void mo8519a(List<C9904t> list) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9997b(C9995a aVar) {
            this.f24293a = aVar;
        }

        @Override // com.bytedance.android.livesdk.gift.p549e.AbstractC8807b
        /* renamed from: b */
        public final void mo8520b(List<GiftPage> list) {
            super.mo8520b(list);
            if (C8729d.f21542u.mo15005a(list)) {
                C8729d.f21542u.mo15001a();
                AbstractC9996a aVar = this.f24293a.f24289a;
                if (aVar != null) {
                    aVar.mo16814e();
                }
                C8740e.m17061b(this.f24293a.f24292d);
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
        C9997b bVar = new C9997b(this);
        DataChannel dataChannel = this.f24291c;
        long j2 = 0;
        if (dataChannel == null || (room2 = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room2.getId();
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        DataChannel dataChannel2 = this.f24291c;
        if (!(dataChannel2 == null || (room = (Room) dataChannel2.mo28318b(C9093de.class)) == null)) {
            j2 = room.getOwnerUserId();
        }
        if (c == j2) {
            z = true;
        } else {
            z = false;
        }
        inst.syncGiftList(bVar, j, 5, z);
    }
}
