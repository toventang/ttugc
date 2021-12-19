package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.m */
public final class C24223m extends C24217g implements AbstractC24220j {

    /* renamed from: a */
    EnumC24225a f57399a = EnumC24225a.OVERLAY_COLOR;

    /* renamed from: b */
    final float[] f57400b = new float[8];

    /* renamed from: c */
    final Paint f57401c = new Paint(1);

    /* renamed from: d */
    public int f57402d = 0;

    /* renamed from: e */
    private final RectF f57403e = new RectF();

    /* renamed from: f */
    private RectF f57404f;

    /* renamed from: g */
    private Matrix f57405g;

    /* renamed from: h */
    private final float[] f57406h = new float[8];

    /* renamed from: i */
    private boolean f57407i = false;

    /* renamed from: j */
    private float f57408j = 0.0f;

    /* renamed from: k */
    private int f57409k = 0;

    /* renamed from: l */
    private float f57410l = 0.0f;

    /* renamed from: m */
    private boolean f57411m = false;

    /* renamed from: n */
    private final Path f57412n = new Path();

    /* renamed from: o */
    private final Path f57413o = new Path();

    /* renamed from: p */
    private final RectF f57414p = new RectF();

    static {
        Covode.recordClassIndex(28354);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39907a() {
        Arrays.fill(this.f57406h, 0.0f);
        m45973b();
        invalidateSelf();
    }

    /* renamed from: com.facebook.drawee.e.m$1 */
    static /* synthetic */ class C242241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57415a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 28355(0x6ec3, float:3.9734E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.drawee.e.m$a[] r0 = com.facebook.drawee.p1854e.C24223m.EnumC24225a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.drawee.p1854e.C24223m.C242241.f57415a = r2
                com.facebook.drawee.e.m$a r0 = com.facebook.drawee.p1854e.C24223m.EnumC24225a.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.drawee.p1854e.C24223m.C242241.f57415a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.drawee.e.m$a r0 = com.facebook.drawee.p1854e.C24223m.EnumC24225a.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p1854e.C24223m.C242241.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.drawee.e.m$a */
    public enum EnumC24225a {
        OVERLAY_COLOR,
        CLIPPING;

        static {
            Covode.recordClassIndex(28356);
        }
    }

    /* renamed from: b */
    private void m45973b() {
        float[] fArr;
        this.f57412n.reset();
        this.f57413o.reset();
        this.f57414p.set(getBounds());
        RectF rectF = this.f57414p;
        float f = this.f57410l;
        rectF.inset(f, f);
        this.f57412n.addRect(this.f57414p, Path.Direction.CW);
        if (this.f57407i) {
            this.f57412n.addCircle(this.f57414p.centerX(), this.f57414p.centerY(), Math.min(this.f57414p.width(), this.f57414p.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f57412n.addRoundRect(this.f57414p, this.f57406h, Path.Direction.CW);
        }
        RectF rectF2 = this.f57414p;
        float f2 = this.f57410l;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f57414p;
        float f3 = this.f57408j;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f57407i) {
            this.f57413o.addCircle(this.f57414p.centerX(), this.f57414p.centerY(), Math.min(this.f57414p.width(), this.f57414p.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f57400b;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f57406h[i] + this.f57410l) - (this.f57408j / 2.0f);
                i++;
            }
            this.f57413o.addRoundRect(this.f57414p, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f57414p;
        float f4 = this.f57408j;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* renamed from: a */
    public final void mo39925a(int i) {
        this.f57402d = i;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.p1854e.C24217g
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m45973b();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: b */
    public final void mo39912b(boolean z) {
        this.f57411m = z;
        m45973b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39908a(float f) {
        this.f57410l = f;
        m45973b();
        invalidateSelf();
    }

    public C24223m(Drawable drawable) {
        super((Drawable) C24091i.m45617a(drawable));
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39910a(boolean z) {
        this.f57407i = z;
        m45973b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39911a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f57406h, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C24091i.m45621a(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f57406h, 0, 8);
        }
        m45973b();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final void draw(Canvas canvas) {
        this.f57403e.set(getBounds());
        int i = C242241.f57415a[this.f57399a.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.f57412n.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.f57412n);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f57411m) {
                RectF rectF = this.f57404f;
                if (rectF == null) {
                    this.f57404f = new RectF(this.f57403e);
                    this.f57405g = new Matrix();
                } else {
                    rectF.set(this.f57403e);
                }
                RectF rectF2 = this.f57404f;
                float f = this.f57408j;
                rectF2.inset(f, f);
                this.f57405g.setRectToRect(this.f57403e, this.f57404f, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f57403e);
                canvas.concat(this.f57405g);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f57401c.setStyle(Paint.Style.FILL);
            this.f57401c.setColor(this.f57402d);
            this.f57401c.setStrokeWidth(0.0f);
            this.f57412n.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f57412n, this.f57401c);
            if (this.f57407i) {
                float width = ((this.f57403e.width() - this.f57403e.height()) + this.f57408j) / 2.0f;
                float height = ((this.f57403e.height() - this.f57403e.width()) + this.f57408j) / 2.0f;
                if (width > 0.0f) {
                    canvas.drawRect(this.f57403e.left, this.f57403e.top, this.f57403e.left + width, this.f57403e.bottom, this.f57401c);
                    canvas.drawRect(this.f57403e.right - width, this.f57403e.top, this.f57403e.right, this.f57403e.bottom, this.f57401c);
                }
                if (height > 0.0f) {
                    canvas.drawRect(this.f57403e.left, this.f57403e.top, this.f57403e.right, this.f57403e.top + height, this.f57401c);
                    canvas.drawRect(this.f57403e.left, this.f57403e.bottom - height, this.f57403e.right, this.f57403e.bottom, this.f57401c);
                }
            }
        }
        if (this.f57409k != 0) {
            this.f57401c.setStyle(Paint.Style.STROKE);
            this.f57401c.setColor(this.f57409k);
            this.f57401c.setStrokeWidth(this.f57408j);
            this.f57412n.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f57413o, this.f57401c);
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24220j
    /* renamed from: a */
    public final void mo39909a(int i, float f) {
        this.f57409k = i;
        this.f57408j = f;
        m45973b();
        invalidateSelf();
    }
}
