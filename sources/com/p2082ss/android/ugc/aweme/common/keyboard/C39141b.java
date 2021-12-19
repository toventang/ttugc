package com.p2082ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.b */
public final class C39141b extends C39140a {
    static {
        Covode.recordClassIndex(46760);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.keyboard.C39140a
    /* renamed from: a */
    public final void mo67902a(Context context, int i) {
        int i2;
        int b;
        int size = View.MeasureSpec.getSize(i);
        if (!mo67906b(context, size)) {
            WindowManager windowManager = (WindowManager) C34723i.m70925a(C17867d.m33078a(), "window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    i2 = 0;
                } else {
                    defaultDisplay.getSize(point);
                    i2 = point.y;
                }
            } else {
                i2 = C17867d.m33078a().getResources().getDisplayMetrics().heightPixels;
            }
            if (C34723i.m70932e(context) != 0) {
                b = C34723i.m70932e(context);
            } else {
                b = (int) C13628n.m24520b(context, 48.0f);
            }
            int b2 = C34723i.m70927b();
            C51423a.m95791b(3, "KeyBoardObservable", "sH: " + i2 + ", mH: " + size + ", nH: " + b + ", bH: " + b2 + ", kv: " + this.f92354b);
            if (Math.abs(i2 - size) > b + b2) {
                this.f92353a = size;
                if (!this.f92354b) {
                    this.f92354b = true;
                    mo67904a(this.f92354b, Math.abs(i2 - this.f92353a));
                }
            } else if (this.f92354b) {
                this.f92354b = false;
                mo67904a(this.f92354b, Math.abs(i2 - this.f92353a));
            }
        }
    }
}
