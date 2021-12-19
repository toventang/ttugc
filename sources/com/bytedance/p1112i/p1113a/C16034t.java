package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.t */
public class C16034t extends AbstractC15287a {

    /* renamed from: d */
    Paint f38646d;

    /* renamed from: e */
    Path f38647e;

    static {
        Covode.recordClassIndex(18300);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(12.6865f, 23.2929f);
        this.f37302c.cubicTo(12.4912f, 23.0976f, 12.1746f, 23.0976f, 11.9794f, 23.2929f);
        this.f37302c.lineTo(9.85806f, 25.4142f);
        this.f37302c.cubicTo(5.95282f, 29.3195f, 5.24571f, 34.944f, 9.15095f, 38.8493f);
        this.f37302c.cubicTo(13.0562f, 42.7545f, 18.6807f, 42.0474f, 22.586f, 38.1421f);
        this.f37302c.lineTo(27.5357f, 33.1924f);
        this.f37302c.cubicTo(31.3218f, 29.4064f, 32.1019f, 24.0044f, 28.5876f, 20.1197f);
        this.f37302c.cubicTo(28.4023f, 19.9149f, 28.0845f, 19.9157f, 27.8893f, 20.1109f);
        this.f37302c.lineTo(27.1822f, 20.818f);
        this.f37302c.cubicTo(26.9869f, 21.0133f, 26.989f, 21.3294f, 27.1715f, 21.5366f);
        this.f37302c.cubicTo(29.895f, 24.6285f, 29.1258f, 28.7739f, 26.1215f, 31.7782f);
        this.f37302c.lineTo(21.1718f, 36.7279f);
        this.f37302c.cubicTo(18.0476f, 39.8521f, 13.6894f, 40.5592f, 10.5652f, 37.435f);
        this.f37302c.cubicTo(7.44097f, 34.3108f, 8.14808f, 29.9526f, 11.2723f, 26.8284f);
        this.f37302c.lineTo(13.3936f, 24.7071f);
        this.f37302c.cubicTo(13.5889f, 24.5119f, 13.5889f, 24.1953f, 13.3936f, 24.0f);
        this.f37302c.lineTo(12.6865f, 23.2929f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38646d = new Paint();
        Path path = new Path();
        this.f38647e = path;
        path.moveTo(35.3139f, 24.7071f);
        this.f38647e.cubicTo(35.5092f, 24.9024f, 35.8257f, 24.9024f, 36.021f, 24.7071f);
        this.f38647e.lineTo(38.1423f, 22.5858f);
        this.f38647e.cubicTo(42.0476f, 18.6806f, 42.7547f, 13.056f, 38.8494f, 9.15077f);
        this.f38647e.cubicTo(34.9442f, 5.24553f, 29.3197f, 5.95263f, 25.4144f, 9.85788f);
        this.f38647e.lineTo(20.4647f, 14.8076f);
        this.f38647e.cubicTo(16.6786f, 18.5937f, 15.8985f, 23.9956f, 19.4128f, 27.8803f);
        this.f38647e.cubicTo(19.5981f, 28.0851f, 19.9159f, 28.0844f, 20.1111f, 27.8891f);
        this.f38647e.lineTo(20.8182f, 27.182f);
        this.f38647e.cubicTo(21.0135f, 26.9867f, 21.0114f, 26.6706f, 20.8289f, 26.4634f);
        this.f38647e.cubicTo(18.1054f, 23.3715f, 18.8746f, 19.2261f, 21.8789f, 16.2218f);
        this.f38647e.lineTo(26.8286f, 11.2721f);
        this.f38647e.cubicTo(29.9528f, 8.1479f, 34.311f, 7.44079f, 37.4352f, 10.565f);
        this.f38647e.cubicTo(40.5594f, 13.6892f, 39.8523f, 18.0474f, 36.7281f, 21.1716f);
        this.f38647e.lineTo(34.6068f, 23.2929f);
        this.f38647e.cubicTo(34.4115f, 23.4882f, 34.4115f, 23.8047f, 34.6068f, 24.0f);
        this.f38647e.lineTo(35.3139f, 24.7071f);
        this.f38647e.close();
        this.f38647e.setFillType(Path.FillType.WINDING);
        this.f38646d.setStyle(Paint.Style.FILL);
        this.f38646d.setColor(-16777216);
        this.f37300a.add(this.f38646d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38647e, this.f38646d);
    }
}
