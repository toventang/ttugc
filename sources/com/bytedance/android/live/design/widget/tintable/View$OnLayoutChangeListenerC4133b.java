package com.bytedance.android.live.design.widget.tintable;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.widget.tintable.b */
final /* synthetic */ class View$OnLayoutChangeListenerC4133b implements View.OnLayoutChangeListener {

    /* renamed from: a */
    private final C4131a f11569a;

    static {
        Covode.recordClassIndex(4700);
    }

    View$OnLayoutChangeListenerC4133b(C4131a aVar) {
        this.f11569a = aVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C4131a aVar = this.f11569a;
        if (aVar.f11561a != null) {
            aVar.f11561a.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }
}
