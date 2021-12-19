package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.eh */
public class C15715eh extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17981);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(9.07558f, 25.8218f);
        this.f37302c.lineTo(17.9535f, 2.71407f);
        this.f37302c.cubicTo(18.119f, 2.28321f, 18.5316f, 1.99902f, 18.9916f, 1.99902f);
        this.f37302c.lineTo(33.8861f, 1.99902f);
        this.f37302c.cubicTo(34.6954f, 1.99902f, 35.234f, 2.83867f, 34.8991f, 3.57823f);
        this.f37302c.lineTo(29.3748f, 15.7784f);
        this.f37302c.cubicTo(29.04f, 16.518f, 29.5786f, 17.3576f, 30.3878f, 17.3576f);
        this.f37302c.lineTo(36.8853f, 17.3576f);
        this.f37302c.cubicTo(37.7986f, 17.3576f, 38.323f, 18.4012f, 37.7801f, 19.1385f);
        this.f37302c.lineTo(18.3398f, 45.5414f);
        this.f37302c.cubicTo(17.6368f, 46.4962f, 16.1317f, 45.8363f, 16.3517f, 44.6698f);
        this.f37302c.lineTo(19.3693f, 28.6654f);
        this.f37302c.cubicTo(19.499f, 27.9775f, 18.9735f, 27.3407f, 18.276f, 27.3407f);
        this.f37302c.lineTo(10.1137f, 27.3407f);
        this.f37302c.cubicTo(9.33244f, 27.3407f, 8.79443f, 26.5536f, 9.07558f, 25.8218f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
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
