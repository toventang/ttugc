package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.oq */
public class C15994oq extends AbstractC15287a {

    /* renamed from: d */
    Paint f38628d;

    /* renamed from: e */
    Path f38629e;

    static {
        Covode.recordClassIndex(18260);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(22.6566f, 23.1538f);
        this.f37302c.cubicTo(23.2793f, 23.5461f, 23.2793f, 24.4539f, 22.6566f, 24.8462f);
        this.f37302c.lineTo(17.2829f, 28.2307f);
        this.f37302c.cubicTo(16.617f, 28.6501f, 15.75f, 28.1715f, 15.75f, 27.3845f);
        this.f37302c.lineTo(15.75f, 20.6155f);
        this.f37302c.cubicTo(15.75f, 19.8285f, 16.617f, 19.3499f, 17.2829f, 19.7693f);
        this.f37302c.lineTo(22.6566f, 23.1538f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-1);
        this.f38628d = new Paint();
        Path path = new Path();
        this.f38629e = path;
        path.moveTo(11.6782f, 12.5f);
        this.f38629e.cubicTo(8.86029f, 12.5f, 6.5f, 14.7292f, 6.5f, 17.5714f);
        this.f38629e.lineTo(6.5f, 30.4286f);
        this.f38629e.cubicTo(6.5f, 33.2708f, 8.86029f, 35.5f, 11.6782f, 35.5f);
        this.f38629e.lineTo(27.8621f, 35.5f);
        this.f38629e.cubicTo(30.6799f, 35.5f, 33.0402f, 33.2708f, 33.0402f, 30.4286f);
        this.f38629e.lineTo(33.0402f, 29.3158f);
        this.f38629e.lineTo(36.745f, 32.0565f);
        this.f38629e.cubicTo(37.6399f, 32.7185f, 38.8324f, 32.8269f, 39.8318f, 32.3463f);
        this.f38629e.cubicTo(40.8365f, 31.8631f, 41.5f, 30.8514f, 41.5f, 29.7143f);
        this.f38629e.lineTo(41.5f, 18.2857f);
        this.f38629e.cubicTo(41.5f, 17.1486f, 40.8365f, 16.1369f, 39.8318f, 15.6537f);
        this.f38629e.cubicTo(38.8324f, 15.1731f, 37.6399f, 15.2815f, 36.745f, 15.9435f);
        this.f38629e.lineTo(33.0402f, 18.6843f);
        this.f38629e.lineTo(33.0402f, 17.5714f);
        this.f38629e.cubicTo(33.0402f, 14.7292f, 30.6799f, 12.5f, 27.8621f, 12.5f);
        this.f38629e.lineTo(11.6782f, 12.5f);
        this.f38629e.close();
        this.f38629e.moveTo(22.6565f, 24.8462f);
        this.f38629e.cubicTo(23.2792f, 24.4539f, 23.2792f, 23.5461f, 22.6565f, 23.1538f);
        this.f38629e.lineTo(17.2829f, 19.7693f);
        this.f38629e.cubicTo(16.6169f, 19.3499f, 15.7499f, 19.8285f, 15.7499f, 20.6155f);
        this.f38629e.lineTo(15.7499f, 27.3845f);
        this.f38629e.cubicTo(15.7499f, 28.1715f, 16.6169f, 28.6501f, 17.2829f, 28.2307f);
        this.f38629e.lineTo(22.6565f, 24.8462f);
        this.f38629e.close();
        this.f38629e.setFillType(Path.FillType.EVEN_ODD);
        this.f38628d.setStyle(Paint.Style.FILL);
        this.f38628d.setColor(-16777216);
        this.f37300a.add(this.f38628d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38629e, this.f38628d);
    }
}
