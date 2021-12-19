package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.graphics.Rect;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.b */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC40534b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final C40533a f94852a;

    static {
        Covode.recordClassIndex(48355);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC40534b(C40533a aVar) {
        this.f94852a = aVar;
    }

    public final void onGlobalLayout() {
        C40533a aVar = this.f94852a;
        if (aVar.f94850e) {
            aVar.f94849d = aVar.f94846a.getHeight();
            aVar.f94850e = false;
        }
        Rect rect = new Rect();
        aVar.f94846a.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != aVar.f94847b) {
            int height = aVar.f94846a.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                int i3 = Build.VERSION.SDK_INT;
                aVar.f94848c.height = (height - i2) + aVar.f94851f;
            } else {
                aVar.f94848c.height = aVar.f94849d;
            }
            aVar.f94846a.requestLayout();
            aVar.f94847b = i;
        }
    }
}
