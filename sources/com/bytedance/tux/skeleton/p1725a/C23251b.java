package com.bytedance.tux.skeleton.p1725a;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.skeleton.a.b */
public final class C23251b extends AbstractC23250a {

    /* renamed from: c */
    public final Paint f55100c;

    /* renamed from: d */
    public int f55101d;

    static {
        Covode.recordClassIndex(27194);
    }

    public C23251b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        this.f55100c = paint;
    }

    @Override // com.bytedance.tux.skeleton.p1725a.AbstractC23250a
    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        super.draw(canvas);
        canvas.drawRoundRect(mo37856a(), this.f55097a, this.f55097a, this.f55100c);
    }
}
