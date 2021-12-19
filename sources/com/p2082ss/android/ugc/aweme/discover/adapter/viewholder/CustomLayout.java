package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout */
public class CustomLayout extends ViewGroup {

    /* renamed from: a */
    float f97385a;

    /* renamed from: b */
    int f97386b;

    /* renamed from: c */
    boolean f97387c;

    /* renamed from: d */
    private int f97388d;

    /* renamed from: e */
    private int f97389e;

    /* renamed from: f */
    private AbstractC41748a f97390f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.CustomLayout$a */
    public interface AbstractC41748a {
        static {
            Covode.recordClassIndex(49662);
        }

        /* renamed from: a */
        void mo70929a();
    }

    static {
        Covode.recordClassIndex(49661);
    }

    public void setOnSecondViewControlListener(AbstractC41748a aVar) {
        this.f97390f = aVar;
    }

    public CustomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(8146);
        MethodCollector.m26664o(8146);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC41748a aVar;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        if (childCount != 2) {
            throw new RuntimeException("CustomLayout child count must is 2");
        } else if (getChildAt(0) instanceof TextView) {
            TextView textView = (TextView) getChildAt(0);
            mo70925a(textView.getText(), size, textView.getPaint());
            View childAt = getChildAt(1);
            if (this.f97386b > textView.getMaxLines() && (aVar = this.f97390f) != null) {
                aVar.mo70929a();
            }
            measureChildren(i, i2);
            if (textView.getMeasuredWidth() + childAt.getMeasuredWidth() <= size) {
                setMeasuredDimension(textView.getMeasuredWidth() + childAt.getMeasuredWidth(), Math.max(textView.getMeasuredHeight(), childAt.getMeasuredHeight()));
                this.f97388d = 1;
            } else if (getChildAt(0) instanceof TextView) {
                float f = (float) size;
                if (this.f97385a + ((float) childAt.getMeasuredWidth()) > f && this.f97386b >= textView.getMaxLines()) {
                    setMeasuredDimension(textView.getMeasuredWidth(), textView.getMeasuredHeight());
                    this.f97388d = 3;
                } else if (this.f97385a + ((float) childAt.getMeasuredWidth()) <= f || this.f97386b >= textView.getMaxLines() || !this.f97387c) {
                    setMeasuredDimension(textView.getMeasuredWidth(), Math.max(textView.getMeasuredHeight(), this.f97389e + childAt.getMeasuredHeight()));
                    this.f97388d = 2;
                } else {
                    setMeasuredDimension(textView.getMeasuredWidth(), textView.getMeasuredHeight() + childAt.getMeasuredHeight());
                    this.f97388d = 2;
                }
            }
        } else {
            throw new RuntimeException("CustomLayout first child view not a TextView");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70925a(CharSequence charSequence, int i, TextPaint textPaint) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        this.f97386b = lineCount;
        this.f97389e = staticLayout.getLineTop(lineCount - 1);
        this.f97385a = staticLayout.getLineRight(this.f97386b - 1);
        this.f97387c = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.f97388d;
        if (i5 == 1 || i5 == 2) {
            TextView textView = (TextView) getChildAt(0);
            View childAt = getChildAt(1);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            int i6 = (int) this.f97385a;
            int i7 = this.f97389e;
            int bottom = (textView.getBottom() - textView.getPaddingBottom()) - this.f97389e;
            if (childAt.getMeasuredHeight() < bottom) {
                i7 = this.f97389e + ((bottom - childAt.getMeasuredHeight()) / 2);
            }
            childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
        } else if (i5 == 3) {
            View childAt2 = getChildAt(0);
            getChildAt(1);
            childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
            AbstractC41748a aVar = this.f97390f;
            if (aVar != null) {
                aVar.mo70929a();
            }
        }
    }
}
