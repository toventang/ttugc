package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.bs */
public class C15645bs extends AbstractC15287a {
    static {
        Covode.recordClassIndex(17911);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(2.5f, 12.0f);
        this.f37302c.cubicTo(2.5f, 6.75329f, 6.75329f, 2.5f, 12.0f, 2.5f);
        this.f37302c.lineTo(36.0f, 2.5f);
        this.f37302c.cubicTo(41.2467f, 2.5f, 45.5f, 6.75329f, 45.5f, 12.0f);
        this.f37302c.lineTo(45.5f, 36.0f);
        this.f37302c.cubicTo(45.5f, 41.2467f, 41.2467f, 45.5f, 36.0f, 45.5f);
        this.f37302c.lineTo(12.0f, 45.5f);
        this.f37302c.cubicTo(6.75329f, 45.5f, 2.5f, 41.2467f, 2.5f, 36.0f);
        this.f37302c.lineTo(2.5f, 12.0f);
        this.f37302c.close();
        this.f37302c.moveTo(12.0f, 5.5f);
        this.f37302c.cubicTo(8.41015f, 5.5f, 5.5f, 8.41015f, 5.5f, 12.0f);
        this.f37302c.lineTo(5.5f, 36.0f);
        this.f37302c.cubicTo(5.5f, 39.5899f, 8.41015f, 42.5f, 12.0f, 42.5f);
        this.f37302c.lineTo(36.0f, 42.5f);
        this.f37302c.cubicTo(39.5899f, 42.5f, 42.5f, 39.5899f, 42.5f, 36.0f);
        this.f37302c.lineTo(42.5f, 12.0f);
        this.f37302c.cubicTo(42.5f, 8.41015f, 39.5899f, 5.5f, 36.0f, 5.5f);
        this.f37302c.lineTo(12.0f, 5.5f);
        this.f37302c.close();
        this.f37302c.moveTo(22.2f, 14.5f);
        this.f37302c.cubicTo(17.9474f, 14.5f, 14.5f, 17.9474f, 14.5f, 22.2f);
        this.f37302c.cubicTo(14.5f, 26.4526f, 17.9474f, 29.9f, 22.2f, 29.9f);
        this.f37302c.cubicTo(26.4526f, 29.9f, 29.9f, 26.4526f, 29.9f, 22.2f);
        this.f37302c.cubicTo(29.9f, 17.9474f, 26.4526f, 14.5f, 22.2f, 14.5f);
        this.f37302c.close();
        this.f37302c.moveTo(11.5f, 22.2f);
        this.f37302c.cubicTo(11.5f, 16.2906f, 16.2906f, 11.5f, 22.2f, 11.5f);
        this.f37302c.cubicTo(28.1094f, 11.5f, 32.9f, 16.2906f, 32.9f, 22.2f);
        this.f37302c.cubicTo(32.9f, 24.6138f, 32.1007f, 26.8409f, 30.7524f, 28.6311f);
        this.f37302c.lineTo(36.3536f, 34.2322f);
        this.f37302c.cubicTo(36.7441f, 34.6228f, 36.7441f, 35.2559f, 36.3536f, 35.6464f);
        this.f37302c.lineTo(35.6464f, 36.3536f);
        this.f37302c.cubicTo(35.2559f, 36.7441f, 34.6228f, 36.7441f, 34.2322f, 36.3536f);
        this.f37302c.lineTo(28.6311f, 30.7524f);
        this.f37302c.cubicTo(26.8409f, 32.1007f, 24.6138f, 32.9f, 22.2f, 32.9f);
        this.f37302c.cubicTo(16.2906f, 32.9f, 11.5f, 28.1094f, 11.5f, 22.2f);
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
