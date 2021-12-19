package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48253g;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar */
public final class AdPopUpWebNaviBar extends RelativeLayout {

    /* renamed from: a */
    boolean f89614a;

    /* renamed from: b */
    private Animator f89615b;

    /* renamed from: c */
    private boolean f89616c;

    /* renamed from: d */
    private AbstractC37937a f89617d;

    /* renamed from: e */
    private HashMap f89618e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar$a */
    public interface AbstractC37937a {
        static {
            Covode.recordClassIndex(45393);
        }

        /* renamed from: a */
        void mo66094a();

        /* renamed from: b */
        void mo66095b();
    }

    static {
        Covode.recordClassIndex(45390);
    }

    public AdPopUpWebNaviBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m76902a(int i) {
        if (this.f89618e == null) {
            this.f89618e = new HashMap();
        }
        View view = (View) this.f89618e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89618e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AbstractC37937a getNaviBarListener() {
        return this.f89617d;
    }

    public final int getBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f89615b;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: a */
    public final void mo66083a() {
        if (!this.f89616c) {
            Animator animator = this.f89615b;
            if ((animator == null || !animator.isRunning()) && !this.f89614a) {
                this.f89616c = true;
                this.f89614a = true;
                m76903b(C34728n.m70946a(-52.0d), 0);
            }
        }
    }

    public final void setNaviBarListener(AbstractC37937a aVar) {
        this.f89617d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar$b */
    public static final class C37938b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebNaviBar f89621a;

        static {
            Covode.recordClassIndex(45394);
        }

        C37938b(AdPopUpWebNaviBar adPopUpWebNaviBar) {
            this.f89621a = adPopUpWebNaviBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdPopUpWebNaviBar adPopUpWebNaviBar = this.f89621a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            adPopUpWebNaviBar.setBottomMargin(((Integer) animatedValue).intValue());
        }
    }

    public final void setBottomMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        setLayoutParams(marginLayoutParams);
    }

    public final void setGoBackEnable(boolean z) {
        float f;
        TuxIconView tuxIconView = (TuxIconView) m76902a(R.id.d4a);
        C89219l.m154716b(tuxIconView, "");
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        tuxIconView.setAlpha(f);
    }

    public final void setGoForwardEnable(boolean z) {
        float f;
        TuxIconView tuxIconView = (TuxIconView) m76902a(R.id.d4b);
        C89219l.m154716b(tuxIconView, "");
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        tuxIconView.setAlpha(f);
    }

    /* renamed from: b */
    private final void m76903b(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new C37938b(this));
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new C48253g());
        ofInt.setTarget(this);
        ofInt.start();
        this.f89615b = ofInt;
    }

    /* renamed from: a */
    public final void mo66084a(int i, int i2) {
        if (getVisibility() != 8) {
            if (i - i2 <= 0) {
                mo66083a();
            } else if (this.f89616c) {
                Animator animator = this.f89615b;
                if ((animator == null || !animator.isRunning()) && !this.f89614a) {
                    this.f89616c = false;
                    this.f89614a = true;
                    m76903b(0, C34728n.m70946a(-52.0d));
                }
            }
        }
    }

    private /* synthetic */ AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3237);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bj1, this, true);
        ((TuxIconView) m76902a(R.id.d4a)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.View$OnClickListenerC379351 */

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebNaviBar f89619a;

            static {
                Covode.recordClassIndex(45391);
            }

            {
                this.f89619a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC37937a naviBarListener = this.f89619a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.mo66094a();
                }
            }
        });
        ((TuxIconView) m76902a(R.id.d4b)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebNaviBar.View$OnClickListenerC379362 */

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebNaviBar f89620a;

            static {
                Covode.recordClassIndex(45392);
            }

            {
                this.f89620a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC37937a naviBarListener = this.f89620a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.mo66095b();
                }
            }
        });
        MethodCollector.m26664o(3237);
    }
}
