package com.bytedance.android.live.core.p218f.p219a;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.a.b */
public final class C3892b {
    static {
        Covode.recordClassIndex(4421);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.f.a.b$a */
    public static class View$OnAttachStateChangeListenerC3893a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        private View f10780a;

        /* renamed from: b */
        private View.OnAttachStateChangeListener f10781b;

        /* renamed from: c */
        private boolean f10782c;

        /* renamed from: d */
        private boolean f10783d = false;

        static {
            Covode.recordClassIndex(4422);
        }

        public final boolean onPreDraw() {
            m9519a();
            return true;
        }

        /* renamed from: a */
        private void m9519a() {
            boolean b = m9521b();
            if (this.f10783d != b) {
                this.f10783d = b;
                if (b) {
                    this.f10781b.onViewAttachedToWindow(this.f10780a);
                } else {
                    this.f10781b.onViewDetachedFromWindow(this.f10780a);
                }
            }
        }

        /* renamed from: b */
        private boolean m9521b() {
            if (!this.f10782c) {
                return false;
            }
            View view = this.f10780a;
            while (true) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
            if (view == this.f10780a.getRootView()) {
                return true;
            }
            return false;
        }

        public final void onViewAttachedToWindow(View view) {
            if (!this.f10782c) {
                this.f10782c = true;
                this.f10780a.getViewTreeObserver().addOnPreDrawListener(this);
                m9519a();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f10782c) {
                this.f10782c = false;
                this.f10780a.getViewTreeObserver().removeOnPreDrawListener(this);
                m9519a();
            }
        }

        /* renamed from: a */
        public static void m9520a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            new View$OnAttachStateChangeListenerC3893a(view, onAttachStateChangeListener);
        }

        private View$OnAttachStateChangeListenerC3893a(View view, View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f10780a = view;
            this.f10781b = onAttachStateChangeListener;
            int i = Build.VERSION.SDK_INT;
            boolean isAttachedToWindow = view.isAttachedToWindow();
            this.f10782c = isAttachedToWindow;
            if (isAttachedToWindow) {
                this.f10780a.getViewTreeObserver().addOnPreDrawListener(this);
            }
            this.f10780a.addOnAttachStateChangeListener(this);
            m9519a();
        }
    }
}
