package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.mf */
public class C15929mf extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18195);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(14.0f, 3.0f);
        this.f37302c.cubicTo(13.4477f, 3.0f, 13.0f, 3.44772f, 13.0f, 4.0f);
        this.f37302c.lineTo(13.0f, 6.0f);
        this.f37302c.cubicTo(13.0f, 6.55228f, 13.4477f, 7.0f, 14.0f, 7.0f);
        this.f37302c.lineTo(17.5556f, 7.0f);
        this.f37302c.lineTo(14.8889f, 25.0f);
        this.f37302c.lineTo(10.0f, 25.0f);
        this.f37302c.cubicTo(8.89543f, 25.0f, 8.0f, 25.8954f, 8.0f, 27.0f);
        this.f37302c.lineTo(8.0f, 34.0f);
        this.f37302c.cubicTo(8.0f, 35.1046f, 8.89543f, 36.0f, 10.0f, 36.0f);
        this.f37302c.lineTo(22.0f, 36.0f);
        this.f37302c.lineTo(22.0f, 44.0f);
        this.f37302c.cubicTo(22.0f, 45.1046f, 22.8954f, 46.0f, 24.0f, 46.0f);
        this.f37302c.cubicTo(25.1046f, 46.0f, 26.0f, 45.1046f, 26.0f, 44.0f);
        this.f37302c.lineTo(26.0f, 36.0f);
        this.f37302c.lineTo(38.0f, 36.0f);
        this.f37302c.cubicTo(39.1046f, 36.0f, 40.0f, 35.1046f, 40.0f, 34.0f);
        this.f37302c.lineTo(40.0f, 27.0f);
        this.f37302c.cubicTo(40.0f, 25.8954f, 39.1046f, 25.0f, 38.0f, 25.0f);
        this.f37302c.lineTo(33.1111f, 25.0f);
        this.f37302c.lineTo(30.4444f, 7.0f);
        this.f37302c.lineTo(34.0f, 7.0f);
        this.f37302c.cubicTo(34.5523f, 7.0f, 35.0f, 6.55228f, 35.0f, 6.0f);
        this.f37302c.lineTo(35.0f, 4.0f);
        this.f37302c.cubicTo(35.0f, 3.44772f, 34.5523f, 3.0f, 34.0f, 3.0f);
        this.f37302c.lineTo(14.0f, 3.0f);
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
