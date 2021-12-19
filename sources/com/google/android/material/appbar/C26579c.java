package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.appbar.c */
public class C26579c<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    private C26580d f62748a;

    /* renamed from: b */
    private int f62749b;

    /* renamed from: c */
    private int f62750c;

    static {
        Covode.recordClassIndex(32016);
    }

    public C26579c() {
    }

    /* renamed from: c */
    public int mo43755c() {
        C26580d dVar = this.f62748a;
        if (dVar != null) {
            return dVar.f62753c;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo43754b(int i) {
        C26580d dVar = this.f62748a;
        if (dVar != null) {
            return dVar.mo43822a(i);
        }
        this.f62749b = i;
        return false;
    }

    public C26579c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo43819a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2469a(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo43819a_(coordinatorLayout, v, i);
        if (this.f62748a == null) {
            this.f62748a = new C26580d(v);
        }
        this.f62748a.mo43821a();
        int i2 = this.f62749b;
        if (i2 != 0) {
            this.f62748a.mo43822a(i2);
            this.f62749b = 0;
        }
        int i3 = this.f62750c;
        if (i3 == 0) {
            return true;
        }
        C26580d dVar = this.f62748a;
        if (dVar.f62754d != i3) {
            dVar.f62754d = i3;
            dVar.mo43823b();
        }
        this.f62750c = 0;
        return true;
    }
}
