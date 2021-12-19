package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.z */
public class C16040z extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18306);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(36.2768f, 8.24133f);
        this.f37302c.cubicTo(36.8985f, 8.10917f, 37.4842f, 8.58311f, 37.4847f, 9.21879f);
        this.f37302c.lineTo(37.4983f, 29.0099f);
        this.f37302c.cubicTo(36.3736f, 28.5479f, 34.884f, 28.4261f, 33.3297f, 28.7565f);
        this.f37302c.cubicTo(30.3585f, 29.388f, 28.2757f, 31.4328f, 28.6776f, 33.3235f);
        this.f37302c.cubicTo(29.0795f, 35.2143f, 31.8139f, 36.2351f, 34.7851f, 35.6035f);
        this.f37302c.cubicTo(37.7563f, 34.972f, 39.5f, 33.0f, 39.5f, 31.0f);
        this.f37302c.lineTo(39.4847f, 9.21741f);
        this.f37302c.cubicTo(39.4834f, 7.31035f, 37.7263f, 5.88853f, 35.8609f, 6.28504f);
        this.f37302c.lineTo(19.0244f, 9.86382f);
        this.f37302c.cubicTo(17.639f, 10.1583f, 16.6484f, 11.3815f, 16.6481f, 12.7978f);
        this.f37302c.lineTo(16.645f, 33.3873f);
        this.f37302c.cubicTo(15.522f, 32.93f, 14.0383f, 32.8105f, 12.4903f, 33.1396f);
        this.f37302c.cubicTo(9.51914f, 33.7711f, 7.43631f, 35.8158f, 7.83821f, 37.7066f);
        this.f37302c.cubicTo(8.2401f, 39.5973f, 10.9745f, 40.6181f, 13.9457f, 39.9866f);
        this.f37302c.cubicTo(16.7521f, 39.3901f, 18.6447f, 37.5f, 18.6447f, 35.7353f);
        this.f37302c.lineTo(18.6481f, 12.7981f);
        this.f37302c.cubicTo(18.6482f, 12.326f, 18.9784f, 11.9183f, 19.4402f, 11.8201f);
        this.f37302c.lineTo(36.2768f, 8.24133f);
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
