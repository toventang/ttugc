package com.facebook.drawee.p1855f;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.AbstractC24244t;
import com.facebook.drawee.p1854e.AbstractC24245u;
import com.facebook.drawee.p1854e.C24217g;

/* renamed from: com.facebook.drawee.f.d */
public final class C24249d extends C24217g implements AbstractC24244t {

    /* renamed from: a */
    Drawable f57497a;

    /* renamed from: b */
    private AbstractC24245u f57498b;

    static {
        Covode.recordClassIndex(28380);
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final int getIntrinsicWidth() {
        return -1;
    }

    public C24249d(Drawable drawable) {
        super(drawable);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24244t
    /* renamed from: a */
    public final void mo39947a(AbstractC24245u uVar) {
        this.f57498b = uVar;
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            AbstractC24245u uVar = this.f57498b;
            if (uVar != null) {
                uVar.mo39948a();
            }
            super.draw(canvas);
            Drawable drawable = this.f57497a;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f57497a.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.p1854e.C24217g
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC24245u uVar = this.f57498b;
        if (uVar != null) {
            uVar.mo39949a(z);
        }
        return super.setVisible(z, z2);
    }
}
