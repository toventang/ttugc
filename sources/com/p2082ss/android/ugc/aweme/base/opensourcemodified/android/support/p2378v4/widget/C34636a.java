package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a */
public final class C34636a extends AppCompatImageView {

    /* renamed from: a */
    Animation.AnimationListener f81762a;

    /* renamed from: b */
    int f81763b;

    /* renamed from: c */
    public ShapeDrawable f81764c;

    /* renamed from: d */
    private boolean f81765d;

    static {
        Covode.recordClassIndex(41603);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    private static boolean m70727a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f81762a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f81762a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f81765d) {
            super.draw(canvas);
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a$a */
    class C34637a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f81767b;

        /* renamed from: c */
        private Paint f81768c = new Paint();

        static {
            Covode.recordClassIndex(41604);
        }

        /* renamed from: a */
        private void m70728a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C34636a.this.f81763b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f81767b = radialGradient;
            this.f81768c.setShader(radialGradient);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m70728a((int) f);
        }

        C34637a(int i) {
            C34636a.this.f81763b = i;
            m70728a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C34636a.this.getWidth();
            int height = C34636a.this.getHeight();
            int i = width / 2;
            if (i >= 0 && i - C34636a.this.f81763b >= 0) {
                float f = (float) i;
                float f2 = (float) (height / 2);
                canvas.drawCircle(f, f2, f, this.f81768c);
                canvas.drawCircle(f, f2, (float) (i - C34636a.this.f81763b), paint);
            }
        }
    }

    C34636a(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f81763b = (int) (3.5f * f);
        if (m70727a()) {
            this.f81764c = new ShapeDrawable(new OvalShape());
            C0792v.m2739a(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new C34637a(this.f81763b));
            this.f81764c = shapeDrawable;
            setLayerType(1, shapeDrawable.getPaint());
            this.f81764c.getPaint().setShadowLayer((float) this.f81763b, (float) i2, (float) i, 503316480);
            int i3 = this.f81763b;
            setPadding(i3, i3, i3, i3);
        }
        this.f81764c.getPaint().setColor(-328966);
        C0792v.m2746a(this, this.f81764c);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m70727a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f81763b * 2), getMeasuredHeight() + (this.f81763b * 2));
        }
    }
}
