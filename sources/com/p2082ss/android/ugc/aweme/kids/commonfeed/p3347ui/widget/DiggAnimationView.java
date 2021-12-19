package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import com.airbnb.lottie.C2044e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.DiggAnimationView */
public class DiggAnimationView extends AnimationImageView {

    /* renamed from: e */
    private C57506a f131166e;

    /* renamed from: f */
    private C57506a f131167f;

    static {
        Covode.recordClassIndex(67442);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: g */
    public final void mo85726g() {
        if (!isSelected()) {
            m104178i();
        } else {
            m104179j();
        }
    }

    /* renamed from: i */
    private void m104178i() {
        setAnimation("icon_home_like_new.json");
        if (this.f131166e == null) {
            this.f131166e = new C57506a();
        }
        mo5832b(this.f131166e);
        mo5828a(this.f131166e);
        mo5826a();
    }

    /* renamed from: j */
    private void m104179j() {
        setAnimation("icon_home_dislike_new.json");
        if (this.f131167f == null) {
            this.f131167f = new C57506a();
        }
        mo5832b(this.f131167f);
        mo5828a(this.f131167f);
        mo5826a();
    }

    /* renamed from: h */
    public final void mo85727h() {
        setImageAlpha(254);
        setImageDrawable(C0643b.m2369a(getContext(), (int) R.drawable.ay7));
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setComposition(C2044e eVar) {
        super.setComposition(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.DiggAnimationView$a */
    public class C57506a implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(67443);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C57506a() {
        }

        public final void onAnimationCancel(Animator animator) {
            DiggAnimationView.this.mo85727h();
            DiggAnimationView.this.mo5832b(this);
        }

        public final void onAnimationEnd(Animator animator) {
            DiggAnimationView.this.mo85727h();
            DiggAnimationView.this.mo5832b(this);
        }
    }

    public DiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
