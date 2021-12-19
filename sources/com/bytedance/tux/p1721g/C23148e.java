package com.bytedance.tux.p1721g;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.bytedance.tux.p1710c.C23008e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.g.e */
public final class C23148e extends PopupWindow implements AbstractC23143a {

    /* renamed from: a */
    public final Context f54792a;

    /* renamed from: b */
    public final View f54793b;

    /* renamed from: c */
    private View f54794c;

    /* renamed from: d */
    private final C23146c f54795d;

    static {
        Covode.recordClassIndex(27077);
    }

    @Override // com.bytedance.tux.p1721g.AbstractC23143a
    /* renamed from: a */
    public final C23146c mo37630a() {
        return this.f54795d;
    }

    /* renamed from: c */
    public final void mo37645c() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.g.e$a */
    public static final class RunnableC23149a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23148e f54796a;

        static {
            Covode.recordClassIndex(27078);
        }

        RunnableC23149a(C23148e eVar) {
            this.f54796a = eVar;
        }

        public final void run() {
            this.f54796a.mo37645c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.g.e$b */
    public static final class RunnableC23150b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23148e f54797a;

        static {
            Covode.recordClassIndex(27079);
        }

        RunnableC23150b(C23148e eVar) {
            this.f54797a = eVar;
        }

        public final void run() {
            this.f54797a.dismiss();
        }
    }

    @Override // com.bytedance.tux.p1721g.AbstractC23143a
    public final void dismiss() {
        if (this.f54795d.f54786g) {
            m43623a(false);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC23149a(this), 500);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo37644b() {
        try {
            this.f54795d.f54780a = Long.valueOf(System.currentTimeMillis() + this.f54795d.f54784e);
            View view = this.f54794c;
            if (view == null) {
                C89219l.m154710a("root");
            }
            int i = 0;
            view.measure(0, 0);
            showAtLocation(this.f54793b, 80, 0, 0);
            if (this.f54795d.f54785f) {
                m43623a(true);
            } else {
                View view2 = this.f54794c;
                if (view2 == null) {
                    C89219l.m154710a("root");
                }
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.ejz);
                C89219l.m154709a((Object) frameLayout, "");
                frameLayout.setAlpha(1.0f);
                View view3 = this.f54794c;
                if (view3 == null) {
                    C89219l.m154710a("root");
                }
                FrameLayout frameLayout2 = (FrameLayout) view3.findViewById(R.id.ejz);
                C89219l.m154709a((Object) frameLayout2, "");
                Context context = this.f54792a;
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = context.getResources().getDimensionPixelSize(identifier);
                }
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                frameLayout2.setTranslationY(((float) i) + TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC23150b(this), this.f54795d.f54784e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final void m43623a(boolean z) {
        float translationY;
        float f;
        float f2;
        int i;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator a = C22971a.m43305a();
        Interpolator b = C22971a.m43306b();
        View view = this.f54794c;
        if (view == null) {
            C89219l.m154710a("root");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ejz);
        float f3 = 0.0f;
        if (z) {
            f2 = 1.0f;
            C89219l.m154709a((Object) frameLayout, "");
            translationY = -((float) frameLayout.getMeasuredHeight());
            Context context = this.f54792a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            float f4 = (float) i;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            f = f4 + TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics());
        } else {
            C89219l.m154709a((Object) frameLayout, "");
            f3 = frameLayout.getAlpha();
            translationY = frameLayout.getTranslationY();
            f = -((float) frameLayout.getMeasuredHeight());
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, "alpha", f3, f2).setDuration(300L);
        if (!z) {
            a = b;
        }
        duration.setInterpolator(a);
        C89219l.m154709a((Object) duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout, "translationY", translationY, f).setDuration(500L);
        duration2.setInterpolator(b);
        C89219l.m154709a((Object) duration2, "");
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public C23148e(Context context, View view, C23146c cVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(cVar, "");
        MethodCollector.m26663i(8397);
        this.f54792a = context;
        this.f54793b = view;
        this.f54795d = cVar;
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setTouchable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.dw, R.attr.dx, R.attr.gj, R.attr.gk, R.attr.gl}, R.attr.cf, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(2, 0);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, R.layout.x);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null);
        C89219l.m154709a((Object) inflate, "");
        this.f54794c = inflate;
        if (inflate == null) {
            C89219l.m154710a("root");
        }
        setContentView(inflate);
        View view2 = this.f54794c;
        if (view2 == null) {
            C89219l.m154710a("root");
        }
        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.ejz);
        C89219l.m154709a((Object) frameLayout, "");
        C23008e eVar = new C23008e();
        eVar.f54462a = Integer.valueOf(color);
        eVar.f54464c = Float.valueOf(dimension);
        frameLayout.setBackground(eVar.mo37389a(context));
        View view3 = this.f54794c;
        if (view3 == null) {
            C89219l.m154710a("root");
        }
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.cj9);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(color2);
        tuxTextView.setText(cVar.f54781b);
        View view4 = this.f54794c;
        if (view4 == null) {
            C89219l.m154710a("root");
        }
        TuxIconView tuxIconView = (TuxIconView) view4.findViewById(R.id.bh1);
        Integer num = cVar.f54782c;
        if (num == null) {
            tuxIconView.setVisibility(8);
            View view5 = this.f54794c;
            if (view5 == null) {
                C89219l.m154710a("root");
            }
            TuxTextView tuxTextView2 = (TuxTextView) view5.findViewById(R.id.cj9);
            C89219l.m154709a((Object) tuxTextView2, "");
            tuxTextView2.setGravity(17);
        } else {
            tuxIconView.setIconRes(num.intValue());
            tuxIconView.setVisibility(0);
        }
        Integer num2 = cVar.f54783d;
        if (num2 != null) {
            tuxIconView.setTintColor(num2.intValue());
            MethodCollector.m26664o(8397);
            return;
        }
        MethodCollector.m26664o(8397);
    }
}
