package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.in */
public class C15829in extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18095);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(23.0f, 9.0f);
        this.f37302c.cubicTo(15.268f, 9.0f, 9.0f, 14.268f, 9.0f, 22.0f);
        this.f37302c.lineTo(9.0f, 33.5f);
        this.f37302c.cubicTo(9.0f, 34.0523f, 8.55228f, 34.5f, 8.0f, 34.5f);
        this.f37302c.lineTo(6.0f, 34.5f);
        this.f37302c.cubicTo(5.44772f, 34.5f, 5.0f, 34.0523f, 5.0f, 33.5f);
        this.f37302c.lineTo(5.0f, 22.0f);
        this.f37302c.cubicTo(5.0f, 12.0589f, 13.0589f, 5.0f, 23.0f, 5.0f);
        this.f37302c.lineTo(25.0f, 5.0f);
        this.f37302c.cubicTo(34.9411f, 5.0f, 43.0f, 12.0589f, 43.0f, 22.0f);
        this.f37302c.lineTo(43.0f, 33.5f);
        this.f37302c.cubicTo(43.0f, 34.0523f, 42.5523f, 34.5f, 42.0f, 34.5f);
        this.f37302c.lineTo(40.0f, 34.5f);
        this.f37302c.cubicTo(39.4477f, 34.5f, 39.0f, 34.0523f, 39.0f, 33.5f);
        this.f37302c.lineTo(39.0f, 22.0f);
        this.f37302c.cubicTo(39.0f, 14.268f, 32.732f, 9.0f, 25.0f, 9.0f);
        this.f37302c.lineTo(23.0f, 9.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.0f, 29.0f);
        this.f37302c.cubicTo(11.0f, 27.8954f, 11.8954f, 27.0f, 13.0f, 27.0f);
        this.f37302c.lineTo(15.0f, 27.0f);
        this.f37302c.cubicTo(17.2091f, 27.0f, 19.0f, 28.7909f, 19.0f, 31.0f);
        this.f37302c.lineTo(19.0f, 39.0f);
        this.f37302c.cubicTo(19.0f, 41.2091f, 17.2091f, 43.0f, 15.0f, 43.0f);
        this.f37302c.lineTo(13.0f, 43.0f);
        this.f37302c.cubicTo(11.8954f, 43.0f, 11.0f, 42.1046f, 11.0f, 41.0f);
        this.f37302c.lineTo(11.0f, 29.0f);
        this.f37302c.close();
        this.f37302c.moveTo(33.0f, 27.0f);
        this.f37302c.cubicTo(30.7909f, 27.0f, 29.0f, 28.7909f, 29.0f, 31.0f);
        this.f37302c.lineTo(29.0f, 39.0f);
        this.f37302c.cubicTo(29.0f, 41.2091f, 30.7909f, 43.0f, 33.0f, 43.0f);
        this.f37302c.lineTo(35.0f, 43.0f);
        this.f37302c.cubicTo(36.1046f, 43.0f, 37.0f, 42.1046f, 37.0f, 41.0f);
        this.f37302c.lineTo(37.0f, 29.0f);
        this.f37302c.cubicTo(37.0f, 27.8954f, 36.1046f, 27.0f, 35.0f, 27.0f);
        this.f37302c.lineTo(33.0f, 27.0f);
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
