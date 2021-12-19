package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.gd */
public class C15765gd extends AbstractC15287a {

    /* renamed from: d */
    Paint f38325d;

    /* renamed from: e */
    Path f38326e;

    static {
        Covode.recordClassIndex(18031);
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
        this.f37301b.setColor(-119723);
        this.f38325d = new Paint();
        Path path = new Path();
        this.f38326e = path;
        path.moveTo(13.1626f, 14.9442f);
        this.f38326e.cubicTo(16.1623f, 11.9237f, 20.8855f, 11.9405f, 24.0f, 15.2778f);
        this.f38326e.cubicTo(27.1145f, 11.9405f, 31.8377f, 11.9237f, 34.8374f, 14.9442f);
        this.f38326e.cubicTo(37.8875f, 18.0156f, 37.8875f, 22.9914f, 34.8374f, 26.0628f);
        this.f38326e.lineTo(24.8471f, 36.1225f);
        this.f38326e.cubicTo(24.623f, 36.3481f, 24.3181f, 36.475f, 24.0f, 36.475f);
        this.f38326e.cubicTo(23.6819f, 36.475f, 23.377f, 36.3481f, 23.1529f, 36.1225f);
        this.f38326e.lineTo(13.1626f, 26.0628f);
        this.f38326e.cubicTo(10.1125f, 22.9914f, 10.1125f, 18.0156f, 13.1626f, 14.9442f);
        this.f38326e.close();
        this.f38326e.setFillType(Path.FillType.EVEN_ODD);
        this.f38325d.setStyle(Paint.Style.FILL);
        this.f38325d.setColor(-1);
        this.f37300a.add(this.f38325d);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38326e, this.f38325d);
    }
}
