package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class SnackbarContentLayout extends LinearLayout implements AbstractC26708a {

    /* renamed from: a */
    private TextView f63272a;

    /* renamed from: b */
    private Button f63273b;

    /* renamed from: c */
    private int f63274c;

    /* renamed from: d */
    private int f63275d;

    static {
        Covode.recordClassIndex(32170);
    }

    public Button getActionView() {
        return this.f63273b;
    }

    public TextView getMessageView() {
        return this.f63272a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f63272a = (TextView) findViewById(R.id.e3u);
        this.f63273b = (Button) findViewById(R.id.e3t);
    }

    @Override // com.google.android.material.snackbar.AbstractC26708a
    /* renamed from: a */
    public final void mo44249a() {
        this.f63272a.setAlpha(0.0f);
        this.f63272a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f63273b.getVisibility() == 0) {
            this.f63273b.setAlpha(0.0f);
            this.f63273b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    @Override // com.google.android.material.snackbar.AbstractC26708a
    /* renamed from: b */
    public final void mo44250b() {
        this.f63272a.setAlpha(1.0f);
        this.f63272a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f63273b.getVisibility() == 0) {
            this.f63273b.setAlpha(1.0f);
            this.f63273b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12509);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.sf, R.attr.a50});
        this.f63274c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f63275d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(12509);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (m53024a(1, r5, r5 - r4) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (m53024a(0, r5, r5) == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private static void m53023a(View view, int i, int i2) {
        if (C0792v.m2783q(view)) {
            C0792v.m2741a(view, C0792v.m2770f(view), i, C0792v.m2772g(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m53024a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f63272a.getPaddingTop() == i2 && this.f63272a.getPaddingBottom() == i3) {
            return z;
        }
        m53023a(this.f63272a, i2, i3);
        return true;
    }
}
