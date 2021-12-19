package com.p2082ss.android.ugc.aweme.base.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.utils.c */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC34716c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final KeyboardUtils.AndroidBug5497Workaround f82006a;

    static {
        Covode.recordClassIndex(41708);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC34716c(KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround) {
        this.f82006a = androidBug5497Workaround;
    }

    public final void onGlobalLayout() {
        KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround = this.f82006a;
        if (androidBug5497Workaround.f81998a != null && androidBug5497Workaround.f81999b != null) {
            Rect rect = new Rect();
            androidBug5497Workaround.f81998a.getWindowVisibleDisplayFrame(rect);
            double d = (double) rect.bottom;
            double height = (double) androidBug5497Workaround.f81998a.getHeight();
            Double.isNaN(height);
            if (d < height * 0.75d) {
                androidBug5497Workaround.f81999b.mo61027b();
            } else {
                androidBug5497Workaround.f81999b.mo61028c();
            }
        }
    }
}
