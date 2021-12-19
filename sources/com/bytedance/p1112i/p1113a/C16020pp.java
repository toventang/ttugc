package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.pp */
public class C16020pp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38642d;

    /* renamed from: e */
    Path f38643e;

    static {
        Covode.recordClassIndex(18286);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(37.2929f, 41.1213f);
        this.f37302c.cubicTo(37.6834f, 41.5118f, 38.3166f, 41.5118f, 38.7071f, 41.1213f);
        this.f37302c.lineTo(40.1213f, 39.7071f);
        this.f37302c.cubicTo(40.5118f, 39.3166f, 40.5118f, 38.6834f, 40.1213f, 38.2929f);
        this.f37302c.lineTo(9.53553f, 7.70708f);
        this.f37302c.cubicTo(9.14501f, 7.31655f, 8.51184f, 7.31655f, 8.12132f, 7.70708f);
        this.f37302c.lineTo(6.70711f, 9.12129f);
        this.f37302c.cubicTo(6.45989f, 9.36851f, 6.36917f, 9.71297f, 6.43495f, 10.0315f);
        this.f37302c.cubicTo(3.93955f, 10.3122f, 2.0f, 12.4296f, 2.0f, 15.0f);
        this.f37302c.lineTo(2.0f, 33.0f);
        this.f37302c.cubicTo(2.0f, 35.7614f, 4.23858f, 38.0f, 7.0f, 38.0f);
        this.f37302c.lineTo(29.0f, 38.0f);
        this.f37302c.cubicTo(30.4243f, 38.0f, 31.7096f, 37.4044f, 32.6203f, 36.4487f);
        this.f37302c.lineTo(37.2929f, 41.1213f);
        this.f37302c.close();
        this.f37302c.moveTo(29.7877f, 33.6161f);
        this.f37302c.lineTo(10.1716f, 14.0f);
        this.f37302c.lineTo(7.0f, 14.0f);
        this.f37302c.cubicTo(6.44772f, 14.0f, 6.0f, 14.4477f, 6.0f, 15.0f);
        this.f37302c.lineTo(6.0f, 33.0f);
        this.f37302c.cubicTo(6.0f, 33.5523f, 6.44771f, 34.0f, 7.0f, 34.0f);
        this.f37302c.lineTo(29.0f, 34.0f);
        this.f37302c.cubicTo(29.3199f, 34.0f, 29.6047f, 33.8498f, 29.7877f, 33.6161f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38642d = new Paint();
        Path path = new Path();
        this.f38643e = path;
        path.moveTo(34.0f, 27.2763f);
        this.f38643e.lineTo(34.0f, 29.1718f);
        this.f38643e.lineTo(30.0f, 25.1718f);
        this.f38643e.lineTo(30.0f, 15.0f);
        this.f38643e.cubicTo(30.0f, 14.4477f, 29.5523f, 14.0f, 29.0f, 14.0f);
        this.f38643e.lineTo(18.8282f, 14.0f);
        this.f38643e.lineTo(14.8282f, 9.99997f);
        this.f38643e.lineTo(29.0f, 9.99997f);
        this.f38643e.cubicTo(31.7614f, 9.99997f, 34.0f, 12.2385f, 34.0f, 15.0f);
        this.f38643e.lineTo(34.0f, 20.7238f);
        this.f38643e.lineTo(42.2879f, 14.4091f);
        this.f38643e.cubicTo(42.8927f, 13.9484f, 43.7063f, 13.8703f, 44.3876f, 14.2078f);
        this.f38643e.cubicTo(45.0689f, 14.5452f, 45.5f, 15.2397f, 45.5f, 16.0f);
        this.f38643e.lineTo(45.5f, 32.0f);
        this.f38643e.cubicTo(45.5f, 32.7603f, 45.0689f, 33.4548f, 44.3876f, 33.7922f);
        this.f38643e.cubicTo(43.7064f, 34.1296f, 42.8927f, 34.0516f, 42.2879f, 33.5909f);
        this.f38643e.lineTo(34.0f, 27.2763f);
        this.f38643e.close();
        this.f38643e.moveTo(41.5f, 27.9618f);
        this.f38643e.lineTo(36.3001f, 24.0001f);
        this.f38643e.lineTo(41.5f, 20.0382f);
        this.f38643e.lineTo(41.5f, 27.9618f);
        this.f38643e.close();
        this.f38643e.setFillType(Path.FillType.EVEN_ODD);
        this.f38642d.setStyle(Paint.Style.FILL);
        this.f38642d.setColor(-16777216);
        this.f37300a.add(this.f38642d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38643e, this.f38642d);
    }
}
