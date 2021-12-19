package com.p2082ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.effectplatform.C46403b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59183a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.external.IInfoService;
import com.p2082ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p2082ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.p2082ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71164e;
import com.p2082ss.android.ugc.aweme.utils.C80412ex;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.j */
public final class C47168j implements IInfoService {

    /* renamed from: a */
    private final AbstractC89244h f109790a = C89250i.m154773a((AbstractC89171a) C47169a.f109791a);

    static {
        Covode.recordClassIndex(55772);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.j$a */
    static final class C47169a extends AbstractC89220m implements AbstractC89171a<StickerUtilsServiceImpl> {

        /* renamed from: a */
        public static final C47169a f109791a = new C47169a();

        static {
            Covode.recordClassIndex(55773);
        }

        C47169a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ StickerUtilsServiceImpl invoke() {
            return new StickerUtilsServiceImpl();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final IStickerUtilsService stickerInfo() {
        return (StickerUtilsServiceImpl) this.f109790a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final VideoExposureData convertToExposureData(Object obj) {
        C89219l.m154721d(obj, "");
        VideoExposureData asExposureData = VideoPublishEditModel.asExposureData(obj);
        C89219l.m154716b(asExposureData, "");
        return asExposureData;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final List<MediaModel> getMediaLoaderImages(Context context) {
        C89219l.m154721d(context, "");
        return C59183a.m108683a(context, false, -1, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final Map<Object, Object> getDataMapForEditActivity(Context context) {
        C89219l.m154721d(context, "");
        if (context instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context).mo111772m();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final long getDurationSinceAppForeground(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        long currentTimeMillis = System.currentTimeMillis() - C80412ex.f179973b;
        C80412ex.f179974c = currentTimeMillis;
        C80412ex.f179972a = str;
        return currentTimeMillis;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final C39078ad shareContextInfo(BaseShortVideoContext baseShortVideoContext) {
        C89219l.m154721d(baseShortVideoContext, "");
        C39078ad adVar = null;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            String mainBusinessData = VideoPublishEditModel.asExposureData(baseShortVideoContext).getMainBusinessData();
            if (!C13627m.m24498a(mainBusinessData)) {
                if (mainBusinessData == null) {
                    C89219l.m154715b();
                }
                C71164e eVar = (C71164e) C63238c.f143596w.getRetrofitFactoryGson().mo46670a(mainBusinessData, C71164e.class);
                if (!(eVar == null || (adVar = eVar.getShareContext()) == null)) {
                    adVar.mIsFromDraft = baseShortVideoContext.mIsFromDraft;
                }
            }
        }
        return adVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final void startDownloadEffectAlog(Effect effect, long j) {
        C46403b.m89552a(effect, j);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IInfoService
    public final void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
        C46403b.m89553a(effect, j, j2, i, exceptionResult);
    }
}
