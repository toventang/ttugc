package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C33931ar;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.PreDrawableInflate;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.m */
public class C53348m extends AbstractC53316a {

    /* renamed from: c */
    protected ImageView f122464c;

    /* renamed from: d */
    protected ImageView f122465d;

    /* renamed from: e */
    protected ImageView f122466e;

    /* renamed from: f */
    protected TextView f122467f;

    /* renamed from: g */
    protected ImageView f122468g;

    /* renamed from: h */
    protected TuxTextView f122469h;

    /* renamed from: i */
    protected PreDrawableInflate f122470i;

    /* renamed from: j */
    protected boolean f122471j = false;

    /* renamed from: k */
    protected boolean f122472k = false;

    /* renamed from: l */
    private C33931ar f122473l;

    static {
        Covode.recordClassIndex(62910);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: n */
    public final void mo89768n() {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: o */
    public final void mo89769o() {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    public ImageView getRefreshIcon() {
        return this.f122468g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: p */
    public final void mo89770p() {
        mo89798q();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: b */
    public final void mo89753b() {
        if (m98414a(false, this.f122472k, false)) {
            mo89798q();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: c */
    public final void mo89754c() {
        if (m98414a(false, this.f122472k, false)) {
            mo89798q();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: e */
    public final void mo89756e() {
        if (m98414a(true, this.f122472k, false)) {
            mo89798q();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: f */
    public final void mo89757f() {
        if (m98414a(true, this.f122472k, false)) {
            mo89798q();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: j */
    public final void mo89764j() {
        m98413a(this.f122466e, 0, new CallableC53354p(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: k */
    public final void mo89765k() {
        m98413a(this.f122466e, 0, new CallableC53355q(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: l */
    public final void mo89766l() {
        m98413a(this.f122466e, 8, new CallableC53356r(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: m */
    public final void mo89767m() {
        m98413a(this.f122466e, 8, new CallableC53357s(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo89819r() {
        MethodCollector.m26663i(1696);
        if (this.f122464c == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122464c = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int b = (int) C13628n.m24520b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f122464c.setLayoutParams(layoutParams);
            addView(this.f122464c);
        }
        ImageView imageView2 = this.f122464c;
        MethodCollector.m26664o(1696);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final View mo89821t() {
        MethodCollector.m26663i(1710);
        if (this.f122465d == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122465d = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int b = (int) C13628n.m24520b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f122465d.setLayoutParams(layoutParams);
            addView(this.f122465d);
        }
        ImageView imageView2 = this.f122465d;
        MethodCollector.m26664o(1710);
        return imageView2;
    }

    /* renamed from: x */
    private View m98415x() {
        MethodCollector.m26663i(1772);
        if (this.f122468g == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122468g = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f122468g.setImageDrawable(this.f122470i.mo89730a(2131232126, getContext()));
            int b = (int) C13628n.m24520b(getContext(), 36.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f122468g.setLayoutParams(layoutParams);
            addView(this.f122468g);
        }
        ImageView imageView2 = this.f122468g;
        MethodCollector.m26664o(1772);
        return imageView2;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: i */
    public final void mo89762i() {
        m98415x();
        mo89819r();
        mo89821t();
        mo89820s();
        this.f122468g.setVisibility(8);
        this.f122468g.setAlpha(1.0f);
        ImageView imageView = this.f122464c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f122465d;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (isSelected()) {
            ImageView imageView3 = this.f122464c;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            ImageView imageView4 = this.f122465d;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f122464c;
        if (imageView5 != null) {
            imageView5.setAlpha(0.0f);
        }
        ImageView imageView6 = this.f122465d;
        if (imageView6 != null) {
            imageView6.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ View mo89822u() {
        MethodCollector.m26663i(1829);
        if (this.f122466e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122466e = imageView;
            imageView.setImageDrawable(this.f122470i.mo89730a(R.drawable.aag, getContext()));
            int a = C34728n.m70946a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            this.f122466e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(C34728n.m70946a(12.0d), C34728n.m70946a(4.0d), 0, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(C34728n.m70946a(12.0d));
            layoutParams.gravity = 49;
            this.f122466e.setLayoutParams(layoutParams);
            addView(this.f122466e);
        }
        ImageView imageView2 = this.f122466e;
        MethodCollector.m26664o(1829);
        return imageView2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ View mo89823v() {
        MethodCollector.m26663i(1834);
        if (this.f122466e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122466e = imageView;
            imageView.setImageDrawable(this.f122470i.mo89730a(R.drawable.aag, getContext()));
            int a = C34728n.m70946a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            this.f122466e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(C34728n.m70946a(16.0d), C34728n.m70946a(4.0d), 0, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(C34728n.m70946a(16.0d));
            layoutParams.gravity = 49;
            this.f122466e.setLayoutParams(layoutParams);
            addView(this.f122466e);
        }
        ImageView imageView2 = this.f122466e;
        MethodCollector.m26664o(1834);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: h */
    public final void mo89761h() {
        m98415x();
        mo89819r();
        mo89821t();
        mo89820s();
        this.f122468g.setVisibility(0);
        this.f122468g.setLayerType(2, null);
        m98413a(this.f122464c, 8, new CallableC53352n(this));
        m98413a(this.f122465d, 8, new CallableC53353o(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m.C533491 */

            static {
                Covode.recordClassIndex(62911);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C53348m.this.f122468g.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m.C533502 */

            static {
                Covode.recordClassIndex(62912);
            }

            public final void onAnimationRepeat(Animator animator) {
                if (!C53348m.this.f122393a) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!C53348m.this.isSelected()) {
                    C53348m.m98413a(C53348m.this.f122465d, 0, new CallableC53360v(C53348m.this));
                } else {
                    C53348m.m98413a(C53348m.this.f122464c, 0, new CallableC53361w(C53348m.this));
                }
                if (C53348m.this.f122464c != null) {
                    C53348m.this.f122464c.setVisibility(0);
                }
                if (C53348m.this.f122465d != null) {
                    C53348m.this.f122465d.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53348m.C533513 */

            static {
                Covode.recordClassIndex(62913);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C53348m.this.f122468g.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C53348m.this.f122468g.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f122468g.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo89798q() {
        boolean z = this.f122471j;
        boolean z2 = this.f122472k;
        if (z) {
            mo89819r();
            mo89820s();
            this.f122469h.setTuxFont(93);
            C33931ar arVar = this.f122473l;
            if (arVar != null) {
                this.f122464c.setImageDrawable(this.f122470i.mo89730a(arVar.f80244b, getContext()));
            }
            this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            this.f122464c.setAlpha(1.0f);
            ImageView imageView = this.f122465d;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
                return;
            }
            return;
        }
        mo89821t();
        mo89820s();
        this.f122469h.setTuxFont(92);
        if (z2) {
            this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.c5));
        } else {
            this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.aa));
        }
        C33931ar arVar2 = this.f122473l;
        if (arVar2 != null) {
            if (z2) {
                this.f122465d.setImageDrawable(this.f122470i.mo89730a(arVar2.f80247e, getContext()));
            } else {
                this.f122465d.setImageDrawable(this.f122470i.mo89730a(arVar2.f80248f, getContext()));
            }
        }
        ImageView imageView2 = this.f122464c;
        if (imageView2 != null) {
            imageView2.setAlpha(0.0f);
        }
        this.f122465d.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final View mo89820s() {
        if (this.f122469h == null) {
            TuxTextView tuxTextView = new TuxTextView(getContext());
            this.f122469h = tuxTextView;
            tuxTextView.setTuxFont(92);
            this.f122469h.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f122469h.setLetterSpacing(0.01f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            this.f122469h.setGravity(17);
            this.f122469h.setSingleLine(true);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) C13628n.m24520b(getContext(), 4.0f);
            this.f122469h.setLayoutParams(layoutParams);
            addView(this.f122469h);
            C33931ar arVar = this.f122473l;
            if (arVar != null) {
                this.f122469h.setText(arVar.f100355i);
            } else {
                this.f122469h.setText("");
            }
            if (this.f122469h.getText().toString().length() > 16 && this.f122469h.getPaint().measureText(this.f122469h.getText().toString()) > 230.0f) {
                this.f122469h.setTextSize(1, 8.0f);
            }
        }
        return this.f122469h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ View mo89824w() {
        if (this.f122467f == null) {
            TuxTextView tuxTextView = new TuxTextView(getContext());
            tuxTextView.setBackground(this.f122470i.mo89730a(R.drawable.a_m, getContext()));
            tuxTextView.setClickable(false);
            tuxTextView.setGravity(17);
            tuxTextView.setLines(1);
            tuxTextView.setTextSize(1, 12.0f);
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.l));
            tuxTextView.setPadding(C34728n.m70946a(5.0d), 0, C34728n.m70946a(5.0d), 0);
            tuxTextView.setTuxFont(72);
            tuxTextView.setMinWidth(C34728n.m70946a(16.0d));
            tuxTextView.setMinHeight(C34728n.m70946a(16.0d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(C34728n.m70946a(13.0d), C34728n.m70946a(2.0d), 0, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(C34728n.m70946a(13.0d));
            layoutParams.gravity = 49;
            tuxTextView.setLayoutParams(layoutParams);
            addView(tuxTextView);
            this.f122467f = tuxTextView;
        }
        return this.f122467f;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    public void setActivated(boolean z) {
        super.setActivated(z);
        ImageView imageView = this.f122465d;
        if (imageView != null) {
            imageView.setSelected(z);
            this.f122465d.invalidate();
        }
        if (m98414a(this.f122471j, z, true)) {
            mo89798q();
        }
    }

    public C53348m(C33931ar arVar) {
        super(arVar.f100353g, arVar.f100354h);
        this.f122473l = arVar;
        this.f122470i = (PreDrawableInflate) C58221f.m105149b(PreDrawableInflate.class);
        mo89819r();
        if (m98414a(arVar.f80245c, arVar.f80246d, true)) {
            mo89798q();
        }
        setId(arVar.f80243a);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: a */
    public final void mo89751a(int i) {
        String valueOf;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i <= 0) {
                m98413a(this.f122467f, 8, new CallableC53358t(this));
                return;
            }
            m98413a(this.f122467f, 0, new CallableC53359u(this));
            if (i > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i);
            }
            this.f122467f.setText(valueOf);
        }
    }

    /* renamed from: a */
    public static void m98413a(View view, int i, Callable<View> callable) {
        if (i == 4 || i == 0) {
            if (view == null) {
                try {
                    view = callable.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            view.setVisibility(i);
        } else if (i == 8 && view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private boolean m98414a(boolean z, boolean z2, boolean z3) {
        boolean z4 = this.f122471j;
        if (z4 == z && this.f122472k == z2 && !z3) {
            return false;
        }
        if (z4 != z || z3) {
            this.f122471j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f122472k = z2;
        } else if (this.f122472k != z2) {
            this.f122472k = z2;
            if (!this.f122471j) {
                return true;
            }
        }
        return z3;
    }
}
