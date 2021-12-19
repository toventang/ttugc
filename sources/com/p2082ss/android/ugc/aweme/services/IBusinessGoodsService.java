package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.IBusinessGoodsService */
public interface IBusinessGoodsService {
    static {
        Covode.recordClassIndex(79622);
    }

    void clearCache();

    List<AbstractC16183k> createBridges(C16248b bVar);

    BusinessGoodsPublishModel getCurBusinessDraftModel(String str);

    void removeUserSetting(String str);

    void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel);
}
