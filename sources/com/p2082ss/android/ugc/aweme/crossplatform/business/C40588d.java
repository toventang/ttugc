package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.web.C81523a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.d */
public final /* synthetic */ class C40588d implements ValueCallback {

    /* renamed from: a */
    static final ValueCallback f94996a = new C40588d();

    static {
        Covode.recordClassIndex(48427);
    }

    private C40588d() {
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace("\"", "");
            if (!TextUtils.isEmpty(replace)) {
                C81523a.f182293f = replace;
            }
        }
    }
}
