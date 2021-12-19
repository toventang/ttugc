package com.bytedance.android.live.design.view;

import android.view.View;
import android.view.ViewParent;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.d */
public final class C4086d extends PopupWindow {

    /* renamed from: a */
    public int f11292a = 3;

    static {
        Covode.recordClassIndex(4631);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable unused) {
        }
        View contentView = getContentView();
        if (contentView != null) {
            ViewParent parent = contentView.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
            }
        }
    }

    public C4086d(C4093g gVar) {
        super(gVar);
    }
}
