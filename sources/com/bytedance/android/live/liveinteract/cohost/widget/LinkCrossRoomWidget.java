package com.bytedance.android.live.liveinteract.cohost.widget;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p220b.C3922b;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.C4382a;
import com.bytedance.android.live.liveinteract.api.C4436g;
import com.bytedance.android.live.liveinteract.api.C4446p;
import com.bytedance.android.live.liveinteract.api.C4448r;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4411b;
import com.bytedance.android.live.liveinteract.api.p261b.C4413d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4493d;
import com.bytedance.android.live.liveinteract.cohost.p263a.p265b.C4497h;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4640b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.linkroom.widget.C4905ac;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4952c;
import com.bytedance.android.live.liveinteract.match.p295b.p299d.C4961a;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.match.p311ui.p314c.C5027b;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5688g;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5700c;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.common.view.C5752a;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.android.live.p379n.AbstractC5790v;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.linkmic.HostLinkMicBattleHealthBarStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9042bh;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public class LinkCrossRoomWidget extends BaseLinkWidget implements C4566e.AbstractC4569a, C5695a.AbstractC5696a, AbstractC33974au {

    /* renamed from: a */
    public static int f12633a;

    /* renamed from: b */
    public static int f12634b;

    /* renamed from: c */
    public static int f12635c;

    /* renamed from: d */
    public static int f12636d;

    /* renamed from: A */
    private boolean f12637A;

    /* renamed from: B */
    private boolean f12638B = C4502a.m10583a();

    /* renamed from: C */
    private boolean f12639C;

    /* renamed from: D */
    private boolean f12640D;

    /* renamed from: e */
    public boolean f12641e;

    /* renamed from: f */
    Room f12642f;

    /* renamed from: g */
    public C4566e f12643g;

    /* renamed from: h */
    C4384b f12644h;

    /* renamed from: i */
    public C5695a f12645i;

    /* renamed from: j */
    boolean f12646j;

    /* renamed from: k */
    LinkBattleWidget f12647k;

    /* renamed from: l */
    public C5027b f12648l = new C5027b();

    /* renamed from: m */
    private int f12649m;

    /* renamed from: n */
    private FrameLayout f12650n;

    /* renamed from: o */
    private View f12651o;

    /* renamed from: p */
    private HSImageView f12652p;

    /* renamed from: q */
    private LiveLoadingView f12653q;

    /* renamed from: r */
    private LinkCrossTitleLayout f12654r;

    /* renamed from: s */
    private Guideline f12655s;

    /* renamed from: t */
    private C5752a f12656t;

    /* renamed from: u */
    private C5753b<LinearLayout> f12657u;

    /* renamed from: v */
    private HSImageView f12658v;

    /* renamed from: w */
    private View f12659w;

    /* renamed from: x */
    private C4640b f12660x;

    /* renamed from: y */
    private AbstractC5790v f12661y;

    /* renamed from: z */
    private C5698a f12662z;

    static {
        Covode.recordClassIndex(5393);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.be7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: a */
    public final LinkBattleWidget mo10327a() {
        return this.f12647k;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: e */
    public final void mo10335e() {
        AbstractC5790v vVar = this.f12661y;
        if (vVar != null) {
            vVar.mo11564e();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: c */
    public final void mo10333c() {
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.go_);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        if (this.f12641e) {
            this.f12643g.mo10304a(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        if (this.f12641e) {
            this.f12643g.mo10304a(true);
        }
    }

    /* renamed from: h */
    private void m10933h() {
        if (this.f12647k == null) {
            enableSubWidgetManager();
            this.f12647k = new LinkBattleWidget(getView());
            this.subWidgetManager.load(this.f12647k);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: b */
    public final void mo10331b() {
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gos);
        this.f12643g.mo10305b(207);
    }

    /* renamed from: f */
    public final void mo10548f() {
        String a = C3966y.m9657a((int) R.string.dwp);
        if (C4947a.f12909a.mo10672a() == EnumC4949c.START) {
            a = C3966y.m9657a((int) R.string.dx0);
        }
        C4640b bVar = this.f12660x;
        if (bVar != null && bVar.mo18054n()) {
            this.f12660x.dismiss();
        }
        C4640b bVar2 = new C4640b();
        this.f12660x = bVar2;
        bVar2.f12296a = C3966y.m9657a((int) R.string.dwq);
        bVar2.f12297b = a;
        bVar2.f12298c = 1;
        bVar2.f12300e = C3966y.m9657a((int) R.string.eg2);
        bVar2.f12299d = C3966y.m9657a((int) R.string.efw);
        C4566e eVar = this.f12643g;
        C89219l.m154721d(eVar, "");
        bVar2.f12301f = eVar;
        C4384b bVar3 = this.f12644h;
        C89219l.m154721d(bVar3, "");
        bVar2.f12302g = bVar3;
        AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
        if (iVar != null) {
            this.f12660x.show(iVar, "InteractDisconnectDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: d */
    public final void mo10334d() {
        String str;
        if (!this.f12644h.f11955c) {
            this.dataChannel.mo28320c(C4493d.class, 1);
        }
        this.f12646j = true;
        this.f12654r.mo10495a();
        m10931c(false);
        if (this.f12641e) {
            LinkBattleWidget linkBattleWidget = this.f12647k;
            if (linkBattleWidget != null && linkBattleWidget.f13230v) {
                ((LinearLayout) this.f12657u.f14598b).setVisibility(0);
            } else if (this.f12647k == null) {
                ((LinearLayout) this.f12657u.f14598b).setVisibility(0);
            }
            this.f12644h.f11918H = SystemClock.elapsedRealtime();
            Room room = this.f12642f;
            C5713h.f14479a = true;
            C4384b a = C4384b.C4385a.m10496a();
            if (a.f11969q) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("anchor_type", str);
            hashMap.put("invited_room_id", String.valueOf(a.f11961i));
            hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
            String str2 = a.f11976x;
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("request_id", str2);
            }
            if (a.f11932V != null) {
                hashMap.put("enter_from", a.f11932V);
            }
            if (C4502a.m10583a()) {
                C5737w.m12601a(hashMap, EnumC4442m.RANDOM_LINK_MIC_INVITE);
                hashMap.put("random_match_waiting_time", String.valueOf(C4502a.f12071c * 1000));
            } else {
                C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
                if (C4384b.C4385a.m10496a().f11929S != 0 && a.f11969q) {
                    hashMap.put("invite_to_success_dur", String.valueOf(System.currentTimeMillis() - C5713h.f14483e));
                }
            }
            if (C4384b.C4385a.m10496a().f11969q) {
                hashMap.put("connection_inviter_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("connection_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            } else {
                hashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("connection_inviter_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            }
            C5737w.m12600a(hashMap);
            C6501b.C6502a.m13948a("connection_success").mo12642a(C5713h.m12500a(room)).mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
            if (this.f12638B) {
                m10928a(f12633a, f12635c, 0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        boolean z;
        boolean z2;
        super.onCreate();
        C5702a.m12447a("LinkCross_Widget_onCreate");
        this.f12639C = LiveBannerExperiment.isNewBannerEnable();
        this.f12640D = HostLinkMicBattleHealthBarStyleSetting.INSTANCE.isNewStyle();
        this.f12642f = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f12641e = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f12644h = C4384b.C4385a.m10496a();
        C10095g.m18640h();
        C10095g.f24529c = "broadcast_link_period";
        C10095g.m18639g();
        EnumC5847l.INTERACTION_PK.load(this.dataChannel, this.f12648l);
        this.f12648l.mo10735a(8);
        this.f12643g = new C4566e(this.dataChannel);
        this.f12649m = C3966y.m9664c();
        if (!C3922b.m9559b() || C3922b.m9557a() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f12649m = (int) (((float) C3966y.m9662b()) * 0.5625f);
        }
        if (this.f12639C) {
            f12633a = C4961a.m11159a(this.f12640D);
            View view = getView();
            if (view != null) {
                Space space = (Space) view.findViewById(R.id.d_f);
                boolean z3 = this.f12640D;
                if (space != null) {
                    ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
                    if (z3) {
                        aVar.f2270h = R.id.ade;
                        aVar.f2272j = -1;
                    } else {
                        aVar.f2272j = R.id.ade;
                        aVar.f2270h = -1;
                    }
                    space.setLayoutParams(aVar);
                }
            }
        } else {
            double d = (double) ((((float) this.f12649m) * 1.0f) / 360.0f);
            Double.isNaN(d);
            f12633a = (int) (d * 138.0d);
        }
        f12636d = 0;
        int i = this.f12649m / 2;
        f12634b = i;
        f12635c = (int) (((((float) i) * 1.0f) / 9.0f) * 13.0f);
        if (!C3922b.m9559b() || C3922b.m9557a() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f12649m = C3966y.m9664c();
        if (z2) {
            this.f12649m = (int) (((float) C3966y.m9662b()) * 0.5625f);
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        if (z2) {
            layoutParams2.width = this.f12649m;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
            } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).addRule(13, -1);
            }
        } else {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        getView().setLayoutParams(layoutParams2);
        this.f12650n.setVisibility(0);
        this.f12651o = findViewById(R.id.ade);
        this.f12653q = (LiveLoadingView) findViewById(R.id.cg3);
        this.f12654r = (LinkCrossTitleLayout) findViewById(R.id.c4p);
        this.f12655s = (Guideline) findViewById(R.id.bb8);
        this.f12659w = findViewById(R.id.c4a);
        HSImageView hSImageView = (HSImageView) findViewById(R.id.mh);
        this.f12658v = hSImageView;
        hSImageView.setVisibility(8);
        HSImageView hSImageView2 = (HSImageView) findViewById(R.id.cbc);
        this.f12652p = hSImageView2;
        C3941k.m9607a(hSImageView2, "tiktok_live_interaction_resource", "ttlive_match_winning_streak_tip_bg.png");
        if (this.f12642f.background != null) {
            C3951p.m9628a(this.f12658v, this.f12642f.background, EnumC7584i.TOP);
        }
        this.f12656t = new C5752a(this.dataChannel, getView());
        if (this.dataChannel != null) {
            C5753b.C5754a a = this.f12656t.mo11500a(R.id.c5j);
            a.f14601b = new C4822k(this);
            this.f12657u = a.mo11504a(C4497h.class, new C4823l(this)).mo11505a();
            C5753b.C5754a a2 = this.f12656t.mo11500a(R.id.bvz);
            a2.f14601b = new C4824m(this);
            a2.mo11504a(C4497h.class, C4825n.f12676a).mo11505a();
            if (this.f12639C && this.f12640D) {
                C5753b.C5754a a3 = this.f12656t.mo11500a(R.id.c4p);
                C4961a aVar2 = C4961a.f12937a;
                aVar2.getClass();
                a3.mo11504a(C9042bh.class, new C4826o(aVar2)).mo11505a();
                C5753b.C5754a a4 = this.f12656t.mo11500a(R.id.cp1);
                C4961a aVar3 = C4961a.f12937a;
                aVar3.getClass();
                a4.mo11504a(C9042bh.class, new C4827p(aVar3)).mo11505a();
                C5753b.C5754a a5 = this.f12656t.mo11500a(R.id.c4n);
                C4961a aVar4 = C4961a.f12937a;
                aVar4.getClass();
                a5.mo11504a(C9042bh.class, new C4814c(aVar4)).mo11505a();
            }
        }
        View findViewById = findViewById(R.id.c4p);
        ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
        layoutParams3.width = C3966y.m9664c() - (C3966y.m9653a(87.0f) * 2);
        findViewById.setLayoutParams(layoutParams3);
        this.f12643g.mo10297a((C4566e.AbstractC4569a) this);
        if (this.f12641e) {
            if (this.f12644h.f11955c && !this.f12638B) {
                m10928a(f12633a, f12635c, 0);
            }
            this.f12643g.mo10314c();
        } else {
            this.f12645i = new C5695a(this);
            C5713h.f14482d = false;
            C5713h.f14481c = SystemClock.elapsedRealtime();
        }
        this.dataChannel.mo28311a(C4446p.class, (Object) true).mo28310a(C4952c.class, (AbstractC89172b) new C4812a(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C11625a.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C4813b(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4413d.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C4820i(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        String str;
        String str2;
        String str3;
        MethodCollector.m26663i(6290);
        C4640b bVar = this.f12660x;
        if (bVar != null && bVar.mo18054n()) {
            this.f12660x.dismiss();
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28311a(C4446p.class, (Object) false);
        }
        C6528g gVar = new C6528g();
        if (this.f12644h.f11970r > 0 && this.f12644h.f11914D == 0) {
            gVar.mo12675a(C4384b.C4385a.m10496a().f11968p.getType());
        }
        if (this.f12647k != null) {
            this.subWidgetManager.unload(this.f12647k);
            this.f12647k = null;
        }
        boolean z = true;
        if (this.f12641e) {
            Room room = this.f12642f;
            if (C5713h.f14479a) {
                C5713h.f14479a = false;
                C4384b a = C4384b.C4385a.m10496a();
                C6528g a2 = C5713h.m12500a(room);
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.f11918H;
                long j = elapsedRealtime / 1000;
                a2.f16301d = String.valueOf(j);
                HashMap hashMap = new HashMap();
                hashMap.put("connection_type", "anchor");
                hashMap.put("invited_room_id", String.valueOf(a.f11961i));
                if (C4384b.C4385a.m10496a().f11969q) {
                    str2 = "inviter";
                } else {
                    str2 = "invitee";
                }
                hashMap.put("anchor_type", str2);
                String str4 = a.f11976x;
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put("request_id", str4);
                }
                if (a.f11932V != null) {
                    hashMap.put("enter_from", a.f11932V);
                }
                C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
                if (C4384b.C4385a.m10496a().f11927Q) {
                    str3 = "positive_over";
                } else {
                    str3 = "negative_over";
                }
                hashMap.put("over_type", str3);
                if (C4384b.C4385a.m10496a().f11928R) {
                    hashMap.put("is_live_end", "1");
                }
                C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
                if (j <= 10) {
                    z = false;
                }
                hashMap.put("is_effective_connection", String.valueOf(z));
                hashMap.put("connection_duration", String.valueOf(elapsedRealtime));
                C5737w.m12600a(hashMap);
                C6501b.C6502a.m13948a("connection_over").mo12642a(a2).mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
            }
        } else if (!C5713h.f14482d) {
            C5713h.f14482d = true;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - C5713h.f14481c;
            C4384b a3 = C4384b.C4385a.m10496a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("connection_type", "anchor");
            hashMap2.put("channel_id", String.valueOf(a3.f11957e));
            hashMap2.put("watch_connection_duration", String.valueOf(elapsedRealtime2 / 1000));
            hashMap2.put("right_user_id", String.valueOf(a3.f11958f));
            if (a3.f11932V != null) {
                hashMap2.put("enter_from", a3.f11932V);
            }
            C5713h.m12517a("connection_watch_duration", hashMap2);
        }
        boolean z2 = this.f12644h.f11963k;
        boolean z3 = this.f12644h.f11964l;
        try {
            this.f12643g.mo8577b();
            this.f12656t.mo11501a();
            this.f12644h.mo10156e("LinkCrossWidget_OnDestroy");
        } catch (Throwable unused) {
            C3854a.m9453a(6, "DATA_CENTER", "should crash at onDestroy()");
        }
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            C4905ac.m11131a(this.f12648l.f13064a, new RunnableC4821j(this), C4905ac.EnumC4907b.PK);
        } else {
            EnumC5847l.INTERACTION_PK.unload(this.dataChannel);
        }
        this.f12650n.removeAllViews();
        this.f12650n.setBackgroundColor(0);
        this.f12650n.setVisibility(8);
        C10095g.m18640h();
        if (C10095g.f24530d) {
            str = "broadcast_period";
        } else {
            str = "watch_period";
        }
        C10095g.f24529c = str;
        C10095g.m18639g();
        super.onDestroy();
        C5702a.m12447a("LinkCross_Widget_onDestroy");
        if (this.f12641e) {
            if (z3) {
                this.dataChannel.mo28320c(C4448r.class, "");
                MethodCollector.m26664o(6290);
                return;
            } else if (C4502a.m10585b()) {
                this.f12644h.mo10152b(EnumC4440k.MATCH);
                MethodCollector.m26664o(6290);
                return;
            } else if (z2) {
                C4502a.m10591g();
                C4502a.m10581a(this.dataChannel, C4502a.EnumC4508e.TYPE_AUTO_START_WHEN_END);
                MethodCollector.m26664o(6290);
                return;
            } else if (C4502a.m10583a()) {
                C4502a.m10591g();
            }
        }
        MethodCollector.m26664o(6290);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4435f
    /* renamed from: a */
    public final void mo10216a(AbstractC5790v vVar) {
        this.f12661y = vVar;
    }

    /* renamed from: d */
    private void m10932d(boolean z) {
        int i;
        LiveLoadingView liveLoadingView = this.f12653q;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        liveLoadingView.setVisibility(i);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: b */
    public final boolean mo10547b(int i) {
        if (this.f12641e || i != 2) {
            return false;
        }
        return true;
    }

    public LinkCrossRoomWidget(FrameLayout frameLayout) {
        this.f12650n = frameLayout;
    }

    /* renamed from: c */
    private void m10931c(boolean z) {
        if (this.f12641e) {
            if (z) {
                this.f12659w.setVisibility(0);
                m10932d(true);
                return;
            }
            this.f12659w.setVisibility(8);
            m10932d(false);
        }
    }

    /* renamed from: a */
    public final void mo10545a(PrivacyCert privacyCert) {
        C4566e eVar = this.f12643g;
        if (eVar != null) {
            eVar.mo10296a(privacyCert);
            if (!this.f12638B) {
                m10928a(f12633a, f12635c, 0);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: a */
    public final void mo10328a(int i) {
        if (C4502a.m10588d()) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.dxt);
        } else {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gln);
        }
        this.f12643g.mo10305b(i);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: b */
    public final void mo10332b(boolean z) {
        C3854a.m9453a(4, "LinkCrossRoomLogs", "onPkPermissionResult, result = ".concat(String.valueOf(z)));
        this.f12644h.f11931U = z;
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "enable_battle", String.valueOf(z ? 1 : 0));
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C5009a.f13030a);
        int i = 0;
        C5009a.m11205a(C5009a.f13036g, "check_permission_complete", jSONObject, false, 12);
        if (!LinkEntranceExperiment.INSTANCE.getValue()) {
            C5027b bVar = this.f12648l;
            if (!z) {
                i = 8;
            }
            bVar.mo10735a(i);
            if (!z) {
                return;
            }
        } else if (z) {
            this.dataChannel.mo28320c(C5688g.class, new RunnableC4815d(this));
        } else {
            this.dataChannel.mo28320c(C5688g.class, RunnableC4816e.f12667a);
            return;
        }
        m10933h();
        this.f12648l.f13067d = this.f12647k;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a.AbstractC5696a
    /* renamed from: a */
    public final void mo10544a(C5698a aVar) {
        C5700c cVar;
        if (!this.f12641e && isViewValid() && aVar.f14432e != null && !aVar.f14432e.isEmpty() && (cVar = aVar.f14432e.get(0)) != null) {
            this.f12658v.setVisibility(0);
            if (this.f12644h.f11957e <= 0) {
                try {
                    this.f12644h.f11957e = Long.parseLong(aVar.f14431d);
                } catch (Exception e) {
                    C3854a.m9453a(4, "LinkCrossRoomLogs", "Parse ChannelId, Exception = " + e.toString());
                }
            }
            this.f12662z = aVar;
            C5736v.m12588a(4, C4139e.C4140a.f11575b.mo46674b(aVar));
            this.f12637A = true;
            if (this.f12644h.f11958f <= 0) {
                Iterator<C5700c> it = aVar.f14432e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.equals(it.next().mo11466a(), C4384b.C4385a.m10496a().f11922L)) {
                            this.f12644h.f11958f = cVar.f14438b;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.f12643g.mo10314c();
            float f = (((float) this.f12649m) * 1.0f) / ((float) aVar.f14433f.f14436c);
            if (this.f12639C) {
                double d = (double) aVar.f14433f.f14435b;
                double d2 = cVar.f14443g;
                Double.isNaN(d);
                double d3 = d * d2;
                double d4 = (double) f;
                Double.isNaN(d4);
                int a = C4961a.m11159a(this.f12640D);
                f12633a = a;
                f12636d = a - ((int) (d3 * d4));
            } else {
                double d5 = (double) aVar.f14433f.f14435b;
                double d6 = cVar.f14443g;
                Double.isNaN(d5);
                double d7 = d5 * d6;
                double d8 = (double) f;
                Double.isNaN(d8);
                f12633a = (int) (d7 * d8);
                f12636d = 0;
            }
            double d9 = cVar.f14441e;
            double d10 = (double) aVar.f14433f.f14435b;
            Double.isNaN(d10);
            double d11 = d9 * d10;
            double d12 = (double) f;
            Double.isNaN(d12);
            int i = (int) (d11 * d12);
            f12635c = i;
            this.dataChannel.mo28320c(C4382a.class, Integer.valueOf(f12633a + i));
            m10928a(f12633a, f12635c, f12636d);
            m10933h();
            this.f12644h.f11942ae = cVar.f14451o;
            if (C4947a.m11149a()) {
                this.f12647k.mo10826c();
            } else {
                this.f12654r.mo10495a();
            }
            m10930b("SEI Debug Stream Height", ",marginTop:" + f12633a + ",height:" + f12635c + ",region.getHeight()=" + cVar.f14441e + ",region.getWidth()=" + cVar.f14440d + ",region.getY()=" + cVar.f14443g);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: a */
    public final void mo10330a(boolean z) {
        String str;
        m10932d(!z);
        StringBuilder sb = new StringBuilder("state:");
        if (z) {
            str = "foreground";
        } else {
            str = "background";
        }
        m10930b("LinkCross_Guest_State_Changed", sb.append(str).toString());
    }

    /* renamed from: b */
    private void m10930b(String str, String str2) {
        C5702a.m12451a(str, this.f12641e, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4566e.AbstractC4569a
    /* renamed from: a */
    public final void mo10329a(String str, String str2) {
        m10930b(str, str2);
    }

    /* renamed from: b */
    private void m10929b(int i, int i2, int i3) {
        C7398o oVar = new C7398o(0);
        oVar.f18329b = Integer.valueOf(i + i2);
        oVar.f18330c = C4947a.m11149a();
        oVar.f18331d = i3;
        this.dataChannel.mo28320c(C4450t.class, oVar);
        if (!this.f12646j) {
            m10931c(true);
        }
    }

    /* renamed from: a */
    private void m10928a(int i, int i2, int i3) {
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) this.f12651o.getLayoutParams();
        aVar.height = i2;
        this.f12651o.setLayoutParams(aVar);
        this.dataChannel.mo28320c(C4436g.class, new C4411b(true, new StringBuilder().append(i2).append(i).toString()));
        this.f12655s.setGuidelineBegin(i);
        if (this.f12651o.getVisibility() != 0) {
            this.f12651o.setVisibility(0);
            if (this.f12642f.getLinkMicInfo() == null) {
                C6528g gVar = new C6528g();
                if (!this.f12641e) {
                    C6501b.C6502a.m13948a("connection_transform").mo12658d("live_detail").mo12654b("live").mo12656c("other").mo12642a(gVar).mo12641a(C4384b.C4385a.m10496a().mo10155e()).mo12643a(this.dataChannel).mo12655b();
                }
            }
        }
        m10929b(i, i2, i3);
    }
}
