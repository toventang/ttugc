package com.bytedance.tux.skeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.skeleton.p1725a.C23251b;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.skeleton.f */
public abstract class AbstractC23256f extends AbstractC23237a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    private final List<C23251b> f55102d;

    /* renamed from: e */
    private boolean f55103e;

    static {
        Covode.recordClassIndex(27199);
    }

    public AbstractC23256f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final List<C23251b> getPlaceholders() {
        return this.f55102d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37862b() {
        while (this.f55102d.size() > 1) {
            this.f55102d.remove(0).setCallback(null);
        }
        while (this.f55102d.size() <= 0) {
            List<C23251b> list = this.f55102d;
            C23251b bVar = new C23251b();
            bVar.setCallback(this);
            list.add(bVar);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C89219l.m154719c(drawable, "");
        if (C89070n.m154556a((Iterable) this.f55102d, (Object) drawable)) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        if (!mo37841a()) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.f55103e) {
            this.f55103e = true;
            getAnimator().addUpdateListener(this);
            if (!getAnimator().isStarted()) {
                getAnimator().start();
            }
        }
        for (T t : this.f55102d) {
            t.f55097a = getRadius();
            t.f55098b.setColor(getPlaceholderColor());
            t.f55101d = getPulsingColor();
            t.draw(canvas);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C89219l.m154719c(valueAnimator, "");
        for (T t : this.f55102d) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                int i = t.f55101d;
                int alpha = Color.alpha(i);
                int red = Color.red(i);
                int green = Color.green(i);
                t.f55100c.setColor((((int) ((((float) intValue) / 255.0f) * ((float) alpha))) << 24) | (red << 16) | (green << 8) | Color.blue(i));
                invalidate();
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    private /* synthetic */ AbstractC23256f(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC23256f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        this.f55102d = new ArrayList();
        mo37839a(new C23258g(this), new AbstractC89183m<ValueAnimator, ValueAnimator, C89391z>(this) {
            /* class com.bytedance.tux.skeleton.AbstractC23256f.C232571 */

            /* renamed from: a */
            final /* synthetic */ AbstractC23256f f55104a;

            static {
                Covode.recordClassIndex(27200);
            }

            {
                this.f55104a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
                ValueAnimator valueAnimator3 = valueAnimator;
                ValueAnimator valueAnimator4 = valueAnimator2;
                C89219l.m154719c(valueAnimator4, "");
                if (valueAnimator3 != null) {
                    valueAnimator3.removeUpdateListener(this.f55104a);
                    if (valueAnimator3.isRunning()) {
                        valueAnimator3.cancel();
                    }
                }
                valueAnimator4.addUpdateListener(this.f55104a);
                if (!valueAnimator4.isStarted()) {
                    valueAnimator4.start();
                }
                return C89391z.f203057a;
            }
        });
    }
}
