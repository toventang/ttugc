package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gp */
public class C15777gp extends AbstractC15287a {

    /* renamed from: d */
    Paint f38377d;

    /* renamed from: e */
    Path f38378e;

    /* renamed from: f */
    Paint f38379f;

    /* renamed from: g */
    Path f38380g;

    static {
        Covode.recordClassIndex(18043);
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
        this.f37301b.setColor(-21199);
        this.f38377d = new Paint();
        Path path = new Path();
        this.f38378e = path;
        path.moveTo(25.75f, 24.0f);
        this.f38378e.cubicTo(26.7165f, 24.0f, 27.5f, 23.2165f, 27.5f, 22.25f);
        this.f38378e.cubicTo(27.5f, 21.2835f, 26.7165f, 20.5f, 25.75f, 20.5f);
        this.f38378e.cubicTo(24.7835f, 20.5f, 24.0f, 21.2835f, 24.0f, 22.25f);
        this.f38378e.cubicTo(24.0f, 23.2165f, 24.7835f, 24.0f, 25.75f, 24.0f);
        this.f38378e.close();
        this.f38378e.setFillType(Path.FillType.WINDING);
        this.f38377d.setStyle(Paint.Style.FILL);
        this.f38377d.setColor(-1);
        this.f37300a.add(this.f38377d);
        this.f38379f = new Paint();
        Path path2 = new Path();
        this.f38380g = path2;
        path2.moveTo(24.0001f, 14.2f);
        this.f38380g.cubicTo(15.0883f, 14.2f, 10.6084f, 20.4047f, 9.14987f, 22.94f);
        this.f38380g.cubicTo(8.76775f, 23.6042f, 8.76775f, 24.3958f, 9.14987f, 25.06f);
        this.f38380g.cubicTo(10.6084f, 27.5953f, 15.0883f, 33.8f, 24.0001f, 33.8f);
        this.f38380g.cubicTo(32.9119f, 33.8f, 37.3917f, 27.5953f, 38.8503f, 25.06f);
        this.f38380g.cubicTo(39.2324f, 24.3958f, 39.2324f, 23.6042f, 38.8503f, 22.94f);
        this.f38380g.cubicTo(37.3917f, 20.4047f, 32.9119f, 14.2f, 24.0001f, 14.2f);
        this.f38380g.close();
        this.f38380g.moveTo(29.6f, 24.0f);
        this.f38380g.cubicTo(29.6f, 27.0928f, 27.0928f, 29.6f, 24.0f, 29.6f);
        this.f38380g.cubicTo(20.9072f, 29.6f, 18.4f, 27.0928f, 18.4f, 24.0f);
        this.f38380g.cubicTo(18.4f, 20.9072f, 20.9072f, 18.4f, 24.0f, 18.4f);
        this.f38380g.cubicTo(27.0928f, 18.4f, 29.6f, 20.9072f, 29.6f, 24.0f);
        this.f38380g.close();
        this.f38380g.setFillType(Path.FillType.EVEN_ODD);
        this.f38379f.setStyle(Paint.Style.FILL);
        this.f38379f.setColor(-1);
        this.f37300a.add(this.f38379f);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38378e, this.f38377d);
        canvas.drawPath(this.f38380g, this.f38379f);
    }
}
