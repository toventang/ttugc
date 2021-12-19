package com.p2082ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.filter.IFilterService;
import com.p2082ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p2082ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p2082ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;

/* renamed from: com.ss.android.ugc.aweme.services.IFoundationAVService */
public interface IFoundationAVService {

    /* renamed from: com.ss.android.ugc.aweme.services.IFoundationAVService$IFetchResourcesListener */
    public interface IFetchResourcesListener {
        static {
            Covode.recordClassIndex(79628);
        }

        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    static {
        Covode.recordClassIndex(79627);
    }

    IAVSettingsService avSettingsService();

    VideoExposureData convertToExposureData(Object obj);

    IDraftService draftService();

    IEffectService effectService();

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    IFilterService getFilterService();

    ISDKService getSDKService();

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    void loadLibrary(String str, Application application);

    void setLastStickerId(Context context, String str, int i);

    String shortVideoDir();

    void tryCopyDuetDefaultLayout();

    IVideoCoverService videoCoverService();
}
