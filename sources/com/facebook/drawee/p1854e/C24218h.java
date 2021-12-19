package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.e.h */
public final class C24218h extends C24217g {

    /* renamed from: a */
    public Matrix f57372a;

    /* renamed from: b */
    private Matrix f57373b;

    /* renamed from: c */
    private int f57374c;

    /* renamed from: d */
    private int f57375d;

    static {
        Covode.recordClassIndex(28349);
    }

    /* renamed from: a */
    private void m45957a() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f57374c = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f57375d = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f57373b = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f57373b = this.f57372a;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.p1854e.C24217g
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m45957a();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m45957a();
        return current;
    }

    @Override // com.facebook.drawee.p1854e.C24217g, com.facebook.drawee.p1854e.AbstractC24243s
    public final void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.f57373b;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final void draw(Canvas canvas) {
        if (!(this.f57374c == getCurrent().getIntrinsicWidth() && this.f57375d == getCurrent().getIntrinsicHeight())) {
            m45957a();
        }
        if (this.f57373b != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f57373b);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }
}
