package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.C0792v;
import androidx.customview.p040a.C0827a;
import com.bytedance.covode.number.Covode;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    C0827a f62792a;

    /* renamed from: b */
    public AbstractC26587a f62793b;

    /* renamed from: c */
    public int f62794c = 2;

    /* renamed from: d */
    float f62795d = 0.5f;

    /* renamed from: e */
    public float f62796e;

    /* renamed from: f */
    public float f62797f = 0.5f;

    /* renamed from: g */
    private boolean f62798g;

    /* renamed from: h */
    private float f62799h;

    /* renamed from: i */
    private boolean f62800i;

    /* renamed from: j */
    private final C0827a.AbstractC0830a f62801j = new C0827a.AbstractC0830a() {
        /* class com.google.android.material.behavior.SwipeDismissBehavior.C265861 */

        /* renamed from: b */
        private int f62803b;

        /* renamed from: c */
        private int f62804c = -1;

        static {
            Covode.recordClassIndex(32025);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3030a(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (SwipeDismissBehavior.this.f62793b != null) {
                SwipeDismissBehavior.this.f62793b.mo43868a(i);
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final boolean mo3039b(View view, int i) {
            if (this.f62804c != -1 || !SwipeDismissBehavior.this.mo43867a(view)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3036a(View view, int i) {
            this.f62804c = i;
            this.f62803b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: c */
        public final int mo3040c(View view, int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            if (C0792v.m2768e(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SwipeDismissBehavior.this.f62794c == 0) {
                if (z) {
                    i2 = this.f62803b - view.getWidth();
                    i4 = this.f62803b;
                } else {
                    i2 = this.f62803b;
                    i3 = view.getWidth();
                    i4 = i3 + i2;
                }
            } else if (SwipeDismissBehavior.this.f62794c != 1) {
                i2 = this.f62803b - view.getWidth();
                i4 = view.getWidth() + this.f62803b;
            } else if (z) {
                i2 = this.f62803b;
                i3 = view.getWidth();
                i4 = i3 + i2;
            } else {
                i2 = this.f62803b - view.getWidth();
                i4 = this.f62803b;
            }
            return Math.min(Math.max(i2, i), i4);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
            if (java.lang.Math.abs(r2) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f62802a.f62795d)) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3035a(android.view.View r8, float r9, float r10) {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C265861.mo3035a(android.view.View, float, float):void");
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f62803b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f62796e);
            float width2 = ((float) this.f62803b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f62797f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m52704a(1.0f - ((f - width) / (width2 - width))));
            }
        }
    };

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public interface AbstractC26587a {
        static {
            Covode.recordClassIndex(32026);
        }

        /* renamed from: a */
        void mo43868a(int i);

        /* renamed from: a */
        void mo43869a(View view);
    }

    static {
        Covode.recordClassIndex(32024);
    }

    /* renamed from: a */
    public boolean mo43867a(View view) {
        return true;
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class RunnableC26588b implements Runnable {

        /* renamed from: b */
        private final View f62806b;

        /* renamed from: c */
        private final boolean f62807c;

        static {
            Covode.recordClassIndex(32027);
        }

        public final void run() {
            if (SwipeDismissBehavior.this.f62792a != null && SwipeDismissBehavior.this.f62792a.mo3027c()) {
                C0792v.m2750a(this.f62806b, this);
            } else if (this.f62807c && SwipeDismissBehavior.this.f62793b != null) {
                SwipeDismissBehavior.this.f62793b.mo43869a(this.f62806b);
            }
        }

        RunnableC26588b(View view, boolean z) {
            this.f62806b = view;
            this.f62807c = z;
        }
    }

    /* renamed from: a */
    public static float m52704a(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2532b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0827a aVar = this.f62792a;
        if (aVar == null) {
            return false;
        }
        aVar.mo3026b(motionEvent);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0827a a;
        boolean z = this.f62798g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2473a(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f62798g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f62798g = false;
        }
        if (!z) {
            return false;
        }
        if (this.f62792a == null) {
            if (this.f62800i) {
                a = C0827a.m2923a(coordinatorLayout, this.f62799h, this.f62801j);
            } else {
                a = C0827a.m2924a(coordinatorLayout, this.f62801j);
            }
            this.f62792a = a;
        }
        return this.f62792a.mo3021a(motionEvent);
    }
}
