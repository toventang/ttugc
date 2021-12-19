package com.p2082ss.bytertc.engine.p4399ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.ui.TextureViewRender */
public class TextureViewRender extends RTCSurfaceView {
    static {
        Covode.recordClassIndex(101128);
    }

    public void release() {
        super.onDispose();
    }

    public TextureViewRender(Context context) {
        super(context);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextureViewRender(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
