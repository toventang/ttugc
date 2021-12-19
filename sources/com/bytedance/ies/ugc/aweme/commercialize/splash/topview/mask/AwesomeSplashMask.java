package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class AwesomeSplashMask extends RelativeLayout implements AbstractC18019c {

    /* renamed from: m */
    public static final C18036a f42920m = new C18036a((byte) 0);

    /* renamed from: a */
    public final Map<String, String> f42921a;

    /* renamed from: b */
    public Aweme f42922b;

    /* renamed from: c */
    public AwemeSplashInfo f42923c;

    /* renamed from: d */
    public int f42924d;

    /* renamed from: e */
    public final Context f42925e;

    /* renamed from: f */
    public int f42926f;

    /* renamed from: g */
    public boolean f42927g;

    /* renamed from: h */
    AnimatorSet f42928h;

    /* renamed from: i */
    ObjectAnimator f42929i;

    /* renamed from: j */
    public boolean f42930j;

    /* renamed from: k */
    final Animator.AnimatorListener f42931k;

    /* renamed from: l */
    public final GestureDetector.OnGestureListener f42932l;

    /* renamed from: n */
    private int f42933n;

    /* renamed from: o */
    private boolean f42934o;

    /* renamed from: p */
    private final AbstractC89244h f42935p;

    /* renamed from: q */
    private final AbstractC89244h f42936q;

    /* renamed from: r */
    private final AbstractC89244h f42937r;

    /* renamed from: s */
    private final AbstractC89244h f42938s;

    /* renamed from: t */
    private final AbstractC89244h f42939t;

    /* renamed from: u */
    private AwemeSplashInfo.SkipInfo f42940u;

    /* renamed from: v */
    private int f42941v;

    /* renamed from: w */
    private ViewPropertyAnimator f42942w;

    /* renamed from: x */
    private AdHomePageDataVM f42943x;

    /* renamed from: y */
    private final AbstractC1214u<Float> f42944y;

    static {
        Covode.recordClassIndex(20662);
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.f42939t.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.f42935p.getValue();
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: b */
    public final void mo28747b() {
    }

    /* access modifiers changed from: package-private */
    public final RelativeLayout getCountDownBg4() {
        return (RelativeLayout) this.f42936q.getValue();
    }

    public final RelativeLayout getCountDownBg5() {
        return (RelativeLayout) this.f42938s.getValue();
    }

    public final TextView getCountDownTv() {
        return (TextView) this.f42937r.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$a */
    public static final class C18036a {
        static {
            Covode.recordClassIndex(20663);
        }

        private C18036a() {
        }

        public /* synthetic */ C18036a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$c */
    static final class C18038c extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42946a;

        static {
            Covode.recordClassIndex(20665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18038c(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.f42946a = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f42946a.findViewById(R.id.dl7);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$d */
    static final class C18039d extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42947a;

        static {
            Covode.recordClassIndex(20666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18039d(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.f42947a = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f42947a.findViewById(R.id.dl8);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$e */
    static final class C18040e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42948a;

        static {
            Covode.recordClassIndex(20667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18040e(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.f42948a = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f42948a.findViewById(R.id.euf);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$g */
    static final class C18042g extends AbstractC89220m implements AbstractC89171a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42950a;

        static {
            Covode.recordClassIndex(20669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18042g(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.f42950a = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.f42950a.f42925e, this.f42950a.f42932l);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$k */
    static final class C18046k extends AbstractC89220m implements AbstractC89171a<TopViewSkipButton> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42955a;

        static {
            Covode.recordClassIndex(20673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18046k(AwesomeSplashMask awesomeSplashMask) {
            super(0);
            this.f42955a = awesomeSplashMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TopViewSkipButton invoke() {
            return this.f42955a.findViewById(R.id.e1v);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: a */
    public final void mo28746a() {
        AdHomePageDataVM adHomePageDataVM;
        getSkipButton().mo9139b();
        mo28766d();
        if (this.f42924d == 5 && (adHomePageDataVM = this.f42943x) != null) {
            adHomePageDataVM.f42663c.removeObserver(this.f42944y);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f42942w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f42942w = null;
        }
    }

    /* renamed from: d */
    public final void mo28766d() {
        AnimatorSet animatorSet = this.f42928h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f42928h = null;
        }
        ObjectAnimator objectAnimator = this.f42929i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f42929i = null;
        }
        RelativeLayout countDownBg4 = getCountDownBg4();
        if (countDownBg4.getVisibility() == 0) {
            countDownBg4.setVisibility(8);
        }
        RelativeLayout countDownBg5 = getCountDownBg5();
        if (countDownBg5.getVisibility() == 0) {
            countDownBg5.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getContext() instanceof ActivityC0945e) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f42943x = AdHomePageDataVM.C17902a.m33208a((ActivityC0945e) context);
        }
        View findViewById = findViewById(R.id.pd);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += C34723i.m70927b();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnTouchListener(new View$OnTouchListenerC18045j(this));
    }

    /* renamed from: c */
    public final void mo28765c() {
        AwemeRawAd awemeRawAd;
        String openUrl;
        AbstractC17934b a = C17957a.m33426a();
        if (a != null && a.mo28631c(this.f42922b)) {
            AbstractC17934b a2 = C17957a.m33426a();
            if (a2 == null) {
                C89219l.m154715b();
            }
            if (a2.mo28633d(this.f42922b)) {
                new C23144b(this).mo37640e(R.string.o6).mo37637b();
                return;
            }
            Aweme aweme = this.f42922b;
            if (aweme == null) {
                C89219l.m154715b();
            }
            aweme.getAid();
            Aweme aweme2 = this.f42922b;
            if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null || (openUrl = awemeRawAd.getOpenUrl()) == null || openUrl.length() == 0)) {
                Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                C89219l.m154716b(parse, "");
                if (TextUtils.equals(parse.getHost(), "challenge")) {
                    C29844g gVar = new C29844g(awemeRawAd.getOpenUrl());
                    gVar.mo52130a("extra_challenge_from", "awesome_splash");
                    awemeRawAd.setOpenUrl(gVar.mo52126a());
                }
            }
            AbstractC17934b a3 = C17957a.m33426a();
            if (a3 != null) {
                a3.mo28617a(this.f42925e, this.f42922b, this.f42921a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$b */
    public static final class C18037b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42945a;

        static {
            Covode.recordClassIndex(20664);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator, boolean z) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18037b(AwesomeSplashMask awesomeSplashMask) {
            this.f42945a = awesomeSplashMask;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            C89219l.m154721d(animator, "");
            this.f42945a.f42927g = true;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$f */
    public static final class C18041f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42949a;

        static {
            Covode.recordClassIndex(20668);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18041f(AwesomeSplashMask awesomeSplashMask) {
            this.f42949a = awesomeSplashMask;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            this.f42949a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            this.f42949a.mo28765c();
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            String enterAppText;
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            if (Math.abs(f) >= Math.abs(f2) || motionEvent2.getY() >= motionEvent.getY()) {
                z = false;
            } else {
                z = true;
            }
            AwemeRawAd awemeRawAd = null;
            if (this.f42949a.f42924d != 3) {
                if (this.f42949a.f42924d != 0) {
                    if (this.f42949a.f42924d == 4) {
                        if (!z) {
                            return true;
                        }
                        Aweme aweme = this.f42949a.f42922b;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        C18129a.m33746a("draw_ad", "slide_up", awemeRawAd).mo28901b();
                        AwemeSplashInfo awemeSplashInfo = this.f42949a.f42923c;
                        if (awemeSplashInfo == null || (enterAppText = awemeSplashInfo.getEnterAppText()) == null || enterAppText.length() == 0) {
                            return true;
                        }
                        if (this.f42949a.f42926f > 1) {
                            TextView countDownTv = this.f42949a.getCountDownTv();
                            C89219l.m154716b(countDownTv, "");
                            String enterAppText2 = awemeSplashInfo.getEnterAppText();
                            C89219l.m154716b(enterAppText2, "");
                            countDownTv.setText(C89361p.m154869a(enterAppText2, "%", String.valueOf(this.f42949a.f42926f), false));
                            AwesomeSplashMask awesomeSplashMask = this.f42949a;
                            if (awesomeSplashMask.f42927g) {
                                awesomeSplashMask.f42927g = false;
                                Aweme aweme2 = awesomeSplashMask.f42922b;
                                if (aweme2 == null) {
                                    C89219l.m154715b();
                                }
                                C18129a.m33746a("draw_ad", "othershow", aweme2.getAwemeRawAd()).mo28900b("refer", "tips").mo28901b();
                                RelativeLayout countDownBg4 = awesomeSplashMask.getCountDownBg4();
                                if (countDownBg4.getVisibility() == 8) {
                                    countDownBg4.setVisibility(0);
                                }
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, -C29661o.m59767a(awesomeSplashMask.f42925e, 50.0f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, C29661o.m59767a(awesomeSplashMask.f42925e, 50.0f));
                                C89219l.m154716b(ofFloat, "");
                                ofFloat.setDuration(200L);
                                C89219l.m154716b(ofFloat2, "");
                                ofFloat2.setDuration(2L);
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f, 0.0f);
                                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f);
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "alpha", 1.0f);
                                C89219l.m154716b(ofFloat3, "");
                                ofFloat3.setDuration(150L);
                                C89219l.m154716b(ofFloat4, "");
                                ofFloat4.setDuration(650L);
                                C89219l.m154716b(ofFloat5, "");
                                ofFloat5.setDuration(2L);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(ofFloat).before(ofFloat4);
                                animatorSet.play(ofFloat4).before(ofFloat3);
                                animatorSet.play(ofFloat3).before(ofFloat2);
                                animatorSet.play(ofFloat2).before(ofFloat5);
                                animatorSet.addListener(awesomeSplashMask.f42931k);
                                animatorSet.start();
                                awesomeSplashMask.f42928h = animatorSet;
                            }
                        } else {
                            this.f42949a.mo28766d();
                        }
                    } else if (this.f42949a.f42924d == 1) {
                        if (z) {
                            Aweme aweme3 = this.f42949a.f42922b;
                            if (aweme3 != null) {
                                awemeRawAd = aweme3.getAwemeRawAd();
                            }
                            C18129a.m33746a("draw_ad", "slide_up", awemeRawAd).mo28901b();
                        }
                    }
                }
                this.f42949a.mo28765c();
            } else if (z) {
                Aweme aweme4 = this.f42949a.f42922b;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                }
                C18129a.m33746a("draw_ad", "slide_up", awemeRawAd).mo28901b();
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$i */
    public static final class C18044i implements TopViewSkipButton.AbstractC18070b {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42953a;

        static {
            Covode.recordClassIndex(20671);
        }

        C18044i(AwesomeSplashMask awesomeSplashMask) {
            this.f42953a = awesomeSplashMask;
        }

        @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton.AbstractC18070b
        /* renamed from: a */
        public final void mo28782a(int i) {
            this.f42953a.f42926f = i;
            if (this.f42953a.f42924d == 5) {
                AwemeSplashInfo awemeSplashInfo = this.f42953a.f42923c;
                if (awemeSplashInfo == null) {
                    C89219l.m154715b();
                }
                if (!TextUtils.isEmpty(awemeSplashInfo.getEnterAppText()) && this.f42953a.f42926f > 0) {
                    TextView countDownTv = this.f42953a.getCountDownTv();
                    C89219l.m154716b(countDownTv, "");
                    AwemeSplashInfo awemeSplashInfo2 = this.f42953a.f42923c;
                    if (awemeSplashInfo2 == null) {
                        C89219l.m154715b();
                    }
                    String enterAppText = awemeSplashInfo2.getEnterAppText();
                    C89219l.m154716b(enterAppText, "");
                    countDownTv.setText(C89361p.m154869a(enterAppText, "%", String.valueOf(this.f42953a.f42926f), false));
                }
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (this.f42924d != 5) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (this.f42924d == 5) {
            return false;
        }
        int i = this.f42933n;
        if (!(i == 1 || i == 4)) {
            getMaskGestureDetector().onTouchEvent(motionEvent);
        }
        if (this.f42933n != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$h */
    static final class C18043h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42951a;

        /* renamed from: b */
        final /* synthetic */ Context f42952b;

        static {
            Covode.recordClassIndex(20670);
        }

        C18043h(AwesomeSplashMask awesomeSplashMask, Context context) {
            this.f42951a = awesomeSplashMask;
            this.f42952b = context;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AwemeRawAd awemeRawAd;
            Float f = (Float) obj;
            RelativeLayout countDownBg5 = this.f42951a.getCountDownBg5();
            C89219l.m154716b(countDownBg5, "");
            if (countDownBg5.getVisibility() == 8) {
                RelativeLayout countDownBg52 = this.f42951a.getCountDownBg5();
                C89219l.m154716b(countDownBg52, "");
                countDownBg52.setVisibility(0);
            }
            RelativeLayout countDownBg53 = this.f42951a.getCountDownBg5();
            C89219l.m154716b(countDownBg53, "");
            countDownBg53.setTranslationY(-f.floatValue());
            if (C89219l.m154712a(f, 0.0f)) {
                this.f42951a.f42930j = false;
            }
            if (!this.f42951a.f42930j) {
                float floatValue = f.floatValue();
                ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f42952b);
                C89219l.m154716b(viewConfiguration, "");
                if (floatValue > ((float) viewConfiguration.getScaledTouchSlop())) {
                    this.f42951a.f42930j = true;
                    Aweme aweme = this.f42951a.f42922b;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C18129a.m33746a("draw_ad", "slide_up", awemeRawAd).mo28901b();
                    AwesomeSplashMask awesomeSplashMask = this.f42951a;
                    if (awesomeSplashMask.f42927g && awesomeSplashMask.f42926f > 1) {
                        awesomeSplashMask.f42927g = false;
                        Aweme aweme2 = awesomeSplashMask.f42922b;
                        if (aweme2 == null) {
                            C89219l.m154715b();
                        }
                        C18129a.m33746a("draw_ad", "othershow", aweme2.getAwemeRawAd()).mo28900b("refer", "tips").mo28901b();
                        RelativeLayout countDownBg4 = awesomeSplashMask.getCountDownBg4();
                        if (countDownBg4.getVisibility() == 8) {
                            countDownBg4.setVisibility(0);
                        }
                        AwemeSplashInfo awemeSplashInfo = awesomeSplashMask.f42923c;
                        if (awemeSplashInfo == null) {
                            C89219l.m154715b();
                        }
                        String enterAppText = awemeSplashInfo.getEnterAppText();
                        if (!(enterAppText == null || enterAppText.length() == 0)) {
                            TextView countDownTv = awesomeSplashMask.getCountDownTv();
                            C89219l.m154716b(countDownTv, "");
                            AwemeSplashInfo awemeSplashInfo2 = awesomeSplashMask.f42923c;
                            if (awemeSplashInfo2 == null) {
                                C89219l.m154715b();
                            }
                            String enterAppText2 = awemeSplashInfo2.getEnterAppText();
                            C89219l.m154716b(enterAppText2, "");
                            countDownTv.setText(C89361p.m154869a(enterAppText2, "%", String.valueOf(awesomeSplashMask.f42926f), false));
                        }
                        awesomeSplashMask.f42929i = ObjectAnimator.ofFloat(awesomeSplashMask.getCountDownBg4(), "translationY", 0.0f, -C29661o.m59767a(awesomeSplashMask.f42925e, 50.0f));
                        ObjectAnimator objectAnimator = awesomeSplashMask.f42929i;
                        if (objectAnimator != null) {
                            objectAnimator.setDuration(200L);
                        }
                        ObjectAnimator objectAnimator2 = awesomeSplashMask.f42929i;
                        if (objectAnimator2 != null) {
                            objectAnimator2.start();
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    public final void onEvent(C18017a aVar) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo.SkipInfo skipInfo;
        int i;
        int i2;
        AdHomePageDataVM adHomePageDataVM;
        C1213t<Float> tVar;
        C89219l.m154721d(aVar, "");
        this.f42933n = aVar.f42891a;
        Aweme aweme = aVar.f42892b;
        this.f42922b = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            C89219l.m154716b(awemeRawAd, "");
            AwemeSplashInfo splashInfo = awemeRawAd.getSplashInfo();
            this.f42923c = splashInfo;
            if (splashInfo != null) {
                this.f42924d = splashInfo.getSwipeUpType();
                AwemeSplashInfo.SkipInfo skipInfo2 = splashInfo.getSkipInfo();
                if (skipInfo2 != null) {
                    this.f42940u = skipInfo2;
                    this.f42941v = skipInfo2.getButtonExtraStyle();
                }
            }
            if (!this.f42934o) {
                if (!(this.f42924d != 5 || (adHomePageDataVM = this.f42943x) == null || (tVar = adHomePageDataVM.f42663c) == null)) {
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    tVar.observe((AbstractC1204m) context, this.f42944y);
                }
                AwemeSplashInfo.SkipInfo skipInfo3 = this.f42940u;
                if (skipInfo3 != null) {
                    getSkipButton().mo28808a(this.f42925e, skipInfo3);
                }
                if (!(!C80471gb.m139483a(getContext()) || (i2 = this.f42941v) == 2 || i2 == 3)) {
                    TopViewSkipButton skipButton = getSkipButton();
                    C89219l.m154716b(skipButton, "");
                    ViewGroup.LayoutParams layoutParams = skipButton.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.addRule(11, 0);
                    layoutParams2.addRule(9);
                    TopViewSkipButton skipButton2 = getSkipButton();
                    C89219l.m154716b(skipButton2, "");
                    skipButton2.setLayoutParams(layoutParams2);
                    View findViewById = findViewById(R.id.pb);
                    C89219l.m154716b(findViewById, "");
                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) findViewById;
                    ViewGroup.LayoutParams layoutParams3 = autoRTLImageView.getLayoutParams();
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.addRule(9, 0);
                    layoutParams4.addRule(11);
                    layoutParams4.rightMargin = C34728n.m70946a(14.0d);
                    autoRTLImageView.setLayoutParams(layoutParams4);
                }
                this.f42934o = true;
            }
            int i3 = this.f42933n;
            if (i3 == 3) {
                ALog.m59865d("AwesomeSplash", "AwesomeSplashMask onEvent is FADING_OUT");
                mo28766d();
                ViewPropertyAnimator duration = animate().alpha(0.0f).setDuration(260);
                this.f42942w = duration;
                if (duration != null) {
                    duration.start();
                }
                AbstractC17934b a = C17957a.m33426a();
                if (a != null) {
                    Context context2 = getContext();
                    C89219l.m154716b(context2, "");
                    a.mo28616a(context2, this.f42922b);
                }
            } else if (i3 == 2 && (skipInfo = this.f42940u) != null) {
                if (skipInfo.isCountdown_enable() || (i = this.f42924d) == 4 || i == 5) {
                    TopViewSkipButton skipButton3 = getSkipButton();
                    C18044i iVar = new C18044i(this);
                    C89219l.m154721d(iVar, "");
                    skipButton3.f43012h = iVar;
                    AwemeSplashInfo awemeSplashInfo = this.f42923c;
                    if (awemeSplashInfo == null) {
                        C89219l.m154715b();
                    }
                    this.f42926f = (int) (awemeSplashInfo.getSplashShowTime() / 1000.0f);
                    TopViewSkipButton skipButton4 = getSkipButton();
                    AwemeSplashInfo awemeSplashInfo2 = this.f42923c;
                    if (awemeSplashInfo2 == null) {
                        C89219l.m154715b();
                    }
                    skipButton4.mo28807a((long) awemeSplashInfo2.getSplashShowTime());
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashMask$j */
    static final class View$OnTouchListenerC18045j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashMask f42954a;

        static {
            Covode.recordClassIndex(20672);
        }

        View$OnTouchListenerC18045j(AwesomeSplashMask awesomeSplashMask) {
            this.f42954a = awesomeSplashMask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f42954a.f42924d == 5) {
                return false;
            }
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (C80471gb.m139483a(this.f42954a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) C34723i.m70928b(this.f42954a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f42954a.f42921a;
            String b = new C27910f().mo46674b(hashMap);
            C89219l.m154716b(b, "");
            map.put("ad_extra_data", b);
            return false;
        }
    }

    private /* synthetic */ AwesomeSplashMask(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwesomeSplashMask(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3126);
        this.f42933n = 4;
        this.f42921a = new HashMap();
        this.f42935p = C89250i.m154774a(EnumC89331m.NONE, new C18046k(this));
        this.f42936q = C89250i.m154774a(EnumC89331m.NONE, new C18038c(this));
        this.f42937r = C89250i.m154774a(EnumC89331m.NONE, new C18040e(this));
        this.f42938s = C89250i.m154774a(EnumC89331m.NONE, new C18039d(this));
        this.f42939t = C89250i.m154774a(EnumC89331m.NONE, new C18042g(this));
        this.f42925e = context;
        this.f42927g = true;
        this.f42931k = new C18037b(this);
        this.f42944y = new C18043h(this, context);
        this.f42932l = new C18041f(this);
        MethodCollector.m26664o(3126);
    }
}
