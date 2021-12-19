package com.p2082ss.android.ugc.aweme.lancet.p3385b;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.c */
public final /* synthetic */ class C58011c implements ValueCallback {

    /* renamed from: a */
    private final ValueCallback f132214a;

    static {
        Covode.recordClassIndex(68046);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        ValueCallback valueCallback = this.f132214a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(obj);
        }
        String cookie = CookieManager.getInstance().getCookie(C49540a.m92781a());
        if (cookie != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
            C49540a.m92783a(C49540a.m92781a(), cookie);
        }
    }
}
