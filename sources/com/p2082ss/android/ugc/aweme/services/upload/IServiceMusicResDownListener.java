package com.p2082ss.android.ugc.aweme.services.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener */
public interface IServiceMusicResDownListener {
    static {
        Covode.recordClassIndex(80006);
    }

    void onFailed();

    void onSuccess(MusicModel musicModel, String str);
}
