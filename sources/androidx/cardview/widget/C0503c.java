package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0508g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.c */
public class C0503c implements AbstractC0506e {

    /* renamed from: a */
    final RectF f1903a = new RectF();

    static {
        Covode.recordClassIndex(570);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: f */
    public final void mo2234f(AbstractC0505d dVar) {
    }

    C0503c() {
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public void mo2222a() {
        C0508g.f1916a = new C0508g.AbstractC0509a() {
            /* class androidx.cardview.widget.C0503c.C05041 */

            static {
                Covode.recordClassIndex(571);
            }

            @Override // androidx.cardview.widget.C0508g.AbstractC0509a
            /* renamed from: a */
            public final void mo2223a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C0503c.this.f1903a.set(f4, f4, f3, f3);
                    int save = canvas2.save();
                    canvas2.translate(rectF.left + f3, rectF.top + f3);
                    canvas2.drawArc(C0503c.this.f1903a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(C0503c.this.f1903a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2.drawArc(C0503c.this.f1903a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas2 = canvas2;
                    canvas2.drawArc(C0503c.this.f1903a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas2.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint2);
                    paint2 = paint2;
                    canvas2.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint2);
                }
                canvas2.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint2);
            }
        };
    }

    /* renamed from: j */
    private static C0508g m1843j(AbstractC0505d dVar) {
        return (C0508g) dVar.mo2220c();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final float mo2224a(AbstractC0505d dVar) {
        return m1843j(dVar).f1919c;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: d */
    public final float mo2232d(AbstractC0505d dVar) {
        return m1843j(dVar).f1918b;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: e */
    public final float mo2233e(AbstractC0505d dVar) {
        return m1843j(dVar).f1920d;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: h */
    public final ColorStateList mo2236h(AbstractC0505d dVar) {
        return m1843j(dVar).f1921e;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: b */
    public final float mo2228b(AbstractC0505d dVar) {
        return m1843j(dVar).mo2250a();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: c */
    public final float mo2230c(AbstractC0505d dVar) {
        return m1843j(dVar).mo2254b();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: g */
    public final void mo2235g(AbstractC0505d dVar) {
        m1843j(dVar).mo2253a(dVar.mo2219b());
        m1842i(dVar);
    }

    /* renamed from: i */
    private static void m1842i(AbstractC0505d dVar) {
        Rect rect = new Rect();
        m1843j(dVar).getPadding(rect);
        dVar.mo2215a((int) Math.ceil((double) m1843j(dVar).mo2250a()), (int) Math.ceil((double) m1843j(dVar).mo2254b()));
        dVar.mo2216a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: b */
    public final void mo2229b(AbstractC0505d dVar, float f) {
        C0508g j = m1843j(dVar);
        j.mo2251a(j.f1920d, f);
        m1842i(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: c */
    public final void mo2231c(AbstractC0505d dVar, float f) {
        C0508g j = m1843j(dVar);
        j.mo2251a(f, j.f1919c);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2225a(AbstractC0505d dVar, float f) {
        C0508g j = m1843j(dVar);
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (j.f1918b != f2) {
                j.f1918b = f2;
                j.f1922f = true;
                j.invalidateSelf();
            }
            m1842i(dVar);
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2227a(AbstractC0505d dVar, ColorStateList colorStateList) {
        C0508g j = m1843j(dVar);
        j.mo2252a(colorStateList);
        j.invalidateSelf();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2226a(AbstractC0505d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0508g gVar = new C0508g(context.getResources(), colorStateList, f, f2, f3);
        gVar.mo2253a(dVar.mo2219b());
        dVar.mo2217a(gVar);
        m1842i(dVar);
    }
}
