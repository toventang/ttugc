package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.broadcast.api.C3065g;
import com.bytedance.android.live.broadcast.utils.C3737o;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.android.live.p385p.C5849n;
import com.bytedance.android.live.p385p.C5856s;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAnchorIntroSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrisbeeTaskIconShowSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePauseLiveSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9025as;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9091dc;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.m */
public final class C8043m implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    C5849n f20041a;

    /* renamed from: b */
    private Room f20042b;

    /* renamed from: c */
    private final List<EnumC5847l> f20043c = new ArrayList();

    /* renamed from: d */
    private DataChannel f20044d;

    /* renamed from: e */
    private EnumC11728i f20045e;

    static {
        Covode.recordClassIndex(8850);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* renamed from: b */
    private final void m16239b() {
        EnumC11728i iVar = this.f20045e;
        if (iVar != null) {
            int i = C8046n.f20048a[iVar.ordinal()];
            if (i == 1) {
                m16240c();
            } else if (i == 2) {
                m16241d();
            } else if (i == 3) {
                m16242e();
            }
        }
    }

    /* renamed from: a */
    public final void mo14321a() {
        C6805b<Boolean> bVar = AbstractC6804a.f17048cv;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue() && LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            DataChannel dataChannel = this.f20044d;
            if (dataChannel == null) {
                C89219l.m154715b();
            }
            Object b = dataChannel.mo28318b(C9025as.class);
            if (b == null) {
                C89219l.m154715b();
            }
            if (((Boolean) b).booleanValue()) {
                EnumC5847l.MORE.showRedDot(this.f20044d);
                return;
            }
        }
        EnumC5847l.MORE.hideRedDot(this.f20044d);
    }

    /* renamed from: c */
    private final void m16240c() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        DataChannel dataChannel = this.f20044d;
        Boolean bool = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        List<EnumC5847l> list = this.f20043c;
        list.clear();
        list.add(EnumC5847l.REVERSE_CAMERA);
        list.add(EnumC5847l.REVERSE_MIRROR);
        if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            DataChannel dataChannel2 = this.f20044d;
            if (dataChannel2 != null) {
                bool = (Boolean) dataChannel2.mo28318b(C3065g.class);
            }
            if (C11279p.m20012a(bool)) {
                list.add(EnumC5847l.PAUSE_LIVE);
            }
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.INTRO);
        }
        list.add(EnumC5847l.SETTING);
        list.add(EnumC5847l.COMMENT);
        if (C3737o.m9246a(this.f20044d)) {
            list.add(EnumC5847l.TOPICS);
        }
        if (((IGiftService) C6193a.m13435a(IGiftService.class)).enableRedEnvelope()) {
            list.add(EnumC5847l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z2 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            AbstractC2953a a = C6193a.m13435a(IWalletService.class);
            if (a == null) {
                C89219l.m154715b();
            }
            AbstractC6332d walletCenter = ((IWalletService) a).walletCenter();
            C89219l.m154716b(walletCenter, "");
            if (walletCenter.mo12373b() > 0) {
                z2 = true;
            }
            C8789a.EnumC8790a a2 = C8789a.m17098a(true, z2, z);
            if (a2 != null) {
                int i = C8046n.f20049b[a2.ordinal()];
                if (i == 1) {
                    list.add(EnumC5847l.DUMMY_BROADCAST_GIFT);
                } else if (i == 2) {
                    list.add(EnumC5847l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(EnumC5847l.STICKER_DONATION);
        }
    }

    /* renamed from: d */
    private final void m16241d() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        DataChannel dataChannel = this.f20044d;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        List<EnumC5847l> list = this.f20043c;
        list.clear();
        if (LivePauseLiveSetting.INSTANCE.pauseLiveEnabled()) {
            list.add(EnumC5847l.PAUSE_LIVE);
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.INTRO);
        }
        list.add(EnumC5847l.SETTING);
        list.add(EnumC5847l.COMMENT);
        if (C3737o.m9246a(this.f20044d)) {
            list.add(EnumC5847l.TOPICS);
        }
        if (((IGiftService) C6193a.m13435a(IGiftService.class)).enableRedEnvelope()) {
            list.add(EnumC5847l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z2 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z = false;
            } else {
                z = true;
            }
            AbstractC2953a a = C6193a.m13435a(IWalletService.class);
            if (a == null) {
                C89219l.m154715b();
            }
            AbstractC6332d walletCenter = ((IWalletService) a).walletCenter();
            C89219l.m154716b(walletCenter, "");
            if (walletCenter.mo12373b() > 0) {
                z2 = true;
            }
            C8789a.EnumC8790a a2 = C8789a.m17098a(true, z2, z);
            if (a2 != null) {
                int i = C8046n.f20050c[a2.ordinal()];
                if (i == 1) {
                    list.add(EnumC5847l.DUMMY_BROADCAST_GIFT);
                } else if (i == 2) {
                    list.add(EnumC5847l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(EnumC5847l.STICKER_DONATION);
        }
    }

    /* renamed from: e */
    private final void m16242e() {
        boolean z;
        Room room;
        RoomAuthStatus roomAuthStatus;
        boolean z2;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        Boolean bool;
        DataChannel dataChannel = this.f20044d;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        DataChannel dataChannel2 = this.f20044d;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        List<EnumC5847l> list = this.f20043c;
        list.clear();
        list.add(EnumC5847l.STREAM_KEY);
        if (z && !C5856s.m12794a(room)) {
            list.add(EnumC5847l.SHARE);
        }
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.INTRO);
        }
        if (C3737o.m9246a(this.f20044d)) {
            list.add(EnumC5847l.TOPICS);
        }
        list.add(EnumC5847l.SETTING);
        list.add(EnumC5847l.COMMENT);
        if (((IGiftService) C6193a.m13435a(IGiftService.class)).enableRedEnvelope()) {
            list.add(EnumC5847l.REDENVELOPE);
        }
        if (room == null || (roomAuthStatus3 = room.mRoomAuthStatus) == null || roomAuthStatus3.isAnchorGiftEnable()) {
            boolean z3 = false;
            if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || !roomAuthStatus2.isEnableGift()) {
                z2 = false;
            } else {
                z2 = true;
            }
            AbstractC2953a a = C6193a.m13435a(IWalletService.class);
            if (a == null) {
                C89219l.m154715b();
            }
            AbstractC6332d walletCenter = ((IWalletService) a).walletCenter();
            C89219l.m154716b(walletCenter, "");
            if (walletCenter.mo12373b() > 0) {
                z3 = true;
            }
            C8789a.EnumC8790a a2 = C8789a.m17098a(true, z3, z2);
            if (a2 != null) {
                int i = C8046n.f20051d[a2.ordinal()];
                if (i == 1) {
                    list.add(EnumC5847l.DUMMY_BROADCAST_GIFT);
                } else if (i == 2) {
                    list.add(EnumC5847l.BROADCAST_GIFT);
                }
            }
        }
        if (FrisbeeTaskIconShowSetting.INSTANCE.enable()) {
            list.add(EnumC5847l.TASK);
        }
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableStickerDonation()) {
            list.add(EnumC5847l.STICKER_DONATION);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.m$b */
    static final class C8045b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8043m f20047a;

        static {
            Covode.recordClassIndex(8852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8045b(C8043m mVar) {
            super(1);
            this.f20047a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f20047a.mo14321a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.m$a */
    static final class C8044a extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8043m f20046a;

        static {
            Covode.recordClassIndex(8851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8044a(C8043m mVar) {
            super(1);
            this.f20046a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            C5849n nVar = this.f20046a.f20041a;
            if (nVar != null) {
                nVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        DataChannel dataChannel = this.f20044d;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5840e.class, true);
        }
        m16239b();
        if (!C13617h.m24465a(this.f20043c)) {
            List<EnumC5847l> list = this.f20043c;
            DataChannel dataChannel2 = this.f20044d;
            if (dataChannel2 == null) {
                C89219l.m154715b();
            }
            this.f20041a = new C5849n(list, dataChannel2);
            DataChannel dataChannel3 = this.f20044d;
            if (dataChannel3 == null) {
                C89219l.m154715b();
            }
            AbstractC0952i iVar = (AbstractC0952i) dataChannel3.mo28318b(C9021ao.class);
            if (iVar != null) {
                C5849n nVar = this.f20041a;
                if (nVar == null) {
                    C89219l.m154715b();
                }
                nVar.show(iVar, "ToolbarButtonMoreDialog");
            }
        }
        C6558k.m14024a(C3966y.m9669e());
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        b.mo13161c();
        Room room = this.f20042b;
        if (room == null) {
            C89219l.m154715b();
        }
        room.getId();
        C6501b a = C6501b.C6502a.m13948a("anchor_more_function_click").mo12643a(this.f20044d);
        Room room2 = this.f20042b;
        if (room2 == null) {
            C89219l.m154715b();
        }
        EnumC11728i streamType = room2.getStreamType();
        C89219l.m154716b(streamType, "");
        a.mo12651a("live_type", C11729j.m20684a(streamType)).mo12655b();
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        C5849n nVar = this.f20041a;
        if (nVar != null) {
            nVar.dismiss();
        }
        dataChannel.mo28316b(this);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f20044d = dataChannel;
        this.f20042b = (Room) dataChannel.mo28318b(C9093de.class);
        this.f20045e = (EnumC11728i) dataChannel.mo28318b(C9058bx.class);
        dataChannel.mo28312a(this, C3018a.class, new C8044a(this)).mo28317b(this, C9091dc.class, new C8045b(this));
        m16239b();
        mo14321a();
    }
}
