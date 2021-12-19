package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.au */
public class C15620au extends AbstractC15287a {

    /* renamed from: d */
    Paint f38077d;

    /* renamed from: e */
    Path f38078e;

    static {
        Covode.recordClassIndex(17886);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.1464f, 19.2678f);
        this.f37302c.lineTo(25.8786f, 24.0f);
        this.f37302c.lineTo(21.1464f, 28.7322f);
        this.f37302c.cubicTo(20.7559f, 29.1227f, 20.7559f, 29.7559f, 21.1464f, 30.1464f);
        this.f37302c.lineTo(21.8535f, 30.8535f);
        this.f37302c.cubicTo(22.244f, 31.2441f, 22.8772f, 31.2441f, 23.2677f, 30.8535f);
        this.f37302c.lineTo(28.0f, 26.1213f);
        this.f37302c.lineTo(32.7322f, 30.8535f);
        this.f37302c.cubicTo(33.1227f, 31.2441f, 33.7559f, 31.2441f, 34.1464f, 30.8535f);
        this.f37302c.lineTo(34.8535f, 30.1464f);
        this.f37302c.cubicTo(35.244f, 29.7559f, 35.244f, 29.1228f, 34.8535f, 28.7322f);
        this.f37302c.lineTo(30.1213f, 24.0f);
        this.f37302c.lineTo(34.8535f, 19.2678f);
        this.f37302c.cubicTo(35.244f, 18.8772f, 35.244f, 18.2441f, 34.8535f, 17.8535f);
        this.f37302c.lineTo(34.1464f, 17.1464f);
        this.f37302c.cubicTo(33.7559f, 16.7559f, 33.1227f, 16.7559f, 32.7322f, 17.1464f);
        this.f37302c.lineTo(28.0f, 21.8787f);
        this.f37302c.lineTo(23.2677f, 17.1464f);
        this.f37302c.cubicTo(22.8772f, 16.7559f, 22.244f, 16.7559f, 21.8535f, 17.1464f);
        this.f37302c.lineTo(21.1464f, 17.8535f);
        this.f37302c.cubicTo(20.7559f, 18.2441f, 20.7559f, 18.8772f, 21.1464f, 19.2678f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38077d = new Paint();
        Path path = new Path();
        this.f38078e = path;
        path.moveTo(19.5818f, 7.5f);
        this.f38078e.cubicTo(18.1845f, 7.5f, 16.8395f, 8.03185f, 15.8201f, 8.98755f);
        this.f38078e.lineTo(3.30862f, 20.7171f);
        this.f38078e.cubicTo(1.41226f, 22.4949f, 1.41227f, 25.5051f, 3.30862f, 27.2829f);
        this.f38078e.lineTo(15.8201f, 39.0125f);
        this.f38078e.cubicTo(16.8395f, 39.9681f, 18.1845f, 40.5f, 19.5818f, 40.5f);
        this.f38078e.lineTo(39.0f, 40.5f);
        this.f38078e.cubicTo(42.0376f, 40.5f, 44.5f, 38.0376f, 44.5f, 35.0f);
        this.f38078e.lineTo(44.5f, 13.0f);
        this.f38078e.cubicTo(44.5f, 9.96243f, 42.0376f, 7.5f, 39.0f, 7.5f);
        this.f38078e.lineTo(19.5818f, 7.5f);
        this.f38078e.close();
        this.f38078e.moveTo(17.8719f, 11.1762f);
        this.f38078e.cubicTo(18.3353f, 10.7418f, 18.9466f, 10.5f, 19.5818f, 10.5f);
        this.f38078e.lineTo(39.0f, 10.5f);
        this.f38078e.cubicTo(40.3807f, 10.5f, 41.5f, 11.6193f, 41.5f, 13.0f);
        this.f38078e.lineTo(41.5f, 35.0f);
        this.f38078e.cubicTo(41.5f, 36.3807f, 40.3807f, 37.5f, 39.0f, 37.5f);
        this.f38078e.lineTo(19.5818f, 37.5f);
        this.f38078e.cubicTo(18.9466f, 37.5f, 18.3353f, 37.2582f, 17.8719f, 36.8238f);
        this.f38078e.lineTo(5.36044f, 25.0943f);
        this.f38078e.cubicTo(4.72832f, 24.5017f, 4.72832f, 23.4983f, 5.36044f, 22.9057f);
        this.f38078e.lineTo(17.8719f, 11.1762f);
        this.f38078e.close();
        this.f38078e.setFillType(Path.FillType.EVEN_ODD);
        this.f38077d.setStyle(Paint.Style.FILL);
        this.f38077d.setColor(-16777216);
        this.f37300a.add(this.f38077d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38078e, this.f38077d);
    }
}
