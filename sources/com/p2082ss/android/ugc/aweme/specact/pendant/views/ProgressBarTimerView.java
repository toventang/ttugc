package com.p2082ss.android.ugc.aweme.specact.pendant.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.ProgressBarTimerView */
public final class ProgressBarTimerView extends View {

    /* renamed from: a */
    public static final C75087a f168758a = new C75087a((byte) 0);

    /* renamed from: b */
    private float f168759b;

    /* renamed from: c */
    private int f168760c;

    /* renamed from: d */
    private int f168761d;

    /* renamed from: e */
    private int f168762e;

    /* renamed from: f */
    private float f168763f;

    /* renamed from: g */
    private float f168764g;

    /* renamed from: h */
    private Paint f168765h;

    /* renamed from: i */
    private SweepGradient f168766i;

    /* renamed from: j */
    private RectF f168767j;

    /* renamed from: k */
    private float f168768k;

    static {
        Covode.recordClassIndex(87959);
    }

    public ProgressBarTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.ProgressBarTimerView$a */
    public static final class C75087a {
        static {
            Covode.recordClassIndex(87960);
        }

        private C75087a() {
        }

        public /* synthetic */ C75087a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return (int) C13628n.m24520b(getContext(), 25.0f);
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return (int) C13628n.m24520b(getContext(), 25.0f);
    }

    /* renamed from: a */
    public final void mo118188a(float f) {
        this.f168768k = this.f168764g * f;
        invalidate();
    }

    public final void setProgressForegroundColor(List<String> list) {
        C89219l.m154721d(list, "");
        try {
            if (list.size() > 1) {
                this.f168760c = Color.parseColor(list.get(0));
                this.f168761d = Color.parseColor(list.get(1));
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(11078);
        super.onDraw(canvas);
        if (this.f168766i == null) {
            SweepGradient sweepGradient = new SweepGradient(0.0f, (float) getMeasuredHeight(), this.f168760c, this.f168761d);
            this.f168766i = sweepGradient;
            this.f168765h.setShader(sweepGradient);
        }
        float f = this.f168759b / 2.0f;
        this.f168767j.left = f;
        this.f168767j.top = f;
        this.f168767j.right = ((float) getMeasuredWidth()) - f;
        this.f168767j.bottom = ((float) getMeasuredHeight()) - f;
        float f2 = this.f168768k;
        if (f2 > this.f168764g || canvas == null) {
            MethodCollector.m26664o(11078);
            return;
        }
        canvas.drawArc(this.f168767j, this.f168763f, f2, false, this.f168765h);
        MethodCollector.m26664o(11078);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10932);
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (mode == Integer.MIN_VALUE) {
            size = Math.max(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), size);
        } else if (mode == 0) {
            size = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        } else if (mode != 1073741824) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), size2);
        } else if (mode2 == 0) {
            i3 = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        } else if (mode2 == 1073741824) {
            i3 = size2;
        }
        setMeasuredDimension(size, i3);
        MethodCollector.m26664o(10932);
    }

    private /* synthetic */ ProgressBarTimerView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProgressBarTimerView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11229);
        this.f168763f = -90.0f;
        this.f168765h = new Paint(1);
        this.f168767j = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a7z, R.attr.a80, R.attr.a81, R.attr.a83, R.attr.a84, R.attr.a86}, 0, 0);
        try {
            this.f168759b = obtainStyledAttributes.getDimension(5, 0.0f);
            this.f168760c = obtainStyledAttributes.getColor(4, 0);
            this.f168761d = obtainStyledAttributes.getColor(3, 0);
            this.f168762e = obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
            this.f168765h.setStrokeWidth(this.f168759b);
            this.f168765h.setStyle(Paint.Style.STROKE);
            this.f168765h.setStrokeCap(Paint.Cap.ROUND);
            this.f168763f = -90.0f;
            this.f168764g = 360.0f;
            MethodCollector.m26664o(11229);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(11229);
            throw th;
        }
    }
}
