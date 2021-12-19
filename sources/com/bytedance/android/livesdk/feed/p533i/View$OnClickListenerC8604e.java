package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.i.e */
public final /* synthetic */ class View$OnClickListenerC8604e implements View.OnClickListener {

    /* renamed from: a */
    private final PopupWindow f21268a;

    static {
        Covode.recordClassIndex(9461);
    }

    View$OnClickListenerC8604e(PopupWindow popupWindow) {
        this.f21268a = popupWindow;
    }

    public final void onClick(View view) {
        this.f21268a.dismiss();
    }
}
