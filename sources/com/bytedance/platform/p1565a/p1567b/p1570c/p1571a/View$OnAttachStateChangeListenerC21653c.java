package com.bytedance.platform.p1565a.p1567b.p1570c.p1571a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1565a.p1566a.C21630g;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.a.b.c.a.c */
public final class View$OnAttachStateChangeListenerC21653c extends AbstractC21651a implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: c */
    public Application f51384c;

    /* renamed from: d */
    public Field f51385d;

    /* renamed from: e */
    private long f51386e;

    static {
        Covode.recordClassIndex(25294);
    }

    public final void onDraw() {
        m40605a("onDraw");
    }

    public final void onGlobalLayout() {
        m40605a("onGlobalLayout");
    }

    public final boolean onPreDraw() {
        m40605a("onPreDraw");
        return true;
    }

    public final void onScrollChanged() {
        m40605a("onScrollChanged");
    }

    public final void onActivityDestroyed(Activity activity) {
        m40605a("onActivityDestroyed");
    }

    public final void onActivityPaused(Activity activity) {
        m40605a("onActivityPaused");
    }

    public final void onActivityResumed(Activity activity) {
        m40605a("onActivityResumed");
    }

    public final void onActivityStopped(Activity activity) {
        m40605a("onActivityStopped");
    }

    public final void onTouchModeChanged(boolean z) {
        m40605a("onTouchModeChanged");
    }

    public final void onViewAttachedToWindow(View view) {
        m40605a("onViewAttachedToWindow");
    }

    public final void onViewDetachedFromWindow(View view) {
        m40605a("onViewDetachedFromWindow");
    }

    /* renamed from: a */
    private void m40605a(String str) {
        if (this.f51383b != null && System.currentTimeMillis() - this.f51386e > 1000) {
            this.f51383b.mo35299a();
            this.f51386e = System.currentTimeMillis();
            "notifyCallback form method = ".concat(String.valueOf(str));
            C21630g.m40583a(C21630g.EnumC21632a.ERROR);
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f51385d != null) {
            try {
                View decorView = activity.getWindow().getDecorView();
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                viewTreeObserver.addOnDrawListener(this);
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnPreDrawListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
                viewTreeObserver.addOnTouchModeChangeListener(this);
                decorView.addOnAttachStateChangeListener(this);
                decorView.addOnLayoutChangeListener(this);
            } catch (Throwable unused) {
            }
        }
    }

    public View$OnAttachStateChangeListenerC21653c(Application application, AbstractC21652b bVar) {
        super("PerformTraversalsHook", bVar);
        this.f51384c = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m40605a("onActivityCreated");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m40605a("onActivitySaveInstanceState");
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        m40605a("onGlobalFocusChanged");
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m40605a("onLayoutChange");
    }
}
