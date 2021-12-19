package com.p2082ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.utils.i */
public final /* synthetic */ class C68694i implements AbstractC2813k {

    /* renamed from: a */
    private final Context f153698a;

    static {
        Covode.recordClassIndex(80955);
    }

    C68694i(Context context) {
        this.f153698a = context;
    }

    @Override // com.bytedance.android.ecommerce.p164j.AbstractC2813k
    /* renamed from: a */
    public final void mo7407a(String str) {
        Context context = this.f153698a;
        if (!str.startsWith("aweme://webview/")) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        } else {
            SmartRouter.buildRoute(context, str).open();
        }
    }
}
