package com.twitter.sdk.android.core.identity;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.bytedance.covode.number.Covode;

/* renamed from: com.twitter.sdk.android.core.identity.e */
final class C87701e extends WebChromeClient {
    static {
        Covode.recordClassIndex(103690);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }

    C87701e() {
    }
}
