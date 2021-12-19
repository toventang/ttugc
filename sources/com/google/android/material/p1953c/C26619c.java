package com.google.android.material.p1953c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1953c.AbstractC26621d;
import com.google.android.material.p1956e.C26629a;

/* renamed from: com.google.android.material.c.c */
public final class C26619c {

    /* renamed from: a */
    public static final int f62933a;

    /* renamed from: b */
    public final Paint f62934b;

    /* renamed from: c */
    public Drawable f62935c;

    /* renamed from: d */
    private final AbstractC26620a f62936d;

    /* renamed from: e */
    private final View f62937e;

    /* renamed from: f */
    private final Path f62938f;

    /* renamed from: g */
    private final Paint f62939g;

    /* renamed from: h */
    private AbstractC26621d.C26625d f62940h;

    /* renamed from: i */
    private boolean f62941i;

    /* renamed from: j */
    private boolean f62942j;

    /* renamed from: com.google.android.material.c.c$a */
    public interface AbstractC26620a {
        static {
            Covode.recordClassIndex(32068);
        }

        /* renamed from: a */
        void mo43994a(Canvas canvas);

        /* renamed from: c */
        boolean mo43996c();
    }

    /* renamed from: h */
    private boolean m52805h() {
        if (this.f62941i || this.f62935c == null || this.f62940h == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(32067);
        if (Build.VERSION.SDK_INT >= 21) {
            f62933a = 2;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        f62933a = 1;
    }

    /* renamed from: f */
    private boolean m52803f() {
        boolean z;
        AbstractC26621d.C26625d dVar = this.f62940h;
        if (dVar == null || dVar.mo44023a()) {
            z = true;
        } else {
            z = false;
        }
        if (f62933a == 0) {
            if (z || !this.f62942j) {
                return false;
            }
            return true;
        } else if (!z) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m52804g() {
        if (this.f62941i || Color.alpha(this.f62934b.getColor()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final AbstractC26621d.C26625d mo44014c() {
        if (this.f62940h == null) {
            return null;
        }
        AbstractC26621d.C26625d dVar = new AbstractC26621d.C26625d(this.f62940h);
        if (dVar.mo44023a()) {
            dVar.f62949c = m52800b(dVar);
        }
        return dVar;
    }

    /* renamed from: d */
    public final boolean mo44015d() {
        if (!this.f62936d.mo43996c() || m52803f()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m52802e() {
        if (f62933a == 1) {
            this.f62938f.rewind();
            AbstractC26621d.C26625d dVar = this.f62940h;
            if (dVar != null) {
                this.f62938f.addCircle(dVar.f62947a, this.f62940h.f62948b, this.f62940h.f62949c, Path.Direction.CW);
            }
        }
        this.f62937e.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r5 != null) goto L_0x004a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44008a() {
        /*
            r7 = this;
            r6 = 10676(0x29b4, float:1.496E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            int r0 = com.google.android.material.p1953c.C26619c.f62933a
            if (r0 != 0) goto L_0x005a
            r4 = 1
            r7.f62941i = r4
            r3 = 0
            r7.f62942j = r3
            android.view.View r0 = r7.f62937e
            r0.buildDrawingCache()
            android.view.View r0 = r7.f62937e
            android.graphics.Bitmap r5 = r0.getDrawingCache()
            if (r5 != 0) goto L_0x004a
            android.view.View r0 = r7.f62937e
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r7.f62937e
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x0056
            android.view.View r0 = r7.f62937e
            int r2 = r0.getWidth()
            android.view.View r0 = r7.f62937e
            int r1 = r0.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r5)
            android.view.View r0 = r7.f62937e
            r0.draw(r1)
            if (r5 == 0) goto L_0x0056
        L_0x004a:
            android.graphics.Paint r2 = r7.f62939g
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r5, r0, r0)
            r2.setShader(r1)
        L_0x0056:
            r7.f62941i = r3
            r7.f62942j = r4
        L_0x005a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.p1953c.C26619c.mo44008a():void");
    }

    /* renamed from: b */
    public final void mo44013b() {
        if (f62933a == 0) {
            this.f62942j = false;
            this.f62937e.destroyDrawingCache();
            this.f62939g.setShader(null);
            this.f62937e.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo44011a(Drawable drawable) {
        this.f62935c = drawable;
        this.f62937e.invalidate();
    }

    /* renamed from: a */
    public final void mo44009a(int i) {
        this.f62934b.setColor(i);
        this.f62937e.invalidate();
    }

    /* renamed from: b */
    private float m52800b(AbstractC26621d.C26625d dVar) {
        return C26629a.m52823a(dVar.f62947a, dVar.f62948b, (float) this.f62937e.getWidth(), (float) this.f62937e.getHeight());
    }

    /* renamed from: b */
    private void m52801b(Canvas canvas) {
        if (m52805h()) {
            Rect bounds = this.f62935c.getBounds();
            float width = this.f62940h.f62947a - (((float) bounds.width()) / 2.0f);
            float height = this.f62940h.f62948b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f62935c.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: a */
    public final void mo44012a(AbstractC26621d.C26625d dVar) {
        if (dVar == null) {
            this.f62940h = null;
        } else {
            AbstractC26621d.C26625d dVar2 = this.f62940h;
            if (dVar2 == null) {
                this.f62940h = new AbstractC26621d.C26625d(dVar);
            } else {
                dVar2.mo44022a(dVar);
            }
            if (C26629a.m52824a(dVar.f62949c, m52800b(dVar))) {
                this.f62940h.f62949c = Float.MAX_VALUE;
            }
        }
        m52802e();
    }

    /* renamed from: a */
    public final void mo44010a(Canvas canvas) {
        if (m52803f()) {
            int i = f62933a;
            if (i == 0) {
                canvas.drawCircle(this.f62940h.f62947a, this.f62940h.f62948b, this.f62940h.f62949c, this.f62939g);
                if (m52804g()) {
                    canvas.drawCircle(this.f62940h.f62947a, this.f62940h.f62948b, this.f62940h.f62949c, this.f62934b);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f62938f);
                this.f62936d.mo43994a(canvas);
                if (m52804g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f62937e.getWidth(), (float) this.f62937e.getHeight(), this.f62934b);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f62936d.mo43994a(canvas);
                if (m52804g()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f62937e.getWidth(), (float) this.f62937e.getHeight(), this.f62934b);
                }
            } else {
                throw new IllegalStateException("Unsupported strategy " + i);
            }
        } else {
            this.f62936d.mo43994a(canvas);
            if (m52804g()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f62937e.getWidth(), (float) this.f62937e.getHeight(), this.f62934b);
            }
        }
        m52801b(canvas);
    }
}
