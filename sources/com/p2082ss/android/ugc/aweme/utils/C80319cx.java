package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.utils.cx */
public final class C80319cx {
    static {
        Covode.recordClassIndex(93587);
    }

    /* renamed from: a */
    public static boolean m139241a(Aweme aweme) {
        if (aweme == null || !aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getDesc())) {
            return false;
        }
        if (C13603b.m24435a((Collection) aweme.getTextExtra())) {
            return true;
        }
        for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
            if (textExtraStruct.getType() == 4) {
                return false;
            }
        }
        return true;
    }
}
