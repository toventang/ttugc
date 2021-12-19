package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.PreDrawableInflate;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33928f;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.d */
public class C53332d extends AbstractC53316a {

    /* renamed from: c */
    protected ImageView f122434c;

    /* renamed from: d */
    protected ImageView f122435d;

    /* renamed from: e */
    protected ImageView f122436e;

    /* renamed from: f */
    public View f122437f;

    /* renamed from: g */
    public ImageView f122438g;

    /* renamed from: h */
    private PreDrawableInflate f122439h = ((PreDrawableInflate) C58221f.m105149b(PreDrawableInflate.class));

    /* renamed from: i */
    private boolean f122440i;

    /* renamed from: j */
    private boolean f122441j;

    /* renamed from: k */
    private boolean f122442k;

    static {
        Covode.recordClassIndex(62893);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: a */
    public final void mo89751a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    public ImageView getRefreshIcon() {
        return this.f122438g;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: b */
    public final void mo89753b() {
        if (m98379a(false, this.f122441j, false)) {
            m98378a(this.f122440i, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: e */
    public final void mo89756e() {
        if (m98379a(true, this.f122441j, false)) {
            m98378a(this.f122440i, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: j */
    public final void mo89764j() {
        mo89794a(this.f122436e, 0, new CallableC53340g(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: k */
    public final void mo89765k() {
        mo89794a(this.f122436e, 0, new CallableC53341h(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: l */
    public final void mo89766l() {
        mo89794a(this.f122436e, 8, new CallableC53344i(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: m */
    public final void mo89767m() {
        mo89794a(this.f122436e, 8, new CallableC53345j(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: c */
    public final void mo89754c() {
        if (m98379a(false, this.f122441j, false)) {
            m98378a(this.f122440i, false);
        }
        m98377a(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: f */
    public final void mo89757f() {
        if (m98379a(true, this.f122441j, false)) {
            m98378a(this.f122440i, false);
        }
        m98377a(false);
    }

    /* renamed from: r */
    public final void mo89800r() {
        ImageView imageView = this.f122434c;
        if (imageView != null) {
            imageView.setLayerType(0, null);
        }
        ImageView imageView2 = this.f122435d;
        if (imageView2 != null) {
            imageView2.setLayerType(0, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: o */
    public final void mo89769o() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && C33918a.m69450a()) {
            Boolean bool = (Boolean) this.f122435d.getTag(C33918a.f80228b);
            if (bool == null || !bool.booleanValue()) {
                mo89768n();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ImageView imageView;
        if (TextUtils.equals(getTabType(), "PUBLISH") && (imageView = this.f122435d) != null && (imageView.getDrawable() instanceof C33928f)) {
            C33928f fVar = (C33928f) this.f122435d.getDrawable();
            if (fVar.isRunning()) {
                fVar.stop();
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public View mo89795q() {
        MethodCollector.m26663i(2485);
        if (this.f122434c == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122434c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f122434c.setLayoutParams(layoutParams);
            addView(this.f122434c);
        }
        ImageView imageView2 = this.f122434c;
        MethodCollector.m26664o(2485);
        return imageView2;
    }

    /* renamed from: s */
    public final View mo89801s() {
        MethodCollector.m26663i(2758);
        if (this.f122435d == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122435d = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f122435d.setLayoutParams(layoutParams);
            addView(this.f122435d);
        }
        ImageView imageView2 = this.f122435d;
        MethodCollector.m26664o(2758);
        return imageView2;
    }

    /* renamed from: v */
    private View m98380v() {
        MethodCollector.m26663i(2767);
        if (this.f122438g == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122438g = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f122438g.setImageDrawable(this.f122439h.mo89730a(2131232126, getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f122438g.setLayoutParams(layoutParams);
            addView(this.f122438g);
        }
        ImageView imageView2 = this.f122438g;
        MethodCollector.m26664o(2767);
        return imageView2;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: i */
    public final void mo89762i() {
        m98380v();
        mo89795q();
        mo89801s();
        this.f122438g.setVisibility(8);
        this.f122438g.setAlpha(1.0f);
        ImageView imageView = this.f122434c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f122435d;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (isSelected()) {
            ImageView imageView3 = this.f122434c;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            ImageView imageView4 = this.f122435d;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
                return;
            }
            return;
        }
        ImageView imageView5 = this.f122434c;
        if (imageView5 != null) {
            imageView5.setAlpha(0.0f);
        }
        ImageView imageView6 = this.f122435d;
        if (imageView6 != null) {
            imageView6.setAlpha(1.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ View mo89802t() {
        MethodCollector.m26663i(2804);
        if (this.f122436e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122436e = imageView;
            imageView.setImageDrawable(this.f122439h.mo89730a(R.drawable.aag, getContext()));
            int a = C34728n.m70946a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            this.f122436e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(C34728n.m70946a(14.0d), C34728n.m70946a(6.0d), 0, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(C34728n.m70946a(14.0d));
            layoutParams.gravity = 49;
            this.f122436e.setLayoutParams(layoutParams);
            addView(this.f122436e);
        }
        ImageView imageView2 = this.f122436e;
        MethodCollector.m26664o(2804);
        return imageView2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ View mo89803u() {
        MethodCollector.m26663i(2816);
        if (this.f122436e == null) {
            ImageView imageView = new ImageView(getContext());
            this.f122436e = imageView;
            imageView.setImageDrawable(this.f122439h.mo89730a(R.drawable.aag, getContext()));
            int a = C34728n.m70946a(8.0d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
            this.f122436e.setScaleType(ImageView.ScaleType.FIT_CENTER);
            layoutParams.setMargins(C34728n.m70946a(14.0d), C34728n.m70946a(6.0d), 0, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(C34728n.m70946a(14.0d));
            layoutParams.gravity = 49;
            this.f122436e.setLayoutParams(layoutParams);
            addView(this.f122436e);
        }
        ImageView imageView2 = this.f122436e;
        MethodCollector.m26664o(2816);
        return imageView2;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: h */
    public final void mo89761h() {
        m98380v();
        mo89795q();
        mo89801s();
        this.f122438g.setVisibility(0);
        this.f122438g.setLayerType(2, null);
        mo89794a(this.f122434c, 8, new CallableC53338e(this));
        mo89794a(this.f122435d, 8, new CallableC53339f(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d.C533331 */

            static {
                Covode.recordClassIndex(62894);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C53332d.this.f122438g.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d.C533342 */

            static {
                Covode.recordClassIndex(62895);
            }

            public final void onAnimationRepeat(Animator animator) {
                if (!C53332d.this.f122393a) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!C53332d.this.isSelected()) {
                    C53332d dVar = C53332d.this;
                    dVar.mo89794a(dVar.f122435d, 0, new CallableC53346k(C53332d.this));
                    if (C53332d.this.f122435d != null) {
                        return;
                    }
                } else {
                    C53332d dVar2 = C53332d.this;
                    dVar2.mo89794a(dVar2.f122434c, 0, new CallableC53347l(C53332d.this));
                    if (C53332d.this.f122434c != null) {
                        return;
                    }
                }
                if (C53332d.this.f122434c != null) {
                    C53332d.this.f122434c.setVisibility(0);
                } else if (C53332d.this.f122435d != null) {
                    C53332d.this.f122435d.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d.C533353 */

            static {
                Covode.recordClassIndex(62896);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C53332d.this.f122438g.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C53332d.this.f122438g.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f122438g.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    /* renamed from: n */
    public void mo89768n() {
        Drawable remove;
        if (!TextUtils.equals(getTabType(), "PUBLISH")) {
            return;
        }
        if (!C33918a.m69450a() || (remove = this.f122439h.f122357b.remove(-100)) == null) {
            int i = 2131232112;
            int i2 = 2131232117;
            if (C16048b.m29633a().mo25412a(true, "tabbar_plus_button_icon_style", 0) == 2) {
                i = 2131232113;
                i2 = 2131232118;
            } else if (C16048b.m29633a().mo25412a(true, "tabbar_plus_button_icon_style", 0) == 1) {
                i = 2131232114;
                i2 = 2131232119;
            }
            if (!this.f122442k) {
                this.f122442k = true;
                this.f122435d.setImageDrawable(this.f122439h.mo89730a(i, getContext()));
                return;
            }
            if (this.f122441j) {
                i = i2;
            }
            this.f122435d.setImageDrawable(this.f122439h.mo89730a(i, getContext()));
        } else if (!this.f122394b) {
            this.f122435d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f122435d.setImageDrawable(remove);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a
    public void setActivated(boolean z) {
        super.setActivated(z);
        ImageView imageView = this.f122435d;
        if (imageView != null) {
            imageView.setSelected(z);
            this.f122435d.invalidate();
        }
        if (m98379a(this.f122440i, z, true)) {
            m98378a(this.f122440i, true);
        }
    }

    /* renamed from: a */
    private void m98377a(final boolean z) {
        mo89800r();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d.C533364 */

            static {
                Covode.recordClassIndex(62897);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                if (C53332d.this.f122437f != null && C53332d.this.f122437f.getVisibility() == 0) {
                    if (!z) {
                        C53332d.this.f122437f.setTranslationY(C13628n.m24520b(C53332d.this.getContext(), 2.0f) - ((C13628n.m24520b(C53332d.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration())));
                    } else {
                        C53332d.this.f122437f.setTranslationY((C13628n.m24520b(C53332d.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration()));
                    }
                }
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.C53332d.C533375 */

            static {
                Covode.recordClassIndex(62898);
            }

            public final void onAnimationEnd(Animator animator) {
                C53332d.this.mo89800r();
                if (C53332d.this.f122437f != null && C53332d.this.f122437f.getVisibility() == 0) {
                    if (!z) {
                        C53332d.this.f122437f.setTranslationY(0.0f);
                    } else {
                        C53332d.this.f122437f.setTranslationY(C13628n.m24520b(C53332d.this.getContext(), 2.0f));
                    }
                }
            }
        });
        ofFloat.start();
    }

    /* renamed from: a */
    private void m98378a(boolean z, boolean z2) {
        if (!z || getTabType().equals("PUBLISH")) {
            mo89801s();
            String tabType = getTabType();
            tabType.hashCode();
            if (tabType.equals("PUBLISH")) {
                mo89768n();
            }
            if (z2) {
                this.f122435d.setAlpha(1.0f);
                ImageView imageView = this.f122434c;
                if (imageView != null) {
                    imageView.setAlpha(0.0f);
                }
                View view = this.f122437f;
                if (view != null) {
                    view.setTranslationY((float) C34728n.m70946a(2.0d));
                    return;
                }
                return;
            }
            return;
        }
        mo89795q();
    }

    /* renamed from: a */
    private boolean m98379a(boolean z, boolean z2, boolean z3) {
        if (this.f122440i == z && this.f122441j == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f122440i = z;
            if (z3) {
                mo89801s();
            }
        } else if (this.f122440i != z || z3) {
            this.f122440i = z;
            z3 = true;
        }
        if (this.f122441j != z2) {
            this.f122441j = z2;
            if (!this.f122440i || getTabType().equals("PUBLISH")) {
                return true;
            }
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89794a(View view, int i, Callable<View> callable) {
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

    public C53332d(Context context, String str, boolean z, boolean z2, int i) {
        super(context, str);
        int i2;
        MethodCollector.m26663i(1972);
        if (m98379a(z, z2, true)) {
            m98378a(this.f122440i, true);
        }
        if (this.f122437f == null) {
            View view = new View(getContext());
            this.f122437f = view;
            view.setBackground(this.f122439h.mo89730a(2131232131, getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(28.0d), C34728n.m70946a(2.0d));
            layoutParams.gravity = 81;
            this.f122437f.setLayoutParams(layoutParams);
            addView(this.f122437f);
        }
        View view2 = this.f122437f;
        if (C33403c.f79374d) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C34729o.m70955a(view2, i2);
        setId(i);
        MethodCollector.m26664o(1972);
    }
}
