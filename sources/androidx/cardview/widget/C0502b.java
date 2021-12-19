package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.cardview.widget.b */
final class C0502b implements AbstractC0506e {
    static {
        Covode.recordClassIndex(569);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2222a() {
    }

    C0502b() {
    }

    /* renamed from: j */
    private static C0507f m1827j(AbstractC0505d dVar) {
        return (C0507f) dVar.mo2220c();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final float mo2224a(AbstractC0505d dVar) {
        return m1827j(dVar).f1906b;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: d */
    public final float mo2232d(AbstractC0505d dVar) {
        return m1827j(dVar).f1905a;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: h */
    public final ColorStateList mo2236h(AbstractC0505d dVar) {
        return m1827j(dVar).f1907c;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: b */
    public final float mo2228b(AbstractC0505d dVar) {
        return m1827j(dVar).f1905a * 2.0f;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: c */
    public final float mo2230c(AbstractC0505d dVar) {
        return m1827j(dVar).f1905a * 2.0f;
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: e */
    public final float mo2233e(AbstractC0505d dVar) {
        return dVar.mo2221d().getElevation();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: f */
    public final void mo2234f(AbstractC0505d dVar) {
        mo2229b(dVar, m1827j(dVar).f1906b);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: g */
    public final void mo2235g(AbstractC0505d dVar) {
        mo2229b(dVar, m1827j(dVar).f1906b);
    }

    /* renamed from: i */
    private static void m1826i(AbstractC0505d dVar) {
        if (!dVar.mo2218a()) {
            dVar.mo2216a(0, 0, 0, 0);
            return;
        }
        float f = m1827j(dVar).f1906b;
        float f2 = m1827j(dVar).f1905a;
        int ceil = (int) Math.ceil((double) C0508g.m1886b(f, f2, dVar.mo2219b()));
        int ceil2 = (int) Math.ceil((double) C0508g.m1884a(f, f2, dVar.mo2219b()));
        dVar.mo2216a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: c */
    public final void mo2231c(AbstractC0505d dVar, float f) {
        dVar.mo2221d().setElevation(f);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2227a(AbstractC0505d dVar, ColorStateList colorStateList) {
        C0507f j = m1827j(dVar);
        j.mo2238a(colorStateList);
        j.invalidateSelf();
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2225a(AbstractC0505d dVar, float f) {
        C0507f j = m1827j(dVar);
        if (f != j.f1905a) {
            j.f1905a = f;
            j.mo2239a((Rect) null);
            j.invalidateSelf();
        }
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: b */
    public final void mo2229b(AbstractC0505d dVar, float f) {
        m1827j(dVar).mo2237a(f, dVar.mo2218a(), dVar.mo2219b());
        m1826i(dVar);
    }

    @Override // androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2226a(AbstractC0505d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2217a(new C0507f(colorStateList, f));
        View d = dVar.mo2221d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo2229b(dVar, f3);
    }
}
