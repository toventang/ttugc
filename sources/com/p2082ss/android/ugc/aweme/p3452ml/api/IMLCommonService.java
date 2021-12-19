package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b;

/* renamed from: com.ss.android.ugc.aweme.ml.api.IMLCommonService */
public interface IMLCommonService {
    static {
        Covode.recordClassIndex(70432);
    }

    void addCommonEventListener(String str, AbstractC60013b bVar);

    AbstractC59976b getAwemeAdapter();

    void onPlayFinishFirst(Aweme aweme, String str);

    void onPlayFirstFrame(Aweme aweme, String str);

    void onPlayPause(Aweme aweme, String str, boolean z);

    void onPlayPrepare(Aweme aweme, String str, AbstractC59976b bVar);

    void onPlayResume(Aweme aweme, String str);

    void onPlayStop(String str, Aweme aweme, String str2);

    void onPlayStopCallPlayTime(Aweme aweme, long j, String str);

    void runInMainActivityOnCreate();

    void runInMainActivityOnDestroy();
}
