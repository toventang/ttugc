package com.bytedance.android.live.copyrightreview.helper;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.b */
final /* synthetic */ class C3816b implements Handler.Callback {

    /* renamed from: a */
    private final CopyrightViolationHelper f10553a;

    static {
        Covode.recordClassIndex(4345);
    }

    C3816b(CopyrightViolationHelper copyrightViolationHelper) {
        this.f10553a = copyrightViolationHelper;
    }

    public final boolean handleMessage(Message message) {
        CopyrightViolationHelper copyrightViolationHelper = this.f10553a;
        if (message.what == 1) {
            if (copyrightViolationHelper.f10545a == null || copyrightViolationHelper.f10545a.isShowing()) {
                return false;
            }
            copyrightViolationHelper.f10545a.show();
            return true;
        } else if (message.what != 2 || copyrightViolationHelper.f10546b == null || copyrightViolationHelper.f10546b.isShowing()) {
            return false;
        } else {
            copyrightViolationHelper.f10550f.run();
            return true;
        }
    }
}
