package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ol */
public class C15989ol extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18255);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(23.0484f, 7.84003f);
        this.f37302c.cubicTo(23.6014f, 7.38666f, 24.3975f, 7.38666f, 24.9504f, 7.84001f);
        this.f37302c.lineTo(41.051f, 21.04f);
        this.f37302c.cubicTo(41.5411f, 21.4418f, 41.7258f, 22.1082f, 41.5125f, 22.705f);
        this.f37302c.cubicTo(41.2991f, 23.3017f, 40.7338f, 23.7f, 40.1f, 23.7f);
        this.f37302c.lineTo(37.769f, 23.7f);
        this.f37302c.lineTo(36.5769f, 36.7278f);
        this.f37302c.cubicTo(36.4592f, 38.0149f, 35.3798f, 39.0f, 34.0873f, 39.0f);
        this.f37302c.lineTo(13.9127f, 39.0f);
        this.f37302c.cubicTo(12.6202f, 39.0f, 11.5409f, 38.0149f, 11.4231f, 36.7278f);
        this.f37302c.lineTo(10.231f, 23.7f);
        this.f37302c.lineTo(7.89943f, 23.7f);
        this.f37302c.cubicTo(7.2657f, 23.7f, 6.70035f, 23.3017f, 6.487f, 22.705f);
        this.f37302c.cubicTo(6.27364f, 22.1083f, 6.45833f, 21.4418f, 6.9484f, 21.04f);
        this.f37302c.lineTo(23.0484f, 7.84003f);
        this.f37302c.close();
        this.f37302c.moveTo(23.9995f, 10.9397f);
        this.f37302c.lineTo(12.0948f, 20.7f);
        this.f37302c.lineTo(12.969f, 20.7f);
        this.f37302c.lineTo(14.369f, 36.0f);
        this.f37302c.lineTo(22.4994f, 36.0f);
        this.f37302c.lineTo(22.4994f, 28.3138f);
        this.f37302c.cubicTo(22.4994f, 27.7616f, 22.9471f, 27.3138f, 23.4994f, 27.3138f);
        this.f37302c.lineTo(24.4994f, 27.3138f);
        this.f37302c.cubicTo(25.0517f, 27.3138f, 25.4994f, 27.7616f, 25.4994f, 28.3138f);
        this.f37302c.lineTo(25.4994f, 36.0f);
        this.f37302c.lineTo(33.631f, 36.0f);
        this.f37302c.lineTo(35.031f, 20.7f);
        this.f37302c.lineTo(35.9045f, 20.7f);
        this.f37302c.lineTo(23.9995f, 10.9397f);
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
