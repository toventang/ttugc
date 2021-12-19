package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.drawee.p1854e.C24229q;

/* renamed from: com.facebook.drawee.e.p */
public class C24228p extends C24217g {

    /* renamed from: a */
    public C24229q.AbstractC24231b f57445a;

    /* renamed from: b */
    Object f57446b;

    /* renamed from: c */
    public PointF f57447c = null;

    /* renamed from: d */
    int f57448d = 0;

    /* renamed from: e */
    int f57449e = 0;

    /* renamed from: f */
    Matrix f57450f;

    /* renamed from: g */
    private Matrix f57451g = new Matrix();

    static {
        Covode.recordClassIndex(28359);
    }

    /* renamed from: a */
    private void m45990a() {
        boolean z;
        C24229q.AbstractC24231b bVar = this.f57445a;
        if (bVar instanceof C24229q.AbstractC24241l) {
            Object a = ((C24229q.AbstractC24241l) bVar).mo39946a();
            if (a == null || !a.equals(this.f57446b)) {
                z = true;
            } else {
                z = false;
            }
            this.f57446b = a;
        } else {
            z = false;
        }
        if (this.f57448d != getCurrent().getIntrinsicWidth() || this.f57449e != getCurrent().getIntrinsicHeight() || z) {
            m45991b();
        }
    }

    /* renamed from: b */
    private void m45991b() {
        float f;
        float f2;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f57448d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f57449e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f57450f = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f57450f = null;
        } else if (this.f57445a == C24229q.AbstractC24231b.f57452b) {
            current.setBounds(bounds);
            this.f57450f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C24229q.AbstractC24231b bVar = this.f57445a;
            Matrix matrix = this.f57451g;
            PointF pointF = this.f57447c;
            if (pointF != null) {
                f = pointF.x;
            } else {
                f = 0.5f;
            }
            PointF pointF2 = this.f57447c;
            if (pointF2 != null) {
                f2 = pointF2.y;
            } else {
                f2 = 0.5f;
            }
            bVar.mo39936a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
            this.f57450f = this.f57451g;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.drawee.p1854e.C24217g
    public void onBoundsChange(Rect rect) {
        m45991b();
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m45991b();
        return current;
    }

    @Override // com.facebook.drawee.p1854e.C24217g, com.facebook.drawee.p1854e.AbstractC24243s
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m45990a();
        Matrix matrix2 = this.f57450f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public final void mo39934a(PointF pointF) {
        if (!C24088h.m45611a(this.f57447c, pointF)) {
            if (this.f57447c == null) {
                this.f57447c = new PointF();
            }
            this.f57447c.set(pointF);
            m45991b();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public void draw(Canvas canvas) {
        m45990a();
        if (this.f57450f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f57450f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: a */
    public final void mo39935a(C24229q.AbstractC24231b bVar) {
        if (!C24088h.m45611a(this.f57445a, bVar)) {
            this.f57445a = bVar;
            this.f57446b = null;
            m45991b();
            invalidateSelf();
        }
    }

    public C24228p(Drawable drawable, C24229q.AbstractC24231b bVar) {
        super((Drawable) C24091i.m45617a(drawable));
        this.f57445a = bVar;
    }
}
