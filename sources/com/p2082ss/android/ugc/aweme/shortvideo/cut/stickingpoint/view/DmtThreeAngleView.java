package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView */
public final class DmtThreeAngleView extends View {

    /* renamed from: a */
    public static final C70485a f157505a = new C70485a((byte) 0);

    /* renamed from: b */
    private int f157506b;

    /* renamed from: c */
    private int f157507c;

    /* renamed from: d */
    private int f157508d;

    /* renamed from: e */
    private final Paint f157509e;

    /* renamed from: f */
    private final Path f157510f;

    static {
        Covode.recordClassIndex(82929);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView$a */
    public static final class C70485a {
        static {
            Covode.recordClassIndex(82930);
        }

        private C70485a() {
        }

        public /* synthetic */ C70485a(byte b) {
            this();
        }
    }

    public final void setOrientation(int i) {
        this.f157508d = i;
    }

    public final void setBgColor(int i) {
        this.f157509e.setColor(i);
    }

    public final void setRoundRadius(int i) {
        this.f157509e.setPathEffect(new CornerPathEffect((float) i));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        int i = this.f157508d;
        if (i == 1) {
            this.f157510f.moveTo(0.0f, (float) this.f157507c);
            this.f157510f.lineTo((float) (this.f157506b / 2), 0.0f);
            this.f157510f.lineTo((float) this.f157506b, (float) this.f157507c);
            this.f157510f.lineTo((float) this.f157506b, (float) this.f157507c);
            this.f157510f.lineTo(0.0f, (float) this.f157507c);
            this.f157510f.lineTo(0.0f, (float) this.f157507c);
        } else if (i == 2) {
            this.f157510f.moveTo(0.0f, 0.0f);
            this.f157510f.lineTo((float) (this.f157506b / 2), (float) this.f157507c);
            this.f157510f.lineTo((float) this.f157506b, (float) this.f157507c);
            this.f157510f.lineTo(0.0f, 0.0f);
        } else if (i == 3) {
            this.f157510f.moveTo((float) this.f157506b, 0.0f);
            this.f157510f.lineTo((float) this.f157506b, (float) this.f157507c);
            this.f157510f.lineTo(0.0f, (float) (this.f157507c / 2));
            this.f157510f.lineTo((float) this.f157506b, 0.0f);
        } else if (i == 4) {
            this.f157510f.moveTo(0.0f, 0.0f);
            this.f157510f.lineTo((float) this.f157506b, (float) (this.f157507c / 2));
            this.f157510f.lineTo(0.0f, (float) this.f157507c);
            this.f157510f.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.f157510f, this.f157509e);
    }

    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12125);
        super.onMeasure(i, i2);
        this.f157506b = View.MeasureSpec.getSize(i);
        this.f157507c = View.MeasureSpec.getSize(i2);
        MethodCollector.m26664o(12125);
    }

    private /* synthetic */ DmtThreeAngleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtThreeAngleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12262);
        this.f157508d = 1;
        Paint paint = new Paint();
        this.f157509e = paint;
        this.f157510f = new Path();
        paint.setAntiAlias(true);
        MethodCollector.m26664o(12262);
    }
}
