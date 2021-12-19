package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.usercard.ah */
public final class C10951ah extends View {

    /* renamed from: a */
    public int f26314a;

    /* renamed from: b */
    public int f26315b;

    /* renamed from: c */
    public Context f26316c;

    /* renamed from: d */
    private Paint f26317d;

    /* renamed from: e */
    private Paint f26318e = new Paint();

    /* renamed from: f */
    private int f26319f;

    /* renamed from: g */
    private int f26320g;

    /* renamed from: h */
    private int f26321h;

    /* renamed from: i */
    private int f26322i;

    /* renamed from: j */
    private int f26323j = 12;

    /* renamed from: k */
    private int f26324k;

    /* renamed from: l */
    private RectF f26325l;

    /* renamed from: m */
    private C10952a f26326m;

    /* renamed from: n */
    private C10952a f26327n;

    /* renamed from: o */
    private PathEffect f26328o;

    /* renamed from: p */
    private float f26329p;

    /* renamed from: q */
    private float f26330q;

    /* renamed from: r */
    private float f26331r;

    static {
        Covode.recordClassIndex(12566);
    }

    public final void setColor(int i) {
        this.f26324k = i;
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.ah$a */
    public class C10952a {

        /* renamed from: a */
        public float f26332a;

        /* renamed from: b */
        public float f26333b;

        /* renamed from: c */
        float f26334c = 2.0f;

        static {
            Covode.recordClassIndex(12567);
        }

        public C10952a() {
            mo17813a(0);
        }

        /* renamed from: a */
        public final void mo17813a(int i) {
            float b = (((float) C10951ah.this.f26314a) - C13628n.m24520b(C10951ah.this.f26316c, 2.0f)) / this.f26334c;
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (d * 3.141592653589793d) / 180.0d;
            this.f26332a = (((float) C10951ah.this.f26314a) / this.f26334c) + (((float) Math.cos(d2)) * b);
            this.f26333b = (((float) C10951ah.this.f26315b) / this.f26334c) + (((float) Math.sin(d2)) * b);
        }
    }

    public C10951ah(Context context) {
        super(context);
        MethodCollector.m26663i(440);
        this.f26316c = context;
        this.f26319f = 0;
        this.f26320g = 0;
        this.f26325l = new RectF();
        this.f26326m = new C10952a();
        this.f26327n = new C10952a();
        this.f26328o = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.f26329p = C13628n.m24520b(this.f26316c, 1.9f);
        this.f26330q = C13628n.m24520b(this.f26316c, 2.0f);
        this.f26331r = C13628n.m24520b(this.f26316c, 2.0f) / 2.0f;
        MethodCollector.m26664o(440);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(450);
        super.onDraw(canvas);
        if (this.f26317d == null) {
            Paint paint = new Paint();
            this.f26317d = paint;
            paint.setAntiAlias(true);
            this.f26317d.setStyle(Paint.Style.STROKE);
        }
        this.f26317d.setColor(this.f26324k);
        this.f26317d.setPathEffect(this.f26328o);
        this.f26317d.setStrokeWidth(this.f26329p);
        canvas.drawArc(this.f26325l, ((float) this.f26319f) / 4.0f, 359.0f, false, this.f26317d);
        this.f26317d.setPathEffect(null);
        int i = this.f26319f;
        double d = (double) i;
        Double.isNaN(d);
        int sin = (int) (Math.sin((d * 3.141592653589793d) / 90.0d) * 345.0d * -1.0d);
        if (i >= 0 && (i < 45 || ((135 <= i && i < 225) || (315 <= i && i < 360)))) {
            sin = -sin;
        }
        if (this.f26319f % 90 == 45) {
            int i2 = this.f26320g;
            int i3 = this.f26321h;
            this.f26322i = (i2 - i3) - 1;
            this.f26320g = i3 + 1;
        }
        if (sin == 0) {
            this.f26320g += this.f26322i;
        }
        this.f26317d.setStrokeWidth(this.f26330q);
        canvas.drawArc(this.f26325l, (float) (this.f26320g - this.f26323j), (float) sin, false, this.f26317d);
        this.f26326m.mo17813a(this.f26320g - this.f26323j);
        this.f26327n.mo17813a((this.f26320g - this.f26323j) + sin);
        this.f26318e.setColor(this.f26324k);
        canvas.drawCircle(this.f26326m.f26332a, this.f26326m.f26333b, this.f26331r, this.f26318e);
        canvas.drawCircle(this.f26327n.f26332a, this.f26327n.f26333b, this.f26331r, this.f26318e);
        int i4 = this.f26320g;
        this.f26321h = sin + i4;
        this.f26319f = (this.f26319f + 1) % 360;
        this.f26320g = (i4 + 1) % 360;
        postInvalidateDelayed(15);
        MethodCollector.m26664o(450);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(443);
        super.onMeasure(i, i2);
        this.f26314a = View.MeasureSpec.getSize(i);
        this.f26315b = View.MeasureSpec.getSize(i2);
        float b = C13628n.m24520b(this.f26316c, 1.0f);
        this.f26325l.set(b, b, ((float) this.f26314a) - b, ((float) this.f26315b) - b);
        MethodCollector.m26664o(443);
    }
}
