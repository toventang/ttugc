package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.hk */
public class C15799hk extends AbstractC15287a {

    /* renamed from: d */
    Paint f38407d;

    /* renamed from: e */
    Path f38408e;

    static {
        Covode.recordClassIndex(18065);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.moveTo(21.0f, 7.0f);
        this.f37302c.cubicTo(21.0f, 6.44772f, 21.4477f, 6.0f, 22.0f, 6.0f);
        this.f37302c.lineTo(26.0f, 6.0f);
        this.f37302c.cubicTo(26.5523f, 6.0f, 27.0f, 6.44772f, 27.0f, 7.0f);
        this.f37302c.lineTo(27.0f, 30.0f);
        this.f37302c.cubicTo(27.0f, 30.5523f, 26.5523f, 31.0f, 26.0f, 31.0f);
        this.f37302c.lineTo(22.0f, 31.0f);
        this.f37302c.cubicTo(21.4477f, 31.0f, 21.0f, 30.5523f, 21.0f, 30.0f);
        this.f37302c.lineTo(21.0f, 7.0f);
        this.f37302c.close();
        this.f37302c.setFillType(Path.FillType.WINDING);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-16777216);
        this.f38407d = new Paint();
        Path path = new Path();
        this.f38408e = path;
        path.moveTo(21.0f, 36.0f);
        this.f38408e.cubicTo(21.0f, 35.4477f, 21.4477f, 35.0f, 22.0f, 35.0f);
        this.f38408e.lineTo(26.0f, 35.0f);
        this.f38408e.cubicTo(26.5523f, 35.0f, 27.0f, 35.4477f, 27.0f, 36.0f);
        this.f38408e.lineTo(27.0f, 40.0f);
        this.f38408e.cubicTo(27.0f, 40.5523f, 26.5523f, 41.0f, 26.0f, 41.0f);
        this.f38408e.lineTo(22.0f, 41.0f);
        this.f38408e.cubicTo(21.4477f, 41.0f, 21.0f, 40.5523f, 21.0f, 40.0f);
        this.f38408e.lineTo(21.0f, 36.0f);
        this.f38408e.close();
        this.f38408e.setFillType(Path.FillType.WINDING);
        this.f38407d.setStyle(Paint.Style.FILL);
        this.f38407d.setColor(-16777216);
        this.f37300a.add(this.f38407d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38408e, this.f38407d);
    }
}
