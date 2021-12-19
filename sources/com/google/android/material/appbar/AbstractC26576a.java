package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.appbar.a */
public abstract class AbstractC26576a<V extends View> extends C26579c<V> {

    /* renamed from: a */
    private Runnable f62734a;

    /* renamed from: b */
    OverScroller f62735b;

    /* renamed from: c */
    private boolean f62736c;

    /* renamed from: d */
    private int f62737d = -1;

    /* renamed from: e */
    private int f62738e;

    /* renamed from: f */
    private int f62739f = -1;

    /* renamed from: g */
    private VelocityTracker f62740g;

    static {
        Covode.recordClassIndex(32013);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo43748b(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo43749c(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43746b() {
        return mo43755c();
    }

    public AbstractC26576a() {
    }

    /* renamed from: d */
    private void m52666d() {
        if (this.f62740g == null) {
            this.f62740g = VelocityTracker.obtain();
        }
    }

    /* renamed from: com.google.android.material.appbar.a$a */
    class RunnableC26577a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f62742b;

        /* renamed from: c */
        private final V f62743c;

        static {
            Covode.recordClassIndex(32014);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.appbar.a */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.material.appbar.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            if (this.f62743c != null && AbstractC26576a.this.f62735b != null) {
                if (AbstractC26576a.this.f62735b.computeScrollOffset()) {
                    AbstractC26576a aVar = AbstractC26576a.this;
                    aVar.mo43816b(this.f62742b, this.f62743c, aVar.f62735b.getCurrY());
                    C0792v.m2750a(this.f62743c, this);
                    return;
                }
                AbstractC26576a.this.mo43748b(this.f62742b, this.f62743c);
            }
        }

        RunnableC26577a(CoordinatorLayout coordinatorLayout, V v) {
            this.f62742b = coordinatorLayout;
            this.f62743c = v;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo43739a(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43747b(V v) {
        return -v.getHeight();
    }

    public AbstractC26576a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43816b(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo43740a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 3) goto L_0x002e;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC26576a.mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r9 != 3) goto L_0x002d;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout r22, V r23, android.view.MotionEvent r24) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC26576a.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo43740a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int a;
        int c = mo43755c();
        if (i2 == 0 || c < i2 || c > i3 || c == (a = C0622a.m2312a(i, i2, i3))) {
            return 0;
        }
        mo43754b(a);
        return c - a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43817b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo43740a(coordinatorLayout, v, mo43746b() - i, i2, i3);
    }
}
