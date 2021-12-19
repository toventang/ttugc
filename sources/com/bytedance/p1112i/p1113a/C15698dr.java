package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.dr */
public class C15698dr extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17964);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(9.0f, 10.7647f);
        this.f37302c.cubicTo(9.0f, 9.79009f, 9.79009f, 9.0f, 10.7647f, 9.0f);
        this.f37302c.lineTo(31.9412f, 9.0f);
        this.f37302c.cubicTo(32.4285f, 9.0f, 32.8235f, 9.39504f, 32.8235f, 9.88235f);
        this.f37302c.lineTo(32.8235f, 11.6471f);
        this.f37302c.cubicTo(32.8235f, 12.1344f, 32.4285f, 12.5294f, 31.9412f, 12.5294f);
        this.f37302c.lineTo(15.0251f, 12.5294f);
        this.f37302c.lineTo(38.7416f, 36.2459f);
        this.f37302c.cubicTo(39.0861f, 36.5905f, 39.0861f, 37.1492f, 38.7416f, 37.4937f);
        this.f37302c.lineTo(37.4937f, 38.7416f);
        this.f37302c.cubicTo(37.1492f, 39.0861f, 36.5905f, 39.0861f, 36.2459f, 38.7416f);
        this.f37302c.lineTo(12.5294f, 15.0251f);
        this.f37302c.lineTo(12.5294f, 31.9412f);
        this.f37302c.cubicTo(12.5294f, 32.4285f, 12.1344f, 32.8235f, 11.6471f, 32.8235f);
        this.f37302c.lineTo(9.88235f, 32.8235f);
        this.f37302c.cubicTo(9.39504f, 32.8235f, 9.0f, 32.4285f, 9.0f, 31.9412f);
        this.f37302c.lineTo(9.0f, 10.7647f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-15329245);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
    }
}
