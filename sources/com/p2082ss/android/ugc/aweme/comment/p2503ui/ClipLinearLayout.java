package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ClipLinearLayout */
public class ClipLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f87132a;

    /* renamed from: b */
    private Path f87133b;

    static {
        Covode.recordClassIndex(44344);
    }

    public void setClipHeight(int i) {
        this.f87132a = i;
    }

    public ClipLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9065);
        if (this.f87132a >= 0) {
            this.f87133b.reset();
            this.f87133b.addRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) (getMeasuredHeight() - this.f87132a), Path.Direction.CW);
            canvas.clipPath(this.f87133b);
        }
        super.onDraw(canvas);
        MethodCollector.m26664o(9065);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ClipLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8912);
        this.f87132a = -1;
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.b2y);
        }
        this.f87133b = new Path();
        MethodCollector.m26664o(8912);
    }
}
