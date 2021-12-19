package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m */
public final class C71397m {

    /* renamed from: a */
    public AbstractC71396l f159984a;

    /* renamed from: b */
    public ImageView f159985b;

    /* renamed from: c */
    public boolean f159986c = true;

    /* renamed from: d */
    public final Activity f159987d;

    /* renamed from: e */
    private View f159988e;

    /* renamed from: f */
    private LinearLayout f159989f;

    /* renamed from: g */
    private final long f159990g = 250;

    /* renamed from: h */
    private int f159991h;

    /* renamed from: i */
    private final int f159992i = 568;

    /* renamed from: j */
    private final int f159993j = 720;

    /* renamed from: k */
    private final int f159994k;

    /* renamed from: l */
    private final int f159995l;

    /* renamed from: m */
    private final int f159996m;

    /* renamed from: n */
    private final ViewGroup f159997n;

    /* renamed from: o */
    private final List<View> f159998o;

    static {
        Covode.recordClassIndex(83925);
    }

    /* renamed from: e */
    private final void m126102e() {
        if (this.f159986c) {
            ImageView imageView = this.f159985b;
            if (imageView != null) {
                imageView.setRotation(180.0f);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f159985b;
        if (imageView2 != null) {
            imageView2.setRotation(0.0f);
        }
    }

    /* renamed from: c */
    public final void mo112879c() {
        LinearLayout linearLayout;
        if (!this.f159986c && (linearLayout = this.f159989f) != null) {
            m126102e();
            ValueAnimator a = m126099a((View) linearLayout, this.f159991h, 0);
            a.addListener(new C71399b(linearLayout, this));
            ObjectAnimator a2 = m126098a((View) linearLayout, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a, a2);
            animatorSet.start();
        }
    }

    /* renamed from: d */
    private final void m126101d() {
        MethodCollector.m26663i(11808);
        View view = this.f159988e;
        if (view == null) {
            C89219l.m154710a("toolbarRootView");
        }
        this.f159989f = (LinearLayout) view.findViewById(R.id.b64);
        int i = 0;
        List<View> list = this.f159998o;
        for (T t : list.subList(this.f159996m, list.size())) {
            LinearLayout linearLayout = this.f159989f;
            if (linearLayout != null) {
                linearLayout.addView(t);
            }
            if (i != 0) {
                m126100a(t);
            }
            i++;
        }
        MethodCollector.m26664o(11808);
    }

    /* renamed from: b */
    public final void mo112878b() {
        LinearLayout linearLayout;
        AbstractC71396l lVar = this.f159984a;
        if (lVar != null) {
            lVar.mo112876a();
        }
        if (this.f159986c && (linearLayout = this.f159989f) != null) {
            m126102e();
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.f159991h = measuredHeight;
            ValueAnimator a = m126099a((View) linearLayout, 0, measuredHeight);
            a.addListener(new C71402e(linearLayout, this));
            ObjectAnimator a2 = m126098a((View) linearLayout, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(a, a2);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo112877a() {
        MethodCollector.m26663i(11804);
        if (!this.f159998o.isEmpty()) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f159987d), R.layout.yc, this.f159997n, false);
            C89219l.m154716b(a, "");
            this.f159988e = a;
            if (a == null) {
                C89219l.m154710a("toolbarRootView");
            }
            MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) a.findViewById(R.id.dq6);
            if (this.f159994k > this.f159992i) {
                if (!C82306a.m142357a()) {
                    maxHeightScrollView.setMaxHeightDp(this.f159994k);
                }
                if (C82306a.m142357a()) {
                    if (this.f159994k > this.f159993j) {
                        maxHeightScrollView.setMaxHeightDp(560);
                    } else {
                        maxHeightScrollView.setMaxHeightDp(408);
                    }
                }
            }
            View view = this.f159988e;
            if (view == null) {
                C89219l.m154710a("toolbarRootView");
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.b37);
            int min = Math.min(this.f159996m - 1, this.f159998o.size() - 1);
            if (min >= 0) {
                int i = 0;
                while (true) {
                    View view2 = this.f159998o.get(i);
                    linearLayout.addView(view2);
                    if (i > 0) {
                        m126100a(view2);
                    }
                    if (i == min) {
                        break;
                    }
                    i++;
                }
            }
            if (this.f159998o.size() == this.f159995l) {
                linearLayout.addView(this.f159998o.get(this.f159996m));
                m126100a(this.f159998o.get(this.f159996m));
            } else if (this.f159998o.size() > this.f159995l) {
                View view3 = this.f159988e;
                if (view3 == null) {
                    C89219l.m154710a("toolbarRootView");
                }
                ImageView imageView = (ImageView) view3.findViewById(R.id.ekh);
                this.f159985b = imageView;
                if (imageView != null) {
                    imageView.setImageResource(2131232274);
                }
                ImageView imageView2 = this.f159985b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ImageView imageView3 = this.f159985b;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new View$OnClickListenerC71400c(this));
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            ViewGroup viewGroup = this.f159997n;
            View view4 = this.f159988e;
            if (view4 == null) {
                C89219l.m154710a("toolbarRootView");
            }
            viewGroup.addView(view4, layoutParams);
            ImageView imageView4 = this.f159985b;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View$OnClickListenerC71401d(this));
            }
        }
        if (this.f159998o.size() > this.f159995l) {
            m126101d();
        }
        MethodCollector.m26664o(11804);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m$b */
    public static final class C71399b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f160000a;

