package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pe */
public class C16009pe extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18275);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(19.5f, 7.50006f);
        this.f37302c.lineTo(19.5f, 9.50006f);
        this.f37302c.lineTo(28.5f, 9.50006f);
        this.f37302c.lineTo(28.5f, 7.50006f);
        this.f37302c.lineTo(19.5f, 7.50006f);
        this.f37302c.close();
        this.f37302c.moveTo(32.5f, 9.50006f);
        this.f37302c.lineTo(32.5f, 6.00006f);
        this.f37302c.cubicTo(32.5f, 4.61935f, 31.3807f, 3.50006f, 30.0f, 3.50006f);
        this.f37302c.lineTo(18.0f, 3.50006f);
        this.f37302c.cubicTo(16.6193f, 3.50006f, 15.5f, 4.61935f, 15.5f, 6.00006f);
        this.f37302c.lineTo(15.5f, 9.50006f);
        this.f37302c.lineTo(7.0f, 9.50006f);
        this.f37302c.cubicTo(6.44772f, 9.50006f, 6.0f, 9.94778f, 6.0f, 10.5001f);
        this.f37302c.lineTo(6.0f, 12.5001f);
        this.f37302c.cubicTo(6.0f, 13.0523f, 6.44772f, 13.5001f, 7.0f, 13.5001f);
        this.f37302c.lineTo(9.5f, 13.5001f);
        this.f37302c.lineTo(9.5f, 39.5001f);
        this.f37302c.cubicTo(9.5f, 41.7092f, 11.2909f, 43.5001f, 13.5f, 43.5001f);
        this.f37302c.lineTo(34.5f, 43.5001f);
        this.f37302c.cubicTo(36.7091f, 43.5001f, 38.5f, 41.7092f, 38.5f, 39.5001f);
        this.f37302c.lineTo(38.5f, 13.5001f);
        this.f37302c.lineTo(41.0f, 13.5001f);
        this.f37302c.cubicTo(41.5523f, 13.5001f, 42.0f, 13.0523f, 42.0f, 12.5001f);
        this.f37302c.lineTo(42.0f, 10.5001f);
        this.f37302c.cubicTo(42.0f, 9.94778f, 41.5523f, 9.50006f, 41.0f, 9.50006f);
        this.f37302c.lineTo(32.5f, 9.50006f);
        this.f37302c.close();
        this.f37302c.moveTo(34.5f, 13.5001f);
        this.f37302c.lineTo(13.5f, 13.5001f);
        this.f37302c.lineTo(13.5f, 39.5001f);
        this.f37302c.lineTo(34.5f, 39.5001f);
        this.f37302c.lineTo(34.5f, 13.5001f);
        this.f37302c.close();
        this.f37302c.moveTo(18.5f, 34.0001f);
        this.f37302c.cubicTo(17.9477f, 34.0001f, 17.5f, 33.5523f, 17.5f, 33.0001f);
        this.f37302c.lineTo(17.5f, 20.0001f);
        this.f37302c.cubicTo(17.5f, 19.4478f, 17.9477f, 19.0001f, 18.5f, 19.0001f);
        this.f37302c.lineTo(20.5f, 19.0001f);
        this.f37302c.cubicTo(21.0523f, 19.0001f, 21.5f, 19.4478f, 21.5f, 20.0001f);
        this.f37302c.lineTo(21.5f, 33.0001f);
        this.f37302c.cubicTo(21.5f, 33.5523f, 21.0523f, 34.0001f, 20.5f, 34.0001f);
        this.f37302c.lineTo(18.5f, 34.0001f);
        this.f37302c.close();
        this.f37302c.moveTo(27.5f, 34.0001f);
        this.f37302c.cubicTo(26.9477f, 34.0001f, 26.5f, 33.5523f, 26.5f, 33.0001f);
        this.f37302c.lineTo(26.5f, 20.0001f);
        this.f37302c.cubicTo(26.5f, 19.4478f, 26.9477f, 19.0001f, 27.5f, 19.0001f);
        this.f37302c.lineTo(29.5f, 19.0001f);
        this.f37302c.cubicTo(30.0523f, 19.0001f, 30.5f, 19.4478f, 30.5f, 20.0001f);
        this.f37302c.lineTo(30.5f, 33.0001f);
        this.f37302c.cubicTo(30.5f, 33.5523f, 30.0523f, 34.0001f, 29.5f, 34.0001f);
        this.f37302c.lineTo(27.5f, 34.0001f);
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
