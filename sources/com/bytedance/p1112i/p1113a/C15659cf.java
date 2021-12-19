package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.cf */
public class C15659cf extends AbstractC15287a {

    /* renamed from: d */
    Paint f38117d;

    /* renamed from: e */
    Path f38118e;

    static {
        Covode.recordClassIndex(17925);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(36.8965f, 40.6646f);
        this.f37302c.cubicTo(37.287f, 41.0552f, 37.9202f, 41.0552f, 38.3107f, 40.6646f);
        this.f37302c.lineTo(39.0178f, 39.9575f);
        this.f37302c.cubicTo(39.4083f, 39.567f, 39.4083f, 38.9338f, 39.0178f, 38.5433f);
        this.f37302c.lineTo(8.432f, 7.95753f);
        this.f37302c.cubicTo(8.04148f, 7.56701f, 7.40831f, 7.56701f, 7.01779f, 7.95754f);
        this.f37302c.lineTo(6.31068f, 8.66464f);
        this.f37302c.cubicTo(5.92016f, 9.05517f, 5.92016f, 9.68833f, 6.31068f, 10.0789f);
        this.f37302c.lineTo(6.87423f, 10.6424f);
        this.f37302c.cubicTo(4.93374f, 11.1422f, 3.5f, 12.9039f, 3.5f, 15.0004f);
        this.f37302c.lineTo(3.5f, 33.0004f);
        this.f37302c.cubicTo(3.5f, 35.4857f, 5.51472f, 37.5004f, 8.0f, 37.5004f);
        this.f37302c.lineTo(30.0f, 37.5004f);
        this.f37302c.cubicTo(31.047f, 37.5004f, 32.0105f, 37.1429f, 32.775f, 36.5432f);
        this.f37302c.lineTo(36.8965f, 40.6646f);
        this.f37302c.close();
        this.f37302c.moveTo(30.6052f, 34.3733f);
        this.f37302c.lineTo(9.73226f, 13.5004f);
        this.f37302c.lineTo(8.0f, 13.5004f);
        this.f37302c.cubicTo(7.17157f, 13.5004f, 6.5f, 14.172f, 6.5f, 15.0004f);
        this.f37302c.lineTo(6.5f, 33.0004f);
        this.f37302c.cubicTo(6.5f, 33.8289f, 7.17157f, 34.5004f, 8.0f, 34.5004f);
        this.f37302c.lineTo(30.0f, 34.5004f);
        this.f37302c.cubicTo(30.2153f, 34.5004f, 30.4201f, 34.4551f, 30.6052f, 34.3733f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38117d = new Paint();
        Path path = new Path();
        this.f38118e = path;
        path.moveTo(34.5f, 26.9462f);
        this.f38118e.lineTo(34.5f, 31.0255f);
        this.f38118e.lineTo(31.5f, 28.0255f);
        this.f38118e.lineTo(31.5f, 15.0004f);
        this.f38118e.cubicTo(31.5f, 14.172f, 30.8284f, 13.5004f, 30.0f, 13.5004f);
        this.f38118e.lineTo(16.9749f, 13.5004f);
        this.f38118e.lineTo(13.9749f, 10.5004f);
        this.f38118e.lineTo(30.0f, 10.5004f);
        this.f38118e.cubicTo(32.4853f, 10.5004f, 34.5f, 12.5151f, 34.5f, 15.0004f);
        this.f38118e.lineTo(34.5f, 21.0548f);
        this.f38118e.lineTo(43.1177f, 14.7873f);
        this.f38118e.cubicTo(43.574f, 14.4555f, 44.1779f, 14.4077f, 44.6807f, 14.6638f);
        this.f38118e.cubicTo(45.1834f, 14.9198f, 45.5f, 15.4362f, 45.5f, 16.0004f);
        this.f38118e.lineTo(45.5f, 32.0004f);
        this.f38118e.cubicTo(45.5f, 32.5646f, 45.1834f, 33.0811f, 44.6807f, 33.3371f);
        this.f38118e.cubicTo(44.1779f, 33.5931f, 43.574f, 33.5454f, 43.1177f, 33.2135f);
        this.f38118e.lineTo(34.5f, 26.9462f);
        this.f38118e.close();
        this.f38118e.moveTo(42.5f, 29.0548f);
        this.f38118e.lineTo(35.5503f, 24.0005f);
        this.f38118e.lineTo(42.5f, 18.9461f);
        this.f38118e.lineTo(42.5f, 29.0548f);
        this.f38118e.close();
        this.f38118e.setFillType(Path.FillType.EVEN_ODD);
        this.f38117d.setStyle(Paint.Style.FILL);
        this.f38117d.setColor(-16777216);
        this.f37300a.add(this.f38117d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38118e, this.f38117d);
    }
}
