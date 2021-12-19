package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.kw */
public class C15892kw extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18158);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 3.0f);
        this.f37302c.cubicTo(17.9249f, 3.0f, 13.0f, 7.92487f, 13.0f, 14.0f);
        this.f37302c.lineTo(13.0f, 21.0f);
        this.f37302c.lineTo(8.0f, 21.0f);
        this.f37302c.cubicTo(6.89543f, 21.0f, 6.0f, 21.8954f, 6.0f, 23.0f);
        this.f37302c.lineTo(6.0f, 41.0f);
        this.f37302c.cubicTo(6.0f, 42.1046f, 6.89543f, 43.0f, 8.0f, 43.0f);
        this.f37302c.lineTo(40.0f, 43.0f);
        this.f37302c.cubicTo(41.1046f, 43.0f, 42.0f, 42.1046f, 42.0f, 41.0f);
        this.f37302c.lineTo(42.0f, 23.0f);
        this.f37302c.cubicTo(42.0f, 21.8954f, 41.1046f, 21.0f, 40.0f, 21.0f);
        this.f37302c.lineTo(35.0f, 21.0f);
        this.f37302c.lineTo(35.0f, 14.0f);
        this.f37302c.cubicTo(35.0f, 7.92487f, 30.0751f, 3.0f, 24.0f, 3.0f);
        this.f37302c.close();
        this.f37302c.moveTo(31.0f, 21.0f);
        this.f37302c.lineTo(31.0f, 14.0f);
        this.f37302c.cubicTo(31.0f, 10.134f, 27.866f, 7.0f, 24.0f, 7.0f);
        this.f37302c.cubicTo(20.134f, 7.0f, 17.0f, 10.134f, 17.0f, 14.0f);
        this.f37302c.lineTo(17.0f, 21.0f);
        this.f37302c.lineTo(31.0f, 21.0f);
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
