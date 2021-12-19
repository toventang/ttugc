package com.google.android.material.snackbar;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: j */
    public static final int[] f63269j = {R.attr.acu};

    /* renamed from: k */
    private final AccessibilityManager f63270k;

    /* renamed from: l */
    private boolean f63271l;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: b */
    public final void mo44222b() {
        super.mo44222b();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: c */
    public final void mo44223c() {
        super.mo44223c();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: d */
    public final boolean mo44224d() {
        return super.mo44224d();
    }

    static {
        Covode.recordClassIndex(32168);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: a */
    public final int mo44220a() {
        if (!this.f63271l || !this.f63270k.isTouchExplorationEnabled()) {
            return super.mo44220a();
        }
        return -2;
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.C26706d {
        static {
            Covode.recordClassIndex(32169);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: a */
    private static Object m53018a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12828);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(12828);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public Snackbar(ViewGroup viewGroup, View view, AbstractC26708a aVar) {
        super(viewGroup, view, aVar);
        this.f63270k = (AccessibilityManager) m53018a(viewGroup.getContext(), "accessibility");
    }
}
