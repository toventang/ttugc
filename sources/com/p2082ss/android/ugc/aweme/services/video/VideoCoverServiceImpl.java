package com.p2082ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.effect.EffectListModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IInternalAVService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.p3875u.C73298a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl */
public final class VideoCoverServiceImpl implements IVideoCoverService {
    static {
        Covode.recordClassIndex(80030);
    }

    public final Bitmap mergeCoverTextImage(Bitmap bitmap, CoverPublishModel coverPublishModel) {
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.video.IVideoCoverService
    public final void getVideoCoverByCallback(C43223c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        C89219l.m154721d(cVar, "");
        ArrayList arrayList = new ArrayList();
        if (cVar.f100882E != null) {
            EffectListModel effectListModel = cVar.f100882E;
            C89219l.m154716b(effectListModel, "");
            arrayList.addAll(effectListModel.getEffectPointModels());
        }
        int i = cVar.f100915o;
        if (i != 0) {
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setKey(String.valueOf(i));
            effectPointModel.setEndPoint(cVar.f100890M);
            arrayList.add(effectPointModel);
            if (TextUtils.equals(effectPointModel.getKey(), "1")) {
                z = true;
                C73991bj.m130133d("DraftBoxViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + cVar.f100900W.f100873v);
                VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 = new VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(this, cVar, onVideoCoverCallback);
                IInternalAVService a = AVServiceImpl.m113116a();
                C89219l.m154716b(a, "");
                FilterBean filter = a.getFilterService().getFilter(cVar.f100913m);
                C89219l.m154716b(filter, "");
                C73298a.m129356a(arrayList, filter.getFilterFilePath(), cVar.mo73729s(), (int) (cVar.f100896S * 1000.0f), z, C43225d.m86338h(cVar), videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1);
            }
        }
        z = false;
        C73991bj.m130133d("DraftBoxViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + cVar.f100900W.f100873v);
        VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$12 = new VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(this, cVar, onVideoCoverCallback);
        IInternalAVService a2 = AVServiceImpl.m113116a();
        C89219l.m154716b(a2, "");
        FilterBean filter2 = a2.getFilterService().getFilter(cVar.f100913m);
        C89219l.m154716b(filter2, "");
        C73298a.m129356a(arrayList, filter2.getFilterFilePath(), cVar.mo73729s(), (int) (cVar.f100896S * 1000.0f), z, C43225d.m86338h(cVar), videoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$12);
    }
}
