package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.match.p295b.p299d.C4962b;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5746d;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.model.message.p578b.C9631a;
import com.bytedance.android.livesdk.model.message.p578b.C9649m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar */
public final class BattleHealthBar extends FrameLayout {

    /* renamed from: f */
    public static final C5033b f13077f = new C5033b((byte) 0);

    /* renamed from: a */
    float f13078a;

    /* renamed from: b */
    public EnumC5032a f13079b;

    /* renamed from: c */
    public C4384b f13080c;

    /* renamed from: d */
    public boolean f13081d;

    /* renamed from: e */
    public DataChannel f13082e;

    /* renamed from: g */
    private ValueAnimator f13083g;

    /* renamed from: h */
    private ValueAnimator f13084h;

    /* renamed from: i */
    private float f13085i;

    /* renamed from: j */
    private int f13086j;

    /* renamed from: k */
    private int f13087k;

    /* renamed from: l */
    private boolean f13088l;

    /* renamed from: m */
    private HashMap f13089m;

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$a */
    public enum EnumC5032a {
        MIDDLE,
        WEAK,
        STRONG,
        EMOJI;

        static {
            Covode.recordClassIndex(5617);
        }
    }

    static {
        Covode.recordClassIndex(5614);
    }

    public BattleHealthBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo10742a(int i) {
        if (this.f13089m == null) {
            this.f13089m = new HashMap();
        }
        View view = (View) this.f13089m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13089m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$b */
    public static final class C5033b {
        static {
            Covode.recordClassIndex(5618);
        }

        private C5033b() {
        }

        public /* synthetic */ C5033b(byte b) {
            this();
        }
    }

    public final DataChannel getDataChannel() {
        return this.f13082e;
    }

    public final C4384b getDataHolder() {
        return this.f13080c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10744a(float f) {
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.d2_);
        ViewGroup.LayoutParams layoutParams = hSImageView != null ? hSImageView.getLayoutParams() : null;
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 83;
        layoutParams2.leftMargin = (int) (((f * (((float) getWidth()) - (((PKProgressBar) mo10742a(R.id.ffq)).getStartSpacing() * 2.0f))) + ((PKProgressBar) mo10742a(R.id.ffq)).getStartSpacing()) - ((float) (C3966y.m9653a(this.f13085i) / 2)));
        HSImageView hSImageView2 = (HSImageView) mo10742a(R.id.d2_);
        if (hSImageView2 != null) {
            hSImageView2.setLayoutParams(layoutParams2);
        }
        m11250a(layoutParams2);
    }

    private final int getAbsDiffScore() {
        return Math.abs(this.f13086j - this.f13087k);
    }

    public final View getLeftTextView() {
        LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.c8b);
        C89219l.m154716b(liveTextView, "");
        return liveTextView;
    }

