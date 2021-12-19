package com.google.android.material.internal;

import android.widget.ImageButton;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.internal.m */
public class C26687m extends ImageButton {

    /* renamed from: a */
    private int f63225a;

    static {
        Covode.recordClassIndex(32143);
    }

    public final int getUserSetVisibility() {
        return this.f63225a;
    }

    public void setVisibility(int i) {
        mo44190a(i, true);
    }

    /* renamed from: a */
    public final void mo44190a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f63225a = i;
        }
    }
}
