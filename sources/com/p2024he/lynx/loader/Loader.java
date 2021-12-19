package com.p2024he.lynx.loader;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.he.lynx.loader.Loader */
public interface Loader {
    static {
        Covode.recordClassIndex(33786);
    }

    void load(String str, Resolver resolver);

    Uri loadMedia(String str);

    byte[] loadSync(String str);

    void loadUrl(String str, Resolver resolver);
}
