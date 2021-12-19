package com.lynx.tasm.behavior.shadow;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.shadow.k */
public class C28546k implements AbstractC28538c {

    /* renamed from: a */
    public View f67154a;

    /* renamed from: b */
    public Runnable f67155b;

    static {
        Covode.recordClassIndex(34547);
    }

    public C28546k(View view) {
        this.f67154a = view;
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28538c
    /* renamed from: a */
    public final void mo49111a(Runnable runnable) {
        View view = this.f67154a;
        if (view != null) {
            view.requestLayout();
        }
        this.f67155b = runnable;
    }
}
