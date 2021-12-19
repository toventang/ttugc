package androidx.fragment.app;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.r */
public final class View$OnAttachStateChangeListenerC0992r implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f3530a;

    /* renamed from: b */
    private ViewTreeObserver f3531b;

    /* renamed from: c */
    private final Runnable f3532c;

    static {
        Covode.recordClassIndex(1085);
    }

    public final boolean onPreDraw() {
        m3453a();
        this.f3532c.run();
        return true;
    }

    /* renamed from: a */
    private void m3453a() {
        if (this.f3531b.isAlive()) {
            this.f3531b.removeOnPreDrawListener(this);
        } else {
            this.f3530a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3530a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        m3453a();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f3531b = view.getViewTreeObserver();
    }

    private View$OnAttachStateChangeListenerC0992r(View view, Runnable runnable) {
        this.f3530a = view;
        this.f3531b = view.getViewTreeObserver();
        this.f3532c = runnable;
    }

    /* renamed from: a */
    public static View$OnAttachStateChangeListenerC0992r m3452a(View view, Runnable runnable) {
        View$OnAttachStateChangeListenerC0992r rVar = new View$OnAttachStateChangeListenerC0992r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }
}
