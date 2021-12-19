package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.lv */
public class C15918lv extends AbstractC15287a {
    static {
        Covode.recordClassIndex(18184);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(18.5006f, 22.4703f);
        this.f37302c.cubicTo(23.0766f, 22.4703f, 26.7863f, 18.7833f, 26.7863f, 14.2352f);
        this.f37302c.cubicTo(26.7863f, 9.68701f, 23.0766f, 6.0f, 18.5006f, 6.0f);
        this.f37302c.cubicTo(13.9245f, 6.0f, 10.2148f, 9.68701f, 10.2148f, 14.2352f);
        this.f37302c.cubicTo(10.2148f, 18.7833f, 13.9245f, 22.4703f, 18.5006f, 22.4703f);
        this.f37302c.close();
        this.f37302c.moveTo(21.0f, 31.0f);
        this.f37302c.cubicTo(21.0f, 32.8524f, 21.7625f, 37.7549f, 24.9355f, 40.9992f);
        this.f37302c.lineTo(6.12908f, 40.9992f);
        this.f37302c.cubicTo(6.10992f, 40.9997f, 6.09071f, 41.0f, 6.07143f, 41.0f);
        this.f37302c.cubicTo(4.92741f, 41.0f, 4.0f, 40.0775f, 4.0f, 38.9405f);
        this.f37302c.cubicTo(4.0f, 30.9812f, 10.4919f, 24.529f, 18.5f, 24.529f);
        this.f37302c.cubicTo(19.8623f, 24.529f, 21.1808f, 24.7157f, 22.4309f, 25.0648f);
        this.f37302c.cubicTo(21.5162f, 26.8441f, 21.0f, 28.8618f, 21.0f, 31.0f);
        this.f37302c.close();
        this.f37302c.moveTo(45.6081f, 26.6394f);
        this.f37302c.lineTo(41.5886f, 20.5268f);
        this.f37302c.cubicTo(41.2312f, 19.9833f, 40.5068f, 19.8364f, 39.9707f, 20.1988f);
        this.f37302c.lineTo(38.0293f, 21.511f);
        this.f37302c.cubicTo(37.4932f, 21.8733f, 37.3483f, 22.6077f, 37.7057f, 23.1512f);
        this.f37302c.lineTo(39.3068f, 25.586f);
        this.f37302c.lineTo(26.1667f, 25.586f);
        this.f37302c.cubicTo(25.5223f, 25.586f, 25.0f, 26.1156f, 25.0f, 26.7688f);
        this.f37302c.lineTo(25.0f, 29.1344f);
        this.f37302c.cubicTo(25.0f, 29.7877f, 25.5223f, 30.3172f, 26.1667f, 30.3172f);
        this.f37302c.lineTo(43.6667f, 30.3172f);
        this.f37302c.cubicTo(44.5272f, 30.3172f, 45.3179f, 29.837f, 45.7239f, 29.0678f);
        this.f37302c.cubicTo(46.1299f, 28.2987f, 46.0854f, 27.3653f, 45.6081f, 26.6394f);
        this.f37302c.close();
        this.f37302c.moveTo(27.3333f, 32.6828f);
        this.f37302c.cubicTo(26.4728f, 32.6828f, 25.6821f, 33.163f, 25.2761f, 33.9322f);
        this.f37302c.cubicTo(24.8701f, 34.7013f, 24.9146f, 35.6347f, 25.3919f, 36.3606f);
        this.f37302c.lineTo(29.4114f, 42.4732f);
        this.f37302c.cubicTo(29.7688f, 43.0167f, 30.4932f, 43.1636f, 31.0293f, 42.8012f);
        this.f37302c.lineTo(32.9707f, 41.489f);
        this.f37302c.cubicTo(33.5068f, 41.1267f, 33.6517f, 40.3923f, 33.2943f, 39.8488f);
        this.f37302c.lineTo(31.6932f, 37.414f);
        this.f37302c.lineTo(44.8333f, 37.414f);
        this.f37302c.cubicTo(45.4777f, 37.414f, 46.0f, 36.8844f, 46.0f, 36.2312f);
        this.f37302c.lineTo(46.0f, 33.8656f);
        this.f37302c.cubicTo(46.0f, 33.2123f, 45.4777f, 32.6828f, 44.8333f, 32.6828f);
        this.f37302c.lineTo(27.3333f, 32.6828f);
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
