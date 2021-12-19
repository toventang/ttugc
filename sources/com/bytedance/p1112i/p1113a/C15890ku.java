package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ku */
public class C15890ku extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18156);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.186f, 4.91561f);
        this.f37302c.cubicTo(22.9022f, 3.37017f, 25.0991f, 3.37017f, 25.8153f, 4.91561f);
        this.f37302c.lineTo(40.7669f, 37.1798f);
        this.f37302c.cubicTo(41.5429f, 38.8542f, 39.8303f, 40.5965f, 38.1428f, 39.8495f);
        this.f37302c.lineTo(24.0006f, 33.5896f);
        this.f37302c.lineTo(9.85846f, 39.8496f);
        this.f37302c.cubicTo(8.17094f, 40.5965f, 6.45838f, 38.8542f, 7.23432f, 37.1798f);
        this.f37302c.lineTo(22.186f, 4.91561f);
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
