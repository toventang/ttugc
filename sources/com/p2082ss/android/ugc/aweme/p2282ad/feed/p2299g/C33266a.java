package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.p1868a.C24293a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33202b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33198a;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33392b;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33394d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a */
public final class C33266a implements AbstractC1214u<C33942b>, AbstractC33277b {

    /* renamed from: l */
    public static final C33267a f79012l = new C33267a((byte) 0);

    /* renamed from: a */
    public TextView f79013a;

    /* renamed from: b */
    public ImageView f79014b;

    /* renamed from: c */
    public RemoteImageView f79015c;

    /* renamed from: d */
    public C24290a f79016d;

    /* renamed from: e */
    public ValueAnimator f79017e;

    /* renamed from: f */
    public Aweme f79018f;

    /* renamed from: g */
    public AwemeRawAd f79019g;

    /* renamed from: h */
    AbstractC33202b f79020h;

    /* renamed from: i */
    long f79021i;

    /* renamed from: j */
    public final AbstractC33214c f79022j;

    /* renamed from: k */
    public final View f79023k;

    /* renamed from: m */
    private View f79024m;

    /* renamed from: n */
    private View f79025n;

    /* renamed from: o */
    private View f79026o;

    /* renamed from: p */
    private LottieAnimationView f79027p;

    /* renamed from: q */
    private int f79028q = -100;

    /* renamed from: r */
    private int f79029r = -100;

    /* renamed from: s */
    private int f79030s = -100;

    /* renamed from: t */
    private int f79031t = -100;

    /* renamed from: u */
    private int f79032u;

    /* renamed from: v */
    private int f79033v;

    /* renamed from: w */
    private final AbstractC89244h f79034w = C89250i.m154774a(EnumC89331m.NONE, new C33268b(this));

    /* renamed from: x */
    private DataCenter f79035x;

    /* renamed from: y */
    private final View f79036y;

    /* renamed from: z */
    private final AbstractC89244h f79037z;

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$e */
    static final class C33271e implements AbstractC38029b {

        /* renamed from: a */
        public static final C33271e f79041a = new C33271e();

        static {
            Covode.recordClassIndex(40097);
        }

        C33271e() {
        }
    }

    static {
        Covode.recordClassIndex(40092);
    }

    /* renamed from: f */
    private final int m68200f() {
        return ((Number) this.f79034w.getValue()).intValue();
    }

