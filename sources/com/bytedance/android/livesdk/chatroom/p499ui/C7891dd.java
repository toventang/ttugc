package com.bytedance.android.livesdk.chatroom.p499ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4339o;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.AbstractC4434e;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.C4382a;
import com.bytedance.android.live.liveinteract.api.C4403aq;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.p209c.AbstractC3807b;
import com.bytedance.android.live.p249h.AbstractC4349b;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p378m.AbstractC5760a;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p379n.AbstractC5790v;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.share.AbstractC6109c;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.C6912bl;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.backroom.p482a.C7333a;
import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.chatroom.p488c.C7378ak;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.chatroom.p488c.C7385d;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.chatroom.p492g.EnumC7584i;
import com.bytedance.android.livesdk.chatroom.viewmodule.BackRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.drawerfeed.C8422f;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.hashtag.MessageStationWidget;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.C9169c;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistPermissionSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.lynx.lynxcard.AbstractC9368b;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9018al;
import com.bytedance.android.livesdk.p561j.C9027au;
import com.bytedance.android.livesdk.p561j.C9030ax;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9039be;
import com.bytedance.android.livesdk.p561j.C9046bl;
import com.bytedance.android.livesdk.p561j.C9063cb;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.p561j.C9072ck;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9104dp;
import com.bytedance.android.livesdk.p561j.C9111dw;
import com.bytedance.android.livesdk.p561j.C9113dy;
import com.bytedance.android.livesdk.p561j.C9118ec;
import com.bytedance.android.livesdk.p561j.C9129k;
import com.bytedance.android.livesdk.p561j.C9130l;
import com.bytedance.android.livesdk.p561j.C9142x;
import com.bytedance.android.livesdk.p561j.C9143y;
import com.bytedance.android.livesdk.p571m.C9460e;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdk.widget.LiveDebugInfoView;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dd */
public final class C7891dd extends AbstractC7703a implements AbstractC5790v {

    /* renamed from: H */
    BaseLinkControlWidget f19628H;

    /* renamed from: I */
    HSImageView f19629I;

    /* renamed from: J */
    public boolean f19630J;

    /* renamed from: K */
    public LiveWidget f19631K = null;

    /* renamed from: L */
    private FullVideoButtonWidget f19632L;

    /* renamed from: M */
    private SwitchDefinitionTipsWidget f19633M;

    /* renamed from: N */
    private boolean f19634N;

    /* renamed from: O */
    private LiveDebugInfoView f19635O;

    /* renamed from: P */
    private View f19636P;

    /* renamed from: Q */
    private final C88411a f19637Q = new C88411a();

    /* renamed from: R */
    private LiveRecyclableWidget f19638R;

    /* renamed from: S */
    private LiveRecyclableWidget f19639S;

    /* renamed from: T */
    private LiveWidget f19640T;

    /* renamed from: U */
    private LiveRecyclableWidget f19641U;

    /* renamed from: V */
    private LiveRecyclableWidget f19642V;

    /* renamed from: W */
    private AbsBarrageWidget f19643W;

    /* renamed from: X */
    private LiveRecyclableWidget f19644X;

    /* renamed from: Y */
    private LiveWidget f19645Y;

    /* renamed from: Z */
    private MessageStationWidget f19646Z;

