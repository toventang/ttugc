package com.bytedance.android.live.broadcast.bgbroadcast.p191b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3064f;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b;
import com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f;
import com.bytedance.android.live.broadcast.p188b.View$OnClickListenerC3073a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7888db;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.p149d.AbstractC2717b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b */
public final class C3155b extends AbstractC3153b implements AbstractC2717b.AbstractC2718a {

    /* renamed from: g */
    public static final C3156a f9132g = new C3156a((byte) 0);

    /* renamed from: f */
    public boolean f9133f;

    /* renamed from: h */
    private AbstractC2717b f9134h;

    /* renamed from: i */
    private View f9135i;

    /* renamed from: j */
    private HSImageView f9136j;

    /* renamed from: k */
    private HSImageView f9137k;

    /* renamed from: l */
    private View$OnClickListenerC3073a f9138l;

    /* renamed from: m */
    private TextureViewWrapper f9139m;

    /* renamed from: n */
    private final boolean f9140n;

    /* renamed from: o */
    private boolean f9141o;

    /* renamed from: p */
    private final AbstractC89244h f9142p;

    static {
        Covode.recordClassIndex(3636);
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: a */
    public final void mo7280a(Object obj) {
        C89219l.m154721d(obj, "");
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: a */
    public final void mo7281a(String str) {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: b */
    public final int mo8446b() {
        return R.layout.b4d;
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: e */
    public final void mo8449e() {
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: f */
    public final void mo8450f() {
    }

    /* renamed from: j */
    public final int mo8489j() {
        return ((Number) this.f9142p.getValue()).intValue();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: m */
    public final void mo7284m() {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: n */
    public final void mo7285n() {
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: o */
    public final void mo7286o() {
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$a */
    public static final class C3156a {
        static {
            Covode.recordClassIndex(3637);
        }

        private C3156a() {
        }

        public /* synthetic */ C3156a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8440a() {
        EnumC9592k.OBS.config();
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: k */
    public final void mo7282k() {
        if (!this.f9133f) {
            m8579r();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$b */
    static final class C3157b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C3157b f9143a = new C3157b();

        static {
            Covode.recordClassIndex(3638);
        }

        C3157b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue());
        }
    }

    /* renamed from: s */
    private final void m8580s() {
        C11279p.m20006a(this.f9136j);
        C11279p.m20006a(this.f9135i);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: g */
    public final void mo8451g() {
        m8577b(true);
        AbstractC2717b bVar = this.f9134h;
        if (bVar != null) {
            bVar.stop(true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: h */
    public final void mo8452h() {
        HSImageView hSImageView = this.f9136j;
        if (hSImageView != null) {
            hSImageView.postDelayed(new RunnableC3160e(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: i */
    public final void mo8453i() {
        this.f9133f = true;
        m8580s();
        m8577b(false);
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$d */
    static final class C3159d implements AbstractBinderC11605a.AbstractC11606a {

        /* renamed from: a */
        final /* synthetic */ C3155b f9145a;

        static {
            Covode.recordClassIndex(3640);
        }

        C3159d(C3155b bVar) {
            this.f9145a = bVar;
        }

        @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a.AbstractC11606a
        /* renamed from: a */
        public final void mo8469a() {
            C3854a.m9453a(3, this.f9145a.f9127a, "room close onLiveFinished");
            this.f9145a.f9130d.mo8505d();
        }
    }

    /* renamed from: q */
    public static void m8578q() {
        C6501b.C6502a.m13948a("livesdk_stream_key_banner_show").mo12639a().mo12651a("live_type", "third_party").mo12655b();
    }

    /* renamed from: r */
    private final void m8579r() {
        C11279p.m20017b(this.f9136j);
        if (mo8489j() != 2) {
            C11279p.m20017b(this.f9135i);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$e */
    static final class RunnableC3160e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3155b f9146a;

        static {
            Covode.recordClassIndex(3641);
        }

        RunnableC3160e(C3155b bVar) {
            this.f9146a = bVar;
        }

        public final void run() {
            if (this.f9146a.f9130d.isViewValid() && !this.f9146a.f9133f) {
                if (this.f9146a.mo8489j() == 2) {
                    DataChannelGlobal.f42558d.mo28328c(C3064f.class, true);
                } else {
                    this.f9146a.mo8490p();
                }
                this.f9146a.mo8488a(true);
                C3155b.m8578q();
            }
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: l */
    public final void mo7283l() {
        m8580s();
        if (mo8489j() == 2) {
            DataChannelGlobal.f42558d.mo28328c(C3064f.class, false);
        }
        this.f9130d.mo8508g();
        C6497a b = C3051c.C3052a.m8360b("ttlive_start_play_obs_all");
        b.f16147c = true;
        b.mo12632a();
    }

    /* renamed from: p */
    public final void mo8490p() {
        View$OnClickListenerC3073a aVar = this.f9138l;
        if (aVar == null) {
            Activity activity = this.f9128b;
            StreamUrl streamUrl = this.f9129c.getStreamUrl();
            C89219l.m154716b(streamUrl, "");
            List<String> list = streamUrl.f27951e;
            C89219l.m154716b(list, "");
            String str = (String) C89070n.m154583g((List) list);
            if (str == null) {
                StreamUrl streamUrl2 = this.f9129c.getStreamUrl();
                C89219l.m154716b(streamUrl2, "");
                str = streamUrl2.mo18682a();
            }
            aVar = new View$OnClickListenerC3073a(activity, str, this.f9129c);
        }
        this.f9138l = aVar;
        C11279p.m19997a(aVar);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: c */
    public final void mo8447c() {
        m8579r();
        this.f9139m = (TextureViewWrapper) this.f9128b.findViewById(R.id.fe8);
        AbstractC2717b createRoomPlayer = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).createRoomPlayer(this.f9129c.getMultiStreamData(), this.f9129c.getMultiStreamDefaultQualitySdkKey(), this.f9129c.getStreamType(), this.f9129c.getStreamSrConfig(), this.f9139m, this, this.f9128b);
        createRoomPlayer.setSeiOpen(!this.f9140n);
        createRoomPlayer.startWithNewLivePlayer();
        this.f9134h = createRoomPlayer;
        this.f9133f = false;
        EnumC5847l.STREAM_KEY.load(this.f9131e, new C3158c(this));
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: d */
    public final void mo8448d() {
        HSImageView hSImageView;
        this.f9136j = (HSImageView) this.f9128b.findViewById(R.id.px);
        this.f9137k = (HSImageView) this.f9128b.findViewById(R.id.fc1);
        this.f9135i = this.f9128b.findViewById(R.id.cg3);
        float a = (float) (C13628n.m24504a(this.f9128b) / C13628n.m24521b(this.f9128b));
        HSImageView hSImageView2 = this.f9136j;
        User owner = this.f9129c.getOwner();
        C89219l.m154716b(owner, "");
        C3941k.m9604a(hSImageView2, owner.getAvatarThumb(), new C11291z(5, a));
        if (this.f9129c.background != null) {
            if (Build.VERSION.SDK_INT >= 23 && (hSImageView = this.f9137k) != null) {
                hSImageView.setForeground(null);
            }
            C3941k.m9601a(this.f9137k, this.f9129c.background);
            return;
        }
        HSImageView hSImageView3 = this.f9137k;
        User owner2 = this.f9129c.getOwner();
        C89219l.m154716b(owner2, "");
        C3941k.m9604a(hSImageView3, owner2.getAvatarThumb(), new C11291z(5, a));
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$c */
    static final class C3158c implements AbstractView$OnClickListenerC5841f {

        /* renamed from: a */
        final /* synthetic */ C3155b f9144a;

        static {
            Covode.recordClassIndex(3639);
        }

        C3158c(C3155b bVar) {
            this.f9144a = bVar;
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        public final void onClick(View view) {
            this.f9144a.mo8490p();
            this.f9144a.mo8488a(false);
            C3155b.m8578q();
        }
    }

    /* renamed from: b */
    private final void m8577b(boolean z) {
        View$OnClickListenerC3073a aVar = this.f9138l;
        if (aVar != null) {
            C11279p.m20014b(aVar);
        }
        if (z) {
            View$OnClickListenerC3073a aVar2 = this.f9138l;
            if (aVar2 != null) {
                aVar2.mo8351c();
            }
            this.f9138l = null;
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: a */
    public final void mo7279a(Exception exc) {
        C89219l.m154721d(exc, "");
        m8576b(-1, exc.toString());
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8444a(AbstractBinderC11605a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.isLiveFinished()) {
            C3854a.m9453a(3, this.f9127a, "room close onServiceConnected isLiveFinished");
            this.f9130d.mo8505d();
        } else {
            aVar.setLiveStatusListener(new C3159d(this));
            Room room = this.f9129c;
            if (room != null) {
                Object b = this.f9131e.mo28318b(C9068cg.class);
                if (b == null) {
                    b = ((IMessageService) C6193a.m13435a(IMessageService.class)).messageManagerProvider(room.getId(), true, (Context) this.f9128b);
                }
                this.f9131e.mo28311a(C9068cg.class, b);
            }
        }
        this.f9130d.mo8497a(new C7888db());
    }

    /* renamed from: a */
    public final void mo8488a(boolean z) {
        View$OnClickListenerC3073a aVar = this.f9138l;
        if (aVar != null) {
            aVar.f8912a = z;
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: a */
    public final void mo7278a(int i, String str) {
        C89219l.m154721d(str, "");
        m8576b(i, str);
    }

    /* renamed from: b */
    private final void m8576b(int i, String str) {
        if (!this.f9141o) {
            this.f9141o = true;
            C3051c.C3052a.m8361c("ttlive_play_obs_error").mo12635b("error_code", Integer.valueOf(i)).mo12637b("error_msg", str).mo12636b("user_id", Long.valueOf(this.f9129c.getOwnerUserId())).mo12637b("stream_data", this.f9129c.getMultiStreamData()).mo12632a();
        }
    }

    @Override // com.bytedance.android.p149d.AbstractC2717b.AbstractC2718a
    /* renamed from: a */
    public final void mo7277a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (i > i2) {
            TextureViewWrapper textureViewWrapper = this.f9139m;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (textureViewWrapper != null) {
                layoutParams = textureViewWrapper.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.width = C13628n.m24504a(this.f9128b);
                marginLayoutParams2.height = (i2 * marginLayoutParams2.width) / i;
                marginLayoutParams2.topMargin = (int) C13628n.m24520b(this.f9128b, 138.0f);
                TextureViewWrapper textureViewWrapper2 = this.f9139m;
                if (textureViewWrapper2 != null) {
                    textureViewWrapper2.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3155b(Room room, AbstractC3182f fVar, DataChannel dataChannel) {
        super(room, fVar, dataChannel);
        boolean z;
        C89219l.m154721d(room, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dataChannel, "");
        long ownerUserId = room.getOwnerUserId();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (ownerUserId == b.mo13161c()) {
            z = true;
        } else {
            z = false;
        }
        this.f9140n = z;
        this.f9142p = C89250i.m154773a((AbstractC89171a) C3157b.f9143a);
    }
}
