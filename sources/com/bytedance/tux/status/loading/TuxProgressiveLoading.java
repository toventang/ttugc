package com.bytedance.tux.status.loading;

import android.animation.ObjectAnimator;
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
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxProgressiveLoading extends View {

    /* renamed from: a */
    public static final C23269a f55161a = new C23269a((byte) 0);

    /* renamed from: b */
    private int f55162b;

    /* renamed from: c */
    private int f55163c;

    /* renamed from: d */
    private Paint f55164d;

    /* renamed from: e */
    private int f55165e;

    /* renamed from: f */
    private final ObjectAnimator f55166f;

    /* renamed from: g */
    private boolean f55167g;

    static {
        Covode.recordClassIndex(27216);
    }

    public TuxProgressiveLoading(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.tux.status.loading.TuxProgressiveLoading$a */
    public static final class C23269a {
        static {
            Covode.recordClassIndex(27217);
        }

        private C23269a() {
        }

        public /* synthetic */ C23269a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m43829a() {
        if (this.f55165e != 100 || !this.f55167g) {
            this.f55166f.cancel();
            setAlpha(1.0f);
            return;
        }
        this.f55166f.setDuration(200L);
        this.f55166f.start();
    }

    public final void setAutoDisappear(boolean z) {
        this.f55167g = z;
        m43829a();
    }

    public final void setProgress(int i) {
        if (i < 0) {
            this.f55165e = 0;
        } else if (i > 100) {
            this.f55165e = 100;
        } else {
            this.f55165e = i;
        }
        invalidate();
        m43829a();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8019);
        C89219l.m154719c(canvas, "");
        super.onDraw(canvas);
        this.f55164d.setStrokeWidth((float) getHeight());
        this.f55164d.setColor(this.f55162b);
        float height = ((float) getHeight()) / 2.0f;
        canvas.drawLine(0.0f, height, (float) getWidth(), height, this.f55164d);
        this.f55164d.setColor(this.f55163c);
        if (C23163i.m43664a(this)) {
            canvas.drawLine((float) getWidth(), height, ((float) getWidth()) - (((float) getWidth()) * (((float) this.f55165e) / 100.0f)), height, this.f55164d);
            MethodCollector.m26664o(8019);
            return;
        }
        canvas.drawLine(0.0f, height, ((float) getWidth()) * (((float) this.f55165e) / 100.0f), height, this.f55164d);
        MethodCollector.m26664o(8019);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            size2 = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        }
        setMeasuredDimension(size, size2);
    }

    private /* synthetic */ TuxProgressiveLoading(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxProgressiveLoading(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.c1);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8470);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.f55164d = paint;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        C89219l.m154709a((Object) ofFloat, "");
        this.f55166f = ofFloat;
        this.f55167g = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ao9, R.attr.arr}, R.attr.c1, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f55162b = color;
        this.f55163c = color2;
        this.f55167g = true;
        MethodCollector.m26664o(8470);
    }
}
