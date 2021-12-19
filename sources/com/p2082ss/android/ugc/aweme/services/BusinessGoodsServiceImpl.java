package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.bullet.module.p2422default.C35239a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74047y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BusinessGoodsServiceImpl */
public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    static {
        Covode.recordClassIndex(79603);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void clearCache() {
        C74047y.f166199a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessGoodsService
    public final List<AbstractC16183k> createBridges(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C35239a.m72172a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void removeUserSetting(String str) {
        C89219l.m154721d(str, "");
        C74047y.m130205a(str);
    }

    public static IBusinessGoodsService createIBusinessGoodsServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(6779);
        Object a = C81908b.m141854a(IBusinessGoodsService.class, z);
        if (a != null) {
            IBusinessGoodsService iBusinessGoodsService = (IBusinessGoodsService) a;
            MethodCollector.m26664o(6779);
            return iBusinessGoodsService;
        }
        if (C81908b.f183344do == null) {
            synchronized (IBusinessGoodsService.class) {
                try {
                    if (C81908b.f183344do == null) {
                        C81908b.f183344do = new BusinessGoodsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6779);
                    throw th;
                }
            }
        }
        BusinessGoodsServiceImpl businessGoodsServiceImpl = (BusinessGoodsServiceImpl) C81908b.f183344do;
        MethodCollector.m26664o(6779);
        return businessGoodsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessGoodsService
    public final BusinessGoodsPublishModel getCurBusinessDraftModel(String str) {
        BusinessGoodsPublishModel businessGoodsPublishModel;
        C89219l.m154721d(str, "");
        if (C74047y.m130206b() != null) {
            Iterator<BusinessGoodsPublishModel> it = C74047y.f166199a.getGoodsPublishModels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                businessGoodsPublishModel = it.next();
                if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                    break;
                }
            }
            C89219l.m154716b(businessGoodsPublishModel, "");
            return businessGoodsPublishModel;
        }
        businessGoodsPublishModel = null;
        C89219l.m154716b(businessGoodsPublishModel, "");
        return businessGoodsPublishModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IBusinessGoodsService
    public final void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        C89219l.m154721d(businessGoodsPublishModel, "");
        BusinessGoodsPublishSetting b = C74047y.m130206b();
        if (b == null) {
            b = new BusinessGoodsPublishSetting();
            b.setUserId(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        }
        List<BusinessGoodsPublishModel> goodsPublishModels = b.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList<>();
        } else {
            goodsPublishModels.remove(businessGoodsPublishModel);
        }
        if (businessGoodsPublishModel != null) {
            goodsPublishModels.add(businessGoodsPublishModel);
        }
        b.setGoodsPublishModels(goodsPublishModels);
        List<BusinessGoodsPublishSetting> a = C74047y.m130204a();
        a.remove(b);
        a.add(b);
        C33842s.C33843a.f80132a.mo60061e().mo59940b(new C27910f().mo46674b(a));
        C74047y.f166199a = b;
    }
}
