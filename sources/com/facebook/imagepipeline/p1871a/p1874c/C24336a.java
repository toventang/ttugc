package com.facebook.imagepipeline.p1871a.p1874c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d;
import com.facebook.imagepipeline.p1871a.p1872a.C24320b;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1871a.p1873b.AbstractC24335f;
import com.facebook.imagepipeline.p1871a.p1873b.C24328b;
import com.facebook.imagepipeline.p1871a.p1875d.C24346a;

/* renamed from: com.facebook.imagepipeline.a.c.a */
public final class C24336a implements AbstractC24319a {

    /* renamed from: a */
    public int f57700a = 2;

    /* renamed from: b */
    private final C24346a f57701b;

    /* renamed from: c */
    private final C24325e f57702c;

    /* renamed from: d */
    private final AbstractC24323c f57703d;

    /* renamed from: e */
    private final Rect f57704e;

    /* renamed from: f */
    private final int[] f57705f;

    /* renamed from: g */
    private final int[] f57706g;

    /* renamed from: h */
    private final int f57707h;

    /* renamed from: i */
    private final C24320b[] f57708i;

    /* renamed from: j */
    private final Rect f57709j = new Rect();

    /* renamed from: k */
    private final Rect f57710k = new Rect();

    /* renamed from: l */
    private Bitmap f57711l;

    /* renamed from: m */
    private boolean f57712m;

