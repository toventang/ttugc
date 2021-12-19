package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.jl */
public class C15854jl extends AbstractC15287a {

    /* renamed from: d */
    Paint f38453d;

    /* renamed from: e */
    Path f38454e;

    /* renamed from: f */
    Matrix f38455f;

    /* renamed from: g */
    Paint f38456g;

    /* renamed from: h */
    Path f38457h;

    /* renamed from: i */
    Paint f38458i;

    /* renamed from: j */
    Path f38459j;

    /* renamed from: k */
    Paint f38460k;

    /* renamed from: l */
    Path f38461l;

    static {
        Covode.recordClassIndex(18120);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f38453d = new Paint();
        Path path = new Path();
        this.f38454e = path;
        path.addRect(0.0f, 0.0f, 72.0f, 72.0f, Path.Direction.CW);
        Matrix matrix = new Matrix();
        this.f38455f = matrix;
        matrix.preTranslate(0.0f, 0.942383f);
        this.f38454e.transform(this.f38455f);
        this.f37302c.moveTo(16.6276f, 21.1668f);
        this.f37302c.cubicTo(16.6276f, 31.7501f, 25.2394f, 40.3619f, 35.8227f, 40.3619f);
        this.f37302c.cubicTo(46.4059f, 40.3619f, 55.0178f, 31.7501f, 55.0178f, 21.1668f);
        this.f37302c.cubicTo(55.0178f, 10.5835f, 46.4059f, 1.97168f, 35.8227f, 1.97168f);
        this.f37302c.cubicTo(25.2394f, 1.97168f, 16.6276f, 10.5835f, 16.6276f, 21.1668f);
        this.f37302c.close();
        this.f37302c.moveTo(19.7405f, 21.1671f);
        this.f37302c.cubicTo(19.7405f, 12.301f, 26.9568f, 5.08471f, 35.8229f, 5.08471f);
        this.f37302c.cubicTo(44.689f, 5.08471f, 51.9053f, 12.301f, 51.9053f, 21.1671f);
        this.f37302c.cubicTo(51.9053f, 30.0332f, 44.689f, 37.2495f, 35.8229f, 37.2495f);
        this.f37302c.cubicTo(26.9568f, 37.2495f, 19.7405f, 30.0332f, 19.7405f, 21.1671f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38456g = new Paint();
        Path path2 = new Path();
        this.f38457h = path2;
        path2.addCircle(56.0f, 59.9424f, 11.5f, Path.Direction.CW);
        this.f38456g.setStyle(Paint.Style.STROKE);
        this.f38456g.setStrokeWidth(3.0f);
        this.f38456g.setColor(-16777216);
        this.f37300a.add(this.f38456g);
        this.f38458i = new Paint();
        Path path3 = new Path();
        this.f38459j = path3;
        path3.moveTo(45.6153f, 47.77f);
        this.f38459j.cubicTo(42.5149f, 46.76f, 39.2196f, 46.2188f, 35.8228f, 46.2188f);
        this.f38459j.cubicTo(21.3954f, 46.2188f, 8.79922f, 55.9875f, 5.19365f, 69.9688f);
        this.f38459j.cubicTo(4.97576f, 70.7989f, 5.47898f, 71.6497f, 6.30904f, 71.8624f);
        this.f38459j.cubicTo(6.43874f, 71.8987f, 6.56844f, 71.9143f, 6.69813f, 71.9143f);
        this.f38459j.cubicTo(7.39331f, 71.9143f, 8.02104f, 71.4474f, 8.19743f, 70.7366f);
        this.f38459j.cubicTo(11.4554f, 58.1301f, 22.8117f, 49.3263f, 35.8176f, 49.3263f);
        this.f38459j.cubicTo(38.3677f, 49.3263f, 40.8541f, 49.6644f, 43.2284f, 50.3031f);
        this.f38459j.cubicTo(43.9303f, 49.3746f, 44.7312f, 48.525f, 45.6153f, 47.77f);
        this.f38459j.close();
        this.f38459j.setFillType(Path.FillType.EVEN_ODD);
        this.f38458i.setStyle(Paint.Style.FILL);
        this.f38458i.setColor(-16777216);
        this.f37300a.add(this.f38458i);
        this.f38460k = new Paint();
        Path path4 = new Path();
        this.f38461l = path4;
        path4.moveTo(53.5327f, 65.4043f);
        this.f38461l.cubicTo(53.728f, 65.5995f, 54.0446f, 65.5995f, 54.2398f, 65.4043f);
        this.f38461l.lineTo(55.6541f, 63.99f);
        this.f38461l.lineTo(63.004f, 56.6401f);
        this.f38461l.cubicTo(63.1992f, 56.4449f, 63.1992f, 56.1283f, 63.004f, 55.933f);
        this.f38461l.lineTo(61.5897f, 54.5188f);
        this.f38461l.cubicTo(61.3945f, 54.3236f, 61.0779f, 54.3236f, 60.8826f, 54.5188f);
        this.f38461l.lineTo(53.8863f, 61.5152f);
        this.f38461l.lineTo(50.7047f, 58.3336f);
        this.f38461l.cubicTo(50.5094f, 58.1383f, 50.1928f, 58.1383f, 49.9976f, 58.3336f);
        this.f38461l.lineTo(48.5834f, 59.7478f);
        this.f38461l.cubicTo(48.3881f, 59.943f, 48.3881f, 60.2596f, 48.5834f, 60.4549f);
        this.f38461l.lineTo(52.1185f, 63.99f);
        this.f38461l.lineTo(53.5327f, 65.4043f);
        this.f38461l.close();
        this.f38461l.setFillType(Path.FillType.EVEN_ODD);
        this.f38460k.setStyle(Paint.Style.FILL);
        this.f38460k.setColor(-16777216);
        this.f37300a.add(this.f38460k);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24797a(canvas, 72.0f, 73.0f);
        canvas.clipPath(this.f38454e);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38457h, this.f38456g);
        canvas.drawPath(this.f38459j, this.f38458i);
        canvas.drawPath(this.f38461l, this.f38460k);
    }
}
