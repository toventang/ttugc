package com.bytedance.hybrid.spark.p1111e;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.hybrid.spark.e.a */
public final class ViewTreeObserver$OnGlobalLayoutListenerC15571a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private WeakReference<View> f37951a;

    /* renamed from: b */
    private ViewTreeObserver f37952b;

    /* renamed from: c */
    private int f37953c;

    /* renamed from: d */
    private ViewGroup.LayoutParams f37954d;

    static {
        Covode.recordClassIndex(17833);
    }

    public final void onGlobalLayout() {
        int i;
        WindowInsets rootWindowInsets;
        View view = this.f37951a.get();
        if (view != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            if (Build.VERSION.SDK_INT < 23 || (rootWindowInsets = view.getRootWindowInsets()) == null || rootWindowInsets.getStableInsetTop() == rect.top || rootWindowInsets.getStableInsetTop() >= rect.top) {
                i = rect.bottom;
            } else {
                i = rect.bottom - (rect.top - rootWindowInsets.getStableInsetTop());
            }
            if (i != this.f37953c) {
                this.f37954d.height = i;
                view.setLayoutParams(this.f37954d);
                view.getClass();
                view.post(new RunnableC15572b(view));
                this.f37953c = i;
            }
        } else if (this.f37952b.isAlive()) {
            this.f37952b.removeGlobalOnLayoutListener(this);
        }
    }

    public ViewTreeObserver$OnGlobalLayoutListenerC15571a(View view) {
        if (view != null) {
            this.f37951a = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f37952b = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this);
            this.f37954d = view.getLayoutParams();
        }
    }
}
