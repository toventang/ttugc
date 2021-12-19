package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.go */
public class C15776go extends AbstractC15287a {

    /* renamed from: d */
    Paint f38375d;

    /* renamed from: e */
    Path f38376e;

    static {
        Covode.recordClassIndex(18042);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.addCircle(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-14625300);
        this.f38375d = new Paint();
        Path path = new Path();
        this.f38376e = path;
        path.moveTo(37.1213f, 15.8787f);
        this.f38376e.cubicTo(38.2929f, 17.0503f, 38.2929f, 18.9497f, 37.1213f, 20.1213f);
        this.f38376e.lineTo(23.6213f, 33.6213f);
        this.f38376e.cubicTo(22.4497f, 34.7929f, 20.5503f, 34.7929f, 19.3787f, 33.6213f);
        this.f38376e.lineTo(10.8787f, 25.1213f);
        this.f38376e.cubicTo(9.70711f, 23.9497f, 9.70711f, 22.0503f, 10.8787f, 20.8787f);
        this.f38376e.cubicTo(12.0503f, 19.7071f, 13.9497f, 19.7071f, 15.1213f, 20.8787f);
        this.f38376e.lineTo(21.5f, 27.2574f);
        this.f38376e.lineTo(32.8787f, 15.8787f);
        this.f38376e.cubicTo(34.0503f, 14.7071f, 35.9497f, 14.7071f, 37.1213f, 15.8787f);
        this.f38376e.close();
        this.f38376e.setFillType(Path.FillType.EVEN_ODD);
        this.f38375d.setStyle(Paint.Style.FILL);
        this.f38375d.setColor(-1);
        this.f37300a.add(this.f38375d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38376e, this.f38375d);
    }
}
