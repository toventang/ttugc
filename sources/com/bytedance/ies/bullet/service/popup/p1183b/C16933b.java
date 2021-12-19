package com.bytedance.ies.bullet.service.popup.p1183b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.service.popup.b.b */
public final class C16933b {

    /* renamed from: a */
    private Paint f40265a;

    /* renamed from: b */
    private RectF f40266b;

    /* renamed from: c */
    private Path f40267c;

    /* renamed from: d */
    private Path f40268d;

    /* renamed from: e */
    private Xfermode f40269e;

    /* renamed from: f */
    private float[] f40270f;

    /* renamed from: g */
    private float f40271g = -1.0f;

    /* renamed from: h */
    private View f40272h;

    static {
        Covode.recordClassIndex(19375);
    }

    /* renamed from: a */
    public final void mo26758a(Canvas canvas) {
        if (this.f40271g > 0.0f) {
            canvas.saveLayer(this.f40266b, null, 31);
        }
    }

    /* renamed from: a */
    public final void mo26756a(float f) {
        this.f40271g = f;
        float[] fArr = this.f40270f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        View view = this.f40272h;
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo26759a(View view) {
        PorterDuff.Mode mode;
        if (view.getBackground() == null) {
            view.setBackgroundColor(Color.parseColor("#00000000"));
        }
        this.f40272h = view;
        this.f40270f = new float[8];
        this.f40265a = new Paint();
        this.f40266b = new RectF();
        this.f40267c = new Path();
        this.f40268d = new Path();
        if (Build.VERSION.SDK_INT >= 23) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        this.f40269e = new PorterDuffXfermode(mode);
    }

    /* renamed from: b */
    public final void mo26760b(Canvas canvas) {
        if (this.f40271g > 0.0f) {
            this.f40265a.reset();
            this.f40267c.reset();
            this.f40265a.setAntiAlias(true);
            this.f40265a.setStyle(Paint.Style.FILL);
            this.f40265a.setXfermode(this.f40269e);
            this.f40267c.addRoundRect(this.f40266b, this.f40270f, Path.Direction.CCW);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f40268d.reset();
                this.f40268d.addRect(this.f40266b, Path.Direction.CCW);
                this.f40268d.op(this.f40267c, Path.Op.DIFFERENCE);
                canvas.drawPath(this.f40268d, this.f40265a);
            } else {
                canvas.drawPath(this.f40267c, this.f40265a);
            }
            this.f40265a.setXfermode(null);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo26757a(int i, int i2) {
        RectF rectF = this.f40266b;
        if (rectF != null && this.f40271g > 0.0f) {
            rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        }
    }
}
