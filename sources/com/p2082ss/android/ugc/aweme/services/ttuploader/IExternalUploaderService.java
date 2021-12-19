package com.p2082ss.android.ugc.aweme.services.ttuploader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;

/* renamed from: com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService */
public interface IExternalUploaderService {
    static {
        Covode.recordClassIndex(80002);
    }

    void cacheUploadAuthKeyConfig();

    String getSdkV4AuthKey();

    ExternalUploadVideoConfig getUploadVideoConfig(String str);
}
