package com.bytedance.android.livesdk.envelope.widget;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2936j;
import com.bytedance.android.live.p176b.AbstractC2938l;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a;
import com.bytedance.android.livesdk.envelope.p521b.C8435b;
import com.bytedance.android.livesdk.gift.p548d.C8805i;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeURLConfig;
import com.bytedance.android.livesdk.lynx.lynxcard.C9371e;
import com.bytedance.android.livesdk.lynx.lynxcard.C9375h;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class RedEnvelopeWidget extends LiveRecyclableWidget implements AbstractC8445a, AbstractC33974au {

    /* renamed from: a */
    public static final C8442a f20879a = new C8442a((byte) 0);

    /* renamed from: b */
    private HSImageView f20880b;

    /* renamed from: c */
    private final AbstractC89244h f20881c = C89250i.m154774a(EnumC89331m.NONE, C8444c.f20883a);

    static {
        Covode.recordClassIndex(9288);
    }

    /* renamed from: a */
    public final AbstractC8434a mo14759a() {
        return (AbstractC8434a) this.f20881c.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bd4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$a */
    public static final class C8442a {
        static {
            Covode.recordClassIndex(9289);
        }

        private C8442a() {
        }

        public /* synthetic */ C8442a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$c */
    static final class C8444c extends AbstractC89220m implements AbstractC89171a<C8435b> {

        /* renamed from: a */
        public static final C8444c f20883a = new C8444c();

        static {
            Covode.recordClassIndex(9291);
        }

        C8444c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C8435b invoke() {
            return new C8435b();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        mo14759a();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        mo14759a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        AbstractC2936j hybridDialogManager;
        mo14759a().mo14749a();
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null && (hybridDialogManager = fVar.getHybridDialogManager()) != null) {
            hybridDialogManager.mo7672a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$b */
    public static final class C8443b implements C9371e.AbstractC9372a {

        /* renamed from: a */
        final /* synthetic */ RedEnvelopeWidget f20882a;

        static {
            Covode.recordClassIndex(9290);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8443b(RedEnvelopeWidget redEnvelopeWidget) {
            this.f20882a = redEnvelopeWidget;
        }

        @Override // com.bytedance.android.livesdk.lynx.lynxcard.C9371e.AbstractC9372a
        /* renamed from: a */
        public final void mo12783a(String str) {
            C89219l.m154721d(str, "");
            this.f20882a.mo14759a().mo14751a(str);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        HSImageView hSImageView = new HSImageView(this.context);
        this.f20880b = hSImageView;
        C3941k.m9607a(hSImageView, "tiktok_live_basic_resource", "ttlive_treasure_box_anim_pic.png");
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        EnumC5847l lVar = EnumC5847l.REDENVELOPE;
        DataChannel dataChannel = this.dataChannel;
        DataChannel dataChannel2 = this.dataChannel;
        C89219l.m154716b(dataChannel2, "");
        lVar.load(dataChannel, new C8446b(dataChannel2));
        AbstractC8434a a = mo14759a();
        DataChannel dataChannel3 = this.dataChannel;
        C89219l.m154716b(dataChannel3, "");
        a.mo14750a(dataChannel3, this);
    }

    @Override // com.bytedance.android.livesdk.envelope.widget.AbstractC8445a
    /* renamed from: a */
    public final void mo14761a(String str) {
        C89219l.m154721d(str, "");
        if (mo14759a().mo14753c()) {
            C3854a.m9453a(3, "RedEnvelopeWidget", "notify envelope data change");
            Map a = C89041ag.m154412a(C89387v.m154943a("update_data", C4139e.C4140a.f11575b.mo46671a(str, (Type) Map.class)));
            AbstractC2953a a2 = C6193a.m13435a(AbstractC2928f.class);
            C89219l.m154716b(a2, "");
            AbstractC2938l lynxCardViewManager = ((AbstractC2928f) a2).getLynxCardViewManager();
            String e = mo14759a().mo14755e();
            if (e == null) {
                C89219l.m154715b();
            }
            lynxCardViewManager.mo7680a(new C9375h(e, a));
            return;
        }
        C3854a.m9453a(3, "RedEnvelopeWidget", "notify envelope data created");
        Uri build = Uri.parse(RedEnvelopeURLConfig.INSTANCE.getShortTouchUrl()).buildUpon().appendQueryParameter("initial_data", str).build();
        AbstractC2953a a3 = C6193a.m13435a(AbstractC2928f.class);
        C89219l.m154716b(a3, "");
        AbstractC2938l lynxCardViewManager2 = ((AbstractC2928f) a3).getLynxCardViewManager();
        C89219l.m154716b(build, "");
        HSImageView hSImageView = this.f20880b;
        if (hSImageView != null) {
            hSImageView.setLayoutParams(new LinearLayout.LayoutParams(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewWidth()), C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewHeight())));
        }
        lynxCardViewManager2.mo7679a(new C9371e(build, hSImageView, LynxCardPriority.INSTANCE.getPriority("shortTouchTreasureBox"), new C8443b(this), true));
    }

    @Override // com.bytedance.android.livesdk.envelope.widget.AbstractC8445a
    /* renamed from: a */
    public final void mo14760a(C8805i iVar) {
        String str;
        AbstractC6872f b;
        AbstractC2994b a;
        String str2;
        String str3;
        FollowInfo followInfo;
        String str4;
        String str5;
        C89219l.m154721d(iVar, "");
        String sendUrl = RedEnvelopeURLConfig.INSTANCE.getSendUrl();
        String str6 = "1";
        if (sendUrl != null) {
            C3854a.m9453a(3, "RedEnvelopeWidget", "openRedEnvelopeCreate: url=".concat(String.valueOf(sendUrl)));
            C3854a.m9453a(3, "RedEnvelopeWidget", "openRedEnvelopeCreateDialog: lynxUrl=".concat(String.valueOf(sendUrl)));
            Uri.Builder appendQueryParameter = Uri.parse(sendUrl).buildUpon().appendQueryParameter("enter_from_merge", C6544e.m13987a()).appendQueryParameter("enter_method", C6544e.m13990d());
            if (mo14759a().mo14752b()) {
                str4 = str6;
            } else {
                str4 = "0";
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("is_anchor", str4).appendQueryParameter("entrance", iVar.f21686b);
            Room d = mo14759a().mo14754d();
            if (d == null || (str5 = d.getIdStr()) == null) {
                str5 = "";
            }
            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str5);
            C89219l.m154716b(appendQueryParameter3, "");
            Uri parse = Uri.parse(appendQueryParameter3.toString());
            String queryParameter = parse.getQueryParameter("gravity");
            if (queryParameter == null || queryParameter.length() == 0) {
                parse = parse.buildUpon().appendQueryParameter("gravity", "bottom").build();
            }
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(this.context, parse);
        } else {
            C3854a.m9453a(6, "RedEnvelopeWidget", "openRedEnvelopeCreate: send url is empty");
        }
        boolean b2 = mo14759a().mo14752b();
        C89219l.m154721d(iVar, "");
        HashMap hashMap = new HashMap(11);
        hashMap.put("enter_from_merge", C6544e.m13987a());
        hashMap.put("enter_method", C6544e.m13990d());
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner == null || (followInfo = owner.getFollowInfo()) == null || (str2 = String.valueOf(followInfo.getFollowStatus())) == null) {
                str2 = "";
            }
            hashMap.put("follow_status", str2);
            Hashtag hashtag = room.hashtag;
            if (hashtag == null || (str3 = hashtag.title) == null) {
                str3 = "";
            }
            hashMap.put("hashtag_type", str3);
        }
        C11115u a2 = C11115u.m19743a();
        if (!(a2 == null || (b = a2.mo17915b()) == null || (a = b.mo13147a()) == null)) {
            hashMap.put("user_id", String.valueOf(a.getId()));
        }
        if (!b2) {
            str6 = "0";
        }
        hashMap.put("is_anchor", str6);
        AbstractC10339d dVar = (AbstractC10339d) C6193a.m13435a(AbstractC10339d.class);
        hashMap.put("online_watch_users", String.valueOf(dVar.getCurrentRoomAudienceNum()));
        hashMap.put("hourly_ranking", String.valueOf(dVar.getCurrentRoomHourlyRank()));
        String str7 = "normal_video_live";
        if (C6193a.m13435a(AbstractC4367a.class) != null && ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
            str7 = "video_anchor_order";
        } else if (C6193a.m13435a(AbstractC4409b.class) != null) {
            AbstractC4409b bVar = (AbstractC4409b) C6193a.m13435a(AbstractC4409b.class);
            C89219l.m154716b(bVar, "");
            if (bVar.isBattling()) {
                str7 = "video_anchor_pk";
            } else if (bVar.isInCoHost()) {
                str7 = "video_anchor_connect";
            } else if (bVar.isInMultiGuest()) {
                str7 = "video_anchor_guest_connect";
            }
        }
        hashMap.put("scene", str7);
        if (C89219l.m154714a((Object) iVar.f21686b, (Object) "gift")) {
            str = "redpacket_panel_click";
        } else {
            str = "redpacket_in_more_click";
        }
        C6501b.C6502a.m13948a(str).mo12652a((Map<String, String>) hashMap).mo12639a().mo12658d("live_detail").mo12656c("click").mo12654b("live").mo12655b();
    }
}
