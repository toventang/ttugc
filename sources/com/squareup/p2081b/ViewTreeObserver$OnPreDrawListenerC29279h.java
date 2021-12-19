package com.squareup.p2081b;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.h */
public final class ViewTreeObserver$OnPreDrawListenerC29279h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final C29314x f69457a;

    /* renamed from: b */
    final WeakReference<ImageView> f69458b;

    /* renamed from: c */
    AbstractC29276e f69459c;

    static {
        Covode.recordClassIndex(35628);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51079a() {
        this.f69459c = null;
        ImageView imageView = this.f69458b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = this.f69458b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            C29314x xVar = this.f69457a;
            xVar.f69594b = false;
            xVar.f69593a.mo51130a(width, height);
            xVar.mo51134a(imageView, this.f69459c);
        }
        return true;
    }

    ViewTreeObserver$OnPreDrawListenerC29279h(C29314x xVar, ImageView imageView, AbstractC29276e eVar) {
        this.f69457a = xVar;
        this.f69458b = new WeakReference<>(imageView);
        this.f69459c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
