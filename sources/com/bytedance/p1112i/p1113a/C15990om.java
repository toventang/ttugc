package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.om */
public class C15990om extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18256);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.9505f, 7.84001f);
        this.f37302c.cubicTo(24.3975f, 7.38666f, 23.6014f, 7.38666f, 23.0485f, 7.84003f);
        this.f37302c.lineTo(6.94846f, 21.04f);
        this.f37302c.cubicTo(6.45839f, 21.4418f, 6.2737f, 22.1083f, 6.48706f, 22.705f);
        this.f37302c.cubicTo(6.70041f, 23.3017f, 7.26576f, 23.7f, 7.89949f, 23.7f);
        this.f37302c.lineTo(10.2311f, 23.7f);
        this.f37302c.lineTo(11.4232f, 36.7278f);
        this.f37302c.cubicTo(11.5409f, 38.0149f, 12.6203f, 39.0f, 13.9128f, 39.0f);
        this.f37302c.lineTo(21.5f, 39.0f);
        this.f37302c.cubicTo(22.0523f, 39.0f, 22.5f, 38.5523f, 22.5f, 38.0f);
        this.f37302c.lineTo(22.5f, 28.3153f);
        this.f37302c.cubicTo(22.5f, 27.763f, 22.9477f, 27.3153f, 23.5f, 27.3153f);
        this.f37302c.lineTo(24.5f, 27.3153f);
        this.f37302c.cubicTo(25.0523f, 27.3153f, 25.5f, 27.763f, 25.5f, 28.3153f);
        this.f37302c.lineTo(25.5f, 38.0f);
        this.f37302c.cubicTo(25.5f, 38.5523f, 25.9477f, 39.0f, 26.5f, 39.0f);
        this.f37302c.lineTo(34.0874f, 39.0f);
        this.f37302c.cubicTo(35.3798f, 39.0f, 36.4592f, 38.0149f, 36.577f, 36.7278f);
        this.f37302c.lineTo(37.7691f, 23.7f);
        this.f37302c.lineTo(40.1001f, 23.7f);
        this.f37302c.cubicTo(40.7338f, 23.7f, 41.2992f, 23.3017f, 41.5125f, 22.705f);
        this.f37302c.cubicTo(41.7259f, 22.1082f, 41.5412f, 21.4418f, 41.0511f, 21.04f);
        this.f37302c.lineTo(24.9505f, 7.84001f);
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
