package com.bytedance.android.livesdk.rank.impl.p619ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ui.MarqueeTextView */
public class MarqueeTextView extends LiveTextView {

    /* renamed from: a */
    private boolean f25399a = true;

    static {
        Covode.recordClassIndex(12130);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        return 0.0f;
    }

    public void onWindowFocusChanged(boolean z) {
    }

    /* renamed from: a */
    public final void mo796a() {
        this.f25399a = false;
        setSelected(true);
    }

    /* renamed from: b */
    public final void mo17391b() {
        this.f25399a = true;
        setSelected(false);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f25399a && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setSelected(true);
        }
    }
}
