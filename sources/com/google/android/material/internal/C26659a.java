package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0699a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.internal.a */
public final class C26659a extends Drawable {

    /* renamed from: a */
    final Paint f63115a;

    /* renamed from: b */
    final Rect f63116b;

    /* renamed from: c */
    final RectF f63117c;

    /* renamed from: d */
    final C26660a f63118d;

    /* renamed from: e */
    float f63119e;

    /* renamed from: f */
    public ColorStateList f63120f;

    /* renamed from: g */
    public int f63121g;

    /* renamed from: h */
    public boolean f63122h;

    /* renamed from: i */
    public float f63123i;

    /* renamed from: j */
    private int f63124j;

    /* renamed from: k */
    private int f63125k;

    /* renamed from: l */
    private int f63126l;

    /* renamed from: m */
    private int f63127m;

    static {
        Covode.recordClassIndex(32115);
    }

    /* renamed from: com.google.android.material.internal.a$a */
    class C26660a extends Drawable.ConstantState {

        /* renamed from: a */
        final /* synthetic */ C26659a f63128a;

        static {
            Covode.recordClassIndex(32116);
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return this.f63128a;
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f63118d;
    }

    public final int getOpacity() {
        if (this.f63119e > 0.0f) {
            return -3;
        }
        return -2;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f63120f;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f63122h = true;
    }

    public final boolean getPadding(Rect rect) {
        int round = Math.round(this.f63119e);
        rect.set(round, round, round, round);
        return true;
    }

    public final void setAlpha(int i) {
        this.f63115a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f63115a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f63120f;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f63121g)) == this.f63121g)) {
            this.f63122h = true;
            this.f63121g = colorForState;
        }
        if (this.f63122h) {
            invalidateSelf();
        }
        return this.f63122h;
    }

    public final void draw(Canvas canvas) {
        if (this.f63122h) {
            Paint paint = this.f63115a;
            Rect rect = this.f63116b;
            copyBounds(rect);
            float height = this.f63119e / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0699a.m2460a(this.f63124j, this.f63121g), C0699a.m2460a(this.f63125k, this.f63121g), C0699a.m2460a(C0699a.m2464b(this.f63125k, 0), this.f63121g), C0699a.m2460a(C0699a.m2464b(this.f63127m, 0), this.f63121g), C0699a.m2460a(this.f63127m, this.f63121g), C0699a.m2460a(this.f63126l, this.f63121g)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f63122h = false;
        }
        float strokeWidth = this.f63115a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f63117c;
        copyBounds(this.f63116b);
        rectF.set(this.f63116b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f63123i, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f63115a);
        canvas.restore();
    }
}
