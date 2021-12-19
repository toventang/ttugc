package com.bytedance.tux.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.C23407a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.widget.c */
public final class C23413c implements C23407a.AbstractC23408a {

    /* renamed from: a */
    float[] f55508a;

    /* renamed from: b */
    public final Path f55509b;

    /* renamed from: c */
    public final Paint f55510c;

    /* renamed from: d */
    public final Region f55511d;

    /* renamed from: e */
    public final RectF f55512e;

    /* renamed from: f */
    public boolean f55513f;

    /* renamed from: g */
    public int f55514g;

    /* renamed from: h */
    public int f55515h;

    /* renamed from: i */
    public boolean f55516i;

    static {
        Covode.recordClassIndex(27372);
    }

    @Override // com.bytedance.tux.widget.C23407a.AbstractC23408a
    /* renamed from: a */
    public final boolean mo38140a() {
        return this.f55516i;
    }

    @Override // com.bytedance.tux.widget.C23407a.AbstractC23408a
    /* renamed from: b */
    public final float[] mo38141b() {
        return this.f55508a;
    }

    private /* synthetic */ C23413c() {
        this(false, -1, 0, false, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo38153a(View view) {
        float width;
        C89219l.m154719c(view, "");
        int width2 = (int) this.f55512e.width();
        int height = (int) this.f55512e.height();
        RectF rectF = new RectF();
        rectF.left = (float) view.getPaddingLeft();
        rectF.top = (float) view.getPaddingTop();
        float f = (float) width2;
        rectF.right = f - ((float) view.getPaddingRight());
        float f2 = (float) height;
        rectF.bottom = f2 - ((float) view.getPaddingBottom());
        this.f55509b.reset();
        if (this.f55513f) {
            if (rectF.width() >= rectF.height()) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f3 = width / 2.0f;
            float f4 = (float) (width2 / 2);
            float f5 = (float) (height / 2);
            PointF pointF = new PointF(f4, f5);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f55509b.addCircle(pointF.x, pointF.y, f3, Path.Direction.CW);
                this.f55509b.moveTo(0.0f, 0.0f);
                this.f55509b.moveTo(f, f2);
            } else {
                float f6 = f5 - f3;
                this.f55509b.moveTo(rectF.left, f6);
                this.f55509b.addCircle(pointF.x, f6 + f3, f3, Path.Direction.CW);
            }
        } else {
            this.f55509b.addRoundRect(rectF, this.f55508a, Path.Direction.CW);
        }
        this.f55511d.setPath(this.f55509b, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }

    public C23413c(boolean z, int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        this.f55513f = z;
        this.f55514g = i;
        this.f55515h = i2;
        this.f55516i = z2;
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = (float) i6;
        float f4 = (float) i5;
        this.f55508a = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        this.f55509b = new Path();
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        this.f55510c = paint;
        this.f55511d = new Region();
        this.f55512e = new RectF();
    }
}