    static {
        Covode.recordClassIndex(8686);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: d */
    public final C7298b mo13954d() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: h */
    public final boolean mo13957h() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: k */
    public final void mo13960k() {
        super.mo13960k();
        m16014M();
    }

    /* renamed from: E */
    public final void mo14186E() {
        View view = this.f19636P;
        if (view != null) {
            view.findViewById(R.id.ug).setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5790v
    /* renamed from: e */
    public final void mo14054e() {
        if (this.f19146i != null) {
            this.f19146i.getStreamType();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onDestroy() {
        this.f19637Q.mo142944a();
        super.onDestroy();
    }

    /* renamed from: J */
    private int m16011J() {
        C7380am amVar = (C7380am) this.f19145h.mo28318b(C5766ab.class);
        if (amVar == null) {
            return 0;
        }
        return amVar.f18292a;
    }

    /* renamed from: M */
    private void m16014M() {
        ((FrameLayout.LayoutParams) this.f19629I.getLayoutParams()).topMargin = 0;
        C13628n.m24510a(this.f19629I, 8);
    }

    /* renamed from: D */
    public final void mo14185D() {
        View view;
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 && (view = this.f19636P) != null) {
            view.findViewById(R.id.ug).setVisibility(8);
        }
    }

    /* renamed from: F */
    public final void mo14187F() {
        FrameLayout frameLayout = (FrameLayout) this.f19139b.findViewById(R.id.bp4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        layoutParams.leftMargin = 0;
        frameLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: I */
    private View m16010I() {
        FullVideoButtonWidget fullVideoButtonWidget = this.f19632L;
        if (fullVideoButtonWidget == null || !fullVideoButtonWidget.isViewValid || getView() != null) {
            return getView().findViewById(R.id.b9i);
        }
        return this.f19632L.getView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ C89391z mo14189H() {
        C7380am amVar = (C7380am) this.f19145h.mo28318b(C5766ab.class);
        if (amVar != null) {
            int i = amVar.f18292a;
            if (i <= 0) {
                C3854a.m9453a(6, "AbsInteractionFragment", "showOrLoadDefinitionTipsWidget. videoBottom <= 0 and not show!");
            } else {
                if (this.f19633M == null) {
                    SwitchDefinitionTipsWidget switchDefinitionTipsWidget = (SwitchDefinitionTipsWidget) this.f19150m.load(R.id.edl, SwitchDefinitionTipsWidget.class);
                    this.f19633M = switchDefinitionTipsWidget;
                    switchDefinitionTipsWidget.mo14390a(i);
                }
                this.f19633M.show();
            }
        }
        return C89391z.f203057a;
    }

    /* renamed from: K */
    private void m16012K() {
        int J;
        if (m16010I() != null) {
            ((ViewGroup.MarginLayoutParams) m16010I().getLayoutParams()).topMargin = m16011J() - ((int) C13628n.m24520b(getContext(), 210.0f));
            if (this.f19145h != null && (J = m16011J() - ((int) C13628n.m24520b(getContext(), 110.0f))) > 0 && J < (C3966y.m9662b() - C3966y.m9666d()) / 2) {
                this.f19145h.mo28320c(C9142x.class, Integer.valueOf(J));
            }
        }
    }

    /* renamed from: L */
    private void m16013L() {
        if (!this.f19146i.isOfficial() && this.f19147j.getTranslationX() == 0.0f && C11115u.m19743a().mo17915b().mo13165e() && m16016O()) {
            Bundle bundle = new Bundle();
            bundle.putString("pull_type", "draw");
            bundle.putLong("room_id", ((Long) this.f19145h.mo28318b(C9096dh.class)).longValue());
            if (LiveDrawerVersion.INSTANCE.getValue()) {
                C8422f.m16637a(getActivity(), true, bundle, "drawer");
            } else {
                C8422f.m16638a((Activity) getActivity(), true);
            }
        }
    }

    /* renamed from: N */
    private void m16015N() {
        if (!C7349a.m15251a() && this.f19159v != null && this.f19159v.f28233c.f28326ag && this.f19145h != null) {
            this.f19145h.mo28315b(C9130l.class, Long.valueOf(this.f19159v.f28233c.f28329aj));
        }
        if (this.f19159v != null && this.f19145h != null) {
            this.f19145h.mo28311a(C9072ck.class, Boolean.valueOf(this.f19159v.f28233c.f28345az));
        }
    }

    /* renamed from: O */
    private boolean m16016O() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f19145h == null) {
            return false;
        }
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!C7589k.m15601a(this.f19145h) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            if (!C7589k.m15603b(this.f19145h) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!C7589k.m15604c(this.f19145h) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                return true;
            }
            return false;
        } else if (!((Boolean) this.f19145h.mo28318b(C9072ck.class)).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: G */
    public final void mo14188G() {
        View findViewById;
        if (this.f19146i != null && this.f19636P != null && C11725f.f28051c.booleanValue() && (findViewById = this.f19636P.findViewById(R.id.ahs)) != null) {
            findViewById.setVisibility(8);
            Boolean bool = C11725f.f28049a;
            if (bool != null && bool.booleanValue()) {
                findViewById.setVisibility(0);
                if (this.f19635O == null) {
                    this.f19635O = new LiveDebugInfoView();
                }
                this.f19635O.setArgs(new Object[]{this.f19146i});
                this.f19150m.load(R.id.ahs, this.f19635O);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: g */
    public final void mo13956g() {
        C7380am amVar = (C7380am) this.f19145h.mo28318b(C5766ab.class);
        if ((amVar == null || amVar.mo13610a()) && m16011J() > 0 && isViewValid() && !((Boolean) this.f19145h.mo28318b(C9034ba.class)).booleanValue()) {
            this.f19145h.mo28320c(C9111dw.class, -1);
            this.f19145h.mo28320c(C9113dy.class, Integer.valueOf(m16011J()));
            this.f19145h.mo28320c(C9118ec.class, new C7378ak(C13628n.m24521b(getContext()) - m16011J()));
            C9039be beVar = new C9039be();
            beVar.f22140a = (C13628n.m24521b(getContext()) - m16011J()) + C3966y.m9653a(4.0f);
            this.f19145h.mo28320c(C4339o.class, Integer.valueOf(beVar.f22140a));
            C9039be beVar2 = new C9039be();
            beVar2.f22140a = C13628n.m24521b(getContext()) - m16011J();
            this.f19145h.mo28320c(C9018al.class, beVar2);
            m16012K();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: j */
    public final void mo13959j() {
        super.mo13959j();
        this.f19150m.load(R.id.a7a, new CloseWidget());
        m16015N();
        if (BackRoomWidget.C7969a.m16095a(getActivity())) {
            this.f19150m.load(R.id.pw, new BackRoomWidget());
            m16018b(R.id.pw, 0);
        } else {
            m16018b(R.id.pw, 8);
        }
        this.f19150m.load(R.id.mg, ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankWidgetClass(5), C6203g.m13464a());
        this.f19150m.load(R.id.bdi, ((AbstractC4349b) C6193a.m13435a(AbstractC4349b.class)).getAudienceHashTagWidget());
        if ((LiveMtMockLandscapeSetting.INSTANCE.getValue() || (this.f19146i != null && !this.f19146i.isStar() && ((this.f19146i.isThirdParty || this.f19146i.isScreenshot) && this.f19146i.mRoomAuthStatus != null && this.f19146i.mRoomAuthStatus.isEnableLandscape()))) && this.f19145h != null) {
            this.f19145h.mo28320c(C9142x.class, Integer.valueOf((int) C13628n.m24520b(getContext(), 210.0f)));
        }
        if (this.f19145h != null && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            this.f19145h.mo28320c(C9104dp.class, true);
        }
        this.f19632L = new FullVideoButtonWidget();
        this.f19150m.load(R.id.b9i, this.f19632L);
        if (this.f19139b != null) {
            this.f19155r = this.f19150m.load(R.id.rn, LiveDrawerEntranceWidget.class);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: l */
    public final void mo13961l() {
        super.mo13961l();
        m16015N();
        this.f19638R = this.f19150m.load(((ISlotService) C6193a.m13435a(ISlotService.class)).getBarrageWidget());
        this.f19639S = this.f19150m.load(R.id.e30, ((ISlotService) C6193a.m13435a(ISlotService.class)).getFrameSlotWidget());
        if (this.f19146i != null && this.f19146i.getRoomAuthStatus() != null && C8789a.m17098a(false, true, this.f19146i.getRoomAuthStatus().isEnableGift()) == C8789a.EnumC8790a.SHOW && this.f19146i != null && this.f19146i.haveWishList && LiveWishlistPermissionSetting.INSTANCE.getValue().f21779b == 1) {
            this.f19150m.load(R.id.fj3, ((IGiftService) C6193a.m13435a(IGiftService.class)).getWishListWidget());
            this.f19145h.mo28314b(C9046bl.class, (AbstractC89172b) new C7909dl(this));
        }
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 1) {
            this.f19153p = new EndWidget();
            this.f19150m.load(R.id.avr, this.f19153p);
        }
        if (this.f19146i != null && this.f19146i.getId() != 0) {
            C6779a.m14563a().mo13053a(new C7333a(this.f19146i, (byte) 0));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: m */
    public final void mo13962m() {
        super.mo13962m();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && this.f19146i != null && this.f19146i.mRoomAuthStatus != null && !this.f19146i.mRoomAuthStatus.isEnableLandscape()) {
            m16010I().setVisibility(8);
        }
        this.f19640T = ((AbstractC3807b) C6193a.m13435a(AbstractC3807b.class)).getDecorationWidget();
        this.f19150m.load(R.id.cac, this.f19640T);
        if (this.f19144g == EnumC11728i.VIDEO && C5762c.m12632a(this.f19145h)) {
            this.f19641U = this.f19150m.load(R.id.dcx, ((AbstractC5760a) C6193a.m13435a(AbstractC5760a.class)).getQAWidget());
        }
        this.f19642V = this.f19150m.load(R.id.b8k, ((ISlotService) C6193a.m13435a(ISlotService.class)).getFrameL2SlotWidget());
        if (this.f19146i != null && !this.f19146i.isOfficial() && !C6912bl.f17297a) {
            this.f19643W = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getBarrageWidget();
            this.f19150m.load(R.id.qp, this.f19643W);
        }
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (!(aVar == null || this.f19146i == null || this.f19146i.officialChannelInfo == null || this.f19146i.getId() != this.f19146i.officialChannelInfo.f23143h)) {
            this.f19644X = this.f19150m.load(R.id.q7, aVar.getMicRoomBackupTipsWidget());
        }
        if (this.f19144g == EnumC11728i.VIDEO || this.f19144g == EnumC11728i.AUDIO) {
            final AbstractC4434e linkWidgetFactory = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getLinkWidgetFactory();
            this.f19628H = linkWidgetFactory.mo10210a(new BaseLinkControlWidget.AbstractC4381a() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78942 */

                static {
                    Covode.recordClassIndex(8689);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.AbstractC4381a
                /* renamed from: a */
                public final void mo10143a(LiveWidget liveWidget) {
                    C7891dd.this.f19150m.unload(liveWidget);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.AbstractC4381a
                /* renamed from: a */
                public final LiveWidget mo10142a(int i) {
                    if (i == 0) {
                        C7891dd.this.f19631K = linkWidgetFactory.mo10212a();
                        C7891dd.this.f19150m.load(R.id.ctl, (Widget) C7891dd.this.f19631K, false);
                    } else if (i == 1) {
                        C7891dd ddVar = C7891dd.this;
                        ddVar.f19631K = linkWidgetFactory.mo10215b((FrameLayout) ddVar.f19139b.findViewById(R.id.bp4));
                        C7891dd.this.f19150m.load(R.id.ctl, (Widget) C7891dd.this.f19631K, false);
                    } else if (i == 2) {
                        C7891dd ddVar2 = C7891dd.this;
                        ddVar2.f19631K = linkWidgetFactory.mo10211a((FrameLayout) ddVar2.f19139b.findViewById(R.id.bp4));
                        C7891dd.this.f19150m.load(R.id.d29, (Widget) C7891dd.this.f19631K, false);
                    }
                    return C7891dd.this.f19631K;
                }
            });
        }
        this.f19150m.load(R.id.bp7, this.f19628H);
        if (this.f19628H != null) {
            this.f19101A.add(0, this.f19628H);
        }
        if (!C6912bl.f17297a) {
            this.f19645Y = ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).getShareWidget();
            this.f19150m.load(this.f19645Y);
        }
        if (!((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
            this.f19150m.load(R.id.bg2, ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankWidgetClass(4), C6203g.m13464a());
        }
        this.f19646Z = (MessageStationWidget) this.f19150m.load(MessageStationWidget.class);
        mo14188G();
        this.f19150m.load(R.id.cho, ((AbstractC9368b) C6193a.m13435a(AbstractC9368b.class)).getLynxCardPreviewWidget());
        this.f19150m.load(R.id.chp, ((AbstractC9368b) C6193a.m13435a(AbstractC9368b.class)).getLynxCardWidget());
        IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
        if (iGiftService != null && iGiftService.enableRedEnvelope()) {
            this.f19150m.load(R.id.cbk, iGiftService.getRedEnvelopeWidget());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m16012K();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19145h.mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C7905dh(this));
        this.f19145h.mo28309a((AbstractC1204m) this, C4403aq.class, (AbstractC89172b) new C7906di(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo14190a(C4423l lVar) {
        if (lVar.f12026d) {
            return C89391z.f203057a;
        }
        EnumC4422k kVar = lVar.f12023a;
        boolean z = lVar.f12025c;
        final FrameLayout frameLayout = lVar.f12024b;
        if (kVar == EnumC4422k.NORMAL) {
            mo14187F();
        } else if (!z) {
            final FrameLayout frameLayout2 = (FrameLayout) this.f19139b.findViewById(R.id.bp4);
            frameLayout2.post(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.RunnableC78986 */

                static {
                    Covode.recordClassIndex(8693);
                }

                public final void run() {
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.width = frameLayout.getWidth();
                        layoutParams.height = frameLayout.getHeight();
                        layoutParams.topMargin = frameLayout.getTop();
                        layoutParams.leftMargin = frameLayout.getLeft();
                        layoutParams.gravity = 3;
                        frameLayout2.setLayoutParams(layoutParams);
                        return;
                    }
                    C7891dd.this.mo14187F();
                }
            });
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f19145h != null) {
            this.f19145h.mo28309a((AbstractC1204m) this, C9027au.class, (AbstractC89172b) new C7902de(this));
            this.f19145h.mo28309a((AbstractC1204m) this, C9129k.class, (AbstractC89172b) new C7903df(this));
        }
        this.f19637Q.mo142945a(C6779a.m14563a().mo13052a(C9460e.class).mo143289d(new C7904dg(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo14191a(C7398o oVar) {
        if (isViewValid()) {
            if (oVar.f18328a == 0) {
                this.f19629I.setBackgroundColor(Color.parseColor("#303342"));
                if (this.f19146i.background != null) {
                    C3951p.m9628a(this.f19629I, this.f19146i.background, EnumC7584i.BOTTOM);
                }
                C13628n.m24510a(this.f19629I, 0);
            } else if (oVar.f18328a == 1) {
                m16014M();
            }
        }
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo14195c(Boolean bool) {
        int i;
        if (bool.booleanValue()) {
            i = 4;
        } else {
            i = 0;
        }
        m16018b(R.id.emc, i);
        m16018b(R.id.d6u, i);
        m16018b(R.id.d_q, i);
        m16018b(R.id.ahc, i);
        m16018b(R.id.d2a, i);
        m16018b(R.id.az2, i);
        if (this.f19154q != null) {
            m16017a(this.f19154q.getView(), i);
        } else {
            m16018b(R.id.dmv, i);
        }
        this.f19145h.mo28320c(C9143y.class, Integer.valueOf(i));
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14193a(View view) {
        this.f19145h.mo28311a(C9030ax.class, Integer.valueOf(view.getHeight()));
        ((GestureDetectLayout) view).setOnSizeChangedListener(new C7910dm(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14194a(C9460e eVar) {
        if (!this.f19634N) {
            boolean z = eVar.f23001a;
            boolean a = C6229a.m13521a(getContext());
            int width = this.f19147j.getWidth();
            if (a) {
                width = -width;
            }
            if (!z) {
                if (mo13950b() != null) {
                    mo13950b().animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78997 */

                        static {
                            Covode.recordClassIndex(8694);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(C7891dd.this.f19146i.getId());
                            if (likeHelper != null) {
                                likeHelper.mo15274a(true);
                                C9169c.m17444a(C7891dd.this.f19146i, likeHelper);
                            }
                        }
                    }).start();
                }
                this.f19147j.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C79008 */

                    static {
                        Covode.recordClassIndex(8695);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        C6779a.m14563a().mo13053a(new C7385d(true));
                    }
                }).start();
                return;
            }
            if (mo13950b() != null) {
                mo13950b().animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C79019 */

                    static {
                        Covode.recordClassIndex(8696);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(C7891dd.this.f19146i.getId());
                        if (likeHelper != null) {
                            likeHelper.mo15274a(false);
                            C9169c.m17444a(C7891dd.this.f19146i, likeHelper);
                        }
                    }
                }).start();
            }
            this.f19147j.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C789310 */

                static {
                    Covode.recordClassIndex(8688);
                }

                public final void onAnimationStart(Animator animator) {
                    C6779a.m14563a().mo13053a(new C7385d(false));
                }
            }).start();
            m16013L();
        }
    }

    /* renamed from: a */
    private static void m16017a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    private void m16018b(int i, int i2) {
        if (this.f19147j != null) {
            m16017a(this.f19147j.findViewById(i), i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14192a(int i, int i2) {
        if (i != i2) {
            this.f19145h.mo28311a(C9030ax.class, Integer.valueOf(i));
            this.f19145h.mo28320c(C9063cb.class, Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        super.onViewCreated(view, bundle);
        this.f19636P = view;
        view.post(new RunnableC7907dj(this, view));
        if (this.f19630J) {
            mo14185D();
        } else {
            mo14186E();
        }
        this.f19629I = (HSImageView) view.findViewById(R.id.rr);
        if (C3958s.m9646b(this.f19145h) && (findViewById = view.findViewById(R.id.bpf)) != null) {
            findViewById.setVisibility(0);
        }
        this.f19145h.mo28309a((AbstractC1204m) this, C4382a.class, (AbstractC89172b) new C7908dk(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C2690b.m7784a(R.layout.b8x, viewGroup);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: a */
    public final boolean mo13948a(MotionEvent motionEvent, MotionEvent motionEvent2, float f) {
        boolean z;
        if (!(motionEvent == null || motionEvent2 == null)) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                boolean a = C6229a.m13521a(getContext());
                if (!a ? x <= 0.0f : x >= 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
                int width = this.f19147j.getWidth();
                if (a) {
                    width = -width;
                }
                if (z) {
                    this.f19634N = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene_id", "1001");
                    Object b = this.f19145h.mo28318b(C9065cd.class);
                    if (b != null) {
                        hashMap.put("action_type", b);
                    }
                    if (!(this.f19146i == null || this.f19146i.author() == null)) {
                        hashMap.put("anchor_id", String.valueOf(this.f19146i.author().getId()));
                        hashMap.put("room_id", String.valueOf(this.f19146i.getId()));
                    }
                    hashMap.put("clear_type", "draw");
                    C6501b.C6502a.m13948a("livesdk_screen_clear").mo12652a((Map<String, String>) hashMap).mo12654b("live").mo12658d("live_take_detail").mo12643a(this.f19145h).mo12655b();
                    C6558k.m14024a(getActivity());
                    this.f19146i.getId();
                    if (mo13950b() != null) {
                        mo13950b().animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78921 */

                            static {
                                Covode.recordClassIndex(8687);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(C7891dd.this.f19146i.getId());
                                if (likeHelper != null) {
                                    likeHelper.mo15274a(true);
                                    C9169c.m17444a(C7891dd.this.f19146i, likeHelper);
                                }
                            }
                        }).start();
                    }
                    this.f19147j.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78953 */

                        static {
                            Covode.recordClassIndex(8690);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C6779a.m14563a().mo13053a(new C7385d(true));
                        }
                    }).start();
                } else {
                    this.f19634N = false;
                    C6558k.m14024a(getActivity());
                    this.f19146i.getId();
                    if (mo13950b() != null) {
                        mo13950b().animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78964 */

                            static {
                                Covode.recordClassIndex(8691);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(C7891dd.this.f19146i.getId());
                                if (likeHelper != null) {
                                    likeHelper.mo15274a(false);
                                    C9169c.m17444a(C7891dd.this.f19146i, likeHelper);
                                }
                            }
                        }).start();
                    }
                    this.f19147j.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.p499ui.C7891dd.C78975 */

                        static {
                            Covode.recordClassIndex(8692);
                        }

                        public final void onAnimationStart(Animator animator) {
                            C6779a.m14563a().mo13053a(new C7385d(false));
                        }
                    }).start();
                    m16013L();
                }
                return true;
            }
        }
        return false;
    }
}
