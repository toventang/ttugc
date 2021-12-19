package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView */
public final class DmtPlusView extends View {

    /* renamed from: a */
    private final Paint f157498a;

    /* renamed from: b */
    private int f157499b;

    /* renamed from: c */
    private int f157500c;

    /* renamed from: d */
    private int f157501d;

    /* renamed from: e */
    private int f157502e;

    /* renamed from: f */
    private final RectF f157503f;

    /* renamed from: g */
    private final RectF f157504g;

    static {
        Covode.recordClassIndex(82928);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setBgColor(int i) {
        this.f157498a.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        RectF rectF = this.f157503f;
        int i = this.f157499b;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f157498a);
        RectF rectF2 = this.f157504g;
        int i2 = this.f157499b;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f157498a);
    }

    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13047);
        super.onMeasure(i, i2);
        this.f157501d = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f157502e = size;
        RectF rectF = this.f157503f;
        int i3 = this.f157500c;
        rectF.set(0.0f, (float) ((size - i3) / 2), (float) this.f157501d, (float) ((size + i3) / 2));
        RectF rectF2 = this.f157504g;
        int i4 = this.f157501d;
        int i5 = this.f157500c;
        rectF2.set((float) ((i4 - i5) / 2), 0.0f, (float) ((i4 + i5) / 2), (float) this.f157502e);
        MethodCollector.m26664o(13047);
    }

    private /* synthetic */ DmtPlusView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtPlusView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13049);
        Paint paint = new Paint();
        this.f157498a = paint;
        this.f157503f = new RectF();
        this.f157504g = new RectF();
        paint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f157499b = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            this.f157500c = (int) obtainStyledAttributes.getDimension(23, 0.0f);
        }
        MethodCollector.m26664o(13049);
    }
}
