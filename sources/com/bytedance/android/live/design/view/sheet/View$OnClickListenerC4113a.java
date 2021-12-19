package com.bytedance.android.live.design.view.sheet;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.view.sheet.a */
public final /* synthetic */ class View$OnClickListenerC4113a implements View.OnClickListener {

    /* renamed from: a */
    private final LiveBaseSheetDialog f11460a;

    static {
        Covode.recordClassIndex(4665);
    }

    View$OnClickListenerC4113a(LiveBaseSheetDialog liveBaseSheetDialog) {
        this.f11460a = liveBaseSheetDialog;
    }

    public final void onClick(View view) {
        this.f11460a.cancel();
    }
}
