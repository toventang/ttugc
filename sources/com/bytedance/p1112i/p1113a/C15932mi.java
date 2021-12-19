package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.mi */
public class C15932mi extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18198);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(17.25f, 12.4608f);
        this.f37302c.lineTo(17.25f, 35.5392f);
        this.f37302c.lineTo(36.606f, 24.0f);
        this.f37302c.lineTo(17.25f, 12.4608f);
        this.f37302c.close();
        this.f37302c.moveTo(12.75f, 10.2604f);
        this.f37302c.cubicTo(12.75f, 7.73827f, 15.4979f, 6.17732f, 17.6642f, 7.46879f);
        this.f37302c.lineTo(40.7113f, 21.2084f);
        this.f37302c.cubicTo(42.8257f, 22.4689f, 42.8257f, 25.5311f, 40.7113f, 26.7916f);
        this.f37302c.lineTo(17.6642f, 40.5312f);
        this.f37302c.cubicTo(15.4979f, 41.8227f, 12.75f, 40.2617f, 12.75f, 37.7396f);
        this.f37302c.lineTo(12.75f, 10.2604f);
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
