package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.a */
public class C15599a extends AbstractC15287a {

    /* renamed from: d */
    Paint f38055d;

    /* renamed from: e */
    Path f38056e;

    static {
        Covode.recordClassIndex(17865);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(11.5f, 6.0f);
        this.f37302c.cubicTo(11.2239f, 6.0f, 11.0f, 6.22386f, 11.0f, 6.5f);
        this.f37302c.lineTo(11.0f, 7.5f);
        this.f37302c.cubicTo(11.0f, 7.77614f, 11.2239f, 8.0f, 11.5f, 8.0f);
        this.f37302c.lineTo(36.5f, 8.0f);
        this.f37302c.cubicTo(36.7761f, 8.0f, 37.0f, 7.77614f, 37.0f, 7.5f);
        this.f37302c.lineTo(37.0f, 6.5f);
        this.f37302c.cubicTo(37.0f, 6.22386f, 36.7761f, 6.0f, 36.5f, 6.0f);
        this.f37302c.lineTo(11.5f, 6.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38055d = new Paint();
        Path path = new Path();
        this.f38056e = path;
        path.moveTo(25.4591f, 11.5942f);
        this.f38056e.cubicTo(24.6689f, 10.7514f, 23.3311f, 10.7514f, 22.5409f, 11.5942f);
        this.f38056e.lineTo(9.84915f, 25.1321f);
        this.f38056e.cubicTo(8.65165f, 26.4094f, 9.55734f, 28.5f, 11.3082f, 28.5f);
        this.f38056e.lineTo(17.0f, 28.5f);
        this.f38056e.lineTo(17.0f, 39.5f);
        this.f38056e.cubicTo(17.0f, 40.6046f, 17.8954f, 41.5f, 19.0f, 41.5f);
        this.f38056e.lineTo(29.0f, 41.5f);
        this.f38056e.cubicTo(30.1046f, 41.5f, 31.0f, 40.6046f, 31.0f, 39.5f);
        this.f38056e.lineTo(31.0f, 28.5f);
        this.f38056e.lineTo(36.6918f, 28.5f);
        this.f38056e.cubicTo(38.4426f, 28.5f, 39.3483f, 26.4095f, 38.1508f, 25.1321f);
        this.f38056e.lineTo(25.4591f, 11.5942f);
        this.f38056e.close();
        this.f38056e.moveTo(11.3082f, 26.5f);
        this.f38056e.lineTo(24.0f, 12.9621f);
        this.f38056e.lineTo(36.6918f, 26.5f);
        this.f38056e.lineTo(29.0f, 26.5f);
        this.f38056e.lineTo(29.0f, 39.5f);
        this.f38056e.lineTo(19.0f, 39.5f);
        this.f38056e.lineTo(19.0f, 26.5f);
        this.f38056e.lineTo(11.3082f, 26.5f);
        this.f38056e.close();
        this.f38056e.setFillType(Path.FillType.EVEN_ODD);
        this.f38055d.setStyle(Paint.Style.FILL);
        this.f38055d.setColor(-16777216);
        this.f37300a.add(this.f38055d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38056e, this.f38055d);
    }
}
