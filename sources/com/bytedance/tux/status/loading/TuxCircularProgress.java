package com.bytedance.tux.status.loading;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxCircularProgress extends View {

    /* renamed from: a */
    public static final C23266a f55135a = new C23266a((byte) 0);

    /* renamed from: b */
    private int f55136b;

    /* renamed from: c */
    private int f55137c;

    /* renamed from: d */
    private Paint f55138d;

    /* renamed from: e */
    private float f55139e;

    static {
        Covode.recordClassIndex(27210);
    }

    public TuxCircularProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.tux.status.loading.TuxCircularProgress$a */
    public static final class C23266a {
        static {
            Covode.recordClassIndex(27211);
        }

        private C23266a() {
        }

        public /* synthetic */ C23266a(byte b) {
            this();
        }
    }

    public final void setProgress(float f) {
        if (f < 0.0f) {
            this.f55139e = 0.0f;
        } else if (f > 100.0f) {
            this.f55139e = 100.0f;
        } else {
            this.f55139e = f;
        }
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int height;
        MethodCollector.m26663i(8737);
        C89219l.m154719c(canvas, "");
        super.onDraw(canvas);
        if (getWidth() < getHeight()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        float f = (float) height;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        float width = ((((float) getWidth()) - f) / 2.0f) + (TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()) / 2.0f);
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        float height2 = ((((float) getHeight()) - f) / 2.0f) + (TypedValue.applyDimension(1, 3.0f, system2.getDisplayMetrics()) / 2.0f);
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        float applyDimension = (width + f) - TypedValue.applyDimension(1, 3.0f, system3.getDisplayMetrics());
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        float applyDimension2 = (f + height2) - TypedValue.applyDimension(1, 3.0f, system4.getDisplayMetrics());
        this.f55138d.setColor(this.f55136b);
        canvas.drawArc(width, height2, applyDimension, applyDimension2, -90.0f, 360.0f, false, this.f55138d);
        this.f55138d.setColor(this.f55137c);
        canvas.drawArc(width, height2, applyDimension, applyDimension2, -90.0f, (this.f55139e / 100.0f) * 360.0f, false, this.f55138d);
        MethodCollector.m26664o(8737);
    }

    private /* synthetic */ TuxCircularProgress(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCircularProgress(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.bq);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8878);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        paint.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()));
        this.f55138d = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aow, R.attr.aox}, R.attr.bq, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f55136b = color;
        this.f55137c = color2;
        MethodCollector.m26664o(8878);
    }
}
