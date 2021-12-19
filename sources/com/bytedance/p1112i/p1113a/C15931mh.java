package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.mh */
public class C15931mh extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18197);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(12.0f, 8.77702f);
        this.f37302c.cubicTo(12.0f, 6.43812f, 14.5577f, 4.99881f, 16.5569f, 6.21266f);
        this.f37302c.lineTo(41.6301f, 21.4356f);
        this.f37302c.cubicTo(43.5542f, 22.6038f, 43.5542f, 25.3962f, 41.6301f, 26.5644f);
        this.f37302c.lineTo(16.5569f, 41.7873f);
        this.f37302c.cubicTo(14.5577f, 43.0012f, 12.0f, 41.5619f, 12.0f, 39.223f);
        this.f37302c.lineTo(12.0f, 8.77702f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
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
