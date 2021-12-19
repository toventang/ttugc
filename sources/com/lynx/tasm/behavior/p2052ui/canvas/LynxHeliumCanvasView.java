package com.lynx.tasm.behavior.p2052ui.canvas;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvasView */
public class LynxHeliumCanvasView extends TextureView {
    private WeakReference<LynxHeliumCanvas> canvasUI;
    private boolean mConsumeAllEvents;

    static {
        Covode.recordClassIndex(34657);
    }

    public LynxHeliumCanvas getCanvasUI() {
        WeakReference<LynxHeliumCanvas> weakReference = this.canvasUI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LynxHelium.getInstance().onLynxCanvasAttatch(getCanvasUI());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LynxHelium.getInstance().onLynxCanvasDetach(getCanvasUI());
    }

    public void setConsumeAllEvents(boolean z) {
        this.mConsumeAllEvents = z;
    }

    public void setCanvasUI(LynxHeliumCanvas lynxHeliumCanvas) {
        this.canvasUI = new WeakReference<>(lynxHeliumCanvas);
    }

    public LynxHeliumCanvasView(Context context) {
        super(context);
        MethodCollector.m26663i(1595);
        MethodCollector.m26664o(1595);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(this.mConsumeAllEvents);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            LLog.m56856a(5, "LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setBackgroundDrawable(null);
    }

    public void setForeground(Drawable drawable) {
        if (drawable != null) {
            LLog.m56856a(5, "LynxHeliumCanvasView", "TextureView doesn't support displaying a foreground drawable");
        }
        super.setForeground(null);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(1599);
        MethodCollector.m26664o(1599);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(1604);
        MethodCollector.m26664o(1604);
    }

    public LynxHeliumCanvasView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m26663i(1606);
        MethodCollector.m26664o(1606);
    }
}
