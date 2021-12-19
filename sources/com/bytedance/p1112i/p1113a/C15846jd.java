package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.jd */
public class C15846jd extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18112);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(37.1216f, 51.378f);
        this.f37302c.lineTo(36.2057f, 50.7025f);
        this.f37302c.lineTo(35.2899f, 51.378f);
        this.f37302c.lineTo(11.0281f, 69.2741f);
        this.f37302c.cubicTo(10.6776f, 69.5326f, 10.1839f, 69.458f, 9.9254f, 69.1075f);
        this.f37302c.lineTo(8.68679f, 70.0212f);
        this.f37302c.lineTo(9.9254f, 69.1075f);
        this.f37302c.cubicTo(9.82539f, 68.972f, 9.77143f, 68.8079f, 9.77143f, 68.6394f);
        this.f37302c.lineTo(9.77143f, 7.67403f);
        this.f37302c.cubicTo(9.77143f, 6.0322f, 10.2845f, 4.77917f, 11.0869f, 3.94616f);
        this.f37302c.cubicTo(11.8821f, 3.12073f, 13.0924f, 2.57102f, 14.7616f, 2.57102f);
        this.f37302c.lineTo(57.6499f, 2.57102f);
        this.f37302c.cubicTo(59.3191f, 2.57102f, 60.5293f, 3.12073f, 61.3245f, 3.94616f);
        this.f37302c.cubicTo(62.127f, 4.77917f, 62.64f, 6.0322f, 62.64f, 7.67403f);
        this.f37302c.lineTo(62.64f, 68.6394f);
        this.f37302c.cubicTo(62.64f, 69.075f, 62.2869f, 69.428f, 61.8514f, 69.428f);
        this.f37302c.cubicTo(61.683f, 69.428f, 61.5189f, 69.3741f, 61.3833f, 69.2741f);
        this.f37302c.lineTo(37.1216f, 51.378f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.STROKE);
        this.f37301b.setStrokeWidth(3.08571f);
        this.f37301b.setColor(-16777216);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 72.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
