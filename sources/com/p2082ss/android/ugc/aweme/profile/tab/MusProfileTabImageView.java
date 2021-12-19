package com.p2082ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView */
public class MusProfileTabImageView extends AbstractC63905e {

    /* renamed from: a */
    TuxIconView f144867a;

    /* renamed from: b */
    private ValueAnimator f144868b;

    /* renamed from: c */
    private ValueAnimator f144869c;

    /* renamed from: d */
    private boolean f144870d = true;

    static {
        Covode.recordClassIndex(75328);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.bh1);
        this.f144867a = tuxIconView;
        tuxIconView.setAlpha(0.5f);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tab.AbstractC63905e
    public void setAnimationEnabled(boolean z) {
        this.f144870d = z;
    }

    public void setImageResource(int i) {
        this.f144867a.setIconRes(i);
    }

    /* renamed from: a */
    public final void mo103447a(ValueAnimator valueAnimator) {
        this.f144867a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f144868b.cancel();
        this.f144869c.cancel();
        if (z) {
            if (this.f144870d) {
                this.f144868b.start();
            }
        } else if (this.f144870d) {
            this.f144869c.start();
        }
    }

    public MusProfileTabImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f144868b = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.tab.MusProfileTabImageView.C638991 */

            static {
                Covode.recordClassIndex(75329);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo103447a(valueAnimator);
            }
        });
        this.f144868b.setDuration(150L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        this.f144869c = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.tab.MusProfileTabImageView.C639002 */

            static {
                Covode.recordClassIndex(75330);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MusProfileTabImageView.this.mo103447a(valueAnimator);
            }
        });
        this.f144869c.setDuration(150L);
    }
}
