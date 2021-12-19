package com.p2082ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.external.IInfoService */
public interface IInfoService {
    static {
        Covode.recordClassIndex(79800);
    }

    VideoExposureData convertToExposureData(Object obj);

    void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult);

    Map<Object, Object> getDataMapForEditActivity(Context context);

    long getDurationSinceAppForeground(String str);

    List<MediaModel> getMediaLoaderImages(Context context);

    C39078ad shareContextInfo(BaseShortVideoContext baseShortVideoContext);

    void startDownloadEffectAlog(Effect effect, long j);

    IStickerUtilsService stickerInfo();
}
