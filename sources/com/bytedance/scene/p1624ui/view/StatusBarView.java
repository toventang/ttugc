package com.bytedance.scene.p1624ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.scene.ui.view.StatusBarView */
public final class StatusBarView extends View {

    /* renamed from: c */
    private static final int[] f52696c = {R.attr.ok};

    /* renamed from: a */
    public C0753ad f52697a;

    /* renamed from: b */
    public final Runnable f52698b = new Runnable() {
        /* class com.bytedance.scene.p1624ui.view.StatusBarView.RunnableC222791 */

        static {
            Covode.recordClassIndex(26095);
        }

        public final void run() {
            StatusBarView.this.requestLayout();
        }
    };

    /* renamed from: d */
    private boolean f52699d = true;

    /* renamed from: e */
    private Drawable f52700e;

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.f52700e;
    }

    static {
        Covode.recordClassIndex(26094);
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f52700e = drawable;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.f52700e = new ColorDrawable(i);
        invalidate();
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0643b.m2369a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f52700e = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C0753ad adVar;
        int b;
        MethodCollector.m26663i(4321);
        super.onDraw(canvas);
        if (this.f52699d && this.f52700e != null && Build.VERSION.SDK_INT >= 21 && (adVar = this.f52697a) != null && (b = adVar.mo2867b()) > 0) {
            this.f52700e.setBounds(0, 0, getWidth(), b);
            this.f52700e.draw(canvas);
        }
        MethodCollector.m26664o(4321);
    }

    /* renamed from: a */
    private static int m41956a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    /* renamed from: b */
    private void m41957b(int i, int i2) {
        setMeasuredDimension(m41956a(getSuggestedMinimumWidth(), i), m41956a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C0753ad adVar = this.f52697a;
        if (adVar != null) {
            m41957b(i, View.MeasureSpec.makeMeasureSpec(adVar.mo2867b(), 1073741824));
        } else {
            m41957b(i, i2);
        }
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(4195);
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.bytedance.scene.p1624ui.view.StatusBarView.C222802 */

            static {
                Covode.recordClassIndex(26096);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                if (StatusBarView.this.getVisibility() == 8) {
                    StatusBarView.this.f52697a = null;
                    return adVar;
                }
                if (!new C0753ad(adVar).equals(StatusBarView.this.f52697a)) {
                    StatusBarView.this.f52697a = new C0753ad(adVar);
                    StatusBarView statusBarView = StatusBarView.this;
                    statusBarView.post(statusBarView.f52698b);
                }
                return new C0753ad(adVar).mo2866a(adVar.mo2865a(), 0, adVar.mo2868c(), adVar.mo2869d());
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f52696c);
        try {
            this.f52700e = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            C0792v.m2739a(this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
            MethodCollector.m26664o(4195);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(4195);
            throw th;
        }
    }
}
