package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareWebContent;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.d */
public final class C55953d {
    static {
        Covode.recordClassIndex(65746);
    }

    /* renamed from: a */
    public static BaseContent m101810a(SharePackage sharePackage) {
        if (TextUtils.equals("web", sharePackage.f155487d)) {
            return ShareWebContent.fromSharePackage(sharePackage);
        }
        return null;
    }
}
