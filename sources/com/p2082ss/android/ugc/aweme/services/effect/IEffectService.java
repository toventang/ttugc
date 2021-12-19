package com.p2082ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService */
public interface IEffectService {

    /* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback */
    public interface OnVideoCoverCallback {
        static {
            Covode.recordClassIndex(79781);
        }

        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(79780);
    }

    AbstractC46415f createEffectPlatform(Context context, String str);

    AbstractC46415f createFontEffectPlatform(Context context);

    AbstractC46415f createMvEffectPlatform(Context context);

    AbstractC46415f createMvEffectPlatform(Context context, String str);

    void fetchEffectWithMusicBind(AbstractC46415f fVar, String str, String str2, IFetchEffectListener iFetchEffectListener);

    void fetchEffectWithMusicBind(AbstractC46415f fVar, String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    String getModelCacheDir();

    void getVideoCoverByCallback(List<EffectPointModel> list, FilterBean filterBean, float f, int i, boolean z, C43223c cVar, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);
}
