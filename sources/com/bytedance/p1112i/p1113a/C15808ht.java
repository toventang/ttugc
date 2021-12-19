package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ht */
public class C15808ht extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18074);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(16.0f, 4.0f);
        this.f37302c.lineTo(33.0f, 4.0f);
        this.f37302c.cubicTo(37.9706f, 4.0f, 42.0f, 8.02944f, 42.0f, 13.0f);
        this.f37302c.lineTo(42.0f, 35.0f);
        this.f37302c.cubicTo(42.0f, 35.5523f, 41.5523f, 36.0f, 41.0f, 36.0f);
        this.f37302c.lineTo(39.0f, 36.0f);
        this.f37302c.cubicTo(38.4477f, 36.0f, 38.0f, 35.5523f, 38.0f, 35.0f);
        this.f37302c.lineTo(38.0f, 14.0f);
        this.f37302c.cubicTo(38.0f, 10.6863f, 35.3137f, 8.0f, 32.0f, 8.0f);
        this.f37302c.lineTo(16.0f, 8.0f);
        this.f37302c.cubicTo(15.4477f, 8.0f, 15.0f, 7.55228f, 15.0f, 7.0f);
        this.f37302c.lineTo(15.0f, 5.0f);
        this.f37302c.cubicTo(15.0f, 4.44772f, 15.4477f, 4.0f, 16.0f, 4.0f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 12.0f);
        this.f37302c.cubicTo(9.23858f, 12.0f, 7.0f, 14.2386f, 7.0f, 17.0f);
        this.f37302c.lineTo(7.0f, 42.0f);
        this.f37302c.cubicTo(7.0f, 42.7421f, 7.41085f, 43.4231f, 8.06727f, 43.7692f);
        this.f37302c.cubicTo(8.72368f, 44.1153f, 9.51775f, 44.0694f, 10.13f, 43.6502f);
        this.f37302c.lineTo(20.5f, 36.549f);
        this.f37302c.lineTo(30.87f, 43.6502f);
        this.f37302c.cubicTo(31.4822f, 44.0694f, 32.2763f, 44.1153f, 32.9327f, 43.7692f);
        this.f37302c.cubicTo(33.5891f, 43.4231f, 34.0f, 42.7421f, 34.0f, 42.0f);
        this.f37302c.lineTo(34.0f, 17.0f);
        this.f37302c.cubicTo(34.0f, 14.2386f, 31.7614f, 12.0f, 29.0f, 12.0f);
        this.f37302c.lineTo(12.0f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(11.0f, 17.0f);
        this.f37302c.cubicTo(11.0f, 16.4477f, 11.4477f, 16.0f, 12.0f, 16.0f);
        this.f37302c.lineTo(29.0f, 16.0f);
        this.f37302c.cubicTo(29.5523f, 16.0f, 30.0f, 16.4477f, 30.0f, 17.0f);
        this.f37302c.lineTo(30.0f, 38.2064f);
        this.f37302c.lineTo(21.63f, 32.4748f);
        this.f37302c.cubicTo(20.9489f, 32.0084f, 20.0511f, 32.0084f, 19.37f, 32.4748f);
        this.f37302c.lineTo(11.0f, 38.2064f);
        this.f37302c.lineTo(11.0f, 17.0f);
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