    /* renamed from: g */
    private final Runnable m68201g() {
        return (Runnable) this.f79037z.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$a */
    public static final class C33267a {
        static {
            Covode.recordClassIndex(40093);
        }

        private C33267a() {
        }

        public /* synthetic */ C33267a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$f */
    static final class C33272f extends AbstractC89220m implements AbstractC89171a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ C33266a f79042a;

        static {
            Covode.recordClassIndex(40098);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33272f(C33266a aVar) {
            super(0);
            this.f79042a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.C33266a.C33272f.RunnableC332731 */

                /* renamed from: a */
                final /* synthetic */ C33272f f79043a;

                static {
                    Covode.recordClassIndex(40099);
                }

                {
                    this.f79043a = r1;
                }

                public final void run() {
                    RemoteImageView remoteImageView;
                    AbstractC24255a controller;
                    AwemeRawAd awemeRawAd = this.f79043a.f79042a.f79019g;
                    if (awemeRawAd != null && awemeRawAd.getButtonIconAnimationRepeatTimes() != 0 && (remoteImageView = this.f79043a.f79042a.f79015c) != null && (controller = remoteImageView.getController()) != null) {
                        C89219l.m154716b(controller, "");
                        Animatable i = controller.mo39821i();
                        if (i != null) {
                            C33266a aVar = this.f79043a.f79042a;
                            Objects.requireNonNull(i, "null cannot be cast to non-null type com.facebook.fresco.animation.drawable.AnimatedDrawable2");
                            aVar.f79016d = (C24290a) i;
                            this.f79043a.f79042a.f79017e = C24293a.m46220a(this.f79043a.f79042a.f79016d);
                            ValueAnimator valueAnimator = this.f79043a.f79042a.f79017e;
                            if (valueAnimator != null) {
                                valueAnimator.setRepeatCount(awemeRawAd.getButtonIconAnimationRepeatTimes() - 1);
                            }
                            ValueAnimator valueAnimator2 = this.f79043a.f79042a.f79017e;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$b */
    static final class C33268b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C33266a f79038a;

        static {
            Covode.recordClassIndex(40094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33268b(C33266a aVar) {
            super(0);
            this.f79038a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f79038a.f79023k.getContext(), R.color.bz));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$i */
    static final class RunnableC33276i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33266a f79046a;

        static {
            Covode.recordClassIndex(40102);
        }

        RunnableC33276i(C33266a aVar) {
            this.f79046a = aVar;
        }

        public final void run() {
            this.f79046a.mo59228d();
            if (!this.f79046a.f79022j.mo59151e(this.f79046a.f79018f)) {
                this.f79046a.mo59220a(1300);
            }
        }
    }

    /* renamed from: h */
    private final int m68202h() {
        Drawable drawable;
        int f = m68200f();
        View view = this.f79025n;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return f;
    }

    /* renamed from: i */
    private final void m68203i() {
        if (this.f79029r != -100 || this.f79028q != -100) {
            C39162r.m79460a("ad_ui_adjust", new C33744d().mo59980a("original_time", this.f79028q).mo59980a("real_time", this.f79029r).mo59980a("tag", 1).mo59980a("is_adjusted", this.f79032u).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: b */
    public final void mo59225b() {
        AbstractC33214c cVar = this.f79022j;
        if (cVar != null && cVar.mo59147a(this.f79019g) && !this.f79022j.mo59150d(this.f79018f)) {
            View view = this.f79024m;
            if (view != null) {
                C33394d.m68480a(view, new RunnableC33276i(this));
            }
            C33392b.m68476a(this.f79024m, 0, 300, true);
        }
    }

    /* renamed from: d */
    public final void mo59228d() {
        Aweme aweme = this.f79018f;
        if (aweme != null) {
            Long l = null;
            C18129a.C18130a b = C18129a.m33746a("draw_ad", "othershow", aweme.getAwemeRawAd()).mo28900b("refer", "button");
            AbstractC33202b bVar = this.f79020h;
            if (bVar != null) {
                l = Long.valueOf(bVar.mo59135f());
            }
            b.mo28900b("duration", l).mo28901b();
            m68203i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: e */
    public final void mo59229e() {
        RemoteImageView remoteImageView = this.f79015c;
        if (remoteImageView != null) {
            remoteImageView.removeCallbacks(m68201g());
        }
        ValueAnimator valueAnimator = this.f79017e;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        C24290a aVar = this.f79016d;
        if (aVar != null) {
            aVar.mo40068a(0);
            aVar.stop();
        }
        this.f79016d = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: a */
    public final void mo59218a() {
        AbstractC33214c cVar = this.f79022j;
        if (cVar != null && cVar.mo59147a(this.f79019g)) {
            if (this.f79022j.mo59150d(this.f79018f)) {
                C33392b.m68476a(this.f79024m, 0, 0, true);
                mo59228d();
                if (!this.f79022j.mo59151e(this.f79018f)) {
                    mo59220a(1000);
                }
            } else {
                C33392b.m68476a(this.f79024m, -((int) C13628n.m24520b(this.f79023k.getContext(), 34.0f)), 0, false);
            }
            int f = m68200f();
            if (!this.f79022j.mo59151e(this.f79018f)) {
                f = Color.parseColor(C37699a.m76287c(this.f79019g));
            }
            m68198a(f, 0);
            LottieAnimationView lottieAnimationView = this.f79027p;
            if (lottieAnimationView != null) {
                lottieAnimationView.setFrame((int) lottieAnimationView.getMinFrame());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: c */
    public final void mo59227c() {
        AbstractC33214c cVar = this.f79022j;
        if (cVar != null && cVar.mo59151e(this.f79018f)) {
            m68198a(Color.parseColor(C37699a.m76287c(this.f79019g)), 300);
            if (this.f79031t != -100 || this.f79030s != -100) {
                C39162r.m79460a("ad_ui_adjust", new C33744d().mo59980a("original_time", this.f79030s).mo59980a("real_time", this.f79031t).mo59980a("tag", 2).mo59980a("is_adjusted", this.f79033v).f79943a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: a */
    public final void mo59221a(AbstractC33202b bVar) {
        this.f79020h = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$g */
    public static final class C33274g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C33266a f79044a;

        static {
            Covode.recordClassIndex(40100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33274g(C33266a aVar) {
            this.f79044a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f79044a.mo59220a(0);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            TextView textView = this.f79044a.f79013a;
            if (textView != null) {
                textView.setTextColor(C0643b.m2378c(this.f79044a.f79023k.getContext(), R.color.a9));
            }
            ImageView imageView = this.f79044a.f79014b;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.a90);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$h */
    public static final class C33275h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C33266a f79045a;

        static {
            Covode.recordClassIndex(40101);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33275h(C33266a aVar) {
            this.f79045a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f79045a.mo59224a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: a */
    public final void mo59222a(DataCenter dataCenter) {
        this.f79035x = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_card_show_state", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$c */
    static final class View$OnClickListenerC33269c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33266a f79039a;

        static {
            Covode.recordClassIndex(40095);
        }

        View$OnClickListenerC33269c(C33266a aVar) {
            this.f79039a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33266a aVar = this.f79039a;
            AbstractC33214c cVar = aVar.f79022j;
            if (cVar != null) {
                cVar.mo59145a(aVar.f79023k.getContext(), aVar.f79018f, 2, C33271e.f79041a);
            }
        }
    }

    /* renamed from: a */
    public final void mo59220a(long j) {
        RemoteImageView remoteImageView;
        AwemeRawAd awemeRawAd = this.f79019g;
        if (awemeRawAd != null && m68199a(awemeRawAd) && (remoteImageView = this.f79015c) != null) {
            remoteImageView.postDelayed(m68201g(), j);
        }
    }

    /* renamed from: a */
    private static boolean m68199a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && !TextUtils.isEmpty(awemeRawAd.getButtonIcon())) {
            String buttonIcon = awemeRawAd.getButtonIcon();
            C89219l.m154716b(buttonIcon, "");
            if (C89361p.m154876c(buttonIcon, ".webp", false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.g.a$d */
    static final class View$OnClickListenerC33270d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33266a f79040a;

        static {
            Covode.recordClassIndex(40096);
        }

        View$OnClickListenerC33270d(C33266a aVar) {
            this.f79040a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33266a aVar = this.f79040a;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.f79021i > 250) {
                aVar.f79021i = currentTimeMillis;
                AbstractC33202b bVar = aVar.f79020h;
                if (bVar != null) {
                    AwemeRawAd awemeRawAd = null;
                    if (bVar.mo59134e()) {
                        bVar.mo59133d();
                        Aweme aweme = aVar.f79018f;
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        C18129a.m33746a("draw_ad", "close", awemeRawAd).mo28900b("refer", "button_icon").mo28901b();
                        return;
                    }
                    String a = bVar.mo59130a();
                    if (a == null || a.length() == 0) {
                        bVar.mo59131b();
                    } else {
                        bVar.mo59132c();
                    }
                    Aweme aweme2 = aVar.f79018f;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    C18129a.m33746a("draw_ad", "otherclick", awemeRawAd).mo28900b("refer", "button_icon").mo28901b();
                }
            }
        }
    }

    public C33266a(View view) {
        C89219l.m154721d(view, "");
        this.f79023k = view;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        this.f79022j = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
        this.f79036y = view.findViewById(R.id.bpm);
        this.f79037z = C89250i.m154773a((AbstractC89171a) new C33272f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        AbstractC33214c cVar = this.f79022j;
        if (cVar != null && cVar.mo59147a(this.f79019g) && bVar2 != null && (str = bVar2.f80277a) != null && str.hashCode() == -1709001895 && str.equals("ad_feed_card_show_state")) {
            Boolean bool = (Boolean) bVar2.mo60212a();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                LottieAnimationView lottieAnimationView = this.f79027p;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setSpeed(1.0f);
                }
                LottieAnimationView lottieAnimationView2 = this.f79027p;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.mo5826a();
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView3 = this.f79027p;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setSpeed(-1.0f);
            }
            LottieAnimationView lottieAnimationView4 = this.f79027p;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.mo5826a();
            }
        }
    }

    /* renamed from: a */
    public final void mo59224a(boolean z) {
        RemoteImageView remoteImageView;
        float f;
        LottieAnimationView lottieAnimationView = this.f79027p;
        float f2 = 1.0f;
        if (lottieAnimationView != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            lottieAnimationView.setAlpha(f);
        }
        if (m68199a(this.f79019g) && (remoteImageView = this.f79015c) != null) {
            if (!z) {
                f2 = 0.5f;
            }
            remoteImageView.setAlpha(f2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: a */
    public final void mo59223a(Aweme aweme) {
        AbstractC33214c cVar;
        String str;
        MethodCollector.m26663i(7507);
        int i = 8;
        String str2 = null;
        if (aweme == null || (cVar = this.f79022j) == null || !cVar.mo59147a(aweme.getAwemeRawAd())) {
            this.f79018f = null;
            this.f79019g = null;
            View view = this.f79024m;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f79036y;
            if (view2 != null) {
                view2.setVisibility(8);
                MethodCollector.m26664o(7507);
                return;
            }
            MethodCollector.m26664o(7507);
            return;
        }
        this.f79018f = aweme;
        this.f79019g = aweme.getAwemeRawAd();
        if (this.f79024m == null) {
            View findViewById = this.f79023k.findViewById(R.id.b3d);
            C89219l.m154716b(findViewById, "");
            View inflate = View.inflate(this.f79023k.getContext(), R.layout.af6, (FrameLayout) findViewById);
            this.f79025n = inflate.findViewById(R.id.emv);
            this.f79026o = inflate.findViewById(R.id.a1t);
            this.f79013a = (TextView) inflate.findViewById(R.id.emy);
            this.f79014b = (ImageView) inflate.findViewById(R.id.emw);
            this.f79027p = (LottieAnimationView) inflate.findViewById(R.id.a1u);
            this.f79024m = inflate.findViewById(R.id.emx);
            RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.dkp);
            this.f79015c = remoteImageView;
            if (remoteImageView != null) {
                if (m68199a(this.f79019g)) {
                    RemoteImageView remoteImageView2 = this.f79015c;
                    AwemeRawAd awemeRawAd = this.f79019g;
                    if (awemeRawAd != null) {
                        str2 = awemeRawAd.getButtonIcon();
                    }
                    C34577e.m70599a(remoteImageView2, str2);
                    i = 0;
                }
                remoteImageView.setVisibility(i);
            }
            View view3 = this.f79025n;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC33269c(this));
            }
            View view4 = this.f79026o;
            if (view4 != null) {
                view4.setOnClickListener(new View$OnClickListenerC33270d(this));
            }
        }
        View view5 = this.f79024m;
        if (view5 != null) {
            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
            Context context = this.f79023k.getContext();
            C89219l.m154716b(context, "");
            layoutParams.width = C33198a.m68051a(context);
            view5.setLayoutParams(layoutParams);
        }
        TextView textView = this.f79013a;
        if (textView != null) {
            AbstractC33214c cVar2 = this.f79022j;
            if (cVar2 == null || (str = cVar2.mo59143a(this.f79023k.getContext(), this.f79018f)) == null) {
                str = this.f79023k.getContext().getString(R.string.ok);
                C89219l.m154716b(str, "");
            }
            Aweme aweme2 = this.f79018f;
            if (aweme2 == null || !aweme2.isAppAd()) {
                AbstractC33214c cVar3 = this.f79022j;
                if (cVar3 != null && cVar3.mo59151e(this.f79018f)) {
                    str = this.f79023k.getContext().getString(R.string.a6n, str);
                }
                C89219l.m154716b(str, "");
            }
            textView.setText(str);
        }
        View view6 = this.f79024m;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        View view7 = this.f79036y;
        if (view7 != null) {
            ViewGroup.LayoutParams layoutParams2 = view7.getLayoutParams();
            layoutParams2.height = (int) C13628n.m24520b(this.f79023k.getContext(), 10.0f);
            layoutParams2.width = (int) C13628n.m24520b(this.f79023k.getContext(), 1.0f);
            view7.setLayoutParams(layoutParams2);
            view7.setVisibility(0);
            MethodCollector.m26664o(7507);
            return;
        }
        MethodCollector.m26664o(7507);
    }

    /* renamed from: a */
    private final void m68198a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable.setCornerRadius(C13628n.m24520b(this.f79023k.getContext(), 2.0f));
        gradientDrawable2.setCornerRadius(C13628n.m24520b(this.f79023k.getContext(), 2.0f));
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            gradientDrawable2.setColor(i);
            View view = this.f79025n;
            if (view != null) {
                view.setBackground(gradientDrawable);
            }
            View view2 = this.f79026o;
            if (view2 != null) {
                view2.setBackground(gradientDrawable2);
            }
            AbstractC33214c cVar = this.f79022j;
            if (cVar == null || !cVar.mo59151e(this.f79018f)) {
                TextView textView = this.f79013a;
                if (textView != null) {
                    textView.setTextColor(C0643b.m2378c(this.f79023k.getContext(), R.color.a9));
                }
                ImageView imageView = this.f79014b;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.a90);
                }
                mo59224a(true);
                return;
            }
            TextView textView2 = this.f79013a;
            if (textView2 != null) {
                textView2.setTextColor(C0643b.m2378c(this.f79023k.getContext(), R.color.ac));
            }
            ImageView imageView2 = this.f79014b;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.a8z);
            }
            mo59224a(false);
            return;
        }
        gradientDrawable.setColor(m68202h());
        gradientDrawable2.setColor(m68202h());
        long j = (long) i2;
        C38545a.m78164a(this.f79025n, gradientDrawable, m68202h(), i, j, new C33274g(this));
        C38545a.m78164a(this.f79026o, gradientDrawable2, m68202h(), i, j, new C33275h(this));
        AbstractC33214c cVar2 = this.f79022j;
        if (cVar2 == null || !cVar2.mo59151e(this.f79018f)) {
            TextView textView3 = this.f79013a;
            if (textView3 != null) {
                textView3.setTextColor(C0643b.m2378c(this.f79023k.getContext(), R.color.a9));
            }
            ImageView imageView3 = this.f79014b;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.a90);
            }
            mo59224a(true);
            return;
        }
        TextView textView4 = this.f79013a;
        if (textView4 != null) {
            textView4.setTextColor(C0643b.m2378c(this.f79023k.getContext(), R.color.ac));
        }
        ImageView imageView4 = this.f79014b;
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.a8z);
        }
        mo59224a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: a */
    public final void mo59219a(int i, int i2, int i3) {
        this.f79028q = i;
        this.f79029r = i2;
        this.f79032u = i3;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b
    /* renamed from: b */
    public final void mo59226b(int i, int i2, int i3) {
        this.f79030s = i;
        this.f79031t = i2;
        this.f79033v = i3;
    }
}
