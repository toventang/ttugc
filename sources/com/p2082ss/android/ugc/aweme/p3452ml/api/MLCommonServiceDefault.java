package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.api.MLCommonServiceDefault */
public final class MLCommonServiceDefault extends MLCommonService {
    static {
        Covode.recordClassIndex(70445);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void addCommonEventListener(String str, AbstractC60013b bVar) {
        C89219l.m154721d(str, "");
    }

    public final void checkAndInit() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final AbstractC59976b getAwemeAdapter() {
        return null;
    }

    public final void onAppLaunch() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, AbstractC59976b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j, String str) {
    }

    public final void removeCommonEventListener(String str, AbstractC60013b bVar) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService
    public final void runInMainActivityOnDestroy() {
    }
}
