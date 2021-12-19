package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.EdgeTransparentView */
public class EdgeTransparentView extends FrameLayout {

    /* renamed from: a */
    private final int[] f181865a;

    /* renamed from: b */
    private final float[] f181866b;

    /* renamed from: c */
    private Paint f181867c;

    /* renamed from: d */
    private int f181868d;

    /* renamed from: e */
    private float f181869e;

    /* renamed from: f */
    private int f181870f;

    /* renamed from: g */
    private int f181871g;

    static {
        Covode.recordClassIndex(94752);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public EdgeTransparentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private EdgeTransparentView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9791);
        this.f181865a = new int[]{-1, 0};
        this.f181866b = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.f181867c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f181867c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7l, R.attr.aje, R.attr.ajf, R.attr.au0});
        this.f181868d = obtainStyledAttributes.getInt(0, 0);
        this.f181869e = obtainStyledAttributes.getDimension(3, C84912r.m145930a(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(9791);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = this.f181868d;
        if (i == 0 || (i & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, (float) this.f181870f, this.f181869e, this.f181867c);
        }
        int i2 = this.f181868d;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, ((float) this.f181870f) / 2.0f, ((float) this.f181871g) / 2.0f);
            canvas.drawRect(0.0f, -3.0f, (float) this.f181870f, this.f181869e, this.f181867c);
            canvas.restoreToCount(save);
        }
        int i3 = (this.f181871g - this.f181870f) / 2;
        int i4 = this.f181868d;
        if (i4 == 0 || (i4 & 4) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, ((float) this.f181870f) / 2.0f, ((float) this.f181871g) / 2.0f);
            float f = (float) i3;
            canvas.translate(0.0f, f);
            canvas.drawRect((float) (-i3), -3.0f, ((float) this.f181870f) + f, this.f181869e, this.f181867c);
            canvas.restoreToCount(save2);
        }
        int i5 = this.f181868d;
        if (i5 == 0 || (i5 & 8) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, ((float) this.f181870f) / 2.0f, ((float) this.f181871g) / 2.0f);
            float f2 = (float) i3;
            canvas.translate(0.0f, f2);
            canvas.drawRect((float) (-i3), -3.0f, ((float) this.f181870f) + f2, this.f181869e, this.f181867c);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f181867c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f181869e, this.f181865a, this.f181866b, Shader.TileMode.CLAMP));
        this.f181870f = getWidth();
        this.f181871g = getHeight();
    }
}
