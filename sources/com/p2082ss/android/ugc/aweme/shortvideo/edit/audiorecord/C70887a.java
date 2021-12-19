package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.a */
public final class C70887a extends View {

    /* renamed from: e */
    public static final C70888a f158702e = new C70888a((byte) 0);

    /* renamed from: a */
    int f158703a = -1;

    /* renamed from: b */
    Paint f158704b = new Paint();

    /* renamed from: c */
    int f158705c = 1;

    /* renamed from: d */
    float f158706d = 1.0f;

    /* renamed from: f */
    private final Stack<Point> f158707f = new Stack<>();

    static {
        Covode.recordClassIndex(83381);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.a$a */
    public static final class C70888a {
        static {
            Covode.recordClassIndex(83382);
        }

        private C70888a() {
        }

        public /* synthetic */ C70888a(byte b) {
            this();
        }
    }

    public final int getMMax() {
        return this.f158705c;
    }

    public final Stack<Point> getMStack() {
        return this.f158707f;
    }

    public final float getPadding() {
        return this.f158706d;
    }

    public final void setMMax(int i) {
        this.f158705c = i;
    }

    public final void setPadding(float f) {
        this.f158706d = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70887a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11368);
        setBackgroundResource(R.drawable.qp);
        MethodCollector.m26664o(11368);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(11365);
        super.onDraw(canvas);
        for (T t : this.f158707f) {
            double x = (double) t.getX();
            double d = (double) this.f158705c;
            Double.isNaN(x);
            Double.isNaN(d);
            double d2 = x / d;
            double width = (double) getWidth();
            Double.isNaN(width);
            float f = (float) (d2 * width);
            double y = (double) t.getY();
            double d3 = (double) this.f158705c;
            Double.isNaN(y);
            Double.isNaN(d3);
            double d4 = y / d3;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            float f2 = (float) (d4 * width2);
            if (canvas != null) {
                canvas.drawRect(f, 0.0f, f2, (float) getHeight(), this.f158704b);
            }
        }
        MethodCollector.m26664o(11365);
    }
}
