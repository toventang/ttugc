package com.facebook.drawee.p1852d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1852d.p1853a.AbstractC24209b;
import com.facebook.drawee.p1854e.C24229q;

/* renamed from: com.facebook.drawee.d.a */
public final class C24207a extends Drawable implements AbstractC24209b {

    /* renamed from: a */
    public int f57320a;

    /* renamed from: b */
    public String f57321b;

    /* renamed from: c */
    public C24229q.AbstractC24231b f57322c;

    /* renamed from: d */
    public long f57323d;

    /* renamed from: e */
    private String f57324e;

    /* renamed from: f */
    private String f57325f;

    /* renamed from: g */
    private int f57326g;

    /* renamed from: h */
    private int f57327h;

    /* renamed from: i */
    private int f57328i;

    /* renamed from: j */
    private int f57329j;

    /* renamed from: k */
    private int f57330k = 80;

    /* renamed from: l */
    private final Paint f57331l = new Paint(1);

    /* renamed from: m */
    private final Matrix f57332m = new Matrix();

    /* renamed from: n */
    private final Rect f57333n = new Rect();

    /* renamed from: o */
    private final RectF f57334o = new RectF();

    /* renamed from: p */
    private int f57335p;

    /* renamed from: q */
    private int f57336q;

    /* renamed from: r */
    private int f57337r;

    /* renamed from: s */
    private int f57338s;

    /* renamed from: t */
    private int f57339t;

    /* renamed from: u */
    private String f57340u;

    static {
        Covode.recordClassIndex(28338);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C24207a() {
        mo39832a();
    }

    /* renamed from: a */
    public final void mo39832a() {
        this.f57326g = -1;
        this.f57327h = -1;
        this.f57320a = -1;
        this.f57328i = -1;
        this.f57329j = -1;
        this.f57321b = null;
        mo39835a((String) null);
        this.f57323d = -1;
        this.f57340u = null;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo39836b(String str) {
        this.f57340u = str;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1852d.p1853a.AbstractC24209b
    /* renamed from: a */
    public final void mo39834a(long j) {
        this.f57323d = j;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo39835a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f57324e = str;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        int i;
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f57331l.setTextSize((float) min);
        int i2 = min + 8;
        this.f57337r = i2;
        if (this.f57330k == 80) {
            this.f57337r = i2 * -1;
        }
        this.f57335p = rect.left + 10;
        if (this.f57330k == 80) {
            i = rect.bottom - 10;
        } else {
            i = rect.top + 10 + 10;
        }
        this.f57336q = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r22) {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p1852d.C24207a.draw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public final void mo39833a(int i, int i2) {
        this.f57326g = i;
        this.f57327h = i2;
        invalidateSelf();
    }

    /* renamed from: a */
    private void m45932a(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(C1764a.m5928a(str, objArr), (float) this.f57338s, (float) this.f57339t, this.f57331l);
        this.f57339t += this.f57337r;
    }
}
