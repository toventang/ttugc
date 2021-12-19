package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AVPublishContentType */
public enum AVPublishContentType {
    Video("video"),
    PhotoMovie("video"),
    Photo(UGCMonitor.TYPE_PHOTO);
    
    private final String contentType;

    public final String getContentType() {
        return this.contentType;
    }

    static {
        Covode.recordClassIndex(79920);
    }

    private AVPublishContentType(String str) {
        this.contentType = str;
    }
}
