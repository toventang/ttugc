package com.google.android.material.p1953c.p1954a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1953c.AbstractC26621d;
import com.google.android.material.p1953c.C26619c;

/* renamed from: com.google.android.material.c.a.a */
public class C26617a extends CardView implements AbstractC26621d {

    /* renamed from: e */
    private final C26619c f62931e;

    static {
        Covode.recordClassIndex(32065);
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    /* renamed from: a */
    public final void mo43993a() {
        this.f62931e.mo44008a();
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    /* renamed from: b */
    public final void mo43995b() {
        this.f62931e.mo44013b();
    }

    @Override // com.google.android.material.p1953c.C26619c.AbstractC26620a
    /* renamed from: c */
    public final boolean mo43996c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f62931e.f62935c;
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    public AbstractC26621d.C26625d getRevealInfo() {
        return this.f62931e.mo44014c();
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    public int getCircularRevealScrimColor() {
        return this.f62931e.f62934b.getColor();
    }

    public boolean isOpaque() {
        C26619c cVar = this.f62931e;
        if (cVar != null) {
            return cVar.mo44015d();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.p1953c.C26619c.AbstractC26620a
    /* renamed from: a */
    public final void mo43994a(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f62931e.mo44011a(drawable);
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    public void setCircularRevealScrimColor(int i) {
        this.f62931e.mo44009a(i);
    }

    @Override // com.google.android.material.p1953c.AbstractC26621d
    public void setRevealInfo(AbstractC26621d.C26625d dVar) {
        this.f62931e.mo44012a(dVar);
    }

    public void draw(Canvas canvas) {
        C26619c cVar = this.f62931e;
        if (cVar != null) {
            cVar.mo44010a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
