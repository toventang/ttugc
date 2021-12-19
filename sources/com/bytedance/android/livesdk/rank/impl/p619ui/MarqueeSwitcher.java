package com.bytedance.android.livesdk.rank.impl.p619ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ui.MarqueeSwitcher */
public class MarqueeSwitcher extends TextSwitcher {

    /* renamed from: a */
    private int f25396a;

    /* renamed from: b */
    private TimeInterpolator f25397b = new LinearInterpolator();

    /* renamed from: c */
    private boolean f25398c = true;

    static {
        Covode.recordClassIndex(12129);
    }

    public int getDisplayedChild() {
        return this.f25396a;
    }

    public View getCurrentView() {
        return getChildAt(this.f25396a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    public void showNext() {
        setDisplayedChild(this.f25396a + 1);
    }

    public void showPrevious() {
        setDisplayedChild(this.f25396a - 1);
    }

    public View getNextView() {
        return getChildAt(1 - this.f25396a);
    }

    public void reset() {
        this.f25398c = true;
        MarqueeTextView marqueeTextView = (MarqueeTextView) getChildAt(this.f25396a);
        marqueeTextView.mo17391b();
        marqueeTextView.animate().cancel();
        marqueeTextView.setAlpha(0.0f);
        MarqueeTextView marqueeTextView2 = (MarqueeTextView) getChildAt(1 - this.f25396a);
        marqueeTextView2.mo17391b();
        marqueeTextView2.animate().cancel();
        marqueeTextView2.setAlpha(0.0f);
    }

    public void setDisplayedChild(int i) {
        MarqueeTextView marqueeTextView = (MarqueeTextView) getChildAt(this.f25396a);
        MarqueeTextView marqueeTextView2 = (MarqueeTextView) getChildAt(1 - this.f25396a);
        if (this.f25398c) {
            marqueeTextView2.setAlpha(1.0f);
            marqueeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            marqueeTextView2.setMarqueeRepeatLimit(-1);
            marqueeTextView2.mo796a();
            this.f25398c = false;
        } else {
            marqueeTextView.animate().cancel();
            marqueeTextView2.animate().cancel();
            marqueeTextView.animate().alpha(0.0f).setDuration(500).setInterpolator(this.f25397b).start();
            marqueeTextView2.animate().alpha(1.0f).setDuration(500).setInterpolator(this.f25397b).withEndAction(new RunnableC10553a(marqueeTextView, marqueeTextView2)).start();
        }
        this.f25396a = i;
        if (i >= getChildCount()) {
            this.f25396a = 0;
        } else if (i < 0) {
            this.f25396a = getChildCount() - 1;
        }
    }

    public MarqueeSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(800);
        MethodCollector.m26664o(800);
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.widget.TextSwitcher, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(1003);
        super.addView(view, i, layoutParams);
        view.setVisibility(0);
        view.setAlpha(0.0f);
        MethodCollector.m26664o(1003);
    }
}
