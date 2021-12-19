package com.bytedance.android.live.p385p;

import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.p.c */
final /* synthetic */ class C5838c implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    private final DataChannel f14701a;

    static {
        Covode.recordClassIndex(6445);
    }

    C5838c(DataChannel dataChannel) {
        this.f14701a = dataChannel;
    }

    public final void onDismiss() {
        EnumC5852o.POPUP.release(this.f14701a);
    }
}
