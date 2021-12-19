package com.bytedance.ies.bullet.service.webkit;

import android.webkit.JavascriptInterface;
import com.bytedance.covode.number.Covode;

public final class GlobalProps {

    /* renamed from: a */
    public String f40440a;

    static {
        Covode.recordClassIndex(19426);
    }

    @JavascriptInterface
    public final String getGlobalProps() {
        String str = this.f40440a;
        if (str == null) {
            return "";
        }
        return str;
    }
}
