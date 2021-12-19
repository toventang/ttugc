package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4396aj;
import com.bytedance.android.live.liveinteract.api.C4436g;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4447q;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4410a;
import com.bytedance.android.live.liveinteract.api.p261b.C4411b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4492c;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4493d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4495f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.cohost.p271d.C4618a;
import com.bytedance.android.live.liveinteract.cohost.p271d.C4619b;
import com.bytedance.android.live.liveinteract.cohost.p272e.C4620a;
import com.bytedance.android.live.liveinteract.cohost.p272e.C4621b;
import com.bytedance.android.live.liveinteract.cohost.p272e.C4623c;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p302f.C4964a;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5683b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5710e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5715j;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5727u;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5653b;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5655d;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5658g;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveEnablePerPushInteractiveStreamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMtInteractEndPageEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveNetworkTypeModeRateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivePkConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.ShowLinkCrossRoomResetStacktraceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceRatingHighSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostUserRtcReplyMsgSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.C9618ar;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14664k;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.e */
public final class C4566e extends AbstractC7501r<AbstractC4569a> implements AbstractC5653b, AbstractC5655d, AbstractC5666b {

    /* renamed from: a */
    public Room f12173a;

    /* renamed from: b */
    public boolean f12174b;

    /* renamed from: c */
    DataChannel f12175c;

    /* renamed from: d */
    public C4384b f12176d;

    /* renamed from: e */
    public C4964a f12177e;
    @AbstractC4430d(mo10204a = "RTC_CONTROLLER")

    /* renamed from: f */
    public C5668c f12178f;

    /* renamed from: g */
    private AbstractC88412b f12179g;

    /* renamed from: h */
    private C5715j f12180h;

    /* renamed from: i */
    private boolean f12181i;

    /* renamed from: j */
    private boolean f12182j;

    /* renamed from: k */
    private boolean f12183k;

    /* renamed from: l */
    private boolean f12184l;

    /* renamed from: m */
    private boolean f12185m;

    /* renamed from: n */
    private boolean f12186n;

    /* renamed from: o */
    private boolean f12187o;

    /* renamed from: p */
    private int f12188p = -1;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: q */
    private C5659c f12189q;
    @AbstractC4430d(mo10204a = "LIVE_VIDEO_CLIENT_FACTORY", mo10205b = true)

    /* renamed from: r */
    private AbstractC7601b f12190r;
    @AbstractC4430d(mo10204a = "LINK_MESSAGE_CENTER")

    /* renamed from: s */
    private C5658g f12191s;

    /* renamed from: t */
    private C4621b f12192t = new C4621b();

    /* renamed from: u */
    private C4623c f12193u = new C4623c();

