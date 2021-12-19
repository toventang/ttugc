package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher */
interface PreloadFetcher {
    static {
        Covode.recordClassIndex(63452);
    }

    List<UrlModel> fetchPreload();
}
