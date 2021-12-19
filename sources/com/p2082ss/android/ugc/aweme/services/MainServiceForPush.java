package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80575ii;
import com.p2082ss.android.ugc.awemepushapi.AbstractC81805a;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForPush */
public class MainServiceForPush implements AbstractC81805a {
    static {
        Covode.recordClassIndex(79685);
    }

    public String filterUrl(Context context, String str) {
        return str;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.AbstractC81805a
    public String getDefaultUninstallQuestionUrl() {
        return C80575ii.m139669a().toString();
    }
}
