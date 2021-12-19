package com.bytedance.scene.p1624ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.scene.ui.view.NavigationBarView */
public final class NavigationBarView extends View {

    /* renamed from: a */
    public C0753ad f52690a;

    /* renamed from: b */
    public final Runnable f52691b = new Runnable() {
        /* class com.bytedance.scene.p1624ui.view.NavigationBarView.RunnableC222771 */

        static {
            Covode.recordClassIndex(26092);
        }

        public final void run() {
            NavigationBarView.this.requestLayout();
        }
    };

    /* renamed from: c */
    private boolean f52692c = true;

    /* renamed from: d */
    private Drawable f52693d;

    static {
        Covode.recordClassIndex(26091);
    }

    public final Drawable getNavigationBarBackgroundDrawable() {
        return this.f52693d;
    }

    public final void setNavigationBarBackground(Drawable drawable) {
        this.f52693d = drawable;
        invalidate();
    }

    public final void setNavigationBarBackgroundColor(int i) {
        this.f52693d = new ColorDrawable(i);
        invalidate();
    }

    public final void setNavigationBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0643b.m2369a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f52693d = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C0753ad adVar;
        int d;
        MethodCollector.m26663i(8163);
        super.onDraw(canvas);
        if (this.f52692c && this.f52693d != null && Build.VERSION.SDK_INT >= 21 && (adVar = this.f52690a) != null && (d = adVar.mo2869d()) > 0) {
            this.f52693d.setBounds(0, getHeight() - d, getWidth(), getHeight());
            this.f52693d.draw(canvas);
        }
        MethodCollector.m26664o(8163);
    }

    /* renamed from: a */
    private static int m41953a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    /* renamed from: b */
    private void m41954b(int i, int i2) {
        setMeasuredDimension(m41953a(getSuggestedMinimumWidth(), i), m41953a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C0753ad adVar = this.f52690a;
        if (adVar != null) {
            m41954b(i, View.MeasureSpec.makeMeasureSpec(adVar.mo2869d(), 1073741824));
        } else {
            m41954b(i, i2);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7870);
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.bytedance.scene.p1624ui.view.NavigationBarView.C222782 */

            static {
                Covode.recordClassIndex(26093);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                if (NavigationBarView.this.getVisibility() == 8) {
                    NavigationBarView.this.f52690a = null;
                    return adVar;
                }
                if (!new C0753ad(adVar).equals(NavigationBarView.this.f52690a)) {
                    NavigationBarView.this.f52690a = new C0753ad(adVar);
                    NavigationBarView navigationBarView = NavigationBarView.this;
                    navigationBarView.post(navigationBarView.f52691b);
                }
                return new C0753ad(adVar).mo2866a(adVar.mo2865a(), adVar.mo2867b(), adVar.mo2868c(), 0);
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843858});
            try {
                this.f52693d = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
                MethodCollector.m26664o(7870);
            }
        } else {
            MethodCollector.m26664o(7870);
        }
    }
}
