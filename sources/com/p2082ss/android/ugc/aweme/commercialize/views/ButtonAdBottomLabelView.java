package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView */
public class ButtonAdBottomLabelView extends AbstractC38925d {
    static {
        Covode.recordClassIndex(46338);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    public int getLayoutId() {
        return R.layout.t_;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    /* renamed from: b */
    public final boolean mo67363b() {
        return C37699a.m76266al(this.f91936g);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    /* renamed from: a */
    public final boolean mo67361a() {
        if (C37699a.m76319x(this.f91936g) || C37699a.m76233aE(this.f91936g)) {
            return true;
        }
        if (!C37699a.m76216S(this.f91936g) && this.f91936g != null && this.f91936g.isAd() && !TextUtils.isEmpty(this.f91936g.getAwemeRawAd().getWebUrl())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    /* renamed from: c */
    public final boolean mo67364c() {
        if (this.f91936g == null || this.f91936g.getAwemeRawAd() == null) {
            return false;
        }
        if (this.f91936g.getAwemeRawAd().getAnimationType() == 1 || this.f91936g.getAwemeRawAd().getAnimationType() == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    /* renamed from: d */
    public final void mo67365d() {
        int b = C34723i.m70928b(getContext());
        View findViewById = this.f91930a.findViewById(R.id.b3o);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = b - ((int) C13628n.m24520b(getContext(), 110.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    public final void mo67367k() {
        int height;
        if (mo67361a()) {
            mo67604e();
            if (C37699a.m76266al(this.f91936g)) {
                if (this.f91940k != null) {
                    DataCenter dataCenter = this.f91940k;
                    if (this.f91930a == null) {
                        height = 0;
                    } else {
                        height = this.f91930a.getHeight();
                    }
                    dataCenter.mo60191a("ad_bottom_label_show", Integer.valueOf(height));
                }
                C38000g.m77053d().mo67203a(this, 0, 0, true);
                mo67601b(this, new RunnableC38945j(this));
            } else {
                C38000g.m77053d().mo67203a(this, getResources().getDimensionPixelOffset(R.dimen.g3), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (!mo67364c()) {
                defaultColor = Color.parseColor(C37699a.m76265ak(this.f91936g));
            }
            mo67359a(defaultColor, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo67368l() {
        C38000g.m77050a().mo65898j(getContext(), this.f91936g);
        C18129a.m33746a("draw_ad", "button_show", this.f91936g.getAwemeRawAd()).mo28902c();
        C18129a.m33746a("draw_ad", "othershow", this.f91936g.getAwemeRawAd()).mo28900b("refer", "button").mo28902c();
        if (!mo67364c()) {
            mo67600b(1000);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    public void setLabelVisibility(int i) {
        setVisibility(i);
    }

    public ButtonAdBottomLabelView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo67362b(boolean z) {
        if (this.f91937h != null) {
            if (C37699a.m76319x(this.f91936g)) {
                setLabelVisibility(0);
                this.f91937h.setVisibility(0);
                if (!z) {
                    mo67359a(C0643b.m2378c(getContext(), R.color.bh), 0);
                }
                String ac = C37699a.m76257ac(this.f91936g);
                mo67364c();
                mo67597a(ac);
                this.f91935f.setImageResource(R.drawable.a23);
            } else if (!C37699a.m76318w(this.f91936g)) {
            } else {
                if (!TextUtils.isEmpty(this.f91936g.getAwemeRawAd().getWebUrl())) {
                    this.f91937h.setVisibility(8);
                    if (!z) {
                        mo67359a(Color.parseColor(C37699a.m76265ak(this.f91936g)), 0);
                    }
                    String a = C38000g.m77053d().mo67202a(getContext(), this.f91936g);
                    mo67364c();
                    mo67597a(a);
                    this.f91935f.setImageResource(R.drawable.b1l);
                    return;
                }
                setLabelVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo67360a(Boolean bool) {
        if (this.f91937h == null || C37699a.m76318w(this.f91936g)) {
            return;
        }
        if (C37699a.m76233aE(this.f91936g)) {
            setLabelVisibility(0);
            this.f91937h.setVisibility(0);
            if (!bool.booleanValue()) {
                mo67359a(Color.parseColor(C37699a.m76247aS(this.f91936g)), 0);
                mo67597a(C37699a.m76246aR(this.f91936g));
            } else {
                String aR = C37699a.m76246aR(this.f91936g);
                mo67364c();
                mo67597a(aR);
            }
            this.f91935f.setImageResource(R.drawable.a23);
        } else if (this.f91936g.getAwemeRawAd() == null || TextUtils.isEmpty(this.f91936g.getAwemeRawAd().getWebUrl())) {
            setLabelVisibility(8);
        } else {
            if (!bool.booleanValue() && C37699a.m76234aF(this.f91936g)) {
                mo67359a(Color.parseColor(C37699a.m76265ak(this.f91936g)), 0);
                mo67597a(C38000g.m77053d().mo67202a(getContext(), this.f91936g));
            }
            this.f91937h.setVisibility(8);
        }
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.AbstractC38925d
    /* renamed from: a */
    public final void mo67359a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C13628n.m24520b(getContext(), 2.0f));
        if (this.f91931b == 0 || this.f91931b != i) {
            this.f91931b = i;
            if (i2 == 0) {
                gradientDrawable.setColor(i);
                setBackground(gradientDrawable);
                if (C37699a.m76318w(this.f91936g) || !mo67364c()) {
                    this.f91933d.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
                    this.f91935f.setImageResource(R.drawable.a23);
                    mo67598a(true);
                    return;
                }
                this.f91933d.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
                this.f91935f.setImageResource(R.drawable.b1l);
                mo67598a(false);
                return;
            }
            gradientDrawable.setColor(getBackGroundColor());
            C80595j.m139740a(this, gradientDrawable, getBackGroundColor(), i, (long) i2, new Animator.AnimatorListener() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView.C387921 */

                static {
                    Covode.recordClassIndex(46339);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    ButtonAdBottomLabelView.this.mo67600b(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    ButtonAdBottomLabelView.this.f91933d.setTextColor(C0643b.m2378c(ButtonAdBottomLabelView.this.getContext(), R.color.a9));
                    ButtonAdBottomLabelView.this.f91935f.setImageResource(R.drawable.a23);
                    ButtonAdBottomLabelView.this.mo67598a(true);
                }
            });
            if (C37699a.m76318w(this.f91936g) || !mo67364c()) {
                this.f91933d.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
                this.f91935f.setImageResource(R.drawable.a23);
                mo67598a(true);
                return;
            }
            this.f91933d.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
            this.f91935f.setImageResource(R.drawable.b1l);
            mo67598a(false);
        }
    }

    private ButtonAdBottomLabelView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        setDefaultColor(C0643b.m2378c(context, R.color.ao));
    }
}
