package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gf */
public class C15767gf extends AbstractC15287a {

    /* renamed from: d */
    Paint f38337d;

    /* renamed from: e */
    Path f38338e;

    static {
        Covode.recordClassIndex(18033);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(24.0f, 48.0f);
        this.f37302c.cubicTo(37.2548f, 48.0f, 48.0f, 37.2548f, 48.0f, 24.0f);
        this.f37302c.cubicTo(48.0f, 10.7452f, 37.2548f, 0.0f, 24.0f, 0.0f);
        this.f37302c.cubicTo(10.7452f, 0.0f, 0.0f, 10.7452f, 0.0f, 24.0f);
        this.f37302c.cubicTo(0.0f, 37.2548f, 10.7452f, 48.0f, 24.0f, 48.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.EVEN_ODD);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-15998821);
        this.f38337d = new Paint();
        Path path = new Path();
        this.f38338e = path;
        path.moveTo(34.5409f, 29.7224f);
        this.f38338e.lineTo(34.5409f, 32.8963f);
        this.f38338e.cubicTo(34.5433f, 33.4921f, 34.294f, 34.0613f, 33.8541f, 34.4641f);
        this.f38338e.cubicTo(33.4142f, 34.8668f, 32.8245f, 35.0659f, 32.23f, 35.0122f);
        this.f38338e.cubicTo(28.968f, 34.6585f, 25.8346f, 33.5461f, 23.0816f, 31.7643f);
        this.f38338e.cubicTo(20.5203f, 30.14f, 18.3488f, 27.9727f, 16.7213f, 25.4165f);
        this.f38338e.cubicTo(14.9297f, 22.6565f, 13.8148f, 19.5141f, 13.4669f, 16.244f);
        this.f38338e.cubicTo(13.4133f, 15.6524f, 13.6113f, 15.0657f, 14.0125f, 14.627f);
        this.f38338e.cubicTo(14.4138f, 14.1883f, 14.9813f, 13.9382f, 15.5764f, 13.9376f);
        this.f38338e.lineTo(18.7566f, 13.9376f);
        this.f38338e.cubicTo(19.8207f, 13.9272f, 20.7278f, 14.7057f, 20.8767f, 15.7573f);
        this.f38338e.cubicTo(21.0109f, 16.773f, 21.2599f, 17.7703f, 21.6188f, 18.7302f);
        this.f38338e.cubicTo(21.91f, 19.5034f, 21.7237f, 20.3751f, 21.1417f, 20.9625f);
        this.f38338e.lineTo(19.7954f, 22.3061f);
        this.f38338e.cubicTo(21.3045f, 24.9548f, 23.5019f, 27.1478f, 26.1558f, 28.6539f);
        this.f38338e.lineTo(27.5021f, 27.3103f);
        this.f38338e.cubicTo(28.0906f, 26.7294f, 28.9641f, 26.5435f, 29.7388f, 26.8342f);
        this.f38338e.cubicTo(30.7006f, 27.1924f, 31.6999f, 27.4408f, 32.7176f, 27.5748f);
        this.f38338e.cubicTo(33.7836f, 27.7248f, 34.5676f, 28.6484f, 34.5409f, 29.7224f);
        this.f38338e.close();
        this.f38338e.setFillType(Path.FillType.EVEN_ODD);
        this.f38337d.setStyle(Paint.Style.FILL);
        this.f38337d.setColor(-1);
        this.f37300a.add(this.f38337d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38338e, this.f38337d);
    }
}
