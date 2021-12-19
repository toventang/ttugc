package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.p1891p.C24644b;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.n */
public abstract class AbstractC24226n extends Drawable implements AbstractC24220j, AbstractC24242r {

    /* renamed from: A */
    private boolean f57417A = true;

    /* renamed from: B */
    private AbstractC24243s f57418B;

    /* renamed from: a */
    private final float[] f57419a = new float[8];

    /* renamed from: b */
    protected final Drawable f57420b;

    /* renamed from: c */
    protected boolean f57421c;

    /* renamed from: d */
    protected boolean f57422d;

    /* renamed from: e */
    protected float f57423e;

    /* renamed from: f */
    protected final Path f57424f = new Path();

    /* renamed from: g */
    protected boolean f57425g = true;

    /* renamed from: h */
    protected int f57426h = 0;

    /* renamed from: i */
    protected final Path f57427i = new Path();

    /* renamed from: j */
    final float[] f57428j = new float[8];

    /* renamed from: k */
    float[] f57429k;

    /* renamed from: l */
    final RectF f57430l = new RectF();

    /* renamed from: m */
    final RectF f57431m = new RectF();

    /* renamed from: n */
    final RectF f57432n = new RectF();

    /* renamed from: o */
    final RectF f57433o = new RectF();

    /* renamed from: p */
    RectF f57434p;

    /* renamed from: q */
    final Matrix f57435q = new Matrix();

    /* renamed from: r */
    final Matrix f57436r = new Matrix();

    /* renamed from: s */
    final Matrix f57437s = new Matrix();

    /* renamed from: t */
    final Matrix f57438t = new Matrix();

    /* renamed from: u */
    final Matrix f57439u = new Matrix();

    /* renamed from: v */
    Matrix f57440v;

    /* renamed from: w */
    Matrix f57441w;

    /* renamed from: x */
    final Matrix f57442x = new Matrix();

    /* renamed from: y */
    private float f57443y = 0.0f;

    /* renamed from: z */
    private boolean f57444z = false;

    static {
        Covode.recordClassIndex(28357);
    }

    public void clearColorFilter() {
        this.f57420b.clearColorFilter();
    }

    public int getAlpha() {
        return this.f57420b.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f57420b.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f57420b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f57420b.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f57420b.getOpacity();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39907a() {
        C24091i.m45622b(true);
        Arrays.fill(this.f57419a, 0.0f);
        this.f57422d = false;
        this.f57417A = true;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo39913b() {
        if (this.f57421c || this.f57422d || this.f57423e > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo39928d() {
        float[] fArr;
        float f;
        if (this.f57417A) {
            this.f57427i.reset();
            RectF rectF = this.f57430l;
            float f2 = this.f57423e;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.f57421c) {
                this.f57427i.addCircle(this.f57430l.centerX(), this.f57430l.centerY(), Math.min(this.f57430l.width(), this.f57430l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f57428j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f57419a[i] + this.f57443y) - (this.f57423e / 2.0f);
                    i++;
                }
                this.f57427i.addRoundRect(this.f57430l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f57430l;
            float f3 = this.f57423e;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f57424f.reset();
            float f4 = this.f57443y;
            if (this.f57444z) {
                f = this.f57423e;
            } else {
                f = 0.0f;
            }
            float f5 = f4 + f;
            this.f57430l.inset(f5, f5);
            if (this.f57421c) {
                this.f57424f.addCircle(this.f57430l.centerX(), this.f57430l.centerY(), Math.min(this.f57430l.width(), this.f57430l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f57444z) {
                if (this.f57429k == null) {
                    this.f57429k = new float[8];
                }
                for (int i2 = 0; i2 < this.f57428j.length; i2++) {
                    this.f57429k[i2] = this.f57419a[i2] - this.f57423e;
                }
                this.f57424f.addRoundRect(this.f57430l, this.f57429k, Path.Direction.CW);
            } else {
                this.f57424f.addRoundRect(this.f57430l, this.f57419a, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f57430l.inset(f6, f6);
            this.f57424f.setFillType(Path.FillType.WINDING);
            this.f57417A = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo39926c() {
        Matrix matrix;
        AbstractC24243s sVar = this.f57418B;
        if (sVar != null) {
            sVar.getTransform(this.f57437s);
            this.f57418B.getRootBounds(this.f57430l);
        } else {
            this.f57437s.reset();
            this.f57430l.set(getBounds());
        }
        this.f57432n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f57433o.set(this.f57420b.getBounds());
        this.f57435q.setRectToRect(this.f57432n, this.f57433o, Matrix.ScaleToFit.FILL);
        if (this.f57444z) {
            RectF rectF = this.f57434p;
            if (rectF == null) {
                this.f57434p = new RectF(this.f57430l);
            } else {
                rectF.set(this.f57430l);
            }
            RectF rectF2 = this.f57434p;
            float f = this.f57423e;
            rectF2.inset(f, f);
            if (this.f57440v == null) {
                this.f57440v = new Matrix();
            }
            this.f57440v.setRectToRect(this.f57430l, this.f57434p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f57440v;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f57437s.equals(this.f57438t) || !this.f57435q.equals(this.f57436r) || ((matrix = this.f57440v) != null && !matrix.equals(this.f57441w))) {
            this.f57425g = true;
            this.f57437s.invert(this.f57439u);
            this.f57442x.set(this.f57437s);
            if (this.f57444z) {
                this.f57442x.postConcat(this.f57440v);
            }
            this.f57442x.preConcat(this.f57435q);
            this.f57438t.set(this.f57437s);
            this.f57436r.set(this.f57435q);
            if (this.f57444z) {
                Matrix matrix3 = this.f57441w;
                if (matrix3 == null) {
                    this.f57441w = new Matrix(this.f57440v);
                } else {
                    matrix3.set(this.f57440v);
                }
            } else {
                Matrix matrix4 = this.f57441w;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f57430l.equals(this.f57431m)) {
            this.f57417A = true;
            this.f57431m.set(this.f57430l);
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24242r
    public void setTransformCallback(AbstractC24243s sVar) {
        this.f57418B = sVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f57420b.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f57420b.setAlpha(i);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39908a(float f) {
        if (this.f57443y != f) {
            this.f57443y = f;
            this.f57417A = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: b */
    public final void mo39912b(boolean z) {
        if (this.f57444z != z) {
            this.f57444z = z;
            this.f57417A = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        C24644b.m47156a();
        this.f57420b.draw(canvas);
        C24644b.m47156a();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f57420b.setColorFilter(colorFilter);
    }

    AbstractC24226n(Drawable drawable) {
        this.f57420b = drawable;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39910a(boolean z) {
        this.f57421c = z;
        this.f57417A = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39911a(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f57419a, 0.0f);
            this.f57422d = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C24091i.m45621a(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f57419a, 0, 8);
            this.f57422d = false;
            int i = 0;
            do {
                boolean z3 = this.f57422d;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f57422d = z3 | z2;
                i++;
            } while (i < 8);
        }
        this.f57417A = true;
        invalidateSelf();
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f57420b.setColorFilter(i, mode);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39909a(int i, float f) {
        if (this.f57426h != i || this.f57423e != f) {
            this.f57426h = i;
            this.f57423e = f;
            this.f57417A = true;
            invalidateSelf();
        }
    }
}
