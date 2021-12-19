package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.base.v */
public final class C34735v {
    static {
        Covode.recordClassIndex(41727);
    }

    /* renamed from: a */
    public static C34602l m70965a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C34602l("", Collections.emptyList());
        }
        return new C34602l(urlModel.getUri(), urlModel.getUrlList());
    }
}
