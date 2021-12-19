package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.C4393ag;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.C4395ai;
import com.bytedance.android.live.liveinteract.api.C4397ak;
import com.bytedance.android.live.liveinteract.api.C4400an;
import com.bytedance.android.live.liveinteract.api.C4443n;
import com.bytedance.android.live.liveinteract.api.C4448r;
import com.bytedance.android.live.liveinteract.api.C4449s;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.AbstractC4475e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4457a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4469d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4490a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4491b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4492c;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4493d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4495f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.live.liveinteract.cohost.p269b.C4598a;
import com.bytedance.android.live.liveinteract.cohost.p270c.C4617b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4634a;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4645c;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p287a.C4831a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p288b.C4836a;
import com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b;
import com.bytedance.android.live.liveinteract.linkroom.p290b.C4866a;
import com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a;
import com.bytedance.android.live.liveinteract.linkroom.p291c.C4870b;
import com.bytedance.android.live.liveinteract.linkroom.p291c.C4879e;
import com.bytedance.android.live.liveinteract.linkroom.widget.C4905ac;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4956g;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4959j;
import com.bytedance.android.live.liveinteract.match.p295b.p299d.C4962b;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget;
import com.bytedance.android.live.liveinteract.multiguest.p323b.C5194a;
import com.bytedance.android.live.liveinteract.multiguest.p324c.C5200a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.AbstractC5258a;
import com.bytedance.android.live.liveinteract.multilive.anchor.p351b.C5482a;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5682a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5683b;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5688g;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5689h;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5690i;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5692k;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5720o;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5742a;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5746d;
import com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5651b;
import com.bytedance.android.live.liveinteract.platform.p363a.C5659c;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5647a;
import com.bytedance.android.live.liveinteract.platform.p363a.p364a.C5650b;
import com.bytedance.android.live.liveinteract.platform.p363a.p365b.C5658g;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p379n.C5789u;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.callback.AbstractC7257a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorAutoOpenGuestLinkmicSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMtInteractInviterCancelEnableSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p583c.C9754d;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9040bf;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9071cj;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public class LinkControlWidget extends BaseLinkControlWidget implements C4840b.AbstractC4842a, AbstractC4867a.AbstractC4869b, AbstractC7257a, AbstractC33974au {

    /* renamed from: a */
    MultiGuestAsAnchorWidget f12827a;

    /* renamed from: b */
    LinkCrossRoomWidget f12828b;

    /* renamed from: c */
    LiveWidget f12829c;

    /* renamed from: d */
    C4840b f12830d;

    /* renamed from: e */
    public boolean f12831e;

    /* renamed from: f */
    BaseLinkControlWidget.AbstractC4381a f12832f;

    /* renamed from: g */
    int f12833g;

    /* renamed from: h */
    C4469d.AbstractC4473d f12834h;

    /* renamed from: i */
    public AbstractC4867a f12835i;

    /* renamed from: j */
    public boolean f12836j;

    /* renamed from: k */
    boolean f12837k;

    /* renamed from: l */
    EnumC4440k f12838l;

    /* renamed from: m */
    EnumC4949c f12839m;

    /* renamed from: n */
    EnumC4949c f12840n;

    /* renamed from: o */
    private MultiGuestAsGuestWidget f12841o;

    /* renamed from: p */
    private Room f12842p;

    /* renamed from: q */
    private EnumC11728i f12843q;

    /* renamed from: r */
    private boolean f12844r;

    /* renamed from: s */
    private long f12845s;

    /* renamed from: t */
    private String f12846t;

    /* renamed from: u */
    private C11191f f12847u;
    @AbstractC4430d(mo10204a = "LINKER_MANAGER")

    /* renamed from: v */
    private C5659c f12848v;
    @AbstractC4430d(mo10204a = "LINK_MESSAGE_CENTER")

    /* renamed from: w */
    private C5658g f12849w;

    static {
        Covode.recordClassIndex(5481);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final int mo10579a(int i) {
        return i != 2 ? R.string.dwh : R.string.e4g;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.be2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10582a(LinkApi.EnumC7287e eVar) {
        if (!this.f12836j) {
            C6894d.m14753a().mo10159a((Object) true);
            if (!this.f12842p.isLiveTypeAudio()) {
                AbstractC5651b a = this.f12848v.mo11439a();
                if (!(a instanceof C5194a)) {
                    C4431e.f12034a.mo10198a(new C5200a(), null);
                    C5650b bVar = new C5650b();
                    bVar.f14365b = this.f12831e;
                    this.f12848v.mo11440a(this.f12842p.getOwnerUserId(), C5647a.EnumC5648a.MULTIGUEST, this.dataChannel, bVar);
                    a = this.f12848v.mo11442b(C5647a.EnumC5648a.MULTIGUEST);
                }
                if (!this.f12831e && (a instanceof C5194a)) {
                    ((C5194a) a).f13431d.mo11110a(this.f12830d.f12690g);
                    if (this.f12830d.f12690g) {
                        C6894d.m14753a().f17275v = 3;
                    }
                }
                C5702a.m12449a("onMultiGuestTurnedOn", "source:" + eVar.value);
                m11087c(2);
                C5741z.f14563a = SystemClock.uptimeMillis();
                Map<String, String> a2 = C5741z.m12605a();
                String str = C5741z.f14564b;
                if (str == null) {
                    str = "others";
                }
                a2.put("trigger", str);
                C5586a.m12137a(a2, C5586a.m12139b());
                C5741z.f14564b = null;
                C5741z.m12607a("livesdk_guest_connection_mode_view_start", a2);
            }
            if (eVar == LinkApi.EnumC7287e.USER_CLICK) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.duc);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10585a(C9754d dVar) {
        Room room;
        if (isViewValid() && C4384b.C4385a.m10496a().f11957e != 0) {
            mo10638l();
            if (C4384b.C4385a.m10496a().f11968p == EnumC4442m.RANDOM_LINK_MIC_INVITE && C4502a.m10585b()) {
                if (this.dataChannel != null) {
                    this.dataChannel.mo28320c(C4449s.class, "");
                }
                C4384b.C4385a.m10496a().f11966n = true;
                if (C4384b.C4385a.m10496a().f11975w && !TextUtils.isEmpty(C4384b.C4385a.m10496a().f11974v)) {
                    mo10635a(PrivacyCert.Builder.with("bpea-505").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                C4384b a = C4384b.C4385a.m10496a();
                if (a.f11957e == 0 || (room = this.f12842p) == null) {
                    C4617b.m10735a();
                    return;
                }
                room.getId();
                if (a.f11975w && !TextUtils.isEmpty(a.f11974v)) {
                    C5702a.m12449a("LinkCross_Reply", "start Interact when reply click agree");
                    a.f11955c = true;
                    if (this.dataChannel != null) {
                        this.dataChannel.mo28320c(C4450t.class, new C7398o(4));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reply_status", 1);
                if (this.f12848v.mo11442b(C5647a.EnumC5648a.COHOST) != null) {
                    AbstractC88403ab<C5661a> b = this.f12848v.mo11442b(C5647a.EnumC5648a.COHOST).mo10344b(hashMap);
                    if (b == null) {
                        C5702a.m12449a("LinkCross_Reply", "single is null");
                        return;
                    }
                    if (this.f12847u == null) {
                        this.f12847u = new C11191f();
                    }
                    ((AbstractC11137ac) b.mo142916a(C11152e.m19792a(C11126a.m19763a(this, AbstractC1196i.EnumC1198a.ON_DESTROY), this.f12847u))).mo17937a(C4922l.f12881a, new C4924n(this));
                }
            } else if (C4384b.C4385a.m10496a().f11968p != EnumC4442m.RANDOM_LINK_MIC_INVITE) {
                C89219l.m154721d(this, "");
                C89219l.m154721d(dVar, "");
                C4645c cVar = new C4645c(this);
                C4588x.EnumC4589a aVar = C4588x.EnumC4589a.INVITEE_FRAGMENT;
                C4457a.C4460c cVar2 = new C4457a.C4460c((byte) 0);
                cVar2.f12043a = dVar;
                this.f12834h = cVar.mo10394b(aVar, cVar2);
                AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
                if (iVar != null) {
                    this.f12834h.show(iVar, "LinkDialog");
                }
                if (C4384b.C4385a.m10496a().f11975w && !TextUtils.isEmpty(C4384b.C4385a.m10496a().f11974v)) {
                    mo10635a(PrivacyCert.Builder.with("bpea-507").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
                    if (linkCrossRoomWidget != null) {
                        linkCrossRoomWidget.f12643g.mo10298a((Boolean) true);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10584a(C9606aj ajVar) {
        if (isViewValid() && ajVar.f23321g == 4 && !this.f12831e) {
            m11088d(2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4424c
    /* renamed from: a */
    public final void mo10197a(String str) {
        LinkCrossRoomWidget linkCrossRoomWidget;
        MultiGuestAsGuestWidget multiGuestAsGuestWidget;
        C3854a.m9453a(4, "LinkControlWidget", "linkmic_sei_update, sei = ".concat(String.valueOf(str)));
        C5702a.m12449a("linkmic_sei_update", str);
        if (!this.f12831e) {
            boolean a = C4394ah.m10505a(this.f12833g, 2);
            C3854a.m9453a(4, "LinkControlWidget", "onSei, containMultiGuest = ".concat(String.valueOf(a)));
            if (!a || (multiGuestAsGuestWidget = this.f12841o) == null) {
                boolean a2 = C4394ah.m10505a(this.f12833g, 4);
                C3854a.m9453a(4, "LinkControlWidget", "onSei, containCoHost = ".concat(String.valueOf(a2)));
                if (!a2 || (linkCrossRoomWidget = this.f12828b) == null) {
                    this.f12846t = str;
                } else if (!linkCrossRoomWidget.f12641e && linkCrossRoomWidget.f12645i != null) {
                    linkCrossRoomWidget.f12645i.mo11465b(str);
                }
            } else {
                AbstractC5258a aVar = multiGuestAsGuestWidget.f13873c;
                if (aVar != null) {
                    aVar.mo11078a(str);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10635a(PrivacyCert privacyCert) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
        if (linkCrossRoomWidget != null) {
            linkCrossRoomWidget.mo10545a(privacyCert);
        } else {
            m11087c(4);
        }
    }

    @Override // com.bytedance.android.livesdk.callback.AbstractC7257a
    /* renamed from: a */
    public final boolean mo10636a(Runnable runnable) {
        MultiGuestAsGuestWidget multiGuestAsGuestWidget;
        if (!this.f12831e && (multiGuestAsGuestWidget = this.f12841o) != null) {
            C4386c a = C4386c.m10499a();
            C89219l.m154716b(a, "");
            T t = a.f17248n;
            if (t != null && 2 == t.intValue()) {
                new DialogC9148b.C9149a(multiGuestAsGuestWidget.getContext()).mo15248b(R.string.goj).mo15244a(R.string.gtk, (DialogInterface.OnClickListener) new MultiGuestAsGuestWidget.DialogInterface$OnClickListenerC5370c(multiGuestAsGuestWidget, runnable), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) MultiGuestAsGuestWidget.DialogInterface$OnClickListenerC5371d.f13888a, false).mo15247a().show();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10586a(boolean z) {
        C5702a.m12449a("LinkCrossRoomPermissionResult", "result : ".concat(String.valueOf(z)));
        this.f12835i.mo10604c(z);
        if (this.f12836j) {
            this.f12835i.mo10599a(8, 17);
        }
        this.f12848v.f14382a = z;
        C4384b.C4385a.m10496a().f11925O = z;
        m11090t();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: b */
    public final void mo10587b() {
        mo10638l();
        m11087c(4);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: c */
    public final void mo10590c() {
        m11088d(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo10638l() {
        try {
            C4469d.AbstractC4473d dVar = this.f12834h;
            if (dVar != null) {
                dVar.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ C89391z mo10639m() {
        mo10638l();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ C89391z mo10643q() {
        m11089s();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ C89391z mo10644r() {
        m11089s();
        return C89391z.f203057a;
    }

    /* renamed from: v */
    private static void m11092v() {
        LivePerformanceManager.getInstance().onModuleStop("link_mic");
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: d */
    public final void mo10591d() {
        if (isViewValid()) {
            mo10638l();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* renamed from: u */
    private static boolean m11091u() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gol);
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: e */
    public final void mo10592e() {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
        if (linkCrossRoomWidget != null && this.f12831e && linkCrossRoomWidget.f12643g != null) {
            linkCrossRoomWidget.f12643g.mo10305b(204);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ C89391z mo10641o() {
        C4469d.AbstractC4473d dVar = this.f12834h;
        if (dVar != null && dVar.mo10253d() == C4588x.EnumC4589a.INVITE_USER_LIST_FRAGMENT && LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2) {
            return C89391z.f203057a;
        }
        mo10638l();
        return C89391z.f203057a;
    }

    /* renamed from: t */
    private void m11090t() {
        if (this.dataChannel != null && LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
            boolean z = this.f12848v.f14382a;
            boolean z2 = this.f12848v.f14383b;
            int i = 0;
            if (z) {
                if (z2) {
                    i = 3;
                } else {
                    i = 1;
                }
            } else if (z2) {
                i = 2;
            }
            this.dataChannel.mo28311a(C4393ag.class, Integer.valueOf(i));
            C3854a.m9453a(4, "updateLinkMicEnableStatus", "newestStatus = ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ C89391z mo10640n() {
        if (C4384b.C4385a.m10496a().f11969q) {
            this.f12830d.mo10571d();
            this.f12830d.mo10567a(LinkApi.EnumC7283a.RTC_ERROR_CANCEL);
        } else {
            this.f12830d.mo10565a(6);
            mo10638l();
        }
        return C89391z.f203057a;
    }

    /* renamed from: s */
    private void m11089s() {
        mo10638l();
        boolean a = C4394ah.m10505a(this.f12833g, 2);
        C3854a.m9453a(4, "LinkControlWidget", "onMultiGuestClicked, containMultiGuest = " + a + "  mIsAnchor = " + this.f12831e);
        if (!a) {
            this.f12844r = true;
            this.f12830d.mo10568a(LinkApi.EnumC7287e.USER_CLICK);
            C5703b.m12479c("manual");
        } else if (this.f12831e) {
            C5720o.m12575a("connection_button");
            this.f12827a.mo11190d();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: f */
    public final void mo10593f() {
        if (isViewValid() && !this.f12831e) {
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.context, EnumC11229b.LINK_MIC);
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.efh);
            } else if (this.f12836j) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e47);
            } else if (!C4394ah.m10505a(this.f12833g, 2)) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eem);
            } else {
                mo10609k();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a.AbstractC4869b
    /* renamed from: k */
    public final void mo10609k() {
        int i = Build.VERSION.SDK_INT;
        Room room = this.f12842p;
        if (room != null && room.getMosaicStatus() == 1) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpj);
        } else if (this.f12833g != 2 || this.f12831e) {
            C4469d.AbstractC4473d dVar = this.f12834h;
            if ((dVar == null || !dVar.isVisible()) && this.f12835i.mo10600a()) {
                C4836a.m10966a(2);
                this.f12835i.mo10605d();
                m11089s();
                if (this.f12831e) {
                    C5703b.m12473b("golive_window");
                } else {
                    C5703b.m12464a("connection_button", this.f12842p.getOwner().getFollowInfo().getFollowStatus());
                }
            }
        } else {
            this.f12841o.mo11193a(true);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        EnumC5847l.INTERACTION.unload(this.dataChannel);
        this.f12832f = null;
        this.f12846t = null;
        C5658g gVar = this.f12849w;
        IMessageManager iMessageManager = (IMessageManager) gVar.f14379a.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(gVar);
        }
        this.f12830d.mo8577b();
        mo10638l();
        this.dataChannel.mo28316b(this);
        DataChannelGlobal.f42558d.mo28326b(this);
        C6894d.m14753a().f17256a = null;
        if (!this.f12831e) {
            C5586a.m12141b("live_over", null);
        }
        C4431e.f12034a.mo10200a().clear();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ C89391z mo10642p() {
        boolean z = C4384b.C4385a.m10496a().f11954b;
        boolean z2 = C4384b.C4385a.m10496a().f11969q;
        C3854a.m9453a(4, "LinkControlWidget", "receive MultiGuestAnchorInProgressChanged, isStaring = " + z + "  isStarter = " + z2);
        if (z) {
            if (z2) {
                this.f12830d.mo10571d();
                this.f12830d.mo10567a(LinkApi.EnumC7283a.INTERRUPT_BY_MULTI_GUEST);
            } else {
                this.f12830d.mo10565a(11);
            }
        }
        mo10638l();
        return C89391z.f203057a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget$3 */
    static /* synthetic */ class C49013 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12853a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12854b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.C49013.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: h */
    public final void mo10594h() {
        if (isViewValid() && this.f12831e) {
            if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(this.context, EnumC11229b.LINK_MIC);
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.efh);
            } else if (this.f12836j) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e47);
            } else {
                int i = Build.VERSION.SDK_INT;
                Room room = this.f12842p;
                if (room != null && room.getMosaicStatus() == 1) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpj);
                } else if (!C4394ah.m10505a(this.f12833g, 4)) {
                    C4469d.AbstractC4473d dVar = this.f12834h;
                    if ((dVar == null || !dVar.isVisible()) && this.f12835i.mo10602b()) {
                        C4836a.m10966a(1);
                        this.f12835i.mo10605d();
                        C4384b.C4385a.m10496a().f11932V = "banner";
                        mo10637c(false);
                        C5713h.m12516a("room", "banner", false);
                        C5713h.m12511a(this.dataChannel);
                    }
                } else if (C4384b.C4385a.m10496a().mo10150a(EnumC4440k.CONNECTION_START)) {
                    C3854a.m9453a(6, "LinkControlWidget", "H5 open co-host, but now is co-hosting!");
                } else if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING) {
                    C3854a.m9453a(6, "LinkControlWidget", "H5 open co-host, but is inviting other host!");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a.AbstractC4869b
    /* renamed from: j */
    public final void mo10608j() {
        AbstractC0952i iVar;
        int i = Build.VERSION.SDK_INT;
        Room room = this.f12842p;
        if (room != null && room.getMosaicStatus() == 1) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpj);
        } else if (C4502a.m10589e() || C4502a.m10588d()) {
            C4502a.m10579a(C4502a.EnumC4506c.PREVIEW_DIALOG);
        } else if (C4502a.m10590f()) {
            C4502a.m10579a(C4502a.EnumC4506c.CANCEL_DIALOG);
        } else if (!C4394ah.m10505a(this.f12833g, 4)) {
            C4469d.AbstractC4473d dVar = this.f12834h;
            if ((dVar == null || !dVar.isVisible()) && this.f12835i.mo10602b()) {
                C4836a.m10966a(1);
                C4384b.C4385a.m10496a().f11932V = "connection_icon";
                mo10637c(false);
                C5713h.m12516a("room", "connection_icon", false);
                C5713h.m12511a(this.dataChannel);
            }
        } else if (C4384b.C4385a.m10496a().mo10150a(EnumC4440k.CONNECTION_START)) {
            LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
            if (linkCrossRoomWidget != null) {
                linkCrossRoomWidget.mo10548f();
            }
        } else if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && LiveMtInteractInviterCancelEnableSetting.INSTANCE.getValue() && (iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class)) != null) {
            new C4634a().show(iVar, "InteractCancelDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p291c.AbstractC4867a.AbstractC4869b
    /* renamed from: i */
    public final void mo10607i() {
        AbstractC0952i iVar;
        if (this.f12831e) {
            Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
            if (a instanceof C5271a) {
                C5713h.m12504a(this.f12833g, this.f12842p, ((C5271a) a).f13646q, true, false);
            } else {
                C5713h.m12504a(this.f12833g, this.f12842p, (EnumC4422k) null, true, false);
            }
        } else {
            C5713h.m12523b("connection_button");
            C5713h.f14480b = "connection_button";
        }
        int i = Build.VERSION.SDK_INT;
        Room room = this.f12842p;
        if (room != null && room.getMosaicStatus() == 1) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpj);
        } else if (C4502a.m10589e() || C4502a.m10588d()) {
            C4502a.m10579a(C4502a.EnumC4506c.PREVIEW_DIALOG);
        } else if (C4502a.m10590f()) {
            C4502a.m10579a(C4502a.EnumC4506c.CANCEL_DIALOG);
        } else {
            int i2 = this.f12833g;
            if (i2 == 2 && !this.f12831e) {
                this.f12841o.mo11193a(true);
            } else if (!C4394ah.m10505a(i2, 4)) {
                C4469d.AbstractC4473d dVar = this.f12834h;
                if (dVar != null && dVar.isVisible()) {
                    return;
                }
                if (this.f12835i.mo10602b() && !this.f12835i.mo10600a()) {
                    C4836a.m10966a(1);
                    this.f12835i.mo10605d();
                    C4384b.C4385a.m10496a().f11932V = "connection_icon";
                    mo10637c(this.f12835i.mo10600a());
                    C5713h.m12516a("room", "connection_icon", false);
                    C5713h.m12511a(this.dataChannel);
                } else if (this.f12835i.mo10602b() || !this.f12835i.mo10600a()) {
                    C89219l.m154721d(this, "");
                    this.f12834h = new C4645c(this).mo10394b(C4588x.EnumC4589a.BUTTON_FRAGMENT, C4831a.C4834c.C4835a.m10965a());
                    AbstractC0952i iVar2 = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
                    if (iVar2 != null) {
                        this.f12834h.show(iVar2, "LinkDialog");
                    }
                } else {
                    C4836a.m10966a(2);
                    this.f12835i.mo10605d();
                    m11089s();
                    if (this.f12831e) {
                        C5703b.m12473b("golive_window");
                    } else {
                        C5703b.m12464a("connection_button", this.f12842p.getOwner().getFollowInfo().getFollowStatus());
                    }
                }
            } else if (C4384b.C4385a.m10496a().mo10150a(EnumC4440k.CONNECTION_START)) {
                LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
                if (linkCrossRoomWidget != null) {
                    linkCrossRoomWidget.mo10548f();
                }
            } else if (C4384b.C4385a.m10496a().mo10151b() == EnumC4440k.INVITING && LiveMtInteractInviterCancelEnableSetting.INSTANCE.getValue() && (iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class)) != null) {
                new C4634a().show(iVar, "InteractCancelDialog");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10580a() {
        C6894d.m14753a().mo10159a((Object) false);
        if (C4394ah.m10505a(this.f12833g, 2)) {
            m11088d(2);
        }
        if (!this.f12831e) {
            this.f12835i.mo10599a(8, 16);
            C5586a.m12141b("others", EnumC4422k.NORMAL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f12836j = ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom();
        this.f12842p = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f12831e = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f12843q = (EnumC11728i) this.dataChannel.mo28318b(C9058bx.class);
        C4905ac.m11132a(C4905ac.EnumC4906a.NOTCOHOST);
        if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f12835i instanceof C4870b)) {
            EnumC5847l.INTERACTION.load(this.dataChannel, this.f12835i, false);
        } else {
            if (this.f12831e) {
                EnumC5847l.COHOST.load(this.dataChannel, ((C4870b) this.f12835i).f12727b, false);
            }
            EnumC5847l.MULTIGUEST.load(this.dataChannel, ((C4870b) this.f12835i).f12728c, false);
        }
        this.f12835i.mo10599a(8, 17);
        C5658g gVar = new C5658g(this.dataChannel);
        this.f12849w = gVar;
        IMessageManager iMessageManager = (IMessageManager) gVar.f14379a.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.LINK_MIC_SIGNAL.getIntType(), gVar);
            iMessageManager.addMessageListener(EnumC9596a.LINK_MIC.getIntType(), gVar);
            iMessageManager.addMessageListener(EnumC9596a.LINK_MESSAGE.getIntType(), gVar);
        }
        C4431e.f12034a.mo10198a(new C5659c(), null);
        C4431e.f12034a.mo10198a(this.f12849w, null);
        C4431e.f12034a.mo10201a(this);
        C4840b bVar = new C4840b(this.f12842p, this.f12831e, this.f12843q);
        this.f12830d = bVar;
        bVar.mo10297a((C4840b.AbstractC4842a) this);
        this.dataChannel.mo28309a((AbstractC1204m) this, C5682a.class, (AbstractC89172b) new C4902a(this)).mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C4912b(this)).mo28309a((AbstractC1204m) this, C9071cj.class, (AbstractC89172b) new C4923m(this)).mo28309a((AbstractC1204m) this, C9040bf.class, (AbstractC89172b) new C4932v(this)).mo28309a((AbstractC1204m) this, C4443n.class, (AbstractC89172b) new C4933w(this)).mo28309a((AbstractC1204m) this, C5690i.class, (AbstractC89172b) new C4934x(this)).mo28309a((AbstractC1204m) this, C5683b.class, (AbstractC89172b) new C4935y(this)).mo28309a((AbstractC1204m) this, C4397ak.class, (AbstractC89172b) new C4936z(this)).mo28310a(C4490a.class, (AbstractC89172b) new C4903aa(this)).mo28310a(C4493d.class, (AbstractC89172b) new C4904ab(this)).mo28310a(C4495f.class, (AbstractC89172b) new C4913c(this)).mo28310a(C4491b.class, (AbstractC89172b) new C4914d(this)).mo28310a(C4492c.class, (AbstractC89172b) new C4915e(this)).mo28310a(C5688g.class, (AbstractC89172b) new C4916f(this)).mo28310a(C5482a.class, (AbstractC89172b) new C4917g(this));
        DataChannelGlobal.f42558d.mo28323a(this, C5692k.class, new C4918h(this));
        LiveAppBundleUtils.ensurePluginAvailable(this.context, EnumC11229b.LINK_MIC, new AbstractC21959b() {
            /* class com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.C48991 */

            static {
                Covode.recordClassIndex(5482);
            }

            @Override // com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b
            /* renamed from: b */
            public final void mo10646b() {
                C3854a.m9453a(6, "LinkControlWidget", "Link mic bundle load failed");
            }

            @Override // com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b
            /* renamed from: a */
            public final void mo10645a() {
                if (!LinkControlWidget.this.f12836j && LinkControlWidget.this.f12831e) {
                    LinkControlWidget.this.f12835i.mo10603c();
                    C3854a.m9453a(6, "LinkControlWidget", "Link mic bundle load failed");
                }
            }
        });
        LiveAppBundleUtils.ensurePluginAvailable(this.context, EnumC11229b.QUIC);
        LiveAppBundleUtils.ensurePluginAvailable(this.context, EnumC11229b.RTS);
        Context context = this.context;
        C89219l.m154721d(context, "");
        C5746d.m12614a(context, C4962b.m11162a().getBattleStart());
        C5746d.m12614a(context, C4962b.m11162a().getBattleDraw());
        C5746d.m12614a(context, C4962b.m11162a().getBattleWin());
        C5746d.m12614a(context, C4962b.m11162a().getBattleLose());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreClap());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreCry());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreInitial());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreStrive());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreTongue());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreStrong());
        C5746d.m12614a(context, C4962b.m11162a().getBattleScoreWeak());
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C5789u.class, (AbstractC89172b) new C4929s(this));
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C4395ai.class, (AbstractC89172b) new C4930t(this));
        }
        this.dataChannel.mo28310a(C4400an.class, (AbstractC89172b) new C4919i(this)).mo28310a(C4959j.class, (AbstractC89172b) new C4920j(this)).mo28310a(C4956g.class, (AbstractC89172b) new C4921k(this));
        C6894d.m14753a().f17256a = new C6894d.AbstractC6895a() {
            /* class com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget.C49002 */

            /* renamed from: a */
            boolean f12851a;

            static {
                Covode.recordClassIndex(5483);
            }

            @Override // com.bytedance.android.livesdk.p458b.p459a.C6894d.AbstractC6895a
            /* renamed from: a */
            public final void mo10647a(boolean z) {
                if (this.f12851a != z) {
                    this.f12851a = z;
                    C3854a.m9453a(3, "LinkControlWidget", "multi-guest state: ".concat(String.valueOf(z)));
                    if (z) {
                        LinkControlWidget.this.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12006c));
                        C4866a.m11011a(C4415e.f12006c);
                        return;
                    }
                    LinkControlWidget.this.dataChannel.mo28320c(C4417f.class, new C4415e(C4415e.f12005b));
                    C4866a.m11011a(C4415e.f12005b);
                }
            }
        };
        if (!this.f12831e) {
            C5586a.m12131a("live_play", EnumC4422k.NORMAL);
        }
    }

    public LinkControlWidget(BaseLinkControlWidget.AbstractC4381a aVar) {
        AbstractC4867a eVar;
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            eVar = new C4870b(this, this);
        } else {
            eVar = new C4879e(this, this);
        }
        this.f12835i = eVar;
        this.f12836j = false;
        this.f12837k = false;
        this.f12838l = null;
        this.f12839m = null;
        this.f12840n = null;
        this.f12832f = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: b */
    public final void mo10588b(int i) {
        if (i != 2 && i != 5) {
            return;
        }
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 1) {
            mo10637c(false);
        } else if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 2 && !this.f12834h.isVisible()) {
            mo10637c(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo10632a(Boolean bool) {
        mo10638l();
        if (this.f12828b != null) {
            C4384b.C4385a.m10496a().f11963k = bool.booleanValue();
            LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
            if (linkCrossRoomWidget.f12643g == null) {
                return null;
            }
            linkCrossRoomWidget.f12643g.mo10305b(209);
            return null;
        } else if (this.dataChannel == null) {
            return null;
        } else {
            this.dataChannel.mo28320c(C4450t.class, new C7398o(1));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10637c(boolean z) {
        if (C4384b.C4385a.m10496a().f11937a || C4502a.m10589e()) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dwh);
            return;
        }
        boolean b = this.f12835i.mo10602b();
        C4469d.AbstractC4473d dVar = this.f12834h;
        if ((dVar == null || !dVar.isVisible()) && m11091u() && b && !C4840b.m10971c()) {
            this.f12834h = C5742a.m12612a(this, z);
            AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
            if (iVar != null) {
                this.f12834h.show(iVar, "LinkDialog");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo10633a(Integer num) {
        C4840b bVar = this.f12830d;
        if (bVar != null) {
            bVar.mo10571d();
        }
        mo10581a(num.intValue(), PrivacyCert.Builder.with("bpea-504").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: b */
    public final void mo10589b(boolean z) {
        String str;
        C5702a.m12449a("LinkInRoomPermissionResult", "result : ".concat(String.valueOf(z)));
        this.f12835i.mo10601b(z);
        if (this.f12836j) {
            this.f12835i.mo10599a(8, 17);
        }
        this.f12848v.f14383b = z;
        m11090t();
        Room room = this.f12842p;
        boolean booleanValue = AbstractC6804a.f17036cj.mo13066a().booleanValue();
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("room_id", room.getIdStr());
        String str2 = "1";
        if (z) {
            str = str2;
        } else {
            str = "0";
        }
        hashMap.put("guest_avaliable", str);
        if (!booleanValue) {
            str2 = "0";
        }
        hashMap.put("guest_connection_switch_status", str2);
        C5713h.m12517a("livesdk_guest_connection_switch_status", hashMap);
        if (z && !this.f12836j && this.f12830d != null) {
            if (AbstractC6804a.f17036cj.mo13066a().booleanValue() && LiveAnchorAutoOpenGuestLinkmicSwitchSetting.INSTANCE.getValue()) {
                C5703b.m12479c("auto");
                this.f12830d.mo10568a(LinkApi.EnumC7287e.AUTO_START);
            } else if (AbstractC6804a.f17036cj.mo13066a().booleanValue()) {
                C6806c.m14603a((C6800c) AbstractC6804a.f17036cj, (Object) false);
            }
        }
    }

    /* renamed from: c */
    private void m11087c(int i) {
        String str;
        if (isViewValid()) {
            C5702a.m12449a("SwitchMode", "CurrentMode:" + this.f12833g + "; TargetMode:" + i + ", LinkEntranceExperiment = " + LinkEntranceExperiment.INSTANCE.getValue());
            if (!C4394ah.m10505a(this.f12833g, i)) {
                this.f12833g |= i;
                C4384b.C4385a.m10496a().mo10149a(this.f12833g);
                if (i == 2) {
                    m11086a("normal", this.f12831e);
                    if (this.f12831e) {
                        if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f12835i instanceof C4870b)) {
                            this.f12835i.mo10599a(0, 16);
                        } else {
                            LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
                            if (!(linkCrossRoomWidget == null || linkCrossRoomWidget.f12648l == null)) {
                                C4905ac.m11131a(this.f12828b.f12648l.f13064a, new RunnableC4925o(this), C4905ac.EnumC4907b.PK);
                            }
                            C4905ac.m11133b(((C4870b) this.f12835i).f12728c.f12804c, new RunnableC4926p(this), C4905ac.EnumC4907b.MULTIGUEST);
                            C4905ac.m11132a(C4905ac.EnumC4906a.NOTCOHOST);
                        }
                        MultiGuestAsAnchorWidget multiGuestAsAnchorWidget = (MultiGuestAsAnchorWidget) this.f12832f.mo10142a(0);
                        this.f12827a = multiGuestAsAnchorWidget;
                        if (this.f12844r) {
                            multiGuestAsAnchorWidget.mo11190d();
                        }
                        this.f12844r = false;
                    } else {
                        this.f12841o = (MultiGuestAsGuestWidget) this.f12832f.mo10142a(1);
                        this.f12835i.mo10599a(0, 16);
                        C5702a.m12449a("SwitchMode", "TargetMode:" + i + ", action:loadMultiGuestWidget");
                    }
                    this.dataChannel.mo28315b(C5689h.class, (Object) 2);
                } else if (i == 4) {
                    m11086a("pk", this.f12831e);
                    if (!(this.f12848v.mo11439a() instanceof C4598a)) {
                        this.f12830d.mo10564a();
                    }
                    this.f12845s = SystemClock.elapsedRealtime();
                    if (C4384b.C4385a.m10496a().f11970r > 0) {
                        C4384b.C4385a.m10496a().f11919I = this.f12845s;
                    }
                    this.f12828b = (LinkCrossRoomWidget) this.f12832f.mo10142a(2);
                    C5702a.m12449a("SwitchMode", "TargetMode:" + i + ", action:loadCoHostWidget");
                    if (this.f12831e) {
                        this.f12835i.mo10599a(0, 1);
                    } else {
                        this.f12835i.mo10599a(8, 16);
                    }
                    this.dataChannel.mo28315b(C5689h.class, (Object) 4);
                    if (!this.f12831e && (str = this.f12846t) != null) {
                        mo10197a(str);
                        this.f12846t = null;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m11088d(int i) {
        C3854a.m9453a(4, "LinkControlWidget", "unLoadWidget, mode = ".concat(String.valueOf(i)));
        C5702a.m12449a("unLoadWidget", "mode:".concat(String.valueOf(i)));
        if (C4394ah.m10505a(this.f12833g, i)) {
            this.f12833g = C4394ah.m10506b(this.f12833g, i);
            C4384b.C4385a.m10496a().mo10149a(this.f12833g);
            C3854a.m9453a(4, "LinkControlWidget", "unLoadWidget, after remove mode, mCurrentMode = ".concat(String.valueOf(i)));
            if (i == 2) {
                C5741z.m12606a("other");
                C5741z.m12608b("connection_over");
                this.f12832f.mo10143a(this.f12827a);
                this.f12832f.mo10143a(this.f12841o);
                this.f12827a = null;
                this.f12841o = null;
                this.f12848v.mo11441a(C5647a.EnumC5648a.MULTIGUEST);
            } else if (i == 4) {
                this.f12832f.mo10143a(this.f12828b);
                this.f12830d.mo10571d();
                this.f12828b = null;
                this.f12848v.mo11441a(C5647a.EnumC5648a.COHOST);
            }
            if (this.f12833g == 0) {
                if (!this.f12831e) {
                    this.f12835i.mo10599a(8, 16);
                    this.f12846t = null;
                    C5741z.m12606a("other");
                    if (C5586a.m12138a()) {
                        C5586a.m12141b("others", null);
                        C5586a.m12131a("others", EnumC4422k.NORMAL);
                    }
                } else if (!this.f12836j) {
                    if (!LinkEntranceExperiment.INSTANCE.getValue() || !(this.f12835i instanceof C4870b)) {
                        this.f12835i.mo10599a(0, 17);
                    } else {
                        LinkCrossRoomWidget linkCrossRoomWidget = this.f12828b;
                        if (!(linkCrossRoomWidget == null || linkCrossRoomWidget.f12648l == null)) {
                            C4905ac.m11131a(this.f12828b.f12648l.f13064a, new RunnableC4927q(this), C4905ac.EnumC4907b.PK);
                        }
                        C4905ac.m11133b(((C4870b) this.f12835i).f12728c.f12804c, new RunnableC4928r(this), C4905ac.EnumC4907b.MULTIGUEST);
                        C4905ac.m11132a(C4905ac.EnumC4906a.NOTCOHOST);
                    }
                }
                this.dataChannel.mo28315b(C5689h.class, (Object) 0);
                m11092v();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo10634a(Map map) {
        mo10638l();
        C89219l.m154721d(this, "");
        C89219l.m154721d(map, "");
        C4645c cVar = new C4645c(this);
        C4588x.EnumC4589a aVar = C4588x.EnumC4589a.SURVEY_FRAGMENT;
        C89219l.m154721d(map, "");
        AbstractC4475e.C4478c cVar2 = new AbstractC4475e.C4478c((byte) 0);
        C89219l.m154721d(map, "");
        cVar2.f12061a = map;
        this.f12834h = cVar.mo10394b(aVar, cVar2);
        AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
        if (iVar != null) {
            this.f12834h.show(iVar, "LinkDialog");
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10583a(LinkApi.EnumC7287e eVar, Throwable th) {
        if (eVar == LinkApi.EnumC7287e.USER_CLICK) {
            C11264f.m19958a(this.context, th, (int) R.string.goq);
        }
    }

    /* renamed from: a */
    private static void m11086a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        String str2 = "0";
        hashMap.put("stream_mix_on_client", str2);
        if (z) {
            str2 = "1";
        }
        hashMap.put("is_anchor", str2);
        LivePerformanceManager.getInstance().onModuleStart("link_mic", hashMap);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.p286a.p289c.C4840b.AbstractC4842a
    /* renamed from: a */
    public final void mo10581a(int i, PrivacyCert privacyCert) {
        if (isViewValid() && !C4384b.C4385a.m10496a().f11955c) {
            C4384b.C4385a.m10496a().f11955c = true;
            if (i == 1 && C4384b.C4385a.m10496a().f11958f != 0) {
                if (C4502a.m10587c()) {
                    if (this.dataChannel != null) {
                        this.dataChannel.mo28320c(C4449s.class, "");
                    }
                    C4384b.C4385a.m10496a().f11966n = true;
                }
                mo10638l();
                mo10635a(privacyCert);
            } else if (!C4502a.m10587c()) {
                C11226ao.m19882a(C3966y.m9669e(), mo10579a(i));
                if (this.f12848v.mo11439a() instanceof C4598a) {
                    ((C4598a) this.f12848v.mo11439a()).mo10346c();
                }
            } else {
                C4384b.C4385a.m10496a().f11964l = true;
                if ((this.f12848v.mo11439a() instanceof C4598a) && ((C4598a) this.f12848v.mo11439a()).mo10346c()) {
                    this.dataChannel.mo28320c(C4448r.class, "");
                }
            }
        }
    }
}
