package com.p2082ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.a */
public final class C43585a extends View {

    /* renamed from: a */
    public static final C43586a f101621a = new C43586a((byte) 0);

    /* renamed from: b */
    private Paint f101622b;

    /* renamed from: c */
    private Paint f101623c;

    static {
        Covode.recordClassIndex(51828);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.a$a */
    public static final class C43586a {
        static {
            Covode.recordClassIndex(51829);
        }

        private C43586a() {
        }

        public /* synthetic */ C43586a(byte b) {
            this();
        }
    }

    public final void setButtonBackgroundColor(int i) {
        this.f101622b.setColor(i);
    }

    public final void setCrossLineColor(int i) {
        this.f101623c.setColor(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C43585a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9528);
        this.f101622b = new Paint();
        this.f101623c = new Paint();
        this.f101622b.setStyle(Paint.Style.FILL);
        this.f101622b.setAntiAlias(true);
        this.f101623c.setStyle(Paint.Style.STROKE);
        this.f101623c.setStrokeCap(Paint.Cap.ROUND);
        this.f101623c.setAntiAlias(true);
        setButtonBackgroundColor(C0643b.m2378c(context, R.color.bz));
        setCrossLineColor(C0643b.m2378c(context, R.color.l));
        MethodCollector.m26664o(9528);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9382);
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.f101623c.getStrokeWidth() <= 0.0f) {
                this.f101623c.setStrokeWidth(((float) getHeight()) * 0.1f);
            }
            int height = getHeight();
            float height2 = ((float) getHeight()) / 2.0f;
            int width = getWidth() - getPaddingRight();
            float height3 = ((float) getHeight()) / 2.0f;
            float height4 = ((float) getHeight()) * 0.5f;
            float f = (float) height;
            float f2 = ((float) width) - ((f - height4) / 2.0f);
            float f3 = f2 - height4;
            float f4 = height4 / 2.0f;
            canvas.drawCircle(height3, height2, f / 2.0f, this.f101622b);
            canvas.save();
            canvas.rotate(45.0f, height3, height2);
            canvas.drawLine(f3, height2, f2, height2, this.f101623c);
            canvas.drawLine(height3, height2 - f4, height3, height2 + f4, this.f101623c);
            canvas.restore();
        }
        MethodCollector.m26664o(9382);
    }

    public /* synthetic */ C43585a(Context context, byte b) {
        this(context);
    }
}
