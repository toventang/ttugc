package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ou */
public class C15998ou extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18264);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(42.6922f, 12.7217f);
        this.f37302c.cubicTo(43.0745f, 13.1203f, 43.0613f, 13.7533f, 42.6628f, 14.1356f);
        this.f37302c.lineTo(18.8844f, 36.9434f);
        this.f37302c.cubicTo(18.099f, 37.6967f, 16.8554f, 37.6838f, 16.0858f, 36.9142f);
        this.f37302c.lineTo(5.29289f, 26.1213f);
        this.f37302c.cubicTo(4.90237f, 25.7308f, 4.90237f, 25.0976f, 5.29289f, 24.7071f);
        this.f37302c.lineTo(6.70711f, 23.2929f);
        this.f37302c.cubicTo(7.09763f, 22.9024f, 7.7308f, 22.9024f, 8.12132f, 23.2929f);
        this.f37302c.lineTo(17.5292f, 32.7007f);
        this.f37302c.lineTo(39.8939f, 11.2489f);
        this.f37302c.cubicTo(40.2924f, 10.8666f, 40.9255f, 10.8798f, 41.3078f, 11.2783f);
        this.f37302c.lineTo(42.6922f, 12.7217f);
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
