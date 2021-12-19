package com.bytedance.android.livesdk.service.assets;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C8786c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.C87020c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.service.assets.a */
public final class C10681a {
    static {
        Covode.recordClassIndex(12278);
    }

    /* renamed from: a */
    private static boolean m19252a(AssetsModel assetsModel) {
        C8786c resourceModel;
        List<String> list;
        if (assetsModel == null || TextUtils.isEmpty(assetsModel.getMD5()) || (resourceModel = assetsModel.getResourceModel()) == null || (list = resourceModel.f21657b) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C87020c m19251a(AssetsModel assetsModel, int i) {
        if (!m19252a(assetsModel)) {
            return null;
        }
        C8786c resourceModel = assetsModel.getResourceModel();
        String[] strArr = new String[resourceModel.f21657b.size()];
        resourceModel.f21657b.toArray(strArr);
        return new C87020c(resourceModel.f21656a, assetsModel.getId(), strArr, assetsModel.getMD5(), (long) i);
    }
}
