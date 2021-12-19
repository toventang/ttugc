package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oz */
public class C16003oz extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18269);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(42.0f, 13.875f);
        this.f37302c.cubicTo(36.4081f, 13.875f, 31.875f, 9.34188f, 31.875f, 3.75f);
        this.f37302c.lineTo(25.125f, 3.75f);
        this.f37302c.lineTo(25.125f, 31.3125f);
        this.f37302c.cubicTo(25.125f, 34.7298f, 22.3548f, 37.5f, 18.9375f, 37.5f);
        this.f37302c.cubicTo(15.5202f, 37.5f, 12.75f, 34.7298f, 12.75f, 31.3125f);
        this.f37302c.cubicTo(12.75f, 27.8952f, 15.5202f, 25.125f, 18.9375f, 25.125f);
        this.f37302c.cubicTo(19.4439f, 25.125f, 19.9318f, 25.1851f, 20.3962f, 25.2971f);
        this.f37302c.cubicTo(20.4731f, 25.3157f, 20.5493f, 25.3356f, 20.625f, 25.357f);
        this.f37302c.lineTo(20.625f, 18.4844f);
        this.f37302c.cubicTo(20.0716f, 18.4122f, 19.5082f, 18.375f, 18.9375f, 18.375f);
        this.f37302c.cubicTo(11.7923f, 18.375f, 6.0f, 24.1673f, 6.0f, 31.3125f);
        this.f37302c.cubicTo(6.0f, 38.4577f, 11.7923f, 44.25f, 18.9375f, 44.25f);
        this.f37302c.cubicTo(26.0827f, 44.25f, 31.875f, 38.4577f, 31.875f, 31.3125f);
        this.f37302c.lineTo(31.875f, 17.2512f);
        this.f37302c.cubicTo(34.6954f, 19.3697f, 38.2011f, 20.625f, 42.0f, 20.625f);
        this.f37302c.lineTo(42.0f, 13.875f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
