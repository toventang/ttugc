package com.p2082ss.bytertc.engine.p4399ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.ui.SurfaceViewRenderer */
public class SurfaceViewRenderer extends RTCSurfaceView {
    static {
        Covode.recordClassIndex(101127);
    }

    public void release() {
        super.onDispose();
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