    static {
        Covode.recordClassIndex(28478);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: a */
    public final int mo40114a() {
        return this.f57703d.getFrameCount();
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: b */
    public final int mo40118b() {
        return this.f57703d.getLoopCount();
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: c */
    public final int mo40120c() {
        return this.f57703d.getWidth();
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: d */
    public final int mo40121d() {
        return this.f57703d.getHeight();
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: e */
    public final int mo40122e() {
        return this.f57704e.width();
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: f */
    public final int mo40123f() {
        return this.f57704e.height();
    }

    /* renamed from: g */
    private synchronized void m46316g() {
        MethodCollector.m26663i(3697);
        Bitmap bitmap = this.f57711l;
        if (bitmap != null) {
            if (!this.f57712m) {
                bitmap.recycle();
            }
            this.f57711l = null;
        }
        MethodCollector.m26664o(3697);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: a */
    public final C24320b mo40116a(int i) {
        return this.f57708i[i];
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: b */
    public final int mo40119b(int i) {
        return this.f57705f[i];
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: a */
    public final AbstractC24319a mo40115a(Rect rect) {
        if (m46313a(this.f57703d, rect).equals(this.f57704e)) {
            return this;
        }
        return new C24336a(this.f57701b, this.f57702c, rect);
    }

    /* renamed from: a */
    private static Rect m46313a(AbstractC24323c cVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, cVar.getWidth(), cVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    /* renamed from: a */
    private synchronized void m46315a(int i, int i2) {
        Bitmap a;
        MethodCollector.m26663i(3693);
        Bitmap bitmap = this.f57711l;
        if (bitmap != null && (bitmap.getWidth() < i || this.f57711l.getHeight() < i2)) {
            m46316g();
        }
        if (this.f57711l == null) {
            AbstractC24335f fVar = C24328b.f57689a;
            if (fVar == null || (a = fVar.mo40133a()) == null) {
                this.f57711l = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f57712m = false;
            } else {
                this.f57711l = a;
                this.f57712m = true;
                MethodCollector.m26664o(3693);
                return;
            }
        }
        MethodCollector.m26664o(3693);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24319a
    /* renamed from: a */
    public final void mo40117a(int i, Canvas canvas) {
        MethodCollector.m26663i(3685);
        AbstractC24324d frame = this.f57703d.getFrame(i);
        try {
            if (this.f57703d.doesRenderSupportScaling()) {
                double width = (double) this.f57704e.width();
                double width2 = (double) this.f57703d.getWidth();
                Double.isNaN(width);
                Double.isNaN(width2);
                double d = width / width2;
                double height = (double) this.f57704e.height();
                double height2 = (double) this.f57703d.getHeight();
                Double.isNaN(height);
                Double.isNaN(height2);
                double d2 = height / height2;
                double b = (double) frame.mo39495b();
                Double.isNaN(b);
                int round = (int) Math.round(b * d);
                double c = (double) frame.mo39496c();
                Double.isNaN(c);
                int round2 = (int) Math.round(c * d2);
                double d3 = (double) frame.mo39497d();
                Double.isNaN(d3);
                int i2 = (int) (d3 * d);
                double e = (double) frame.mo39498e();
                Double.isNaN(e);
                int i3 = (int) (e * d2);
                synchronized (this) {
                    try {
                        int width3 = this.f57704e.width();
                        int height3 = this.f57704e.height();
                        m46315a(width3, height3);
                        synchronized (this.f57711l) {
                            try {
                                this.f57711l.eraseColor(0);
                                try {
                                    frame.mo39494a(round, round2, this.f57711l);
                                    this.f57709j.set(0, 0, width3, height3);
                                    this.f57710k.set(i2, i3, width3 + i2, height3 + i3);
                                    canvas.drawBitmap(this.f57711l, this.f57709j, this.f57710k, (Paint) null);
                                } catch (IllegalStateException e2) {
                                    IllegalStateException illegalStateException = new IllegalStateException(e2.getMessage() + m46314a(this.f57711l, round, round2, this.f57704e, this.f57700a));
                                    MethodCollector.m26664o(3685);
                                    throw illegalStateException;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(3685);
                    }
                }
            } else {
                int b2 = frame.mo39495b();
                int c2 = frame.mo39496c();
                int d4 = frame.mo39497d();
                int e3 = frame.mo39498e();
                synchronized (this) {
                    try {
                        m46315a(b2, c2);
                        synchronized (this.f57711l) {
                            try {
                                this.f57711l.eraseColor(0);
                                try {
                                    frame.mo39494a(b2, c2, this.f57711l);
                                    this.f57709j.set(0, 0, b2, c2);
                                    this.f57710k.set(0, 0, b2, c2);
                                    canvas.save();
                                    canvas.translate((float) d4, (float) e3);
                                    canvas.drawBitmap(this.f57711l, this.f57709j, this.f57710k, (Paint) null);
                                    canvas.restore();
                                } catch (IllegalStateException e4) {
                                    IllegalStateException illegalStateException2 = new IllegalStateException(e4.getMessage() + m46314a(this.f57711l, b2, c2, null, this.f57700a));
                                    MethodCollector.m26664o(3685);
                                    throw illegalStateException2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(3685);
                    }
                }
            }
        } finally {
            frame.mo39493a();
            MethodCollector.m26664o(3685);
        }
    }

    public C24336a(C24346a aVar, C24325e eVar, Rect rect) {
        this.f57701b = aVar;
        this.f57702c = eVar;
        AbstractC24323c cVar = eVar.f57681a;
        this.f57703d = cVar;
        int[] frameDurations = cVar.getFrameDurations();
        this.f57705f = frameDurations;
        C24346a.m46344a(frameDurations);
        this.f57707h = C24346a.m46345b(frameDurations);
        this.f57706g = C24346a.m46346c(frameDurations);
        this.f57704e = m46313a(cVar, rect);
        this.f57708i = new C24320b[cVar.getFrameCount()];
        for (int i = 0; i < this.f57703d.getFrameCount(); i++) {
            this.f57708i[i] = this.f57703d.getFrameInfo(i);
        }
    }

    /* renamed from: a */
    private static String m46314a(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder append = new StringBuilder(", mTempBitmap:").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append(", frame:").append(i).append("x").append(i2);
        if (rect != null) {
            append.append(", renderedBounds:").append(rect.width()).append("x").append(rect.height());
        }
        append.append(", decodeType:").append(i3);
        return append.toString();
    }
}
