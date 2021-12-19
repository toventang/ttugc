package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fk */
public class C15745fk extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18011);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(26.1215f, 12.8787f);
        this.f37302c.lineTo(42.5001f, 29.2577f);
        this.f37302c.cubicTo(42.8906f, 29.6482f, 42.8906f, 30.2813f, 42.5001f, 30.6719f);
        this.f37302c.lineTo(39.6716f, 33.5003f);
        this.f37302c.cubicTo(39.2811f, 33.8908f, 38.648f, 33.8908f, 38.2574f, 33.5003f);
        this.f37302c.lineTo(24.0002f, 19.2427f);
        this.f37302c.lineTo(9.74252f, 33.5003f);
        this.f37302c.cubicTo(9.35199f, 33.8908f, 8.71883f, 33.8908f, 8.3283f, 33.5003f);
        this.f37302c.lineTo(5.49988f, 30.6719f);
        this.f37302c.cubicTo(5.10935f, 30.2814f, 5.10935f, 29.6482f, 5.49988f, 29.2577f);
        this.f37302c.lineTo(21.8788f, 12.8787f);
        this.f37302c.cubicTo(23.0504f, 11.7071f, 24.9499f, 11.7071f, 26.1215f, 12.8787f);
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
