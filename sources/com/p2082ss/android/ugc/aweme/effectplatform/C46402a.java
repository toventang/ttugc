package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.a */
public final class C46402a {
    static {
        Covode.recordClassIndex(54983);
    }

    /* renamed from: a */
    public static UrlModel m89551a(com.p2082ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        if (urlModel != null) {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(new ArrayList(urlModel.getUrlList()));
        }
        return urlModel2;
    }
}
