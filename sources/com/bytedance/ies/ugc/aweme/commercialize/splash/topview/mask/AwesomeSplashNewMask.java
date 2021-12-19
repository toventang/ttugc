package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
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
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class AwesomeSplashNewMask extends RelativeLayout implements AbstractC18019c {

    /* renamed from: e */
    public static final C18047a f42956e = new C18047a((byte) 0);

    /* renamed from: a */
    public final Map<String, String> f42957a;

    /* renamed from: b */
    public final Context f42958b;

    /* renamed from: c */
    public Aweme f42959c;

    /* renamed from: d */
    public final GestureDetector.OnGestureListener f42960d;

    /* renamed from: f */
    private int f42961f;

    /* renamed from: g */
    private boolean f42962g;

    /* renamed from: h */
    private AwemeSplashInfo f42963h;

    /* renamed from: i */
    private AwemeSplashInfo.SkipInfo f42964i;

    /* renamed from: j */
    private AwemeSplashInfo.LabelInfo f42965j;

    /* renamed from: k */
    private int f42966k;

    /* renamed from: l */
    private int f42967l;

    /* renamed from: m */
    private boolean f42968m;

    /* renamed from: n */
    private ViewPropertyAnimator f42969n;

    /* renamed from: o */
    private boolean f42970o;

    /* renamed from: p */
    private Runnable f42971p;

    /* renamed from: q */
    private ObjectAnimator f42972q;

    /* renamed from: r */
    private final AbstractC89244h f42973r;

    /* renamed from: s */
    private final AbstractC89244h f42974s;

    /* renamed from: t */
    private final AbstractC89244h f42975t;

    /* renamed from: u */
    private final AbstractC89244h f42976u;

    /* renamed from: v */
    private final AbstractC89244h f42977v;

    /* renamed from: w */
    private final AbstractC89244h f42978w;

    /* renamed from: x */
    private final AbstractC89244h f42979x;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$p */
    public static final class View$OnClickListenerC18063p implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC18063p f42995a = new View$OnClickListenerC18063p();

        static {
            Covode.recordClassIndex(20691);
        }

        View$OnClickListenerC18063p() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(20674);
    }

    public AwesomeSplashNewMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final GestureDetector getMaskGestureDetector() {
        return (GestureDetector) this.f42978w.getValue();
    }

    private final ImageView getPromptIv() {
        return (ImageView) this.f42975t.getValue();
    }

    private final RelativeLayout getPromptTotal() {
        return (RelativeLayout) this.f42973r.getValue();
    }

    private final TopViewSkipButton getSkipButton() {
        return (TopViewSkipButton) this.f42976u.getValue();
    }

    private final TextView getSponsorSign() {
        return (TextView) this.f42977v.getValue();
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    private final ImageView getTopPromptIv() {
        return (ImageView) this.f42979x.getValue();
    }

    public final TextView getPromptTv() {
        return (TextView) this.f42974s.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$a */
    public static final class C18047a {
        static {
            Covode.recordClassIndex(20675);
        }

        private C18047a() {
        }

        public /* synthetic */ C18047a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$q */
    public static final class C18064q extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(20692);
        }

        C18064q() {
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            animator.setStartDelay(1000);
            animator.start();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$c */
    static final class RunnableC18049c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42981a;

        static {
            Covode.recordClassIndex(20677);
        }

        RunnableC18049c(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f42981a = awesomeSplashNewMask;
        }

        public final void run() {
            this.f42981a.mo28784a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$n */
    public static final class C18060n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42992a;

        static {
            Covode.recordClassIndex(20688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18060n(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42992a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo28795a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo28795a() {
            AwemeRawAd awemeRawAd;
            this.f42992a.getPromptTv().setOnClickListener(View$OnClickListenerC180611.f42993a);
            Aweme aweme = this.f42992a.f42959c;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("draw_ad", "othershow", awemeRawAd).mo28900b("refer", "tips").mo28901b();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: b */
    public final void mo28747b() {
        this.f42962g = true;
        mo28746a();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$e */
    static final class C18051e extends AbstractC89220m implements AbstractC89171a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42983a;

        static {
            Covode.recordClassIndex(20679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18051e(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42983a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.f42983a.f42958b, this.f42983a.f42960d);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$g */
    static final class C18053g extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42985a;

        static {
            Covode.recordClassIndex(20681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18053g(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42985a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f42985a.findViewById(R.id.byp);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$h */
    static final class C18054h extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42986a;

        static {
            Covode.recordClassIndex(20682);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18054h(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42986a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f42986a.findViewById(R.id.dln);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$i */
    static final class C18055i extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42987a;

        static {
            Covode.recordClassIndex(20683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18055i(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42987a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f42987a.findViewById(R.id.f1n);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$k */
    static final class C18057k extends AbstractC89220m implements AbstractC89171a<TopViewSkipButton> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42989a;

        static {
            Covode.recordClassIndex(20685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18057k(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42989a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TopViewSkipButton invoke() {
            return this.f42989a.findViewById(R.id.e1v);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$l */
    static final class C18058l extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42990a;

        static {
            Covode.recordClassIndex(20686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18058l(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42990a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f42990a.findViewById(R.id.f44);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$m */
    static final class C18059m extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42991a;

        static {
            Covode.recordClassIndex(20687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18059m(AwesomeSplashNewMask awesomeSplashNewMask) {
            super(0);
            this.f42991a = awesomeSplashNewMask;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f42991a.findViewById(R.id.c0n);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.pd);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += C34723i.m70927b();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnTouchListener(new View$OnTouchListenerC18052f(this));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: a */
    public final void mo28746a() {
        if (this.f42971p != null) {
            getPromptTotal().removeCallbacks(this.f42971p);
            this.f42971p = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f42969n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f42969n = null;
        }
        ObjectAnimator objectAnimator = this.f42972q;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ObjectAnimator objectAnimator2 = this.f42972q;
            if (objectAnimator2 == null) {
                C89219l.m154715b();
            }
            objectAnimator2.cancel();
            this.f42972q = null;
        }
        ImageView promptIv = getPromptIv();
        C89219l.m154716b(promptIv, "");
        TextView promptTv = getPromptTv();
        C89219l.m154716b(promptTv, "");
        C18056j.m33610a(promptIv, promptTv);
        getSkipButton().mo9139b();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$b */
    public static final class C18048b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42980a;

        static {
            Covode.recordClassIndex(20676);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18048b(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f42980a = awesomeSplashNewMask;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            this.f42980a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onSingleTapUp(android.view.MotionEvent r7) {
            /*
            // Method dump skipped, instructions count: 159
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.C18048b.onSingleTapUp(android.view.MotionEvent):boolean");
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!(motionEvent == null || motionEvent2 == null || Math.abs(f) >= Math.abs(f2))) {
                ViewParent parent = this.f42980a.getParent();
                if (motionEvent2.getY() > motionEvent.getY()) {
                    z = true;
                } else {
                    z = false;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$j */
    public static final class C18056j extends AbstractC89220m implements AbstractC89172b<View[], C89391z> {

        /* renamed from: a */
        public static final C18056j f42988a = new C18056j();

        static {
            Covode.recordClassIndex(20684);
        }

        C18056j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View[] viewArr) {
            m33610a(viewArr);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public static void m33610a(View... viewArr) {
            C89219l.m154721d(viewArr, "");
            for (View view : viewArr) {
                view.clearAnimation();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$o */
    public static final class C18062o extends AbstractC89220m implements AbstractC89172b<View[], C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f42994a;

        static {
            Covode.recordClassIndex(20690);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18062o(boolean z) {
            super(1);
            this.f42994a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View[] viewArr) {
            mo28797a(viewArr);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo28797a(View... viewArr) {
            C89219l.m154721d(viewArr, "");
            if (this.f42994a) {
                for (View view : viewArr) {
                    view.setAlpha(0.0f);
                    C13628n.m24510a(view, 0);
                    view.animate().alpha(1.0f).setDuration(300).setListener(null);
                }
                return;
            }
            for (View view2 : viewArr) {
                C13628n.m24510a(view2, 0);
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$d */
    static final class View$OnClickListenerC18050d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42982a;

        static {
            Covode.recordClassIndex(20678);
        }

        View$OnClickListenerC18050d(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f42982a = awesomeSplashNewMask;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            Aweme aweme = this.f42982a.f42959c;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("draw_ad", "otherclick", awemeRawAd).mo28900b("refer", "adtag").mo28901b();
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        C89219l.m154721d(motionEvent, "");
        super.onTouchEvent(motionEvent);
        GestureDetector maskGestureDetector = getMaskGestureDetector();
        if (!(this.f42962g || (i = this.f42961f) == 1 || i == 4)) {
            maskGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.f42961f != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo28784a(boolean z) {
        String enterAppText;
        AwemeSplashInfo awemeSplashInfo = this.f42963h;
        if (awemeSplashInfo != null && (enterAppText = awemeSplashInfo.getEnterAppText()) != null && enterAppText.length() != 0) {
            C18060n nVar = new C18060n(this);
            C18062o oVar = new C18062o(z);
            int i = this.f42966k;
            if (i == 6) {
                C13628n.m24510a(getPromptTotal(), 0);
                TextView promptTv = getPromptTv();
                C89219l.m154716b(promptTv, "");
                AwemeSplashInfo awemeSplashInfo2 = this.f42963h;
                if (awemeSplashInfo2 == null) {
                    C89219l.m154715b();
                }
                promptTv.setText(awemeSplashInfo2.getEnterAppText());
                TextView promptTv2 = getPromptTv();
                C89219l.m154716b(promptTv2, "");
                ImageView promptIv = getPromptIv();
                C89219l.m154716b(promptIv, "");
                oVar.mo28797a(promptTv2, promptIv);
                nVar.mo28795a();
                getPromptIv().setOnClickListener(View$OnClickListenerC18063p.f42995a);
            } else if (i == 7) {
                C13628n.m24510a(getPromptTotal(), 0);
                C13628n.m24510a(getPromptIv(), 8);
                TextView promptTv3 = getPromptTv();
                C89219l.m154716b(promptTv3, "");
                oVar.mo28797a(promptTv3);
                TextView promptTv4 = getPromptTv();
                C89219l.m154716b(promptTv4, "");
                AwemeSplashInfo awemeSplashInfo3 = this.f42963h;
                if (awemeSplashInfo3 == null) {
                    C89219l.m154715b();
                }
                promptTv4.setText(awemeSplashInfo3.getEnterAppText());
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getPromptTv(), "translationY", 0.0f, -C13628n.m24520b(this.f42958b, 8.0f), 0.0f);
                this.f42972q = ofFloat;
                if (z && ofFloat != null) {
                    ofFloat.setStartDelay(300);
                }
                ObjectAnimator objectAnimator = this.f42972q;
                if (objectAnimator != null) {
                    objectAnimator.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
                ObjectAnimator objectAnimator2 = this.f42972q;
                if (objectAnimator2 != null) {
                    objectAnimator2.addListener(new C18064q());
                }
                ObjectAnimator objectAnimator3 = this.f42972q;
                if (objectAnimator3 != null) {
                    objectAnimator3.start();
                }
                nVar.mo28795a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0164  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a r13) {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask.onEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a):void");
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask$f */
    static final class View$OnTouchListenerC18052f implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AwesomeSplashNewMask f42984a;

        static {
            Covode.recordClassIndex(20680);
        }

        View$OnTouchListenerC18052f(AwesomeSplashNewMask awesomeSplashNewMask) {
            this.f42984a = awesomeSplashNewMask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (C80471gb.m139483a(this.f42984a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) C34723i.m70928b(this.f42984a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f42984a.f42957a;
            String b = new C27910f().mo46674b(hashMap);
            C89219l.m154716b(b, "");
            map.put("ad_extra_data", b);
            return false;
        }
    }

    private /* synthetic */ AwesomeSplashNewMask(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwesomeSplashNewMask(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3014);
        this.f42961f = 4;
        this.f42957a = new HashMap();
        this.f42958b = context;
        this.f42970o = true;
        this.f42973r = C89250i.m154774a(EnumC89331m.NONE, new C18054h(this));
        this.f42974s = C89250i.m154774a(EnumC89331m.NONE, new C18055i(this));
        this.f42975t = C89250i.m154774a(EnumC89331m.NONE, new C18053g(this));
        this.f42976u = C89250i.m154774a(EnumC89331m.NONE, new C18057k(this));
        this.f42977v = C89250i.m154774a(EnumC89331m.NONE, new C18058l(this));
        this.f42978w = C89250i.m154774a(EnumC89331m.NONE, new C18051e(this));
        this.f42979x = C89250i.m154774a(EnumC89331m.NONE, new C18059m(this));
        this.f42960d = new C18048b(this);
        MethodCollector.m26664o(3014);
    }
}