        /* renamed from: b */
        final /* synthetic */ C71397m f160001b;

        static {
            Covode.recordClassIndex(83927);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f160001b.f159986c = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f160000a.setVisibility(8);
            this.f160001b.f159986c = true;
        }

        C71399b(LinearLayout linearLayout, C71397m mVar) {
            this.f160000a = linearLayout;
            this.f160001b = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m$e */
    public static final class C71402e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f160004a;

        /* renamed from: b */
        final /* synthetic */ C71397m f160005b;

        static {
            Covode.recordClassIndex(83930);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f160005b.f159986c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f160005b.f159986c = false;
        }

        public final void onAnimationStart(Animator animator) {
            ViewGroup.LayoutParams layoutParams = this.f160004a.getLayoutParams();
            layoutParams.height = 0;
            this.f160004a.setLayoutParams(layoutParams);
            this.f160004a.setVisibility(0);
        }

        C71402e(LinearLayout linearLayout, C71397m mVar) {
            this.f160004a = linearLayout;
            this.f160005b = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m$c */
    static final class View$OnClickListenerC71400c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71397m f160002a;

        static {
            Covode.recordClassIndex(83928);
        }

        View$OnClickListenerC71400c(C71397m mVar) {
            this.f160002a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C71397m mVar = this.f160002a;
            C89219l.m154716b(view, "");
            mVar.mo112878b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m$d */
    static final class View$OnClickListenerC71401d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C71397m f160003a;

        static {
            Covode.recordClassIndex(83929);
        }

        View$OnClickListenerC71401d(C71397m mVar) {
            this.f160003a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f160003a.f159986c) {
                C71397m mVar = this.f160003a;
                C89219l.m154716b(view, "");
                mVar.mo112878b();
                return;
            }
            this.f160003a.mo112879c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.m$a */
    public static final class C71398a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f159999a;

        static {
            Covode.recordClassIndex(83926);
        }

        C71398a(View view) {
            this.f159999a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup.LayoutParams layoutParams = this.f159999a.getLayoutParams();
            layoutParams.height = intValue;
            this.f159999a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private final void m126100a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C13628n.m24520b(this.f159987d, 12.0f);
    }

    /* renamed from: a */
    private final ObjectAnimator m126098a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(this.f159990g);
        return ofFloat;
    }

    /* renamed from: a */
    private final ValueAnimator m126099a(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(this.f159990g);
        ofInt.addUpdateListener(new C71398a(view));
        return ofInt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends android.view.View> */
    /* JADX WARN: Multi-variable type inference failed */
    public C71397m(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(activity, "");
        this.f159997n = viewGroup;
        this.f159998o = list;
        this.f159987d = activity;
        double e = (double) C70636dh.m124836e(activity);
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(e);
        Double.isNaN(d);
        int i = (int) ((e / d) + 0.5d);
        this.f159994k = i;
        int i2 = 9;
        if (!C82306a.m142357a()) {
            if (i > 568) {
                i2 = Integer.MAX_VALUE;
            }
            i2 = 4;
        } else {
            if (i > 720) {
                if (list.size() > 9) {
                    i2 = 7;
                }
            }
            i2 = 4;
        }
        this.f159995l = i2;
        this.f159996m = i2 - 1;
    }
}
