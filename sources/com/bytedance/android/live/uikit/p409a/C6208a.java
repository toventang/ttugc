package com.bytedance.android.live.uikit.p409a;

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

/* renamed from: com.bytedance.android.live.uikit.a.a */
final class C6208a extends AppCompatImageView {

    /* renamed from: a */
    Animation.AnimationListener f15488a;

    /* renamed from: b */
    private int f15489b;

    static {
        Covode.recordClassIndex(6914);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    private static boolean m13489a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f15488a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f15488a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i));
        }
    }

    public C6208a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (20.0f * f * 2.0f);
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f15489b = (int) (3.5f * f);
        if (m13489a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0792v.m2739a(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C6209a(this.f15489b, i));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f15489b, (float) i3, (float) i2, 503316480);
            int i4 = this.f15489b;
            setPadding(i4, i4, i4, i4);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackgroundDrawable(shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m13489a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f15489b * 2), getMeasuredHeight() + (this.f15489b * 2));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.a$a */
    class C6209a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f15491b;

        /* renamed from: c */
        private int f15492c;

        /* renamed from: d */
        private Paint f15493d = new Paint();

        /* renamed from: e */
        private int f15494e;

        static {
            Covode.recordClassIndex(6915);
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C6208a.this.getWidth();
            float f = (float) (width / 2);
            float height = (float) (C6208a.this.getHeight() / 2);
            canvas.drawCircle(f, height, (float) ((this.f15494e / 2) + this.f15492c), this.f15493d);
            canvas.drawCircle(f, height, (float) (this.f15494e / 2), paint);
        }

        public C6209a(int i, int i2) {
            this.f15492c = i;
            this.f15494e = i2;
            int i3 = this.f15494e;
            RadialGradient radialGradient = new RadialGradient((float) (i3 / 2), (float) (i3 / 2), (float) this.f15492c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f15491b = radialGradient;
            this.f15493d.setShader(radialGradient);
        }
    }
}
