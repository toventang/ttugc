package com.bytedance.p1112i.p1113a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1084h.AbstractC15287a;

/* renamed from: com.bytedance.i.a.fo */
public class C15749fo extends AbstractC15287a {

    /* renamed from: d */
    Paint f38240d;

    /* renamed from: e */
    Path f38241e;

    /* renamed from: f */
    Paint f38242f;

    /* renamed from: g */
    Path f38243g;

    /* renamed from: h */
    Paint f38244h;

    /* renamed from: i */
    Path f38245i;

    static {
        Covode.recordClassIndex(18015);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24794a() {
        this.f37302c.addCircle(13.1998f, 13.2f, 8.4f, Path.Direction.CW);
        this.f37301b.setStyle(Paint.Style.FILL);
        this.f37301b.setColor(-1356982);
        this.f38240d = new Paint();
        Path path = new Path();
        this.f38241e = path;
        path.addCircle(13.1998f, 34.7999f, 8.4f, Path.Direction.CW);
        this.f38240d.setStyle(Paint.Style.FILL);
        this.f38240d.setColor(-16003121);
        this.f37300a.add(this.f38240d);
        this.f38242f = new Paint();
        Path path2 = new Path();
        this.f38243g = path2;
        path2.addCircle(34.7999f, 13.2f, 8.4f, Path.Direction.CW);
        this.f38242f.setStyle(Paint.Style.FILL);
        this.f38242f.setColor(-14275);
        this.f37300a.add(this.f38242f);
        this.f38244h = new Paint();
        Path path3 = new Path();
        this.f38245i = path3;
        path3.addCircle(34.7999f, 34.7999f, 8.4f, Path.Direction.CW);
        this.f38244h.setStyle(Paint.Style.FILL);
        this.f38244h.setColor(-16739073);
        this.f37300a.add(this.f38244h);
    }

    @Override // com.bytedance.p1084h.AbstractC15287a
    /* renamed from: a */
    public final void mo24795a(Canvas canvas) {
        mo24796a(canvas, 48.0f);
        canvas.drawPath(this.f37302c, this.f37301b);
        canvas.drawPath(this.f38241e, this.f38240d);
        canvas.drawPath(this.f38243g, this.f38242f);
        canvas.drawPath(this.f38245i, this.f38244h);
    }
}
