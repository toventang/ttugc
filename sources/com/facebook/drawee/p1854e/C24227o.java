package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.drawee.e.o */
public final class C24227o extends AbstractC24226n {
    static {
        Covode.recordClassIndex(28358);
    }

    public C24227o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24226n
    public final void draw(Canvas canvas) {
        C24644b.m47156a();
        if (!mo39913b()) {
            super.draw(canvas);
            C24644b.m47156a();
            return;
        }
        mo39926c();
        mo39928d();
        canvas.clipPath(this.f57424f);
        super.draw(canvas);
        C24644b.m47156a();
    }
}
