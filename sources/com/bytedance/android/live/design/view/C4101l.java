package com.bytedance.android.live.design.view;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.design.view.C4087e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.l */
public final /* synthetic */ class C4101l implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private final C4094h f11368a;

    /* renamed from: b */
    private final Runnable f11369b;

    /* renamed from: c */
    private final View.OnAttachStateChangeListener f11370c;

    /* renamed from: d */
    private final C4087e.C4090b f11371d;

    /* renamed from: e */
    private final C4086d f11372e;

    static {
        Covode.recordClassIndex(4646);
    }

    C4101l(C4094h hVar, Runnable runnable, View.OnAttachStateChangeListener onAttachStateChangeListener, C4087e.C4090b bVar, C4086d dVar) {
        this.f11368a = hVar;
        this.f11369b = runnable;
        this.f11370c = onAttachStateChangeListener;
        this.f11371d = bVar;
        this.f11372e = dVar;
    }

    public final void onDismiss() {
        C4097j.m9931a(this.f11368a, this.f11369b, this.f11370c, this.f11371d, this.f11372e);
    }
}
