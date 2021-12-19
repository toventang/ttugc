package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
public final class C26580d {

    /* renamed from: a */
    public int f62751a;

    /* renamed from: b */
    public int f62752b;

    /* renamed from: c */
    public int f62753c;

    /* renamed from: d */
    public int f62754d;

    /* renamed from: e */
    private final View f62755e;

    static {
        Covode.recordClassIndex(32017);
    }

    /* renamed from: a */
    public final void mo43821a() {
        this.f62751a = this.f62755e.getTop();
        this.f62752b = this.f62755e.getLeft();
        mo43823b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43823b() {
        View view = this.f62755e;
        C0792v.m2767d(view, this.f62753c - (view.getTop() - this.f62751a));
        View view2 = this.f62755e;
        C0792v.m2769e(view2, this.f62754d - (view2.getLeft() - this.f62752b));
    }

    public C26580d(View view) {
        this.f62755e = view;
    }

    /* renamed from: a */
    public final boolean mo43822a(int i) {
        if (this.f62753c == i) {
            return false;
        }
        this.f62753c = i;
        mo43823b();
        return true;
    }
}
