package com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.android.live.liveinteract.api.C4387aa;
import com.bytedance.android.live.liveinteract.api.C4388ab;
import com.bytedance.android.live.liveinteract.api.C4389ac;
import com.bytedance.android.live.liveinteract.api.C4390ad;
import com.bytedance.android.live.liveinteract.api.C4392af;
import com.bytedance.android.live.liveinteract.api.C4405as;
import com.bytedance.android.live.liveinteract.api.C4436g;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4453w;
import com.bytedance.android.live.liveinteract.api.C4456z;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4411b;
import com.bytedance.android.live.liveinteract.api.p261b.C4421j;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5343b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5140a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5175b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.C5176c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.C5178d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5189g;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.C5223i;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p354e.C5517c;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5387c;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5389e;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5390f;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5391g;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5394j;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5591d;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5592e;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5594g;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5595h;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5596i;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5597j;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5598k;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5599l;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5601n;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5602o;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5605r;
import com.bytedance.android.live.liveinteract.multilive.p361d.C5607a;
import com.bytedance.android.live.liveinteract.multilive.p361d.C5609b;
import com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5686e;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5687f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5710e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5712g;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5727u;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.C5786r;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a;
import com.bytedance.android.livesdk.chatroom.model.C7687g;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7656a;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7665d;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.model.p495b.p496a.C7657a;
import com.bytedance.android.livesdk.chatroom.model.p495b.p496a.C7658b;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7677b;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkInteractAudienceOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveFixCheckPluginErrorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReceiveInviteMessageTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicMsgOptimizationSwitchSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p581a.C9746a;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9755e;
import com.bytedance.android.livesdk.model.message.p580d.p588h.C9771a;
import com.bytedance.android.livesdk.model.message.p580d.p588h.C9772b;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9780a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14664k;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.bytertc.engine.livertc.LiveRTCEngine;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88429b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c */
public final class C5300c extends AbstractC7501r<C5189g.AbstractC5191b> implements AbstractC5175b, AbstractC5666b, AbstractC5675a, OnMessageListener {

    /* renamed from: v */
    public static final C5301a f13724v = new C5301a((byte) 0);

    /* renamed from: A */
    private boolean f13725A;

    /* renamed from: B */
    private boolean f13726B;

    /* renamed from: C */
    private C5223i f13727C;

    /* renamed from: D */
    private int f13728D;

    /* renamed from: E */
    private final AbstractC89244h f13729E;

    /* renamed from: F */
    private final AbstractC89244h f13730F;

    /* renamed from: G */
    private Handler f13731G;

    /* renamed from: H */
    private final C5153d.AbstractC5154a f13732H;
    @AbstractC4430d(mo10204a = "RTC_CONTROLLER")

    /* renamed from: a */
    public C5668c f13733a;
    @AbstractC4430d(mo10204a = "LINK_USER_INFO_CENTER")

    /* renamed from: b */
    public C5153d f13734b;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c */
    public C5271a f13735c;

    /* renamed from: d */
    public boolean f13736d;

    /* renamed from: e */
    public boolean f13737e;

    /* renamed from: f */
    public boolean f13738f;

    /* renamed from: g */
    public boolean f13739g;

    /* renamed from: h */
    public boolean f13740h;

    /* renamed from: i */
    public EnumC5315b f13741i = EnumC5315b.NONE;

    /* renamed from: j */
    public boolean f13742j;

    /* renamed from: k */
    public boolean f13743k;

    /* renamed from: l */
    public C5189g.AbstractC5190a f13744l;

    /* renamed from: m */
    public final C4386c f13745m;

    /* renamed from: n */
    AbstractC7600a f13746n;

    /* renamed from: o */
    public String f13747o;

    /* renamed from: p */
    public C5178d f13748p;

    /* renamed from: q */
    public EnumC4422k f13749q;

    /* renamed from: r */
    public boolean f13750r;

    /* renamed from: s */
    public C5830b<Void, C7656a> f13751s;

    /* renamed from: t */
    public final Room f13752t;

    /* renamed from: u */
    public final DataChannel f13753u;

    /* renamed from: z */
    private boolean f13754z;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$b */
    public enum EnumC5315b {
        NONE,
        SUCCEED,
        FAILED;

        static {
            Covode.recordClassIndex(5907);
        }
    }

    static {
        Covode.recordClassIndex(5892);
    }

