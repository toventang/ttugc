package com.bytedance.tux.status.loading;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23001b;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSpinner extends AppCompatImageView {

    /* renamed from: a */
    public C23271b f55168a;

    /* renamed from: b */
    private Animator f55169b;

    /* renamed from: c */
    private boolean f55170c;

    static {
        Covode.recordClassIndex(27218);
    }

    public TuxSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    private final void m43830a() {
        Animator animator;
        if (!this.f55170c && (animator = this.f55169b) != null) {
            animator.start();
            this.f55170c = true;
        }
    }

    /* renamed from: b */
    private final void m43831b() {
        this.f55170c = false;
        Animator animator = this.f55169b;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43831b();
        C58030k.m104850a(this);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (getVisibility() == 0) {
            m43830a();
        } else {
            m43831b();
        }
    }

    /* renamed from: com.bytedance.tux.status.loading.TuxSpinner$a */
    static final class C23270a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TuxSpinner f55171a;

        static {
            Covode.recordClassIndex(27219);
        }

        C23270a(TuxSpinner tuxSpinner) {
            this.f55171a = tuxSpinner;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                C23271b bVar = this.f55171a.f55168a;
                bVar.f55172g = floatValue;
                bVar.invalidateSelf();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.tux.status.loading.TuxSpinner$b */
    static final class C23271b extends C23001b {

        /* renamed from: g */
        public float f55172g;

        static {
            Covode.recordClassIndex(27220);
        }

        @Override // com.bytedance.tux.p1710c.C23001b
        public final void draw(Canvas canvas) {
            C89219l.m154719c(canvas, "");
            int width = getBounds().width();
            int height = getBounds().height();
            canvas.save();
            canvas.rotate(this.f55172g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
            super.draw(canvas);
            canvas.restore();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23271b(Context context, int i) {
            super(context, i);
            C89219l.m154719c(context, "");
        }
    }

    /* renamed from: a */
    public final void mo37899a(int i, int i2) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        C23271b bVar = new C23271b(context, i);
        this.f55168a = bVar;
        bVar.mo37377c(i2);
        setImageDrawable(this.f55168a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap6, R.attr.arj}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        C23271b bVar = new C23271b(context, resourceId);
        this.f55168a = bVar;
        bVar.mo37377c(color);
        setImageDrawable(this.f55168a);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new C23270a(this));
        this.f55169b = ofFloat;
        if (getVisibility() == 0) {
            m43830a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.c6 : i);
    }
}
