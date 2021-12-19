package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p */
public final class C52421p {

    /* renamed from: a */
    public AbstractC52411l f120727a;

    /* renamed from: b */
    public View f120728b;

    /* renamed from: c */
    public boolean f120729c = true;

    /* renamed from: d */
    final List<View> f120730d;

    /* renamed from: e */
    public final Activity f120731e;

    /* renamed from: f */
    private View f120732f;

    /* renamed from: g */
    private LinearLayout f120733g;

    /* renamed from: h */
    private final long f120734h = 250;

    /* renamed from: i */
    private int f120735i;

    /* renamed from: j */
    private final ViewGroup f120736j;

    static {
        Covode.recordClassIndex(61813);
    }

    /* renamed from: e */
    private final void m97321e() {
        if (this.f120729c) {
            View view = this.f120728b;
            if (view != null) {
                view.setRotation(180.0f);
                return;
            }
            return;
        }
        View view2 = this.f120728b;
        if (view2 != null) {
            view2.setRotation(0.0f);
        }
    }

    /* renamed from: c */
    public final void mo88180c() {
        LinearLayout linearLayout;
        if (this.f120729c && (linearLayout = this.f120733g) != null) {
            m97321e();
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.f120735i = measuredHeight;
            ValueAnimator a = m97319a((View) linearLayout, 0, measuredHeight);
            a.addListener(new C52426e(linearLayout, this));
            ObjectAnimator a2 = m97318a((View) linearLayout, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a, a2);
            animatorSet.start();
        }
    }

    /* renamed from: d */
    public final void mo88181d() {
        LinearLayout linearLayout;
        if (!this.f120729c && (linearLayout = this.f120733g) != null) {
            m97321e();
            ValueAnimator a = m97319a((View) linearLayout, this.f120735i, 0);
            a.addListener(new C52423b(linearLayout, this));
            ObjectAnimator a2 = m97318a((View) linearLayout, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a, a2);
            animatorSet.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo88179b() {
        MethodCollector.m26663i(12012);
        View view = this.f120732f;
        if (view == null) {
            C89219l.m154710a("toolbarRootView");
        }
        this.f120733g = (LinearLayout) view.findViewById(R.id.b64);
        int i = 0;
        List<View> list = this.f120730d;
        for (T t : list.subList(3, list.size())) {
            LinearLayout linearLayout = this.f120733g;
            if (linearLayout != null) {
                linearLayout.addView(t);
            }
            if (i != 0) {
                m97320a(t);
            }
            i++;
        }
        MethodCollector.m26664o(12012);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88178a() {
        MethodCollector.m26663i(11867);
        View a = C1764a.m5927a(LayoutInflater.from(this.f120731e), R.layout.yc, this.f120736j, false);
        C89219l.m154716b(a, "");
        this.f120732f = a;
        if (a == null) {
            C89219l.m154710a("toolbarRootView");
        }
        LinearLayout linearLayout = (LinearLayout) a.findViewById(R.id.b37);
        int min = Math.min(2, this.f120730d.size() - 1);
        if (min >= 0) {
            int i = 0;
            while (true) {
                View view = this.f120730d.get(i);
                linearLayout.addView(view);
                if (i > 0) {
                    m97320a(view);
                }
                if (i == min) {
                    break;
                }
                i++;
            }
        }
        if (this.f120730d.size() == 4) {
            linearLayout.addView(this.f120730d.get(3));
            m97320a(this.f120730d.get(3));
        } else if (this.f120730d.size() > 4) {
            View view2 = this.f120732f;
            if (view2 == null) {
                C89219l.m154710a("toolbarRootView");
            }
            View findViewById = view2.findViewById(R.id.ekh);
            this.f120728b = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View view3 = this.f120728b;
            if (view3 != null) {
                view3.setOnClickListener(new View$OnClickListenerC52424c(this));
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        ViewGroup viewGroup = this.f120736j;
        View view4 = this.f120732f;
        if (view4 == null) {
            C89219l.m154710a("toolbarRootView");
        }
        viewGroup.addView(view4, layoutParams);
        View view5 = this.f120728b;
        if (view5 != null) {
            view5.setOnClickListener(new View$OnClickListenerC52425d(this));
            MethodCollector.m26664o(11867);
            return;
        }
        MethodCollector.m26664o(11867);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p$b */
    public static final class C52423b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f120738a;

        /* renamed from: b */
        final /* synthetic */ C52421p f120739b;

        static {
            Covode.recordClassIndex(61815);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f120739b.f120729c = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f120738a.setVisibility(8);
            this.f120739b.f120729c = true;
        }

        C52423b(LinearLayout linearLayout, C52421p pVar) {
            this.f120738a = linearLayout;
            this.f120739b = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p$e */
    public static final class C52426e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f120742a;

        /* renamed from: b */
        final /* synthetic */ C52421p f120743b;

        static {
            Covode.recordClassIndex(61818);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f120743b.f120729c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f120743b.f120729c = false;
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f120742a.getLayoutParams();
            layoutParams.height = 0;
            this.f120742a.setLayoutParams(layoutParams);
            this.f120742a.setVisibility(0);
        }

        C52426e(LinearLayout linearLayout, C52421p pVar) {
            this.f120742a = linearLayout;
            this.f120743b = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p$c */
    static final class View$OnClickListenerC52424c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52421p f120740a;

        static {
            Covode.recordClassIndex(61816);
        }

        View$OnClickListenerC52424c(C52421p pVar) {
            this.f120740a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f120740a.mo88180c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p$d */
    static final class View$OnClickListenerC52425d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52421p f120741a;

        static {
            Covode.recordClassIndex(61817);
        }

        View$OnClickListenerC52425d(C52421p pVar) {
            this.f120741a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f120741a.f120729c) {
                this.f120741a.mo88180c();
            } else {
                this.f120741a.mo88181d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.p$a */
    public static final class C52422a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f120737a;

        static {
            Covode.recordClassIndex(61814);
        }

        C52422a(View view) {
            this.f120737a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f120737a.getLayoutParams();
            layoutParams.height = intValue;
            this.f120737a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private final void m97320a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C13628n.m24520b(this.f120731e, 12.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52421p(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(activity, "");
        this.f120736j = viewGroup;
        this.f120730d = list;
        this.f120731e = activity;
    }

    /* renamed from: a */
    private final ObjectAnimator m97318a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(this.f120734h);
        return ofFloat;
    }

    /* renamed from: a */
    private final ValueAnimator m97319a(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(this.f120734h);
        ofInt.addUpdateListener(new C52422a(view));
        return ofInt;
    }
}
