package com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.android.live.liveinteract.api.C4390ad;
import com.bytedance.android.live.liveinteract.api.C4404ar;
import com.bytedance.android.live.liveinteract.api.C4405as;
import com.bytedance.android.live.liveinteract.api.C4436g;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.api.C4451u;
import com.bytedance.android.live.liveinteract.api.C4452v;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4410a;
import com.bytedance.android.live.liveinteract.api.p261b.C4411b;
import com.bytedance.android.live.liveinteract.api.p261b.C4421j;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5343b;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5146c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p322f.C5187f;
import com.bytedance.android.live.liveinteract.multiguest.p323b.C5194a;
import com.bytedance.android.live.liveinteract.multiguest.p325d.C5201a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5484c;
import com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5385a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5589b;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5590c;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5591d;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5598k;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5599l;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5601n;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5602o;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5605r;
import com.bytedance.android.live.liveinteract.multilive.p361d.C5607a;
import com.bytedance.android.live.liveinteract.multilive.p361d.C5609b;
import com.bytedance.android.live.liveinteract.multilive.p361d.C5611c;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5684c;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5686e;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5690i;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5710e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5711f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5715j;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a;
import com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b;
import com.bytedance.android.live.liveinteract.platform.p368c.C5668c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.model.p495b.p496a.C7659c;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.event.C8447a;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkInteractAudienceOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p591k.C9780a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b */
public final class C5277b extends AbstractC7501r<C5187f.AbstractC5188a> implements C5201a.AbstractC5202a, C5494e.AbstractC5495a, AbstractC5666b, OnMessageListener {

    /* renamed from: a */
    public boolean f13660a;

    /* renamed from: b */
    public boolean f13661b;

    /* renamed from: c */
    public AbstractC5276a f13662c;
    @AbstractC4430d(mo10204a = "LINK_USER_INFO_CENTER")

    /* renamed from: d */
    public C5153d f13663d;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: e */
    public C5659c f13664e;
    @AbstractC4430d(mo10204a = "RTC_CONTROLLER")

    /* renamed from: f */
    public C5668c f13665f;
    @AbstractC4430d(mo10204a = "LIVE_VIDEO_CLIENT_FACTORY")

    /* renamed from: g */
    public AbstractC7601b f13666g;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: h */
    public C5271a f13667h;

    /* renamed from: i */
    public volatile boolean f13668i;

    /* renamed from: j */
    public HashMap<String, Boolean> f13669j = new HashMap<>();

    /* renamed from: k */
    public AbstractC88412b f13670k;

    /* renamed from: l */
    public final Map<Long, AbstractC88412b> f13671l = new HashMap();

    /* renamed from: m */
    public final Config.Vendor f13672m = Config.Vendor.BYTE;

    /* renamed from: n */
    public final Room f13673n;

    /* renamed from: o */
    public final DataChannel f13674o;

    /* renamed from: p */
    private C5715j f13675p;

    /* renamed from: q */
    private boolean f13676q;

    /* renamed from: r */
    private final AbstractC89244h f13677r = C89250i.m154773a((AbstractC89171a) C5291n.f13701a);

    /* renamed from: s */
    private final AbstractC89244h f13678s = C89250i.m154773a((AbstractC89171a) new C5293p(this));

    /* renamed from: t */
    private final AbstractC89244h f13679t = C89250i.m154773a((AbstractC89171a) new C5292o(this));

    /* renamed from: u */
    private IMessageManager f13680u;

    /* renamed from: v */
    private final C5153d.AbstractC5154a f13681v = new C5294q(this);

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$h */
    static final class C5285h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5285h f13689a = new C5285h();

        static {
            Covode.recordClassIndex(5877);
        }

