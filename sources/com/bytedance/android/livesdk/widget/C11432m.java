package com.bytedance.android.livesdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widget.m */
public final class C11432m extends C11424f {

    /* renamed from: a */
    public int f27402a;

    /* renamed from: b */
    public final float[] f27403b = new float[8];

    /* renamed from: c */
    public float f27404c;

    /* renamed from: d */
    public final Path f27405d;

    /* renamed from: e */
    public final Paint f27406e;

    /* renamed from: f */
    public final RectF f27407f;

    /* renamed from: g */
    public int f27408g;

    /* renamed from: h */
    public float f27409h;

    /* renamed from: i */
    private final Paint f27410i;

    /* renamed from: j */
    private final RectF f27411j;

    static {
        Covode.recordClassIndex(13088);
    }

    /* renamed from: a */
    public final void mo18269a(float f) {
        this.f27404c = f;
        C89064i.m154464a(this.f27403b, f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11432m(Drawable drawable) {
        super(drawable);
        C89219l.m154721d(drawable, "");
        Path path = new Path();
        this.f27405d = path;
        Paint paint = new Paint(1);
        this.f27406e = paint;
        this.f27407f = new RectF();
        this.f27408g = -1;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(paint2.getStrokeWidth());
        paint2.setColor(this.f27408g);
        this.f27410i = paint2;
        this.f27411j = new RectF();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
    }

    @Override // com.bytedance.android.livesdk.widget.C11424f
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154721d(paint, "");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.f27402a;
    }

    @Override // com.bytedance.android.livesdk.widget.C11424f
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        if (this.f27402a <= 0 || C0705a.m2507f(getDrawable()) != 1) {
            z = false;
        } else {
            canvas.save();
            canvas.translate((float) this.f27402a, 0.0f);
            z = true;
        }
        float a = (float) m20240a(i4, paint.getFontMetricsInt(), getDrawable());
        if (this.f27404c > 0.0f) {
            Drawable drawable = getDrawable();
            C89219l.m154716b(drawable, "");
            float width = f + ((float) drawable.getBounds().width());
            Drawable drawable2 = getDrawable();
            C89219l.m154716b(drawable2, "");
            float height = a + ((float) drawable2.getBounds().height());
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.saveLayer(f, a, width, height, null);
            } else {
                canvas.saveLayer(f, a, width, height, null, 31);
            }
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        if (this.f27409h > 0.0f) {
            RectF rectF = this.f27411j;
            Drawable drawable3 = getDrawable();
            C89219l.m154716b(drawable3, "");
            Drawable drawable4 = getDrawable();
            C89219l.m154716b(drawable4, "");
            rectF.set(f, a, ((float) drawable3.getBounds().width()) + f, ((float) drawable4.getBounds().height()) + a);
            RectF rectF2 = this.f27411j;
            float f2 = this.f27404c;
            canvas.drawRoundRect(rectF2, f2, f2, this.f27410i);
        }
        if (this.f27404c > 0.0f) {
            RectF rectF3 = this.f27407f;
            Drawable drawable5 = getDrawable();
            C89219l.m154716b(drawable5, "");
            Drawable drawable6 = getDrawable();
            C89219l.m154716b(drawable6, "");
            rectF3.set(f, a, ((float) drawable5.getBounds().width()) + f, ((float) drawable6.getBounds().height()) + a);
            this.f27405d.reset();
            this.f27405d.addRoundRect(this.f27407f, this.f27403b, Path.Direction.CW);
            canvas.drawPath(this.f27405d, this.f27406e);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }
}
