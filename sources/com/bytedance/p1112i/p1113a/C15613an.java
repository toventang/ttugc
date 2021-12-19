package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.an */
public class C15613an extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17879);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(16.0f, 8.0f);
        this.f37302c.cubicTo(14.8954f, 8.0f, 14.0f, 8.89543f, 14.0f, 10.0f);
        this.f37302c.lineTo(14.0f, 14.0f);
        this.f37302c.lineTo(10.0f, 14.0f);
        this.f37302c.cubicTo(8.89543f, 14.0f, 8.0f, 14.8954f, 8.0f, 16.0f);
        this.f37302c.lineTo(8.0f, 38.0f);
        this.f37302c.cubicTo(8.0f, 39.1046f, 8.89543f, 40.0f, 10.0f, 40.0f);
        this.f37302c.lineTo(32.0f, 40.0f);
        this.f37302c.cubicTo(33.1046f, 40.0f, 34.0f, 39.1046f, 34.0f, 38.0f);
        this.f37302c.lineTo(34.0f, 34.0f);
        this.f37302c.lineTo(38.0f, 34.0f);
        this.f37302c.cubicTo(39.1046f, 34.0f, 40.0f, 33.1046f, 40.0f, 32.0f);
        this.f37302c.lineTo(40.0f, 10.0f);
        this.f37302c.cubicTo(40.0f, 8.89543f, 39.1046f, 8.0f, 38.0f, 8.0f);
        this.f37302c.lineTo(16.0f, 8.0f);
        this.f37302c.close();
        this.f37302c.moveTo(32.0f, 14.0f);
        this.f37302c.lineTo(16.0f, 14.0f);
        this.f37302c.lineTo(16.0f, 10.0f);
        this.f37302c.lineTo(38.0f, 10.0f);
        this.f37302c.lineTo(38.0f, 32.0f);
        this.f37302c.lineTo(34.0f, 32.0f);
        this.f37302c.lineTo(34.0f, 16.0f);
        this.f37302c.cubicTo(34.0f, 14.8954f, 33.1046f, 14.0f, 32.0f, 14.0f);
        this.f37302c.close();
        this.f37302c.moveTo(10.0f, 38.0f);
        this.f37302c.lineTo(10.0f, 16.0f);
        this.f37302c.lineTo(32.0f, 16.0f);
        this.f37302c.lineTo(32.0f, 38.0f);
        this.f37302c.lineTo(10.0f, 38.0f);
        this.f37302c.close();
        this.f37302c.moveTo(20.1094f, 22.2044f);
        this.f37302c.cubicTo(18.7803f, 21.3184f, 17.0f, 22.2711f, 17.0f, 23.8685f);
        this.f37302c.lineTo(17.0f, 29.7338f);
        this.f37302c.cubicTo(17.0f, 31.2884f, 18.6959f, 32.2486f, 20.029f, 31.4488f);
        this.f37302c.lineTo(24.6595f, 28.6705f);
        this.f37302c.cubicTo(25.9185f, 27.9151f, 25.9615f, 26.1059f, 24.7399f, 25.2914f);
        this.f37302c.lineTo(20.1094f, 22.2044f);
        this.f37302c.close();
        this.f37302c.moveTo(19.0f, 23.8685f);
        this.f37302c.lineTo(23.6305f, 26.9555f);
        this.f37302c.lineTo(19.0f, 29.7338f);
        this.f37302c.lineTo(19.0f, 23.8685f);
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
