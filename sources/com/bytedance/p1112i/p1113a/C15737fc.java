package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fc */
public class C15737fc extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18003);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(13.7929f, 21.6213f);
        this.f37302c.cubicTo(13.4024f, 21.2308f, 13.4024f, 20.5976f, 13.7929f, 20.2071f);
        this.f37302c.lineTo(15.2071f, 18.7929f);
        this.f37302c.cubicTo(15.5976f, 18.4024f, 16.2308f, 18.4024f, 16.6213f, 18.7929f);
        this.f37302c.lineTo(24.0f, 26.1716f);
        this.f37302c.lineTo(31.3787f, 18.7929f);
        this.f37302c.cubicTo(31.7692f, 18.4024f, 32.4024f, 18.4024f, 32.7929f, 18.7929f);
        this.f37302c.lineTo(34.2071f, 20.2071f);
        this.f37302c.cubicTo(34.5976f, 20.5976f, 34.5976f, 21.2308f, 34.2071f, 21.6213f);
        this.f37302c.lineTo(24.7071f, 31.1213f);
        this.f37302c.cubicTo(24.3166f, 31.5118f, 23.6834f, 31.5118f, 23.2929f, 31.1213f);
        this.f37302c.lineTo(13.7929f, 21.6213f);
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
