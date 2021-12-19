package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekBar */
public class VEEffectSeekBar extends View {

    /* renamed from: a */
    private float f107806a;

    /* renamed from: b */
    private int f107807b;

    /* renamed from: c */
    private int f107808c;

    /* renamed from: d */
    private Paint f107809d;

    /* renamed from: e */
    private Paint f107810e;

    /* renamed from: f */
    private ArrayList<EffectPointModel> f107811f;

    /* renamed from: g */
    private boolean f107812g;

    /* renamed from: h */
    private RectF f107813h;

    /* renamed from: i */
    private RectF f107814i;

    /* renamed from: j */
    private int f107815j;

    /* renamed from: k */
    private int f107816k;

    /* renamed from: l */
    private int f107817l;

    /* renamed from: m */
    private boolean f107818m;

    static {
        Covode.recordClassIndex(54837);
    }

    /* renamed from: a */
    public final void mo78706a(boolean z) {
        if (this.f107818m != z) {
            this.f107818m = z;
            invalidate();
        }
    }

    public void setDuration(int i) {
        this.f107815j = i;
        this.f107806a = ((float) this.f107807b) / ((float) i);
    }

    public void setNormalColor(int i) {
        this.f107816k = i;
        if (!this.f107818m) {
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.f107817l != i) {
            this.f107817l = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        MethodCollector.m26663i(8577);
        super.onDraw(canvas);
        if (this.f107818m) {
            this.f107809d.setColor(this.f107817l);
            if (this.f107817l != 0) {
                this.f107809d.setAlpha(230);
            }
            canvas.drawRect(this.f107813h, this.f107809d);
            MethodCollector.m26664o(8577);
            return;
        }
        this.f107809d.setColor(this.f107816k);
        RectF rectF = this.f107813h;
        int i = this.f107808c;
        canvas.drawRoundRect(rectF, (float) (i / 2), (float) (i / 2), this.f107809d);
        for (int i2 = 0; i2 < this.f107811f.size(); i2++) {
            EffectPointModel effectPointModel = this.f107811f.get(i2);
            if (effectPointModel.getSelectedColor() != 0) {
                this.f107810e.setColor(effectPointModel.getSelectedColor());
                this.f107810e.setAlpha(230);
                int uiStartPoint = effectPointModel.getUiStartPoint();
                int uiEndPoint = effectPointModel.getUiEndPoint();
                boolean isFromEnd = effectPointModel.isFromEnd() ^ this.f107812g;
                if (isFromEnd) {
                    f = (float) (this.f107815j - uiEndPoint);
                } else {
                    f = (float) uiStartPoint;
                }
                float f3 = f * this.f107806a;
                if (isFromEnd) {
                    f2 = (float) (this.f107815j - uiStartPoint);
                } else {
                    f2 = (float) uiEndPoint;
                }
                this.f107814i.set(f3, 0.0f, f2 * this.f107806a, (float) this.f107808c);
                if (uiStartPoint == 0 && uiEndPoint == this.f107815j) {
                    RectF rectF2 = this.f107814i;
                    int i3 = this.f107808c;
                    canvas.drawRoundRect(rectF2, (float) (i3 / 2), (float) (i3 / 2), this.f107810e);
                } else {
                    canvas.drawRect(this.f107814i, this.f107810e);
                }
            }
        }
        MethodCollector.m26664o(8577);
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo78705a(ArrayList<EffectPointModel> arrayList, boolean z) {
        this.f107811f = arrayList;
        this.f107812g = z;
        postInvalidate();
    }

    /* renamed from: a */
    public final void mo78707a(boolean z, int i) {
        boolean z2;
        if (this.f107818m != z) {
            this.f107818m = z;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && this.f107817l != i) {
            this.f107817l = i;
        } else if (!z2) {
            return;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8423);
        super.onMeasure(i, i2);
        this.f107808c = View.MeasureSpec.getSize(i2);
        if (this.f107813h == null) {
            this.f107813h = new RectF();
        }
        this.f107813h.set(0.0f, 0.0f, (float) this.f107807b, (float) this.f107808c);
        MethodCollector.m26664o(8423);
    }

    private VEEffectSeekBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8270);
        this.f107807b = C46351d.f108045a;
        this.f107808c = (int) C13628n.m24520b(getContext(), 5.0f);
        Paint paint = new Paint();
        this.f107809d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f107810e = paint2;
        paint2.setAntiAlias(true);
        this.f107811f = new ArrayList<>();
        this.f107814i = new RectF();
        MethodCollector.m26664o(8270);
    }
}