    public final View getRightTextView() {
        LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.dkl);
        C89219l.m154716b(liveTextView, "");
        return liveTextView;
    }

    public final int getLeftValue() {
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar != null) {
            return pKProgressBar.getLeftValue();
        }
        return 0;
    }

    public final int getRightValue() {
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar != null) {
            return pKProgressBar.getRightValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$h */
    public static final class RunnableC5039h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13099a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f13100b;

        static {
            Covode.recordClassIndex(5624);
        }

        RunnableC5039h(BattleHealthBar battleHealthBar, FrameLayout.LayoutParams layoutParams) {
            this.f13099a = battleHealthBar;
            this.f13100b = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LiveTextView liveTextView = (LiveTextView) this.f13099a.mo10742a(R.id.al7);
            if (liveTextView != null) {
                layoutParams = liveTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = this.f13100b.leftMargin + this.f13100b.width + C3966y.m9653a(8.0f);
            LiveTextView liveTextView2 = (LiveTextView) this.f13099a.mo10742a(R.id.al7);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: e */
    private final void m11255e() {
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView, "");
        C5746d.m12615a(hSImageView, C4962b.m11162a().getBattleScoreWeak(), null);
        m11248a(50.0f, 33.0f, 0.0f, 4.0f);
        m11252b(50.0f);
        this.f13079b = EnumC5032a.WEAK;
    }

    /* renamed from: f */
    private final void m11256f() {
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView, "");
        C5746d.m12615a(hSImageView, C4962b.m11162a().getBattleScoreStrong(), null);
        m11248a(50.0f, 28.0f, 3.0f, 0.0f);
        m11252b(50.0f);
        this.f13079b = EnumC5032a.STRONG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$g */
    public static final class RunnableC5038g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13097a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f13098b;

        static {
            Covode.recordClassIndex(5623);
        }

        RunnableC5038g(BattleHealthBar battleHealthBar, FrameLayout.LayoutParams layoutParams) {
            this.f13097a = battleHealthBar;
            this.f13098b = layoutParams;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            LiveTextView liveTextView = (LiveTextView) this.f13097a.mo10742a(R.id.al6);
            if (liveTextView != null) {
                layoutParams = liveTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int a = this.f13098b.leftMargin - C3966y.m9653a(8.0f);
            LiveTextView liveTextView2 = (LiveTextView) this.f13097a.mo10742a(R.id.al6);
            C89219l.m154716b(liveTextView2, "");
            layoutParams2.leftMargin = a - liveTextView2.getWidth();
            LiveTextView liveTextView3 = (LiveTextView) this.f13097a.mo10742a(R.id.al6);
            C89219l.m154716b(liveTextView3, "");
            liveTextView3.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: c */
    private final boolean m11253c() {
        C9631a aVar;
        int i;
        C9649m mVar;
        boolean z;
        if (C4947a.f12909a.f12929r == null || (aVar = C4947a.f12909a.f12929r) == null || (i = aVar.f23475a) <= 0) {
            return false;
        }
        C9631a aVar2 = C4947a.f12909a.f12929r;
        if (aVar2 != null && (mVar = aVar2.f23478d) != null) {
            if (!mVar.f23510a || !this.f13081d) {
                z = false;
            } else {
                z = true;
            }
            if ((this.f13086j >= i || this.f13087k >= i) && !z && !C4947a.f12909a.f12930s) {
                return true;
            }
            return false;
        } else if (this.f13086j >= i || this.f13087k >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo10745b() {
        String battleScoreTongue;
        float f = this.f13078a;
        if (f < 0.25f) {
            battleScoreTongue = C4962b.m11162a().getBattleScoreCry();
        } else if (f < 0.5f) {
            battleScoreTongue = C4962b.m11162a().getBattleScoreStrive();
        } else if (f == 0.5f) {
            battleScoreTongue = C4962b.m11162a().getBattleScoreStrive();
        } else if (f < 0.75f) {
            battleScoreTongue = C4962b.m11162a().getBattleScoreClap();
        } else {
            battleScoreTongue = C4962b.m11162a().getBattleScoreTongue();
        }
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView, "");
        C5746d.m12615a(hSImageView, battleScoreTongue, null);
        m11248a(28.0f, 28.0f, 0.0f, 0.0f);
        m11252b(28.0f);
        this.f13079b = EnumC5032a.EMOJI;
        mo10744a(this.f13078a);
        HSImageView hSImageView2 = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView2, "");
        hSImageView2.setScaleX(1.0f);
        HSImageView hSImageView3 = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView3, "");
        hSImageView3.setVisibility(0);
        HSImageView hSImageView4 = (HSImageView) mo10742a(R.id.ck4);
        C89219l.m154716b(hSImageView4, "");
        hSImageView4.setVisibility(8);
    }

    /* renamed from: d */
    private final void m11254d() {
        int i;
        String str;
        if (C4947a.f12909a.f12929r != null) {
            if (!m11253c()) {
                LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.al7);
                C89219l.m154716b(liveTextView, "");
                liveTextView.setVisibility(8);
                LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.al6);
                C89219l.m154716b(liveTextView2, "");
                liveTextView2.setVisibility(8);
                LiveTextView liveTextView3 = (LiveTextView) mo10742a(R.id.c8b);
                C89219l.m154716b(liveTextView3, "");
                liveTextView3.setVisibility(0);
                LiveTextView liveTextView4 = (LiveTextView) mo10742a(R.id.dkl);
                C89219l.m154716b(liveTextView4, "");
                liveTextView4.setVisibility(0);
            } else if (this.f13086j == this.f13087k) {
                LiveTextView liveTextView5 = (LiveTextView) mo10742a(R.id.al7);
                C89219l.m154716b(liveTextView5, "");
                liveTextView5.setVisibility(8);
                LiveTextView liveTextView6 = (LiveTextView) mo10742a(R.id.al6);
                C89219l.m154716b(liveTextView6, "");
                liveTextView6.setVisibility(8);
                LiveTextView liveTextView7 = (LiveTextView) mo10742a(R.id.c8b);
                C89219l.m154716b(liveTextView7, "");
                liveTextView7.setVisibility(8);
                LiveTextView liveTextView8 = (LiveTextView) mo10742a(R.id.dkl);
                C89219l.m154716b(liveTextView8, "");
                liveTextView8.setVisibility(8);
            } else {
                C9631a aVar = C4947a.f12909a.f12929r;
                if (aVar != null) {
                    i = aVar.f23476b;
                } else {
                    i = 0;
                }
                C9631a aVar2 = C4947a.f12909a.f12929r;
                if (aVar2 == null || (str = aVar2.f23477c) == null) {
                    str = "";
                }
                int i2 = this.f13086j;
                int i3 = this.f13087k;
                if (i2 < i3) {
                    LiveTextView liveTextView9 = (LiveTextView) mo10742a(R.id.al7);
                    C89219l.m154716b(liveTextView9, "");
                    liveTextView9.setVisibility(0);
                    if (getAbsDiffScore() >= i) {
                        LiveTextView liveTextView10 = (LiveTextView) mo10742a(R.id.al7);
                        C89219l.m154716b(liveTextView10, "");
                        liveTextView10.setText(C3966y.m9660a((int) R.string.edc, str));
                    } else {
                        LiveTextView liveTextView11 = (LiveTextView) mo10742a(R.id.al7);
                        C89219l.m154716b(liveTextView11, "");
                        liveTextView11.setText(C3966y.m9660a((int) R.string.edc, String.valueOf(getAbsDiffScore())));
                    }
                    LiveTextView liveTextView12 = (LiveTextView) mo10742a(R.id.al6);
                    C89219l.m154716b(liveTextView12, "");
                    liveTextView12.setVisibility(8);
                } else if (i2 > i3) {
                    LiveTextView liveTextView13 = (LiveTextView) mo10742a(R.id.al7);
                    C89219l.m154716b(liveTextView13, "");
                    liveTextView13.setVisibility(8);
                    LiveTextView liveTextView14 = (LiveTextView) mo10742a(R.id.al6);
                    C89219l.m154716b(liveTextView14, "");
                    liveTextView14.setVisibility(0);
                    if (getAbsDiffScore() >= i) {
                        LiveTextView liveTextView15 = (LiveTextView) mo10742a(R.id.al6);
                        C89219l.m154716b(liveTextView15, "");
                        liveTextView15.setText(C3966y.m9660a((int) R.string.edb, str));
                    } else {
                        LiveTextView liveTextView16 = (LiveTextView) mo10742a(R.id.al6);
                        C89219l.m154716b(liveTextView16, "");
                        liveTextView16.setText(C3966y.m9660a((int) R.string.edb, String.valueOf(getAbsDiffScore())));
                    }
                } else {
                    return;
                }
                LiveTextView liveTextView17 = (LiveTextView) mo10742a(R.id.c8b);
                C89219l.m154716b(liveTextView17, "");
                liveTextView17.setVisibility(8);
                LiveTextView liveTextView18 = (LiveTextView) mo10742a(R.id.dkl);
                C89219l.m154716b(liveTextView18, "");
                liveTextView18.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo10743a() {
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.ck4);
        C89219l.m154716b(hSImageView, "");
        hSImageView.setVisibility(0);
        HSImageView hSImageView2 = (HSImageView) mo10742a(R.id.d2_);
        C89219l.m154716b(hSImageView2, "");
        hSImageView2.setVisibility(8);
        LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.al6);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setVisibility(8);
        LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.al7);
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setVisibility(8);
        this.f13088l = true;
        this.f13079b = EnumC5032a.MIDDLE;
        LiveTextView liveTextView3 = (LiveTextView) mo10742a(R.id.c8b);
        C89219l.m154716b(liveTextView3, "");
        liveTextView3.setText("0");
        LiveTextView liveTextView4 = (LiveTextView) mo10742a(R.id.dkl);
        C89219l.m154716b(liveTextView4, "");
        liveTextView4.setText("0");
        this.f13086j = 0;
        this.f13087k = 0;
        this.f13078a = 0.5f;
        m11252b(50.0f);
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar != null) {
            pKProgressBar.mo10796a();
        }
        PKProgressBar pKProgressBar2 = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar2 != null) {
            pKProgressBar2.mo10796a();
        }
    }

    public final void setAnchor(boolean z) {
        this.f13081d = z;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f13082e = dataChannel;
    }

    public final void setDataHolder(C4384b bVar) {
        this.f13080c = bVar;
    }

    /* renamed from: b */
    private final void m11252b(float f) {
        this.f13085i = f;
        ((PKProgressBar) mo10742a(R.id.ffq)).setCoverWidth(f);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$d */
    public static final class C5035d extends AbstractC89220m implements AbstractC89172b<EnumC4949c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13094a;

        static {
            Covode.recordClassIndex(5620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5035d(BattleHealthBar battleHealthBar) {
            super(1);
            this.f13094a = battleHealthBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC4949c cVar) {
            C89219l.m154721d(cVar, "");
            if (cVar == EnumC4949c.PUNISH && this.f13094a.f13079b != EnumC5032a.EMOJI) {
                this.f13094a.mo10745b();
                this.f13094a.f13079b = EnumC5032a.EMOJI;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$c */
    public static final class C5034c extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13093a;

        static {
            Covode.recordClassIndex(5619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5034c(BattleHealthBar battleHealthBar) {
            super(1);
            this.f13093a = battleHealthBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            if (l.longValue() <= LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue() && this.f13093a.f13079b != EnumC5032a.EMOJI) {
                this.f13093a.mo10745b();
                this.f13093a.f13079b = EnumC5032a.EMOJI;
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$e */
    public static final class C5036e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13095a;

        static {
            Covode.recordClassIndex(5621);
        }

        C5036e(BattleHealthBar battleHealthBar) {
            this.f13095a = battleHealthBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((LiveTextView) this.f13095a.mo10742a(R.id.c8b)).setTextSize(1, ((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar$f */
    public static final class C5037f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BattleHealthBar f13096a;

        static {
            Covode.recordClassIndex(5622);
        }

        C5037f(BattleHealthBar battleHealthBar) {
            this.f13096a = battleHealthBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((LiveTextView) this.f13096a.mo10742a(R.id.dkl)).setTextSize(1, ((Float) animatedValue).floatValue());
        }
    }

    public final void setLeftValue(int i) {
        if (!m11253c()) {
            LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.c8b);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setVisibility(0);
        } else {
            LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.c8b);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        m11249a(i, ((PKProgressBar) mo10742a(R.id.ffq)).getRightValue());
        m11251a(true, i);
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar != null) {
            pKProgressBar.setLeftValue(i);
        }
    }

    public final void setRightValue(int i) {
        if (!m11253c()) {
            LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.dkl);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setVisibility(0);
        } else {
            LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.dkl);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        m11249a(((PKProgressBar) mo10742a(R.id.ffq)).getLeftValue(), i);
        m11251a(false, i);
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        if (pKProgressBar != null) {
            pKProgressBar.setRightValue(i);
        }
    }

    /* renamed from: a */
    private final void m11250a(FrameLayout.LayoutParams layoutParams) {
        LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.al6);
        C89219l.m154716b(liveTextView, "");
        if (liveTextView.getVisibility() == 0) {
            ((LiveTextView) mo10742a(R.id.al6)).post(new RunnableC5038g(this, layoutParams));
            return;
        }
        LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.al7);
        C89219l.m154716b(liveTextView2, "");
        if (liveTextView2.getVisibility() == 0) {
            ((LiveTextView) mo10742a(R.id.al7)).post(new RunnableC5039h(this, layoutParams));
        }
    }

    /* renamed from: a */
    private final void m11249a(int i, int i2) {
        if (i != 0 || i2 != 0) {
            HSImageView hSImageView = (HSImageView) mo10742a(R.id.ck4);
            C89219l.m154716b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) mo10742a(R.id.d2_);
            C89219l.m154716b(hSImageView2, "");
            hSImageView2.setVisibility(0);
            if (this.f13079b != EnumC5032a.EMOJI) {
                int i3 = this.f13086j;
                int i4 = i - i3;
                if (i4 >= 1000) {
                    if (this.f13079b != EnumC5032a.STRONG) {
                        m11256f();
                    }
                } else if (i4 > 0) {
                    if (this.f13079b != EnumC5032a.WEAK) {
                        m11255e();
                    }
                } else if (i3 == 0 && this.f13087k == 0 && this.f13079b != EnumC5032a.WEAK) {
                    m11255e();
                }
                this.f13086j = i;
                this.f13087k = i2;
                this.f13088l = true;
                PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
                if (pKProgressBar != null) {
                    pKProgressBar.setMIsAnimationToRight(this.f13088l);
                }
                m11254d();
            }
        }
    }

    /* renamed from: a */
    private final void m11251a(boolean z, int i) {
        String valueOf = String.valueOf(i);
        if (z) {
            LiveTextView liveTextView = (LiveTextView) mo10742a(R.id.c8b);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(valueOf);
            ValueAnimator valueAnimator = this.f13083g;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                LiveTextView liveTextView2 = (LiveTextView) mo10742a(R.id.c8b);
                C89219l.m154716b(liveTextView2, "");
                if (liveTextView2.getVisibility() != 8) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(15.0f, 23.0f);
                    this.f13083g = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(300L);
                    }
                    ValueAnimator valueAnimator2 = this.f13083g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setRepeatCount(1);
                    }
                    ValueAnimator valueAnimator3 = this.f13083g;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setRepeatMode(2);
                    }
                    ValueAnimator valueAnimator4 = this.f13083g;
                    if (valueAnimator4 != null) {
                        valueAnimator4.addUpdateListener(new C5036e(this));
                    }
                    ValueAnimator valueAnimator5 = this.f13083g;
                    if (valueAnimator5 != null) {
                        valueAnimator5.start();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LiveTextView liveTextView3 = (LiveTextView) mo10742a(R.id.dkl);
        C89219l.m154716b(liveTextView3, "");
        liveTextView3.setText(valueOf);
        ValueAnimator valueAnimator6 = this.f13084h;
        if (valueAnimator6 == null || !valueAnimator6.isRunning()) {
            LiveTextView liveTextView4 = (LiveTextView) mo10742a(R.id.dkl);
            C89219l.m154716b(liveTextView4, "");
            if (liveTextView4.getVisibility() != 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(15.0f, 23.0f);
                this.f13084h = ofFloat2;
                if (ofFloat2 != null) {
                    ofFloat2.setDuration(300L);
                }
                ValueAnimator valueAnimator7 = this.f13084h;
                if (valueAnimator7 != null) {
                    valueAnimator7.setRepeatCount(1);
                }
                ValueAnimator valueAnimator8 = this.f13084h;
                if (valueAnimator8 != null) {
                    valueAnimator8.setRepeatMode(2);
                }
                ValueAnimator valueAnimator9 = this.f13084h;
                if (valueAnimator9 != null) {
                    valueAnimator9.addUpdateListener(new C5037f(this));
                }
                ValueAnimator valueAnimator10 = this.f13084h;
                if (valueAnimator10 != null) {
                    valueAnimator10.start();
                }
            }
        }
    }

    private /* synthetic */ BattleHealthBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BattleHealthBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5413);
        this.f13078a = 0.5f;
        this.f13085i = 50.0f;
        this.f13088l = true;
        this.f13079b = EnumC5032a.MIDDLE;
        LayoutInflater.from(context).inflate(R.layout.bcf, this);
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.ck4);
        C89219l.m154716b(hSImageView, "");
        C5746d.m12615a(hSImageView, C4962b.m11162a().getBattleScoreInitial(), null);
        PKProgressBar pKProgressBar = (PKProgressBar) mo10742a(R.id.ffq);
        C50301 r1 = new AbstractC89172b<Float, C89391z>(this) {
            /* class com.bytedance.android.live.liveinteract.match.p311ui.view.BattleHealthBar.C50301 */

            /* renamed from: a */
            final /* synthetic */ BattleHealthBar f13090a;

            static {
                Covode.recordClassIndex(5615);
            }

            {
                this.f13090a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Float f) {
                float floatValue = f.floatValue();
                BattleHealthBar battleHealthBar = this.f13090a;
                battleHealthBar.f13078a = floatValue;
                if (battleHealthBar.f13079b == EnumC5032a.EMOJI) {
                    battleHealthBar.mo10745b();
                }
                return C89391z.f203057a;
            }
        };
        C50312 r0 = new AbstractC89172b<Float, C89391z>(this) {
            /* class com.bytedance.android.live.liveinteract.match.p311ui.view.BattleHealthBar.C50312 */

            /* renamed from: a */
            final /* synthetic */ BattleHealthBar f13091a;

            static {
                Covode.recordClassIndex(5616);
            }

            {
                this.f13091a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Float f) {
                this.f13091a.mo10744a(f.floatValue());
                return C89391z.f203057a;
            }
        };
        pKProgressBar.f13162b = r1;
        pKProgressBar.f13163c = r0;
        m11252b(50.0f);
        MethodCollector.m26664o(5413);
    }

    /* renamed from: a */
    private final void m11248a(float f, float f2, float f3, float f4) {
        ViewGroup.LayoutParams layoutParams;
        HSImageView hSImageView = (HSImageView) mo10742a(R.id.d2_);
        if (hSImageView != null) {
            layoutParams = hSImageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = C3966y.m9653a(f3);
        layoutParams2.topMargin = C3966y.m9653a(f4);
        layoutParams2.width = C3966y.m9653a(f);
        layoutParams2.height = C3966y.m9653a(f2);
        HSImageView hSImageView2 = (HSImageView) mo10742a(R.id.d2_);
        if (hSImageView2 != null) {
            hSImageView2.setLayoutParams(layoutParams2);
        }
    }
}
