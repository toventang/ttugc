package com.p2082ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0643b;
import com.airbnb.lottie.C2044e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50553s;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2483co.C36150d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.DiggAnimationView */
public class DiggAnimationView extends AnimationImageView {

    /* renamed from: e */
    private C50487a f116614e;

    /* renamed from: f */
    private C50487a f116615f;

    /* renamed from: g */
    private C36150d f116616g;

    static {
        Covode.recordClassIndex(59624);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    private C36150d getDiggViewScaleHelper() {
        if (this.f116616g == null) {
            this.f116616g = new C36150d();
        }
        return this.f116616g;
    }

    /* renamed from: g */
    public final void mo85726g() {
        setAnimation("icon_home_like_new.json");
        if (this.f116614e == null) {
            this.f116614e = new C50487a();
        }
        mo5832b(this.f116614e);
        mo5828a(this.f116614e);
        mo5826a();
    }

    /* renamed from: h */
    public final void mo85727h() {
        setImageAlpha(254);
        getDiggViewScaleHelper();
        Drawable d = C36150d.m73649d();
        if (C33918a.m69450a()) {
            if (d == null) {
                d = C0643b.m2369a(getContext(), (int) R.drawable.b10);
            }
        } else if (d == null) {
            d = C0643b.m2369a(getContext(), (int) R.drawable.b10);
        }
        setImageDrawable(d);
    }

    public DiggAnimationView(Context context) {
        super(context);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setComposition(C2044e eVar) {
        super.setComposition(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.widget.DiggAnimationView$a */
    public class C50487a implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(59625);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C50487a() {
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

    /* renamed from: a */
    public final void mo85725a(View view) {
        Boolean bool = (Boolean) getTag(C33918a.f80227a);
        if (bool != null && bool.booleanValue()) {
            C50553s.m94778a(view);
        } else if (!isSelected()) {
            mo85726g();
        } else {
            setAnimation("icon_home_dislike_new.json");
            if (this.f116615f == null) {
                this.f116615f = new C50487a();
            }
            mo5832b(this.f116615f);
            mo5828a(this.f116615f);
            mo5826a();
        }
    }

    public DiggAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
