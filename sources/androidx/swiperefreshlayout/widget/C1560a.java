package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* access modifiers changed from: package-private */
/* renamed from: androidx.swiperefreshlayout.widget.a */
public class C1560a extends ImageView {

    /* renamed from: a */
    Animation.AnimationListener f5102a;

    /* renamed from: b */
    int f5103b;

    static {
        Covode.recordClassIndex(1702);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    private static boolean m5221a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5102a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5102a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    class C1561a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f5105b;

        /* renamed from: c */
        private Paint f5106c = new Paint();

        static {
            Covode.recordClassIndex(1703);
        }

        /* renamed from: a */
        private void m5222a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1560a.this.f5103b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f5105b = radialGradient;
            this.f5106c.setShader(radialGradient);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m5222a((int) f);
        }

        C1561a(int i) {
            C1560a.this.f5103b = i;
            m5222a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C1560a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1560a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f5106c);
            canvas.drawCircle(f, height, (float) (width - C1560a.this.f5103b), paint);
        }
    }

    C1560a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f5103b = (int) (3.5f * f);
        if (m5221a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0792v.m2739a(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C1561a(this.f5103b));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f5103b, (float) i2, (float) i, 503316480);
            int i3 = this.f5103b;
            setPadding(i3, i3, i3, i3);
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0792v.m2746a(this, shapeDrawable);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m5221a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f5103b * 2), getMeasuredHeight() + (this.f5103b * 2));
        }
    }
}
