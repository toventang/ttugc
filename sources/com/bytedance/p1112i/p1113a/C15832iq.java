package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.iq */
public class C15832iq extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18098);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 9.01703f);
        this.f37302c.cubicTo(28.9975f, 3.74266f, 36.5326f, 3.736f, 41.327f, 8.56049f);
        this.f37302c.cubicTo(46.2243f, 13.4886f, 46.2243f, 21.4735f, 41.327f, 26.4016f);
        this.f37302c.lineTo(25.4186f, 42.4098f);
        this.f37302c.cubicTo(25.0432f, 42.7876f, 24.5326f, 43.0f, 24.0f, 43.0f);
        this.f37302c.cubicTo(23.4674f, 43.0f, 22.9568f, 42.7876f, 22.5814f, 42.4098f);
        this.f37302c.lineTo(6.67302f, 26.4016f);
        this.f37302c.cubicTo(1.77566f, 21.4735f, 1.77566f, 13.4886f, 6.67302f, 8.56049f);
        this.f37302c.cubicTo(11.4674f, 3.736f, 19.0025f, 3.74266f, 24.0f, 9.01703f);
        this.f37302c.close();
        this.f37302c.moveTo(38.4897f, 11.3801f);
        this.f37302c.cubicTo(35.2175f, 8.08727f, 30.0151f, 8.07195f, 26.5062f, 12.2118f);
        this.f37302c.lineTo(26.455f, 12.2722f);
        this.f37302c.lineTo(24.0f, 14.7426f);
        this.f37302c.lineTo(21.545f, 12.2722f);
        this.f37302c.lineTo(21.4938f, 12.2118f);
        this.f37302c.cubicTo(17.9849f, 8.07195f, 12.7825f, 8.08727f, 9.51028f, 11.3801f);
        this.f37302c.cubicTo(6.16324f, 14.7481f, 6.16324f, 20.214f, 9.51028f, 23.582f);
        this.f37302c.lineTo(24.0f, 38.1627f);
        this.f37302c.lineTo(38.4897f, 23.582f);
        this.f37302c.cubicTo(41.8368f, 20.214f, 41.8368f, 14.7481f, 38.4897f, 11.3801f);
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
