package com.bytedance.tux.p1710c;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.c.d */
public final class C23006d extends C23001b {

    /* renamed from: g */
    public float f54458g;

    /* renamed from: h */
    public final ValueAnimator f54459h = new ValueAnimator();

    static {
        Covode.recordClassIndex(26926);
    }

    @Override // com.bytedance.tux.p1710c.C23001b
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: c */
    public final void mo37387c() {
        ValueAnimator valueAnimator = this.f54459h;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
    }

    /* renamed from: com.bytedance.tux.c.d$a */
    public static final class C23007a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C23006d f54460a;

        /* renamed from: b */
        final /* synthetic */ PropertyValuesHolder f54461b;

        static {
            Covode.recordClassIndex(26927);
        }

        public C23007a(C23006d dVar, PropertyValuesHolder propertyValuesHolder) {
            this.f54460a = dVar;
            this.f54461b = propertyValuesHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C23006d dVar = this.f54460a;
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                dVar.f54458g = (float) ((Integer) animatedValue).intValue();
                this.f54460a.invalidateSelf();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @Override // com.bytedance.tux.p1710c.C23001b
    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        int width = getBounds().width();
        int height = getBounds().height();
        canvas.save();
        canvas.rotate(this.f54458g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23006d(Context context, int i) {
        super(context, i);
        C89219l.m154719c(context, "");
    }
}
