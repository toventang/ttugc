package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.y */
public final class C74047y {

    /* renamed from: a */
    public static BusinessGoodsPublishSetting f166199a;

    static {
        Covode.recordClassIndex(86799);
    }

    /* renamed from: a */
    public static List<BusinessGoodsPublishSetting> m130204a() {
        String c = C33842s.C33843a.f80132a.mo60061e().mo59941c();
        if (!TextUtils.isEmpty(c)) {
            return (List) new C27910f().mo46671a(c, new C27895a<List<BusinessGoodsPublishSetting>>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74047y.C740481 */

                static {
                    Covode.recordClassIndex(86800);
                }
            }.type);
        }
        return new ArrayList();
    }

    /* renamed from: b */
    public static synchronized BusinessGoodsPublishSetting m130206b() {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        synchronized (C74047y.class) {
            MethodCollector.m26663i(8006);
            if (f166199a == null) {
                Iterator<BusinessGoodsPublishSetting> it = m130204a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BusinessGoodsPublishSetting next = it.next();
                    try {
                        if (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID().equals(next.getUserId())) {
                            f166199a = next;
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            businessGoodsPublishSetting = f166199a;
            MethodCollector.m26664o(8006);
        }
        return businessGoodsPublishSetting;
    }

    /* renamed from: a */
    public static void m130205a(String str) {
        BusinessGoodsPublishSetting b;
        List<BusinessGoodsPublishModel> goodsPublishModels;
        if (!TextUtils.isEmpty(str) && (b = m130206b()) != null && (goodsPublishModels = b.getGoodsPublishModels()) != null && goodsPublishModels.size() != 0) {
            Iterator<BusinessGoodsPublishModel> it = goodsPublishModels.iterator();
            while (true) {
                if (it.hasNext()) {
                    BusinessGoodsPublishModel next = it.next();
                    if (next != null && TextUtils.equals(str, next.videoPath)) {
                        goodsPublishModels.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            b.setGoodsPublishModels(goodsPublishModels);
            List<BusinessGoodsPublishSetting> a = m130204a();
            a.remove(b);
            a.add(b);
            C33842s.C33843a.f80132a.mo60061e().mo59940b(new C27910f().mo46674b(a));
        }
    }
}
