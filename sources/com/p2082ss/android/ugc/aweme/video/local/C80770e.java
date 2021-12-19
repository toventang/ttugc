package com.p2082ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* renamed from: com.ss.android.ugc.aweme.video.local.e */
public final class C80770e extends VideoUrlModel {
    @AbstractC27891c(mo46611a = "local_path")

    /* renamed from: a */
    String f180595a;
    @AbstractC27891c(mo46611a = "author_id")

    /* renamed from: b */
    String f180596b;

    static {
        Covode.recordClassIndex(94061);
    }

    public C80770e() {
    }

    public final String getLocalPath() {
        return this.f180595a;
    }

    public C80770e(String str) {
        setSourceId(str);
    }
}
