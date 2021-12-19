package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fe */
public class C15739fe extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18005);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(4.58579f, 22.5858f);
        this.f37302c.lineTo(20.8787f, 6.29289f);
        this.f37302c.cubicTo(21.2692f, 5.90237f, 21.9024f, 5.90237f, 22.2929f, 6.29289f);
        this.f37302c.lineTo(23.7071f, 7.70711f);
        this.f37302c.cubicTo(24.0976f, 8.09763f, 24.0976f, 8.7308f, 23.7071f, 9.12132f);
        this.f37302c.lineTo(8.82843f, 24.0f);
        this.f37302c.lineTo(23.7071f, 38.8787f);
        this.f37302c.cubicTo(24.0976f, 39.2692f, 24.0976f, 39.9024f, 23.7071f, 40.2929f);
        this.f37302c.lineTo(22.2929f, 41.7071f);
        this.f37302c.cubicTo(21.9024f, 42.0976f, 21.2692f, 42.0976f, 20.8787f, 41.7071f);
        this.f37302c.lineTo(4.58579f, 25.4142f);
        this.f37302c.cubicTo(3.80474f, 24.6332f, 3.80474f, 23.3668f, 4.58579f, 22.5858f);
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
