package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fg */
public class C15741fg extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18007);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(39.7574f, 24.0f);
        this.f37302c.lineTo(24.5859f, 8.82844f);
        this.f37302c.cubicTo(24.1953f, 8.43792f, 24.1953f, 7.80475f, 24.5859f, 7.41423f);
        this.f37302c.lineTo(27.4143f, 4.5858f);
        this.f37302c.cubicTo(27.8048f, 4.19528f, 28.438f, 4.19528f, 28.8285f, 4.5858f);
        this.f37302c.lineTo(46.1214f, 21.8787f);
        this.f37302c.cubicTo(47.293f, 23.0503f, 47.293f, 24.9498f, 46.1214f, 26.1213f);
        this.f37302c.lineTo(28.8285f, 43.4142f);
        this.f37302c.cubicTo(28.438f, 43.8047f, 27.8048f, 43.8047f, 27.4143f, 43.4142f);
        this.f37302c.lineTo(24.5859f, 40.5858f);
        this.f37302c.cubicTo(24.1953f, 40.1953f, 24.1953f, 39.5621f, 24.5859f, 39.1716f);
        this.f37302c.lineTo(39.7574f, 24.0f);
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
