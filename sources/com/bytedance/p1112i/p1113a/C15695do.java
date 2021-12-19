package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.do */
public class C15695do extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17961);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(30.2886f, 24.9658f);
        this.f37302c.cubicTo(30.8088f, 25.3674f, 30.8068f, 26.153f, 30.2846f, 26.552f);
        this.f37302c.lineTo(18.8634f, 35.2767f);
        this.f37302c.cubicTo(18.2053f, 35.7794f, 17.2563f, 35.3102f, 17.2563f, 34.4821f);
        this.f37302c.lineTo(17.2563f, 16.9397f);
        this.f37302c.cubicTo(17.2563f, 16.1093f, 18.2101f, 15.6407f, 18.8675f, 16.1482f);
        this.f37302c.lineTo(30.2886f, 24.9658f);
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
