package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.mm */
public class C15936mm extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18202);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.0996f, 9.59961f);
        this.f37302c.cubicTo(21.8235f, 9.59961f, 21.5996f, 9.82347f, 21.5996f, 10.0996f);
        this.f37302c.lineTo(21.5996f, 21.5996f);
        this.f37302c.lineTo(10.0996f, 21.5996f);
        this.f37302c.cubicTo(9.82347f, 21.5996f, 9.59961f, 21.8235f, 9.59961f, 22.0996f);
        this.f37302c.lineTo(9.59961f, 25.8996f);
        this.f37302c.cubicTo(9.59961f, 26.1758f, 9.82347f, 26.3996f, 10.0996f, 26.3996f);
        this.f37302c.lineTo(21.5996f, 26.3996f);
        this.f37302c.lineTo(21.5996f, 37.8996f);
        this.f37302c.cubicTo(21.5996f, 38.1758f, 21.8235f, 38.3996f, 22.0996f, 38.3996f);
        this.f37302c.lineTo(25.8996f, 38.3996f);
        this.f37302c.cubicTo(26.1758f, 38.3996f, 26.3996f, 38.1758f, 26.3996f, 37.8996f);
        this.f37302c.lineTo(26.3996f, 26.3996f);
        this.f37302c.lineTo(37.8996f, 26.3996f);
        this.f37302c.cubicTo(38.1758f, 26.3996f, 38.3996f, 26.1758f, 38.3996f, 25.8996f);
        this.f37302c.lineTo(38.3996f, 22.0996f);
        this.f37302c.cubicTo(38.3996f, 21.8235f, 38.1758f, 21.5996f, 37.8996f, 21.5996f);
        this.f37302c.lineTo(26.3996f, 21.5996f);
        this.f37302c.lineTo(26.3996f, 10.0996f);
        this.f37302c.cubicTo(26.3996f, 9.82347f, 26.1758f, 9.59961f, 25.8996f, 9.59961f);
        this.f37302c.lineTo(22.0996f, 9.59961f);
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