    /* renamed from: v */
    private final C5652a f12194v = new C5652a() {
        /* class com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.C45671 */

        static {
            Covode.recordClassIndex(5143);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5652a, com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5654c
        /* renamed from: a */
        public final void mo10325a(C9606aj ajVar) {
            if (ajVar.mo16562c() == C9606aj.EnumC9607a.ANCHOR_LINKMIC) {
                super.mo10325a(ajVar);
                if (C4566e.this.f12174b) {
                    C89219l.m154721d(ajVar, "");
                    JSONObject jSONObject = new JSONObject();
                    C4617b.m12485a(jSONObject, ajVar);
                    C4617b.m10742a("finish_message", jSONObject, 0);
                    EnumC4440k b = C4566e.this.f12176d.mo10151b();
                    if (C4566e.this.f12176d.f11957e == ajVar.f23320f && EnumC4440k.CONNECTION_FINISH.compareTo((Enum) b) > 0) {
                        C4566e.this.f12176d.mo10146b(ajVar.f23335u);
                        C4566e.this.mo10305b(203);
                        if (!C4566e.this.f12176d.f11927Q && C4595b.m10701a()) {
                            C4566e.this.f12176d.f11963k = true;
                            if (C4566e.this.f18624w != null) {
                                C4566e.this.f18624w.mo28320c(C4396aj.class, C3966y.m9657a((int) R.string.dsq));
                            }
                            C4502a.m10580a(C4502a.EnumC4507d.SYSTEM_REMATCH);
                            C5713h.m12510a((Room) null, EnumC4442m.RANDOM_LINK_MIC_INVITE, "");
                            return;
                        }
                        return;
                    }
                    return;
                }
                C4566e.this.mo10308b(PrivacyCert.Builder.with("bpea-522").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    };

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.e$a */
    public interface AbstractC4569a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(5145);
        }

        /* renamed from: a */
        LinkBattleWidget mo10327a();

        /* renamed from: a */
        void mo10328a(int i);

        /* renamed from: a */
        void mo10329a(String str, String str2);

        /* renamed from: a */
        void mo10330a(boolean z);

        /* renamed from: b */
        void mo10331b();

        /* renamed from: b */
        void mo10332b(boolean z);

        /* renamed from: c */
        void mo10333c();

        /* renamed from: d */
        void mo10334d();

        /* renamed from: e */
        void mo10335e();
    }

    static {
        Covode.recordClassIndex(5142);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10289a(int i, long j, Object... objArr) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10294a(C5600m mVar, String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10303a(String str, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10309b(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10312b(String str, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: c */
    public final void mo10317c(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: d */
    public final void mo10319d(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: e */
    public final void mo10321e(String str) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: g */
    public final void mo10323g() {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10302a(String str, String str2) {
        C4619b a = C4621b.m10747a(str2);
        if (a != null && TextUtils.equals(a.f12265a, "co_host_reply_msg")) {
            long j = a.f12266b;
            C89219l.m154721d(str2, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "message", str2);
            C3866a.m9474a(jSONObject, "channel_id", j);
            C4617b bVar = C4617b.f12263e;
            C4617b.m10742a((C4617b) "receive_reply_with_rtc_room_msg", (String) jSONObject, (JSONObject) 0);
        }
    }

    /* renamed from: a */
    public final void mo10298a(Boolean bool) {
        C5668c cVar = this.f12178f;
        boolean booleanValue = bool.booleanValue();
        Client client = cVar.f14400g;
        if (client != null) {
            client.muteLocalAudio(booleanValue);
        }
    }

    /* renamed from: a */
    public final void mo10304a(boolean z) {
        if (this.f12178f.f14396c) {
            this.f12177e.f12939a = z;
            C9618ar arVar = new C9618ar();
            arVar.f23415g = z ? 100102 : 100101;
            arVar.f23412d = String.valueOf(C11115u.m19743a().mo17915b().mo13161c());
            arVar.f23413e = String.valueOf(this.f12176d.f11922L);
            arVar.f23410b = "0";
            arVar.f23411c = "0";
            C5702a.m12451a("LinkCross_ForegroundStateChanged", this.f12174b, C4139e.C4140a.f11575b.mo46674b(arVar));
            HashMap hashMap = new HashMap();
            hashMap.put("content", C4139e.C4140a.f11575b.mo46674b(arVar));
            if (this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST) != null) {
                this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST).mo10349f(hashMap);
            }
        }
        if (!this.f12178f.mo11453b()) {
            if (z) {
                this.f12178f.mo11452b(this.f12176d.f11942ae);
            } else {
                this.f12178f.mo11458g();
            }
            this.f12178f.mo11456d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10299a(String str) {
        ((AbstractC4569a) this.f38654y).mo10329a("OnUserJoined", "position:LinkCross; interactId:".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10301a(String str, SurfaceView surfaceView) {
        AbstractC88412b bVar = this.f12179g;
        if (bVar != null) {
            bVar.dispose();
        }
        JSONObject jSONObject = new JSONObject();
        C4384b a = C4384b.C4385a.m10496a();
        long j = 1;
        if (a.f11913C > 0) {
            j = System.currentTimeMillis() - a.f11913C;
        }
        C3866a.m9474a(jSONObject, "cost", j);
        C3866a.m9475a(jSONObject, "first_joined", String.valueOf(!a.f11912B ? 1 : 0));
        if (!a.f11912B) {
            a.f11912B = true;
        }
        C4617b bVar2 = C4617b.f12263e;
        C4617b.m10742a((C4617b) "rtc_first_remote_video", (String) jSONObject, (JSONObject) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10300a(String str, long j) {
        ((AbstractC4569a) this.f38654y).mo10329a("OnUserLeaved", "position:LinkCross; interactId:".concat(String.valueOf(str)));
        if (this.f12174b && !this.f12176d.f11927Q && this.f12176d.mo10150a(EnumC4440k.CONNECTION_SUCCEED)) {
            C11226ao.m19883a(((AbstractC4569a) this.f38654y).getContext(), C3966y.m9657a((int) R.string.ecx), 6000);
        }
        if (!this.f12176d.f11927Q && C4595b.m10701a()) {
            this.f12176d.f11963k = true;
            if (this.f18624w != null) {
                this.f18624w.mo28320c(C4396aj.class, C3966y.m9657a((int) R.string.dsq));
            }
            C4502a.m10580a(C4502a.EnumC4507d.SYSTEM_REMATCH);
            C5713h.m12510a((Room) null, EnumC4442m.RANDOM_LINK_MIC_INVITE, "");
        }
        mo10305b(202);
    }

    /* renamed from: i */
    private void m10632i() {
        this.f12175c.mo28319c(C4491b.class);
    }

    /* renamed from: l */
    private void m10635l() {
        C5715j jVar = this.f12180h;
        if (jVar != null) {
            jVar.mo11476b();
            this.f12180h = null;
        }
    }

    /* renamed from: n */
    private boolean m10637n() {
        if (this.f12173a.getStreamUrlExtraSafely().f28104l > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10318d() {
        this.f12184l = false;
        this.f12185m = true;
        m10636m();
    }

    /* renamed from: o */
    private void m10638o() {
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", Long.valueOf(this.f12176d.f11957e));
        hashMap.put("to_user_id", Long.valueOf(this.f12176d.f11958f));
        hashMap.put("invite_type", Long.valueOf((long) this.f12176d.f11968p.getType()));
        this.f12175c.mo28320c(C4495f.class, hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5653b
    /* renamed from: a */
    public final void mo10287a() {
        mo10308b(PrivacyCert.Builder.with("bpea-521").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* renamed from: c */
    public final void mo10314c() {
        if (this.f12176d.f11958f != 0) {
            ((AbstractC11137ac) C11115u.m19743a().mo17915b().mo13160b(this.f12176d.f11958f).mo142916a(mo13749v())).mo17937a(new C4581q(this), new C4582r(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ C89391z mo10324h() {
        if (!(this.f38654y == null || this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST) == null)) {
            ((AbstractC11137ac) this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST).mo10345c(new HashMap()).mo142916a(mo13749v())).mo17937a(C4585u.f12215a, new C4586v(this));
        }
        return C89391z.f203057a;
    }

    /* renamed from: j */
    private void m10633j() {
        if (this.f12174b) {
            this.f12175c.mo28320c(C4441l.class, new C7399p(8));
        }
        C6779a.m14563a().mo13053a(new C4410a(2));
        if (!this.f12174b) {
            this.f12175c.mo28320c(C4450t.class, new C7398o(1));
        } else if (!C4384b.C4385a.m10496a().f11963k && C4384b.C4385a.m10496a().f11967o) {
            this.f12175c.mo28320c(C4450t.class, new C7398o(1));
        }
        if (ShowLinkCrossRoomResetStacktraceSetting.INSTANCE.getValue() && !this.f12174b) {
            C3854a.m9457a("ttlive_pk", "LinkCrossRoomDataHolder.unloadModule", new IllegalStateException());
        }
    }

    /* renamed from: k */
    private void m10634k() {
        final Config.VideoQuality videoQuality;
        if (this.f38654y == null || this.f12176d.mo10150a(EnumC4440k.CONNECTION_FINISH) || this.f12181i || this.f12178f.f14396c || this.f12190r == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f12176d.f11974v)) {
            C5702a.m12449a("LinkCross_TurnOnEngine", "rtcExtInfo is empty!");
            return;
        }
        this.f12181i = true;
        this.f12176d.f11936Z = true;
        this.f12176d.f11938aa = System.currentTimeMillis();
        if (m10637n()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        this.f12177e = new C4964a(videoQuality);
        this.f12178f.mo11448a(this.f12190r, new AbstractC5665a() {
            /* class com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.C45682 */

            static {
                Covode.recordClassIndex(5144);
            }

            /* renamed from: a */
            static final /* synthetic */ String m10679a(String str) {
                try {
                    C14664k ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    if (TextUtils.isEmpty(ttUrlDispatch.f35595b)) {
                        return str;
                    }
                    return ttUrlDispatch.f35595b;
                } catch (Exception e) {
                    e.printStackTrace();
                    return str;
                }
            }

            @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a
            /* renamed from: a */
            public final LiveCore.InteractConfig mo10326a(LiveCore.InteractConfig interactConfig) {
                interactConfig.setStreamMixer(C4566e.this.f12177e).setBackgroundColor("#303342").setMixStreamRtmpUrl(C4566e.this.f12173a.getStreamUrl().mo18682a());
                interactConfig.setContext(C3966y.m9669e()).setRtcExtInfo(C4566e.this.f12176d.f11974v).setVideoQuality(videoQuality).setCharacter(Config.Character.ANCHOR).setLogReportInterval(5).setProjectKey(((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getProjectKey()).setInteractMode(Config.InteractMode.PK).setMixStreamType(Config.MixStreamType.SERVER_MIX).setSeiVersion(2).setType(Config.Type.VIDEO).setAppChannel(((IHostContext) C6193a.m13435a(IHostContext.class)).getChannel()).setAppId(String.valueOf(((IHostContext) C6193a.m13435a(IHostContext.class)).appId())).setAppVersion(((IHostContext) C6193a.m13435a(IHostContext.class)).getVersionCode());
                interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
                interactConfig.setUrlDispatcher(C4587w.f12217a);
                C4566e.this.f12177e.mo11301a(interactConfig);
                return interactConfig;
            }
        });
        C4617b.m10744b();
        if (!C4384b.C4385a.m10496a().f11969q) {
            this.f12178f.mo11451a(false);
        }
    }

    /* renamed from: m */
    private void m10636m() {
        if (this.f38654y != null) {
            C5702a.m12451a("disableCoHostProgress", true, "mHasRtcJoinedChannel = " + this.f12178f.f14396c + "  mIsFinishingService = " + this.f12184l);
            if (!this.f12178f.f14396c && !this.f12184l) {
                this.f12176d.f11937a = false;
                if (this.f18624w != null) {
                    this.f18624w.mo28320c(C5683b.class, false);
                }
                m10633j();
            }
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        if (this.f12186n && this.f18624w != null) {
            this.f18624w.mo28320c(C4450t.class, new C7398o(3));
        }
        m10635l();
        EnumC4440k b = C4384b.C4385a.m10496a().mo10151b();
        if (this.f12174b && EnumC4440k.CONNECTION_FINISH.compareTo((Enum) b) > 0) {
            mo10305b(205);
        }
        this.f12176d.mo10152b(EnumC4440k.UNLOADED);
        AbstractC88412b bVar = this.f12179g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f18624w != null) {
            this.f18624w.mo28316b(this);
        }
        this.f12191s.mo11438b(this.f12194v);
        this.f12191s.mo11438b(this);
        this.f12178f.mo11454c();
        C5727u.m12585a();
        if (this.f12173a != null) {
            ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).likeMicStateChange(this.f12173a.getId(), 1, this.f12174b);
        }
        super.mo8577b();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: f */
    public final void mo10322f() {
        this.f12176d.mo10152b(EnumC4440k.CONNECTION_FINISH_SUCCEED);
        JSONObject jSONObject = new JSONObject();
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "rtc_offline", (String) jSONObject, (JSONObject) 0);
        this.f12182j = false;
        this.f12183k = false;
        this.f12176d.f11936Z = false;
        m10636m();
        m10635l();
        if (this.f18624w != null) {
            this.f18624w.mo28320c(C4436g.class, new C4411b(false, null));
        }
        if (this.f38654y != null) {
            ((AbstractC4569a) this.f38654y).mo10329a("onEndSuccess", "position:LinkCross");
        }
        C5727u.m12585a();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: e */
    public final void mo10320e() {
        Config.VideoQuality videoQuality;
        boolean z;
        boolean z2;
        int i;
        if (this.f38654y != null) {
            ((AbstractC4569a) this.f38654y).mo10329a("OnStartSuccess", "position:LinkCross, replied = " + this.f12176d.f11955c);
        }
        this.f12182j = true;
        if (this.f12187o && (i = this.f12188p) > 0) {
            mo10288a(i);
        }
        this.f12176d.f11933W = System.currentTimeMillis() - this.f12176d.f11938aa;
        long j = this.f12176d.f11933W;
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "cost", j);
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "rtc_join_channel_succeed", (String) jSONObject, (JSONObject) 0);
        if (this.f18624w != null) {
            this.f18624w.mo28320c(C4436g.class, new C4411b(true, this.f12176d.mo10153d().name()));
        }
        String a = this.f12173a.getStreamUrl().mo18682a();
        long id = this.f12173a.getId();
        String lowerCase = this.f12176d.mo10153d().name().toLowerCase();
        if (m10637n()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        C5715j jVar = new C5715j(lowerCase, a, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.f12180h = jVar;
        jVar.mo11475a();
        if (this.f12176d.f11955c) {
            m10627c(PrivacyCert.Builder.with("bpea-500").usage("").tag("link mic start push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (!this.f12178f.mo11453b() && this.f12176d.f11969q) {
            boolean value = LiveEnablePerPushInteractiveStreamSetting.INSTANCE.getValue();
            if (TTliveAnchorDeviceScoreSetting.INSTANCE.getValue() >= TTliveAnchorDeviceRatingHighSetting.INSTANCE.getValue()) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = C4384b.C4385a.m10496a().f11962j;
            if (TTNetInit.getEffectiveConnectionType() >= LiveNetworkTypeModeRateSetting.INSTANCE.getValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (value && z && z3 && z2) {
                this.f12178f.mo11449a(PrivacyCert.Builder.with("bpea-506").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                C4617b.m10743a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo10313c(int i) {
        m10630e(i);
        return null;
    }

    /* renamed from: b */
    public final void mo10308b(PrivacyCert privacyCert) {
        if (this.f38654y != null) {
            if (this.f12174b) {
                m10631e(privacyCert);
            } else {
                m10633j();
            }
        }
    }

    /* renamed from: d */
    private void m10629d(PrivacyCert privacyCert) {
        if (this.f12176d.f11957e == 0) {
            ((AbstractC4569a) this.f38654y).mo10333c();
            m10633j();
        } else if (this.f12178f.f14396c) {
            m10627c(privacyCert);
        } else {
            m10634k();
            if (!CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
                m10627c(privacyCert);
            }
        }
    }

    /* renamed from: e */
    private void m10631e(PrivacyCert privacyCert) {
        if (this.f12176d.mo10152b(EnumC4440k.CONNECTION_FINISH)) {
            C5702a.m12449a("LinkCross_TurnOffEngine", "isControllerNotNull:" + this.f12178f.f14397d);
            this.f12178f.mo11450a(privacyCert, "");
            C4617b.m10746c();
        }
    }

    public C4566e(DataChannel dataChannel) {
        this.f12175c = dataChannel;
        this.f12173a = (Room) dataChannel.mo28318b(C9093de.class);
        this.f12174b = ((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue();
        C4431e.f12034a.mo10198a(C4384b.C4385a.m10496a(), null);
        C4431e.f12034a.mo10198a(new C5668c(), null);
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: c */
    private void m10627c(PrivacyCert privacyCert) {
        if (!this.f12183k) {
            if (!C4384b.C4385a.m10496a().f11969q) {
                C4617b.m10743a(false);
                this.f12178f.mo11449a(privacyCert);
                this.f12178f.mo11451a(true);
            } else if (!this.f12178f.f14398e) {
                C4617b.m10743a(false);
                this.f12178f.mo11449a(privacyCert);
            }
            C4384b.C4385a.m10496a().f11956d = true;
            this.f12183k = true;
            C5702a.m12450a("LinkCross_RTC_START", true);
            C4617b bVar = C4617b.f12263e;
            C4617b.m10742a((C4617b) "rtc_mix_stream", (String) new JSONObject(), (JSONObject) 0);
            this.f12178f.mo11456d();
        }
    }

    /* renamed from: d */
    private void m10628d(int i) {
        boolean z;
        C3854a.m9453a(3, "LinkCrossRoomTAG", "finishServer, finishCode = ".concat(String.valueOf(i)));
        if (!this.f12185m && !this.f12184l) {
            boolean z2 = true;
            this.f12184l = true;
            try {
                if (C4947a.f12909a.mo10672a() != EnumC4949c.NORMAL) {
                    z = true;
                } else {
                    z = false;
                }
                C3854a.m9453a(3, "LinkCrossRoomTAG", "finish, isBattling = " + z + "  state = " + C4947a.f12909a.mo10672a());
                if (!z || ((AbstractC4569a) this.f38654y).mo10327a() == null) {
                    m10630e(i);
                    return;
                }
                if (i != 202) {
                    z2 = false;
                }
                ((AbstractC4569a) this.f38654y).mo10327a().mo10819a(103, z2, new C4572h(this, i));
            } catch (Exception unused) {
                C3854a.m9453a(6, "LinkCrossRoomTAG", "finishServer , npe");
                m10630e(i);
            }
        }
    }

    /* renamed from: e */
    private void m10630e(int i) {
        if (this.f38654y != null) {
            C5702a.m12449a("FINISH_CROSS", "finishCode = ".concat(String.valueOf(i)));
            long j = this.f12176d.f11957e;
            HashMap hashMap = new HashMap();
            hashMap.put("needSuggest", false);
            if (i == 201 && C4384b.C4385a.m10496a().f11945ah) {
                hashMap.put("needSuggest", true);
                hashMap.put("guest_user_id", Long.valueOf(this.f12176d.f11958f));
            }
            hashMap.put("channel_id", Long.valueOf(j));
            hashMap.put("finishCode", Integer.valueOf(i));
            if (this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST) == null) {
                mo10318d();
            } else {
                ((AbstractC11137ac) this.f12189q.mo11442b(C5647a.EnumC5648a.COHOST).mo10347d(hashMap).mo142916a(mo13749v())).mo17937a(new C4573i(this), new C4574j(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10288a(int i) {
        LiveRTCEngine rtcEngine;
        if (CoHostUserRtcReplyMsgSetting.INSTANCE.getValue() && this.f12178f != null) {
            String str = this.f12176d.f11923M;
            long j = 0;
            if (this.f12176d.f11957e > 0 && !TextUtils.isEmpty(str)) {
                if (!this.f12182j) {
                    this.f12188p = i;
                    this.f12187o = true;
                    return;
                }
                this.f12187o = false;
                C4384b bVar = this.f12193u.f12273a;
                if (bVar == null) {
                    C89219l.m154710a("mDataHolder");
                }
                long j2 = bVar.f11957e;
                if (j2 > 0) {
                    C4619b bVar2 = new C4619b("co_host_reply_msg", j2, C4139e.C4140a.f11576c.mo46674b(new C4618a(i)));
                    String b = C4139e.C4140a.f11576c.mo46674b(bVar2);
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(b, "");
                    JSONObject jSONObject = new JSONObject();
                    C3866a.m9475a(jSONObject, "target_linkmic_id", str);
                    C3866a.m9475a(jSONObject, "message", b);
                    C3866a.m9475a(jSONObject, "reply_status", String.valueOf(i));
                    C4617b bVar3 = C4617b.f12263e;
                    C4617b.m10742a((C4617b) "send_reply_with_rtc_msg", (String) jSONObject, (JSONObject) 0);
                    C5668c cVar = this.f12178f;
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(b, "");
                    Client client = cVar.f14400g;
                    if (!(client == null || (rtcEngine = client.getRtcEngine()) == null)) {
                        j = rtcEngine.sendUserMessage(str, b);
                    }
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(bVar2, "");
                    if (!C4620a.f12269b.containsKey(Long.valueOf(j))) {
                        C4620a.f12269b.put(Long.valueOf(j), str);
                    }
                    if (!C4620a.f12270c.containsKey(Long.valueOf(j))) {
                        C4620a.f12270c.put(Long.valueOf(j), Integer.valueOf(i));
                    }
                    if (!C4620a.f12268a.containsKey(Long.valueOf(j))) {
                        C4620a.f12268a.put(Long.valueOf(j), bVar2);
                    }
                    C89219l.m154721d(b, "");
                    JSONObject jSONObject2 = new JSONObject();
                    C3866a.m9475a(jSONObject2, "message", b);
                    C4617b bVar4 = C4617b.f12263e;
                    C4617b.m10742a((C4617b) "send_reply_with_rtc_room_msg", (String) jSONObject2, (JSONObject) 0);
                    this.f12178f.mo11455d(b);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo10305b(int i) {
        C3854a.m9453a(3, "LinkCrossRoomTAG", "finish, finishCode = " + i + "   channelId = " + this.f12176d.f11957e);
        if (this.f12176d.f11957e > 0) {
            if (!this.f12176d.mo10150a(EnumC4440k.CONNECTION_SUCCEED)) {
                m10632i();
            } else if (!this.f12176d.f11927Q || !LiveMtInteractEndPageEnableSetting.INSTANCE.getValue()) {
                m10632i();
            } else {
                m10638o();
            }
            m10628d(i);
            mo10308b(PrivacyCert.Builder.with("bpea-523").usage("").tag("link mic stop").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b1, code lost:
        if (r1.f14397d != false) goto L_0x007a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10297a(com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a r6) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.mo10297a(com.bytedance.android.live.liveinteract.cohost.a.d.e$a):void");
    }

    /* renamed from: a */
    public final void mo10296a(PrivacyCert privacyCert) {
        int value;
        if (this.f38654y != null && !this.f12176d.f11937a) {
            this.f12176d.f11937a = true;
            if (this.f18624w != null) {
                this.f18624w.mo28320c(C5683b.class, true);
            }
            this.f12176d.mo10152b(EnumC4440k.CONNECTION_START);
            C5702a.m12447a("LinkCross_TurnOnEngine");
            this.f12175c.mo28320c(C4441l.class, new C7399p(7));
            m10629d(privacyCert);
            if (!this.f12176d.mo10150a(EnumC4440k.CONNECTION_SUCCEED)) {
                if (C4384b.C4385a.m10496a().f11966n) {
                    value = LiveRandomLinkmicConnectTimeoutIntervalSetting.INSTANCE.getValue();
                } else {
                    value = LivePkConnectTimeoutIntervalSetting.INSTANCE.getValue();
                }
                long j = (long) value;
                this.f12179g = ((AbstractC11181z) AbstractC88979t.m154307b(j, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(mo13748u())).mo17950a(new C4583s(this, j), new C4584t(this));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10291a(long j, int i) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "status", String.valueOf(i));
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "send_reply_with_rtc_room_msg_result", (String) jSONObject, (JSONObject) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10306b(int i, String str) {
        this.f12183k = false;
        this.f12176d.f11936Z = false;
        m10636m();
        if (this.f38654y != null) {
            ((AbstractC4569a) this.f38654y).mo10329a("OnEndFailed", "position:LinkCross; code:" + i + "; desc:" + str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10292a(long j, long j2) {
        C3854a.m9453a(4, "bitrate_callback", j + " " + j2);
        if (this.f38654y != null) {
            ((AbstractC4569a) this.f38654y).mo10335e();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: c */
    public final void mo10315c(int i, String str) {
        long j = (long) i;
        C5721p.m12580a(C5721p.f14514b, j, str);
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 104L);
        C3866a.m9474a(jSONObject, "error_msg", j);
        C3866a.m9475a(jSONObject, "error_detail", str);
        C4617b.m10742a("rtc_error", jSONObject, 1);
        C5736v.m12592a(C5710e.m12494a(jSONObject));
        if (this.f12176d.f11954b && !this.f12176d.f11955c) {
            C5702a.m12451a("LinkCross_onError_Before_Reply", true, "position:LinkCross; code:" + i + "; desc:" + str);
            this.f12175c.mo28319c(C4492c.class);
        } else if (this.f38654y != null) {
            ((AbstractC4569a) this.f38654y).mo10331b();
            ((AbstractC4569a) this.f38654y).mo10329a("OnError", "position:LinkCross; code:" + i + ";message:" + str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10290a(int i, String str) {
        this.f12176d.f11936Z = false;
        long j = (long) i;
        C5721p.m12580a(C5721p.f14514b, j, str);
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 104L);
        C3866a.m9474a(jSONObject, "error_msg", j);
        C3866a.m9475a(jSONObject, "error_detail", str);
        C4617b bVar = C4617b.f12263e;
        C4617b.m10742a((C4617b) "rtc_join_channel_failed", (String) jSONObject, (JSONObject) 0);
        C5736v.m12592a(C5710e.m12494a(jSONObject));
        if (!this.f12176d.f11954b || this.f12176d.f11955c) {
            if (this.f38654y != null) {
                ((AbstractC4569a) this.f38654y).mo10331b();
                ((AbstractC4569a) this.f38654y).mo10329a("OnStartFailed", "position:LinkCross; code:" + i + "; desc:" + str);
            }
            AbstractC88412b bVar2 = this.f12179g;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f12176d.f11913C = 0;
            return;
        }
        C5702a.m12451a("LinkCross_OnStartFailed_Before_Reply", true, "position:LinkCross; code:" + i + "; desc:" + str);
        this.f12175c.mo28319c(C4492c.class);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10307b(long j, int i) {
        C4619b bVar = C4620a.f12268a.get(Long.valueOf(j));
        if (bVar != null) {
            if (TextUtils.equals(bVar.f12265a, "co_host_reply_msg")) {
                int intValue = C4620a.f12270c.get(Long.valueOf(j)).intValue();
                String str = C4620a.f12269b.get(Long.valueOf(j));
                String b = C4139e.C4140a.f11576c.mo46674b(bVar);
                C89219l.m154721d(str, "");
                C89219l.m154721d(b, "");
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "target_linkmic_id", str);
                C3866a.m9475a(jSONObject, "message", b);
                C3866a.m9475a(jSONObject, "reply_status", String.valueOf(intValue));
                C3866a.m9475a(jSONObject, "status", String.valueOf(i));
                C4617b bVar2 = C4617b.f12263e;
                C4617b.m10742a((C4617b) "send_reply_with_rtc_msg_result", (String) jSONObject, (JSONObject) 0);
            }
            if (C4620a.f12269b.containsKey(Long.valueOf(j))) {
                C4620a.f12269b.remove(Long.valueOf(j));
            }
            if (C4620a.f12270c.containsKey(Long.valueOf(j))) {
                C4620a.f12270c.remove(Long.valueOf(j));
            }
            if (C4620a.f12268a.containsKey(Long.valueOf(j))) {
                C4620a.f12268a.remove(Long.valueOf(j));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p363a.p365b.AbstractC5655d
    /* renamed from: c */
    public final void mo10316c(long j, int i) {
        try {
            if (this.f12174b && j == this.f12176d.f11958f && this.f12177e != null) {
                if (i == 100102) {
                    ((AbstractC4569a) this.f38654y).mo10330a(true);
                    this.f12177e.f12940b = true;
                } else if (i == 100101) {
                    ((AbstractC4569a) this.f38654y).mo10330a(false);
                    this.f12177e.f12940b = false;
                }
                this.f12178f.mo11456d();
            }
        } catch (NumberFormatException e) {
            C3854a.m9459b(e.toString());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10310b(String str, SurfaceView surfaceView) {
        long j;
        boolean z;
        AbstractC88412b bVar = this.f12179g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f38654y != null) {
            C3854a.m9453a(3, "LinkCrossRoomTAG", "receive remote first frame");
            C4384b a = C4384b.C4385a.m10496a();
            if (a.f11913C > 0) {
                j = System.currentTimeMillis() - a.f11913C;
            } else {
                j = 1;
            }
            a.f11913C = 0;
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "duration", j);
            C3866a.m9474a(jSONObject, "cost", j);
            C3866a.m9475a(jSONObject, "first_joined", String.valueOf(!a.f11911A ? 1 : 0));
            if (!a.f11911A) {
                a.f11911A = true;
            }
            C4617b bVar2 = C4617b.f12263e;
            C4617b.m10742a((C4617b) "rtc_first_frame_render", (String) jSONObject, (JSONObject) 0);
            C3868c.m9494a("ttlive_client_linkmic_anchor_frist_frame", j, C5710e.m12494a(jSONObject));
            JSONObject a2 = C5710e.m12494a(jSONObject);
            C89219l.m154721d(a2, "");
            C3868c.m9497b(C5736v.f14551a, 0, a2);
            if (this.f12176d.mo10152b(EnumC4440k.CONNECTION_SUCCEED)) {
                C7398o oVar = new C7398o(2);
                oVar.f18329b = surfaceView;
                DataChannel dataChannel = this.f12175c;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C4450t.class, oVar);
                    this.f12175c.mo28320c(C4447q.class, "");
                    this.f12186n = true;
                }
                ((AbstractC4569a) this.f38654y).mo10329a("OnFirstRemoteVideoFrame", "position:LinkCross; interactId:".concat(String.valueOf(str)));
                ((AbstractC4569a) this.f38654y).mo10334d();
                C5009a.m11205a(C5009a.f13036g, "check_permission_request", new JSONObject(), false, 12);
                C5009a.f13030a = System.currentTimeMillis();
                ((AbstractC11181z) ((LinkBattleApi) C5805e.m12718a().mo11572a(LinkBattleApi.class)).checkPermission().mo143274a(mo13749v())).mo17950a(new C4575k(this), new C4576l(this));
                AbstractC88412b bVar3 = C5727u.f14535g;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                C5727u.C5731d.m12586a();
                try {
                    if (C5727u.f14530b == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (C5727u.f14531c == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (C5727u.f14532d != null) {
                        if (C5727u.f14533e.get("inviter_id") == null || !(!C89219l.m154714a((Object) C5727u.f14533e.get("inviter_id"), (Object) ""))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (C5727u.f14534f.get("invitee_id") == null || !(!C89219l.m154714a((Object) C5727u.f14534f.get("invitee_id"), (Object) ""))) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else {
                            C5727u.f14535g = AbstractC88979t.m154284a(1, TimeUnit.MINUTES).mo143271a(new C11191f()).mo143254a(C5727u.C5732e.f14547a, C5727u.C5733f.f14548a);
                            if (this.f12173a != null) {
                                ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).likeMicStateChange(this.f12173a.getId(), 0, this.f12174b);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10311b(String str, String str2) {
        C4618a aVar;
        C4619b a = C4621b.m10747a(str2);
        if (a != null && a.f12266b == this.f12176d.f11957e && TextUtils.equals(a.f12265a, "co_host_reply_msg") && (aVar = (C4618a) C4621b.m10748a(a.f12267c, C4618a.class)) != null) {
            int i = aVar.f12264a;
            String b = C4139e.C4140a.f11576c.mo46674b(a);
            C89219l.m154721d(str, "");
            C89219l.m154721d(b, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "from_linkmic_id", str);
            C3866a.m9475a(jSONObject, "message", b);
            C3866a.m9475a(jSONObject, "reply_status", String.valueOf(i));
            C4617b bVar = C4617b.f12263e;
            C4617b.m10742a((C4617b) "receive_reply_with_rtc_msg", (String) jSONObject, (JSONObject) 0);
            if (!this.f12176d.f11955c) {
                this.f18624w.mo28320c(C4493d.class, Integer.valueOf(aVar.f12264a));
            }
        }
    }
}
