package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView */
public final class AdFakeUserProfileTabImageView extends RelativeLayout {

    /* renamed from: a */
    private TuxIconView f90626a;

    /* renamed from: b */
    private ValueAnimator f90627b;

    /* renamed from: c */
    private ValueAnimator f90628c;

    /* renamed from: d */
    private boolean f90629d;

    static {
        Covode.recordClassIndex(45848);
    }

    public AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ayu);
        C89219l.m154716b(findViewById, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.f90626a = tuxIconView;
        if (tuxIconView == null) {
            C89219l.m154710a("iconImage");
        }
        tuxIconView.setAlpha(0.5f);
    }

    public final void setAnimationEnabled(boolean z) {
        this.f90629d = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView$a */
    static final class C38351a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileTabImageView f90630a;

        static {
            Covode.recordClassIndex(45849);
        }

        C38351a(AdFakeUserProfileTabImageView adFakeUserProfileTabImageView) {
            this.f90630a = adFakeUserProfileTabImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = this.f90630a;
            C89219l.m154716b(valueAnimator, "");
            adFakeUserProfileTabImageView.mo66959a(valueAnimator);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView$b */
    static final class C38352b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileTabImageView f90631a;

        static {
            Covode.recordClassIndex(45850);
        }

        C38352b(AdFakeUserProfileTabImageView adFakeUserProfileTabImageView) {
            this.f90631a = adFakeUserProfileTabImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = this.f90631a;
            C89219l.m154716b(valueAnimator, "");
            adFakeUserProfileTabImageView.mo66959a(valueAnimator);
        }
    }

    public final void setImageResource(int i) {
        TuxIconView tuxIconView = this.f90626a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconImage");
        }
        tuxIconView.setIconRes(i);
    }

    /* renamed from: a */
    public final void mo66959a(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        TuxIconView tuxIconView = this.f90626a;
        if (tuxIconView == null) {
            C89219l.m154710a("iconImage");
        }
        tuxIconView.setAlpha(floatValue);
    }

    public final void setSelected(boolean z) {
        super.setSelected(z);
        ValueAnimator valueAnimator = this.f90627b;
        if (valueAnimator == null) {
            C89219l.m154710a("mSelectAnimator");
        }
        valueAnimator.cancel();
        ValueAnimator valueAnimator2 = this.f90628c;
        if (valueAnimator2 == null) {
            C89219l.m154710a("mUnSelectAnimator");
        }
        valueAnimator2.cancel();
        if (z) {
            if (this.f90629d) {
                ValueAnimator valueAnimator3 = this.f90627b;
                if (valueAnimator3 == null) {
                    C89219l.m154710a("mSelectAnimator");
                }
                valueAnimator3.start();
            }
        } else if (this.f90629d) {
            ValueAnimator valueAnimator4 = this.f90628c;
            if (valueAnimator4 == null) {
                C89219l.m154710a("mUnSelectAnimator");
            }
            valueAnimator4.start();
        }
    }

    private /* synthetic */ AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdFakeUserProfileTabImageView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3024);
        this.f90629d = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        this.f90627b = ofFloat;
        if (ofFloat == null) {
            C89219l.m154710a("mSelectAnimator");
        }
        ofFloat.addUpdateListener(new C38351a(this));
        ValueAnimator valueAnimator = this.f90627b;
        if (valueAnimator == null) {
            C89219l.m154710a("mSelectAnimator");
        }
        valueAnimator.setDuration(150L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        C89219l.m154716b(ofFloat2, "");
        this.f90628c = ofFloat2;
        if (ofFloat2 == null) {
            C89219l.m154710a("mUnSelectAnimator");
        }
        ofFloat2.addUpdateListener(new C38352b(this));
        ValueAnimator valueAnimator2 = this.f90628c;
        if (valueAnimator2 == null) {
            C89219l.m154710a("mUnSelectAnimator");
        }
        valueAnimator2.setDuration(150L);
        MethodCollector.m26664o(3024);
    }
}
