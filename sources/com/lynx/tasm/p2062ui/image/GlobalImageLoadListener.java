package com.lynx.tasm.p2062ui.image;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.ui.image.GlobalImageLoadListener */
public interface GlobalImageLoadListener {
    static {
        Covode.recordClassIndex(34984);
    }

    void onLoadAttempt(Uri uri);
}
