package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.services.IRessoAnchorService */
public interface IRessoAnchorService {
    static {
        Covode.recordClassIndex(79637);
    }

    C89378p<Long, Integer> getCopyrightLimitMsUninstalledResso(String str);

    boolean showAnchorUninstalledResso(String str, Context context);
}