        C5285h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5869);
    }

    /* renamed from: m */
    private final C6894d m11669m() {
        return (C6894d) this.f13677r.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10289a(int i, long j, Object... objArr) {
        C89219l.m154721d(objArr, "");
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10307b(long j, int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: d */
    public final void mo10319d(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: h */
    public final C5609b mo11133h() {
        return (C5609b) this.f13678s.getValue();
    }

    /* renamed from: a */
    public final void mo10297a(C5187f.AbstractC5188a aVar) {
        super.mo10297a((AbstractC8094bq) aVar);
        C6894d.m14753a().f17257b = true;
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        dVar.mo10902a(this.f13681v);
        C5153d dVar2 = this.f13663d;
        if (dVar2 == null) {
            C89219l.m154710a("mInfoCenter");
        }
        dVar2.mo10898a();
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11447a(this);
        IMessageManager iMessageManager = (IMessageManager) this.f13674o.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            this.f13680u = iMessageManager;
            C5146c.f13335c = iMessageManager;
            iMessageManager.addMessageListener(EnumC9596a.MEMBER.getIntType(), C5146c.f13338f);
            C5146c.f13336d = true;
            iMessageManager.addMessageListener(EnumC9596a.LINK_MESSAGE.getIntType(), this);
        }
        this.f13674o.mo28312a(this, C4452v.class, new C5278a(this)).mo28312a(this, C5589b.class, new C5279b(this)).mo28312a(this, C4404ar.class, new C5280c(this)).mo28312a(this, C5484c.class, new C5281d(this)).mo28312a(this, C5385a.class, new C5282e(this)).mo28312a(this, C5590c.class, new C5283f(this)).mo28312a(this, C5686e.class, new C5284g(this));
    }

    /* renamed from: a */
    public final void mo11126a(long j, String str, String str2, int i, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (this.f38654y != null) {
            if (i == 2) {
                m11665a(j, str, str2, i);
                return;
            }
            if (z) {
                if (this.f13669j.containsKey(str2)) {
                    AbstractC5276a aVar = this.f13662c;
                    if (aVar != null) {
                        aVar.mo11117a(new Throwable("Current user is permitting"));
                        return;
                    }
                    return;
                }
                this.f13669j.put(str2, true);
                this.f13670k = C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b(5).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C5297t(this, str2));
            }
            this.f13668i = true;
            C6898g.C6899a.f17285a.mo13199a(j, str2);
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            a.mo13186a(true);
            DataChannel dataChannel = this.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28319c(C5690i.class);
            }
            C6894d m = m11669m();
            if (m != null) {
                m.mo13184a(j);
            }
            mo11138j();
            m11665a(j, str, str2, i);
        }
    }

    /* renamed from: a */
    public final void mo11128a(C5661a aVar, long j, String str, String str2) {
        C7659c cVar;
        if (C4502a.m10585b()) {
            C4502a.m10578a(C4502a.EnumC4505b.DISCONNECT);
        }
        this.f13668i = false;
        DataChannel dataChannel = this.f18624w;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4451u.class, "");
        }
        if (aVar.f14391a instanceof C5832d) {
            Object obj = aVar.f14391a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.audience.PermitResult>");
            C5832d dVar = (C5832d) obj;
            if (!(dVar == null || (cVar = (C7659c) dVar.data) == null)) {
                C6898g.C6899a.f17285a.mo13199a(j, cVar.f18980e);
                C6898g.C6899a.f17285a.mo13198a(cVar.f18981f, cVar.f18980e);
                String b = C4139e.C4140a.f11575b.mo46674b(cVar);
                C89219l.m154716b(b, "");
                C89219l.m154721d(b, "");
                C89219l.m154721d(str2, "");
                JSONObject jSONObject = new JSONObject();
                C3866a.m9475a(jSONObject, "response", b);
                C3866a.m9474a(jSONObject, "guest_user_id", j);
                C3866a.m9475a(jSONObject, "guest_linkmic_id", str2);
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14488c);
                C5714i.m12543a(jSONObject, Long.valueOf(j), str2);
                C5714i.m12531a(C5714i.f14494j, true, "permit_succeed", jSONObject);
            }
        }
        C5187f.AbstractC5188a aVar2 = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar2 != null) {
            aVar2.mo10942a(str2);
        }
        m11668b(j, str, str2);
        AbstractC5276a aVar3 = this.f13662c;
        if (aVar3 != null) {
            aVar3.mo11116a(j);
        }
        TextUtils.isEmpty("");
        HashMap hashMap = new HashMap();
        hashMap.put("guest_connection_type", "video");
        if (!TextUtils.isEmpty("")) {
            C5713h.m12518a("guest_connection_agree", hashMap, "live_take_detail");
        } else {
            C5713h.m12517a("guest_connection_agree", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo11125a(long j, String str, String str2) {
        AbstractC88403ab<C5661a> i;
        AbstractC11137ac acVar;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (this.f38654y != null && !this.f13660a) {
            C5153d dVar = this.f13663d;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            String a = dVar.mo10897a(j);
            C89219l.m154721d(str2, "");
            C89219l.m154721d(a, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            C3866a.m9475a(jSONObject, "request_source", str2);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", a);
            C5714i.m12543a(jSONObject, Long.valueOf(j), a);
            C5714i.m12531a(C5714i.f14494j, true, "kick_out_request", jSONObject);
            C5714i.f14490e = System.currentTimeMillis();
            C5702a.m12449a("LinkIn_kickOut", "roomId:" + this.f13673n.getId() + "; userId:" + j + "; secUserId:" + str);
            C5153d dVar2 = this.f13663d;
            if (dVar2 == null) {
                C89219l.m154710a("mInfoCenter");
            }
            String a2 = dVar2.mo10897a(j);
            C5153d dVar3 = this.f13663d;
            if (dVar3 == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C7666e a3 = dVar3.mo10896a(a2, j);
            long j2 = -1;
            if (!(a3 == null || a3.f19001c == null)) {
                User user = a3.f19001c;
                C89219l.m154716b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                C89219l.m154716b(followInfo, "");
                j2 = followInfo.getFollowStatus();
            }
            C5271a aVar = this.f13667h;
            if (aVar == null) {
                C89219l.m154710a("mLinkDataHolder");
            }
            EnumC4422k kVar = aVar.f13646q;
            String remove = C5711f.f14474b.remove(Long.valueOf(j));
            if (remove != null && C5711f.f14474b.size() == 0) {
                C5711f.m12496a("anchor_kick_out_guest", j, j2, kVar, remove);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("toUserId", Long.valueOf(j));
            hashMap.put("secUserId", str);
            C5194a n = m11670n();
            if (n != null && (i = n.mo10983i(hashMap)) != null && (acVar = (AbstractC11137ac) i.mo142916a(mo13749v())) != null) {
                acVar.mo17937a(new C5289l(this, j, str2), new C5290m(this, j, str2));
            }
        }
    }

    /* renamed from: a */
    public final void mo11130a(PrivacyCert privacyCert, String str) {
        C89219l.m154721d(str, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        a.mo13186a(false);
        C6894d.m14753a().f17276w = false;
        C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar != null) {
            aVar.mo10945b();
        }
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11450a(privacyCert, str);
    }

    /* renamed from: a */
    public final void mo11129a(LinkApi.EnumC7285c cVar, PrivacyCert privacyCert) {
        C89219l.m154721d(cVar, "");
        if (this.f38654y != null) {
            DataChannel dataChannel = this.f18624w;
            if (dataChannel != null) {
                dataChannel.mo28311a(C5684c.class, cVar);
            }
            if (cVar == LinkApi.EnumC7285c.USER_CLICK) {
                C6805b<Boolean> bVar = AbstractC6804a.f17036cj;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) false);
            }
            String str = cVar.value;
            C89219l.m154716b(str, "");
            mo11130a(privacyCert, str);
            m11667a(cVar);
            C6894d.m14753a().f17257b = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10292a(long j, long j2) {
        C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar != null) {
            aVar.mo10941a(j, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10299a(String str) {
        C89219l.m154721d(str, "");
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        C5714i.m12546a(true, dVar.mo10903b(str), str);
        C5702a.m12456b("OnUserJoined", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11446a(mo11133h().mo11388a(str));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10301a(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        C5714i.m12538a(str, true);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10300a(String str, long j) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            C5153d dVar = this.f13663d;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            C7666e a = C5153d.m11384a(dVar, str, 0, 2);
            long j2 = -1;
            if (!(a == null || a.f19001c == null)) {
                User user = a.f19001c;
                C89219l.m154716b(user, "");
                FollowInfo followInfo = user.getFollowInfo();
                C89219l.m154716b(followInfo, "");
                j2 = followInfo.getFollowStatus();
                if (j == 1 && LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    User user2 = a.f19001c;
                    C89219l.m154716b(user2, "");
                    long id = user2.getId();
                    User user3 = a.f19001c;
                    C89219l.m154716b(user3, "");
                    String secUid = user3.getSecUid();
                    if (secUid == null) {
                        secUid = "";
                    }
                    mo11125a(id, secUid, "kickout_with_rtc_user_leaved");
                }
                if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    User user4 = a.f19001c;
                    C89219l.m154716b(user4, "");
                    m11664a(user4.getId());
                }
            }
            C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
            if (aVar != null) {
                aVar.mo10952f(str);
            }
            long a2 = C6898g.C6899a.f17285a.mo13195a(str);
            C5714i.m12557b(true, a2, str);
            C5702a.m12456b("OnUserLeaved", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
            C5271a aVar2 = this.f13667h;
            if (aVar2 == null) {
                C89219l.m154710a("mLinkDataHolder");
            }
            EnumC4422k kVar = aVar2.f13646q;
            String remove = C5711f.f14474b.remove(Long.valueOf(a2));
            if (remove != null && C5711f.f14474b.size() == 0) {
                C5711f.m12496a("guest_over", a2, j2, kVar, remove);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10290a(int i, String str) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            C6894d.m14753a().f17276w = false;
            C5714i.m12545a(true, i, str);
            C5702a.m12456b("OnStartFailed", "position:LinkIn_Anchor; code:" + i + "; desc:" + str);
            C5721p.m12580a(C5721p.f14515c, (long) i, str);
            C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
            if (aVar != null) {
                aVar.mo10940a();
            }
            this.f13674o.mo28320c(C4441l.class, new C7399p(8));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10294a(C5600m mVar, String str) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        C5714i.m12548a(true, mVar.f14240d, str);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10302a(String str, String str2) {
        C5601n nVar;
        ArrayList<C5602o> arrayList;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC5666b.C5667a.m12374a(str, str2);
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        if (aVar.f13637h) {
            this.f13679t.getValue();
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
                C5714i.m12549a(true, a.f14240d, str2, j);
                if (!(!C89219l.m154714a((Object) a.f14237a, (Object) "onGuestVideoMute") || (nVar = a.f14238b) == null || (arrayList = nVar.f14242b) == null)) {
                    for (T t : arrayList) {
                        if (!C89219l.m154714a((Object) t.f14243a, (Object) mo11140k())) {
                            mo10303a(t.f14243a, t.f14245c);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10291a(long j, int i) {
        if (i == 200) {
            C5714i.m12565f(true);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(i));
        hashMap.put("msg_id", String.valueOf(j));
        C5714i.m12551a(true, (HashMap<String, Object>) hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: a */
    public final void mo10303a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        aVar.mo11108a().put(str, Boolean.valueOf(z));
        this.f13674o.mo28320c(C5599l.class, new C5605r(str, z));
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11456d();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$n */
    static final class C5291n extends AbstractC89220m implements AbstractC89171a<C6894d> {

        /* renamed from: a */
        public static final C5291n f13701a = new C5291n();

        static {
            Covode.recordClassIndex(5883);
        }

        C5291n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C6894d invoke() {
            return C6894d.m14753a();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$o */
    static final class C5292o extends AbstractC89220m implements AbstractC89171a<C5607a> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13702a;

        static {
            Covode.recordClassIndex(5884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5292o(C5277b bVar) {
            super(0);
            this.f13702a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5607a invoke() {
            return new C5607a(this.f13702a.f13674o);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$p */
    static final class C5293p extends AbstractC89220m implements AbstractC89171a<C5609b> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13703a;

        static {
            Covode.recordClassIndex(5885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5293p(C5277b bVar) {
            super(0);
            this.f13703a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C5609b invoke() {
            return new C5609b((C5187f.AbstractC5188a) this.f13703a.f38654y);
        }
    }

    /* renamed from: p */
    private final void m11672p() {
        C5715j jVar = this.f13675p;
        if (jVar != null) {
            jVar.mo11476b();
        }
        this.f13675p = null;
    }

    /* renamed from: c */
    public final C5668c mo11131c() {
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        return cVar;
    }

    /* renamed from: d */
    public final C5271a mo11132d() {
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        return aVar;
    }

    /* renamed from: n */
    private C5194a m11670n() {
        C5659c cVar = this.f13664e;
        if (cVar == null) {
            C89219l.m154710a("mLinkerManager");
        }
        AbstractC5651b b = cVar.mo11442b(C5647a.EnumC5648a.MULTIGUEST);
        if (!(b instanceof C5194a)) {
            b = null;
        }
        return (C5194a) b;
    }

    /* renamed from: o */
    private boolean m11671o() {
        C11738s streamUrlExtraSafely = this.f13673n.getStreamUrlExtraSafely();
        C89219l.m154716b(streamUrlExtraSafely, "");
        if (streamUrlExtraSafely.f28104l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final C89391z mo11135i() {
        C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar == null) {
            return null;
        }
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        aVar.mo10944a(C89070n.m154585g((Collection) dVar.f13347b));
        return C89391z.f203057a;
    }

    /* renamed from: l */
    public final String mo11141l() {
        StreamUrl streamUrl = this.f13673n.getStreamUrl();
        C89219l.m154716b(streamUrl, "");
        String a = streamUrl.mo18682a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: f */
    public final void mo10322f() {
        if (this.f38654y != null) {
            C5714i.m12563e(true);
            C3854a.m9453a(4, AbstractC4444o.f12039a, "onEngineEndSuccess");
            C6894d.m14753a().f17276w = false;
            this.f13674o.mo28320c(C4436g.class, new C4411b(false, null));
            C5702a.m12456b("onEndSuccess", "position:LinkIn_Anchor");
            m11672p();
        }
    }

    /* renamed from: k */
    public final String mo11140k() {
        String str;
        C5659c cVar = this.f13664e;
        if (cVar == null) {
            C89219l.m154710a("mLinkerManager");
        }
        AbstractC5651b b = cVar.mo11442b(C5647a.EnumC5648a.MULTIGUEST);
        if (b == null || (str = b.f14370f) == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: g */
    public final void mo10323g() {
        this.f13674o.mo28320c(C4441l.class, new C7399p(7));
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        LiveCore.InteractConfig interactConfig = cVar.f14394a;
        Config.MixStreamType mixStreamType = null;
        if (!(interactConfig == null || interactConfig.getMixStreamType() == null || !TestDisableMixStreamTypeSetting.INSTANCE.getValue())) {
            C5668c cVar2 = this.f13665f;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            LiveCore.InteractConfig interactConfig2 = cVar2.f14394a;
            if (interactConfig2 != null) {
                mixStreamType = interactConfig2.getMixStreamType();
            }
            this.f13674o.mo28315b(C4390ad.class, String.valueOf(mixStreamType));
        }
        C5714i.m12561d(true);
    }

    /* renamed from: j */
    public final void mo11138j() {
        boolean z;
        Config.VideoQuality videoQuality;
        StringBuilder sb = new StringBuilder("getRtcExtInfo is empty = ");
        if (m11663a(this).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C5702a.m12449a("turnOnEngine", sb.append(z).toString());
        if (this.f38654y != null) {
            C6894d.m14753a().f17276w = true;
            if (m11671o()) {
                videoQuality = Config.VideoQuality.ANCHOR_HIGH;
            } else {
                videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
            }
            AbstractC5697a a = m11662a(videoQuality);
            C5668c cVar = this.f13665f;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            AbstractC7601b bVar = this.f13666g;
            if (bVar == null) {
                C89219l.m154710a("mLiveVideoClientFactory");
            }
            cVar.mo11448a(bVar, new C5299v(this, a, videoQuality));
            C6894d.m14753a().f17264i = System.currentTimeMillis();
            C5714i.m12544a(true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$q */
    public static final class C5294q extends C5153d.AbstractC5154a {

        /* renamed from: a */
        final /* synthetic */ C5277b f13704a;

        static {
            Covode.recordClassIndex(5886);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10915a() {
            C5187f.AbstractC5188a aVar;
            if (this.f13704a.mo11132d().f13637h) {
                this.f13704a.f13674o.mo28315b(C4405as.class, new C4421j(this.f13704a.mo11132d().f13646q, this.f13704a.mo11123a().mo10910g()));
            }
            C5187f.AbstractC5188a aVar2 = (C5187f.AbstractC5188a) this.f13704a.f38654y;
            if (aVar2 != null) {
                aVar2.mo10947b(C89070n.m154585g((Collection) this.f13704a.mo11123a().f13347b));
            }
            int h = this.f13704a.mo11123a().mo10911h();
            boolean value = TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue();
            boolean z = C6894d.m14753a().f17276w;
            C3854a.m9453a(4, "LinkUserInfoCenterTAG", "linkedGuestCount = " + h + "  isSwitchOpened = " + value + "  rtcJoinedChannel = " + z);
            if (!this.f13704a.f13668i && h <= 0 && value && z) {
                if (this.f13704a.mo11132d().f13637h) {
                    this.f13704a.mo11131c().mo11456d();
                    C6894d a = C6894d.m14753a();
                    C89219l.m154716b(a, "");
                    a.mo13186a(false);
                    C5277b bVar = this.f13704a;
                    C5271a aVar3 = bVar.f13667h;
                    if (aVar3 == null) {
                        C89219l.m154710a("mLinkDataHolder");
                    }
                    if (!aVar3.f13633d && (aVar = (C5187f.AbstractC5188a) bVar.f38654y) != null) {
                        aVar.mo10948c();
                    }
                    this.f13704a.mo11132d().f13634e = 0;
                    return;
                }
                this.f13704a.mo11130a(PrivacyCert.Builder.Companion.with("bpea-570").usage("").tag("turn off engine").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build(), "no linked guest");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5294q(C5277b bVar) {
            this.f13704a = bVar;
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10918a(String str) {
            C89219l.m154721d(str, "");
            this.f13704a.mo11131c().mo11456d();
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5153d.AbstractC5154a
        /* renamed from: a */
        public final void mo10917a(long j, String str) {
            AbstractC88412b remove;
            C89219l.m154721d(str, "");
            Map<Long, AbstractC88412b> map = this.f13704a.f13671l;
            if (!(map == null || (remove = map.remove(Long.valueOf(j))) == null)) {
                remove.dispose();
            }
            C6898g gVar = C6898g.C6899a.f17285a;
            if (!TextUtils.isEmpty(str) && !gVar.f17283b.isEmpty()) {
                Iterator<Map.Entry<Integer, String>> it = gVar.f17283b.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().equals(str)) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: e */
    public final void mo10320e() {
        Config.VideoQuality videoQuality;
        this.f13674o.mo28320c(C4436g.class, new C4411b(true, this.f13672m.name()));
        String l = mo11141l();
        long id = this.f13673n.getId();
        String name = this.f13672m.name();
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        if (m11671o()) {
            videoQuality = Config.VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
        }
        C89219l.m154716b(videoQuality, "");
        C5715j jVar = new C5715j(lowerCase, l, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
        this.f13675p = jVar;
        jVar.mo11475a();
        C5714i.m12560c(true);
        C6805b<Boolean> bVar = AbstractC6804a.f17036cj;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) true);
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11449a(PrivacyCert.Builder.Companion.with("bpea-508").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (1 != r0.intValue()) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8577b() {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.p337a.p338a.C5277b.mo8577b():void");
    }

    /* renamed from: a */
    public final C5153d mo11123a() {
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        return dVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$i */
    static final class C5286i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13690a;

        static {
            Covode.recordClassIndex(5878);
        }

        C5286i(C5277b bVar) {
            this.f13690a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f13690a.mo13747a((Throwable) obj);
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m11663a(C5277b bVar) {
        return bVar.mo11124a((Integer) 0);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10309b(String str) {
        C89219l.m154721d(str, "");
        C5714i.m12559c(str, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$d */
    public static final class C5281d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13685a;

        static {
            Covode.recordClassIndex(5873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5281d(C5277b bVar) {
            super(1);
            this.f13685a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f13685a.mo11131c().mo11456d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$e */
    public static final class C5282e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13686a;

        static {
            Covode.recordClassIndex(5874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5282e(C5277b bVar) {
            super(1);
            this.f13686a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            C5277b bVar = this.f13686a;
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            bVar.mo11125a(b.mo13161c(), str2, "kickout_with_popup_confirm");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final AbstractC5697a m11662a(Config.VideoQuality videoQuality) {
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        if (aVar.f13637h) {
            return new C5494e(this);
        }
        return new C5201a(videoQuality, this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: c */
    public final void mo10317c(String str) {
        C3854a.m9453a(5, AbstractC4444o.f12039a, "onWarn: ".concat(String.valueOf(str)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: e */
    public final void mo10321e(String str) {
        C89219l.m154721d(str, "");
        C5714i.m12547a(true, str);
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        aVar.mo11114e();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p325d.C5201a.AbstractC5202a
    /* renamed from: f */
    public final int mo10988f(String str) {
        C89219l.m154721d(str, "");
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        return dVar.mo10895a(str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p325d.C5201a.AbstractC5202a, com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e.AbstractC5495a
    /* renamed from: g */
    public final long mo10989g(String str) {
        C89219l.m154721d(str, "");
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        return dVar.mo10903b(str);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e.AbstractC5495a
    /* renamed from: j */
    public final int mo11137j(String str) {
        C89219l.m154721d(str, "");
        C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar != null) {
            return aVar.mo10953g(str);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e.AbstractC5495a
    /* renamed from: k */
    public final int mo11139k(String str) {
        C89219l.m154721d(str, "");
        C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
        if (aVar != null) {
            return aVar.mo10954h(str);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$c */
    public static final class C5280c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13684a;

        static {
            Covode.recordClassIndex(5872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5280c(C5277b bVar) {
            super(1);
            this.f13684a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            this.f13684a.mo11131c().mo11457e(this.f13684a.mo11124a(Integer.valueOf(num.intValue())));
            this.f13684a.mo11131c().mo11456d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$g */
    public static final class C5284g extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13688a;

        static {
            Covode.recordClassIndex(5876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5284g(C5277b bVar) {
            super(1);
            this.f13688a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            if (this.f13688a.mo11132d().f13641l > 0 && this.f13688a.mo11132d().f13633d) {
                this.f13688a.mo11132d().f13634e = 1;
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$r */
    public static final class C5295r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13705a;

        /* renamed from: b */
        final /* synthetic */ int f13706b;

        /* renamed from: c */
        final /* synthetic */ long f13707c;

        /* renamed from: d */
        final /* synthetic */ String f13708d;

        /* renamed from: e */
        final /* synthetic */ String f13709e;

        static {
            Covode.recordClassIndex(5887);
        }

        C5295r(C5277b bVar, int i, long j, String str, String str2) {
            this.f13705a = bVar;
            this.f13706b = i;
            this.f13707c = j;
            this.f13708d = str;
            this.f13709e = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5661a aVar = (C5661a) obj;
            int i = this.f13706b;
            if (i == 2) {
                C5277b bVar = this.f13705a;
                long j = this.f13707c;
                AbstractC5276a aVar2 = bVar.f13662c;
                if (aVar2 != null) {
                    aVar2.mo11122d(j);
                }
            } else if (i == 1) {
                C5277b bVar2 = this.f13705a;
                C89219l.m154716b(aVar, "");
                bVar2.mo11128a(aVar, this.f13707c, this.f13708d, this.f13709e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$t */
    public static final class C5297t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13714a;

        /* renamed from: b */
        final /* synthetic */ String f13715b;

        static {
            Covode.recordClassIndex(5889);
        }

        C5297t(C5277b bVar, String str) {
            this.f13714a = bVar;
            this.f13715b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (5 - ((Number) obj).longValue() == 1) {
                this.f13714a.f13669j.remove(this.f13715b);
                AbstractC88412b bVar = this.f13714a.f13670k;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    private void m11664a(long j) {
        AbstractC88412b remove;
        Map<Long, AbstractC88412b> map = this.f13671l;
        if (map != null && j > 1000 && (remove = map.remove(Long.valueOf(j))) != null) {
            remove.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e.AbstractC5495a
    /* renamed from: i */
    public final boolean mo11136i(String str) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        Boolean bool = aVar.mo11111b().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$f */
    public static final class C5283f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13687a;

        static {
            Covode.recordClassIndex(5875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5283f(C5277b bVar) {
            super(1);
            this.f13687a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C5277b bVar = this.f13687a;
            C5271a aVar = bVar.f13667h;
            if (aVar == null) {
                C89219l.m154710a("mLinkDataHolder");
            }
            aVar.mo11108a().put(bVar.mo11140k(), Boolean.valueOf(!booleanValue));
            C5668c cVar = bVar.f13665f;
            if (cVar == null) {
                C89219l.m154710a("mRtcController");
            }
            bVar.mo11133h();
            String k = bVar.mo11140k();
            C89219l.m154721d(k, "");
            C5600m mVar = new C5600m();
            mVar.mo11371a("onAnchorVideoMute");
            C5601n nVar = new C5601n();
            nVar.f14242b.add(new C5602o(k, 0, !booleanValue, 2));
            mVar.f14238b = nVar;
            cVar.mo11446a(mVar);
            C5668c cVar2 = bVar.f13665f;
            if (cVar2 == null) {
                C89219l.m154710a("mRtcController");
            }
            cVar2.mo11456d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$j */
    public static final class C5287j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13691a;

        /* renamed from: b */
        final /* synthetic */ LinkApi.EnumC7285c f13692b;

        static {
            Covode.recordClassIndex(5879);
        }

        C5287j(C5277b bVar, LinkApi.EnumC7285c cVar) {
            this.f13691a = bVar;
            this.f13692b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = this.f13692b.value;
            C89219l.m154716b(str, "");
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "request_source", str);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14491f);
            C5714i.m12531a(C5714i.f14494j, true, "finish_succeed", jSONObject);
            C5702a.m12447a("LinkIn_finish_Success");
            this.f13691a.f13661b = false;
            AbstractC5276a aVar = this.f13691a.f13662c;
            if (aVar != null) {
                aVar.mo11115a();
            }
            C4386c.m10499a().mo10159a((Integer) 0);
            this.f13691a.f13674o.mo28320c(C4441l.class, new C7399p(8));
            C6779a.m14563a().mo13053a(new C4410a(1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$l */
    public static final class C5289l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13695a;

        /* renamed from: b */
        final /* synthetic */ long f13696b;

        /* renamed from: c */
        final /* synthetic */ String f13697c;

        static {
            Covode.recordClassIndex(5881);
        }

        C5289l(C5277b bVar, long j, String str) {
            this.f13695a = bVar;
            this.f13696b = j;
            this.f13697c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5702a.m12447a("LinkIn_kickOut_Success");
            long j = this.f13696b;
            String str = this.f13697c;
            String a = this.f13695a.mo11123a().mo10897a(this.f13696b);
            C89219l.m154721d(str, "");
            C89219l.m154721d(a, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            C3866a.m9475a(jSONObject, "request_source", str);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", a);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14490e);
            C5714i.m12543a(jSONObject, Long.valueOf(j), a);
            C5714i.m12531a(C5714i.f14494j, true, "kick_out_succeed", jSONObject);
            this.f13695a.f13660a = false;
            AbstractC5276a aVar = this.f13695a.f13662c;
            if (aVar != null) {
                aVar.mo11118b(this.f13696b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$m */
    public static final class C5290m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13698a;

        /* renamed from: b */
        final /* synthetic */ long f13699b;

        /* renamed from: c */
        final /* synthetic */ String f13700c;

        static {
            Covode.recordClassIndex(5882);
        }

        C5290m(C5277b bVar, long j, String str) {
            this.f13698a = bVar;
            this.f13699b = j;
            this.f13700c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f13698a.mo13747a(th);
            long j = this.f13699b;
            String str = this.f13700c;
            String a = this.f13698a.mo11123a().mo10897a(this.f13699b);
            C89219l.m154721d(str, "");
            C89219l.m154721d(a, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            C3866a.m9475a(jSONObject, "request_source", str);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", a);
            C5714i.m12543a(jSONObject, Long.valueOf(j), a);
            C5714i.m12488a(jSONObject, th);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14490e);
            C5714i.m12550a(true, "kick_out_failed", jSONObject, 1);
            C5702a.m12449a("LinkIn_kickOut_Failed", "throwable:".concat(String.valueOf(th)));
            this.f13698a.f13660a = false;
            AbstractC5276a aVar = this.f13698a.f13662c;
            if (aVar != null) {
                aVar.mo11119b(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$v */
    public static final class C5299v implements AbstractC5665a {

        /* renamed from: a */
        final /* synthetic */ C5277b f13721a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5697a f13722b;

        /* renamed from: c */
        final /* synthetic */ Config.VideoQuality f13723c;

        static {
            Covode.recordClassIndex(5891);
        }

        @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5665a
        /* renamed from: a */
        public final LiveCore.InteractConfig mo10326a(LiveCore.InteractConfig interactConfig) {
            C89219l.m154721d(interactConfig, "");
            interactConfig.setStreamMixer(this.f13722b);
            interactConfig.setMixStreamRtmpUrl(this.f13721a.mo11141l());
            interactConfig.setBackgroundColor("#303342");
            interactConfig.setVideoQuality(this.f13723c);
            interactConfig.setRtcExtInfo(C5277b.m11663a(this.f13721a));
            interactConfig.setInteractMode(Config.InteractMode.VIDEO_TALK_CAMERA);
            interactConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
            interactConfig.setCharacter(Config.Character.ANCHOR);
            interactConfig.setSeiVersion(1);
            interactConfig.setType(Config.Type.VIDEO);
            interactConfig.setVolumeCallbackInterval(300);
            interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
            this.f13722b.mo11301a(interactConfig);
            return interactConfig;
        }

        C5299v(C5277b bVar, AbstractC5697a aVar, Config.VideoQuality videoQuality) {
            this.f13721a = bVar;
            this.f13722b = aVar;
            this.f13723c = videoQuality;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e.AbstractC5495a
    /* renamed from: h */
    public final boolean mo11134h(String str) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        Boolean bool = aVar.mo11108a().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C5153d dVar = this.f13663d;
        if (dVar == null) {
            C89219l.m154710a("mInfoCenter");
        }
        if (dVar.mo10895a(str) != 2) {
            return false;
        }
        C5271a aVar2 = this.f13667h;
        if (aVar2 == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        aVar2.mo11108a().put(str, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$b */
    public static final class C5279b extends AbstractC89220m implements AbstractC89172b<EnumC4422k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13683a;

        static {
            Covode.recordClassIndex(5871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5279b(C5277b bVar) {
            super(1);
            this.f13683a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC4422k kVar) {
            String str;
            C89219l.m154721d(kVar, "");
            if (this.f13683a.mo11131c().f14397d || kVar != EnumC4422k.NORMAL) {
                if (this.f13683a.mo11132d().f13637h) {
                    this.f13683a.f13674o.mo28315b(C4405as.class, new C4421j(this.f13683a.mo11132d().f13646q, this.f13683a.mo11123a().mo10910g()));
                }
                if (!this.f13683a.mo11131c().f14397d) {
                    this.f13683a.mo11138j();
                } else {
                    this.f13683a.mo11131c().mo11457e(C5277b.m11663a(this.f13683a));
                    this.f13683a.mo11131c().mo11456d();
                }
                C5668c c = this.f13683a.mo11131c();
                C5609b h = this.f13683a.mo11133h();
                C5600m mVar = new C5600m();
                mVar.mo11370a();
                mVar.mo11371a("onLayoutChange");
                C5601n nVar = new C5601n();
                C5271a aVar = h.f14252a;
                if (aVar == null) {
                    C89219l.m154710a("mDataHolder");
                }
                int i = C5611c.f14255a[aVar.f13646q.ordinal()];
                if (i == 1) {
                    str = "float_fix";
                } else if (i == 2) {
                    str = "float";
                } else if (i == 3) {
                    str = "grid_fix";
                } else if (i == 4) {
                    str = "grid";
                } else if (i == 5) {
                    str = "normal";
                } else {
                    throw new C89376n();
                }
                C89219l.m154721d(str, "");
                nVar.f14241a = str;
                nVar.f14242b.addAll(h.mo11389a());
                mVar.f14238b = nVar;
                c.mo11446a(mVar);
                C5702a.m12447a("wtf: roomid:" + this.f13683a.f13673n.getIdStr() + " streamid:" + this.f13683a.f13673n.getStreamId());
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$k */
    public static final class C5288k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13693a;

        /* renamed from: b */
        final /* synthetic */ LinkApi.EnumC7285c f13694b;

        static {
            Covode.recordClassIndex(5880);
        }

        C5288k(C5277b bVar, LinkApi.EnumC7285c cVar) {
            this.f13693a = bVar;
            this.f13694b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            String str = this.f13694b.value;
            C89219l.m154716b(str, "");
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "request_source", str);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14491f);
            C5714i.m12488a(jSONObject, th);
            C5714i.m12550a(true, "finish_failed", jSONObject, 1);
            this.f13693a.mo13747a(th);
            boolean z = this.f13693a.mo11131c().f14399f;
            C5702a.m12449a("LinkIn_finish_Failed", "mUnrecoverableErrorHappened:" + z + "; throwable:" + th);
            this.f13693a.f13661b = false;
            if (!z) {
                AbstractC5276a aVar = this.f13693a.f13662c;
                if (aVar != null) {
                    aVar.mo11120c();
                    return;
                }
                return;
            }
            AbstractC5276a aVar2 = this.f13693a.f13662c;
            if (aVar2 != null) {
                aVar2.mo11115a();
            }
            C4386c.m10499a().mo10159a((Integer) 0);
            this.f13693a.f13674o.mo28320c(C4441l.class, new C7399p(8));
            C6779a.m14563a().mo13053a(new C4410a(1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$s */
    public static final class C5296s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13710a;

        /* renamed from: b */
        final /* synthetic */ int f13711b;

        /* renamed from: c */
        final /* synthetic */ long f13712c;

        /* renamed from: d */
        final /* synthetic */ String f13713d;

        static {
            Covode.recordClassIndex(5888);
        }

        C5296s(C5277b bVar, int i, long j, String str) {
            this.f13710a = bVar;
            this.f13711b = i;
            this.f13712c = j;
            this.f13713d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int errorCode;
            Throwable th = (Throwable) obj;
            int i = this.f13711b;
            if (i != 2 && i == 1) {
                C5277b bVar = this.f13710a;
                C89219l.m154716b(th, "");
                long j = this.f13712c;
                String str = this.f13713d;
                bVar.mo13747a(th);
                bVar.f13668i = false;
                bVar.f13669j.remove(str);
                C5721p.m12583a(C5721p.EnumC5722a.FAILED_PERMIT.f14523f, C5721p.EnumC5722a.FAILED_PERMIT.f14524g, C5721p.m12578a(th), th.toString());
                C89219l.m154721d(str, "");
                JSONObject jSONObject = new JSONObject();
                C3866a.m9474a(jSONObject, "error_code", 105L);
                C5714i.m12488a(jSONObject, th);
                C3866a.m9474a(jSONObject, "guest_user_id", j);
                C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
                C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5714i.f14488c);
                C5714i.m12543a(jSONObject, Long.valueOf(j), str);
                C5714i.m12550a(true, "permit_failed", jSONObject, 1);
                C5736v.m12596e(C5710e.m12494a(jSONObject));
                if ((th instanceof C2912a) && ((errorCode = ((C2908a) th).getErrorCode()) == 4004026 || errorCode == 4004029)) {
                    C5153d dVar = bVar.f13663d;
                    if (dVar == null) {
                        C89219l.m154710a("mInfoCenter");
                    }
                    dVar.mo10901a(false, C5153d.EnumC5155b.PERMIT_FAILED);
                }
                AbstractC5276a aVar = bVar.f13662c;
                if (aVar != null) {
                    aVar.mo11117a(th);
                }
                C5187f.AbstractC5188a aVar2 = (C5187f.AbstractC5188a) bVar.f38654y;
                if (aVar2 != null) {
                    aVar2.mo10950d(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$u */
    public static final class C5298u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5277b f13716a;

        /* renamed from: b */
        final /* synthetic */ int f13717b;

        /* renamed from: c */
        final /* synthetic */ long f13718c;

        /* renamed from: d */
        final /* synthetic */ String f13719d;

        /* renamed from: e */
        final /* synthetic */ String f13720e;

        static {
            Covode.recordClassIndex(5890);
        }

        C5298u(C5277b bVar, int i, long j, String str, String str2) {
            this.f13716a = bVar;
            this.f13717b = i;
            this.f13718c = j;
            this.f13719d = str;
            this.f13720e = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5702a.m12449a("LinkIn_Permit_TimeOut", "timeOut:" + this.f13717b + "; uid:" + this.f13718c + "; secUserId:" + this.f13719d);
            long j = this.f13718c;
            int i = this.f13717b;
            String str = this.f13720e;
            C89219l.m154721d(str, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "error_code", 103L);
            C3866a.m9474a(jSONObject, "error_msg", 0L);
            C3866a.m9475a(jSONObject, "error_detail", "timeout:".concat(String.valueOf(i)));
            C3866a.m9474a(jSONObject, "guest_user_id", j);
            C3866a.m9475a(jSONObject, "guest_linkmic_id", str);
            C3866a.m9475a(jSONObject, "time_out", String.valueOf(i));
            C5714i.m12543a(jSONObject, Long.valueOf(j), str);
            C5714i.m12531a(C5714i.f14494j, true, "rtc_time_out", jSONObject);
            C5736v.m12596e(C5710e.m12494a(jSONObject));
            C5721p.m12579a(C5721p.f14515c, (long) this.f13717b);
            this.f13716a.mo11125a(this.f13718c, this.f13719d, "kickout_with_timeout");
            this.f13716a.f13671l.remove(Long.valueOf(this.f13718c));
            C5146c.m11382a(this.f13718c, false);
            C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f13716a.f38654y;
            if (aVar != null) {
                aVar.mo10951e(this.f13720e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b$a */
    public static final class C5278a extends AbstractC89220m implements AbstractC89172b<C8447a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C5277b f13682a;

        static {
            Covode.recordClassIndex(5870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5278a(C5277b bVar) {
            super(1);
            this.f13682a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C8447a aVar) {
            boolean z;
            Long l;
            C7666e a;
            C7666e a2;
            boolean z2;
            C8447a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C5187f.AbstractC5188a aVar3 = (C5187f.AbstractC5188a) this.f13682a.f38654y;
            if (aVar3 == null || aVar3.isViewValid()) {
                User user = aVar2.f20885a;
                String str = aVar2.f20886b;
                C5153d a3 = this.f13682a.mo11123a();
                int i = aVar2.f20887c;
                if (user != null) {
                    long id = user.getId();
                    if (id != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                        if (room != null) {
                            l = Long.valueOf(room.getId());
                        } else {
                            l = null;
                        }
                        if (l == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (str == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (!C5146c.f13336d) {
                            try {
                                throw new IllegalStateException("Check failed.".toString());
                            } catch (IllegalArgumentException | IllegalStateException unused) {
                            }
                        } else if (C4384b.C4385a.m10496a().mo10147a() != 2) {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7o);
                        } else if (C5146c.f13337e.contains(Long.valueOf(id))) {
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8o);
                        } else {
                            if (!(a3 == null || (a2 = a3.mo10896a("", id)) == null)) {
                                if (a2.f19003e == 1 && a2.f19005g == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7z, user.displayId), 0);
                                }
                            }
                            if (C6894d.m14753a().f17273t >= C6894d.m14753a().f17275v) {
                                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8n);
                            } else if (a3 != null && (a = a3.mo10896a("", id)) != null && a.f19003e == 2) {
                                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7v, user.displayId), 0);
                            } else if (C6894d.m14753a().f17272s.contains(Long.valueOf(id))) {
                                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.e7y, user.displayId), 0);
                            } else {
                                long longValue = l.longValue();
                                long id2 = user.getId();
                                C89219l.m154721d(str, "");
                                C5146c.f13337e.add(Long.valueOf(id2));
                                C5146c.f13334b.put(Long.valueOf(id2), str);
                                JSONObject jSONObject = new JSONObject();
                                C3866a.m9474a(jSONObject, "guest_user_id", id2);
                                C5714i.m12531a(C5714i.f14494j, true, "invite_request", jSONObject);
                                C5714i.f14492g = System.currentTimeMillis();
                                C5146c.f13333a.mo142945a(((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).linkInRoomAnchorInviteGuest(longValue, id2, user.getSecUid(), LiveInteractAudienceTimeOutSetting.INSTANCE.getValue(), i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5146c.C5147a(id2), new C5146c.C5148b(id2, user)));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m11667a(LinkApi.EnumC7285c cVar) {
        String str;
        if (!this.f13661b) {
            this.f13661b = true;
            String str2 = cVar.value;
            C89219l.m154716b(str2, "");
            C89219l.m154721d(str2, "");
            JSONObject jSONObject = new JSONObject();
            C3866a.m9475a(jSONObject, "request_source", str2);
            C5714i.m12531a(C5714i.f14494j, true, "finish_request", jSONObject);
            C5714i.f14491f = System.currentTimeMillis();
            C5702a.m12449a("LinkIn_finish", "roomId:" + this.f13673n.getId());
            LinkApi linkApi = (LinkApi) C5805e.m12718a().mo11572a(LinkApi.class);
            long id = this.f13673n.getId();
            C6894d m = m11669m();
            if (m != null) {
                str = m.f17274u;
            } else {
                str = null;
            }
            ((AbstractC11137ac) linkApi.finishV1(id, str).mo142916a(mo13749v())).mo17937a(new C5287j(this, cVar), new C5288k(this, cVar));
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C89219l.m154721d(iMessage, "");
        if (iMessage instanceof C9606aj) {
            C9606aj ajVar = (C9606aj) iMessage;
            if (this.f38654y != null && ajVar.mo16562c() == C9606aj.EnumC9607a.AUDIENCE_LINKMIC && ajVar.f23319a == 5 && ajVar.f23323i != null) {
                if (ajVar.f23323i.f23801i != 1 && ajVar.f23323i.f23798f == null) {
                    return;
                }
                if (!C6894d.m14753a().f17257b) {
                    C3854a.m9453a(4, AbstractC4444o.f12039a, "handleReplyMessage, receive Reply Message, but multi guest is closed");
                    return;
                }
                if (C4502a.m10585b()) {
                    C4502a.m10578a(C4502a.EnumC4505b.DISCONNECT);
                }
                DataChannel dataChannel = this.f18624w;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C4451u.class, "");
                }
                int i = ajVar.f23323i.f23801i;
                if (i == 1) {
                    C6894d a = C6894d.m14753a();
                    C89219l.m154716b(a, "");
                    a.mo13186a(true);
                    DataChannel dataChannel2 = this.f18624w;
                    if (dataChannel2 != null) {
                        dataChannel2.mo28319c(C5690i.class);
                    }
                    C9780a aVar = ajVar.f23323i;
                    C89219l.m154716b(aVar, "");
                    mo11138j();
                    long j = aVar.f23797e;
                    User user = aVar.f23798f;
                    C89219l.m154716b(user, "");
                    String secUid = user.getSecUid();
                    String str = aVar.f23799g.f23821h;
                    C6898g.C6899a.f17285a.mo13199a(j, str);
                    if (aVar.f23804l != null) {
                        C6898g.C6899a.f17285a.mo13198a((int) aVar.f23804l.f23786b, str);
                    }
                    if (secUid == null) {
                        secUid = "";
                    }
                    C89219l.m154716b(str, "");
                    m11668b(j, secUid, str);
                    C5187f.AbstractC5188a aVar2 = (C5187f.AbstractC5188a) this.f38654y;
                    if (aVar2 != null) {
                        aVar2.mo10946b(ajVar.f23323i.f23799g.f23821h);
                    }
                    long j2 = ajVar.f23323i.f23797e;
                    C5271a aVar3 = this.f13667h;
                    if (aVar3 == null) {
                        C89219l.m154710a("mLinkDataHolder");
                    }
                    EnumC4422k kVar = aVar3.f13646q;
                    C6501b.C6502a.m13948a("livesdk_anchor_guest_connection_success").mo12639a().mo12651a("enter_from", C5146c.m11381a(j2)).mo12651a("live_type", "video_live").mo12651a("guest_invite_type", "anchor_invite_guest").mo12651a("layout_setting", C5586a.m12128a(kVar).getFirst()).mo12651a("window_setting", C5586a.m12128a(kVar).getSecond()).mo12655b();
                    long j3 = ajVar.f23323i.f23797e;
                    String str2 = ajVar.f23323i.f23799g.f23821h;
                    C89219l.m154716b(str2, "");
                    C5714i.m12534a(ajVar, j3, str2, 1);
                    return;
                }
                C5187f.AbstractC5188a aVar4 = (C5187f.AbstractC5188a) this.f38654y;
                if (aVar4 != null) {
                    aVar4.mo10949c(ajVar.f23323i.f23798f.displayId);
                }
                C5146c.m11382a(ajVar.f23323i.f23797e, false);
                AbstractC5276a aVar5 = this.f13662c;
                if (aVar5 != null) {
                    aVar5.mo11121c(ajVar.f23323i.f23797e);
                }
                C5714i.m12534a(ajVar, ajVar.f23323i.f23797e, "", (long) i);
            }
        }
    }

    /* renamed from: a */
    public final String mo11124a(Integer num) {
        String str;
        List<C7666e> list;
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        int i = C5343b.f13812a[aVar.f13646q.ordinal()];
        if (i == 1) {
            str = aVar.mo11112c().get(1L);
        } else if (i == 2) {
            str = aVar.mo11112c().get(2L);
        } else if (i == 3) {
            Object a = C4431e.f12034a.mo10199a("LINK_USER_INFO_CENTER");
            if (!(a instanceof C5153d)) {
                a = null;
            }
            C5153d dVar = (C5153d) a;
            if (!(num == null && (dVar == null || (list = dVar.f13347b) == null || (num = Integer.valueOf(list.size())) == null))) {
                int intValue = num.intValue();
                if (intValue == 2) {
                    str = aVar.mo11112c().get(3L);
                } else if (intValue == 3) {
                    str = aVar.mo11112c().get(4L);
                } else if (intValue == 4) {
                    str = aVar.mo11112c().get(5L);
                }
            }
            str = aVar.mo11112c().get(1L);
        } else if (i != 4) {
            str = aVar.mo11112c().get(0L);
        } else {
            str = aVar.mo11112c().get(5L);
        }
        aVar.f13647r = str;
        String str2 = aVar.f13647r;
        if (str2 != null && C11279p.m20013a((CharSequence) str2)) {
            return str2;
        }
        C6894d a2 = C6894d.m14753a();
        C89219l.m154716b(a2, "");
        String str3 = a2.f17262g;
        C89219l.m154716b(str3, "");
        return str3;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10311b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC5666b.C5667a.m12375b(str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10306b(int i, String str) {
        C89219l.m154721d(str, "");
        C5702a.m12456b("OnEndFailed", "position:LinkIn_Anchor; code:" + i + "; desc:" + str);
    }

    public C5277b(Room room, DataChannel dataChannel) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(dataChannel, "");
        this.f13673n = room;
        this.f13674o = dataChannel;
        C4431e.f12034a.mo10198a(new C5153d(dataChannel), null);
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: c */
    public final void mo10315c(int i, String str) {
        C89219l.m154721d(str, "");
        if (this.f38654y != null) {
            C5702a.m12456b("OnError", "position:LinkIn_Guest; code:" + i + "; message:" + str);
            C5714i.m12545a(false, i, str);
            C5721p.m12580a(C5721p.f14515c, (long) i, str);
            C3854a.m9453a(6, AbstractC4444o.f12039a, "onError: ".concat(String.valueOf(str)));
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gos);
            LinkApi.EnumC7285c cVar = LinkApi.EnumC7285c.RTC_ERROR;
            this.f13676q = true;
            if (cVar != null) {
                mo11129a(cVar, PrivacyCert.Builder.Companion.with("bpea-525").usage("").tag("stop link mic when error occurs").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10312b(String str, boolean z) {
        C89219l.m154721d(str, "");
        C5271a aVar = this.f13667h;
        if (aVar == null) {
            C89219l.m154710a("mLinkDataHolder");
        }
        aVar.mo11111b().put(str, Boolean.valueOf(z));
        this.f13674o.mo28320c(C5598k.class, new C5591d(str, z));
        C5668c cVar = this.f13665f;
        if (cVar == null) {
            C89219l.m154710a("mRtcController");
        }
        cVar.mo11456d();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p368c.AbstractC5666b
    /* renamed from: b */
    public final void mo10310b(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(surfaceView, "");
        if (this.f38654y != null) {
            C5702a.m12456b("OnFirstRemoteVideoFrame", "position:LinkIn_Anchor; interactId:".concat(String.valueOf(str)));
            C5714i.m12556b(str, true);
            C5187f.AbstractC5188a aVar = (C5187f.AbstractC5188a) this.f38654y;
            if (aVar != null) {
                aVar.mo10943a(str, surfaceView);
            }
            C5153d dVar = this.f13663d;
            if (dVar == null) {
                C89219l.m154710a("mInfoCenter");
            }
            long b = dVar.mo10903b(str);
            if (b > 0) {
                if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue()) {
                    C5153d dVar2 = this.f13663d;
                    if (dVar2 == null) {
                        C89219l.m154710a("mInfoCenter");
                    }
                    C7666e a = C5153d.m11384a(dVar2, str, 0, 2);
                    if (!(a == null || a.f19001c == null)) {
                        User user = a.f19001c;
                        C89219l.m154716b(user, "");
                        m11664a(user.getId());
                    }
                }
                String a2 = C5146c.m11381a(b);
                C89219l.m154721d(a2, "");
                if (C5711f.f14474b.isEmpty()) {
                    C5711f.f14473a = System.currentTimeMillis();
                }
                C5711f.f14474b.put(Long.valueOf(b), a2);
                C5146c.m11382a(b, false);
                C6528g gVar = new C6528g();
                User owner = this.f13673n.getOwner();
                C89219l.m154716b(owner, "");
                gVar.f16298a = owner.getId();
                C89219l.m154716b(gVar, "");
                gVar.f16299b = b;
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(this.f13673n.getId()));
                User owner2 = this.f13673n.getOwner();
                C89219l.m154716b(owner2, "");
                hashMap.put("anchor_id", String.valueOf(owner2.getId()));
                hashMap.put("channel_id", String.valueOf(this.f13673n.getId()));
                hashMap.put("connection_type", "audience");
                C4384b.C4385a.m10496a().f11918H = System.currentTimeMillis();
                String str2 = C4384b.C4385a.m10496a().f11976x;
                if (!TextUtils.isEmpty(str2)) {
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    hashMap.put("request_id", str2);
                }
                C6501b.C6502a.m13948a("connection_success").mo12652a((Map<String, String>) hashMap).mo12642a(gVar).mo12655b();
                C5668c cVar = this.f13665f;
                if (cVar == null) {
                    C89219l.m154710a("mRtcController");
                }
                mo11133h();
                C89219l.m154721d(str, "");
                C5600m mVar = new C5600m();
                mVar.mo11370a();
                mVar.mo11371a("onGuestVideoFrameSuc");
                C5601n nVar = new C5601n();
                nVar.f14242b.add(new C5602o(str, 0, false, 6));
                mVar.f14238b = nVar;
                cVar.mo11446a(mVar);
            }
        }
    }

    /* renamed from: b */
    private final void m11668b(long j, String str, String str2) {
        if (LinkInteractAudienceOptEnableSetting.INSTANCE.getValue() && this.f13671l.get(Long.valueOf(j)) == null) {
            int value = LiveInteractAudienceTimeOutSetting.INSTANCE.getValue();
            AbstractC88412b a = ((AbstractC11181z) AbstractC88979t.m154307b((long) value, TimeUnit.SECONDS).mo143274a(mo13749v())).mo17949a(new C5298u(this, value, j, str, str2));
            Map<Long, AbstractC88412b> map = this.f13671l;
            Long valueOf = Long.valueOf(j);
            C89219l.m154716b(a, "");
            map.put(valueOf, a);
        }
    }

    /* renamed from: a */
    private final void m11665a(long j, String str, String str2, int i) {
        AbstractC88403ab<C5661a> g;
        AbstractC11137ac acVar;
        HashMap hashMap = new HashMap();
        hashMap.put("userId", Long.valueOf(j));
        hashMap.put("roomId", Long.valueOf(this.f13673n.getId()));
        hashMap.put("secUserId", str);
        hashMap.put("interactId", str2);
        hashMap.put("linkmicPermitStatus", Integer.valueOf(i));
        C5194a n = m11670n();
        if (n != null && (g = n.mo10981g(hashMap)) != null && (acVar = (AbstractC11137ac) g.mo142916a(mo13749v())) != null) {
            acVar.mo17937a(new C5295r(this, i, j, str, str2), new C5296s(this, i, j, str2));
        }
    }
}
