package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fy */
public class C15759fy extends AbstractC15287a {

    /* renamed from: d */
    Paint f38299d;

    /* renamed from: e */
    Path f38300e;

    /* renamed from: f */
    Paint f38301f;

    /* renamed from: g */
    Path f38302g;

    /* renamed from: h */
    Paint f38303h;

    /* renamed from: i */
    Path f38304i;

    static {
        Covode.recordClassIndex(18025);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(43.0f, 24.4313f);
        this.f37302c.cubicTo(43.0f, 23.084f, 42.8767f, 21.7885f, 42.6475f, 20.5449f);
        this.f37302c.lineTo(24.3877f, 20.5449f);
        this.f37302c.lineTo(24.3877f, 27.8945f);
        this.f37302c.lineTo(34.8219f, 27.8945f);
        this.f37302c.cubicTo(34.3724f, 30.2695f, 33.0065f, 32.2818f, 30.9532f, 33.6291f);
        this.f37302c.lineTo(30.9532f, 38.3964f);
        this.f37302c.lineTo(37.2189f, 38.3964f);
        this.f37302c.cubicTo(40.885f, 35.0886f, 43.0f, 30.2177f, 43.0f, 24.4313f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-12417548);
        this.f38299d = new Paint();
        Path path = new Path();
        this.f38300e = path;
        path.moveTo(24.3872f, 43.001f);
        this.f38300e.cubicTo(29.6219f, 43.001f, 34.0107f, 41.2996f, 37.2184f, 38.3978f);
        this.f38300e.lineTo(30.9527f, 33.6305f);
        this.f38300e.cubicTo(29.2165f, 34.7705f, 26.9958f, 35.4441f, 24.3872f, 35.4441f);
        this.f38300e.cubicTo(19.3375f, 35.4441f, 15.0633f, 32.1018f, 13.5388f, 27.6108f);
        this.f38300e.lineTo(7.06152f, 27.6108f);
        this.f38300e.lineTo(7.06152f, 32.5337f);
        this.f38300e.cubicTo(10.2517f, 38.7433f, 16.8082f, 43.001f, 24.3872f, 43.001f);
        this.f38300e.close();
        this.f38300e.setFillType(Path.FillType.EVEN_ODD);
        this.f38299d.setStyle(Paint.Style.FILL);
        this.f38299d.setColor(-13326253);
        this.f37300a.add(this.f38299d);
        this.f38301f = new Paint();
        Path path2 = new Path();
        this.f38302g = path2;
        path2.moveTo(13.5395f, 27.6094f);
        this.f38302g.cubicTo(13.1516f, 26.4695f, 12.9313f, 25.2517f, 12.9313f, 23.9994f);
        this.f38302g.cubicTo(12.9313f, 22.7472f, 13.1516f, 21.5295f, 13.5395f, 20.3894f);
        this.f38302g.lineTo(13.5395f, 15.4668f);
        this.f38302g.lineTo(7.06217f, 15.4668f);
        this.f38302g.cubicTo(5.74911f, 18.0318f, 5.0f, 20.9336f, 5.0f, 23.9994f);
        this.f38302g.cubicTo(5.0f, 27.0654f, 5.74911f, 29.9673f, 7.06217f, 32.5323f);
        this.f38302g.lineTo(13.5395f, 27.6094f);
        this.f38302g.close();
        this.f38302g.setFillType(Path.FillType.EVEN_ODD);
        this.f38301f.setStyle(Paint.Style.FILL);
        this.f38301f.setColor(-279548);
        this.f37300a.add(this.f38301f);
        this.f38303h = new Paint();
        Path path3 = new Path();
        this.f38304i = path3;
        path3.moveTo(24.3872f, 12.5568f);
        this.f38304i.cubicTo(27.2336f, 12.5568f, 29.7894f, 13.5155f, 31.7987f, 15.3982f);
        this.f38304i.lineTo(37.3595f, 9.94866f);
        this.f38304i.cubicTo(34.0018f, 6.88281f, 29.6131f, 5.0f, 24.3872f, 5.0f);
        this.f38304i.cubicTo(16.8082f, 5.0f, 10.2517f, 9.25777f, 7.06152f, 15.4674f);
        this.f38304i.lineTo(13.5388f, 20.39f);
        this.f38304i.cubicTo(15.0633f, 15.8991f, 19.3375f, 12.5568f, 24.3872f, 12.5568f);
        this.f38304i.close();
        this.f38304i.setFillType(Path.FillType.EVEN_ODD);
        this.f38303h.setStyle(Paint.Style.FILL);
        this.f38303h.setColor(-1424587);
        this.f37300a.add(this.f38303h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38300e, this.f38299d);
        canvas.drawPath(this.f38302g, this.f38301f);
        canvas.drawPath(this.f38304i, this.f38303h);
    }
}
