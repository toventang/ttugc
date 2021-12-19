package com.bytedance.lynx.hybrid.webkit;

import android.webkit.JavascriptInterface;
import com.bytedance.covode.number.Covode;

public final class GlobalProps {

    /* renamed from: a */
    public String f50717a;

    static {
        Covode.recordClassIndex(24987);
    }

    @JavascriptInterface
    public final String getGlobalProps() {
        String str = this.f50717a;
        if (str == null) {
            return "";
        }
        return str;
    }
}
