package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lc */
public class C15899lc extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18165);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 2.0f);
        this.f37302c.cubicTo(18.4772f, 2.0f, 14.0f, 6.47715f, 14.0f, 12.0f);
        this.f37302c.lineTo(14.0f, 25.0f);
        this.f37302c.cubicTo(14.0f, 30.5228f, 18.4772f, 35.0f, 24.0f, 35.0f);
        this.f37302c.cubicTo(29.5228f, 35.0f, 34.0f, 30.5228f, 34.0f, 25.0f);
        this.f37302c.lineTo(34.0f, 12.0f);
        this.f37302c.cubicTo(34.0f, 6.47715f, 29.5228f, 2.0f, 24.0f, 2.0f);
        this.f37302c.close();
        this.f37302c.moveTo(18.0f, 12.0f);
        this.f37302c.cubicTo(18.0f, 8.68629f, 20.6863f, 6.0f, 24.0f, 6.0f);
        this.f37302c.cubicTo(27.3137f, 6.0f, 30.0f, 8.68629f, 30.0f, 12.0f);
        this.f37302c.lineTo(30.0f, 25.0f);
        this.f37302c.cubicTo(30.0f, 28.3137f, 27.3137f, 31.0f, 24.0f, 31.0f);
        this.f37302c.cubicTo(20.6863f, 31.0f, 18.0f, 28.3137f, 18.0f, 25.0f);
        this.f37302c.lineTo(18.0f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 23.0f);
        this.f37302c.cubicTo(12.0f, 22.4477f, 11.5523f, 22.0f, 11.0f, 22.0f);
        this.f37302c.lineTo(9.0f, 22.0f);
        this.f37302c.cubicTo(8.44772f, 22.0f, 8.0f, 22.4477f, 8.0f, 23.0f);
        this.f37302c.lineTo(8.0f, 25.0f);
        this.f37302c.cubicTo(8.0f, 33.1592f, 14.1074f, 39.892f, 22.0f, 40.8762f);
        this.f37302c.lineTo(22.0f, 44.0f);
        this.f37302c.cubicTo(22.0f, 44.5523f, 22.4477f, 45.0f, 23.0f, 45.0f);
        this.f37302c.lineTo(25.0f, 45.0f);
        this.f37302c.cubicTo(25.5523f, 45.0f, 26.0f, 44.5523f, 26.0f, 44.0f);
        this.f37302c.lineTo(26.0f, 40.8762f);
        this.f37302c.cubicTo(33.8926f, 39.892f, 40.0f, 33.1592f, 40.0f, 25.0f);
        this.f37302c.lineTo(40.0f, 23.0f);
        this.f37302c.cubicTo(40.0f, 22.4477f, 39.5523f, 22.0f, 39.0f, 22.0f);
        this.f37302c.lineTo(37.0f, 22.0f);
        this.f37302c.cubicTo(36.4477f, 22.0f, 36.0f, 22.4477f, 36.0f, 23.0f);
        this.f37302c.lineTo(36.0f, 25.0f);
        this.f37302c.cubicTo(36.0f, 31.6274f, 30.6274f, 37.0f, 24.0f, 37.0f);
        this.f37302c.cubicTo(17.3726f, 37.0f, 12.0f, 31.6274f, 12.0f, 25.0f);
        this.f37302c.lineTo(12.0f, 23.0f);
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
