package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.audiorecord.Point;
import com.p2082ss.android.ugc.trill.R;
import java.util.Stack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.a */
public final class C52011a extends View {

    /* renamed from: e */
    public static final C52012a f119816e = new C52012a((byte) 0);

    /* renamed from: a */
    int f119817a = -1;

    /* renamed from: b */
    Paint f119818b = new Paint();

    /* renamed from: c */
    int f119819c = 1;

    /* renamed from: d */
    float f119820d = 1.0f;

    /* renamed from: f */
    private final Stack<Point> f119821f = new Stack<>();

    static {
        Covode.recordClassIndex(61386);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.a$a */
    public static final class C52012a {
        static {
            Covode.recordClassIndex(61387);
        }

        private C52012a() {
        }

        public /* synthetic */ C52012a(byte b) {
            this();
        }
    }

    public final int getMMax() {
        return this.f119819c;
    }

    public final Stack<Point> getMStack() {
        return this.f119821f;
    }

    public final float getPadding() {
        return this.f119820d;
    }

    public final void setMMax(int i) {
        this.f119819c = i;
    }

    public final void setPadding(float f) {
        this.f119820d = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52011a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12491);
        setBackgroundResource(R.drawable.qp);
        MethodCollector.m26664o(12491);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(12365);
        super.onDraw(canvas);
        for (T t : this.f119821f) {
            double x = (double) t.getX();
            double d = (double) this.f119819c;
            Double.isNaN(x);
            Double.isNaN(d);
            double d2 = x / d;
            double width = (double) getWidth();
            Double.isNaN(width);
            float f = (float) (d2 * width);
            double y = (double) t.getY();
            double d3 = (double) this.f119819c;
            Double.isNaN(y);
            Double.isNaN(d3);
            double d4 = y / d3;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            float f2 = (float) (d4 * width2);
            if (canvas != null) {
                canvas.drawRect(f, 0.0f, f2, (float) getHeight(), this.f119818b);
            }
        }
        MethodCollector.m26664o(12365);
    }
}
