package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.ka */
public class C15870ka extends AbstractC15287a {

    /* renamed from: d */
    Paint f38522d;

    /* renamed from: e */
    Path f38523e;

    static {
        Covode.recordClassIndex(18136);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(16.6276f, 20.2241f);
        this.f37302c.cubicTo(16.6276f, 30.8074f, 25.2394f, 39.4192f, 35.8227f, 39.4192f);
        this.f37302c.cubicTo(46.4059f, 39.4192f, 55.0178f, 30.8074f, 55.0178f, 20.2241f);
        this.f37302c.cubicTo(55.0178f, 9.64086f, 46.4059f, 1.02899f, 35.8227f, 1.02899f);
        this.f37302c.cubicTo(25.2394f, 1.02899f, 16.6276f, 9.64086f, 16.6276f, 20.2241f);
        this.f37302c.close();
        this.f37302c.moveTo(19.7405f, 20.2244f);
        this.f37302c.cubicTo(19.7405f, 11.3583f, 26.9568f, 4.14202f, 35.8229f, 4.14202f);
        this.f37302c.cubicTo(44.689f, 4.14202f, 51.9053f, 11.3583f, 51.9053f, 20.2244f);
        this.f37302c.cubicTo(51.9053f, 29.0905f, 44.689f, 36.3068f, 35.8229f, 36.3068f);
        this.f37302c.cubicTo(26.9568f, 36.3068f, 19.7405f, 29.0905f, 19.7405f, 20.2244f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38522d = new Paint();
        Path path = new Path();
        this.f38523e = path;
        path.moveTo(6.69813f, 70.9717f);
        this.f38523e.cubicTo(6.56844f, 70.9717f, 6.43874f, 70.9562f, 6.30904f, 70.9199f);
        this.f38523e.cubicTo(5.47898f, 70.7072f, 4.97576f, 69.8563f, 5.19365f, 69.0263f);
        this.f38523e.cubicTo(8.79922f, 55.045f, 21.3954f, 45.2762f, 35.8228f, 45.2762f);
        this.f38523e.cubicTo(50.2503f, 45.2762f, 62.8465f, 55.0398f, 66.4572f, 69.0211f);
        this.f38523e.cubicTo(66.6699f, 69.8512f, 66.1719f, 70.702f, 65.3366f, 70.9147f);
        this.f38523e.cubicTo(64.5014f, 71.1326f, 63.6558f, 70.6293f, 63.4379f, 69.7941f);
        this.f38523e.cubicTo(60.1851f, 57.1876f, 48.8288f, 48.3837f, 35.8176f, 48.3837f);
        this.f38523e.cubicTo(22.8117f, 48.3837f, 11.4554f, 57.1876f, 8.19743f, 69.7941f);
        this.f38523e.cubicTo(8.02104f, 70.5048f, 7.39331f, 70.9717f, 6.69813f, 70.9717f);
        this.f38523e.close();
        this.f38523e.setFillType(Path.FillType.WINDING);
        this.f38522d.setStyle(Paint.Style.FILL);
        this.f38522d.setColor(-16777216);
        this.f37300a.add(this.f38522d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 72.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38523e, this.f38522d);
    }
}
