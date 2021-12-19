package com.bytedance.android.live.liveinteract.match.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.C4391ae;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4413d;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p281b.C4640b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4950a;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4951b;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4952c;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4953d;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4954e;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4955f;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4956g;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4957h;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4959j;
import com.bytedance.android.live.liveinteract.match.p295b.p298c.C4960k;
import com.bytedance.android.live.liveinteract.match.p295b.p299d.C4962b;
import com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b;
import com.bytedance.android.live.liveinteract.match.p304c.C5009a;
import com.bytedance.android.live.liveinteract.match.p311ui.p312a.DialogC5019a;
import com.bytedance.android.live.liveinteract.match.p311ui.p314c.AbstractC5026a;
import com.bytedance.android.live.liveinteract.match.p311ui.view.BattleHealthBar;
import com.bytedance.android.live.liveinteract.match.p311ui.view.BattleMvpContainerLayout;
import com.bytedance.android.live.liveinteract.match.p311ui.view.MatchWinStreaksView;
import com.bytedance.android.live.liveinteract.match.p311ui.view.MatchWinningStreaksIconView;
import com.bytedance.android.live.liveinteract.match.p311ui.view.PkBattleUserInfoLayout;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5703b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5746d;
import com.bytedance.android.live.liveinteract.platform.common.view.C5752a;
import com.bytedance.android.live.liveinteract.platform.common.view.C5753b;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2939m;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveBattleContributeListLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleContributeListUrlSetting;
import com.bytedance.android.livesdk.model.message.C9614an;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9646k;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9041bg;
import com.bytedance.android.livesdk.p561j.C9042bh;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11694a;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11697d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class LinkBattleWidget extends SubWidget implements C4971b.AbstractC4981b, AbstractC5026a, AbstractC9170d, AbstractC33974au {

    /* renamed from: I */
    private static final long f13194I;

    /* renamed from: J */
    private static final long f13195J;

    /* renamed from: K */
    private static final float f13196K;

    /* renamed from: L */
    private static final float f13197L;

    /* renamed from: M */
    private static final float f13198M;

    /* renamed from: N */
    private static final float f13199N;

    /* renamed from: w */
    public static final boolean f13200w;

    /* renamed from: x */
    public static final C5072a f13201x = new C5072a((byte) 0);

    /* renamed from: B */
    private final AbstractC89244h f13202B = C89250i.m154773a((AbstractC89171a) C5111p.f13283a);

    /* renamed from: C */
    private C4640b f13203C;

    /* renamed from: D */
    private AbstractC8241e f13204D;

    /* renamed from: E */
    private C5752a f13205E;

    /* renamed from: F */
    private MatchWinStreaksView f13206F;

    /* renamed from: G */
    private MatchWinStreaksView f13207G;

    /* renamed from: H */
    private long f13208H;

    /* renamed from: a */
    DialogC5019a f13209a;

    /* renamed from: b */
    DialogC9148b f13210b;

    /* renamed from: c */
    C5753b<BattleHealthBar> f13211c;

    /* renamed from: d */
    C5753b<LinkCrossTitleLayout> f13212d;

    /* renamed from: e */
    C5753b<BattleMvpContainerLayout> f13213e;

    /* renamed from: f */
    public AppCompatImageView f13214f;

    /* renamed from: g */
    public LinearLayout f13215g;

    /* renamed from: h */
    public HSImageView f13216h;

    /* renamed from: i */
    public HSImageView f13217i;

    /* renamed from: j */
    HSImageView f13218j;

    /* renamed from: k */
    HSImageView f13219k;

    /* renamed from: l */
    public View f13220l;

    /* renamed from: m */
    public AppCompatImageView f13221m;

    /* renamed from: n */
    public AppCompatImageView f13222n;

    /* renamed from: o */
    public LiveButton f13223o;

    /* renamed from: p */
    View f13224p;

    /* renamed from: q */
    public MatchWinningStreaksIconView f13225q;

    /* renamed from: r */
    public MatchWinningStreaksIconView f13226r;

    /* renamed from: s */
    AbstractC9168b f13227s;

    /* renamed from: t */
    View f13228t;

    /* renamed from: u */
    public boolean f13229u;

    /* renamed from: v */
    public boolean f13230v = true;

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    /* renamed from: b */
    public final C4971b mo10824b() {
        return (C4971b) this.f13202B.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.match.widget.SubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$a */
    public static final class C5072a {
        static {
            Covode.recordClassIndex(5663);
        }

        private C5072a() {
        }

        public /* synthetic */ C5072a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$z */
    static final class C5121z extends AbstractC89220m implements AbstractC89172b<EnumC4949c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13293a;

        static {
            Covode.recordClassIndex(5712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5121z(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.f13293a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC4949c cVar) {
            Room room;
            User owner;
            long j;
            long j2;
            int i;
            String a;
            String str;
            ImageModel imageModel;
            String str2;
            C11694a aVar;
            Long l;
            C11694a aVar2;
            Long l2;
            DataChannel dataChannel;
            MethodCollector.m26663i(4516);
            EnumC4949c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C3854a.m9453a(4, "LinkPKWidgetTag", "onChanged, currentBattle state = ".concat(String.valueOf(cVar2)));
            LinkBattleWidget linkBattleWidget = this.f13293a;
            int i2 = C5122a.f13298b[cVar2.ordinal()];
            if (i2 == 1) {
                linkBattleWidget.mo10831i();
            } else if (i2 == 2) {
                C5753b<BattleHealthBar> bVar = linkBattleWidget.f13211c;
                if (bVar == null) {
                    C89219l.m154710a("mHealthBarObserverView");
                }
                if (bVar.f14598b != null) {
                    C5753b<BattleHealthBar> bVar2 = linkBattleWidget.f13211c;
                    if (bVar2 == null) {
                        C89219l.m154710a("mHealthBarObserverView");
                    }
                    V v = bVar2.f14598b;
                    C89219l.m154716b(v, "");
                    ((BattleHealthBar) v).setVisibility(0);
                    C5753b<BattleHealthBar> bVar3 = linkBattleWidget.f13211c;
                    if (bVar3 == null) {
                        C89219l.m154710a("mHealthBarObserverView");
                    }
                    ((BattleHealthBar) bVar3.f14598b).mo10743a();
                    linkBattleWidget.dataChannel.mo28320c(C9042bh.class, true);
                }
                linkBattleWidget.mo10832j();
                LinkBattleWidget.m11294f();
                linkBattleWidget.mo10829e();
                linkBattleWidget.mo10826c();
                C4948b bVar4 = C4947a.f12909a;
                C11697d dVar = bVar4.f12932u;
                long j3 = 0;
                if (!((dVar != null && (aVar2 = dVar.f27992a) != null && (l2 = aVar2.f27972a) != null && l2.longValue() > 0) || (room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) == null || (owner = room.getOwner()) == null)) {
                    bVar4.f12932u = new C11697d(new C11694a(Long.valueOf(owner.getId()), owner.getNickName(), owner.displayId, owner.getAvatarThumb()));
                }
                C11697d dVar2 = bVar4.f12932u;
                C4948b bVar5 = C4947a.f12909a;
                C11697d dVar3 = bVar5.f12933v;
                if (dVar3 == null || (aVar = dVar3.f27992a) == null || (l = aVar.f27972a) == null || l.longValue() <= 0) {
                    C4384b.C4385a.m10496a();
                    User user = (User) C4384b.m10480c("data_guest_user");
                    if (user != null) {
                        bVar5.f12933v = new C11697d(new C11694a(Long.valueOf(user.getId()), user.getNickName(), user.displayId, user.getAvatarThumb()));
                    }
                }
                C11697d dVar4 = bVar5.f12933v;
                PkBattleUserInfoLayout pkBattleUserInfoLayout = (PkBattleUserInfoLayout) linkBattleWidget.findViewById(R.id.c5d);
                if (dVar2 != null) {
                    LiveTextView liveTextView = (LiveTextView) pkBattleUserInfoLayout.mo10808a(R.id.eyb);
                    C89219l.m154716b(liveTextView, "");
                    C11694a aVar3 = dVar2.f27992a;
                    if (aVar3 == null || (str2 = aVar3.f27974c) == null) {
                        str2 = "";
                    }
                    liveTextView.setText(str2);
                    ImageView imageView = (ImageView) pkBattleUserInfoLayout.mo10808a(R.id.bx5);
                    C11694a aVar4 = dVar2.f27992a;
                    C7577g.m15570a(imageView, aVar4 != null ? aVar4.f27975d : null, 2131234441);
                }
                if (dVar4 != null) {
                    LiveTextView liveTextView2 = (LiveTextView) pkBattleUserInfoLayout.mo10808a(R.id.f2s);
                    C89219l.m154716b(liveTextView2, "");
                    C11694a aVar5 = dVar4.f27992a;
                    if (aVar5 == null || (str = aVar5.f27974c) == null) {
                        str = "";
                    }
                    liveTextView2.setText(str);
                    ImageView imageView2 = (ImageView) pkBattleUserInfoLayout.mo10808a(R.id.bz3);
                    C11694a aVar6 = dVar4.f27992a;
                    if (aVar6 != null) {
                        imageModel = aVar6.f27975d;
                    } else {
                        imageModel = null;
                    }
                    C7577g.m15570a(imageView2, imageModel, 2131234441);
                }
                C5085al alVar = new C5085al(linkBattleWidget, pkBattleUserInfoLayout);
                C5086am amVar = new C5086am(linkBattleWidget, pkBattleUserInfoLayout);
                pkBattleUserInfoLayout.mo10809a();
                PkBattleUserInfoLayout.C5068b bVar6 = new PkBattleUserInfoLayout.C5068b(pkBattleUserInfoLayout);
                PkBattleUserInfoLayout.C5069c cVar3 = new PkBattleUserInfoLayout.C5069c(pkBattleUserInfoLayout);
                PkBattleUserInfoLayout.C5070d dVar5 = new PkBattleUserInfoLayout.C5070d(pkBattleUserInfoLayout);
                ConstraintLayout constraintLayout = (ConstraintLayout) pkBattleUserInfoLayout.mo10808a(R.id.c4k);
                C89219l.m154716b(constraintLayout, "");
                bVar6.mo10811a(constraintLayout);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) pkBattleUserInfoLayout.mo10808a(R.id.c5w);
                C89219l.m154716b(constraintLayout2, "");
                bVar6.mo10811a(constraintLayout2);
                LiveTextView liveTextView3 = (LiveTextView) pkBattleUserInfoLayout.mo10808a(R.id.eyb);
                C89219l.m154716b(liveTextView3, "");
                cVar3.mo10812a(liveTextView3);
                LiveTextView liveTextView4 = (LiveTextView) pkBattleUserInfoLayout.mo10808a(R.id.f2s);
                C89219l.m154716b(liveTextView4, "");
                cVar3.mo10812a(liveTextView4);
                VHeadView vHeadView = (VHeadView) pkBattleUserInfoLayout.mo10808a(R.id.bx5);
                C89219l.m154716b(vHeadView, "");
                dVar5.mo10813a(vHeadView);
                VHeadView vHeadView2 = (VHeadView) pkBattleUserInfoLayout.mo10808a(R.id.bz3);
                C89219l.m154716b(vHeadView2, "");
                dVar5.mo10813a(vHeadView2);
                pkBattleUserInfoLayout.f13186a = new AnimatorSet();
                AnimatorSet animatorSet = pkBattleUserInfoLayout.f13186a;
                if (animatorSet == null) {
                    C89219l.m154715b();
                }
                Animator[] animatorArr = new Animator[3];
                ConstraintLayout constraintLayout3 = (ConstraintLayout) pkBattleUserInfoLayout.mo10808a(R.id.c4k);
                C89219l.m154716b(constraintLayout3, "");
                constraintLayout3.setAlpha(1.0f);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) pkBattleUserInfoLayout.mo10808a(R.id.c5w);
                C89219l.m154716b(constraintLayout4, "");
                constraintLayout4.setAlpha(1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c4k), "translationX", -200.0f, 0.0f);
                C89219l.m154716b(ofFloat, "");
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c5w), "translationX", 200.0f, 0.0f);
                C89219l.m154716b(ofFloat2, "");
                animatorSet2.playTogether(ofFloat, ofFloat2);
                animatorSet2.setDuration(pkBattleUserInfoLayout.f13187b ? 640 : 400);
                if (Build.VERSION.SDK_INT >= 21) {
                    animatorSet2.setInterpolator(new PathInterpolator(0.32f, 0.94f, 0.0f, 1.0f));
                }
                animatorSet2.start();
                animatorArr[0] = animatorSet2;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c4k), "alpha", 1.0f, 1.0f);
                C89219l.m154716b(ofFloat3, "");
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c5w), "alpha", 1.0f, 1.0f);
                C89219l.m154716b(ofFloat4, "");
                animatorSet3.playTogether(ofFloat3, ofFloat4);
                if (pkBattleUserInfoLayout.f13187b) {
                    j = 1480;
                } else {
                    j = 1400;
                }
                animatorSet3.setDuration(j);
                animatorArr[1] = animatorSet3;
                AnimatorSet animatorSet4 = new AnimatorSet();
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c4k), "translationX", 0.0f, -200.0f);
                C89219l.m154716b(ofFloat5, "");
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c4k), "alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat6, "");
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c5w), "translationX", 0.0f, 200.0f);
                C89219l.m154716b(ofFloat7, "");
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(pkBattleUserInfoLayout.mo10808a(R.id.c5w), "alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat8, "");
                animatorSet4.playTogether(ofFloat5, ofFloat6, ofFloat7, ofFloat8);
                if (pkBattleUserInfoLayout.f13187b) {
                    j2 = 320;
                } else {
                    j2 = 200;
                }
                animatorSet4.setDuration(j2);
                animatorArr[2] = animatorSet4;
                animatorSet.playSequentially(animatorArr);
                AnimatorSet animatorSet5 = pkBattleUserInfoLayout.f13186a;
                if (animatorSet5 == null) {
                    C89219l.m154715b();
                }
                animatorSet5.addListener(new PkBattleUserInfoLayout.C5071e(amVar, alVar));
                AnimatorSet animatorSet6 = pkBattleUserInfoLayout.f13186a;
                if (animatorSet6 == null) {
                    C89219l.m154715b();
                }
                animatorSet6.start();
                C3854a.m9453a(3, "LinkPKWidgetTag", "pk combo showWinningStreakTips");
                if (!LinkBattleWidget.f13200w) {
                    C3854a.m9453a(3, "LinkPKWidgetTag", "pk is old ui style");
                } else {
                    MatchWinningStreaksIconView matchWinningStreaksIconView = linkBattleWidget.f13225q;
                    if (matchWinningStreaksIconView == null) {
                        C89219l.m154710a("winningStreakIconLeft");
                    }
                    if (matchWinningStreaksIconView.mo10790a(C4947a.f12909a.f12917f)) {
                        C5703b.m12476b(linkBattleWidget.f13294A, C4947a.f12909a.f12917f);
                    }
                    MatchWinningStreaksIconView matchWinningStreaksIconView2 = linkBattleWidget.f13226r;
                    if (matchWinningStreaksIconView2 == null) {
                        C89219l.m154710a("winningStreakIconRight");
                    }
                    if (matchWinningStreaksIconView2.mo10790a(C4947a.f12909a.f12918g)) {
                        C5703b.m12476b(linkBattleWidget.f13294A, C4947a.f12909a.f12918g);
                    }
                    if (C4947a.f12909a.f12917f == null) {
                        C3854a.m9453a(3, "LinkPKWidgetTag", "curAnchorCombo pk combo empty");
                    } else {
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) linkBattleWidget.findViewById(R.id.cbd);
                        LiveTextView liveTextView5 = (LiveTextView) linkBattleWidget.findViewById(R.id.cbe);
                        C89219l.m154716b(liveTextView5, "");
                        C11695b bVar7 = C4947a.f12909a.f12917f;
                        if (bVar7 != null) {
                            j3 = bVar7.f27978c;
                        }
                        long j4 = j3 + 1;
                        if (linkBattleWidget.f13294A) {
                            i = 0;
                            a = C3966y.m9660a((int) R.string.efk, Integer.valueOf((int) j4));
                            C89219l.m154716b(a, "");
                        } else {
                            i = 0;
                            a = C3966y.m9660a((int) R.string.e84, Integer.valueOf((int) j4));
                            C89219l.m154716b(a, "");
                        }
                        liveTextView5.setText(a);
                        C89219l.m154716b(constraintLayout5, "");
                        constraintLayout5.setVisibility(i);
                        HSImageView hSImageView = (HSImageView) linkBattleWidget.findViewById(R.id.cbc);
                        C89219l.m154716b(hSImageView, "");
                        C24246a aVar7 = (C24246a) hSImageView.getHierarchy();
                        C89219l.m154716b(aVar7, "");
                        aVar7.mo39958a(C24229q.AbstractC24231b.f57452b);
                        C3941k.m9607a(hSImageView, "tiktok_live_interaction_resource", "ttlive_match_winning_streak_tip_bg.png");
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(constraintLayout5, View.ALPHA, 0.0f, 1.0f);
                        ofFloat9.setDuration(320L);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(constraintLayout5, View.ALPHA, 1.0f, 1.0f);
                        ofFloat10.setDuration(1480L);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(constraintLayout5, View.ALPHA, 1.0f, 0.0f);
                        ofFloat11.setDuration(320L);
                        animatorSet7.playSequentially(ofFloat9, ofFloat10, ofFloat11);
                        animatorSet7.addListener(new C5095av(linkBattleWidget, constraintLayout5));
                        animatorSet7.start();
                    }
                }
                Integer num = (Integer) linkBattleWidget.dataChannel.mo28318b(C4391ae.class);
                int intValue = num != null ? num.intValue() : -1;
                C89233z.C89238e eVar = new C89233z.C89238e();
                C6805b<Boolean> bVar8 = AbstractC6804a.f17028cb;
                C89219l.m154716b(bVar8, "");
                eVar.element = (T) bVar8.mo13066a();
                if (intValue == 2) {
                    T t = eVar.element;
                    C89219l.m154716b(t, "");
                    if (t.booleanValue()) {
                        linkBattleWidget.mo10824b().mo10697d();
                    } else {
                        DialogC9148b.C9149a aVar8 = new DialogC9148b.C9149a(linkBattleWidget.context);
                        aVar8.f22256m = false;
                        aVar8.mo15243a(R.string.eag).mo15244a(R.string.eak, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5087an(linkBattleWidget, eVar), false).mo15249b(R.string.eaj, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5088ao(eVar), false);
                        ImageView imageView3 = new ImageView(linkBattleWidget.context);
                        imageView3.setImageResource(2131234472);
                        aVar8.f22251h = imageView3;
                        aVar8.f22254k = 46;
                        aVar8.f22255l = 48;
                        View inflate = LayoutInflater.from(linkBattleWidget.context).inflate(R.layout.b5u, (ViewGroup) null);
                        View findViewById = inflate.findViewById(R.id.a4f);
                        C89219l.m154716b(findViewById, "");
                        LiveCheckBox liveCheckBox = (LiveCheckBox) findViewById;
                        View findViewById2 = inflate.findViewById(R.id.eu6);
                        C89219l.m154716b(findViewById2, "");
                        ((LiveTextView) findViewById2).setText(R.string.eah);
                        liveCheckBox.setText(R.string.eai);
                        liveCheckBox.setOnCheckedChangeListener(new C5089ap(eVar));
                        aVar8.f22252i = inflate;
                        linkBattleWidget.f13210b = aVar8.mo15247a();
                        DialogC9148b bVar9 = linkBattleWidget.f13210b;
                        if (bVar9 != null) {
                            bVar9.show();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("invitee_list", C5737w.m12598a(C4384b.C4385a.m10496a().f11968p));
                        hashMap.put("anchor_type", C4384b.C4385a.m10496a().f11969q ? "inviter" : "invitee");
                        String str3 = C4384b.C4385a.m10496a().f11947aj;
                        if (str3 == null) {
                            str3 = "";
                        }
                        hashMap.put("request_from", str3);
                        C5703b.m12466a(hashMap);
                        C5703b.m12475b(hashMap);
                        C5703b.m12470a(true, false, (Map<String, String>) hashMap);
                        C5703b.m12465a("livesdk_no_gift_reminder_show", hashMap);
                    }
                }
                C5753b<LinkCrossTitleLayout> bVar10 = linkBattleWidget.f13212d;
                if (bVar10 == null) {
                    C89219l.m154710a("mBattleTitleObserverView");
                }
                LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) bVar10.f14598b;
                if (linkCrossTitleLayout != null) {
                    linkCrossTitleLayout.setVisibility(0);
                }
                HSImageView hSImageView2 = linkBattleWidget.f13218j;
                if (hSImageView2 == null) {
                    C89219l.m154710a("ivLeftAnimation");
                }
                hSImageView2.setVisibility(8);
                HSImageView hSImageView3 = linkBattleWidget.f13219k;
                if (hSImageView3 == null) {
                    C89219l.m154710a("ivRightAnimation");
                }
                hSImageView3.setVisibility(8);
                AppCompatImageView appCompatImageView = linkBattleWidget.f13221m;
                if (appCompatImageView == null) {
                    C89219l.m154710a("ivLeftResult");
                }
                appCompatImageView.setVisibility(8);
                AppCompatImageView appCompatImageView2 = linkBattleWidget.f13222n;
                if (appCompatImageView2 == null) {
                    C89219l.m154710a("ivRightResult");
                }
                appCompatImageView2.setVisibility(8);
                View view = linkBattleWidget.f13224p;
                if (view == null) {
                    C89219l.m154710a("layoutBottomContent");
                }
                view.setVisibility(0);
                LiveButton liveButton = linkBattleWidget.f13223o;
                if (liveButton == null) {
                    C89219l.m154710a("btnReMatch");
                }
                liveButton.setVisibility(8);
                C5753b<BattleMvpContainerLayout> bVar11 = linkBattleWidget.f13213e;
                if (bVar11 == null) {
                    C89219l.m154710a("mBattleMvpObserverView");
                }
                V v2 = bVar11.f14598b;
                C89219l.m154716b(v2, "");
                ((BattleMvpContainerLayout) v2).setVisibility(0);
                C5753b<BattleMvpContainerLayout> bVar12 = linkBattleWidget.f13213e;
                if (bVar12 == null) {
                    C89219l.m154710a("mBattleMvpObserverView");
                }
                BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) bVar12.f14598b;
                battleMvpContainerLayout.mo10761a();
                battleMvpContainerLayout.mo10763b();
                battleMvpContainerLayout.mo10764c();
                battleMvpContainerLayout.getMMvpImageView().setVisibility(8);
                View view2 = linkBattleWidget.f13224p;
                if (view2 == null) {
                    C89219l.m154710a("layoutBottomContent");
                }
                view2.post(new RunnableC5114s(linkBattleWidget));
                if (!linkBattleWidget.f13294A && C4947a.f12909a.f12924m) {
                    if (linkBattleWidget.f13227s == null) {
                        Room room2 = linkBattleWidget.f13296z;
                        C89219l.m154716b(room2, "");
                        linkBattleWidget.f13227s = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(room2.getId());
                    }
                    AbstractC9168b bVar13 = linkBattleWidget.f13227s;
                    if (bVar13 != null && bVar13.mo15295n() && bVar13.mo15293l()) {
                        bVar13.mo15271a(linkBattleWidget);
                        bVar13.mo15289h();
                        linkBattleWidget.f13228t = bVar13.mo15277b();
                        C5753b<BattleHealthBar> bVar14 = linkBattleWidget.f13211c;
                        if (bVar14 == null) {
                            C89219l.m154710a("mHealthBarObserverView");
                        }
                        bVar13.mo15270a(((BattleHealthBar) bVar14.f14598b).getLeftTextView());
                    }
                }
            } else if (i2 == 3) {
                linkBattleWidget.mo10823a(true);
                C5753b<BattleHealthBar> bVar15 = linkBattleWidget.f13211c;
                if (bVar15 == null) {
                    C89219l.m154710a("mHealthBarObserverView");
                }
                if (bVar15.f14598b != null) {
                    C5753b<BattleHealthBar> bVar16 = linkBattleWidget.f13211c;
                    if (bVar16 == null) {
                        C89219l.m154710a("mHealthBarObserverView");
                    }
                    V v3 = bVar16.f14598b;
                    C89219l.m154716b(v3, "");
                    ((BattleHealthBar) v3).setVisibility(0);
                    linkBattleWidget.dataChannel.mo28320c(C9042bh.class, true);
                }
                C5753b<LinkCrossTitleLayout> bVar17 = linkBattleWidget.f13212d;
                if (bVar17 == null) {
                    C89219l.m154710a("mBattleTitleObserverView");
                }
                LinkCrossTitleLayout linkCrossTitleLayout2 = (LinkCrossTitleLayout) bVar17.f14598b;
                if (linkCrossTitleLayout2 != null) {
                    linkCrossTitleLayout2.setVisibility(0);
                }
                View view3 = linkBattleWidget.f13224p;
                if (view3 == null) {
                    C89219l.m154710a("layoutBottomContent");
                }
                view3.setVisibility(0);
                C5753b<BattleMvpContainerLayout> bVar18 = linkBattleWidget.f13213e;
                if (bVar18 == null) {
                    C89219l.m154710a("mBattleMvpObserverView");
                }
                V v4 = bVar18.f14598b;
                C89219l.m154716b(v4, "");
                ((BattleMvpContainerLayout) v4).setVisibility(0);
                if (linkBattleWidget.f13294A) {
                    if (LinkBattleWidget.f13200w) {
                        View view4 = linkBattleWidget.getView();
                        if (view4 != null) {
                            view4.postDelayed(new RunnableC5112q(linkBattleWidget), 5000);
                        }
                    } else {
                        LiveButton liveButton2 = linkBattleWidget.f13223o;
                        if (liveButton2 == null) {
                            C89219l.m154710a("btnReMatch");
                        }
                        liveButton2.setVisibility(0);
                        LiveButton liveButton3 = linkBattleWidget.f13223o;
                        if (liveButton3 == null) {
                            C89219l.m154710a("btnReMatch");
                        }
                        liveButton3.mo9603b(R.style.sw);
                        LiveButton liveButton4 = linkBattleWidget.f13223o;
                        if (liveButton4 == null) {
                            C89219l.m154710a("btnReMatch");
                        }
                        liveButton4.setEnabled(true);
                    }
                }
                linkBattleWidget.mo10826c();
                View view5 = linkBattleWidget.f13224p;
                if (view5 == null) {
                    C89219l.m154710a("layoutBottomContent");
                }
                view5.post(new RunnableC5113r(linkBattleWidget));
            } else if (i2 == 4) {
                linkBattleWidget.mo10823a(true);
                linkBattleWidget.mo10830h();
                C5753b<BattleHealthBar> bVar19 = linkBattleWidget.f13211c;
                if (bVar19 == null) {
                    C89219l.m154710a("mHealthBarObserverView");
                }
                V v5 = bVar19.f14598b;
                C89219l.m154716b(v5, "");
                ((BattleHealthBar) v5).setVisibility(8);
                C5753b<LinkCrossTitleLayout> bVar20 = linkBattleWidget.f13212d;
                if (bVar20 == null) {
                    C89219l.m154710a("mBattleTitleObserverView");
                }
                ((LinkCrossTitleLayout) bVar20.f14598b).mo10495a();
                HSImageView hSImageView4 = linkBattleWidget.f13216h;
                if (hSImageView4 == null) {
                    C89219l.m154710a("ivCenterAnimation");
                }
                hSImageView4.setVisibility(8);
                HSImageView hSImageView5 = linkBattleWidget.f13218j;
                if (hSImageView5 == null) {
                    C89219l.m154710a("ivLeftAnimation");
                }
                hSImageView5.setVisibility(8);
                HSImageView hSImageView6 = linkBattleWidget.f13219k;
                if (hSImageView6 == null) {
                    C89219l.m154710a("ivRightAnimation");
                }
                hSImageView6.setVisibility(8);
                AppCompatImageView appCompatImageView3 = linkBattleWidget.f13221m;
                if (appCompatImageView3 == null) {
                    C89219l.m154710a("ivLeftResult");
                }
                appCompatImageView3.setVisibility(8);
                AppCompatImageView appCompatImageView4 = linkBattleWidget.f13222n;
                if (appCompatImageView4 == null) {
                    C89219l.m154710a("ivRightResult");
                }
                appCompatImageView4.setVisibility(8);
                View view6 = linkBattleWidget.f13224p;
                if (view6 == null) {
                    C89219l.m154710a("layoutBottomContent");
                }
                view6.setVisibility(8);
                LiveButton liveButton5 = linkBattleWidget.f13223o;
                if (liveButton5 == null) {
                    C89219l.m154710a("btnReMatch");
                }
                liveButton5.setVisibility(8);
                C5753b<BattleMvpContainerLayout> bVar21 = linkBattleWidget.f13213e;
                if (bVar21 == null) {
                    C89219l.m154710a("mBattleMvpObserverView");
                }
                V v6 = bVar21.f14598b;
                C89219l.m154716b(v6, "");
                ((BattleMvpContainerLayout) v6).setVisibility(8);
                C5753b<BattleMvpContainerLayout> bVar22 = linkBattleWidget.f13213e;
                if (bVar22 == null) {
                    C89219l.m154710a("mBattleMvpObserverView");
                }
                ((BattleMvpContainerLayout) bVar22.f14598b).mo10761a();
                AppCompatImageView appCompatImageView5 = linkBattleWidget.f13214f;
                if (appCompatImageView5 == null) {
                    C89219l.m154710a("ivMuteView");
                }
                appCompatImageView5.setVisibility(8);
                MatchWinningStreaksIconView matchWinningStreaksIconView3 = linkBattleWidget.f13226r;
                if (matchWinningStreaksIconView3 == null) {
                    C89219l.m154710a("winningStreakIconRight");
                }
                matchWinningStreaksIconView3.setVisibility(8);
                MatchWinningStreaksIconView matchWinningStreaksIconView4 = linkBattleWidget.f13225q;
                if (matchWinningStreaksIconView4 == null) {
                    C89219l.m154710a("winningStreakIconLeft");
                }
                matchWinningStreaksIconView4.setVisibility(8);
                if (linkBattleWidget.f13295y.f11942ae && (dataChannel = linkBattleWidget.dataChannel) != null) {
                    dataChannel.mo28315b(C4952c.class, (Object) false);
                }
                DataChannel dataChannel2 = linkBattleWidget.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.mo28320c(C9042bh.class, false);
                }
                DialogC5019a aVar9 = linkBattleWidget.f13209a;
                if (aVar9 != null && aVar9.isShowing()) {
                    aVar9.dismiss();
                }
                linkBattleWidget.mo10833k();
                linkBattleWidget.mo10832j();
                linkBattleWidget.mo10828d();
                LinkBattleWidget.m11294f();
                linkBattleWidget.mo10829e();
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(4516);
            return zVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.AbstractC4981b
    /* renamed from: a */
    public final void mo10702a(C9642h hVar, AbstractC89171a<C89391z> aVar) {
        Integer num;
        C89219l.m154721d(aVar, "");
        if (hVar != null) {
            num = Integer.valueOf(hVar.f23491b);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                HSImageView hSImageView = this.f13218j;
                if (hSImageView == null) {
                    C89219l.m154710a("ivLeftAnimation");
                }
                m11287a(hSImageView, new C5078af(this));
                HSImageView hSImageView2 = this.f13219k;
                if (hSImageView2 == null) {
                    C89219l.m154710a("ivRightAnimation");
                }
                m11289b(hSImageView2, new C5079ag(this));
                C3854a.m9453a(3, "LinkPKWidgetTag", "showWinStreaks");
                if (!f13200w) {
                    C3854a.m9453a(3, "LinkPKWidgetTag", "pk old ui");
                } else {
                    MatchWinningStreaksIconView matchWinningStreaksIconView = this.f13225q;
                    if (matchWinningStreaksIconView == null) {
                        C89219l.m154710a("winningStreakIconLeft");
                    }
                    if (matchWinningStreaksIconView.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView2 = this.f13225q;
                        if (matchWinningStreaksIconView2 == null) {
                            C89219l.m154710a("winningStreakIconLeft");
                        }
                        matchWinningStreaksIconView2.mo10790a(C4947a.f12909a.f12917f);
                    }
                    MatchWinningStreaksIconView matchWinningStreaksIconView3 = this.f13226r;
                    if (matchWinningStreaksIconView3 == null) {
                        C89219l.m154710a("winningStreakIconRight");
                    }
                    if (matchWinningStreaksIconView3.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView4 = this.f13226r;
                        if (matchWinningStreaksIconView4 == null) {
                            C89219l.m154710a("winningStreakIconRight");
                        }
                        matchWinningStreaksIconView4.mo10790a(C4947a.f12909a.f12918g);
                    }
                    C11695b bVar = C4947a.f12909a.f12917f;
                    if (bVar != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView5 = this.f13225q;
                        if (matchWinningStreaksIconView5 == null) {
                            C89219l.m154710a("winningStreakIconLeft");
                        }
                        if (matchWinningStreaksIconView5.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView = this.f13206F;
                            if (matchWinStreaksView == null) {
                                C89219l.m154710a("leftAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView6 = this.f13225q;
                            if (matchWinningStreaksIconView6 == null) {
                                C89219l.m154710a("winningStreakIconLeft");
                            }
                            matchWinStreaksView.mo10778a(matchWinningStreaksIconView6.getInfo(), bVar);
                            MatchWinningStreaksIconView matchWinningStreaksIconView7 = this.f13225q;
                            if (matchWinningStreaksIconView7 == null) {
                                C89219l.m154710a("winningStreakIconLeft");
                            }
                            matchWinningStreaksIconView7.mo10789a(bVar, true);
                        }
                    }
                    C11695b bVar2 = C4947a.f12909a.f12918g;
                    if (bVar2 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView8 = this.f13226r;
                        if (matchWinningStreaksIconView8 == null) {
                            C89219l.m154710a("winningStreakIconRight");
                        }
                        if (matchWinningStreaksIconView8.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView2 = this.f13207G;
                            if (matchWinStreaksView2 == null) {
                                C89219l.m154710a("rightAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView9 = this.f13226r;
                            if (matchWinningStreaksIconView9 == null) {
                                C89219l.m154710a("winningStreakIconRight");
                            }
                            matchWinStreaksView2.mo10778a(matchWinningStreaksIconView9.getInfo(), bVar2);
                            MatchWinningStreaksIconView matchWinningStreaksIconView10 = this.f13226r;
                            if (matchWinningStreaksIconView10 == null) {
                                C89219l.m154710a("winningStreakIconRight");
                            }
                            matchWinningStreaksIconView10.mo10789a(bVar2, false);
                        }
                    }
                }
                aVar.invoke();
                return;
            } else if (num.intValue() == 1) {
                HSImageView hSImageView3 = this.f13218j;
                if (hSImageView3 == null) {
                    C89219l.m154710a("ivLeftAnimation");
                }
                m11289b(hSImageView3, new C5080ah(this));
                HSImageView hSImageView4 = this.f13219k;
                if (hSImageView4 == null) {
                    C89219l.m154710a("ivRightAnimation");
                }
                m11287a(hSImageView4, new C5081ai(this));
                C3854a.m9453a(3, "LinkPKWidgetTag", "showWinStreaks");
                if (!f13200w) {
                    C3854a.m9453a(3, "LinkPKWidgetTag", "pk old ui");
                } else {
                    MatchWinningStreaksIconView matchWinningStreaksIconView11 = this.f13225q;
                    if (matchWinningStreaksIconView11 == null) {
                        C89219l.m154710a("winningStreakIconLeft");
                    }
                    if (matchWinningStreaksIconView11.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView12 = this.f13225q;
                        if (matchWinningStreaksIconView12 == null) {
                            C89219l.m154710a("winningStreakIconLeft");
                        }
                        matchWinningStreaksIconView12.mo10790a(C4947a.f12909a.f12917f);
                    }
                    MatchWinningStreaksIconView matchWinningStreaksIconView13 = this.f13226r;
                    if (matchWinningStreaksIconView13 == null) {
                        C89219l.m154710a("winningStreakIconRight");
                    }
                    if (matchWinningStreaksIconView13.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView14 = this.f13226r;
                        if (matchWinningStreaksIconView14 == null) {
                            C89219l.m154710a("winningStreakIconRight");
                        }
                        matchWinningStreaksIconView14.mo10790a(C4947a.f12909a.f12918g);
                    }
                    C11695b bVar3 = C4947a.f12909a.f12917f;
                    if (bVar3 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView15 = this.f13225q;
                        if (matchWinningStreaksIconView15 == null) {
                            C89219l.m154710a("winningStreakIconLeft");
                        }
                        if (matchWinningStreaksIconView15.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView3 = this.f13206F;
                            if (matchWinStreaksView3 == null) {
                                C89219l.m154710a("leftAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView16 = this.f13225q;
                            if (matchWinningStreaksIconView16 == null) {
                                C89219l.m154710a("winningStreakIconLeft");
                            }
                            matchWinStreaksView3.mo10778a(matchWinningStreaksIconView16.getInfo(), bVar3);
                            MatchWinningStreaksIconView matchWinningStreaksIconView17 = this.f13225q;
                            if (matchWinningStreaksIconView17 == null) {
                                C89219l.m154710a("winningStreakIconLeft");
                            }
                            matchWinningStreaksIconView17.mo10789a(bVar3, false);
                        }
                    }
                    C11695b bVar4 = C4947a.f12909a.f12918g;
                    if (bVar4 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView18 = this.f13226r;
                        if (matchWinningStreaksIconView18 == null) {
                            C89219l.m154710a("winningStreakIconRight");
                        }
                        if (matchWinningStreaksIconView18.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView4 = this.f13207G;
                            if (matchWinStreaksView4 == null) {
                                C89219l.m154710a("rightAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView19 = this.f13226r;
                            if (matchWinningStreaksIconView19 == null) {
                                C89219l.m154710a("winningStreakIconRight");
                            }
                            matchWinStreaksView4.mo10778a(matchWinningStreaksIconView19.getInfo(), bVar4);
                            MatchWinningStreaksIconView matchWinningStreaksIconView20 = this.f13226r;
                            if (matchWinningStreaksIconView20 == null) {
                                C89219l.m154710a("winningStreakIconRight");
                            }
                            matchWinningStreaksIconView20.mo10789a(bVar4, true);
                        }
                    }
                }
                aVar.invoke();
                return;
            }
        }
        HSImageView hSImageView5 = this.f13217i;
        if (hSImageView5 == null) {
            C89219l.m154710a("ivCenterAnimation2");
        }
        hSImageView5.setVisibility(0);
        if (f13200w) {
            HSImageView hSImageView6 = this.f13217i;
            if (hSImageView6 == null) {
                C89219l.m154710a("ivCenterAnimation2");
            }
            ViewGroup.LayoutParams layoutParams = hSImageView6.getLayoutParams();
            layoutParams.width = C3966y.m9664c();
            layoutParams.height = (int) (((float) C3966y.m9664c()) * 0.54933333f);
            HSImageView hSImageView7 = this.f13217i;
            if (hSImageView7 == null) {
                C89219l.m154710a("ivCenterAnimation2");
            }
            hSImageView7.setLayoutParams(layoutParams);
        }
        C5084ak akVar = new C5084ak(this, aVar);
        String battleDraw = C4962b.m11162a().getBattleDraw();
        HSImageView hSImageView8 = this.f13217i;
        if (hSImageView8 == null) {
            C89219l.m154710a("ivCenterAnimation2");
        }
        C5746d.m12615a(hSImageView8, battleDraw, new C5082aj(this, akVar));
        HSImageView hSImageView9 = this.f13217i;
        if (hSImageView9 == null) {
            C89219l.m154710a("ivCenterAnimation2");
        }
        hSImageView9.postDelayed(new C5082aj.RunnableC5083a(akVar), f13195J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10823a(boolean z) {
        AbstractC9168b bVar;
        if (!this.f13294A && (bVar = this.f13227s) != null) {
            if (z) {
                bVar.mo15280b(this);
            }
            bVar.mo15290i();
            View b = bVar.mo15277b();
            C5753b<BattleHealthBar> bVar2 = this.f13211c;
            if (bVar2 == null) {
                C89219l.m154710a("mHealthBarObserverView");
            }
            if (C89219l.m154714a(b, ((BattleHealthBar) bVar2.f14598b).getLeftTextView())) {
                bVar.mo15270a(this.f13228t);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.AbstractC4981b
    /* renamed from: a */
    public final void mo10701a(C9614an anVar) {
        C89219l.m154721d(anVar, "");
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eap);
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.AbstractC4981b
    /* renamed from: a */
    public final void mo10703a(String str) {
        C89219l.m154721d(str, "");
        mo10828d();
        C5753b<BattleHealthBar> bVar = this.f13211c;
        if (bVar == null) {
            C89219l.m154710a("mHealthBarObserverView");
        }
        this.f13208H = C4097j.m9923a(bVar.f14598b, str, 15000);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$p */
    static final class C5111p extends AbstractC89220m implements AbstractC89171a<C4971b> {

        /* renamed from: a */
        public static final C5111p f13283a = new C5111p();

        static {
            Covode.recordClassIndex(5702);
        }

        C5111p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C4971b invoke() {
            return new C4971b();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$r */
    static final class RunnableC5113r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13285a;

        static {
            Covode.recordClassIndex(5704);
        }

        RunnableC5113r(LinkBattleWidget linkBattleWidget) {
            this.f13285a = linkBattleWidget;
        }

        public final void run() {
            this.f13285a.mo10830h();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$s */
    static final class RunnableC5114s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13286a;

        static {
            Covode.recordClassIndex(5705);
        }

        RunnableC5114s(LinkBattleWidget linkBattleWidget) {
            this.f13286a = linkBattleWidget;
        }

        public final void run() {
            this.f13286a.mo10830h();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ac */
    static final class C5075ac extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C5075ac f13233a = new C5075ac();

        static {
            Covode.recordClassIndex(5666);
        }

        C5075ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C4947a.m11148a("destroy", 0);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ar */
    public static final class RunnableC5091ar implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HSImageView f13257a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13258b;

        static {
            Covode.recordClassIndex(5682);
        }

        RunnableC5091ar(HSImageView hSImageView, AbstractC89171a aVar) {
            this.f13257a = hSImageView;
            this.f13258b = aVar;
        }

        public final void run() {
            this.f13257a.setVisibility(8);
            AbstractC89171a aVar = this.f13258b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$au */
    public static final class RunnableC5094au implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HSImageView f13263a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13264b;

        static {
            Covode.recordClassIndex(5685);
        }

        RunnableC5094au(HSImageView hSImageView, AbstractC89171a aVar) {
            this.f13263a = hSImageView;
            this.f13264b = aVar;
        }

        public final void run() {
            this.f13263a.setVisibility(8);
            AbstractC89171a aVar = this.f13264b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$m */
    public static final class C5108m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f13280a;

        static {
            Covode.recordClassIndex(5699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5108m(AbstractC89171a aVar) {
            super(0);
            this.f13280a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            AbstractC89171a aVar = this.f13280a;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$n */
    public static final class C5109n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f13281a;

        static {
            Covode.recordClassIndex(5700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5109n(AbstractC89171a aVar) {
            super(0);
            this.f13281a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            AbstractC89171a aVar = this.f13281a;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$o */
    public static final class C5110o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f13282a;

        static {
            Covode.recordClassIndex(5701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5110o(AbstractC89171a aVar) {
            super(0);
            this.f13282a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            AbstractC89171a aVar = this.f13282a;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: n */
    private final void m11301n() {
        C5703b.m12472b(C5703b.EnumC5704a.POSITIVE_OVER);
        C4971b.m11173b(mo10824b(), 101, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo10833k() {
        DialogC9148b bVar = this.f13210b;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ak */
    static final class C5084ak extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13244a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13245b;

        static {
            Covode.recordClassIndex(5675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5084ak(LinkBattleWidget linkBattleWidget, AbstractC89171a aVar) {
            super(0);
            this.f13244a = linkBattleWidget;
            this.f13245b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LinkBattleWidget.m11293f(this.f13244a).setVisibility(8);
            this.f13245b.invoke();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aq */
    public static final class C5090aq extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ HSImageView f13254a;

        /* renamed from: b */
        final /* synthetic */ Runnable f13255b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13256c;

        static {
            Covode.recordClassIndex(5681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5090aq(HSImageView hSImageView, Runnable runnable, AbstractC89171a aVar) {
            super(0);
            this.f13254a = hSImageView;
            this.f13255b = runnable;
            this.f13256c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f13254a.removeCallbacks(this.f13255b);
            AbstractC89171a aVar = this.f13256c;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$at */
    public static final class C5093at extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ HSImageView f13260a;

        /* renamed from: b */
        final /* synthetic */ Runnable f13261b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f13262c;

        static {
            Covode.recordClassIndex(5684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5093at(HSImageView hSImageView, Runnable runnable, AbstractC89171a aVar) {
            super(0);
            this.f13260a = hSImageView;
            this.f13261b = runnable;
            this.f13262c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f13260a.removeCallbacks(this.f13261b);
            AbstractC89171a aVar = this.f13262c;
            if (aVar != null) {
                aVar.invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$b */
    public static final class C5096b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13267a;

        /* renamed from: b */
        final /* synthetic */ C5703b.EnumC5705b f13268b;

        static {
            Covode.recordClassIndex(5687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5096b(LinkBattleWidget linkBattleWidget, C5703b.EnumC5705b bVar) {
            super(0);
            this.f13267a = linkBattleWidget;
            this.f13268b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f13267a.mo10824b().mo10695a(false, this.f13268b);
            C4384b.C4385a.m10496a().f11947aj = this.f13268b.getValue();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10828d() {
        if (C4097j.m9933b(this.f13208H)) {
            C4097j.m9928a(this.f13208H);
        }
        this.f13208H = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo10829e() {
        AbstractC8241e eVar = this.f13204D;
        if (eVar != null) {
            eVar.mo14465b();
        }
        this.f13204D = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo10831i() {
        DialogC5019a aVar = this.f13209a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
        this.f13209a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo10832j() {
        C4640b bVar = this.f13203C;
        if (bVar != null && bVar.mo18054n()) {
            bVar.dismiss();
        }
        this.f13203C = null;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$af */
    static final class C5078af extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13237a;

        static {
            Covode.recordClassIndex(5669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5078af(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.f13237a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            if (C4947a.f12909a.mo10672a() == EnumC4949c.PUNISH) {
                LinkBattleWidget.m11291d(this.f13237a).setVisibility(0);
                AppCompatImageView d = LinkBattleWidget.m11291d(this.f13237a);
                if (LinkBattleWidget.f13200w) {
                    i = 2131234827;
                } else {
                    i = 2131234826;
                }
                d.setImageResource(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ag */
    static final class C5079ag extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13238a;

        static {
            Covode.recordClassIndex(5670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5079ag(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.f13238a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            if (C4947a.f12909a.mo10672a() == EnumC4949c.PUNISH) {
                LinkBattleWidget.m11292e(this.f13238a).setVisibility(0);
                AppCompatImageView e = LinkBattleWidget.m11292e(this.f13238a);
                if (LinkBattleWidget.f13200w) {
                    i = 2131234825;
                } else {
                    i = 2131234824;
                }
                e.setImageResource(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ah */
    static final class C5080ah extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13239a;

        static {
            Covode.recordClassIndex(5671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5080ah(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.f13239a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            if (C4947a.f12909a.mo10672a() == EnumC4949c.PUNISH) {
                LinkBattleWidget.m11291d(this.f13239a).setVisibility(0);
                AppCompatImageView d = LinkBattleWidget.m11291d(this.f13239a);
                if (LinkBattleWidget.f13200w) {
                    i = 2131234825;
                } else {
                    i = 2131234824;
                }
                d.setImageResource(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ai */
    static final class C5081ai extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13240a;

        static {
            Covode.recordClassIndex(5672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5081ai(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.f13240a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            if (C4947a.f12909a.mo10672a() == EnumC4949c.PUNISH) {
                LinkBattleWidget.m11292e(this.f13240a).setVisibility(0);
                AppCompatImageView e = LinkBattleWidget.m11292e(this.f13240a);
                if (LinkBattleWidget.f13200w) {
                    i = 2131234827;
                } else {
                    i = 2131234826;
                }
                e.setImageResource(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aj */
    static final class C5082aj extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13241a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f13242b;

        /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aj$a */
        final /* synthetic */ class RunnableC5083a implements Runnable {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f13243a;

            static {
                Covode.recordClassIndex(5674);
            }

            RunnableC5083a(AbstractC89171a aVar) {
                this.f13243a = aVar;
            }

            public final /* synthetic */ void run() {
                C89219l.m154716b(this.f13243a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(5673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5082aj(LinkBattleWidget linkBattleWidget, AbstractC89171a aVar) {
            super(0);
            this.f13241a = linkBattleWidget;
            this.f13242b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aj$a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r3 = this;
                com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget r0 = r3.f13241a
                com.bytedance.android.live.core.widget.HSImageView r1 = com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.m11293f(r0)
                r0 = 8
                r1.setVisibility(r0)
                com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget r0 = r3.f13241a
                com.bytedance.android.live.core.widget.HSImageView r2 = com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.m11293f(r0)
                h.f.a.a r1 = r3.f13242b
                if (r1 == 0) goto L_0x001b
                com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aj$a r0 = new com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aj$a
                r0.<init>(r1)
                r1 = r0
            L_0x001b:
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r2.removeCallbacks(r1)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.C5082aj.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$al */
    static final class C5085al extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13246a;

        /* renamed from: b */
        final /* synthetic */ PkBattleUserInfoLayout f13247b;

        static {
            Covode.recordClassIndex(5676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5085al(LinkBattleWidget linkBattleWidget, PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(0);
            this.f13246a = linkBattleWidget;
            this.f13247b = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            PkBattleUserInfoLayout pkBattleUserInfoLayout = this.f13247b;
            C89219l.m154716b(pkBattleUserInfoLayout, "");
            pkBattleUserInfoLayout.setVisibility(0);
            LinkBattleWidget.m11295g(this.f13246a).setVisibility(0);
            LinkBattleWidget.m11296h(this.f13246a).setVisibility(0);
            C5746d.m12615a(LinkBattleWidget.m11295g(this.f13246a), C4962b.m11162a().getBattleStart(), null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$am */
    static final class C5086am extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13248a;

        /* renamed from: b */
        final /* synthetic */ PkBattleUserInfoLayout f13249b;

        static {
            Covode.recordClassIndex(5677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5086am(LinkBattleWidget linkBattleWidget, PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(0);
            this.f13248a = linkBattleWidget;
            this.f13249b = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LinkBattleWidget.m11295g(this.f13248a).setImageURI((String) null);
            PkBattleUserInfoLayout pkBattleUserInfoLayout = this.f13249b;
            C89219l.m154716b(pkBattleUserInfoLayout, "");
            pkBattleUserInfoLayout.setVisibility(8);
            LinkBattleWidget.m11295g(this.f13248a).setVisibility(8);
            LinkBattleWidget.m11296h(this.f13248a).setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$q */
    static final class RunnableC5112q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13284a;

        static {
            Covode.recordClassIndex(5703);
        }

        RunnableC5112q(LinkBattleWidget linkBattleWidget) {
            this.f13284a = linkBattleWidget;
        }

        public final void run() {
            LinkBattleWidget.m11290c(this.f13284a).setVisibility(0);
            LinkBattleWidget.m11290c(this.f13284a).mo9603b(R.style.sw);
            LinkBattleWidget.m11290c(this.f13284a).setEnabled(true);
        }
    }

    /* renamed from: f */
    static void m11294f() {
        try {
            AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
            C89219l.m154716b(a, "");
            ((AbstractC2928f) a).getHybridDialogManager().mo7674a("link_battle");
        } catch (Exception e) {
            C3854a.m9453a(4, "LinkPKWidgetTag", "dismissMvpDialog, Exception: ".concat(String.valueOf(e)));
        }
    }

    /* renamed from: h */
    public final void mo10830h() {
        if (this.context != null) {
            boolean a = C4947a.m11149a();
            C7398o oVar = new C7398o(0);
            oVar.f18330c = a;
            oVar.f18329b = Integer.valueOf(LinkCrossRoomWidget.f12633a + LinkCrossRoomWidget.f12635c);
            oVar.f18331d = LinkCrossRoomWidget.f12636d;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4450t.class, oVar);
            }
        }
    }

    static {
        long j;
        float f;
        float f2;
        float f3;
        Covode.recordClassIndex(5662);
        boolean z = false;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z = true;
        }
        f13200w = z;
        long j2 = 3000;
        if (z) {
            j = 3800;
        } else {
            j = 3000;
        }
        f13194I = j;
        if (z) {
            j2 = 2600;
        }
        f13195J = j2;
        if (z) {
            f = 159.5f;
        } else {
            f = 187.0f;
        }
        f13196K = f;
        if (z) {
            f2 = 192.5f;
        } else {
            f2 = 300.0f;
        }
        f13197L = f2;
        float f4 = 147.0f;
        if (z) {
            f3 = 147.0f;
        } else {
            f3 = 144.0f;
        }
        f13198M = f3;
        if (!z) {
            f4 = 156.0f;
        }
        f13199N = f4;
    }

    /* renamed from: l */
    private final void m11299l() {
        C4640b bVar;
        mo10832j();
        C4640b bVar2 = new C4640b();
        this.f13203C = bVar2;
        bVar2.f12296a = C3966y.m9657a((int) R.string.e67);
        bVar2.f12297b = C3966y.m9657a((int) R.string.e68);
        bVar2.f12298c = 2;
        bVar2.f12300e = C3966y.m9657a((int) R.string.e7l);
        bVar2.f12299d = C3966y.m9657a((int) R.string.e69);
        bVar2.mo10390a(mo10824b());
        AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
        if (iVar != null && (bVar = this.f13203C) != null) {
            bVar.show(iVar, "InteractDisconnectDialog");
        }
    }

    /* renamed from: m */
    private final void m11300m() {
        C4640b bVar;
        mo10832j();
        C4640b bVar2 = new C4640b();
        this.f13203C = bVar2;
        bVar2.f12296a = C3966y.m9657a((int) R.string.e8v);
        bVar2.f12297b = C3966y.m9657a((int) R.string.e8w);
        bVar2.f12298c = 2;
        bVar2.f12300e = C3966y.m9657a((int) R.string.e7l);
        bVar2.f12299d = C3966y.m9657a((int) R.string.e8x);
        bVar2.mo10390a(mo10824b());
        AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
        if (iVar != null && (bVar = this.f13203C) != null) {
            bVar.show(iVar, "InteractDisconnectDialog");
        }
    }

    /* renamed from: c */
    public final void mo10826c() {
        EnumC4949c a = C4947a.f12909a.mo10672a();
        C3854a.m9453a(3, "LinkPKWidgetTag", "updateMuteView, currentState = " + a + ", guestMute = " + this.f13295y.f11942ae);
        if (a != EnumC4949c.NORMAL && a != EnumC4949c.END) {
            if (this.f13295y.f11942ae) {
                if (this.f13230v) {
                    AppCompatImageView appCompatImageView = this.f13214f;
                    if (appCompatImageView == null) {
                        C89219l.m154710a("ivMuteView");
                    }
                    appCompatImageView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView2 = this.f13214f;
                if (appCompatImageView2 == null) {
                    C89219l.m154710a("ivMuteView");
                }
                appCompatImageView2.setImageResource(2131234726);
                if (this.f13294A) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e9c);
                    return;
                }
                Room room = this.f13296z;
                C89219l.m154716b(room, "");
                User owner = room.getOwner();
                if (owner != null) {
                    String string = this.context.getString(R.string.e9b);
                    C89219l.m154716b(string, "");
                    String a2 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{owner.displayId}, 1));
                    C89219l.m154716b(a2, "");
                    C11226ao.m19883a(C3966y.m9669e(), a2, 0);
                }
            } else if (this.f13294A) {
                if (this.f13230v) {
                    AppCompatImageView appCompatImageView3 = this.f13214f;
                    if (appCompatImageView3 == null) {
                        C89219l.m154710a("ivMuteView");
                    }
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = this.f13214f;
                if (appCompatImageView4 == null) {
                    C89219l.m154710a("ivMuteView");
                }
                appCompatImageView4.setImageResource(2131234727);
            } else {
                AppCompatImageView appCompatImageView5 = this.f13214f;
                if (appCompatImageView5 == null) {
                    C89219l.m154710a("ivMuteView");
                }
                appCompatImageView5.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C3854a.m9453a(3, "LinkPKWidgetTag", "onDestroy,  channelId = " + this.f13295y.f11957e);
        if (!this.f13294A) {
            C5703b.m12463a("onDestroy");
        }
        C5753b<BattleHealthBar> bVar = this.f13211c;
        if (bVar == null) {
            C89219l.m154710a("mHealthBarObserverView");
        }
        if (bVar.f14598b != null) {
            C5753b<BattleHealthBar> bVar2 = this.f13211c;
            if (bVar2 == null) {
                C89219l.m154710a("mHealthBarObserverView");
            }
            ((BattleHealthBar) bVar2.f14598b).mo10743a();
        }
        mo10831i();
        mo10832j();
        mo10833k();
        mo10828d();
        m11294f();
        mo10829e();
        if (this.f13294A) {
            mo10819a(104, false, (AbstractC89171a<C89391z>) C5075ac.f13233a);
        } else {
            C4947a.m11148a("destroy", 0);
        }
        mo10823a(true);
        mo10824b().mo8577b();
        C5752a aVar = this.f13205E;
        if (aVar == null) {
            C89219l.m154710a("mObserverViewManager");
        }
        aVar.mo11501a();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.match.p311ui.p314c.AbstractC5026a
    /* renamed from: a */
    public final void mo10733a() {
        EnumC4949c a = C4947a.f12909a.mo10672a();
        C3854a.m9453a(4, "LinkPKWidgetTag", "onBattleClick, state = ".concat(String.valueOf(a)));
        C5703b.m12458a();
        if (a != EnumC4949c.NORMAL) {
            C5703b.m12461a(C5703b.EnumC5705b.PK_ICON, false);
        }
        if (a == EnumC4949c.NORMAL) {
            mo10820a(C5703b.EnumC5705b.PK_ICON);
        } else if (a == EnumC4949c.INVITED) {
            m11299l();
        } else if (a == EnumC4949c.RECEIVED) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eaz);
        } else if (EnumC4949c.START.compareTo((Enum) a) <= 0 && a.compareTo((Enum) EnumC4949c.FINISH) < 0) {
            m11300m();
        } else if (EnumC4949c.PUNISH.compareTo((Enum) a) <= 0 && a.compareTo((Enum) EnumC4949c.END) < 0) {
            m11301n();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.widget.SubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        int i;
        super.onCreate();
        C4947a.m11148a("create", 0);
        C5752a aVar = new C5752a(this.dataChannel, getView());
        this.f13205E = aVar;
        C5753b.C5754a a = aVar.mo11500a(R.id.ffe);
        a.f14601b = new C5097c(this);
        C5753b<BattleHealthBar> a2 = a.mo11506b(C4951b.class, C5099e.f13271a).mo11506b(C4957h.class, C5100f.f13272a).mo11505a();
        C89219l.m154716b(a2, "");
        this.f13211c = a2;
        C5752a aVar2 = this.f13205E;
        if (aVar2 == null) {
            C89219l.m154710a("mObserverViewManager");
        }
        C5753b.C5754a a3 = aVar2.mo11500a(R.id.c4p);
        a3.f14601b = C5101g.f13273a;
        C5753b<LinkCrossTitleLayout> a4 = a3.mo11506b(C4960k.class, C5102h.f13274a).mo11506b(C4955f.class, C5103i.f13275a).mo11505a();
        C89219l.m154716b(a4, "");
        this.f13212d = a4;
        C5752a aVar3 = this.f13205E;
        if (aVar3 == null) {
            C89219l.m154710a("mObserverViewManager");
        }
        C5753b.C5754a a5 = aVar3.mo11500a(R.id.c5e);
        a5.f14601b = new C5104j(this);
        C5753b<BattleMvpContainerLayout> a6 = a5.mo11506b(C4953d.class, C5106k.f13278a).mo11506b(C4954e.class, C5107l.f13279a).mo11506b(C4950a.class, C5098d.f13270a).mo11505a();
        C89219l.m154716b(a6, "");
        this.f13213e = a6;
        View findViewById = findViewById(R.id.c5j);
        C89219l.m154716b(findViewById, "");
        this.f13215g = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.bxv);
        C89219l.m154716b(findViewById2, "");
        this.f13214f = (AppCompatImageView) findViewById2;
        if (f13200w) {
            i = R.id.bto;
        } else {
            i = R.id.btn;
        }
        View findViewById3 = findViewById(i);
        C89219l.m154716b(findViewById3, "");
        this.f13216h = (HSImageView) findViewById3;
        View findViewById4 = findViewById(R.id.btm);
        C89219l.m154716b(findViewById4, "");
        this.f13217i = (HSImageView) findViewById4;
        View findViewById5 = findViewById(R.id.bx6);
        C89219l.m154716b(findViewById5, "");
        this.f13218j = (HSImageView) findViewById5;
        View findViewById6 = findViewById(R.id.bz4);
        C89219l.m154716b(findViewById6, "");
        this.f13219k = (HSImageView) findViewById6;
        View findViewById7 = findViewById(R.id.fiv);
        C89219l.m154716b(findViewById7, "");
        this.f13206F = (MatchWinStreaksView) findViewById7;
        View findViewById8 = findViewById(R.id.fiw);
        C89219l.m154716b(findViewById8, "");
        this.f13207G = (MatchWinStreaksView) findViewById8;
        View findViewById9 = findViewById(R.id.d28);
        C89219l.m154716b(findViewById9, "");
        this.f13220l = findViewById9;
        View findViewById10 = findViewById(R.id.bx8);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById10;
        C89219l.m154716b(appCompatImageView, "");
        C5115t.m11336a(appCompatImageView);
        C89219l.m154716b(findViewById10, "");
        this.f13221m = appCompatImageView;
        View findViewById11 = findViewById(R.id.bz7);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById11;
        C89219l.m154716b(appCompatImageView2, "");
        C5115t.m11336a(appCompatImageView2);
        C89219l.m154716b(findViewById11, "");
        this.f13222n = appCompatImageView2;
        View findViewById12 = findViewById(R.id.c4n);
        C89219l.m154716b(findViewById12, "");
        MatchWinningStreaksIconView matchWinningStreaksIconView = (MatchWinningStreaksIconView) findViewById12;
        this.f13225q = matchWinningStreaksIconView;
        if (matchWinningStreaksIconView == null) {
            C89219l.m154710a("winningStreakIconLeft");
        }
        matchWinningStreaksIconView.setOnClicked(new C5118w(this));
        View findViewById13 = findViewById(R.id.c5z);
        C89219l.m154716b(findViewById13, "");
        MatchWinningStreaksIconView matchWinningStreaksIconView2 = (MatchWinningStreaksIconView) findViewById13;
        this.f13226r = matchWinningStreaksIconView2;
        if (matchWinningStreaksIconView2 == null) {
            C89219l.m154710a("winningStreakIconRight");
        }
        matchWinningStreaksIconView2.setOnClicked(new C5119x(this));
        View findViewById14 = findViewById(R.id.x3);
        C89219l.m154716b(findViewById14, "");
        this.f13223o = (LiveButton) findViewById14;
        View findViewById15 = findViewById(R.id.c3c);
        C89219l.m154716b(findViewById15, "");
        this.f13224p = findViewById15;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28312a((Object) this, C9041bg.class, (AbstractC89172b) new C5120y(this)).mo28312a((Object) this, C4959j.class, (AbstractC89172b) new C5121z(this)).mo28312a((Object) this, C4956g.class, (AbstractC89172b) new C5073aa(this));
        }
        mo10824b().mo10297a((C4971b.AbstractC4981b) this);
        LiveButton liveButton = this.f13223o;
        if (liveButton == null) {
            C89219l.m154710a("btnReMatch");
        }
        liveButton.setOnClickListener(new View$OnClickListenerC5074ab(this));
        AppCompatImageView appCompatImageView3 = this.f13214f;
        if (appCompatImageView3 == null) {
            C89219l.m154710a("ivMuteView");
        }
        appCompatImageView3.setOnClickListener(new View$OnClickListenerC5116u(this));
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4413d.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C5117v(this));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$g */
    static final class C5101g<V extends View> implements C5753b.AbstractC5757c {

        /* renamed from: a */
        public static final C5101g f13273a = new C5101g();

        static {
            Covode.recordClassIndex(5692);
        }

        C5101g() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5757c
        /* renamed from: a */
        public final /* synthetic */ void mo10557a(View view) {
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$t */
    static final class C5115t extends AbstractC89220m implements AbstractC89172b<AppCompatImageView, C89391z> {

        /* renamed from: a */
        public static final C5115t f13287a = new C5115t();

        static {
            Covode.recordClassIndex(5706);
        }

        C5115t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AppCompatImageView appCompatImageView) {
            m11336a(appCompatImageView);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m11336a(AppCompatImageView appCompatImageView) {
            float f;
            float f2;
            float f3;
            C89219l.m154721d(appCompatImageView, "");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            if (LinkBattleWidget.f13200w) {
                f = 70.0f;
                f2 = 76.0f;
                f3 = 10.0f;
            } else {
                f = 60.0f;
                f2 = 80.0f;
                f3 = 16.0f;
            }
            aVar.width = C3966y.m9653a(f);
            aVar.height = C3966y.m9653a(f2);
            aVar.bottomMargin = C3966y.m9653a(f3);
            appCompatImageView.setLayoutParams(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ab */
    static final class View$OnClickListenerC5074ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13232a;

        static {
            Covode.recordClassIndex(5665);
        }

        View$OnClickListenerC5074ab(LinkBattleWidget linkBattleWidget) {
            this.f13232a = linkBattleWidget;
        }

        public final void onClick(View view) {
            C5703b.m12478c();
            C5009a.m11218b();
            C4971b.m11167a(this.f13232a.mo10824b());
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ad */
    static final class DialogInterface$OnDismissListenerC5076ad implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC5076ad f13234a = new DialogInterface$OnDismissListenerC5076ad();

        static {
            Covode.recordClassIndex(5667);
        }

        DialogInterface$OnDismissListenerC5076ad() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C3854a.m9453a(4, "LinkPKWidgetTag", "openMvpDialog, Fragment on dismiss");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$as */
    public static final class DialogInterface$OnDismissListenerC5092as implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC5092as f13259a = new DialogInterface$OnDismissListenerC5092as();

        static {
            Covode.recordClassIndex(5683);
        }

        DialogInterface$OnDismissListenerC5092as() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C3854a.m9453a(4, "LinkPKWidgetTag", "openMvpDialog, Fragment on dismiss");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$j */
    static final class C5104j<V extends View> implements C5753b.AbstractC5757c {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13276a;

        static {
            Covode.recordClassIndex(5695);
        }

        C5104j(LinkBattleWidget linkBattleWidget) {
            this.f13276a = linkBattleWidget;
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5757c
        /* renamed from: a */
        public final /* synthetic */ void mo10557a(View view) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            C89219l.m154721d(battleMvpContainerLayout, "");
            battleMvpContainerLayout.setClickCallback(new AbstractC89172b<Boolean, C89391z>(this) {
                /* class com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.C5104j.C51051 */

                /* renamed from: a */
                final /* synthetic */ C5104j f13277a;

                static {
                    Covode.recordClassIndex(5696);
                }

                {
                    this.f13277a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Boolean bool) {
                    boolean z;
                    boolean z2;
                    String str;
                    boolean z3;
                    String queryParameter;
                    boolean booleanValue = bool.booleanValue();
                    LinkBattleWidget linkBattleWidget = this.f13277a.f13276a;
                    boolean z4 = false;
                    linkBattleWidget.f13229u = false;
                    String value = LiveInteractBattleContributeListUrlSetting.INSTANCE.getValue();
                    Uri.Builder a = linkBattleWidget.mo10818a(booleanValue, value);
                    String value2 = LiveBattleContributeListLynxUrlSetting.INSTANCE.getValue();
                    if (value2 == null || value2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C3854a.m9453a(4, "LinkPKWidgetTag", "openMvpDialog, lynxurl = ".concat(String.valueOf(value2)));
                        Uri.Builder a2 = linkBattleWidget.mo10818a(booleanValue, value2);
                        Uri parse = Uri.parse(a2.toString());
                        if (!(parse == null || (queryParameter = parse.getQueryParameter("fallback_url")) == null)) {
                            value = queryParameter;
                        }
                        Uri.Builder a3 = linkBattleWidget.mo10818a(booleanValue, value);
                        AbstractC2939m e = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createLynxDialogBuilder(a2.toString(), a3.toString()).mo7682a(LinkBattleWidget.m11285a(parse, "radius", 8), LinkBattleWidget.m11285a(parse, "radius", 8)).mo7687b(LinkBattleWidget.m11285a(parse, "height", 402)).mo7681a(LinkBattleWidget.m11285a(parse, "width", (int) C3966y.m9668e(C3966y.m9664c()))).mo7690c(LinkBattleWidget.m11285a(parse, "margin", 0)).mo7696e(80);
                        if (LinkBattleWidget.m11285a(parse, "show_close", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC2939m a4 = e.mo7695d(z2).mo7684a("link_battle");
                        if (parse == null || (str = parse.toString()) == null) {
                            str = "";
                        }
                        C89219l.m154716b(str, "");
                        AbstractC2939m c = a4.mo7691c(str);
                        if (LinkBattleWidget.m11285a(parse, "landscape_custom_height", 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC2939m a5 = c.mo7685a(z3).mo7683a(new C5077ae(linkBattleWidget, a3));
                        int a6 = LinkBattleWidget.m11285a(parse, "show_dim", -1);
                        if (a6 != -1) {
                            if (a6 == 1) {
                                z4 = true;
                            }
                            a5 = a5.mo7689b(z4);
                        }
                        C4031a a7 = a5.mo7686a();
                        a7.f11065d = DialogInterface$OnDismissListenerC5076ad.f13234a;
                        Context context = linkBattleWidget.context;
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                AbstractC2953a a8 = C6193a.m13435a(IHostApp.class);
                                C89219l.m154716b(a8, "");
                                context = ((IHostApp) a8).getTopActivity();
                            }
                            ActivityC0945e b = C3888a.m9506b(context);
                            if (b != null) {
                                C4031a.m9839a(b, a7);
                            }
                        }
                    } else {
                        C3854a.m9453a(4, "LinkPKWidgetTag", "openMvpDialog, url = ".concat(String.valueOf(value)));
                        String builder = a.toString();
                        C89219l.m154716b(builder, "");
                        linkBattleWidget.mo10827c(builder);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ MatchWinningStreaksIconView m11288b(LinkBattleWidget linkBattleWidget) {
        MatchWinningStreaksIconView matchWinningStreaksIconView = linkBattleWidget.f13226r;
        if (matchWinningStreaksIconView == null) {
            C89219l.m154710a("winningStreakIconRight");
        }
        return matchWinningStreaksIconView;
    }

    /* renamed from: c */
    public static final /* synthetic */ LiveButton m11290c(LinkBattleWidget linkBattleWidget) {
        LiveButton liveButton = linkBattleWidget.f13223o;
        if (liveButton == null) {
            C89219l.m154710a("btnReMatch");
        }
        return liveButton;
    }

    /* renamed from: d */
    public static final /* synthetic */ AppCompatImageView m11291d(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.f13221m;
        if (appCompatImageView == null) {
            C89219l.m154710a("ivLeftResult");
        }
        return appCompatImageView;
    }

    /* renamed from: e */
    public static final /* synthetic */ AppCompatImageView m11292e(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.f13222n;
        if (appCompatImageView == null) {
            C89219l.m154710a("ivRightResult");
        }
        return appCompatImageView;
    }

    /* renamed from: f */
    public static final /* synthetic */ HSImageView m11293f(LinkBattleWidget linkBattleWidget) {
        HSImageView hSImageView = linkBattleWidget.f13217i;
        if (hSImageView == null) {
            C89219l.m154710a("ivCenterAnimation2");
        }
        return hSImageView;
    }

    /* renamed from: g */
    public static final /* synthetic */ HSImageView m11295g(LinkBattleWidget linkBattleWidget) {
        HSImageView hSImageView = linkBattleWidget.f13216h;
        if (hSImageView == null) {
            C89219l.m154710a("ivCenterAnimation");
        }
        return hSImageView;
    }

    /* renamed from: h */
    public static final /* synthetic */ View m11296h(LinkBattleWidget linkBattleWidget) {
        View view = linkBattleWidget.f13220l;
        if (view == null) {
            C89219l.m154710a("imgPKBgView");
        }
        return view;
    }

    /* renamed from: i */
    public static final /* synthetic */ AppCompatImageView m11297i(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.f13214f;
        if (appCompatImageView == null) {
            C89219l.m154710a("ivMuteView");
        }
        return appCompatImageView;
    }

    /* renamed from: j */
    public static final /* synthetic */ LinearLayout m11298j(LinkBattleWidget linkBattleWidget) {
        LinearLayout linearLayout = linkBattleWidget.f13215g;
        if (linearLayout == null) {
            C89219l.m154710a("profileLayout");
        }
        return linearLayout;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$w */
    static final class C5118w extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13290a;

        static {
            Covode.recordClassIndex(5709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5118w(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.f13290a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f13290a.mo10825b(str2);
            C5703b.m12468a(this.f13290a.f13294A, LinkBattleWidget.m11286a(this.f13290a).getInfo());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$x */
    static final class C5119x extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13291a;

        static {
            Covode.recordClassIndex(5710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5119x(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.f13291a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            this.f13291a.mo10825b(str2);
            C5703b.m12468a(this.f13291a.f13294A, LinkBattleWidget.m11288b(this.f13291a).getInfo());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkBattleWidget(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ MatchWinningStreaksIconView m11286a(LinkBattleWidget linkBattleWidget) {
        MatchWinningStreaksIconView matchWinningStreaksIconView = linkBattleWidget.f13225q;
        if (matchWinningStreaksIconView == null) {
            C89219l.m154710a("winningStreakIconLeft");
        }
        return matchWinningStreaksIconView;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ae */
    static final class C5077ae implements AbstractC2928f.AbstractC2929a {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13235a;

        /* renamed from: b */
        final /* synthetic */ Uri.Builder f13236b;

        static {
            Covode.recordClassIndex(5668);
        }

        C5077ae(LinkBattleWidget linkBattleWidget, Uri.Builder builder) {
            this.f13235a = linkBattleWidget;
            this.f13236b = builder;
        }

        @Override // com.bytedance.android.live.p176b.AbstractC2928f.AbstractC2929a
        /* renamed from: a */
        public final void mo7664a(String str) {
            C3854a.m9453a(4, "LinkPKWidgetTag", "openMvpDialog, fallback lynx to webview");
            if (!this.f13235a.f13229u) {
                LinkBattleWidget linkBattleWidget = this.f13235a;
                if (str == null) {
                    str = this.f13236b.toString();
                    C89219l.m154716b(str, "");
                }
                linkBattleWidget.mo10827c(str);
                this.f13235a.f13229u = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$av */
    public static final class C5095av implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13265a;

        /* renamed from: b */
        final /* synthetic */ ConstraintLayout f13266b;

        static {
            Covode.recordClassIndex(5686);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            this.f13265a.f13230v = false;
            LinkBattleWidget.m11297i(this.f13265a).setVisibility(8);
            LinkBattleWidget.m11298j(this.f13265a).setVisibility(8);
            LinkBattleWidget.m11288b(this.f13265a).setVisibility(8);
            LinkBattleWidget.m11286a(this.f13265a).setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f13265a.f13230v = true;
            ConstraintLayout constraintLayout = this.f13266b;
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            if (this.f13265a.f13294A) {
                LinkBattleWidget.m11297i(this.f13265a).setVisibility(0);
            } else if (this.f13265a.f13295y.f11942ae) {
                LinkBattleWidget.m11297i(this.f13265a).setVisibility(0);
            }
            LinkBattleWidget.m11298j(this.f13265a).setVisibility(0);
            LinkBattleWidget.m11288b(this.f13265a).setVisibility(0);
            LinkBattleWidget.m11286a(this.f13265a).setVisibility(0);
        }

        C5095av(LinkBattleWidget linkBattleWidget, ConstraintLayout constraintLayout) {
            this.f13265a = linkBattleWidget;
            this.f13266b = constraintLayout;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$v */
    static final class C5117v<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13289a;

        static {
            Covode.recordClassIndex(5708);
        }

        C5117v(LinkBattleWidget linkBattleWidget) {
            this.f13289a = linkBattleWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (TextUtils.equals(((C4413d) obj).f12004a, C4413d.f12001d) && this.f13289a.f13294A && LinkBattleWidget.m11290c(this.f13289a).getVisibility() == 0 && LinkBattleWidget.m11290c(this.f13289a).isEnabled()) {
                C5703b.m12478c();
                C5009a.m11218b();
                C4971b.m11167a(this.f13289a.mo10824b());
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.p295b.p303g.C4971b.AbstractC4981b
    /* renamed from: b */
    public final void mo10704b(Throwable th) {
        if (!(th instanceof C2912a) || ((C2908a) th).getErrorCode() != 4004049) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gkv);
        } else {
            C4971b.m11168a(mo10824b(), 108, true);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$aa */
    static final class C5073aa extends AbstractC89220m implements AbstractC89172b<EnumC4949c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13231a;

        static {
            Covode.recordClassIndex(5664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5073aa(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.f13231a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC4949c cVar) {
            EnumC4949c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C3854a.m9453a(4, "LinkPKWidgetTag", "onChanged, current  state = ".concat(String.valueOf(cVar2)));
            if (C5122a.f13297a[cVar2.ordinal()] != 1) {
                LinkBattleWidget.m11290c(this.f13231a).mo9603b(R.style.sq);
                LinkBattleWidget.m11290c(this.f13231a).setEnabled(false);
            } else {
                LinkBattleWidget.m11290c(this.f13231a).mo9603b(R.style.sw);
                LinkBattleWidget.m11290c(this.f13231a).setEnabled(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$c */
    static final class C5097c<V extends View> implements C5753b.AbstractC5757c {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13269a;

        static {
            Covode.recordClassIndex(5688);
        }

        C5097c(LinkBattleWidget linkBattleWidget) {
            this.f13269a = linkBattleWidget;
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5757c
        /* renamed from: a */
        public final /* synthetic */ void mo10557a(View view) {
            Long l;
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            C89219l.m154721d(battleHealthBar, "");
            Object obj = null;
            battleHealthBar.setLayerType(1, null);
            DataChannel dataChannel = this.f13269a.dataChannel;
            C4384b bVar = this.f13269a.f13295y;
            boolean z = this.f13269a.f13294A;
            battleHealthBar.f13080c = bVar;
            battleHealthBar.f13081d = z;
            battleHealthBar.f13082e = dataChannel;
            DataChannel dataChannel2 = battleHealthBar.f13082e;
            if (dataChannel2 != null) {
                dataChannel2.mo28310a(C4960k.class, (AbstractC89172b) new BattleHealthBar.C5034c(battleHealthBar)).mo28310a(C4959j.class, (AbstractC89172b) new BattleHealthBar.C5035d(battleHealthBar));
            }
            DataChannel dataChannel3 = battleHealthBar.f13082e;
            if (dataChannel3 != null) {
                obj = dataChannel3.mo28318b(C4959j.class);
            }
            if (obj == EnumC4949c.PUNISH) {
                battleHealthBar.mo10745b();
                return;
            }
            DataChannel dataChannel4 = battleHealthBar.f13082e;
            if (dataChannel4 != null && (l = (Long) dataChannel4.mo28318b(C4960k.class)) != null) {
                long longValue = l.longValue();
                if (longValue != 0 && longValue < LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue()) {
                    battleHealthBar.mo10745b();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$u */
    static final class View$OnClickListenerC5116u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13288a;

        static {
            Covode.recordClassIndex(5707);
        }

        View$OnClickListenerC5116u(LinkBattleWidget linkBattleWidget) {
            this.f13288a = linkBattleWidget;
        }

        public final void onClick(View view) {
            if (this.f13288a.f13294A) {
                boolean z = !this.f13288a.f13295y.f11942ae;
                DataChannel dataChannel = this.f13288a.dataChannel;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C4952c.class, Boolean.valueOf(z));
                }
                HashMap hashMap = new HashMap();
                C5703b.m12466a(hashMap);
                C5703b.m12470a(true, false, (Map<String, String>) hashMap);
                hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
                C5703b.m12465a("livesdk_pk_mute_button_click", hashMap);
                return;
            }
            this.f13288a.mo10826c();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$y */
    static final class C5120y extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13292a;

        static {
            Covode.recordClassIndex(5711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5120y(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.f13292a = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            EnumC4949c a = C4947a.f12909a.mo10672a();
            if (a == EnumC4949c.INVITED || a == EnumC4949c.START) {
                C5703b.m12461a(C5703b.EnumC5705b.PK_GUIDE, false);
            }
            if (a == EnumC4949c.INVITED) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eb0);
            } else if (EnumC4949c.START.compareTo((Enum) a) > 0 || a.compareTo((Enum) EnumC4949c.END) >= 0) {
                this.f13292a.mo10820a(C5703b.EnumC5705b.PK_GUIDE);
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e90);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo10827c(String str) {
        AbstractC6956d webViewManager;
        C4031a a;
        AbstractC6956d.C6958b a2 = AbstractC6963e.m14871a(str).mo13259a(8, 8, 0, 0);
        a2.f17407k = -1;
        a2.f17416t = true;
        a2.f17399c = 402;
        a2.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
        a2.f17406j = 80;
        a2.f17390D = "link_battle";
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a = webViewManager.mo13245a(a2)) != null && (this.context instanceof ActivityC0945e)) {
            a.f11065d = DialogInterface$OnDismissListenerC5092as.f13259a;
            C4031a.m9839a(C11279p.m20001a(this.context), a);
        }
    }

    /* renamed from: b */
    public final void mo10825b(String str) {
        if (this.context != null) {
            AbstractC8241e createHybridDialog = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).createHybridDialog(new PopupConfig(Uri.parse(str)));
            if (!(this.context instanceof Activity)) {
                AbstractC2953a a = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a, "");
                this.context = ((IHostApp) a).getTopActivity();
            }
            ActivityC0945e b = C3888a.m9506b(this.context);
            if (b != null) {
                mo10829e();
                createHybridDialog.mo14591a(b);
                this.f13204D = createHybridDialog;
            }
        }
    }

    /* renamed from: a */
    public final void mo10820a(C5703b.EnumC5705b bVar) {
        C6805b<Boolean> bVar2 = AbstractC6804a.f16972bU;
        C89219l.m154716b(bVar2, "");
        Boolean a = bVar2.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            mo10824b().mo10695a(false, bVar);
            C5703b.m12461a(bVar, true);
            C4384b.C4385a.m10496a().f11947aj = bVar.getValue();
            return;
        }
        Context context = this.context;
        C89219l.m154716b(context, "");
        DialogC5019a aVar = new DialogC5019a(context);
        this.f13209a = aVar;
        aVar.mo10727a(bVar);
        DialogC5019a aVar2 = this.f13209a;
        if (aVar2 != null) {
            aVar2.f13053a = new C5096b(this, bVar);
        }
        DialogC5019a aVar3 = this.f13209a;
        if (aVar3 != null) {
            aVar3.show();
        }
        C6805b<Boolean> bVar3 = AbstractC6804a.f16972bU;
        C89219l.m154716b(bVar3, "");
        C6806c.m14603a((C6800c) bVar3, (Object) true);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ap */
    static final class C5089ap implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f13253a;

        static {
            Covode.recordClassIndex(5680);
        }

        C5089ap(C89233z.C89238e eVar) {
            this.f13253a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f13253a.element = (T) Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$ao */
    static final class DialogInterface$OnClickListenerC5088ao implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f13252a;

        static {
            Covode.recordClassIndex(5679);
        }

        DialogInterface$OnClickListenerC5088ao(C89233z.C89238e eVar) {
            this.f13252a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6805b<Boolean> bVar = AbstractC6804a.f17028cb;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, this.f13252a.element);
            T t = this.f13252a.element;
            C89219l.m154716b(t, "");
            C5703b.m12469a(t.booleanValue(), false);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$e */
    static final class C5099e<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5099e f13271a = new C5099e();

        static {
            Covode.recordClassIndex(5690);
        }

        C5099e() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            int intValue = ((Number) obj).intValue();
            C89219l.m154721d(battleHealthBar, "");
            if (battleHealthBar.getLeftValue() != intValue) {
                battleHealthBar.setLeftValue(intValue);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$f */
    static final class C5100f<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5100f f13272a = new C5100f();

        static {
            Covode.recordClassIndex(5691);
        }

        C5100f() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            int intValue = ((Number) obj).intValue();
            C89219l.m154721d(battleHealthBar, "");
            if (battleHealthBar.getRightValue() != intValue) {
                battleHealthBar.setRightValue(intValue);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$k */
    static final class C5106k<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5106k f13278a = new C5106k();

        static {
            Covode.recordClassIndex(5697);
        }

        C5106k() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            List<C9646k> list = (List) obj;
            C89219l.m154721d(battleMvpContainerLayout, "");
            C89219l.m154721d(list, "");
            battleMvpContainerLayout.mo10762a(true, list);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$l */
    static final class C5107l<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5107l f13279a = new C5107l();

        static {
            Covode.recordClassIndex(5698);
        }

        C5107l() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            List<C9646k> list = (List) obj;
            C89219l.m154721d(battleMvpContainerLayout, "");
            C89219l.m154721d(list, "");
            battleMvpContainerLayout.mo10762a(false, list);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$an */
    static final class DialogInterface$OnClickListenerC5087an implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkBattleWidget f13250a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f13251b;

        static {
            Covode.recordClassIndex(5678);
        }

        DialogInterface$OnClickListenerC5087an(LinkBattleWidget linkBattleWidget, C89233z.C89238e eVar) {
            this.f13250a = linkBattleWidget;
            this.f13251b = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6805b<Boolean> bVar = AbstractC6804a.f17028cb;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, this.f13251b.element);
            this.f13250a.mo10824b().mo10697d();
            T t = this.f13251b.element;
            C89219l.m154716b(t, "");
            C5703b.m12469a(t.booleanValue(), true);
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        C89219l.m154721d(bVar, "");
        C4947a.f12909a.f12924m = false;
        mo10823a(false);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$d */
    static final class C5098d<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5098d f13270a = new C5098d();

        static {
            Covode.recordClassIndex(5689);
        }

        C5098d() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            BattleMvpContainerLayout.C5043b bVar;
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C89219l.m154721d(battleMvpContainerLayout, "");
            BattleMvpContainerLayout.C5043b bVar2 = battleMvpContainerLayout.f13105c;
            if (bVar2 != null) {
                bVar2.mo10770a(false);
            }
            if (booleanValue) {
                bVar = (BattleMvpContainerLayout.C5043b) C89070n.m154583g((List) battleMvpContainerLayout.f13106d);
            } else {
                bVar = (BattleMvpContainerLayout.C5043b) C89070n.m154583g((List) battleMvpContainerLayout.f13107e);
            }
            battleMvpContainerLayout.f13105c = bVar;
            BattleMvpContainerLayout.C5043b bVar3 = battleMvpContainerLayout.f13105c;
            if (bVar3 != null && !bVar3.f13114a) {
                if (BattleMvpContainerLayout.f13101f) {
                    battleMvpContainerLayout.postDelayed(new BattleMvpContainerLayout.RunnableC5045d(battleMvpContainerLayout), 3800);
                    return;
                }
                BattleMvpContainerLayout.C5043b bVar4 = battleMvpContainerLayout.f13105c;
                if (bVar4 != null) {
                    bVar4.mo10770a(true);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$i */
    static final class C5103i<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5103i f13275a = new C5103i();

        static {
            Covode.recordClassIndex(5694);
        }

        C5103i() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
            long longValue = ((Number) obj).longValue();
            C89219l.m154721d(linkCrossTitleLayout, "");
            ConstraintLayout constraintLayout = (ConstraintLayout) linkCrossTitleLayout.mo10494a(R.id.c3_);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) linkCrossTitleLayout.mo10494a(R.id.c3a);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
            HSImageView hSImageView = (HSImageView) linkCrossTitleLayout.mo10494a(R.id.bws);
            C89219l.m154716b(hSImageView, "");
            hSImageView.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f15);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(C11225an.m19880b(longValue));
        }
    }

    /* renamed from: a */
    private static void m11287a(HSImageView hSImageView, AbstractC89171a<C89391z> aVar) {
        hSImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = C3966y.m9653a(f13196K);
        layoutParams2.height = C3966y.m9653a(f13197L);
        if (f13200w) {
            layoutParams2.bottomMargin = C3966y.m9653a(21.0f);
        } else {
            layoutParams2.bottomMargin = C3966y.m9653a(0.0f);
        }
        hSImageView.setLayoutParams(layoutParams2);
        Runnable auVar = new RunnableC5094au(hSImageView, aVar);
        C5746d.m12615a(hSImageView, C4962b.m11162a().getBattleWin(), new C5093at(hSImageView, auVar, aVar));
        hSImageView.postDelayed(auVar, f13194I);
    }

    /* renamed from: b */
    private static void m11289b(HSImageView hSImageView, AbstractC89171a<C89391z> aVar) {
        hSImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = C3966y.m9653a(f13198M);
        layoutParams2.height = C3966y.m9653a(f13199N);
        if (f13200w) {
            layoutParams2.bottomMargin = C3966y.m9653a(21.0f);
        } else {
            layoutParams2.bottomMargin = C3966y.m9653a(0.0f);
        }
        hSImageView.setLayoutParams(layoutParams2);
        Runnable arVar = new RunnableC5091ar(hSImageView, aVar);
        C5746d.m12615a(hSImageView, C4962b.m11162a().getBattleLose(), new C5090aq(hSImageView, arVar, aVar));
        hSImageView.postDelayed(arVar, f13194I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri.Builder mo10818a(boolean z, String str) {
        long j;
        if (z) {
            Room room = this.f13296z;
            C89219l.m154716b(room, "");
            j = room.getOwnerUserId();
        } else {
            j = this.f13295y.f11958f;
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("channel_id", String.valueOf(C4947a.f12909a.mo10679c()));
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(j));
        buildUpon.appendQueryParameter("is_anchor", String.valueOf(this.f13294A ? 1 : 0));
        buildUpon.appendQueryParameter("user_id", String.valueOf(c));
        buildUpon.appendQueryParameter("height", "402");
        buildUpon.appendQueryParameter("battle_id", String.valueOf(C4947a.f12909a.mo10677b()));
        C89219l.m154716b(buildUpon, "");
        return buildUpon;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget$h */
    static final class C5102h<V extends View, T> implements C5753b.AbstractC5756b {

        /* renamed from: a */
        public static final C5102h f13274a = new C5102h();

        static {
            Covode.recordClassIndex(5693);
        }

        C5102h() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.C5753b.AbstractC5756b
        /* renamed from: a */
        public final /* synthetic */ void mo10550a(View view, Object obj) {
            LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
            long longValue = ((Number) obj).longValue();
            C89219l.m154721d(linkCrossTitleLayout, "");
            ConstraintLayout constraintLayout = (ConstraintLayout) linkCrossTitleLayout.mo10494a(R.id.c3_);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) linkCrossTitleLayout.mo10494a(R.id.c3a);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            HSImageView hSImageView = (HSImageView) linkCrossTitleLayout.mo10494a(R.id.bws);
            C89219l.m154716b(hSImageView, "");
            hSImageView.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setAlpha(1.0f);
            long value = LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue();
            if (longValue <= value) {
                ((LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14)).setTextColor(C0643b.m2378c(linkCrossTitleLayout.getContext(), R.color.md));
                float f = ((((float) (value - longValue)) / ((float) value)) * 6.0f) + 14.0f;
                LiveTextView liveTextView2 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView2, "");
                liveTextView2.setTextSize(f);
                ((LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14)).setTextSize(0, (float) C3966y.m9653a(f));
                LiveTextView liveTextView3 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView3, "");
                liveTextView3.setGravity(17);
                LiveTextView liveTextView4 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView4, "");
                liveTextView4.setText(String.valueOf(longValue));
                ((LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14)).setTextSize(0, (float) C3966y.m9653a(19.0f));
                if (longValue == 10) {
                    try {
                        Object a = LinkCrossTitleLayout.m10904a(linkCrossTitleLayout.getContext(), "vibrator");
                        if (a != null) {
                            ((Vibrator) a).vibrate(50);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                        }
                    } catch (Exception unused) {
                    }
                }
                LiveTextView liveTextView5 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView5, "");
                LinkCrossTitleLayout.C4778b bVar = new LinkCrossTitleLayout.C4778b(linkCrossTitleLayout);
                LinkCrossTitleLayout.C4779c cVar = new LinkCrossTitleLayout.C4779c(liveTextView5);
                LinkCrossTitleLayout.C4780d dVar = new LinkCrossTitleLayout.C4780d(liveTextView5);
                LinkCrossTitleLayout.C4781e eVar = new LinkCrossTitleLayout.C4781e(cVar);
                LinkCrossTitleLayout.C4782f fVar = new LinkCrossTitleLayout.C4782f(cVar);
                LinkCrossTitleLayout.C4783g gVar = new LinkCrossTitleLayout.C4783g(dVar);
                LinkCrossTitleLayout.C4784h hVar = new LinkCrossTitleLayout.C4784h(dVar);
                LinkCrossTitleLayout.C4785i iVar = new LinkCrossTitleLayout.C4785i(linkCrossTitleLayout, bVar, eVar, gVar);
                LinkCrossTitleLayout.C4786j jVar = new LinkCrossTitleLayout.C4786j(linkCrossTitleLayout, bVar, fVar, hVar);
                if (longValue == 0) {
                    iVar.mo10504a();
                } else {
                    jVar.mo10505a();
                }
            } else {
                ((LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14)).setTextColor(C0643b.m2378c(linkCrossTitleLayout.getContext(), R.color.vx));
                ((LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14)).setTextSize(0, (float) C3966y.m9653a(14.0f));
                LiveTextView liveTextView6 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView6, "");
                liveTextView6.setGravity(17);
                LiveTextView liveTextView7 = (LiveTextView) linkCrossTitleLayout.mo10494a(R.id.f14);
                C89219l.m154716b(liveTextView7, "");
                liveTextView7.setText(C11225an.m19880b(longValue));
            }
        }
    }

    /* renamed from: a */
    static int m11285a(Uri uri, String str, int i) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i;
        }
        return Integer.parseInt(queryParameter);
    }

    /* renamed from: a */
    public final void mo10819a(int i, boolean z, AbstractC89171a<C89391z> aVar) {
        C5703b.EnumC5704a aVar2;
        C5703b.EnumC5704a aVar3;
        EnumC4949c a = C4947a.f12909a.mo10672a();
        if (a == EnumC4949c.INVITED) {
            mo10824b().mo10691a(new C5108m(aVar));
        } else if (EnumC4949c.START.compareTo((Enum) a) <= 0 && a.compareTo((Enum) EnumC4949c.FINISH) < 0) {
            if (this.f13294A) {
                if (C4384b.C4385a.m10496a().f11927Q) {
                    aVar3 = C5703b.EnumC5704a.POSITIVE_OVER;
                } else {
                    aVar3 = C5703b.EnumC5704a.NEGATIVE_OVER;
                }
                C5703b.m12460a(aVar3);
            }
            mo10824b().mo10688a(i, true, z, new C5109n(aVar));
        } else if (EnumC4949c.PUNISH.compareTo((Enum) a) <= 0 && a.compareTo((Enum) EnumC4949c.END) < 0) {
            if (C4384b.C4385a.m10496a().f11927Q) {
                aVar2 = C5703b.EnumC5704a.POSITIVE_OVER;
            } else {
                aVar2 = C5703b.EnumC5704a.NEGATIVE_OVER;
            }
            C5703b.m12472b(aVar2);
            mo10824b().mo10687a(i, true, (AbstractC89171a<C89391z>) new C5110o(aVar));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
