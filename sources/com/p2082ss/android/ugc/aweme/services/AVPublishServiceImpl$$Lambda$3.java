package com.p2082ss.android.ugc.aweme.services;

import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1203l;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$$Lambda$3 */
final /* synthetic */ class AVPublishServiceImpl$$Lambda$3 implements PopupWindow.OnDismissListener {
    private final ActivityC0945e arg$1;
    private final AbstractC1203l arg$2;

    static {
        Covode.recordClassIndex(79555);
    }

    AVPublishServiceImpl$$Lambda$3(ActivityC0945e eVar, AbstractC1203l lVar) {
        this.arg$1 = eVar;
        this.arg$2 = lVar;
    }

    public final void onDismiss() {
        this.arg$1.getLifecycle().mo4013b(this.arg$2);
    }
}
