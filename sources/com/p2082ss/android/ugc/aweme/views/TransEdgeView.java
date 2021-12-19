package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.views.TransEdgeView */
public class TransEdgeView extends FrameLayout {

    /* renamed from: a */
    private int[] f181982a;

    /* renamed from: b */
    private float[] f181983b;

    /* renamed from: c */
    private float f181984c;

    /* renamed from: d */
    private int f181985d;

    /* renamed from: e */
    private int f181986e;

    /* renamed from: f */
    private int f181987f;

    /* renamed from: g */
    private Paint f181988g;

    static {
        Covode.recordClassIndex(94789);
    }

    /* renamed from: a */
    public final void mo125070a() {
        this.f181987f = 8;
        invalidate();
    }

    /* renamed from: b */
    public final void mo125071b() {
        this.f181987f = 4;
        invalidate();
    }

    /* renamed from: c */
    public final void mo125072c() {
        this.f181987f = 12;
        invalidate();
    }

    public void setDrawSize(float f) {
        this.f181984c = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9486);
        super.onDraw(canvas);
        MethodCollector.m26664o(9486);
    }

    public TransEdgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TransEdgeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        boolean z = false;
        MethodCollector.m26663i(9333);
        this.f181982a = new int[]{-1, 0};
        this.f181983b = new float[]{0.0f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.s_, R.attr.sa});
        this.f181987f = obtainStyledAttributes.getInt(0, 0);
        int i = Build.VERSION.SDK_INT;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? true : z) {
            if ((this.f181987f & 16) != 0) {
                this.f181987f = 4;
            }
            if ((this.f181987f & 32) != 0) {
                this.f181987f = 16;
            }
        } else {
            if ((this.f181987f & 16) != 0) {
                this.f181987f = 8;
            }
            if ((this.f181987f & 32) != 0) {
                this.f181987f = 4;
            }
        }
        this.f181984c = obtainStyledAttributes.getDimension(1, C13628n.m24520b(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f181988g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f181988g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        MethodCollector.m26664o(9333);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = this.f181987f;
        if (i == 0 || (i & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, (float) this.f181985d, this.f181984c, this.f181988g);
        }
        int i2 = this.f181987f;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, (float) (this.f181985d / 2), (float) (this.f181986e / 2));
            canvas.drawRect(0.0f, -3.0f, (float) this.f181985d, this.f181984c, this.f181988g);
            canvas.restoreToCount(save);
        }
        int i3 = (this.f181986e - this.f181985d) / 2;
        int i4 = this.f181987f;
        if (i4 == 0 || (i4 & 4) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, (float) (this.f181985d / 2), (float) (this.f181986e / 2));
            canvas.translate(0.0f, (float) i3);
            canvas.drawRect((float) (0 - i3), -3.0f, (float) (this.f181985d + i3), this.f181984c, this.f181988g);
            canvas.restoreToCount(save2);
        }
        int i5 = this.f181987f;
        if (i5 == 0 || (i5 & 8) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, (float) (this.f181985d / 2), (float) (this.f181986e / 2));
            canvas.translate(0.0f, (float) i3);
            canvas.drawRect((float) (0 - i3), -3.0f, (float) (this.f181985d + i3), this.f181984c, this.f181988g);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f181988g.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f181984c, this.f181982a, this.f181983b, Shader.TileMode.CLAMP));
        this.f181985d = getWidth();
        this.f181986e = getHeight();
    }
}