    /* renamed from: x */
    private final C5609b m11731x() {
        return (C5609b) this.f13730F.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10289a(int i, long j, Object... objArr) {
        C89219l.m154721d(objArr, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10292a(long j, long j2) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo11149a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10307b(long j, int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo11151b(String str, Boolean bool) {
        C89219l.m154721d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10311b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: d */
    public final void mo10319d(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: g */
    public final void mo10323g() {
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$a */
    public static final class C5301a {
        static {
            Covode.recordClassIndex(5893);
        }

        private C5301a() {
        }

        public /* synthetic */ C5301a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo10297a(C5189g.AbstractC5191b bVar) {
        super.mo10297a((AbstractC8094bq) bVar);
        C6894d.m14753a().f17257b = true;
        C5153d dVar = this.f13734b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        dVar.mo10902a(this.f13732H);
        C5153d dVar2 = this.f13734b;
        if (dVar2 == null) {
            C89219l.m154710a("mInfoCenter");
        }
        dVar2.mo10898a();
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11447a(this);
        IMessageManager iMessageManager = this.f18625x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.LINK_MIC.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.f18625x;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC9596a.LINK_MESSAGE.getIntType(), this);
        }
        this.f13753u.mo28312a(this, C5687f.class, new C5316c(this));
        this.f13753u.mo28312a(this, C5686e.class, new C5325l(this)).mo28312a(this, C4389ac.class, new C5326m(this)).mo28312a(this, C4387aa.class, new C5327n(this)).mo28312a(this, C4388ab.class, new C5328o(this)).mo28312a(this, C4456z.class, new C5329p(this)).mo28312a(this, C4453w.class, new C5330q(this)).mo28310a(C4392af.class, (AbstractC89172b) new C5331r(this)).mo28312a(this, C5596i.class, new C5332s(this)).mo28312a(this, C5597j.class, new C5317d(this)).mo28312a(this, C5592e.class, new C5318e(this)).mo28312a(this, C5595h.class, new C5319f(this)).mo28312a(this, C5394j.class, new C5320g(this)).mo28310a(C5389e.class, (AbstractC89172b) new C5321h(this)).mo28310a(C5391g.class, (AbstractC89172b) new C5322i(this)).mo28310a(C5390f.class, (AbstractC89172b) new C5323j(this)).mo28310a(C5786r.class, (AbstractC89172b) new C5324k(this));
        User owner = this.f13752t.getOwner();
        long id = this.f13752t.getId();
        C89219l.m154716b(owner, "");
        ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).isShowGuestLinkHint(id, owner.getId(), owner.getSecUid()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(C5314al.f13772a);
        User owner2 = this.f13752t.getOwner();
        C89219l.m154716b(owner2, "");
        FollowInfo followInfo = owner2.getFollowInfo();
        C89219l.m154716b(followInfo, "");
        C5713h.m12514a("connection_button", followInfo.getFollowStatus());
        User owner3 = this.f13752t.getOwner();
        C89219l.m154716b(owner3, "");
        FollowInfo followInfo2 = owner3.getFollowInfo();
        C89219l.m154716b(followInfo2, "");
        C5713h.m12514a("connection_request", followInfo2.getFollowStatus());
    }

    /* renamed from: a */
    public final void mo11146a(C5830b<Void, C7656a> bVar) {
        C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f38654y;
        if (bVar2 != null) {
            C7656a aVar = (C7656a) bVar.extra;
            String str = null;
            List<C7665d> list = aVar != null ? aVar.f18971a : null;
            C7656a aVar2 = (C7656a) bVar.extra;
            if (aVar2 != null) {
                str = aVar2.f18972b;
            }
            bVar2.mo10967a(list, str);
        }
    }

    /* renamed from: a */
    public final void mo11148a(String str, PrivacyCert privacyCert) {
        if (this.f38654y != null) {
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            a.mo13186a(false);
            if (this.f13739g) {
                m11730h(str);
            } else {
                mo11164p();
            }
            m11727a(privacyCert, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.bytedance.android.livesdk.chatroom.interact.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5175b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10934a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c.mo10934a(boolean):void");
    }

    /* renamed from: a */
    public final void mo11147a(PrivacyCert privacyCert) {
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        if (!cVar.mo11453b()) {
            C5668c cVar2 = this.f13733a;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar2.mo11449a(privacyCert);
            if (this.f13726B) {
                mo11160l();
            } else {
                mo11159k();
            }
            C5714i.m12561d(false);
            C5668c cVar3 = this.f13733a;
            if (cVar3 == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar3.mo11456d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10299a(String str) {
        C89219l.m154721d(str, "");
        C5153d dVar = this.f13734b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        C5714i.m12546a(false, dVar.mo10903b(str), str);
        C5702a.m12456b("OnUserJoined", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        if (aVar.f13637h) {
            C5668c cVar = this.f13733a;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar.mo11446a(m11731x().mo11388a(str));
            C5271a aVar2 = this.f13735c;
            if (aVar2 == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar2.f13644o++;
            C5271a aVar3 = this.f13735c;
            if (aVar3 == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar3.f13644o == 1) {
                C5586a aVar4 = C5586a.f14226b;
                C5271a aVar5 = this.f13735c;
                if (aVar5 == null) {
                    C89219l.m154710a("mDataHolder");
                }
                C5586a.m12129a(aVar4, "connection_start", Integer.valueOf(aVar5.f13641l + 1), 2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10301a(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        C5714i.m12538a(str, false);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10300a(String str, long j) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            C5153d dVar = this.f13734b;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5714i.m12557b(false, dVar.mo10903b(str), str);
            C5702a.m12456b("OnUserLeaved", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            if (bVar != null) {
                bVar.mo10964a(str);
            }
            C5271a aVar = this.f13735c;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar.f13637h) {
                C5271a aVar2 = this.f13735c;
                if (aVar2 == null) {
                    C89219l.m154710a("mDataHolder");
                }
                aVar2.f13644o--;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10294a(C5600m mVar, String str) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        C5714i.m12548a(false, mVar.f14240d, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10302a(String str, String str2) {
        C5601n nVar;
        ArrayList<C5602o> arrayList;
        C5601n nVar2;
        ArrayList<C5602o> arrayList2;
        C5601n nVar3;
        ArrayList<C5602o> arrayList3;
        C5601n nVar4;
        ArrayList<C5602o> arrayList4;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        if (aVar.f13637h) {
            this.f13729E.getValue();
            C5600m a = C5607a.m12149a(str2);
            if (a != null) {
                Long l = a.f14239c;
                long j = 0;
                if (l != null) {
                    long longValue = l.longValue();
                    if (longValue > 0) {
                        j = C11200a.m19851a() - longValue;
                    }
                }
                C5714i.m12549a(false, a.f14240d, str2, j);
                C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
                if (bVar != null) {
                    bVar.mo10962a(a);
                }
                String str3 = a.f14237a;
                switch (str3.hashCode()) {
                    case -1564391306:
                        if (!(!str3.equals("onGuestVideoFrameSuc") || (nVar = a.f14238b) == null || (arrayList = nVar.f14242b) == null)) {
                            for (T t : arrayList) {
                                C5271a aVar2 = this.f13735c;
                                if (aVar2 == null) {
                                    C89219l.m154710a("mDataHolder");
                                }
                                if (!aVar2.f13633d && C89219l.m154714a((Object) t.f14243a, (Object) m11724A())) {
                                    mo11153c(false);
                                }
                            }
                            return;
                        }
                        return;
                    case -755092020:
                        if (!(!str3.equals("onSyncVideoMuteStatus") || (nVar2 = a.f14238b) == null || (arrayList2 = nVar2.f14242b) == null)) {
                            for (T t2 : arrayList2) {
                                if (!C89219l.m154714a((Object) t2.f14243a, (Object) m11724A())) {
                                    mo10303a(t2.f14243a, t2.f14245c);
                                }
                            }
                            return;
                        }
                        return;
                    case 1072565792:
                        if (!(!str3.equals("onAnchorVideoMute") || (nVar3 = a.f14238b) == null || (arrayList3 = nVar3.f14242b) == null)) {
                            for (T t3 : arrayList3) {
                                String str4 = t3.f14243a;
                                boolean z = t3.f14245c;
                                C5271a aVar3 = this.f13735c;
                                if (aVar3 == null) {
                                    C89219l.m154710a("mDataHolder");
                                }
                                aVar3.mo11108a().put(str4, Boolean.valueOf(z));
                                this.f13753u.mo28320c(C5590c.class, Boolean.valueOf(!z));
                            }
                            return;
                        }
                        return;
                    case 1961349627:
                        if (!(!str3.equals("onGuestVideoMute") || (nVar4 = a.f14238b) == null || (arrayList4 = nVar4.f14242b) == null)) {
                            for (T t4 : arrayList4) {
                                if (!C89219l.m154714a((Object) t4.f14243a, (Object) m11724A())) {
                                    mo10303a(t4.f14243a, t4.f14245c);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10291a(long j, int i) {
        if (i == 200) {
            C5714i.m12565f(false);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(i));
        hashMap.put("msg_id", String.valueOf(j));
        C5714i.m12551a(false, (HashMap<String, Object>) hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10303a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.mo11108a().put(str, Boolean.valueOf(z));
        this.f13753u.mo28320c(C5599l.class, new C5605r(str, z));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$aj */
    static final class C5312aj extends AbstractC89220m implements AbstractC89171a<C5609b> {

        /* renamed from: a */
        public static final C5312aj f13770a = new C5312aj();

        static {
            Covode.recordClassIndex(5904);
        }

        C5312aj() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5609b invoke() {
            return new C5609b();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ai */
    static final class C5311ai extends AbstractC89220m implements AbstractC89171a<C5607a> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13769a;

        static {
            Covode.recordClassIndex(5903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5311ai(C5300c cVar) {
            super(0);
            this.f13769a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5607a invoke() {
            return new C5607a(this.f13769a.f13753u);
        }
    }

    /* renamed from: A */
    private static String m11724A() {
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        return a.f17260e;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5175b
    /* renamed from: a */
    public final void mo10933a() {
        AbstractC7600a aVar = this.f13746n;
        if (aVar != null) {
            aVar.mo9070a();
        }
        C5702a.m12455b("LinkIn_startVideoCapture");
    }

    /* renamed from: h */
    public final C5668c mo11156h() {
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        return cVar;
    }

    /* renamed from: i */
    public final C5153d mo11157i() {
        C5153d dVar = this.f13734b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        return dVar;
    }

    /* renamed from: j */
    public final C5271a mo11158j() {
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$v */
    public static final class RunnableC5335v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f13797a;

        static {
            Covode.recordClassIndex(5927);
        }

        RunnableC5335v(Activity activity) {
            this.f13797a = activity;
        }

        public final void run() {
            String str = Build.MODEL;
            C89219l.m154716b(str, "");
            if (C89219l.m154714a((Object) "SO-04J", (Object) str)) {
                this.f13797a.recreate();
            }
        }
    }

    /* renamed from: z */
    private static long m11733z() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        return b.mo13161c();
    }

    /* renamed from: n */
    public final C89391z mo11162n() {
        C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
        if (bVar == null) {
            return null;
        }
        C5153d dVar = this.f13734b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        bVar.mo10966a(dVar.f13347b);
        return C89391z.f203057a;
    }

    /* renamed from: o */
    public final void mo11163o() {
        C5223i iVar = this.f13727C;
        if (iVar != null && iVar.mo18054n()) {
            C5223i iVar2 = this.f13727C;
            if (iVar2 != null) {
                iVar2.dismiss();
            }
            this.f13727C = null;
        }
    }

    /* renamed from: p */
    public final void mo11164p() {
        if (this.f38654y != null) {
            C5189g.AbstractC5190a aVar = this.f13744l;
            if (aVar != null) {
                aVar.mo10956a();
            }
            C4386c a = C4386c.m10499a();
            C89219l.m154716b(a, "");
            a.mo10160b();
            m11732y();
        }
    }

    /* renamed from: r */
    public final boolean mo11166r() {
        Boolean valueOf;
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(aVar.f13637h);
        }
        return valueOf.booleanValue();
    }

    /* renamed from: y */
    private final void m11732y() {
        C5189g.AbstractC5191b bVar;
        this.f13753u.mo28320c(C4441l.class, new C7399p(4));
        C4386c.m10499a().mo10159a((Integer) 0);
        if (this.f38654y != null && (bVar = (C5189g.AbstractC5191b) this.f38654y) != null) {
            bVar.mo10973d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5175b
    /* renamed from: d */
    public final void mo10936d() {
        JSONObject jSONObject = new JSONObject();
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        C3866a.m9475a(jSONObject, "rtc_ext_info", a.f17262g);
        C5714i iVar = C5714i.f14494j;
        C5714i.m12550a((C5714i) false, (boolean) "rtc_dispose", (String) jSONObject, (JSONObject) 0);
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        Client client = cVar.f14400g;
        if (client != null) {
            client.dispose();
        }
    }

    /* renamed from: m */
    public final void mo11161m() {
        ((AbstractC11137ac) ((LinkReviewApi) C5805e.m12718a().mo11572a(LinkReviewApi.class)).bannedInfo(13).mo142916a(mo13749v())).mo17937a(new C5303ab(this), new C5304ac(this));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: f */
    public final void mo10322f() {
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        if (a.f17258c) {
            mo11148a("rtc_end", PrivacyCert.Builder.Companion.with("bpea-780").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        C6894d.m14753a().f17276w = false;
        this.f13748p.f13396a.mo10929d();
        this.f13725A = false;
        this.f13742j = false;
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.f13642m = false;
        this.f13754z = false;
        this.f13728D = -1;
        C5702a.m12456b("onEndSuccess", "position:LinkIn_Guest");
        C5714i.m12563e(false);
        this.f13753u.mo28320c(C4436g.class, new C4411b(false, null));
        this.f13747o = null;
        C5727u.m12585a();
    }

    /* renamed from: k */
    public final void mo11159k() {
        this.f13726B = false;
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        if (cVar.f14397d) {
            m11729e(false);
            C5668c cVar2 = this.f13733a;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar2.mo11452b(false);
            if (this.f13734b == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5153d.m11387a(C5153d.EnumC5156c.FOREGROUND);
            AbstractC7600a aVar = this.f13746n;
            if (aVar != null) {
                aVar.mo9073b_(PrivacyCert.Builder.Companion.with("bpea-402").usage("").tag("Switch to the foreground during link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            C5271a aVar2 = this.f13735c;
            if (aVar2 == null) {
                C89219l.m154710a("mDataHolder");
            }
            if (aVar2.f13633d) {
                m11728d(true);
            }
        }
        if (C6894d.m14753a().f17273t > 0) {
            C5741z.m12609c(null);
        }
    }

    /* renamed from: l */
    public final void mo11160l() {
        this.f13726B = true;
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        if (cVar.f14397d) {
            m11729e(true);
            C5668c cVar2 = this.f13733a;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar2.mo11458g();
            if (this.f13734b == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C5153d.m11387a(C5153d.EnumC5156c.BACKGROUND);
            AbstractC7600a aVar = this.f13746n;
            if (aVar != null) {
                aVar.mo9072a_(PrivacyCert.Builder.Companion.with("bpea-396").usage("").tag("guest switch to background during link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
        if (C6894d.m14753a().f17273t > 0) {
            C5741z.m12610d(null);
        }
    }

    /* renamed from: q */
    public final void mo11165q() {
        if (!this.f13738f) {
            if (C6894d.m14753a().f17277x) {
                C6555i.m14021b();
                C6555i.m9463b("multi-guest", "join channel, but guest is leaving or already left");
                return;
            }
            this.f13738f = true;
            this.f13739g = true;
            C5702a.m12449a("LinkIn_JoinChannel", "position:Guest; roomId:" + this.f13752t.getId());
            C5714i.m12552b();
            long id = this.f13752t.getId();
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            ((AbstractC11137ac) ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).joinChannelV1(id, a.f17274u).mo142916a(mo13749v())).mo17937a(new C5307ae(this), new C5308af(this));
        }
    }

    /* renamed from: t */
    public final AbstractC11137ac<C5832d<C5594g>> mo11168t() {
        long j;
        long j2;
        boolean z;
        if (this.f38654y == null) {
            return null;
        }
        try {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j2 = room.getId();
                j = room.getOwnerUserId();
            } else {
                j = 0;
                j2 = 0;
            }
            if (j2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (j != 0) {
                return (AbstractC11137ac) ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).getListByType(j2, j, j2, 3).mo142912a(new C5302aa(this)).mo142916a(mo13749v());
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ak */
    public static final class C5313ak extends C5153d.AbstractC5154a {

        /* renamed from: a */
        final /* synthetic */ C5300c f13771a;

        static {
            Covode.recordClassIndex(5905);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            boolean z;
            boolean z2;
            if (this.f13771a.mo11158j().f13637h) {
                this.f13771a.f13753u.mo28315b(C4405as.class, new C4421j(this.f13771a.mo11158j().f13646q, this.f13771a.mo11157i().mo10910g()));
                AbstractC11137ac<C5832d<C5594g>> t = this.f13771a.mo11168t();
                if (t != null) {
                    t.mo17938a(new C6873g());
                }
            }
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13771a.f38654y;
            if (bVar != null) {
                bVar.mo10971b(this.f13771a.mo11157i().f13347b);
            }
            if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                long c = b.mo13161c();
                if (this.f13771a.mo11142a(c) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f13771a.mo11142a(c) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && this.f13771a.mo11156h().f14397d) {
                    if (!z2 || !LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                        this.f13771a.mo11148a("leave_with_linked_changed", PrivacyCert.Builder.Companion.with("bpea-471").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5313ak(C5300c cVar) {
            this.f13771a = cVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p321e.AbstractC5175b
    /* renamed from: c */
    public final void mo10935c() {
        AbstractC7600a aVar;
        if (!this.f13754z) {
            this.f13754z = true;
            C5702a.m12455b("LinkIn_turnOnEngine");
            C6894d.m14753a().f17264i = System.currentTimeMillis();
            C5714i.m12544a(false);
            C6894d.m14753a().f17276w = true;
            if (LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue() && (aVar = this.f13746n) != null && (aVar instanceof AbstractC3060a)) {
                ((AbstractC3060a) aVar).mo8324b(PrivacyCert.Builder.Companion.with("bpea-1048").usage("").tag("Multi guest pre init strategy start audio ").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            C5668c cVar = this.f13733a;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            Client client = cVar.f14400g;
            if (client != null) {
                client.joinChannel();
            }
            C5668c cVar2 = this.f13733a;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            if (cVar2.f14394a != null) {
                C5668c cVar3 = this.f13733a;
                if (cVar3 == null) {
                    C89219l.m154710a("mRtcController");
                }
                LiveCore.InteractConfig interactConfig = cVar3.f14394a;
                Config.MixStreamType mixStreamType = null;
                if (!(interactConfig == null || interactConfig.getMixStreamType() == null || !TestDisableMixStreamTypeSetting.INSTANCE.getValue())) {
                    C5668c cVar4 = this.f13733a;
                    if (cVar4 == null) {
                        C89219l.m154710a("mRtcController");
                    }
                    LiveCore.InteractConfig interactConfig2 = cVar4.f14394a;
                    if (interactConfig2 != null) {
                        mixStreamType = interactConfig2.getMixStreamType();
                    }
                    this.f13753u.mo28315b(C4390ad.class, String.valueOf(mixStreamType));
                }
            }
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            if (bVar != null) {
                C6894d a = C6894d.m14753a();
                C89219l.m154716b(a, "");
                bVar.mo10965a(a.f17260e, (SurfaceView) this.f13746n);
            }
        }
    }

    /* renamed from: s */
    public final String mo11167s() {
        String str;
        List<C7666e> list;
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        int i = C5343b.f13813b[aVar.f13646q.ordinal()];
        if (i == 1) {
            str = aVar.mo11112c().get(101L);
        } else if (i == 2) {
            str = aVar.mo11112c().get(102L);
        } else if (i == 3) {
            Object a = C4431e.f12034a.mo10199a("LINK_USER_INFO_CENTER");
            if (!(a instanceof C5153d)) {
                a = null;
            }
            C5153d dVar = (C5153d) a;
            if (!(dVar == null || (list = dVar.f13347b) == null)) {
                int size = list.size();
                if (size == 2) {
                    str = aVar.mo11112c().get(103L);
                } else if (size == 3) {
                    str = aVar.mo11112c().get(104L);
                } else if (size == 4) {
                    str = aVar.mo11112c().get(105L);
                }
            }
            str = aVar.mo11112c().get(101L);
        } else if (i != 4) {
            str = aVar.mo11112c().get(0L);
        } else {
            str = aVar.mo11112c().get(105L);
        }
        if (str == null || !C11279p.m20013a((CharSequence) str)) {
            return this.f13747o;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r9.f13743k == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        if (1 != r0.intValue()) goto L_0x003b;
     */
    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8577b() {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5300c.mo8577b():void");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: e */
    public final void mo10320e() {
        DialogC5211a.EnumC5215a aVar;
        DialogC5211a.EnumC5215a aVar2;
        String str;
        String str2;
        String str3;
        if (this.f38654y != null) {
            C5702a.m12456b("OnStartSuccess", "position:LinkIn_Guest");
            C5714i.m12560c(false);
            C4384b.C4385a.m10496a().f11918H = System.currentTimeMillis();
            this.f13754z = false;
            C4386c.m10499a().mo10159a((Integer) 2);
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            DialogC5211a.EnumC5215a aVar3 = null;
            if (bVar != null) {
                aVar = bVar.mo10976h();
            } else {
                aVar = null;
            }
            if (aVar != DialogC5211a.EnumC5215a.SEND_REQUEST || !this.f13742j) {
                C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f38654y;
                if (bVar2 != null) {
                    aVar2 = bVar2.mo10976h();
                } else {
                    aVar2 = null;
                }
                if (aVar2 == DialogC5211a.EnumC5215a.GO_LIVE && this.f13741i == EnumC5315b.SUCCEED && this.f13742j) {
                    mo11150b(PrivacyCert.Builder.Companion.with("bpea-512").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
            } else {
                mo11150b(PrivacyCert.Builder.Companion.with("bpea-511").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            C4386c a = C4386c.m10499a();
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f13752t.getId()));
            hashMap.put("channel_id", String.valueOf(this.f13752t.getId()));
            hashMap.put("connection_type", "audience");
            if (a.f11987h) {
                str = String.valueOf(C11225an.m19878a(a.f11989j));
            } else {
                str = "1440";
            }
            hashMap.put("time", str);
            hashMap.put("anchor_id", String.valueOf(this.f13752t.getOwnerUserId()));
            if (C4386c.m10499a().f11990k == 1) {
                str2 = "video";
            } else {
                str2 = "voice";
            }
            hashMap.put("guest_connection_type", str2);
            hashMap.put("weight_decay_type", String.valueOf(C4386c.m10499a().f11991l));
            hashMap.put("live_type", "video_live");
            if (this.f38654y != null) {
                C5189g.AbstractC5191b bVar3 = (C5189g.AbstractC5191b) this.f38654y;
                if (bVar3 != null) {
                    aVar3 = bVar3.mo10976h();
                }
                if (aVar3 == DialogC5211a.EnumC5215a.SEND_REQUEST) {
                    str3 = "guest_apply_anchor";
                } else {
                    str3 = "anchor_invite_guest";
                }
                hashMap.put("guest_invite_type", str3);
                C89219l.m154721d(str3, "");
                C5712g.f14476a = System.currentTimeMillis();
                C5712g.f14477b = str3;
            }
            User owner = this.f13752t.getOwner();
            C89219l.m154716b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            C5271a aVar4 = this.f13735c;
            if (aVar4 == null) {
                C89219l.m154710a("mDataHolder");
            }
            hashMap.put("layout_setting", C5586a.m12128a(aVar4.f13646q).getFirst());
            C5271a aVar5 = this.f13735c;
            if (aVar5 == null) {
                C89219l.m154710a("mDataHolder");
            }
            hashMap.put("window_setting", C5586a.m12128a(aVar5.f13646q).getSecond());
            C6501b.C6502a.m13948a("guest_connection_success").mo12652a((Map<String, String>) hashMap).mo12658d("live_detail").mo12654b("live_function").mo12643a(this.f13753u).mo12655b();
            C6528g gVar = new C6528g();
            User owner2 = this.f13752t.getOwner();
            C89219l.m154716b(owner2, "");
            gVar.f16298a = owner2.getId();
            C89219l.m154716b(gVar, "");
            gVar.f16299b = m11733z();
            String str4 = C4384b.C4385a.m10496a().f11976x;
            if (!TextUtils.isEmpty(str4)) {
                if (str4 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("request_id", str4);
            }
            C6501b.C6502a.m13948a("connection_success").mo12652a((Map<String, String>) hashMap).mo12642a(gVar).mo12655b();
            DataChannel dataChannel = this.f13753u;
            C6894d a2 = C6894d.m14753a();
            C89219l.m154716b(a2, "");
            Config.Vendor fromValue = Config.Vendor.fromValue(a2.f17261f);
            C89219l.m154716b(fromValue, "");
            dataChannel.mo28320c(C4436g.class, new C4411b(true, fromValue.name()));
            C5727u.EnumC5730c cVar = C5727u.EnumC5730c.AUDIENCE;
            C89219l.m154721d(cVar, "");
            if (!C5727u.f14529a) {
                C5727u.f14529a = true;
                C5727u.f14530b = cVar;
                C5727u.f14531c = C5727u.EnumC5729b.AUDIENCE_LINKMIC;
                AbstractC88412b bVar4 = C5727u.f14535g;
                if (bVar4 != null) {
                    bVar4.dispose();
                }
                C5727u.f14535g = AbstractC88979t.m154284a(1, TimeUnit.MINUTES).mo143271a(new C11191f()).mo143254a(new C5727u.C5734g(cVar), C5727u.C5735h.f14550a);
            }
            if (this.f13741i == EnumC5315b.FAILED) {
                mo11148a("reply", PrivacyCert.Builder.Companion.with("bpea-475").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$w */
    public static final class C5336w implements AbstractC6656d {

        /* renamed from: a */
        final /* synthetic */ C5300c f13798a;

        /* renamed from: b */
        final /* synthetic */ Context f13799b;

        /* renamed from: c */
        final /* synthetic */ int f13800c;

        static {
            Covode.recordClassIndex(5928);
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
        /* renamed from: b */
        public final void mo11014b(String... strArr) {
            C89219l.m154721d(strArr, "");
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$w$a */
        public static final class C5337a implements IHostPlugin.AbstractC11790a {

            /* renamed from: a */
            final /* synthetic */ C5336w f13801a;

            static {
                Covode.recordClassIndex(5929);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C5337a(C5336w wVar) {
                this.f13801a = wVar;
            }

            @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.AbstractC11790a
            /* renamed from: a */
            public final void mo8919a(String str) {
                Context context;
                EnumC8917a aVar;
                C89219l.m154721d(str, "");
                C5300c cVar = this.f13801a.f13798a;
                int i = this.f13801a.f13800c;
                if (cVar.f38654y != null) {
                    C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) cVar.f38654y;
                    if (bVar != null) {
                        context = bVar.getContext();
                    } else {
                        context = null;
                    }
                    if (LiveFixCheckPluginErrorSetting.INSTANCE.getValue()) {
                        aVar = EnumC8917a.Camera;
                    } else {
                        aVar = EnumC8917a.LiveResource;
                    }
                    if (aVar.isInstalled()) {
                        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).init();
                        cVar.mo11144a((C5300c) i, false);
                        return;
                    }
                    aVar.checkInstall(context, "interact", new C5338x(cVar, i));
                }
            }
        }

        @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
        /* renamed from: a */
        public final void mo11013a(String... strArr) {
            C89219l.m154721d(strArr, "");
            EnumC8917a.LiveResource.checkInstall(this.f13799b, "interact", new C5337a(this));
        }

        C5336w(C5300c cVar, Context context, int i) {
            this.f13798a = cVar;
            this.f13799b = context;
            this.f13800c = i;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$x */
    public static final class C5338x implements IHostPlugin.AbstractC11790a {

        /* renamed from: a */
        final /* synthetic */ C5300c f13802a;

        /* renamed from: b */
        final /* synthetic */ int f13803b;

        static {
            Covode.recordClassIndex(5930);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$x$b */
        static final class C5340b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C5340b f13805a = new C5340b();

            static {
                Covode.recordClassIndex(5932);
            }

            C5340b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                C3854a.m9459b(th.getMessage());
            }
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.AbstractC11790a
        /* renamed from: a */
        public final void mo8919a(String str) {
            C89219l.m154721d(str, "");
            ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).loadShortVideoRes().mo143254a(new C5339a(this), C5340b.f13805a);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$x$a */
        static final class C5339a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C5338x f13804a;

            static {
                Covode.recordClassIndex(5931);
            }

            C5339a(C5338x xVar) {
                this.f13804a = xVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                int intValue = ((Number) obj).intValue();
                if (intValue == 1) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gv1);
                } else if (intValue != 2) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gv0);
                } else {
                    ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).init();
                    this.f13804a.f13802a.mo11144a((C5300c) this.f13804a.f13803b, false);
                }
            }
        }

        C5338x(C5300c cVar, int i) {
            this.f13802a = cVar;
            this.f13803b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$d */
    public static final class C5317d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13775a;

        static {
            Covode.recordClassIndex(5909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5317d(C5300c cVar) {
            super(1);
            this.f13775a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f13775a.mo11153c(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$g */
    public static final class C5320g extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13778a;

        static {
            Covode.recordClassIndex(5912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5320g(C5300c cVar) {
            super(1);
            this.f13778a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13778a.mo11154f("leave_normally");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$h */
    public static final class C5321h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13779a;

        static {
            Covode.recordClassIndex(5913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5321h(C5300c cVar) {
            super(1);
            this.f13779a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13779a.mo11163o();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$i */
    public static final class C5322i extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13780a;

        static {
            Covode.recordClassIndex(5914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5322i(C5300c cVar) {
            super(1);
            this.f13780a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13780a.mo11144a(2, true);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$j */
    public static final class C5323j extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13781a;

        static {
            Covode.recordClassIndex(5915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5323j(C5300c cVar) {
            super(1);
            this.f13781a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13781a.mo11163o();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$k */
    public static final class C5324k extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13782a;

        static {
            Covode.recordClassIndex(5916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5324k(C5300c cVar) {
            super(1);
            this.f13782a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13782a.mo11163o();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$r */
    public static final class C5331r extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13789a;

        static {
            Covode.recordClassIndex(5923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5331r(C5300c cVar) {
            super(1);
            this.f13789a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f13789a.mo11155g("leave_source_cancel_with_other");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$s */
    public static final class C5332s extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13790a;

        static {
            Covode.recordClassIndex(5924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5332s(C5300c cVar) {
            super(1);
            this.f13790a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f13790a.mo11152b(bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10309b(String str) {
        C89219l.m154721d(str, "");
        C5714i.m12559c(str, false);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ad */
    public static final class C5305ad implements AbstractC5665a {

        /* renamed from: a */
        final /* synthetic */ C5300c f13758a;

        /* renamed from: b */
        final /* synthetic */ Context f13759b;

        static {
            Covode.recordClassIndex(5897);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ad$a */
        static final class C5306a implements LiveCore.InteractConfig.UrlDispatcher {

            /* renamed from: a */
            public static final C5306a f13760a = new C5306a();

            static {
                Covode.recordClassIndex(5898);
            }

            C5306a() {
            }

            @Override // com.p2082ss.avframework.livestreamv2.core.LiveCore.InteractConfig.UrlDispatcher
            public final String urlDispatch(String str) {
                try {
                    C14664k ttUrlDispatch = TTNetInit.ttUrlDispatch(str);
                    C89219l.m154716b(ttUrlDispatch, "");
                    if (TextUtils.isEmpty(ttUrlDispatch.f35595b)) {
                        return str;
                    }
                    return ttUrlDispatch.f35595b;
                } catch (Throwable unused) {
                    return str;
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a
        /* renamed from: a */
        public final LiveCore.InteractConfig mo10326a(LiveCore.InteractConfig interactConfig) {
            Config.VideoQuality videoQuality;
            C89219l.m154721d(interactConfig, "");
            Config logReportInterval = interactConfig.setContext(this.f13759b).setRtcExtInfo(this.f13758a.mo11167s()).setLogReportInterval(5);
            C11738s streamUrlExtraSafely = this.f13758a.f13752t.getStreamUrlExtraSafely();
            C89219l.m154716b(streamUrlExtraSafely, "");
            if (streamUrlExtraSafely.f28105m > 0) {
                videoQuality = Config.VideoQuality.GUEST_HIGH;
            } else {
                videoQuality = Config.VideoQuality.GUEST_NORMAL;
            }
            Config videoQuality2 = logReportInterval.setVideoQuality(videoQuality);
            AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a, "");
            Config volumeCallbackInterval = videoQuality2.setProjectKey(((AbstractC4357d) a).getProjectKey()).setInteractMode(Config.InteractMode.NORMAL).setCharacter(Config.Character.GUEST).setMixStreamType(Config.MixStreamType.SERVER_MIX).enableAudioOnBackground(true).setVolumeCallbackInterval(300);
            C89219l.m154716b(volumeCallbackInterval, "");
            volumeCallbackInterval.setType(Config.Type.VIDEO);
            interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
            interactConfig.setUrlDispatcher(C5306a.f13760a);
            return interactConfig;
        }

        C5305ad(C5300c cVar, Context context) {
            this.f13758a = cVar;
            this.f13759b = context;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ac */
    public static final class C5304ac<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13757a;

        static {
            Covode.recordClassIndex(5896);
        }

        C5304ac(C5300c cVar) {
            this.f13757a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Context context;
            Throwable th = (Throwable) obj;
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13757a.f38654y;
            if (bVar != null) {
                context = bVar.getContext();
            } else {
                context = null;
            }
            C11264f.m19957a(context, th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$o */
    public static final class C5328o extends AbstractC89220m implements AbstractC89172b<C7677b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13786a;

        static {
            Covode.recordClassIndex(5920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5328o(C5300c cVar) {
            super(1);
            this.f13786a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7677b bVar) {
            C7677b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C5189g.AbstractC5191b bVar3 = (C5189g.AbstractC5191b) this.f13786a.f38654y;
            if (bVar3 != null) {
                bVar3.mo10963a(bVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: e */
    private final void m11729e(boolean z) {
        if (z) {
            mo11152b(false);
            return;
        }
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        mo11152b(aVar.f13632c);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: c */
    public final void mo10317c(String str) {
        C3854a.m9453a(5, AbstractC4444o.f12039a, "onWarn: ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ab */
    public static final class C5303ab<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13756a;

        static {
            Covode.recordClassIndex(5895);
        }

        C5303ab(C5300c cVar) {
            this.f13756a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7687g gVar;
            C5832d dVar = (C5832d) obj;
            Context context = null;
            if (dVar != null) {
                gVar = (C7687g) dVar.data;
            } else {
                gVar = null;
            }
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13756a.f38654y;
            if (bVar != null) {
                context = bVar.getContext();
            }
            C5140a.m11379a(gVar, context, (AbstractC1204m) this.f13756a.f38654y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ag */
    public static final class C5309ag<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13763a;

        /* renamed from: b */
        final /* synthetic */ String f13764b;

        /* renamed from: c */
        final /* synthetic */ HashMap f13765c;

        static {
            Covode.recordClassIndex(5901);
        }

        C5309ag(C5300c cVar, String str, HashMap hashMap) {
            this.f13763a = cVar;
            this.f13764b = str;
            this.f13765c = hashMap;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5702a.m12449a("LinkIn_leave_Success", "position:leaveChannel");
            C5714i.m12555b(this.f13764b, this.f13765c);
            this.f13763a.f13740h = false;
            this.f13763a.f13739g = false;
            this.f13763a.f13743k = false;
            C6894d.m14753a().f17277x = true;
            this.f13763a.mo11164p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ah */
    public static final class C5310ah<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13766a;

        /* renamed from: b */
        final /* synthetic */ String f13767b;

        /* renamed from: c */
        final /* synthetic */ HashMap f13768c;

        static {
            Covode.recordClassIndex(5902);
        }

        C5310ah(C5300c cVar, String str, HashMap hashMap) {
            this.f13766a = cVar;
            this.f13767b = str;
            this.f13768c = hashMap;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f13766a.f13740h = false;
            this.f13766a.mo13747a(th);
            C5714i.m12536a(this.f13767b, th, this.f13768c);
            C5702a.m12449a("LinkIn_leave_Failed", "position:leaveChannel; throwable:".concat(String.valueOf(th)));
            C6894d.m14753a().f17277x = false;
            this.f13766a.mo11164p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$al */
    public static final class C5314al<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5314al f13772a = new C5314al();

        static {
            Covode.recordClassIndex(5906);
        }

        C5314al() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i = -1;
            for (C7658b bVar : ((C7657a) ((C5832d) obj).data).f18973a) {
                if (bVar.f18974a == 25) {
                    i = bVar.f18975b;
                }
            }
            if (i == 0 || i == 1) {
                C6894d.m14753a().f17267l = true;
            } else if (i == 2) {
                C6894d.m14753a().f17267l = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$e */
    public static final class C5318e extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13776a;

        static {
            Covode.recordClassIndex(5910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5318e(C5300c cVar) {
            super(1);
            this.f13776a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            AbstractC7600a aVar = this.f13776a.f13746n;
            if (aVar != null && (aVar instanceof AbstractC3060a)) {
                ((AbstractC3060a) aVar).mo8322a(PrivacyCert.Builder.Companion.with("bpea-778").usage("").tag(" multi live guest reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$m */
    public static final class C5326m extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13784a;

        static {
            Covode.recordClassIndex(5918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5326m(C5300c cVar) {
            super(1);
            this.f13784a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            if (this.f13784a.f13749q != null) {
                C5271a j = this.f13784a.mo11158j();
                EnumC4422k kVar = this.f13784a.f13749q;
                if (kVar == null) {
                    C89219l.m154715b();
                }
                j.mo11109a(kVar);
            }
            this.f13784a.f13748p.f13396a.mo10927b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$n */
    public static final class C5327n extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13785a;

        static {
            Covode.recordClassIndex(5919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5327n(C5300c cVar) {
            super(1);
            this.f13785a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                C6894d.m14753a().f17277x = false;
                this.f13785a.f13741i = EnumC5315b.SUCCEED;
                if (this.f13785a.f38654y != null) {
                    if (!MultiLiveServerAutoJoinChannel.INSTANCE.getValue()) {
                        this.f13785a.mo11165q();
                    } else {
                        this.f13785a.f13739g = true;
                    }
                }
            } else {
                this.f13785a.f13748p.f13396a.mo10928c();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$t */
    public static final class C5333t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13791a;

        /* renamed from: b */
        final /* synthetic */ String f13792b;

        /* renamed from: c */
        final /* synthetic */ HashMap f13793c;

        static {
            Covode.recordClassIndex(5925);
        }

        C5333t(C5300c cVar, String str, HashMap hashMap) {
            this.f13791a = cVar;
            this.f13792b = str;
            this.f13793c = hashMap;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5189g.AbstractC5190a aVar;
            C5702a.m12449a("LinkIn_leave_Success", "position:cancel");
            C5714i.m12555b(this.f13792b, this.f13793c);
            this.f13791a.f13737e = false;
            this.f13791a.f13745m.mo10159a((Integer) 0);
            C6894d.m14753a().f17277x = true;
            if (this.f13791a.f13744l != null && (aVar = this.f13791a.f13744l) != null) {
                aVar.mo10957c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$z */
    public static final class C5342z<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13809a;

        /* renamed from: b */
        final /* synthetic */ boolean f13810b;

        /* renamed from: c */
        final /* synthetic */ int f13811c;

        static {
            Covode.recordClassIndex(5934);
        }

        C5342z(C5300c cVar, boolean z, int i) {
            this.f13809a = cVar;
            this.f13810b = z;
            this.f13811c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f13809a.mo13747a(th);
            C5702a.m12449a("LinkIn_Guest_Permission_Failed", "throwable:".concat(String.valueOf(th)));
            this.f13809a.f13736d = false;
            if (this.f13810b) {
                this.f13809a.mo11163o();
            }
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13809a.f38654y;
            if (bVar != null) {
                bVar.mo10960a(new C5189g.AbstractC5191b.C5192a(th, this.f13811c));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: e */
    public final void mo10321e(String str) {
        C89219l.m154721d(str, "");
        C5714i.m12547a(false, str);
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.mo11114e();
    }

    /* renamed from: f */
    public final void mo11154f(String str) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            mo11148a(str, PrivacyCert.Builder.Companion.with("bpea-476").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$ae */
    public static final class C5307ae<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13761a;

        static {
            Covode.recordClassIndex(5899);
        }

        C5307ae(C5300c cVar) {
            this.f13761a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5189g.AbstractC5191b bVar;
            C5832d dVar = (C5832d) obj;
            C5702a.m12449a("LinkIn_JoinChannel_Success", "position:Guest");
            if (!(dVar == null || dVar.data == null || (bVar = (C5189g.AbstractC5191b) this.f13761a.f38654y) == null)) {
                bVar.mo10963a((C7677b) dVar.data);
            }
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14489d);
            C5714i iVar = C5714i.f14494j;
            C5714i.m12550a((C5714i) false, (boolean) "join_channel_succeed", (String) jSONObject, (JSONObject) 0);
            this.f13761a.f13738f = false;
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12379d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$af */
    public static final class C5308af<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13762a;

        static {
            Covode.recordClassIndex(5900);
        }

        C5308af(C5300c cVar) {
            this.f13762a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C5721p.m12581a(C5721p.f14515c, th);
            this.f13762a.mo13747a(th);
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "error_code", 102L);
            C5714i.m12488a(jSONObject, th);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14489d);
            C5714i.m12550a(false, "join_channel_failed", jSONObject, 1);
            C5736v.m12596e(C5710e.m12494a(jSONObject));
            C5702a.m12449a("LinkIn_JoinChannel_Failed", "position:Guest; throwable:".concat(String.valueOf(th)));
            this.f13762a.f13738f = false;
            if (!(th instanceof C2912a) || ((C2908a) th).getErrorCode() != 40001) {
                C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13762a.f38654y;
                if (bVar != null) {
                    bVar.mo10970b(th);
                    return;
                }
                return;
            }
            C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f13762a.f38654y;
            if (bVar2 != null) {
                bVar2.mo10972c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$f */
    public static final class C5319f extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13777a;

        static {
            Covode.recordClassIndex(5911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5319f(C5300c cVar) {
            super(1);
            this.f13777a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            if (this.f13777a.mo11158j().f13637h) {
                this.f13777a.f13753u.mo28315b(C4405as.class, new C4421j(this.f13777a.mo11158j().f13646q, this.f13777a.mo11157i().mo10910g()));
            }
            this.f13777a.mo11156h().mo11457e(this.f13777a.mo11167s());
            this.f13777a.mo11156h().mo11456d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$p */
    public static final class C5329p extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13787a;

        static {
            Covode.recordClassIndex(5921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5329p(C5300c cVar) {
            super(1);
            this.f13787a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f13787a.f13741i = EnumC5315b.FAILED;
            if (this.f13787a.mo11156h().f14397d) {
                this.f13787a.mo11148a("reply", PrivacyCert.Builder.Companion.with("bpea-472").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$q */
    public static final class C5330q extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13788a;

        static {
            Covode.recordClassIndex(5922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5330q(C5300c cVar) {
            super(1);
            this.f13788a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C6894d.m14753a().f17277x = false;
            this.f13788a.f13743k = true;
            if (!TextUtils.isEmpty(str2)) {
                this.f13788a.f13747o = str2;
                this.f13788a.f13748p.f13396a.mo10930e();
            } else {
                C5178d dVar = this.f13788a.f13748p;
                C6555i.m14021b();
                C6555i.m9462a("PreInitHelper", "downgradeStrategy");
                dVar.f13396a = new C5176c(dVar.f13397b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$u */
    public static final class C5334u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13794a;

        /* renamed from: b */
        final /* synthetic */ String f13795b;

        /* renamed from: c */
        final /* synthetic */ HashMap f13796c;

        static {
            Covode.recordClassIndex(5926);
        }

        C5334u(C5300c cVar, String str, HashMap hashMap) {
            this.f13794a = cVar;
            this.f13795b = str;
            this.f13796c = hashMap;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5189g.AbstractC5190a aVar;
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f13794a.mo13747a(th);
            C5714i.m12536a(this.f13795b, th, this.f13796c);
            C5702a.m12449a("LinkIn_leave_Failed", "position:cancel; throwable:".concat(String.valueOf(th)));
            this.f13794a.f13737e = false;
            this.f13794a.f13745m.mo10159a((Integer) 0);
            C6894d.m14753a().f17277x = false;
            if (this.f13794a.f13744l != null && (aVar = this.f13794a.f13744l) != null) {
                aVar.mo10958c(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$y */
    public static final class C5341y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5300c f13806a;

        /* renamed from: b */
        final /* synthetic */ boolean f13807b;

        /* renamed from: c */
        final /* synthetic */ int f13808c;

        static {
            Covode.recordClassIndex(5933);
        }

        C5341y(C5300c cVar, boolean z, int i) {
            this.f13806a = cVar;
            this.f13807b = z;
            this.f13808c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5830b<Void, C7656a> bVar = (C5830b) obj;
            C89219l.m154721d(bVar, "");
            C5702a.m12449a("LinkIn_Guest_Permission_Success", "response:" + C4139e.C4140a.f11575b.mo46674b(bVar));
            this.f13806a.f13736d = false;
            if (bVar.extra == null) {
                if (this.f13807b) {
                    this.f13806a.mo11163o();
                }
                C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f13806a.f38654y;
                if (bVar2 != null) {
                    bVar2.mo10960a(new C5189g.AbstractC5191b.C5192a(new Exception(), this.f13808c));
                    return;
                }
                return;
            }
            int i = this.f13808c;
            if (i == 2) {
                this.f13806a.f13751s = bVar;
                this.f13806a.f13750r = true;
                DataChannel dataChannel = this.f13806a.f18624w;
                if (dataChannel != null) {
                    dataChannel.mo28319c(C5387c.class);
                }
            } else if (i == 0) {
                this.f13806a.mo11146a(bVar);
            }
        }
    }

    /* renamed from: d */
    private final void m11728d(boolean z) {
        AbstractC7600a aVar = this.f13746n;
        if (aVar != null && (aVar instanceof AbstractC3060a)) {
            if (z) {
                ((AbstractC3060a) aVar).mo8323a_(true, PrivacyCert.Builder.Companion.with("bpea-795").usage("").tag("multi live guest mute local video isVideoEnable: true").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                return;
            }
            ((AbstractC3060a) aVar).mo8323a_(false, PrivacyCert.Builder.Companion.with("bpea-794").usage("").tag("multi live guest mute local video isVideoEnable: false").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    /* renamed from: h */
    private final void m11730h(String str) {
        if (!this.f13740h) {
            C6894d.m14753a().f17277x = true;
            this.f13740h = true;
            C5702a.m12449a("LinkIn_leave", "position:leaveChannel; roomId:" + this.f13752t.getId());
            HashMap<String, Object> b = C5714i.m12490b(false);
            C5714i.m12537a(str, b);
            long id = this.f13752t.getId();
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).leave(id, a.f17274u).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C5309ag(this, str, b), new C5310ah(this, str, b));
        }
    }

    /* renamed from: a */
    public final int mo11142a(long j) {
        C5153d dVar = this.f13734b;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        for (C7666e eVar : dVar.f13347b) {
            if (eVar.f19001c != null) {
                User user = eVar.f19001c;
                C89219l.m154716b(user, "");
                if (user.getId() == j) {
                    return eVar.f19003e;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo11150b(PrivacyCert privacyCert) {
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        if (cVar.f14397d && this.f13742j) {
            C5668c cVar2 = this.f13733a;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            if (!cVar2.mo11453b()) {
                C5668c cVar3 = this.f13733a;
                if (cVar3 == null) {
                    C89219l.m154710a("mRtcController");
                }
                cVar3.mo11449a(privacyCert);
                if (this.f13726B) {
                    mo11160l();
                } else {
                    mo11159k();
                }
                C5714i.m12561d(false);
                C5668c cVar4 = this.f13733a;
                if (cVar4 == null) {
                    C89219l.m154710a("mRtcController");
                }
                cVar4.mo11456d();
                return;
            }
            C6501b a = C6501b.C6502a.m13948a("rtc_start_client_is_null");
            C5668c cVar5 = this.f13733a;
            if (cVar5 == null) {
                C89219l.m154710a("mRtcController");
            }
            a.mo12647a("engine_status", Boolean.valueOf(cVar5.f14397d)).mo12647a("count_down_status", Boolean.valueOf(this.f13742j)).mo12645a("client_controller_status", this.f13728D).mo12655b();
        }
    }

    /* renamed from: g */
    public final void mo11155g(String str) {
        C89219l.m154721d(str, "");
        if (!this.f13737e && this.f38654y != null) {
            this.f13737e = true;
            C6894d.m14753a().f17277x = true;
            C5702a.m12449a("LinkIn_leave", "position:cancel; roomId:" + this.f13752t.getId());
            HashMap<String, Object> b = C5714i.m12490b(false);
            C5714i.m12537a(str, b);
            long id = this.f13752t.getId();
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            ((AbstractC11137ac) ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).leave(id, a.f17274u).mo142916a(mo13749v())).mo17937a(new C5333t(this, str, b), new C5334u(this, str, b));
            this.f13748p.mo10937a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$c */
    public static final class C5316c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13774a;

        static {
            Covode.recordClassIndex(5908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5316c(C5300c cVar) {
            super(1);
            this.f13774a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            DialogC5211a.EnumC5215a aVar;
            String str2 = str;
            C89219l.m154721d(str2, "");
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            if (TextUtils.equals(str2, a.f17260e) && this.f13774a.f38654y != null) {
                C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13774a.f38654y;
                DialogC5211a.EnumC5215a aVar2 = null;
                if (bVar != null) {
                    aVar = bVar.mo10976h();
                } else {
                    aVar = null;
                }
                if (aVar == DialogC5211a.EnumC5215a.SEND_REQUEST) {
                    this.f13774a.mo11147a(PrivacyCert.Builder.Companion.with("bpea-1133").usage("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy()).tag("rtc_stream_push").build());
                } else {
                    C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f13774a.f38654y;
                    if (bVar2 != null) {
                        aVar2 = bVar2.mo10976h();
                    }
                    if (aVar2 == DialogC5211a.EnumC5215a.GO_LIVE) {
                        this.f13774a.mo11147a(PrivacyCert.Builder.Companion.with("bpea-1137").usage("").policies(PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy()).tag("rtc_stream_push").build());
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$l */
    public static final class C5325l extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5300c f13783a;

        static {
            Covode.recordClassIndex(5917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5325l(C5300c cVar) {
            super(1);
            this.f13783a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            DialogC5211a.EnumC5215a aVar;
            String str2 = str;
            C89219l.m154721d(str2, "");
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            if (TextUtils.equals(str2, a.f17260e) && this.f13783a.f38654y != null) {
                this.f13783a.f13742j = true;
                this.f13783a.mo11158j().f13642m = true;
                C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f13783a.f38654y;
                DialogC5211a.EnumC5215a aVar2 = null;
                if (bVar != null) {
                    aVar = bVar.mo10976h();
                } else {
                    aVar = null;
                }
                if (aVar != DialogC5211a.EnumC5215a.SEND_REQUEST) {
                    C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f13783a.f38654y;
                    if (bVar2 != null) {
                        aVar2 = bVar2.mo10976h();
                    }
                    if (aVar2 == DialogC5211a.EnumC5215a.GO_LIVE && this.f13783a.f13741i == EnumC5315b.SUCCEED && this.f13783a.mo11156h().f14397d) {
                        this.f13783a.mo11150b(PrivacyCert.Builder.Companion.with("bpea-510").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    }
                } else if (this.f13783a.mo11156h().f14397d) {
                    this.f13783a.mo11150b(PrivacyCert.Builder.Companion.with("bpea-509").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo11143a(int i) {
        Context context;
        if (this.f38654y != null) {
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            if (bVar != null) {
                context = bVar.getContext();
            } else {
                context = null;
            }
            Activity a = C3888a.m9505a(context);
            if (a != null) {
                C89219l.m154716b(a, "");
                C6670f.C6672b a2 = C6670f.m14183a(a);
                a2.f16567d = new RunnableC5335v(a);
                a2.mo12816a(new C5336w(this, context, i), "android.permission.RECORD_AUDIO", "android.permission.CAMERA");
            }
        }
    }

    /* renamed from: a */
    private final void m11726a(C9606aj ajVar) {
        C5189g.AbstractC5191b bVar;
        int i;
        Context context;
        C5189g.AbstractC5191b bVar2;
        if (ajVar.f23322h != null) {
            C5189g.AbstractC5191b bVar3 = (C5189g.AbstractC5191b) this.f38654y;
            if (!(bVar3 == null || !bVar3.mo10974e() || (bVar2 = (C5189g.AbstractC5191b) this.f38654y) == null)) {
                bVar2.mo10975f();
            }
            C5223i iVar = this.f13727C;
            if (iVar != null) {
                if (!iVar.mo18054n()) {
                    C5223i iVar2 = this.f13727C;
                    if (iVar2 != null) {
                        iVar2.dismiss();
                    }
                    this.f13727C = null;
                } else {
                    return;
                }
            }
            C5153d dVar = this.f13734b;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            if (dVar.mo10910g() < C6894d.m14753a().f17275v && (bVar = (C5189g.AbstractC5191b) this.f38654y) != null && bVar.getContext() != null) {
                C5189g.AbstractC5191b bVar4 = (C5189g.AbstractC5191b) this.f38654y;
                if (bVar4 != null && (context = bVar4.getContext()) != null && !LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                    LiveAppBundleUtils.ensurePluginAvailable(context, EnumC11229b.LINK_MIC);
                } else if (this.f13753u.mo28318b(C9021ao.class) != null) {
                    C89219l.m154721d(ajVar, "");
                    JSONObject jSONObject = new JSONObject();
                    C5714i.m12485a(jSONObject, ajVar);
                    long j = ajVar.f23322h.f23745a;
                    C5714i.m12543a(jSONObject, Long.valueOf(j), C6898g.C6899a.f17285a.mo13196a(j));
                    C5714i iVar3 = C5714i.f14494j;
                    C5714i.m12550a((C5714i) false, (boolean) "invite_message", (String) jSONObject, (JSONObject) 0);
                    C6894d a = C6894d.m14753a();
                    C89219l.m154716b(a, "");
                    a.f17260e = ajVar.f23322h.f23751g;
                    C6898g.C6899a.f17285a.mo13199a(m11733z(), ajVar.f23322h.f23751g);
                    a.mo13189b(ajVar.f23335u);
                    a.mo13185a(ajVar.f23322h.f23747c);
                    C5271a aVar = this.f13735c;
                    if (aVar == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    aVar.mo11112c().clear();
                    C5271a aVar2 = this.f13735c;
                    if (aVar2 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    aVar2.mo11112c().putAll(ajVar.f23322h.f23754j);
                    if (ajVar.f23322h.f23755k == 1) {
                        C9755e eVar = ajVar.f23322h.f23756l;
                        int i2 = -1;
                        if (eVar != null) {
                            i = eVar.f23765a;
                        } else {
                            i = -1;
                        }
                        C9755e eVar2 = ajVar.f23322h.f23756l;
                        if (eVar2 != null) {
                            i2 = eVar2.f23766b;
                        }
                        this.f13749q = C5517c.m12022a(i, i2);
                    }
                    this.f13747o = ajVar.f23322h.f23747c;
                    this.f13727C = new C5223i((byte) 0);
                    AbstractC0952i iVar4 = (AbstractC0952i) this.f13753u.mo28318b(C9021ao.class);
                    if (iVar4 != null) {
                        C5223i iVar5 = this.f13727C;
                        if (iVar5 != null) {
                            String cls = getClass().toString();
                            C89219l.m154716b(cls, "");
                            iVar5.show(iVar4, cls);
                        }
                        mo11144a(2, false);
                    }
                    this.f13748p.f13396a.mo10932g();
                    C5153d dVar2 = this.f13734b;
                    if (dVar2 == null) {
                        C89219l.m154710a("mInfoCenter");
                    }
                    int g = dVar2.mo10910g();
                    C5271a aVar3 = this.f13735c;
                    if (aVar3 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    EnumC4422k kVar = aVar3.f13646q;
                    C6501b.C6502a.m13948a("livesdk_guest_receive_anchor_apply").mo12639a().mo12651a("guest_connection_type", "anchor_invite_guest").mo12651a("live_type", "video_live").mo12645a("connected_guest_cnt", g).mo12651a("layout_setting", C5586a.m12128a(kVar).getFirst()).mo12651a("window_setting", C5586a.m12128a(kVar).getSecond()).mo12655b();
                    C6555i.m14021b();
                    C6555i.m9463b("list_opti_enable", "Guest doHandleInviteMessage and list opti enable:" + LiveLinkListOptiEnableSetting.INSTANCE.getValue());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo11153c(boolean z) {
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        m11731x();
        String A = m11724A();
        if (A == null) {
            A = "";
        }
        C89219l.m154721d(A, "");
        C5600m mVar = new C5600m();
        mVar.mo11370a();
        mVar.mo11371a("onGuestVideoMute");
        C5601n nVar = new C5601n();
        nVar.f14242b.add(new C5602o(A, 0, !z, 2));
        mVar.f14238b = nVar;
        cVar.mo11446a(mVar);
        m11728d(z);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C9772b bVar;
        boolean z;
        int i;
        C89219l.m154721d(iMessage, "");
        if (this.f38654y != null && (iMessage instanceof C9606aj)) {
            C9606aj ajVar = (C9606aj) iMessage;
            int i2 = ajVar.f23319a;
            if (i2 == 3) {
                T t = this.f13745m.f17248n;
                if (t != null && t.intValue() == 0) {
                    m11726a(ajVar);
                }
            } else if (i2 == 5) {
                T t2 = this.f13745m.f17248n;
                if (t2 != null && t2.intValue() == 1) {
                    this.f13745m.mo10159a((Integer) 0);
                    if (this.f13744l != null) {
                        C5153d dVar = this.f13734b;
                        if (dVar == null) {
                            C89219l.m154710a("mInfoCenter");
                        }
                        C5153d.m11388a(dVar, null, 2);
                    }
                    C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.ej1), 0);
                    long z2 = m11733z();
                    C5153d dVar2 = this.f13734b;
                    if (dVar2 == null) {
                        C89219l.m154710a("mInfoCenter");
                    }
                    int g = dVar2.mo10910g();
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_id", String.valueOf(z2));
                    Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    if (room != null) {
                        hashMap.put("enter_from_merge", C6544e.m13987a());
                        hashMap.put("enter_method", C6544e.m13990d());
                        hashMap.put("action_type", C6544e.m13991e());
                        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                        String idStr = room.getIdStr();
                        if (idStr == null) {
                            idStr = "";
                        }
                        hashMap.put("room_id", idStr);
                        hashMap.put("connected_guest_cnt", String.valueOf(g));
                        User owner = room.getOwner();
                        C89219l.m154716b(owner, "");
                        FollowInfo followInfo = owner.getFollowInfo();
                        C89219l.m154716b(followInfo, "");
                        hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
                        C5703b.m12465a("livesdk_guest_refused_connection_show", hashMap);
                    }
                }
            } else if (i2 == 18) {
                C6898g gVar = C6898g.C6899a.f17285a;
                C9771a aVar = ajVar.f23331q;
                if (aVar != null && (bVar = aVar.f23783a) != null) {
                    if (bVar.f23785a == 0) {
                        gVar.mo13201b(bVar.f23787c);
                        gVar.f17284c.put(Long.valueOf(bVar.f23786b), Long.valueOf(bVar.f23787c));
                    } else if (bVar.f23785a == 1 && !gVar.f17284c.isEmpty()) {
                        gVar.f17284c.remove(Long.valueOf(bVar.f23786b));
                    }
                }
            } else if (i2 == 8) {
                boolean z3 = this.f13726B;
                C89219l.m154721d(ajVar, "");
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "is_background", String.valueOf(z3 ? 1 : 0));
                C5714i.m12485a(jSONObject, ajVar);
                C3866a.m9474a(jSONObject, "message_expired_time", ajVar.f23334t);
                C3866a.m9474a(jSONObject, "message_available_time", ajVar.mo16565f());
                C3866a.m9474a(jSONObject, "delay_time", ajVar.mo16563d());
                C3866a.m9475a(jSONObject, "guest_linkmic_id", ajVar.f23323i.f23799g.f23821h);
                C5714i.m12543a(jSONObject, Long.valueOf(ajVar.f23323i.f23797e), ajVar.f23323i.f23799g.f23821h);
                C5714i iVar = C5714i.f14494j;
                C5714i.m12550a((C5714i) false, (boolean) "permit_message", (String) jSONObject, (JSONObject) 0);
                this.f13743k = false;
                if (this.f13726B) {
                    mo11155g("leave_source_cancel_with_background");
                } else if (C6894d.m14753a().f17277x) {
                    C6555i.m14021b();
                    C6555i.m9463b("multi-guest", "receive permit message, but guest is leaving or already left");
                } else {
                    if (TTliveLinkmicMsgOptimizationSwitchSetting.INSTANCE.getValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || !ajVar.mo16564e()) {
                        long d = ajVar.mo16563d();
                        long value = (long) (MtCoHostReceiveInviteMessageTimeOutSetting.INSTANCE.getValue() * 1000);
                        if (d >= value) {
                            mo11155g("leave_source_cancel_with_msg_expire");
                            C5714i.m12533a(ajVar, 0, value);
                            return;
                        }
                    } else {
                        long f = ajVar.mo16565f();
                        long value2 = (long) (TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.INSTANCE.getValue() * 1000);
                        if (f < value2) {
                            C5714i.m12533a(ajVar, value2, 0);
                            mo11155g("leave_source_cancel_with_msg_expire");
                            return;
                        }
                    }
                    C6894d a = C6894d.m14753a();
                    C9780a aVar2 = ajVar.f23323i;
                    C89219l.m154716b(a, "");
                    a.mo13189b(ajVar.f23335u);
                    a.mo13185a(aVar2.f23796d.f23818e);
                    a.f17259d = aVar2.f23799g.f23821h;
                    this.f13747o = aVar2.f23796d.f23818e;
                    C6898g.C6899a.f17285a.mo13199a(this.f13752t.getOwnerUserId(), aVar2.f23799g.f23821h);
                    HashMap<Long, Long> hashMap2 = aVar2.f23805m;
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        C6898g.C6899a.f17285a.f17284c = aVar2.f23805m;
                    }
                    a.mo13184a(this.f13752t.getOwnerUserId());
                    if (aVar2.f23806n == 1) {
                        C5271a aVar3 = this.f13735c;
                        if (aVar3 == null) {
                            C89219l.m154710a("mDataHolder");
                        }
                        C9755e eVar = aVar2.f23807o;
                        int i3 = -1;
                        if (eVar != null) {
                            i = eVar.f23765a;
                        } else {
                            i = -1;
                        }
                        C9755e eVar2 = aVar2.f23807o;
                        if (eVar2 != null) {
                            i3 = eVar2.f23766b;
                        }
                        aVar3.mo11109a(C5517c.m12022a(i, i3));
                    }
                    this.f13748p.f13396a.mo10926a();
                    if (this.f38654y != null) {
                        C6894d a2 = C6894d.m14753a();
                        C89219l.m154716b(a2, "");
                        a2.mo13186a(true);
                        mo11165q();
                    }
                    C6555i.m14021b();
                    C6555i.m9463b("list_opti_enable", "Guest handlePermitMessage and list opti enable:" + LiveLinkListOptiEnableSetting.INSTANCE.getValue());
                }
            } else if (i2 != 9) {
                if (i2 == 13) {
                    C4386c a3 = C4386c.m10499a();
                    C89219l.m154716b(a3, "");
                    a3.mo10160b();
                    C5189g.AbstractC5191b bVar2 = (C5189g.AbstractC5191b) this.f38654y;
                    if (bVar2 != null) {
                        bVar2.mo10968b();
                    }
                    C6894d a4 = C6894d.m14753a();
                    C89219l.m154716b(a4, "");
                    a4.mo13189b(ajVar.f23335u);
                    mo11148a("leave_with_kicked_out", PrivacyCert.Builder.Companion.with("bpea-473").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    C5271a aVar4 = this.f13735c;
                    if (aVar4 == null) {
                        C89219l.m154710a("mDataHolder");
                    }
                    C5712g.m12498a("anchor_kick_out_guest", aVar4.f13646q);
                } else if (i2 == 14 && ajVar.f23324j.f23726a != m11733z() && this.f13744l != null) {
                    C5153d dVar3 = this.f13734b;
                    if (dVar3 == null) {
                        C89219l.m154710a("mInfoCenter");
                    }
                    C5153d.m11388a(dVar3, null, 2);
                }
            } else if (ajVar.f23324j != null && ajVar.f23324j.f23728c == C9746a.EnumC9747a.INVITE_CANCEL.code) {
                mo11163o();
                C5189g.AbstractC5191b bVar3 = (C5189g.AbstractC5191b) this.f38654y;
                if (bVar3 != null) {
                    bVar3.mo10977i();
                }
                C89219l.m154721d(ajVar, "");
                JSONObject jSONObject2 = new JSONObject();
                C5714i.m12485a(jSONObject2, ajVar);
                C5714i iVar2 = C5714i.f14494j;
                C5714i.m12550a((C5714i) false, (boolean) "cancel_message", (String) jSONObject2, (JSONObject) 0);
            }
        }
    }

    /* renamed from: b */
    public final void mo11152b(boolean z) {
        LiveRTCEngine rtcEngine;
        LiveRTCEngine rtcEngine2;
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        Client client = cVar.f14400g;
        if (client != null) {
            client.switchAudio(z);
        }
        C5668c cVar2 = this.f13733a;
        if (cVar2 == null) {
            C89219l.m154710a("mRtcController");
        }
        if (z) {
            Client client2 = cVar2.f14400g;
            if (!(client2 == null || (rtcEngine2 = client2.getRtcEngine()) == null)) {
                rtcEngine2.startAudioCapture();
            }
        } else {
            Client client3 = cVar2.f14400g;
            if (!(client3 == null || (rtcEngine = client3.getRtcEngine()) == null)) {
                rtcEngine.stopAudioCapture();
            }
        }
        AbstractC7600a aVar = this.f13746n;
        if (aVar != null && (aVar instanceof AbstractC3060a)) {
            if (!z) {
                aVar.mo9071a(true, PrivacyCert.Builder.Companion.with("bpea-798").usage("").tag("multi live mute audio: true").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            } else {
                aVar.mo9071a(false, PrivacyCert.Builder.Companion.with("bpea-799").usage("").tag("multi live mute audio: false").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c$aa */
    public static final class C5302aa<T1, T2> implements AbstractC88429b {

        /* renamed from: a */
        final /* synthetic */ C5300c f13755a;

        static {
            Covode.recordClassIndex(5894);
        }

        C5302aa(C5300c cVar) {
            this.f13755a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88429b
        /* renamed from: a */
        public final /* synthetic */ void mo10350a(Object obj, Object obj2) {
            C5594g gVar;
            ArrayList<C7664c> arrayList;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (gVar = (C5594g) dVar.data) != null && (arrayList = gVar.f14234a) != null) {
                this.f13755a.mo11158j().f13643n = arrayList;
            }
        }
    }

    /* renamed from: a */
    private void m11727a(PrivacyCert privacyCert, String str) {
        C89219l.m154721d(str, "");
        C6894d.m14753a().f17276w = false;
        C5668c cVar = this.f13733a;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11450a(privacyCert, str);
        C5702a.m12455b("LinkIn_turnOffEngine");
        C5586a.m12144c("connection_end");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10306b(int i, String str) {
        C89219l.m154721d(str, "");
        C5702a.m12456b("OnEndFailed", "position:LinkIn_Guest; code:" + i + "; desc:" + str);
        this.f13725A = false;
        this.f13754z = false;
    }

    public C5300c(Room room, DataChannel dataChannel) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(dataChannel, "");
        this.f13752t = room;
        this.f13753u = dataChannel;
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        this.f13745m = a;
        this.f13748p = new C5178d(this);
        this.f13729E = C89250i.m154773a((AbstractC89171a) new C5311ai(this));
        this.f13730F = C89250i.m154773a((AbstractC89171a) C5312aj.f13770a);
        this.f13731G = new Handler(Looper.getMainLooper());
        this.f13732H = new C5313ak(this);
        C4431e.f12034a.mo10198a(new C5153d(dataChannel), null);
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: c */
    public final void mo10315c(int i, String str) {
        C89219l.m154721d(str, "");
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gos);
        this.f13754z = false;
        C5702a.m12456b("OnError", "position:LinkIn_Guest; code:" + i + "; message:" + str);
        C5714i.m12545a(false, i, str);
        C5721p.m12580a(C5721p.f14515c, (long) i, str);
        C3854a.m9453a(6, AbstractC4444o.f12039a, "onError: ".concat(String.valueOf(str)));
        mo11148a("rtc_error", PrivacyCert.Builder.Companion.with("bpea-474").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: b */
    public final void mo10310b(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        if (this.f38654y != null) {
            C5702a.m12456b("OnFirstRemoteVideoFrame", "position:LinkIn_Guest; interactId:".concat(String.valueOf(str)));
            C5714i.m12556b(str, false);
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            if (bVar != null) {
                bVar.mo10969b(str, surfaceView);
            }
            this.f13753u.mo28320c(C4441l.class, new C7399p(3));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b, com.bytedance.android.live.liveinteract.platform.common.p370b.AbstractC5675a
    /* renamed from: a */
    public final void mo10290a(int i, String str) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            C6894d.m14753a().f17276w = false;
            this.f13754z = false;
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gor);
            C5702a.m12456b("OnStartFailed", "position:LinkIn_Guest; code:" + i + "; desc:" + str);
            C5714i.m12545a(false, i, str);
            C5721p.m12580a(C5721p.f14515c, (long) i, str);
            C5189g.AbstractC5191b bVar = (C5189g.AbstractC5191b) this.f38654y;
            if (bVar != null) {
                bVar.mo10959a();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10312b(String str, boolean z) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13735c;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.mo11111b().put(str, Boolean.valueOf(z));
        this.f13753u.mo28320c(C5598k.class, new C5591d(str, z));
    }

    /* renamed from: a */
    public final void mo11144a(int i, boolean z) {
        C5830b<Void, C7656a> bVar;
        if (!this.f13736d) {
            if (i != 1) {
                this.f13736d = true;
                C5702a.m12449a("LinkIn_Guest_Permission", "roomId:" + this.f13752t.getId() + "; userId:" + this.f13752t.getOwnerUserId());
                ((AbstractC11137ac) ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).checkPermissionV1(this.f13752t.getId(), this.f13752t.getOwnerUserId(), 1).mo142916a(mo13749v())).mo17937a(new C5341y(this, z, i), new C5342z(this, z, i));
            } else if (this.f13750r && (bVar = this.f13751s) != null) {
                mo11146a(bVar);
                this.f13750r = false;
            }
        }
    }
}
